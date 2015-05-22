/**
 * This file is part of objc2swift.
 * https://github.com/yahoojapan/objc2swift
 *
 * Copyright (c) 2015 Yahoo Japan Corporation
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

import ObjCParser._
import org.antlr.v4.runtime.RuleContext
import collection.JavaConversions._

/**
 * Implements visit methods for enum contexts.
 */
trait EnumVisitor extends Converter {

  self: ObjCBaseVisitor[String] =>

  def findDeclarationSpecifiers(ctx: RuleContext): Option[Declaration_specifiersContext] =
    ctx match {
      case c: Declaration_specifiersContext => Some(c)
      case c: Translation_unitContext => None
      case _ => findDeclarationSpecifiers(ctx.parent)
    }

  def getClassName(ctx: Declaration_specifiersContext): String =
    Option(ctx.type_specifier()) match {
      case Some(list) if list.size >= 2 =>
        Option(list.last.class_name()).map(visit).getOrElse("")
      case _ => ""
    }

  /**
   * Get name of enumerator.
   * @param ctx parse tree
   * @return
   */
  def getEnumName(ctx: Enum_specifierContext): String =
    Option(ctx.identifier()) match {
      case Some(id) => visit(id)
      case None =>
        findDeclarationSpecifiers(ctx) match {
          case Some(d) => getClassName(d)
          case None => ""
        }
    }

  override def visitEnum_specifier(ctx: Enum_specifierContext): String =
    getEnumName(ctx) match {
      case id if !id.isEmpty => visitEnum_specifier(ctx, id)
      case _ => ""
    }

  def visitEnum_specifier(ctx: Enum_specifierContext, identifier: String): String = {
    val builder = List.newBuilder[String]
    val typeStr = Option(ctx.type_name) match {
      case Some(s) => Option(s.specifier_qualifier_list()) match {
        case Some(s2) => Option(s2.type_specifier()) match {
          case Some(s3) => concatType(s3)
          case _ => "Int"
        }
        case _ => "Int"
      }
      case _ => "Int"
    }

    builder += s"enum $identifier : $typeStr"

    Option(ctx.enumerator_list()) match {
      case Some(list) => builder += s" {\n${visit(list)}\n}"
      case None =>
    }

    builder.result().mkString
  }

  /**
   * Returns translated text of enumerator_list context.
   *
   * @param ctx the parse tree
   **/
  override def visitEnumerator_list(ctx: Enumerator_listContext): String =
    ctx.enumerator().map(visit).mkString("\n")

  /**
   * Returns translated text of enumerator context.
   *
   * @param ctx the parse tree
   **/
  override def visitEnumerator(ctx: EnumeratorContext): String =
    s"${indent(ctx)}case ${getEnumIdentifier(ctx)}${getEnumConstant(ctx)}"

  /**
   * Returns translated text of identifier under the enumerator context
   *
   * @param ctx the parse tree
   * @return translated text
   */
  private def getEnumIdentifier(ctx: EnumeratorContext): String = {
    val origId = visit(ctx.identifier())
    origId
  }

  /**
   * Returns translated text of constant_expression under the enumerator context
   *
   * @param ctx the parse tree
   * @return translated text
   */
  private def getEnumConstant(ctx: EnumeratorContext): String =
    Option(ctx.constant_expression()).map(c => s" = ${visit(c)}").getOrElse("")
}
