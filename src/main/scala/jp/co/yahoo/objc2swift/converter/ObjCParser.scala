// Generated from ObjC.g4 by ANTLR 4.5
package jp.co.yahoo.objc2swift.converter

import org.antlr.v4.runtime.atn._
import org.antlr.v4.runtime.dfa.DFA
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.misc._
import org.antlr.v4.runtime.tree._
import java.util.List
import java.util.Iterator
import java.util.ArrayList
import scala.collection.JavaConverters._

object ObjCParser {
	RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION)

	protected final val _sharedContextCache = new PredictionContextCache()

	class TranslationUnitContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def EOF() = Option(getToken(ObjCParser.EOF, 0))
		def externalDeclaration() = getRuleContexts(classOf[ExternalDeclarationContext]).asScala.toList
		def externalDeclaration(i: Int) = getRuleContext(classOf[ExternalDeclarationContext], i)

		override def getRuleIndex = RULE_translation_unit
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTranslationUnit(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTranslationUnit(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTranslationUnit(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ExternalDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def COMMENT() = Option(getToken(ObjCParser.COMMENT, 0))
		def LINE_COMMENT() = Option(getToken(ObjCParser.LINE_COMMENT, 0))
		def preprocessorDeclaration() = Option(getRuleContext(classOf[PreprocessorDeclarationContext], 0))
		def functionDefinition() = Option(getRuleContext(classOf[FunctionDefinitionContext], 0))
		def declaration() = Option(getRuleContext(classOf[DeclarationContext], 0))
		def classInterface() = Option(getRuleContext(classOf[ClassInterfaceContext], 0))
		def classImplementation() = Option(getRuleContext(classOf[ClassImplementationContext], 0))
		def categoryInterface() = Option(getRuleContext(classOf[CategoryInterfaceContext], 0))
		def categoryImplementation() = Option(getRuleContext(classOf[CategoryImplementationContext], 0))
		def protocolDeclaration() = Option(getRuleContext(classOf[ProtocolDeclarationContext], 0))
		def protocolDeclarationList() = Option(getRuleContext(classOf[ProtocolDeclarationListContext], 0))
		def classDeclarationList() = Option(getRuleContext(classOf[ClassDeclarationListContext], 0))

		override def getRuleIndex = RULE_external_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterExternalDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitExternalDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitExternalDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PreprocessorDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IMPORT() = Option(getToken(ObjCParser.IMPORT, 0))
		def INCLUDE() = Option(getToken(ObjCParser.INCLUDE, 0))

		override def getRuleIndex = RULE_preprocessor_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPreprocessorDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPreprocessorDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPreprocessorDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassInterfaceContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))
		def superclassName() = Option(getRuleContext(classOf[SuperclassNameContext], 0))
		def protocolReferenceList() = Option(getRuleContext(classOf[ProtocolReferenceListContext], 0))
		def instanceVariables() = Option(getRuleContext(classOf[InstanceVariablesContext], 0))
		def interfaceDeclarationList() = Option(getRuleContext(classOf[InterfaceDeclarationListContext], 0))

		override def getRuleIndex = RULE_class_interface
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassInterface(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassInterface(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassInterface(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class CategoryInterfaceContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))
		def categoryName() = Option(getRuleContext(classOf[CategoryNameContext], 0))
		def protocolReferenceList() = Option(getRuleContext(classOf[ProtocolReferenceListContext], 0))
		def instanceVariables() = Option(getRuleContext(classOf[InstanceVariablesContext], 0))
		def interfaceDeclarationList() = Option(getRuleContext(classOf[InterfaceDeclarationListContext], 0))

		override def getRuleIndex = RULE_category_interface
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterCategoryInterface(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitCategoryInterface(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitCategoryInterface(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassImplementationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))
		def superclassName() = Option(getRuleContext(classOf[SuperclassNameContext], 0))
		def instanceVariables() = Option(getRuleContext(classOf[InstanceVariablesContext], 0))
		def implementationDefinitionList() = Option(getRuleContext(classOf[ImplementationDefinitionListContext], 0))

		override def getRuleIndex = RULE_class_implementation
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassImplementation(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassImplementation(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassImplementation(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class CategoryImplementationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))
		def categoryName() = Option(getRuleContext(classOf[CategoryNameContext], 0))
		def implementationDefinitionList() = Option(getRuleContext(classOf[ImplementationDefinitionListContext], 0))

		override def getRuleIndex = RULE_category_implementation
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterCategoryImplementation(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitCategoryImplementation(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitCategoryImplementation(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolName() = Option(getRuleContext(classOf[ProtocolNameContext], 0))
		def protocolReferenceList() = Option(getRuleContext(classOf[ProtocolReferenceListContext], 0))
		def interfaceDeclarationList() = getRuleContexts(classOf[InterfaceDeclarationListContext]).asScala.toList
		def interfaceDeclarationList(i: Int) = getRuleContext(classOf[InterfaceDeclarationListContext], i)

		override def getRuleIndex = RULE_protocol_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolDeclarationListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolList() = Option(getRuleContext(classOf[ProtocolListContext], 0))

		override def getRuleIndex = RULE_protocol_declaration_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolDeclarationList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolDeclarationList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolDeclarationList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassDeclarationListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def classList() = Option(getRuleContext(classOf[ClassListContext], 0))

		override def getRuleIndex = RULE_class_declaration_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassDeclarationList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassDeclarationList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassDeclarationList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def className() = getRuleContexts(classOf[ClassNameContext]).asScala.toList
		def className(i: Int) = getRuleContext(classOf[ClassNameContext], i)

		override def getRuleIndex = RULE_class_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolReferenceListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolList() = Option(getRuleContext(classOf[ProtocolListContext], 0))

		override def getRuleIndex = RULE_protocol_reference_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolReferenceList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolReferenceList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolReferenceList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolName() = getRuleContexts(classOf[ProtocolNameContext]).asScala.toList
		def protocolName(i: Int) = getRuleContext(classOf[ProtocolNameContext], i)

		override def getRuleIndex = RULE_protocol_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertyDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def structDeclaration() = Option(getRuleContext(classOf[StructDeclarationContext], 0))
		def propertyAttributesDeclaration() = Option(getRuleContext(classOf[PropertyAttributesDeclarationContext], 0))
		def ibOutletSpecifier() = Option(getRuleContext(classOf[IbOutletSpecifierContext], 0))

		override def getRuleIndex = RULE_property_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertyDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertyDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertyDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertyAttributesDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def propertyAttributesList() = Option(getRuleContext(classOf[PropertyAttributesListContext], 0))

		override def getRuleIndex = RULE_property_attributes_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertyAttributesDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertyAttributesDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertyAttributesDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertyAttributesListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def propertyAttribute() = getRuleContexts(classOf[PropertyAttributeContext]).asScala.toList
		def propertyAttribute(i: Int) = getRuleContext(classOf[PropertyAttributeContext], i)

		override def getRuleIndex = RULE_property_attributes_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertyAttributesList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertyAttributesList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertyAttributesList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertyAttributeContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_property_attribute
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertyAttribute(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertyAttribute(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertyAttribute(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class IbOutletSpecifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))

		override def getRuleIndex = RULE_ib_outlet_specifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterIbOutletSpecifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitIbOutletSpecifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitIbOutletSpecifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassNameContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_class_name
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassName(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassName(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassName(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SuperclassNameContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_superclass_name
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSuperclassName(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSuperclassName(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSuperclassName(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class CategoryNameContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_category_name
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterCategoryName(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitCategoryName(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitCategoryName(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolNameContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_protocol_name
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolName(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolName(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolName(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InstanceVariablesContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def structDeclaration() = getRuleContexts(classOf[StructDeclarationContext]).asScala.toList
		def structDeclaration(i: Int) = getRuleContext(classOf[StructDeclarationContext], i)
		def visibilitySpecification() = Option(getRuleContext(classOf[VisibilitySpecificationContext], 0))
		def instanceVariables() = Option(getRuleContext(classOf[InstanceVariablesContext], 0))

		override def getRuleIndex = RULE_instance_variables
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInstanceVariables(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInstanceVariables(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInstanceVariables(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class VisibilitySpecificationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {

		override def getRuleIndex = RULE_visibility_specification
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterVisibilitySpecification(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitVisibilitySpecification(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitVisibilitySpecification(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InterfaceDeclarationListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declaration() = getRuleContexts(classOf[DeclarationContext]).asScala.toList
		def declaration(i: Int) = getRuleContext(classOf[DeclarationContext], i)
		def classMethodDeclaration() = getRuleContexts(classOf[ClassMethodDeclarationContext]).asScala.toList
		def classMethodDeclaration(i: Int) = getRuleContext(classOf[ClassMethodDeclarationContext], i)
		def instanceMethodDeclaration() = getRuleContexts(classOf[InstanceMethodDeclarationContext]).asScala.toList
		def instanceMethodDeclaration(i: Int) = getRuleContext(classOf[InstanceMethodDeclarationContext], i)
		def propertyDeclaration() = getRuleContexts(classOf[PropertyDeclarationContext]).asScala.toList
		def propertyDeclaration(i: Int) = getRuleContext(classOf[PropertyDeclarationContext], i)

		override def getRuleIndex = RULE_interface_declaration_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInterfaceDeclarationList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInterfaceDeclarationList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInterfaceDeclarationList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassMethodDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def methodDeclaration() = Option(getRuleContext(classOf[MethodDeclarationContext], 0))

		override def getRuleIndex = RULE_class_method_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassMethodDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassMethodDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassMethodDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InstanceMethodDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def methodDeclaration() = Option(getRuleContext(classOf[MethodDeclarationContext], 0))

		override def getRuleIndex = RULE_instance_method_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInstanceMethodDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInstanceMethodDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInstanceMethodDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MethodDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def methodSelector() = Option(getRuleContext(classOf[MethodSelectorContext], 0))
		def methodType() = Option(getRuleContext(classOf[MethodTypeContext], 0))

		override def getRuleIndex = RULE_method_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMethodDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMethodDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMethodDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ImplementationDefinitionListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def functionDefinition() = getRuleContexts(classOf[FunctionDefinitionContext]).asScala.toList
		def functionDefinition(i: Int) = getRuleContext(classOf[FunctionDefinitionContext], i)
		def declaration() = getRuleContexts(classOf[DeclarationContext]).asScala.toList
		def declaration(i: Int) = getRuleContext(classOf[DeclarationContext], i)
		def classMethodDefinition() = getRuleContexts(classOf[ClassMethodDefinitionContext]).asScala.toList
		def classMethodDefinition(i: Int) = getRuleContext(classOf[ClassMethodDefinitionContext], i)
		def instanceMethodDefinition() = getRuleContexts(classOf[InstanceMethodDefinitionContext]).asScala.toList
		def instanceMethodDefinition(i: Int) = getRuleContext(classOf[InstanceMethodDefinitionContext], i)
		def propertyImplementation() = getRuleContexts(classOf[PropertyImplementationContext]).asScala.toList
		def propertyImplementation(i: Int) = getRuleContext(classOf[PropertyImplementationContext], i)

		override def getRuleIndex = RULE_implementation_definition_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterImplementationDefinitionList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitImplementationDefinitionList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitImplementationDefinitionList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ClassMethodDefinitionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def methodDefinition() = Option(getRuleContext(classOf[MethodDefinitionContext], 0))

		override def getRuleIndex = RULE_class_method_definition
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterClassMethodDefinition(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitClassMethodDefinition(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitClassMethodDefinition(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InstanceMethodDefinitionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def methodDefinition() = Option(getRuleContext(classOf[MethodDefinitionContext], 0))

		override def getRuleIndex = RULE_instance_method_definition
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInstanceMethodDefinition(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInstanceMethodDefinition(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInstanceMethodDefinition(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MethodDefinitionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def methodSelector() = Option(getRuleContext(classOf[MethodSelectorContext], 0))
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))
		def methodType() = Option(getRuleContext(classOf[MethodTypeContext], 0))
		def initDeclaratorList() = Option(getRuleContext(classOf[InitDeclaratorListContext], 0))

		override def getRuleIndex = RULE_method_definition
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMethodDefinition(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMethodDefinition(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMethodDefinition(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MethodSelectorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def selector() = Option(getRuleContext(classOf[SelectorContext], 0))
		def keywordDeclarator() = getRuleContexts(classOf[KeywordDeclaratorContext]).asScala.toList
		def keywordDeclarator(i: Int) = getRuleContext(classOf[KeywordDeclaratorContext], i)
		def parameterList() = Option(getRuleContext(classOf[ParameterListContext], 0))

		override def getRuleIndex = RULE_method_selector
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMethodSelector(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMethodSelector(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMethodSelector(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class KeywordDeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))
		def selector() = Option(getRuleContext(classOf[SelectorContext], 0))
		def methodType() = getRuleContexts(classOf[MethodTypeContext]).asScala.toList
		def methodType(i: Int) = getRuleContext(classOf[MethodTypeContext], i)

		override def getRuleIndex = RULE_keyword_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterKeywordDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitKeywordDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitKeywordDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SelectorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_selector
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSelector(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSelector(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSelector(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MethodTypeContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeName() = Option(getRuleContext(classOf[TypeNameContext], 0))

		override def getRuleIndex = RULE_method_type
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMethodType(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMethodType(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMethodType(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertyImplementationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def propertySynthesizeList() = Option(getRuleContext(classOf[PropertySynthesizeListContext], 0))

		override def getRuleIndex = RULE_property_implementation
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertyImplementation(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertyImplementation(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertyImplementation(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertySynthesizeListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def propertySynthesizeItem() = getRuleContexts(classOf[PropertySynthesizeItemContext]).asScala.toList
		def propertySynthesizeItem(i: Int) = getRuleContext(classOf[PropertySynthesizeItemContext], i)

		override def getRuleIndex = RULE_property_synthesize_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertySynthesizeList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertySynthesizeList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertySynthesizeList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PropertySynthesizeItemContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = getTokens(ObjCParser.IDENTIFIER).asScala.toList
		def IDENTIFIER(i: Int) = getToken(ObjCParser.IDENTIFIER, i)

		override def getRuleIndex = RULE_property_synthesize_item
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPropertySynthesizeItem(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPropertySynthesizeItem(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPropertySynthesizeItem(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class BlockTypeContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeSpecifier() = getRuleContexts(classOf[TypeSpecifierContext]).asScala.toList
		def typeSpecifier(i: Int) = getRuleContext(classOf[TypeSpecifierContext], i)
		def blockParameters() = Option(getRuleContext(classOf[BlockParametersContext], 0))

		override def getRuleIndex = RULE_block_type
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterBlockType(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitBlockType(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitBlockType(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class TypeSpecifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolReferenceList() = Option(getRuleContext(classOf[ProtocolReferenceListContext], 0))
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))
		def structOrUnionSpecifier() = Option(getRuleContext(classOf[StructOrUnionSpecifierContext], 0))
		def enumSpecifier() = Option(getRuleContext(classOf[EnumSpecifierContext], 0))
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))
		def pointer() = Option(getRuleContext(classOf[PointerContext], 0))

		override def getRuleIndex = RULE_type_specifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTypeSpecifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTypeSpecifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTypeSpecifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class TypeQualifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolQualifier() = Option(getRuleContext(classOf[ProtocolQualifierContext], 0))

		override def getRuleIndex = RULE_type_qualifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTypeQualifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTypeQualifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTypeQualifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolQualifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {

		override def getRuleIndex = RULE_protocol_qualifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolQualifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolQualifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolQualifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PrimaryExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))
		def constant() = Option(getRuleContext(classOf[ConstantContext], 0))
		def STRING_LITERAL() = Option(getToken(ObjCParser.STRING_LITERAL, 0))
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def messageExpression() = Option(getRuleContext(classOf[MessageExpressionContext], 0))
		def selectorExpression() = Option(getRuleContext(classOf[SelectorExpressionContext], 0))
		def protocolExpression() = Option(getRuleContext(classOf[ProtocolExpressionContext], 0))
		def encodeExpression() = Option(getRuleContext(classOf[EncodeExpressionContext], 0))
		def dictionaryExpression() = Option(getRuleContext(classOf[DictionaryExpressionContext], 0))
		def arrayExpression() = Option(getRuleContext(classOf[ArrayExpressionContext], 0))
		def boxExpression() = Option(getRuleContext(classOf[BoxExpressionContext], 0))
		def blockExpression() = Option(getRuleContext(classOf[BlockExpressionContext], 0))

		override def getRuleIndex = RULE_primary_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPrimaryExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPrimaryExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPrimaryExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DictionaryPairContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def postfixExpression() = getRuleContexts(classOf[PostfixExpressionContext]).asScala.toList
		def postfixExpression(i: Int) = getRuleContext(classOf[PostfixExpressionContext], i)
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))

		override def getRuleIndex = RULE_dictionary_pair
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDictionaryPair(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDictionaryPair(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDictionaryPair(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DictionaryExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def dictionaryPair() = getRuleContexts(classOf[DictionaryPairContext]).asScala.toList
		def dictionaryPair(i: Int) = getRuleContext(classOf[DictionaryPairContext], i)

		override def getRuleIndex = RULE_dictionary_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDictionaryExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDictionaryExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDictionaryExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ArrayExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def postfixExpression() = getRuleContexts(classOf[PostfixExpressionContext]).asScala.toList
		def postfixExpression(i: Int) = getRuleContext(classOf[PostfixExpressionContext], i)

		override def getRuleIndex = RULE_array_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterArrayExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitArrayExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitArrayExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class BoxExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def postfixExpression() = Option(getRuleContext(classOf[PostfixExpressionContext], 0))
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def constant() = Option(getRuleContext(classOf[ConstantContext], 0))

		override def getRuleIndex = RULE_box_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterBoxExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitBoxExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitBoxExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class BlockParametersContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeVariableDeclarator() = getRuleContexts(classOf[TypeVariableDeclaratorContext]).asScala.toList
		def typeVariableDeclarator(i: Int) = getRuleContext(classOf[TypeVariableDeclaratorContext], i)
		def typeName() = getRuleContexts(classOf[TypeNameContext]).asScala.toList
		def typeName(i: Int) = getRuleContext(classOf[TypeNameContext], i)

		override def getRuleIndex = RULE_block_parameters
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterBlockParameters(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitBlockParameters(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitBlockParameters(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class BlockExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))
		def typeSpecifier() = Option(getRuleContext(classOf[TypeSpecifierContext], 0))
		def blockParameters() = Option(getRuleContext(classOf[BlockParametersContext], 0))

		override def getRuleIndex = RULE_block_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterBlockExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitBlockExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitBlockExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MessageExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def receiver() = Option(getRuleContext(classOf[ReceiverContext], 0))
		def messageSelector() = Option(getRuleContext(classOf[MessageSelectorContext], 0))

		override def getRuleIndex = RULE_message_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMessageExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMessageExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMessageExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ReceiverContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def className() = Option(getRuleContext(classOf[ClassNameContext], 0))

		override def getRuleIndex = RULE_receiver
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterReceiver(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitReceiver(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitReceiver(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MessageSelectorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def selector() = Option(getRuleContext(classOf[SelectorContext], 0))
		def keywordArgument() = getRuleContexts(classOf[KeywordArgumentContext]).asScala.toList
		def keywordArgument(i: Int) = getRuleContext(classOf[KeywordArgumentContext], i)

		override def getRuleIndex = RULE_message_selector
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMessageSelector(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMessageSelector(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMessageSelector(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class KeywordArgumentContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def selector() = Option(getRuleContext(classOf[SelectorContext], 0))

		override def getRuleIndex = RULE_keyword_argument
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterKeywordArgument(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitKeywordArgument(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitKeywordArgument(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SelectorExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def selectorName() = Option(getRuleContext(classOf[SelectorNameContext], 0))

		override def getRuleIndex = RULE_selector_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSelectorExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSelectorExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSelectorExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SelectorNameContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def selector() = getRuleContexts(classOf[SelectorContext]).asScala.toList
		def selector(i: Int) = getRuleContext(classOf[SelectorContext], i)

		override def getRuleIndex = RULE_selector_name
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSelectorName(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSelectorName(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSelectorName(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ProtocolExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def protocolName() = Option(getRuleContext(classOf[ProtocolNameContext], 0))

		override def getRuleIndex = RULE_protocol_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterProtocolExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitProtocolExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitProtocolExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class EncodeExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeName() = Option(getRuleContext(classOf[TypeNameContext], 0))

		override def getRuleIndex = RULE_encode_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterEncodeExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitEncodeExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitEncodeExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class TypeVariableDeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarationSpecifiers() = Option(getRuleContext(classOf[DeclarationSpecifiersContext], 0))
		def declarator() = Option(getRuleContext(classOf[DeclaratorContext], 0))

		override def getRuleIndex = RULE_type_variable_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTypeVariableDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTypeVariableDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTypeVariableDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class TryStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))

		override def getRuleIndex = RULE_try_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTryStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTryStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTryStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class CatchStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeVariableDeclarator() = Option(getRuleContext(classOf[TypeVariableDeclaratorContext], 0))
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))

		override def getRuleIndex = RULE_catch_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterCatchStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitCatchStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitCatchStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class FinallyStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))

		override def getRuleIndex = RULE_finally_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterFinallyStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitFinallyStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitFinallyStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ThrowStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_throw_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterThrowStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitThrowStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitThrowStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class TryBlockContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def tryStatement() = Option(getRuleContext(classOf[TryStatementContext], 0))
		def catchStatement() = getRuleContexts(classOf[CatchStatementContext]).asScala.toList
		def catchStatement(i: Int) = getRuleContext(classOf[CatchStatementContext], i)
		def finallyStatement() = Option(getRuleContext(classOf[FinallyStatementContext], 0))

		override def getRuleIndex = RULE_try_block
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTryBlock(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTryBlock(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTryBlock(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SynchronizedStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def primaryExpression() = Option(getRuleContext(classOf[PrimaryExpressionContext], 0))
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))

		override def getRuleIndex = RULE_synchronized_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSynchronizedStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSynchronizedStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSynchronizedStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AutoreleaseStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))

		override def getRuleIndex = RULE_autorelease_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAutoreleaseStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAutoreleaseStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAutoreleaseStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class FunctionDefinitionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarator() = Option(getRuleContext(classOf[DeclaratorContext], 0))
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))
		def declarationSpecifiers() = Option(getRuleContext(classOf[DeclarationSpecifiersContext], 0))

		override def getRuleIndex = RULE_function_definition
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterFunctionDefinition(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitFunctionDefinition(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitFunctionDefinition(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarationSpecifiers() = Option(getRuleContext(classOf[DeclarationSpecifiersContext], 0))
		def initDeclaratorList() = Option(getRuleContext(classOf[InitDeclaratorListContext], 0))

		override def getRuleIndex = RULE_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DeclarationSpecifiersContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def arcBehaviourSpecifier() = getRuleContexts(classOf[ArcBehaviourSpecifierContext]).asScala.toList
		def arcBehaviourSpecifier(i: Int) = getRuleContext(classOf[ArcBehaviourSpecifierContext], i)
		def storageClassSpecifier() = getRuleContexts(classOf[StorageClassSpecifierContext]).asScala.toList
		def storageClassSpecifier(i: Int) = getRuleContext(classOf[StorageClassSpecifierContext], i)
		def typeSpecifier() = getRuleContexts(classOf[TypeSpecifierContext]).asScala.toList
		def typeSpecifier(i: Int) = getRuleContext(classOf[TypeSpecifierContext], i)
		def typeQualifier() = getRuleContexts(classOf[TypeQualifierContext]).asScala.toList
		def typeQualifier(i: Int) = getRuleContext(classOf[TypeQualifierContext], i)

		override def getRuleIndex = RULE_declaration_specifiers
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDeclarationSpecifiers(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDeclarationSpecifiers(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDeclarationSpecifiers(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ArcBehaviourSpecifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {

		override def getRuleIndex = RULE_arc_behaviour_specifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterArcBehaviourSpecifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitArcBehaviourSpecifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitArcBehaviourSpecifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StorageClassSpecifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {

		override def getRuleIndex = RULE_storage_class_specifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStorageClassSpecifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStorageClassSpecifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStorageClassSpecifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InitDeclaratorListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def initDeclarator() = getRuleContexts(classOf[InitDeclaratorContext]).asScala.toList
		def initDeclarator(i: Int) = getRuleContext(classOf[InitDeclaratorContext], i)

		override def getRuleIndex = RULE_init_declarator_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInitDeclaratorList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInitDeclaratorList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInitDeclaratorList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InitDeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarator() = Option(getRuleContext(classOf[DeclaratorContext], 0))
		def initializer() = Option(getRuleContext(classOf[InitializerContext], 0))

		override def getRuleIndex = RULE_init_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInitDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInitDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInitDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StructOrUnionSpecifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))
		def structDeclaration() = getRuleContexts(classOf[StructDeclarationContext]).asScala.toList
		def structDeclaration(i: Int) = getRuleContext(classOf[StructDeclarationContext], i)

		override def getRuleIndex = RULE_struct_or_union_specifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStructOrUnionSpecifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStructOrUnionSpecifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStructOrUnionSpecifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StructDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def specifierQualifierList() = Option(getRuleContext(classOf[SpecifierQualifierListContext], 0))
		def structDeclaratorList() = Option(getRuleContext(classOf[StructDeclaratorListContext], 0))

		override def getRuleIndex = RULE_struct_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStructDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStructDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStructDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SpecifierQualifierListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def arcBehaviourSpecifier() = getRuleContexts(classOf[ArcBehaviourSpecifierContext]).asScala.toList
		def arcBehaviourSpecifier(i: Int) = getRuleContext(classOf[ArcBehaviourSpecifierContext], i)
		def typeSpecifier() = getRuleContexts(classOf[TypeSpecifierContext]).asScala.toList
		def typeSpecifier(i: Int) = getRuleContext(classOf[TypeSpecifierContext], i)
		def typeQualifier() = getRuleContexts(classOf[TypeQualifierContext]).asScala.toList
		def typeQualifier(i: Int) = getRuleContext(classOf[TypeQualifierContext], i)

		override def getRuleIndex = RULE_specifier_qualifier_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSpecifierQualifierList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSpecifierQualifierList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSpecifierQualifierList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StructDeclaratorListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def structDeclarator() = getRuleContexts(classOf[StructDeclaratorContext]).asScala.toList
		def structDeclarator(i: Int) = getRuleContext(classOf[StructDeclaratorContext], i)

		override def getRuleIndex = RULE_struct_declarator_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStructDeclaratorList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStructDeclaratorList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStructDeclaratorList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StructDeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarator() = Option(getRuleContext(classOf[DeclaratorContext], 0))
		def constant() = Option(getRuleContext(classOf[ConstantContext], 0))

		override def getRuleIndex = RULE_struct_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStructDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStructDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStructDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class EnumSpecifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def identifier() = Option(getRuleContext(classOf[IdentifierContext], 0))
		def enumeratorList() = Option(getRuleContext(classOf[EnumeratorListContext], 0))
		def typeName() = Option(getRuleContext(classOf[TypeNameContext], 0))
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_enum_specifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterEnumSpecifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitEnumSpecifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitEnumSpecifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class EnumeratorListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def enumerator() = getRuleContexts(classOf[EnumeratorContext]).asScala.toList
		def enumerator(i: Int) = getRuleContext(classOf[EnumeratorContext], i)

		override def getRuleIndex = RULE_enumerator_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterEnumeratorList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitEnumeratorList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitEnumeratorList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class EnumeratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def identifier() = Option(getRuleContext(classOf[IdentifierContext], 0))
		def constantExpression() = Option(getRuleContext(classOf[ConstantExpressionContext], 0))

		override def getRuleIndex = RULE_enumerator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterEnumerator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitEnumerator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitEnumerator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PointerContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarationSpecifiers() = Option(getRuleContext(classOf[DeclarationSpecifiersContext], 0))
		def pointer() = Option(getRuleContext(classOf[PointerContext], 0))

		override def getRuleIndex = RULE_pointer
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPointer(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPointer(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPointer(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def directDeclarator() = Option(getRuleContext(classOf[DirectDeclaratorContext], 0))
		def pointer() = Option(getRuleContext(classOf[PointerContext], 0))

		override def getRuleIndex = RULE_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DirectDeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def identifier() = Option(getRuleContext(classOf[IdentifierContext], 0))
		def declaratorSuffix() = getRuleContexts(classOf[DeclaratorSuffixContext]).asScala.toList
		def declaratorSuffix(i: Int) = getRuleContext(classOf[DeclaratorSuffixContext], i)
		def declarator() = Option(getRuleContext(classOf[DeclaratorContext], 0))
		def blockParameters() = Option(getRuleContext(classOf[BlockParametersContext], 0))

		override def getRuleIndex = RULE_direct_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDirectDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDirectDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDirectDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DeclaratorSuffixContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def constantExpression() = Option(getRuleContext(classOf[ConstantExpressionContext], 0))
		def parameterList() = Option(getRuleContext(classOf[ParameterListContext], 0))

		override def getRuleIndex = RULE_declarator_suffix
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDeclaratorSuffix(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDeclaratorSuffix(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDeclaratorSuffix(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ParameterListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def parameterDeclarationList() = Option(getRuleContext(classOf[ParameterDeclarationListContext], 0))

		override def getRuleIndex = RULE_parameter_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterParameterList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitParameterList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitParameterList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ParameterDeclarationContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declarationSpecifiers() = Option(getRuleContext(classOf[DeclarationSpecifiersContext], 0))
		def abstractDeclarator() = Option(getRuleContext(classOf[AbstractDeclaratorContext], 0))
		def declarator() = Option(getRuleContext(classOf[DeclaratorContext], 0))

		override def getRuleIndex = RULE_parameter_declaration
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterParameterDeclaration(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitParameterDeclaration(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitParameterDeclaration(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InitializerContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def assignmentExpression() = Option(getRuleContext(classOf[AssignmentExpressionContext], 0))
		def initializer() = getRuleContexts(classOf[InitializerContext]).asScala.toList
		def initializer(i: Int) = getRuleContext(classOf[InitializerContext], i)

		override def getRuleIndex = RULE_initializer
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInitializer(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInitializer(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInitializer(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class TypeNameContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def specifierQualifierList() = Option(getRuleContext(classOf[SpecifierQualifierListContext], 0))
		def abstractDeclarator() = Option(getRuleContext(classOf[AbstractDeclaratorContext], 0))
		def blockType() = Option(getRuleContext(classOf[BlockTypeContext], 0))

		override def getRuleIndex = RULE_type_name
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterTypeName(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitTypeName(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitTypeName(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AbstractDeclaratorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def pointer() = Option(getRuleContext(classOf[PointerContext], 0))
		def abstractDeclarator() = Option(getRuleContext(classOf[AbstractDeclaratorContext], 0))
		def abstractDeclaratorSuffix() = getRuleContexts(classOf[AbstractDeclaratorSuffixContext]).asScala.toList
		def abstractDeclaratorSuffix(i: Int) = getRuleContext(classOf[AbstractDeclaratorSuffixContext], i)
		def constantExpression() = getRuleContexts(classOf[ConstantExpressionContext]).asScala.toList
		def constantExpression(i: Int) = getRuleContext(classOf[ConstantExpressionContext], i)

		override def getRuleIndex = RULE_abstract_declarator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAbstractDeclarator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAbstractDeclarator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAbstractDeclarator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AbstractDeclaratorSuffixContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def constantExpression() = Option(getRuleContext(classOf[ConstantExpressionContext], 0))
		def parameterDeclarationList() = Option(getRuleContext(classOf[ParameterDeclarationListContext], 0))

		override def getRuleIndex = RULE_abstract_declarator_suffix
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAbstractDeclaratorSuffix(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAbstractDeclaratorSuffix(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAbstractDeclaratorSuffix(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ParameterDeclarationListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def parameterDeclaration() = getRuleContexts(classOf[ParameterDeclarationContext]).asScala.toList
		def parameterDeclaration(i: Int) = getRuleContext(classOf[ParameterDeclarationContext], i)

		override def getRuleIndex = RULE_parameter_declaration_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterParameterDeclarationList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitParameterDeclarationList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitParameterDeclarationList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StatementListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def statement() = getRuleContexts(classOf[StatementContext]).asScala.toList
		def statement(i: Int) = getRuleContext(classOf[StatementContext], i)

		override def getRuleIndex = RULE_statement_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStatementList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStatementList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStatementList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class StatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def labeledStatement() = Option(getRuleContext(classOf[LabeledStatementContext], 0))
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def compoundStatement() = Option(getRuleContext(classOf[CompoundStatementContext], 0))
		def selectionStatement() = Option(getRuleContext(classOf[SelectionStatementContext], 0))
		def iterationStatement() = Option(getRuleContext(classOf[IterationStatementContext], 0))
		def jumpStatement() = Option(getRuleContext(classOf[JumpStatementContext], 0))
		def synchronizedStatement() = Option(getRuleContext(classOf[SynchronizedStatementContext], 0))
		def autoreleaseStatement() = Option(getRuleContext(classOf[AutoreleaseStatementContext], 0))
		def tryBlock() = Option(getRuleContext(classOf[TryBlockContext], 0))

		override def getRuleIndex = RULE_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class LabeledStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def identifier() = Option(getRuleContext(classOf[IdentifierContext], 0))
		def statement() = Option(getRuleContext(classOf[StatementContext], 0))
		def constantExpression() = Option(getRuleContext(classOf[ConstantExpressionContext], 0))

		override def getRuleIndex = RULE_labeled_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterLabeledStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitLabeledStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitLabeledStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class CompoundStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def declaration() = getRuleContexts(classOf[DeclarationContext]).asScala.toList
		def declaration(i: Int) = getRuleContext(classOf[DeclarationContext], i)
		def statementList() = getRuleContexts(classOf[StatementListContext]).asScala.toList
		def statementList(i: Int) = getRuleContext(classOf[StatementListContext], i)

		override def getRuleIndex = RULE_compound_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterCompoundStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitCompoundStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitCompoundStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class SelectionStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def statement() = getRuleContexts(classOf[StatementContext]).asScala.toList
		def statement(i: Int) = getRuleContext(classOf[StatementContext], i)

		override def getRuleIndex = RULE_selection_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterSelectionStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitSelectionStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitSelectionStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ForInStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeVariableDeclarator() = Option(getRuleContext(classOf[TypeVariableDeclaratorContext], 0))
		def statement() = Option(getRuleContext(classOf[StatementContext], 0))
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))

		override def getRuleIndex = RULE_for_in_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterForInStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitForInStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitForInStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ForStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def statement() = Option(getRuleContext(classOf[StatementContext], 0))
		def expression() = getRuleContexts(classOf[ExpressionContext]).asScala.toList
		def expression(i: Int) = getRuleContext(classOf[ExpressionContext], i)
		def declarationSpecifiers() = Option(getRuleContext(classOf[DeclarationSpecifiersContext], 0))
		def initDeclaratorList() = Option(getRuleContext(classOf[InitDeclaratorListContext], 0))

		override def getRuleIndex = RULE_for_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterForStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitForStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitForStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class WhileStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))
		def statement() = Option(getRuleContext(classOf[StatementContext], 0))

		override def getRuleIndex = RULE_while_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterWhileStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitWhileStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitWhileStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class DoStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def statement() = Option(getRuleContext(classOf[StatementContext], 0))
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))

		override def getRuleIndex = RULE_do_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterDoStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitDoStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitDoStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class IterationStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def whileStatement() = Option(getRuleContext(classOf[WhileStatementContext], 0))
		def doStatement() = Option(getRuleContext(classOf[DoStatementContext], 0))
		def forStatement() = Option(getRuleContext(classOf[ForStatementContext], 0))
		def forInStatement() = Option(getRuleContext(classOf[ForInStatementContext], 0))

		override def getRuleIndex = RULE_iteration_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterIterationStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitIterationStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitIterationStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class JumpStatementContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def identifier() = Option(getRuleContext(classOf[IdentifierContext], 0))
		def expression() = Option(getRuleContext(classOf[ExpressionContext], 0))

		override def getRuleIndex = RULE_jump_statement
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterJumpStatement(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitJumpStatement(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitJumpStatement(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def assignmentExpression() = getRuleContexts(classOf[AssignmentExpressionContext]).asScala.toList
		def assignmentExpression(i: Int) = getRuleContext(classOf[AssignmentExpressionContext], i)

		override def getRuleIndex = RULE_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AssignmentExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def conditionalExpression() = Option(getRuleContext(classOf[ConditionalExpressionContext], 0))
		def unaryExpression() = Option(getRuleContext(classOf[UnaryExpressionContext], 0))
		def assignmentOperator() = Option(getRuleContext(classOf[AssignmentOperatorContext], 0))
		def assignmentExpression() = Option(getRuleContext(classOf[AssignmentExpressionContext], 0))

		override def getRuleIndex = RULE_assignment_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAssignmentExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAssignmentExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAssignmentExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AssignmentOperatorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {

		override def getRuleIndex = RULE_assignment_operator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAssignmentOperator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAssignmentOperator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAssignmentOperator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ConditionalExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def logicalOrExpression() = Option(getRuleContext(classOf[LogicalOrExpressionContext], 0))
		def conditionalExpression() = getRuleContexts(classOf[ConditionalExpressionContext]).asScala.toList
		def conditionalExpression(i: Int) = getRuleContext(classOf[ConditionalExpressionContext], i)

		override def getRuleIndex = RULE_conditional_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterConditionalExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitConditionalExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitConditionalExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ConstantExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def conditionalExpression() = Option(getRuleContext(classOf[ConditionalExpressionContext], 0))

		override def getRuleIndex = RULE_constant_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterConstantExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitConstantExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitConstantExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class LogicalOrExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def logicalAndExpression() = getRuleContexts(classOf[LogicalAndExpressionContext]).asScala.toList
		def logicalAndExpression(i: Int) = getRuleContext(classOf[LogicalAndExpressionContext], i)

		override def getRuleIndex = RULE_logical_or_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterLogicalOrExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitLogicalOrExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitLogicalOrExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class LogicalAndExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def inclusiveOrExpression() = getRuleContexts(classOf[InclusiveOrExpressionContext]).asScala.toList
		def inclusiveOrExpression(i: Int) = getRuleContext(classOf[InclusiveOrExpressionContext], i)

		override def getRuleIndex = RULE_logical_and_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterLogicalAndExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitLogicalAndExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitLogicalAndExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class InclusiveOrExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def exclusiveOrExpression() = getRuleContexts(classOf[ExclusiveOrExpressionContext]).asScala.toList
		def exclusiveOrExpression(i: Int) = getRuleContext(classOf[ExclusiveOrExpressionContext], i)

		override def getRuleIndex = RULE_inclusive_or_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterInclusiveOrExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitInclusiveOrExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitInclusiveOrExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ExclusiveOrExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def andExpression() = getRuleContexts(classOf[AndExpressionContext]).asScala.toList
		def andExpression(i: Int) = getRuleContext(classOf[AndExpressionContext], i)

		override def getRuleIndex = RULE_exclusive_or_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterExclusiveOrExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitExclusiveOrExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitExclusiveOrExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AndExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def equalityExpression() = getRuleContexts(classOf[EqualityExpressionContext]).asScala.toList
		def equalityExpression(i: Int) = getRuleContext(classOf[EqualityExpressionContext], i)

		override def getRuleIndex = RULE_and_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAndExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAndExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAndExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class EqualityExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def relationalExpression() = getRuleContexts(classOf[RelationalExpressionContext]).asScala.toList
		def relationalExpression(i: Int) = getRuleContext(classOf[RelationalExpressionContext], i)

		override def getRuleIndex = RULE_equality_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterEqualityExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitEqualityExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitEqualityExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class RelationalExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def shiftExpression() = getRuleContexts(classOf[ShiftExpressionContext]).asScala.toList
		def shiftExpression(i: Int) = getRuleContext(classOf[ShiftExpressionContext], i)

		override def getRuleIndex = RULE_relational_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterRelationalExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitRelationalExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitRelationalExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ShiftExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def additiveExpression() = getRuleContexts(classOf[AdditiveExpressionContext]).asScala.toList
		def additiveExpression(i: Int) = getRuleContext(classOf[AdditiveExpressionContext], i)

		override def getRuleIndex = RULE_shift_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterShiftExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitShiftExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitShiftExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class AdditiveExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def multiplicativeExpression() = getRuleContexts(classOf[MultiplicativeExpressionContext]).asScala.toList
		def multiplicativeExpression(i: Int) = getRuleContext(classOf[MultiplicativeExpressionContext], i)

		override def getRuleIndex = RULE_additive_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterAdditiveExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitAdditiveExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitAdditiveExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class MultiplicativeExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def castExpression() = getRuleContexts(classOf[CastExpressionContext]).asScala.toList
		def castExpression(i: Int) = getRuleContext(classOf[CastExpressionContext], i)

		override def getRuleIndex = RULE_multiplicative_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterMultiplicativeExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitMultiplicativeExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitMultiplicativeExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class CastExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def typeName() = Option(getRuleContext(classOf[TypeNameContext], 0))
		def castExpression() = Option(getRuleContext(classOf[CastExpressionContext], 0))
		def unaryExpression() = Option(getRuleContext(classOf[UnaryExpressionContext], 0))

		override def getRuleIndex = RULE_cast_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterCastExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitCastExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitCastExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class UnaryExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def postfixExpression() = Option(getRuleContext(classOf[PostfixExpressionContext], 0))
		def unaryExpression() = Option(getRuleContext(classOf[UnaryExpressionContext], 0))
		def unaryOperator() = Option(getRuleContext(classOf[UnaryOperatorContext], 0))
		def castExpression() = Option(getRuleContext(classOf[CastExpressionContext], 0))
		def typeName() = Option(getRuleContext(classOf[TypeNameContext], 0))

		override def getRuleIndex = RULE_unary_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterUnaryExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitUnaryExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitUnaryExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class UnaryOperatorContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {

		override def getRuleIndex = RULE_unary_operator
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterUnaryOperator(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitUnaryOperator(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitUnaryOperator(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class PostfixExpressionContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def primaryExpression() = Option(getRuleContext(classOf[PrimaryExpressionContext], 0))
		def expression() = getRuleContexts(classOf[ExpressionContext]).asScala.toList
		def expression(i: Int) = getRuleContext(classOf[ExpressionContext], i)
		def identifier() = getRuleContexts(classOf[IdentifierContext]).asScala.toList
		def identifier(i: Int) = getRuleContext(classOf[IdentifierContext], i)
		def argumentExpressionList() = getRuleContexts(classOf[ArgumentExpressionListContext]).asScala.toList
		def argumentExpressionList(i: Int) = getRuleContext(classOf[ArgumentExpressionListContext], i)

		override def getRuleIndex = RULE_postfix_expression
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterPostfixExpression(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitPostfixExpression(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitPostfixExpression(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ArgumentExpressionListContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def assignmentExpression() = getRuleContexts(classOf[AssignmentExpressionContext]).asScala.toList
		def assignmentExpression(i: Int) = getRuleContext(classOf[AssignmentExpressionContext], i)

		override def getRuleIndex = RULE_argument_expression_list
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterArgumentExpressionList(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitArgumentExpressionList(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitArgumentExpressionList(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class IdentifierContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def IDENTIFIER() = Option(getToken(ObjCParser.IDENTIFIER, 0))

		override def getRuleIndex = RULE_identifier
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterIdentifier(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitIdentifier(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitIdentifier(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}


	class ConstantContext(parent: ParserRuleContext, invokingState: Int) extends ParserRuleContext(parent, invokingState) {
		def DECIMAL_LITERAL() = Option(getToken(ObjCParser.DECIMAL_LITERAL, 0))
		def HEX_LITERAL() = Option(getToken(ObjCParser.HEX_LITERAL, 0))
		def OCTAL_LITERAL() = Option(getToken(ObjCParser.OCTAL_LITERAL, 0))
		def CHARACTER_LITERAL() = Option(getToken(ObjCParser.CHARACTER_LITERAL, 0))
		def FLOATING_POINT_LITERAL() = Option(getToken(ObjCParser.FLOATING_POINT_LITERAL, 0))

		override def getRuleIndex = RULE_constant
		override def enterRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.enterConstant(this)
			case _ =>
		}
		override def exitRule(listener: ParseTreeListener) = listener match {
			case listener1: ObjCListener => listener1.exitConstant(this)
			case _ =>
		}
		override def accept[T](visitor: ParseTreeVisitor[_ <: T]): T = visitor match {
			case _: ObjCVisitor[_] =>
				visitor.asInstanceOf[ObjCVisitor[_ <: T]].visitConstant(this)
			case _ =>
				visitor.visitChildren(this)
		}
	}



	val EOF = -1
	val T__0 = 1
	val AUTORELEASEPOOL = 2
	val CATCH = 3
	val CLASS = 4
	val DYNAMIC = 5
	val ENCODE = 6
	val END = 7
	val FINALLY = 8
	val IMPLEMENTATION = 9
	val INTERFACE = 10
	val PACKAGE = 11
	val PROTOCOL = 12
	val OPTIONAL = 13
	val PRIVATE = 14
	val PROPERTY = 15
	val PROTECTED = 16
	val PUBLIC = 17
	val SELECTOR = 18
	val SYNCHRONIZED = 19
	val SYNTHESIZE = 20
	val THROW = 21
	val TRY = 22
	val SUPER = 23
	val SELF = 24
	val ABSTRACT = 25
	val AUTO = 26
	val BOOLEAN = 27
	val BREAK = 28
	val BYCOPY = 29
	val BYREF = 30
	val CASE = 31
	val CHAR = 32
	val CONST = 33
	val CONTINUE = 34
	val DEFAULT = 35
	val DO = 36
	val DOUBLE = 37
	val ELSE = 38
	val ENUM = 39
	val EXTERN = 40
	val FLOAT = 41
	val FOR = 42
	val ID = 43
	val IF = 44
	val IN = 45
	val INOUT = 46
	val GOTO = 47
	val INT = 48
	val LONG = 49
	val ONEWAY = 50
	val OUT = 51
	val REGISTER = 52
	val RETURN = 53
	val SHORT = 54
	val SIGNED = 55
	val SIZEOF = 56
	val STATIC = 57
	val STRUCT = 58
	val SWITCH = 59
	val TYPEDEF = 60
	val UNION = 61
	val UNSIGNED = 62
	val VOID = 63
	val VOLATILE = 64
	val WHILE = 65
	val NS_OPTIONS = 66
	val NS_ENUM = 67
	val WWEAK = 68
	val WUNSAFE_UNRETAINED = 69
	val LPAREN = 70
	val RPAREN = 71
	val LBRACE = 72
	val RBRACE = 73
	val LBRACK = 74
	val RBRACK = 75
	val SEMI = 76
	val COMMA = 77
	val DOT = 78
	val STRUCTACCESS = 79
	val AT = 80
	val ASSIGN = 81
	val GT = 82
	val LT = 83
	val BANG = 84
	val TILDE = 85
	val QUESTION = 86
	val COLON = 87
	val EQUAL = 88
	val LE = 89
	val GE = 90
	val NOTEQUAL = 91
	val AND = 92
	val OR = 93
	val INC = 94
	val DEC = 95
	val ADD = 96
	val SUB = 97
	val MUL = 98
	val DIV = 99
	val BITAND = 100
	val BITOR = 101
	val CARET = 102
	val MOD = 103
	val SHIFT_R = 104
	val SHIFT_L = 105
	val ADD_ASSIGN = 106
	val SUB_ASSIGN = 107
	val MUL_ASSIGN = 108
	val DIV_ASSIGN = 109
	val AND_ASSIGN = 110
	val OR_ASSIGN = 111
	val XOR_ASSIGN = 112
	val MOD_ASSIGN = 113
	val LSHIFT_ASSIGN = 114
	val RSHIFT_ASSIGN = 115
	val ELIPSIS = 116
	val ASSIGNPA = 117
	val GETTER = 118
	val NONATOMIC = 119
	val SETTER = 120
	val STRONG = 121
	val RETAIN = 122
	val READONLY = 123
	val READWRITE = 124
	val WEAK = 125
	val IDENTIFIER = 126
	val CHARACTER_LITERAL = 127
	val STRING_LITERAL = 128
	val HEX_LITERAL = 129
	val DECIMAL_LITERAL = 130
	val OCTAL_LITERAL = 131
	val FLOATING_POINT_LITERAL = 132
	val IMPORT = 133
	val INCLUDE = 134
	val PRAGMA = 135
	val WS = 136
	val COMMENT = 137
	val LINE_COMMENT = 138
	val HDEFINE = 139
	val HIF = 140
	val HELSE = 141
	val HUNDEF = 142
	val HIFNDEF = 143
	val HENDIF = 144

    val RULE_translation_unit = 0
    val RULE_external_declaration = 1
    val RULE_preprocessor_declaration = 2
    val RULE_class_interface = 3
    val RULE_category_interface = 4
    val RULE_class_implementation = 5
    val RULE_category_implementation = 6
    val RULE_protocol_declaration = 7
    val RULE_protocol_declaration_list = 8
    val RULE_class_declaration_list = 9
    val RULE_class_list = 10
    val RULE_protocol_reference_list = 11
    val RULE_protocol_list = 12
    val RULE_property_declaration = 13
    val RULE_property_attributes_declaration = 14
    val RULE_property_attributes_list = 15
    val RULE_property_attribute = 16
    val RULE_ib_outlet_specifier = 17
    val RULE_class_name = 18
    val RULE_superclass_name = 19
    val RULE_category_name = 20
    val RULE_protocol_name = 21
    val RULE_instance_variables = 22
    val RULE_visibility_specification = 23
    val RULE_interface_declaration_list = 24
    val RULE_class_method_declaration = 25
    val RULE_instance_method_declaration = 26
    val RULE_method_declaration = 27
    val RULE_implementation_definition_list = 28
    val RULE_class_method_definition = 29
    val RULE_instance_method_definition = 30
    val RULE_method_definition = 31
    val RULE_method_selector = 32
    val RULE_keyword_declarator = 33
    val RULE_selector = 34
    val RULE_method_type = 35
    val RULE_property_implementation = 36
    val RULE_property_synthesize_list = 37
    val RULE_property_synthesize_item = 38
    val RULE_block_type = 39
    val RULE_type_specifier = 40
    val RULE_type_qualifier = 41
    val RULE_protocol_qualifier = 42
    val RULE_primary_expression = 43
    val RULE_dictionary_pair = 44
    val RULE_dictionary_expression = 45
    val RULE_array_expression = 46
    val RULE_box_expression = 47
    val RULE_block_parameters = 48
    val RULE_block_expression = 49
    val RULE_message_expression = 50
    val RULE_receiver = 51
    val RULE_message_selector = 52
    val RULE_keyword_argument = 53
    val RULE_selector_expression = 54
    val RULE_selector_name = 55
    val RULE_protocol_expression = 56
    val RULE_encode_expression = 57
    val RULE_type_variable_declarator = 58
    val RULE_try_statement = 59
    val RULE_catch_statement = 60
    val RULE_finally_statement = 61
    val RULE_throw_statement = 62
    val RULE_try_block = 63
    val RULE_synchronized_statement = 64
    val RULE_autorelease_statement = 65
    val RULE_function_definition = 66
    val RULE_declaration = 67
    val RULE_declaration_specifiers = 68
    val RULE_arc_behaviour_specifier = 69
    val RULE_storage_class_specifier = 70
    val RULE_init_declarator_list = 71
    val RULE_init_declarator = 72
    val RULE_struct_or_union_specifier = 73
    val RULE_struct_declaration = 74
    val RULE_specifier_qualifier_list = 75
    val RULE_struct_declarator_list = 76
    val RULE_struct_declarator = 77
    val RULE_enum_specifier = 78
    val RULE_enumerator_list = 79
    val RULE_enumerator = 80
    val RULE_pointer = 81
    val RULE_declarator = 82
    val RULE_direct_declarator = 83
    val RULE_declarator_suffix = 84
    val RULE_parameter_list = 85
    val RULE_parameter_declaration = 86
    val RULE_initializer = 87
    val RULE_type_name = 88
    val RULE_abstract_declarator = 89
    val RULE_abstract_declarator_suffix = 90
    val RULE_parameter_declaration_list = 91
    val RULE_statement_list = 92
    val RULE_statement = 93
    val RULE_labeled_statement = 94
    val RULE_compound_statement = 95
    val RULE_selection_statement = 96
    val RULE_for_in_statement = 97
    val RULE_for_statement = 98
    val RULE_while_statement = 99
    val RULE_do_statement = 100
    val RULE_iteration_statement = 101
    val RULE_jump_statement = 102
    val RULE_expression = 103
    val RULE_assignment_expression = 104
    val RULE_assignment_operator = 105
    val RULE_conditional_expression = 106
    val RULE_constant_expression = 107
    val RULE_logical_or_expression = 108
    val RULE_logical_and_expression = 109
    val RULE_inclusive_or_expression = 110
    val RULE_exclusive_or_expression = 111
    val RULE_and_expression = 112
    val RULE_equality_expression = 113
    val RULE_relational_expression = 114
    val RULE_shift_expression = 115
    val RULE_additive_expression = 116
    val RULE_multiplicative_expression = 117
    val RULE_cast_expression = 118
    val RULE_unary_expression = 119
    val RULE_unary_operator = 120
    val RULE_postfix_expression = 121
    val RULE_argument_expression_list = 122
    val RULE_identifier = 123
    val RULE_constant = 124
    val ruleNames = scala.List(
    		"translation_unit", "external_declaration", "preprocessor_declaration", 
    		"class_interface", "category_interface", "class_implementation", "category_implementation", 
    		"protocol_declaration", "protocol_declaration_list", "class_declaration_list", 
    		"class_list", "protocol_reference_list", "protocol_list", "property_declaration", 
    		"property_attributes_declaration", "property_attributes_list", "property_attribute", 
    		"ib_outlet_specifier", "class_name", "superclass_name", "category_name", 
    		"protocol_name", "instance_variables", "visibility_specification", 
    		"interface_declaration_list", "class_method_declaration", "instance_method_declaration", 
    		"method_declaration", "implementation_definition_list", "class_method_definition", 
    		"instance_method_definition", "method_definition", "method_selector", 
    		"keyword_declarator", "selector", "method_type", "property_implementation", 
    		"property_synthesize_list", "property_synthesize_item", "block_type", 
    		"type_specifier", "type_qualifier", "protocol_qualifier", "primary_expression", 
    		"dictionary_pair", "dictionary_expression", "array_expression", "box_expression", 
    		"block_parameters", "block_expression", "message_expression", "receiver", 
    		"message_selector", "keyword_argument", "selector_expression", "selector_name", 
    		"protocol_expression", "encode_expression", "type_variable_declarator", 
    		"try_statement", "catch_statement", "finally_statement", "throw_statement", 
    		"try_block", "synchronized_statement", "autorelease_statement", "function_definition", 
    		"declaration", "declaration_specifiers", "arc_behaviour_specifier", 
    		"storage_class_specifier", "init_declarator_list", "init_declarator", 
    		"struct_or_union_specifier", "struct_declaration", "specifier_qualifier_list", 
    		"struct_declarator_list", "struct_declarator", "enum_specifier", "enumerator_list", 
    		"enumerator", "pointer", "declarator", "direct_declarator", "declarator_suffix", 
    		"parameter_list", "parameter_declaration", "initializer", "type_name", 
    		"abstract_declarator", "abstract_declarator_suffix", "parameter_declaration_list", 
    		"statement_list", "statement", "labeled_statement", "compound_statement", 
    		"selection_statement", "for_in_statement", "for_statement", "while_statement", 
    		"do_statement", "iteration_statement", "jump_statement", "expression", 
    		"assignment_expression", "assignment_operator", "conditional_expression", 
    		"constant_expression", "logical_or_expression", "logical_and_expression", 
    		"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
    		"equality_expression", "relational_expression", "shift_expression", 
    		"additive_expression", "multiplicative_expression", "cast_expression", 
    		"unary_expression", "unary_operator", "postfix_expression", "argument_expression_list", 
    		"identifier", "constant"
    ).toArray

	private val _LITERAL_NAMES = scala.List(
		null, "'@required'", "'@autoreleasepool'", "'@catch'", "'@class'", "'@dynamic'", 
		"'@encode'", "'@end'", "'@finally'", "'@implementation'", "'@interface'", 
		"'@package'", "'@protocol'", "'@optional'", "'@private'", "'@property'", 
		"'@protected'", "'@public'", "'@selector'", "'@synchronized'", "'@synthesize'", 
		"'@throw'", "'@try'", "'super'", "'self'", "'abstract'", "'auto'", "'boolean'", 
		"'break'", "'bycopy'", "'byref'", "'case'", "'char'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
		"'for'", "'id'", "'if'", "'in'", "'inout'", "'goto'", "'int'", "'long'", 
		"'oneway'", "'out'", "'register'", "'return'", "'short'", "'signed'", 
		"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
		"'unsigned'", "'void'", "'volatile'", "'while'", "'NS_OPTIONS'", "'NS_ENUM'", 
		"'__weak'", "'__unsafe_unretained'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'->'", "'@'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'>>'", 
		"'<<'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'...'", "'assign'", "'getter'", "'nonatomic'", "'setter'", 
		"'strong'", "'retain'", "'readonly'", "'readwrite'", "'weak'"
	).toArray

	private val _SYMBOLIC_NAMES = scala.List(
		null, null, "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", 
		"END", "FINALLY", "IMPLEMENTATION", "INTERFACE", "PACKAGE", "PROTOCOL", 
		"OPTIONAL", "PRIVATE", "PROPERTY", "PROTECTED", "PUBLIC", "SELECTOR", 
		"SYNCHRONIZED", "SYNTHESIZE", "THROW", "TRY", "SUPER", "SELF", "ABSTRACT", 
		"AUTO", "BOOLEAN", "BREAK", "BYCOPY", "BYREF", "CASE", "CHAR", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", 
		"FOR", "ID", "IF", "IN", "INOUT", "GOTO", "INT", "LONG", "ONEWAY", "OUT", 
		"REGISTER", "RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", 
		"SWITCH", "TYPEDEF", "UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", 
		"NS_OPTIONS", "NS_ENUM", "WWEAK", "WUNSAFE_UNRETAINED", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "STRUCTACCESS", 
		"AT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "SHIFT_R", "SHIFT_L", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "ELIPSIS", "ASSIGNPA", 
		"GETTER", "NONATOMIC", "SETTER", "STRONG", "RETAIN", "READONLY", "READWRITE", 
		"WEAK", "IDENTIFIER", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_LITERAL", 
		"DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "IMPORT", 
		"INCLUDE", "PRAGMA", "WS", "COMMENT", "LINE_COMMENT", "HDEFINE", "HIF", 
		"HELSE", "HUNDEF", "HIFNDEF", "HENDIF"
	).toArray

	val VOCABULARY: Vocabulary = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES)

	@deprecated("Use VOCABULARY instead.", "")
	final val tokenNames = (0 until _SYMBOLIC_NAMES.length).map {
		i => scala.List(
			Option(VOCABULARY.getLiteralName(i)),
			Option(VOCABULARY.getSymbolicName(i)),
			Option("<INVALID>")
		).flatten.head
	} .toArray

	private val _serializedATN =
		"\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\u0003\u0092\u0553"+
		"\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005"+
		"\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004\b\t\b\u0004\t\t"+
		"\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004\r\t\r\u0004\u000e"+
		"\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004\u0011\t\u0011\u0004"+
		"\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t\u0014\u0004\u0015\t\u0015"+
		"\u0004\u0016\t\u0016\u0004\u0017\t\u0017\u0004\u0018\t\u0018\u0004\u0019"+
		"\t\u0019\u0004\u001a\t\u001a\u0004\u001b\t\u001b\u0004\u001c\t\u001c\u0004"+
		"\u001d\t\u001d\u0004\u001e\t\u001e\u0004\u001f\t\u001f\u0004 \t \u0004"+
		"!\t!\u0004\"\t\"\u0004#\t#\u0004$\t$\u0004%\t%\u0004&\t&\u0004\'\t\'\u0004"+
		"(\t(\u0004)\t)\u0004*\t*\u0004+\t+\u0004,\t,\u0004-\t-\u0004.\t.\u0004"+
		"/\t/\u0004\u0030\t\u0030\u0004\u0031\t\u0031\u0004\u0032\t\u0032\u0004"+
		"\u0033\t\u0033\u0004\u0034\t\u0034\u0004\u0035\t\u0035\u0004\u0036\t\u0036"+
		"\u0004\u0037\t\u0037\u00048\t8\u00049\t9\u0004:\t:\u0004;\t;\u0004<\t"+
		"<\u0004=\t=\u0004>\t>\u0004?\t?\u0004@\t@\u0004A\tA\u0004B\tB\u0004C\t"+
		"C\u0004D\tD\u0004E\tE\u0004F\tF\u0004G\tG\u0004H\tH\u0004I\tI\u0004J\t"+
		"J\u0004K\tK\u0004L\tL\u0004M\tM\u0004N\tN\u0004O\tO\u0004P\tP\u0004Q\t"+
		"Q\u0004R\tR\u0004S\tS\u0004T\tT\u0004U\tU\u0004V\tV\u0004W\tW\u0004X\t"+
		"X\u0004Y\tY\u0004Z\tZ\u0004[\t[\u0004\\\t\\\u0004]\t]\u0004^\t^\u0004"+
		"_\t_\u0004`\t`\u0004a\ta\u0004b\tb\u0004c\tc\u0004d\td\u0004e\te\u0004"+
		"f\tf\u0004g\tg\u0004h\th\u0004i\ti\u0004j\tj\u0004k\tk\u0004l\tl\u0004"+
		"m\tm\u0004n\tn\u0004o\to\u0004p\tp\u0004q\tq\u0004r\tr\u0004s\ts\u0004"+
		"t\tt\u0004u\tu\u0004v\tv\u0004w\tw\u0004x\tx\u0004y\ty\u0004z\tz\u0004"+
		"{\t{\u0004|\t|\u0004}\t}\u0004~\t~\u0003\u0002\u0006\u0002\u00fe\n\u0002"+
		"\r\u0002\u000e\u0002\u00ff\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003"+
		"\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003"+
		"\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0110\n\u0003"+
		"\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005"+
		"\u0005\u0005\u0118\n\u0005\u0003\u0005\u0005\u0005\u011b\n\u0005\u0003"+
		"\u0005\u0005\u0005\u011e\n\u0005\u0003\u0005\u0005\u0005\u0121\n\u0005"+
		"\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006"+
		"\u0005\u0006\u0129\n\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u012d\n"+
		"\u0006\u0003\u0006\u0005\u0006\u0130\n\u0006\u0003\u0006\u0005\u0006\u0133"+
		"\n\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003"+
		"\u0007\u0005\u0007\u013b\n\u0007\u0003\u0007\u0005\u0007\u013e\n\u0007"+
		"\u0003\u0007\u0005\u0007\u0141\n\u0007\u0003\u0007\u0003\u0007\u0003\b"+
		"\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\b\u014b\n\b\u0003\b\u0003"+
		"\b\u0003\t\u0003\t\u0003\t\u0005\t\u0152\n\t\u0003\t\u0003\t\u0003\t\u0007"+
		"\t\u0157\n\t\f\t\u000e\t\u015a\u000b\t\u0003\t\u0003\t\u0003\n\u0003\n"+
		"\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003"+
		"\f\u0003\f\u0003\f\u0007\f\u0169\n\f\f\f\u000e\f\u016c\u000b\f\u0003\r"+
		"\u0003\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000e"+
		"\u0175\n\u000e\f\u000e\u000e\u000e\u0178\u000b\u000e\u0003\u000f\u0003"+
		"\u000f\u0005\u000f\u017c\n\u000f\u0003\u000f\u0005\u000f\u017f\n\u000f"+
		"\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010"+
		"\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u018a\n\u0011\f\u0011"+
		"\u000e\u0011\u018d\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003"+
		"\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003"+
		"\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003"+
		"\u0012\u0005\u0012\u019f\n\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003"+
		"\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u01a7\n\u0013\u0003\u0014\u0003"+
		"\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003"+
		"\u0017\u0003\u0018\u0003\u0018\u0007\u0018\u01b3\n\u0018\f\u0018\u000e"+
		"\u0018\u01b6\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018"+
		"\u0006\u0018\u01bc\n\u0018\r\u0018\u000e\u0018\u01bd\u0003\u0018\u0003"+
		"\u0018\u0003\u0018\u0003\u0018\u0006\u0018\u01c4\n\u0018\r\u0018\u000e"+
		"\u0018\u01c5\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018"+
		"\u0003\u0018\u0006\u0018\u01ce\n\u0018\r\u0018\u000e\u0018\u01cf\u0003"+
		"\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u01d5\n\u0018\u0003\u0019\u0003"+
		"\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0006\u001a\u01dd"+
		"\n\u001a\r\u001a\u000e\u001a\u01de\u0003\u001b\u0003\u001b\u0003\u001b"+
		"\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0005\u001d\u01e8\n\u001d"+
		"\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e"+
		"\u0003\u001e\u0003\u001e\u0006\u001e\u01f2\n\u001e\r\u001e\u000e\u001e"+
		"\u01f3\u0003\u001f\u0003\u001f\u0003\u001f\u0003 \u0003 \u0003 \u0003"+
		"!\u0005!\u01fd\n!\u0003!\u0003!\u0005!\u0201\n!\u0003!\u0005!\u0204\n"+
		"!\u0003!\u0003!\u0003\"\u0003\"\u0006\"\u020a\n\"\r\"\u000e\"\u020b\u0003"+
		"\"\u0005\"\u020f\n\"\u0005\"\u0211\n\"\u0003#\u0005#\u0214\n#\u0003#\u0003"+
		"#\u0007#\u0218\n#\f#\u000e#\u021b\u000b#\u0003#\u0003#\u0003$\u0003$\u0003"+
		"%\u0003%\u0003%\u0003%\u0003&\u0003&\u0003&\u0003&\u0003&\u0003&\u0003"+
		"&\u0003&\u0005&\u022d\n&\u0003\'\u0003\'\u0003\'\u0007\'\u0232\n\'\f\'"+
		"\u000e\'\u0235\u000b\'\u0003(\u0003(\u0003(\u0003(\u0005(\u023b\n(\u0003"+
		")\u0003)\u0003)\u0003)\u0005)\u0241\n)\u0003)\u0003)\u0005)\u0245\n)\u0003"+
		"*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003*\u0003"+
		"*\u0005*\u0252\n*\u0003*\u0003*\u0005*\u0256\n*\u0003*\u0003*\u0003*\u0003"+
		"*\u0003*\u0005*\u025d\n*\u0003+\u0003+\u0003+\u0005+\u0262\n+\u0003,\u0003"+
		",\u0003-\u0003-\u0003-\u0003-\u0003-\u0003-\u0003-\u0003-\u0003-\u0003"+
		"-\u0003-\u0003-\u0003-\u0003-\u0003-\u0003-\u0003-\u0005-\u0277\n-\u0003"+
		".\u0003.\u0003.\u0003.\u0005.\u027d\n.\u0003/\u0003/\u0003/\u0005/\u0282"+
		"\n/\u0003/\u0003/\u0007/\u0286\n/\f/\u000e/\u0289\u000b/\u0003/\u0005"+
		"/\u028c\n/\u0003/\u0003/\u0003\u0030\u0003\u0030\u0003\u0030\u0005\u0030"+
		"\u0293\n\u0030\u0003\u0030\u0003\u0030\u0007\u0030\u0297\n\u0030\f\u0030"+
		"\u000e\u0030\u029a\u000b\u0030\u0003\u0030\u0005\u0030\u029d\n\u0030\u0003"+
		"\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005"+
		"\u0031\u02a5\n\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005"+
		"\u0031\u02ab\n\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0005"+
		"\u0032\u02b1\n\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u02b6"+
		"\n\u0032\u0007\u0032\u02b8\n\u0032\f\u0032\u000e\u0032\u02bb\u000b\u0032"+
		"\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0005\u0033\u02c1\n\u0033"+
		"\u0003\u0033\u0005\u0033\u02c4\n\u0033\u0003\u0033\u0003\u0033\u0003\u0034"+
		"\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035"+
		"\u0003\u0035\u0005\u0035\u02d0\n\u0035\u0003\u0036\u0003\u0036\u0006\u0036"+
		"\u02d4\n\u0036\r\u0036\u000e\u0036\u02d5\u0005\u0036\u02d8\n\u0036\u0003"+
		"\u0037\u0005\u0037\u02db\n\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003"+
		"8\u00038\u00038\u00038\u00038\u00039\u00039\u00059\u02e7\n9\u00039\u0006"+
		"9\u02ea\n9\r9\u000e9\u02eb\u00059\u02ee\n9\u0003:\u0003:\u0003:\u0003"+
		":\u0003:\u0003;\u0003;\u0003;\u0003;\u0003;\u0003<\u0003<\u0003<\u0003"+
		"=\u0003=\u0003=\u0003>\u0003>\u0003>\u0003>\u0003>\u0003>\u0003?\u0003"+
		"?\u0003?\u0003@\u0003@\u0003@\u0003@\u0003@\u0003A\u0003A\u0007A\u0310"+
		"\nA\fA\u000eA\u0313\u000bA\u0003A\u0005A\u0316\nA\u0003B\u0003B\u0003"+
		"B\u0003B\u0003B\u0003B\u0003C\u0003C\u0003C\u0003D\u0005D\u0322\nD\u0003"+
		"D\u0003D\u0003D\u0003E\u0003E\u0005E\u0329\nE\u0003E\u0003E\u0003F\u0003"+
		"F\u0003F\u0003F\u0006F\u0331\nF\rF\u000eF\u0332\u0003G\u0003G\u0003H\u0003"+
		"H\u0003I\u0003I\u0003I\u0007I\u033c\nI\fI\u000eI\u033f\u000bI\u0003J\u0003"+
		"J\u0003J\u0005J\u0344\nJ\u0003K\u0003K\u0003K\u0005K\u0349\nK\u0003K\u0003"+
		"K\u0006K\u034d\nK\rK\u000eK\u034e\u0003K\u0003K\u0005K\u0353\nK\u0003"+
		"L\u0003L\u0003L\u0003L\u0003M\u0003M\u0003M\u0006M\u035c\nM\rM\u000eM"+
		"\u035d\u0003N\u0003N\u0003N\u0007N\u0363\nN\fN\u000eN\u0366\u000bN\u0003"+
		"O\u0003O\u0005O\u036a\nO\u0003O\u0003O\u0005O\u036e\nO\u0003P\u0003P\u0005"+
		"P\u0372\nP\u0003P\u0003P\u0005P\u0376\nP\u0003P\u0003P\u0003P\u0003P\u0003"+
		"P\u0005P\u037d\nP\u0003P\u0003P\u0003P\u0003P\u0005P\u0383\nP\u0003P\u0003"+
		"P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003"+
		"P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0003P\u0005P\u0399"+
		"\nP\u0003Q\u0003Q\u0003Q\u0007Q\u039e\nQ\fQ\u000eQ\u03a1\u000bQ\u0003"+
		"Q\u0005Q\u03a4\nQ\u0003R\u0003R\u0003R\u0005R\u03a9\nR\u0003S\u0003S\u0005"+
		"S\u03ad\nS\u0003S\u0003S\u0005S\u03b1\nS\u0003S\u0005S\u03b4\nS\u0003"+
		"T\u0005T\u03b7\nT\u0003T\u0003T\u0003U\u0003U\u0007U\u03bd\nU\fU\u000e"+
		"U\u03c0\u000bU\u0003U\u0003U\u0003U\u0003U\u0007U\u03c6\nU\fU\u000eU\u03c9"+
		"\u000bU\u0003U\u0003U\u0003U\u0005U\u03ce\nU\u0003U\u0003U\u0005U\u03d2"+
		"\nU\u0003V\u0003V\u0005V\u03d6\nV\u0003V\u0003V\u0003V\u0005V\u03db\n"+
		"V\u0003V\u0005V\u03de\nV\u0003W\u0003W\u0003W\u0005W\u03e3\nW\u0003X\u0003"+
		"X\u0005X\u03e7\nX\u0003X\u0005X\u03ea\nX\u0003Y\u0003Y\u0003Y\u0003Y\u0003"+
		"Y\u0007Y\u03f1\nY\fY\u000eY\u03f4\u000bY\u0003Y\u0005Y\u03f7\nY\u0003"+
		"Y\u0003Y\u0005Y\u03fb\nY\u0003Z\u0003Z\u0003Z\u0003Z\u0005Z\u0401\nZ\u0003"+
		"[\u0003[\u0003[\u0003[\u0003[\u0003[\u0003[\u0006[\u040a\n[\r[\u000e["+
		"\u040b\u0003[\u0003[\u0005[\u0410\n[\u0003[\u0006[\u0413\n[\r[\u000e["+
		"\u0414\u0003[\u0005[\u0418\n[\u0003\\\u0003\\\u0005\\\u041c\n\\\u0003"+
		"\\\u0003\\\u0003\\\u0005\\\u0421\n\\\u0003\\\u0005\\\u0424\n\\\u0003]"+
		"\u0003]\u0003]\u0007]\u0429\n]\f]\u000e]\u042c\u000b]\u0003^\u0006^\u042f"+
		"\n^\r^\u000e^\u0430\u0003_\u0003_\u0003_\u0003_\u0003_\u0003_\u0003_\u0003"+
		"_\u0003_\u0003_\u0003_\u0003_\u0005_\u043f\n_\u0003`\u0003`\u0003`\u0003"+
		"`\u0003`\u0003`\u0003`\u0003`\u0003`\u0003`\u0003`\u0003`\u0005`\u044d"+
		"\n`\u0003a\u0003a\u0003a\u0007a\u0452\na\fa\u000ea\u0455\u000ba\u0003"+
		"a\u0003a\u0003b\u0003b\u0003b\u0003b\u0003b\u0003b\u0003b\u0005b\u0460"+
		"\nb\u0003b\u0003b\u0003b\u0003b\u0003b\u0003b\u0005b\u0468\nb\u0003c\u0003"+
		"c\u0003c\u0003c\u0003c\u0005c\u046f\nc\u0003c\u0003c\u0003c\u0003d\u0003"+
		"d\u0003d\u0003d\u0003d\u0003d\u0005d\u047a\nd\u0003d\u0003d\u0005d\u047e"+
		"\nd\u0003d\u0003d\u0005d\u0482\nd\u0003d\u0003d\u0003d\u0003e\u0003e\u0003"+
		"e\u0003e\u0003e\u0003e\u0003f\u0003f\u0003f\u0003f\u0003f\u0003f\u0003"+
		"f\u0003f\u0003g\u0003g\u0003g\u0003g\u0005g\u0499\ng\u0003h\u0003h\u0003"+
		"h\u0003h\u0003h\u0003h\u0003h\u0003h\u0003h\u0003h\u0005h\u04a5\nh\u0003"+
		"h\u0005h\u04a8\nh\u0003i\u0003i\u0003i\u0007i\u04ad\ni\fi\u000ei\u04b0"+
		"\u000bi\u0003j\u0003j\u0003j\u0003j\u0003j\u0005j\u04b7\nj\u0003k\u0003"+
		"k\u0003l\u0003l\u0003l\u0005l\u04be\nl\u0003l\u0003l\u0005l\u04c2\nl\u0003"+
		"m\u0003m\u0003n\u0003n\u0003n\u0007n\u04c9\nn\fn\u000en\u04cc\u000bn\u0003"+
		"o\u0003o\u0003o\u0007o\u04d1\no\fo\u000eo\u04d4\u000bo\u0003p\u0003p\u0003"+
		"p\u0007p\u04d9\np\fp\u000ep\u04dc\u000bp\u0003q\u0003q\u0003q\u0007q\u04e1"+
		"\nq\fq\u000eq\u04e4\u000bq\u0003r\u0003r\u0003r\u0007r\u04e9\nr\fr\u000e"+
		"r\u04ec\u000br\u0003s\u0003s\u0003s\u0007s\u04f1\ns\fs\u000es\u04f4\u000b"+
		"s\u0003t\u0003t\u0003t\u0007t\u04f9\nt\ft\u000et\u04fc\u000bt\u0003u\u0003"+
		"u\u0003u\u0007u\u0501\nu\fu\u000eu\u0504\u000bu\u0003v\u0003v\u0003v\u0007"+
		"v\u0509\nv\fv\u000ev\u050c\u000bv\u0003w\u0003w\u0003w\u0007w\u0511\n"+
		"w\fw\u000ew\u0514\u000bw\u0003x\u0003x\u0003x\u0003x\u0003x\u0003x\u0005"+
		"x\u051c\nx\u0003y\u0003y\u0003y\u0003y\u0003y\u0003y\u0003y\u0003y\u0003"+
		"y\u0003y\u0003y\u0003y\u0003y\u0003y\u0005y\u052c\ny\u0005y\u052e\ny\u0003"+
		"z\u0003z\u0003{\u0003{\u0003{\u0003{\u0003{\u0003{\u0003{\u0005{\u0539"+
		"\n{\u0003{\u0003{\u0003{\u0003{\u0003{\u0003{\u0003{\u0007{\u0542\n{\f"+
		"{\u000e{\u0545\u000b{\u0003|\u0003|\u0003|\u0007|\u054a\n|\f|\u000e|\u054d"+
		"\u000b|\u0003}\u0003}\u0003~\u0003~\u0003~\u0002\u0002\u007f\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0030\u0032\u0034\u00368:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u0002\u0011\u0003\u0002\u0087\u0088\u0005\u0002\r\r\u0010\u0010"+
		"\u0012\u0013\u0004\u0002||\u0080\u0080\u0005\u0002\u001f /\u0030\u0034"+
		"\u0035\u0003\u0002FG\u0007\u0002\u001c\u001c**\u0036\u0036;;>>\u0004\u0002"+
		"<<??\u0004\u0002SSlu\u0004\u0002ZZ]]\u0004\u0002TU[\\\u0003\u0002jk\u0003"+
		"\u0002bc\u0004\u0002deii\u0005\u0002VWcdff\u0004\u0002\u0081\u0081\u0083"+
		"\u0086\u05c7\u0002\u00fd\u0003\u0002\u0002\u0002\u0004\u010f\u0003\u0002"+
		"\u0002\u0002\u0006\u0111\u0003\u0002\u0002\u0002\b\u0113\u0003\u0002\u0002"+
		"\u0002\n\u0124\u0003\u0002\u0002\u0002\f\u0136\u0003\u0002\u0002\u0002"+
		"\u000e\u0144\u0003\u0002\u0002\u0002\u0010\u014e\u0003\u0002\u0002\u0002"+
		"\u0012\u015d\u0003\u0002\u0002\u0002\u0014\u0161\u0003\u0002\u0002\u0002"+
		"\u0016\u0165\u0003\u0002\u0002\u0002\u0018\u016d\u0003\u0002\u0002\u0002"+
		"\u001a\u0171\u0003\u0002\u0002\u0002\u001c\u0179\u0003\u0002\u0002\u0002"+
		"\u001e\u0182\u0003\u0002\u0002\u0002 \u0186\u0003\u0002\u0002\u0002\""+
		"\u019e\u0003\u0002\u0002\u0002$\u01a6\u0003\u0002\u0002\u0002&\u01a8\u0003"+
		"\u0002\u0002\u0002(\u01aa\u0003\u0002\u0002\u0002*\u01ac\u0003\u0002\u0002"+
		"\u0002,\u01ae\u0003\u0002\u0002\u0002.\u01d4\u0003\u0002\u0002\u0002\u0030"+
		"\u01d6\u0003\u0002\u0002\u0002\u0032\u01dc\u0003\u0002\u0002\u0002\u0034"+
		"\u01e0\u0003\u0002\u0002\u0002\u0036\u01e3\u0003\u0002\u0002\u00028\u01e7"+
		"\u0003\u0002\u0002\u0002:\u01f1\u0003\u0002\u0002\u0002<\u01f5\u0003\u0002"+
		"\u0002\u0002>\u01f8\u0003\u0002\u0002\u0002@\u01fc\u0003\u0002\u0002\u0002"+
		"B\u0210\u0003\u0002\u0002\u0002D\u0213\u0003\u0002\u0002\u0002F\u021e"+
		"\u0003\u0002\u0002\u0002H\u0220\u0003\u0002\u0002\u0002J\u022c\u0003\u0002"+
		"\u0002\u0002L\u022e\u0003\u0002\u0002\u0002N\u023a\u0003\u0002\u0002\u0002"+
		"P\u023c\u0003\u0002\u0002\u0002R\u025c\u0003\u0002\u0002\u0002T\u0261"+
		"\u0003\u0002\u0002\u0002V\u0263\u0003\u0002\u0002\u0002X\u0276\u0003\u0002"+
		"\u0002\u0002Z\u0278\u0003\u0002\u0002\u0002\\\u027e\u0003\u0002\u0002"+
		"\u0002^\u028f\u0003\u0002\u0002\u0002`\u02aa\u0003\u0002\u0002\u0002b"+
		"\u02ac\u0003\u0002\u0002\u0002d\u02be\u0003\u0002\u0002\u0002f\u02c7\u0003"+
		"\u0002\u0002\u0002h\u02cf\u0003\u0002\u0002\u0002j\u02d7\u0003\u0002\u0002"+
		"\u0002l\u02da\u0003\u0002\u0002\u0002n\u02df\u0003\u0002\u0002\u0002p"+
		"\u02ed\u0003\u0002\u0002\u0002r\u02ef\u0003\u0002\u0002\u0002t\u02f4\u0003"+
		"\u0002\u0002\u0002v\u02f9\u0003\u0002\u0002\u0002x\u02fc\u0003\u0002\u0002"+
		"\u0002z\u02ff\u0003\u0002\u0002\u0002|\u0305\u0003\u0002\u0002\u0002~"+
		"\u0308\u0003\u0002\u0002\u0002\u0080\u030d\u0003\u0002\u0002\u0002\u0082"+
		"\u0317\u0003\u0002\u0002\u0002\u0084\u031d\u0003\u0002\u0002\u0002\u0086"+
		"\u0321\u0003\u0002\u0002\u0002\u0088\u0326\u0003\u0002\u0002\u0002\u008a"+
		"\u0330\u0003\u0002\u0002\u0002\u008c\u0334\u0003\u0002\u0002\u0002\u008e"+
		"\u0336\u0003\u0002\u0002\u0002\u0090\u0338\u0003\u0002\u0002\u0002\u0092"+
		"\u0340\u0003\u0002\u0002\u0002\u0094\u0345\u0003\u0002\u0002\u0002\u0096"+
		"\u0354\u0003\u0002\u0002\u0002\u0098\u035b\u0003\u0002\u0002\u0002\u009a"+
		"\u035f\u0003\u0002\u0002\u0002\u009c\u036d\u0003\u0002\u0002\u0002\u009e"+
		"\u0398\u0003\u0002\u0002\u0002\u00a0\u039a\u0003\u0002\u0002\u0002\u00a2"+
		"\u03a5\u0003\u0002\u0002\u0002\u00a4\u03b3\u0003\u0002\u0002\u0002\u00a6"+
		"\u03b6\u0003\u0002\u0002\u0002\u00a8\u03d1\u0003\u0002\u0002\u0002\u00aa"+
		"\u03dd\u0003\u0002\u0002\u0002\u00ac\u03df\u0003\u0002\u0002\u0002\u00ae"+
		"\u03e4\u0003\u0002\u0002\u0002\u00b0\u03fa\u0003\u0002\u0002\u0002\u00b2"+
		"\u0400\u0003\u0002\u0002\u0002\u00b4\u0417\u0003\u0002\u0002\u0002\u00b6"+
		"\u0423\u0003\u0002\u0002\u0002\u00b8\u0425\u0003\u0002\u0002\u0002\u00ba"+
		"\u042e\u0003\u0002\u0002\u0002\u00bc\u043e\u0003\u0002\u0002\u0002\u00be"+
		"\u044c\u0003\u0002\u0002\u0002\u00c0\u044e\u0003\u0002\u0002\u0002\u00c2"+
		"\u0467\u0003\u0002\u0002\u0002\u00c4\u0469\u0003\u0002\u0002\u0002\u00c6"+
		"\u0473\u0003\u0002\u0002\u0002\u00c8\u0486\u0003\u0002\u0002\u0002\u00ca"+
		"\u048c\u0003\u0002\u0002\u0002\u00cc\u0498\u0003\u0002\u0002\u0002\u00ce"+
		"\u04a7\u0003\u0002\u0002\u0002\u00d0\u04a9\u0003\u0002\u0002\u0002\u00d2"+
		"\u04b6\u0003\u0002\u0002\u0002\u00d4\u04b8\u0003\u0002\u0002\u0002\u00d6"+
		"\u04ba\u0003\u0002\u0002\u0002\u00d8\u04c3\u0003\u0002\u0002\u0002\u00da"+
		"\u04c5\u0003\u0002\u0002\u0002\u00dc\u04cd\u0003\u0002\u0002\u0002\u00de"+
		"\u04d5\u0003\u0002\u0002\u0002\u00e0\u04dd\u0003\u0002\u0002\u0002\u00e2"+
		"\u04e5\u0003\u0002\u0002\u0002\u00e4\u04ed\u0003\u0002\u0002\u0002\u00e6"+
		"\u04f5\u0003\u0002\u0002\u0002\u00e8\u04fd\u0003\u0002\u0002\u0002\u00ea"+
		"\u0505\u0003\u0002\u0002\u0002\u00ec\u050d\u0003\u0002\u0002\u0002\u00ee"+
		"\u051b\u0003\u0002\u0002\u0002\u00f0\u052d\u0003\u0002\u0002\u0002\u00f2"+
		"\u052f\u0003\u0002\u0002\u0002\u00f4\u0531\u0003\u0002\u0002\u0002\u00f6"+
		"\u0546\u0003\u0002\u0002\u0002\u00f8\u054e\u0003\u0002\u0002\u0002\u00fa"+
		"\u0550\u0003\u0002\u0002\u0002\u00fc\u00fe\u0005\u0004\u0003\u0002\u00fd"+
		"\u00fc\u0003\u0002\u0002\u0002\u00fe\u00ff\u0003\u0002\u0002\u0002\u00ff"+
		"\u00fd\u0003\u0002\u0002\u0002\u00ff\u0100\u0003\u0002\u0002\u0002\u0100"+
		"\u0101\u0003\u0002\u0002\u0002\u0101\u0102\u0007\u0002\u0002\u0003\u0102"+
		"\u0003\u0003\u0002\u0002\u0002\u0103\u0110\u0007\u008b\u0002\u0002\u0104"+
		"\u0110\u0007\u008c\u0002\u0002\u0105\u0110\u0005\u0006\u0004\u0002\u0106"+
		"\u0110\u0005\u0086D\u0002\u0107\u0110\u0005\u0088E\u0002\u0108\u0110\u0005"+
		"\b\u0005\u0002\u0109\u0110\u0005\f\u0007\u0002\u010a\u0110\u0005\n\u0006"+
		"\u0002\u010b\u0110\u0005\u000e\b\u0002\u010c\u0110\u0005\u0010\t\u0002"+
		"\u010d\u0110\u0005\u0012\n\u0002\u010e\u0110\u0005\u0014\u000b\u0002\u010f"+
		"\u0103\u0003\u0002\u0002\u0002\u010f\u0104\u0003\u0002\u0002\u0002\u010f"+
		"\u0105\u0003\u0002\u0002\u0002\u010f\u0106\u0003\u0002\u0002\u0002\u010f"+
		"\u0107\u0003\u0002\u0002\u0002\u010f\u0108\u0003\u0002\u0002\u0002\u010f"+
		"\u0109\u0003\u0002\u0002\u0002\u010f\u010a\u0003\u0002\u0002\u0002\u010f"+
		"\u010b\u0003\u0002\u0002\u0002\u010f\u010c\u0003\u0002\u0002\u0002\u010f"+
		"\u010d\u0003\u0002\u0002\u0002\u010f\u010e\u0003\u0002\u0002\u0002\u0110"+
		"\u0005\u0003\u0002\u0002\u0002\u0111\u0112\t\u0002\u0002\u0002\u0112\u0007"+
		"\u0003\u0002\u0002\u0002\u0113\u0114\u0007\f\u0002\u0002\u0114\u0117\u0005"+
		"&\u0014\u0002\u0115\u0116\u0007Y\u0002\u0002\u0116\u0118\u0005(\u0015"+
		"\u0002\u0117\u0115\u0003\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002"+
		"\u0002\u0118\u011a\u0003\u0002\u0002\u0002\u0119\u011b\u0005\u0018\r\u0002"+
		"\u011a\u0119\u0003\u0002\u0002\u0002\u011a\u011b\u0003\u0002\u0002\u0002"+
		"\u011b\u011d\u0003\u0002\u0002\u0002\u011c\u011e\u0005.\u0018\u0002\u011d"+
		"\u011c\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002\u0002\u011e"+
		"\u0120\u0003\u0002\u0002\u0002\u011f\u0121\u0005\u0032\u001a\u0002\u0120"+
		"\u011f\u0003\u0002\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121"+
		"\u0122\u0003\u0002\u0002\u0002\u0122\u0123\u0007\t\u0002\u0002\u0123\t"+
		"\u0003\u0002\u0002\u0002\u0124\u0125\u0007\f\u0002\u0002\u0125\u0126\u0005"+
		"&\u0014\u0002\u0126\u0128\u0007H\u0002\u0002\u0127\u0129\u0005*\u0016"+
		"\u0002\u0128\u0127\u0003\u0002\u0002\u0002\u0128\u0129\u0003\u0002\u0002"+
		"\u0002\u0129\u012a\u0003\u0002\u0002\u0002\u012a\u012c\u0007I\u0002\u0002"+
		"\u012b\u012d\u0005\u0018\r\u0002\u012c\u012b\u0003\u0002\u0002\u0002\u012c"+
		"\u012d\u0003\u0002\u0002\u0002\u012d\u012f\u0003\u0002\u0002\u0002\u012e"+
		"\u0130\u0005.\u0018\u0002\u012f\u012e\u0003\u0002\u0002\u0002\u012f\u0130"+
		"\u0003\u0002\u0002\u0002\u0130\u0132\u0003\u0002\u0002\u0002\u0131\u0133"+
		"\u0005\u0032\u001a\u0002\u0132\u0131\u0003\u0002\u0002\u0002\u0132\u0133"+
		"\u0003\u0002\u0002\u0002\u0133\u0134\u0003\u0002\u0002\u0002\u0134\u0135"+
		"\u0007\t\u0002\u0002\u0135\u000b\u0003\u0002\u0002\u0002\u0136\u0137\u0007"+
		"\u000b\u0002\u0002\u0137\u013a\u0005&\u0014\u0002\u0138\u0139\u0007Y\u0002"+
		"\u0002\u0139\u013b\u0005(\u0015\u0002\u013a\u0138\u0003\u0002\u0002\u0002"+
		"\u013a\u013b\u0003\u0002\u0002\u0002\u013b\u013d\u0003\u0002\u0002\u0002"+
		"\u013c\u013e\u0005.\u0018\u0002\u013d\u013c\u0003\u0002\u0002\u0002\u013d"+
		"\u013e\u0003\u0002\u0002\u0002\u013e\u0140\u0003\u0002\u0002\u0002\u013f"+
		"\u0141\u0005:\u001e\u0002\u0140\u013f\u0003\u0002\u0002\u0002\u0140\u0141"+
		"\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0143"+
		"\u0007\t\u0002\u0002\u0143\r\u0003\u0002\u0002\u0002\u0144\u0145\u0007"+
		"\u000b\u0002\u0002\u0145\u0146\u0005&\u0014\u0002\u0146\u0147\u0007H\u0002"+
		"\u0002\u0147\u0148\u0005*\u0016\u0002\u0148\u014a\u0007I\u0002\u0002\u0149"+
		"\u014b\u0005:\u001e\u0002\u014a\u0149\u0003\u0002\u0002\u0002\u014a\u014b"+
		"\u0003\u0002\u0002\u0002\u014b\u014c\u0003\u0002\u0002\u0002\u014c\u014d"+
		"\u0007\t\u0002\u0002\u014d\u000f\u0003\u0002\u0002\u0002\u014e\u014f\u0007"+
		"\u000e\u0002\u0002\u014f\u0151\u0005,\u0017\u0002\u0150\u0152\u0005\u0018"+
		"\r\u0002\u0151\u0150\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002"+
		"\u0002\u0152\u0158\u0003\u0002\u0002\u0002\u0153\u0157\u0005\u0032\u001a"+
		"\u0002\u0154\u0157\u0007\u000f\u0002\u0002\u0155\u0157\u0007\u0003\u0002"+
		"\u0002\u0156\u0153\u0003\u0002\u0002\u0002\u0156\u0154\u0003\u0002\u0002"+
		"\u0002\u0156\u0155\u0003\u0002\u0002\u0002\u0157\u015a\u0003\u0002\u0002"+
		"\u0002\u0158\u0156\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002"+
		"\u0002\u0159\u015b\u0003\u0002\u0002\u0002\u015a\u0158\u0003\u0002\u0002"+
		"\u0002\u015b\u015c\u0007\t\u0002\u0002\u015c\u0011\u0003\u0002\u0002\u0002"+
		"\u015d\u015e\u0007\u000e\u0002\u0002\u015e\u015f\u0005\u001a\u000e\u0002"+
		"\u015f\u0160\u0007N\u0002\u0002\u0160\u0013\u0003\u0002\u0002\u0002\u0161"+
		"\u0162\u0007\u0006\u0002\u0002\u0162\u0163\u0005\u0016\f\u0002\u0163\u0164"+
		"\u0007N\u0002\u0002\u0164\u0015\u0003\u0002\u0002\u0002\u0165\u016a\u0005"+
		"&\u0014\u0002\u0166\u0167\u0007O\u0002\u0002\u0167\u0169\u0005&\u0014"+
		"\u0002\u0168\u0166\u0003\u0002\u0002\u0002\u0169\u016c\u0003\u0002\u0002"+
		"\u0002\u016a\u0168\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002"+
		"\u0002\u016b\u0017\u0003\u0002\u0002\u0002\u016c\u016a\u0003\u0002\u0002"+
		"\u0002\u016d\u016e\u0007U\u0002\u0002\u016e\u016f\u0005\u001a\u000e\u0002"+
		"\u016f\u0170\u0007T\u0002\u0002\u0170\u0019\u0003\u0002\u0002\u0002\u0171"+
		"\u0176\u0005,\u0017\u0002\u0172\u0173\u0007O\u0002\u0002\u0173\u0175\u0005"+
		",\u0017\u0002\u0174\u0172\u0003\u0002\u0002\u0002\u0175\u0178\u0003\u0002"+
		"\u0002\u0002\u0176\u0174\u0003\u0002\u0002\u0002\u0176\u0177\u0003\u0002"+
		"\u0002\u0002\u0177\u001b\u0003\u0002\u0002\u0002\u0178\u0176\u0003\u0002"+
		"\u0002\u0002\u0179\u017b\u0007\u0011\u0002\u0002\u017a\u017c\u0005\u001e"+
		"\u0010\u0002\u017b\u017a\u0003\u0002\u0002\u0002\u017b\u017c\u0003\u0002"+
		"\u0002\u0002\u017c\u017e\u0003\u0002\u0002\u0002\u017d\u017f\u0005$\u0013"+
		"\u0002\u017e\u017d\u0003\u0002\u0002\u0002\u017e\u017f\u0003\u0002\u0002"+
		"\u0002\u017f\u0180\u0003\u0002\u0002\u0002\u0180\u0181\u0005\u0096L\u0002"+
		"\u0181\u001d\u0003\u0002\u0002\u0002\u0182\u0183\u0007H\u0002\u0002\u0183"+
		"\u0184\u0005 \u0011\u0002\u0184\u0185\u0007I\u0002\u0002\u0185\u001f\u0003"+
		"\u0002\u0002\u0002\u0186\u018b\u0005\"\u0012\u0002\u0187\u0188\u0007O"+
		"\u0002\u0002\u0188\u018a\u0005\"\u0012\u0002\u0189\u0187\u0003\u0002\u0002"+
		"\u0002\u018a\u018d\u0003\u0002\u0002\u0002\u018b\u0189\u0003\u0002\u0002"+
		"\u0002\u018b\u018c\u0003\u0002\u0002\u0002\u018c!\u0003\u0002\u0002\u0002"+
		"\u018d\u018b\u0003\u0002\u0002\u0002\u018e\u019f\u0007y\u0002\u0002\u018f"+
		"\u019f\u0007w\u0002\u0002\u0190\u019f\u0007\u007f\u0002\u0002\u0191\u019f"+
		"\u0007{\u0002\u0002\u0192\u019f\u0007|\u0002\u0002\u0193\u019f\u0007}"+
		"\u0002\u0002\u0194\u019f\u0007~\u0002\u0002\u0195\u019f\u0003\u0002\u0002"+
		"\u0002\u0196\u0197\u0007x\u0002\u0002\u0197\u0198\u0007S\u0002\u0002\u0198"+
		"\u019f\u0007\u0080\u0002\u0002\u0199\u019a\u0007z\u0002\u0002\u019a\u019b"+
		"\u0007S\u0002\u0002\u019b\u019c\u0007\u0080\u0002\u0002\u019c\u019f\u0007"+
		"Y\u0002\u0002\u019d\u019f\u0007\u0080\u0002\u0002\u019e\u018e\u0003\u0002"+
		"\u0002\u0002\u019e\u018f\u0003\u0002\u0002\u0002\u019e\u0190\u0003\u0002"+
		"\u0002\u0002\u019e\u0191\u0003\u0002\u0002\u0002\u019e\u0192\u0003\u0002"+
		"\u0002\u0002\u019e\u0193\u0003\u0002\u0002\u0002\u019e\u0194\u0003\u0002"+
		"\u0002\u0002\u019e\u0195\u0003\u0002\u0002\u0002\u019e\u0196\u0003\u0002"+
		"\u0002\u0002\u019e\u0199\u0003\u0002\u0002\u0002\u019e\u019d\u0003\u0002"+
		"\u0002\u0002\u019f#\u0003\u0002\u0002\u0002\u01a0\u01a1\u0007\u0080\u0002"+
		"\u0002\u01a1\u01a2\u0007H\u0002\u0002\u01a2\u01a3\u0005&\u0014\u0002\u01a3"+
		"\u01a4\u0007I\u0002\u0002\u01a4\u01a7\u0003\u0002\u0002\u0002\u01a5\u01a7"+
		"\u0007\u0080\u0002\u0002\u01a6\u01a0\u0003\u0002\u0002\u0002\u01a6\u01a5"+
		"\u0003\u0002\u0002\u0002\u01a7%\u0003\u0002\u0002\u0002\u01a8\u01a9\u0007"+
		"\u0080\u0002\u0002\u01a9\'\u0003\u0002\u0002\u0002\u01aa\u01ab\u0007\u0080"+
		"\u0002\u0002\u01ab)\u0003\u0002\u0002\u0002\u01ac\u01ad\u0007\u0080\u0002"+
		"\u0002\u01ad+\u0003\u0002\u0002\u0002\u01ae\u01af\u0007\u0080\u0002\u0002"+
		"\u01af-\u0003\u0002\u0002\u0002\u01b0\u01b4\u0007J\u0002\u0002\u01b1\u01b3"+
		"\u0005\u0096L\u0002\u01b2\u01b1\u0003\u0002\u0002\u0002\u01b3\u01b6\u0003"+
		"\u0002\u0002\u0002\u01b4\u01b2\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003"+
		"\u0002\u0002\u0002\u01b5\u01b7\u0003\u0002\u0002\u0002\u01b6\u01b4\u0003"+
		"\u0002\u0002\u0002\u01b7\u01d5\u0007K\u0002\u0002\u01b8\u01b9\u0007J\u0002"+
		"\u0002\u01b9\u01bb\u0005\u0030\u0019\u0002\u01ba\u01bc\u0005\u0096L\u0002"+
		"\u01bb\u01ba\u0003\u0002\u0002\u0002\u01bc\u01bd\u0003\u0002\u0002\u0002"+
		"\u01bd\u01bb\u0003\u0002\u0002\u0002\u01bd\u01be\u0003\u0002\u0002\u0002"+
		"\u01be\u01bf\u0003\u0002\u0002\u0002\u01bf\u01c0\u0007K\u0002\u0002\u01c0"+
		"\u01d5\u0003\u0002\u0002\u0002\u01c1\u01c3\u0007J\u0002\u0002\u01c2\u01c4"+
		"\u0005\u0096L\u0002\u01c3\u01c2\u0003\u0002\u0002\u0002\u01c4\u01c5\u0003"+
		"\u0002\u0002\u0002\u01c5\u01c3\u0003\u0002\u0002\u0002\u01c5\u01c6\u0003"+
		"\u0002\u0002\u0002\u01c6\u01c7\u0003\u0002\u0002\u0002\u01c7\u01c8\u0005"+
		".\u0018\u0002\u01c8\u01c9\u0007K\u0002\u0002\u01c9\u01d5\u0003\u0002\u0002"+
		"\u0002\u01ca\u01cb\u0007J\u0002\u0002\u01cb\u01cd\u0005\u0030\u0019\u0002"+
		"\u01cc\u01ce\u0005\u0096L\u0002\u01cd\u01cc\u0003\u0002\u0002\u0002\u01ce"+
		"\u01cf\u0003\u0002\u0002\u0002\u01cf\u01cd\u0003\u0002\u0002\u0002\u01cf"+
		"\u01d0\u0003\u0002\u0002\u0002\u01d0\u01d1\u0003\u0002\u0002\u0002\u01d1"+
		"\u01d2\u0005.\u0018\u0002\u01d2\u01d3\u0007K\u0002\u0002\u01d3\u01d5\u0003"+
		"\u0002\u0002\u0002\u01d4\u01b0\u0003\u0002\u0002\u0002\u01d4\u01b8\u0003"+
		"\u0002\u0002\u0002\u01d4\u01c1\u0003\u0002\u0002\u0002\u01d4\u01ca\u0003"+
		"\u0002\u0002\u0002\u01d5/\u0003\u0002\u0002\u0002\u01d6\u01d7\t\u0003"+
		"\u0002\u0002\u01d7\u0031\u0003\u0002\u0002\u0002\u01d8\u01dd\u0005\u0088"+
		"E\u0002\u01d9\u01dd\u0005\u0034\u001b\u0002\u01da\u01dd\u0005\u0036\u001c"+
		"\u0002\u01db\u01dd\u0005\u001c\u000f\u0002\u01dc\u01d8\u0003\u0002\u0002"+
		"\u0002\u01dc\u01d9\u0003\u0002\u0002\u0002\u01dc\u01da\u0003\u0002\u0002"+
		"\u0002\u01dc\u01db\u0003\u0002\u0002\u0002\u01dd\u01de\u0003\u0002\u0002"+
		"\u0002\u01de\u01dc\u0003\u0002\u0002\u0002\u01de\u01df\u0003\u0002\u0002"+
		"\u0002\u01df\u0033\u0003\u0002\u0002\u0002\u01e0\u01e1\u0007b\u0002\u0002"+
		"\u01e1\u01e2\u00058\u001d\u0002\u01e2\u0035\u0003\u0002\u0002\u0002\u01e3"+
		"\u01e4\u0007c\u0002\u0002\u01e4\u01e5\u00058\u001d\u0002\u01e5\u0037\u0003"+
		"\u0002\u0002\u0002\u01e6\u01e8\u0005H%\u0002\u01e7\u01e6\u0003\u0002\u0002"+
		"\u0002\u01e7\u01e8\u0003\u0002\u0002\u0002\u01e8\u01e9\u0003\u0002\u0002"+
		"\u0002\u01e9\u01ea\u0005B\"\u0002\u01ea\u01eb\u0007N\u0002\u0002\u01eb"+
		"9\u0003\u0002\u0002\u0002\u01ec\u01f2\u0005\u0086D\u0002\u01ed\u01f2\u0005"+
		"\u0088E\u0002\u01ee\u01f2\u0005<\u001f\u0002\u01ef\u01f2\u0005> \u0002"+
		"\u01f0\u01f2\u0005J&\u0002\u01f1\u01ec\u0003\u0002\u0002\u0002\u01f1\u01ed"+
		"\u0003\u0002\u0002\u0002\u01f1\u01ee\u0003\u0002\u0002\u0002\u01f1\u01ef"+
		"\u0003\u0002\u0002\u0002\u01f1\u01f0\u0003\u0002\u0002\u0002\u01f2\u01f3"+
		"\u0003\u0002\u0002\u0002\u01f3\u01f1\u0003\u0002\u0002\u0002\u01f3\u01f4"+
		"\u0003\u0002\u0002\u0002\u01f4;\u0003\u0002\u0002\u0002\u01f5\u01f6\u0007"+
		"b\u0002\u0002\u01f6\u01f7\u0005@!\u0002\u01f7=\u0003\u0002\u0002\u0002"+
		"\u01f8\u01f9\u0007c\u0002\u0002\u01f9\u01fa\u0005@!\u0002\u01fa?\u0003"+
		"\u0002\u0002\u0002\u01fb\u01fd\u0005H%\u0002\u01fc\u01fb\u0003\u0002\u0002"+
		"\u0002\u01fc\u01fd\u0003\u0002\u0002\u0002\u01fd\u01fe\u0003\u0002\u0002"+
		"\u0002\u01fe\u0200\u0005B\"\u0002\u01ff\u0201\u0005\u0090I\u0002\u0200"+
		"\u01ff\u0003\u0002\u0002\u0002\u0200\u0201\u0003\u0002\u0002\u0002\u0201"+
		"\u0203\u0003\u0002\u0002\u0002\u0202\u0204\u0007N\u0002\u0002\u0203\u0202"+
		"\u0003\u0002\u0002\u0002\u0203\u0204\u0003\u0002\u0002\u0002\u0204\u0205"+
		"\u0003\u0002\u0002\u0002\u0205\u0206\u0005\u00c0a\u0002\u0206A\u0003\u0002"+
		"\u0002\u0002\u0207\u0211\u0005F$\u0002\u0208\u020a\u0005D#\u0002\u0209"+
		"\u0208\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b"+
		"\u0209\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c"+
		"\u020e\u0003\u0002\u0002\u0002\u020d\u020f\u0005\u00acW\u0002\u020e\u020d"+
		"\u0003\u0002\u0002\u0002\u020e\u020f\u0003\u0002\u0002\u0002\u020f\u0211"+
		"\u0003\u0002\u0002\u0002\u0210\u0207\u0003\u0002\u0002\u0002\u0210\u0209"+
		"\u0003\u0002\u0002\u0002\u0211C\u0003\u0002\u0002\u0002\u0212\u0214\u0005"+
		"F$\u0002\u0213\u0212\u0003\u0002\u0002\u0002\u0213\u0214\u0003\u0002\u0002"+
		"\u0002\u0214\u0215\u0003\u0002\u0002\u0002\u0215\u0219\u0007Y\u0002\u0002"+
		"\u0216\u0218\u0005H%\u0002\u0217\u0216\u0003\u0002\u0002\u0002\u0218\u021b"+
		"\u0003\u0002\u0002\u0002\u0219\u0217\u0003\u0002\u0002\u0002\u0219\u021a"+
		"\u0003\u0002\u0002\u0002\u021a\u021c\u0003\u0002\u0002\u0002\u021b\u0219"+
		"\u0003\u0002\u0002\u0002\u021c\u021d\u0007\u0080\u0002\u0002\u021dE\u0003"+
		"\u0002\u0002\u0002\u021e\u021f\t\u0004\u0002\u0002\u021fG\u0003\u0002"+
		"\u0002\u0002\u0220\u0221\u0007H\u0002\u0002\u0221\u0222\u0005\u00b2Z\u0002"+
		"\u0222\u0223\u0007I\u0002\u0002\u0223I\u0003\u0002\u0002\u0002\u0224\u0225"+
		"\u0007\u0016\u0002\u0002\u0225\u0226\u0005L\'\u0002\u0226\u0227\u0007"+
		"N\u0002\u0002\u0227\u022d\u0003\u0002\u0002\u0002\u0228\u0229\u0007\u0007"+
		"\u0002\u0002\u0229\u022a\u0005L\'\u0002\u022a\u022b\u0007N\u0002\u0002"+
		"\u022b\u022d\u0003\u0002\u0002\u0002\u022c\u0224\u0003\u0002\u0002\u0002"+
		"\u022c\u0228\u0003\u0002\u0002\u0002\u022dK\u0003\u0002\u0002\u0002\u022e"+
		"\u0233\u0005N(\u0002\u022f\u0230\u0007O\u0002\u0002\u0230\u0232\u0005"+
		"N(\u0002\u0231\u022f\u0003\u0002\u0002\u0002\u0232\u0235\u0003\u0002\u0002"+
		"\u0002\u0233\u0231\u0003\u0002\u0002\u0002\u0233\u0234\u0003\u0002\u0002"+
		"\u0002\u0234M\u0003\u0002\u0002\u0002\u0235\u0233\u0003\u0002\u0002\u0002"+
		"\u0236\u023b\u0007\u0080\u0002\u0002\u0237\u0238\u0007\u0080\u0002\u0002"+
		"\u0238\u0239\u0007S\u0002\u0002\u0239\u023b\u0007\u0080\u0002\u0002\u023a"+
		"\u0236\u0003\u0002\u0002\u0002\u023a\u0237\u0003\u0002\u0002\u0002\u023b"+
		"O\u0003\u0002\u0002\u0002\u023c\u023d\u0005R*\u0002\u023d\u023e\u0007"+
		"H\u0002\u0002\u023e\u0240\u0007h\u0002\u0002\u023f\u0241\u0005R*\u0002"+
		"\u0240\u023f\u0003\u0002\u0002\u0002\u0240\u0241\u0003\u0002\u0002\u0002"+
		"\u0241\u0242\u0003\u0002\u0002\u0002\u0242\u0244\u0007I\u0002\u0002\u0243"+
		"\u0245\u0005b\u0032\u0002\u0244\u0243\u0003\u0002\u0002\u0002\u0244\u0245"+
		"\u0003\u0002\u0002\u0002\u0245Q\u0003\u0002\u0002\u0002\u0246\u025d\u0007"+
		"A\u0002\u0002\u0247\u025d\u0007\"\u0002\u0002\u0248\u025d\u00078\u0002"+
		"\u0002\u0249\u025d\u0007\u0032\u0002\u0002\u024a\u025d\u0007\u0033\u0002"+
		"\u0002\u024b\u025d\u0007+\u0002\u0002\u024c\u025d\u0007\'\u0002\u0002"+
		"\u024d\u025d\u00079\u0002\u0002\u024e\u025d\u0007@\u0002\u0002\u024f\u0251"+
		"\u0007-\u0002\u0002\u0250\u0252\u0005\u0018\r\u0002\u0251\u0250\u0003"+
		"\u0002\u0002\u0002\u0251\u0252\u0003\u0002\u0002\u0002\u0252\u025d\u0003"+
		"\u0002\u0002\u0002\u0253\u0255\u0005&\u0014\u0002\u0254\u0256\u0005\u0018"+
		"\r\u0002\u0255\u0254\u0003\u0002\u0002\u0002\u0255\u0256\u0003\u0002\u0002"+
		"\u0002\u0256\u025d\u0003\u0002\u0002\u0002\u0257\u025d\u0005\u0094K\u0002"+
		"\u0258\u025d\u0005\u009eP\u0002\u0259\u025d\u0007\u0080\u0002\u0002\u025a"+
		"\u025b\u0007\u0080\u0002\u0002\u025b\u025d\u0005\u00a4S\u0002\u025c\u0246"+
		"\u0003\u0002\u0002\u0002\u025c\u0247\u0003\u0002\u0002\u0002\u025c\u0248"+
		"\u0003\u0002\u0002\u0002\u025c\u0249\u0003\u0002\u0002\u0002\u025c\u024a"+
		"\u0003\u0002\u0002\u0002\u025c\u024b\u0003\u0002\u0002\u0002\u025c\u024c"+
		"\u0003\u0002\u0002\u0002\u025c\u024d\u0003\u0002\u0002\u0002\u025c\u024e"+
		"\u0003\u0002\u0002\u0002\u025c\u024f\u0003\u0002\u0002\u0002\u025c\u0253"+
		"\u0003\u0002\u0002\u0002\u025c\u0257\u0003\u0002\u0002\u0002\u025c\u0258"+
		"\u0003\u0002\u0002\u0002\u025c\u0259\u0003\u0002\u0002\u0002\u025c\u025a"+
		"\u0003\u0002\u0002\u0002\u025dS\u0003\u0002\u0002\u0002\u025e\u0262\u0007"+
		"#\u0002\u0002\u025f\u0262\u0007B\u0002\u0002\u0260\u0262\u0005V,\u0002"+
		"\u0261\u025e\u0003\u0002\u0002\u0002\u0261\u025f\u0003\u0002\u0002\u0002"+
		"\u0261\u0260\u0003\u0002\u0002\u0002\u0262U\u0003\u0002\u0002\u0002\u0263"+
		"\u0264\t\u0005\u0002\u0002\u0264W\u0003\u0002\u0002\u0002\u0265\u0277"+
		"\u0007\u0080\u0002\u0002\u0266\u0277\u0005\u00fa~\u0002\u0267\u0277\u0007"+
		"\u0082\u0002\u0002\u0268\u0269\u0007H\u0002\u0002\u0269\u026a\u0005\u00d0"+
		"i\u0002\u026a\u026b\u0007I\u0002\u0002\u026b\u0277\u0003\u0002\u0002\u0002"+
		"\u026c\u0277\u0007\u001a\u0002\u0002\u026d\u0277\u0007\u0019\u0002\u0002"+
		"\u026e\u0277\u0005f\u0034\u0002\u026f\u0277\u0005n8\u0002\u0270\u0277"+
		"\u0005r:\u0002\u0271\u0277\u0005t;\u0002\u0272\u0277\u0005\\/\u0002\u0273"+
		"\u0277\u0005^\u0030\u0002\u0274\u0277\u0005`\u0031\u0002\u0275\u0277\u0005"+
		"d\u0033\u0002\u0276\u0265\u0003\u0002\u0002\u0002\u0276\u0266\u0003\u0002"+
		"\u0002\u0002\u0276\u0267\u0003\u0002\u0002\u0002\u0276\u0268\u0003\u0002"+
		"\u0002\u0002\u0276\u026c\u0003\u0002\u0002\u0002\u0276\u026d\u0003\u0002"+
		"\u0002\u0002\u0276\u026e\u0003\u0002\u0002\u0002\u0276\u026f\u0003\u0002"+
		"\u0002\u0002\u0276\u0270\u0003\u0002\u0002\u0002\u0276\u0271\u0003\u0002"+
		"\u0002\u0002\u0276\u0272\u0003\u0002\u0002\u0002\u0276\u0273\u0003\u0002"+
		"\u0002\u0002\u0276\u0274\u0003\u0002\u0002\u0002\u0276\u0275\u0003\u0002"+
		"\u0002\u0002\u0277Y\u0003\u0002\u0002\u0002\u0278\u0279\u0005\u00f4{\u0002"+
		"\u0279\u027c\u0007Y\u0002\u0002\u027a\u027d\u0005\u00f4{\u0002\u027b\u027d"+
		"\u0005\u00d0i\u0002\u027c\u027a\u0003\u0002\u0002\u0002\u027c\u027b\u0003"+
		"\u0002\u0002\u0002\u027d[\u0003\u0002\u0002\u0002\u027e\u027f\u0007R\u0002"+
		"\u0002\u027f\u0281\u0007J\u0002\u0002\u0280\u0282\u0005Z.\u0002\u0281"+
		"\u0280\u0003\u0002\u0002\u0002\u0281\u0282\u0003\u0002\u0002\u0002\u0282"+
		"\u0287\u0003\u0002\u0002\u0002\u0283\u0284\u0007O\u0002\u0002\u0284\u0286"+
		"\u0005Z.\u0002\u0285\u0283\u0003\u0002\u0002\u0002\u0286\u0289\u0003\u0002"+
		"\u0002\u0002\u0287\u0285\u0003\u0002\u0002\u0002\u0287\u0288\u0003\u0002"+
		"\u0002\u0002\u0288\u028b\u0003\u0002\u0002\u0002\u0289\u0287\u0003\u0002"+
		"\u0002\u0002\u028a\u028c\u0007O\u0002\u0002\u028b\u028a\u0003\u0002\u0002"+
		"\u0002\u028b\u028c\u0003\u0002\u0002\u0002\u028c\u028d\u0003\u0002\u0002"+
		"\u0002\u028d\u028e\u0007K\u0002\u0002\u028e]\u0003\u0002\u0002\u0002\u028f"+
		"\u0290\u0007R\u0002\u0002\u0290\u0292\u0007L\u0002\u0002\u0291\u0293\u0005"+
		"\u00f4{\u0002\u0292\u0291\u0003\u0002\u0002\u0002\u0292\u0293\u0003\u0002"+
		"\u0002\u0002\u0293\u0298\u0003\u0002\u0002\u0002\u0294\u0295\u0007O\u0002"+
		"\u0002\u0295\u0297\u0005\u00f4{\u0002\u0296\u0294\u0003\u0002\u0002\u0002"+
		"\u0297\u029a\u0003\u0002\u0002\u0002\u0298\u0296\u0003\u0002\u0002\u0002"+
		"\u0298\u0299\u0003\u0002\u0002\u0002\u0299\u029c\u0003\u0002\u0002\u0002"+
		"\u029a\u0298\u0003\u0002\u0002\u0002\u029b\u029d\u0007O\u0002\u0002\u029c"+
		"\u029b\u0003\u0002\u0002\u0002\u029c\u029d\u0003\u0002\u0002\u0002\u029d"+
		"\u029e\u0003\u0002\u0002\u0002\u029e\u029f\u0007M\u0002\u0002\u029f_\u0003"+
		"\u0002\u0002\u0002\u02a0\u02a1\u0007R\u0002\u0002\u02a1\u02a4\u0007H\u0002"+
		"\u0002\u02a2\u02a5\u0005\u00f4{\u0002\u02a3\u02a5\u0005\u00d0i\u0002\u02a4"+
		"\u02a2\u0003\u0002\u0002\u0002\u02a4\u02a3\u0003\u0002\u0002\u0002\u02a5"+
		"\u02a6\u0003\u0002\u0002\u0002\u02a6\u02a7\u0007I\u0002\u0002\u02a7\u02ab"+
		"\u0003\u0002\u0002\u0002\u02a8\u02a9\u0007R\u0002\u0002\u02a9\u02ab\u0005"+
		"\u00fa~\u0002\u02aa\u02a0\u0003\u0002\u0002\u0002\u02aa\u02a8\u0003\u0002"+
		"\u0002\u0002\u02aba\u0003\u0002\u0002\u0002\u02ac\u02b0\u0007H\u0002\u0002"+
		"\u02ad\u02b1\u0005v<\u0002\u02ae\u02b1\u0005\u00b2Z\u0002\u02af\u02b1"+
		"\u0007A\u0002\u0002\u02b0\u02ad\u0003\u0002\u0002\u0002\u02b0\u02ae\u0003"+
		"\u0002\u0002\u0002\u02b0\u02af\u0003\u0002\u0002\u0002\u02b0\u02b1\u0003"+
		"\u0002\u0002\u0002\u02b1\u02b9\u0003\u0002\u0002\u0002\u02b2\u02b5\u0007"+
		"O\u0002\u0002\u02b3\u02b6\u0005v<\u0002\u02b4\u02b6\u0005\u00b2Z\u0002"+
		"\u02b5\u02b3\u0003\u0002\u0002\u0002\u02b5\u02b4\u0003\u0002\u0002\u0002"+
		"\u02b6\u02b8\u0003\u0002\u0002\u0002\u02b7\u02b2\u0003\u0002\u0002\u0002"+
		"\u02b8\u02bb\u0003\u0002\u0002\u0002\u02b9\u02b7\u0003\u0002\u0002\u0002"+
		"\u02b9\u02ba\u0003\u0002\u0002\u0002\u02ba\u02bc\u0003\u0002\u0002\u0002"+
		"\u02bb\u02b9\u0003\u0002\u0002\u0002\u02bc\u02bd\u0007I\u0002\u0002\u02bd"+
		"c\u0003\u0002\u0002\u0002\u02be\u02c0\u0007h\u0002\u0002\u02bf\u02c1\u0005"+
		"R*\u0002\u02c0\u02bf\u0003\u0002\u0002\u0002\u02c0\u02c1\u0003\u0002\u0002"+
		"\u0002\u02c1\u02c3\u0003\u0002\u0002\u0002\u02c2\u02c4\u0005b\u0032\u0002"+
		"\u02c3\u02c2\u0003\u0002\u0002\u0002\u02c3\u02c4\u0003\u0002\u0002\u0002"+
		"\u02c4\u02c5\u0003\u0002\u0002\u0002\u02c5\u02c6\u0005\u00c0a\u0002\u02c6"+
		"e\u0003\u0002\u0002\u0002\u02c7\u02c8\u0007L\u0002\u0002\u02c8\u02c9\u0005"+
		"h\u0035\u0002\u02c9\u02ca\u0005j\u0036\u0002\u02ca\u02cb\u0007M\u0002"+
		"\u0002\u02cbg\u0003\u0002\u0002\u0002\u02cc\u02d0\u0005\u00d0i\u0002\u02cd"+
		"\u02d0\u0005&\u0014\u0002\u02ce\u02d0\u0007\u0019\u0002\u0002\u02cf\u02cc"+
		"\u0003\u0002\u0002\u0002\u02cf\u02cd\u0003\u0002\u0002\u0002\u02cf\u02ce"+
		"\u0003\u0002\u0002\u0002\u02d0i\u0003\u0002\u0002\u0002\u02d1\u02d8\u0005"+
		"F$\u0002\u02d2\u02d4\u0005l\u0037\u0002\u02d3\u02d2\u0003\u0002\u0002"+
		"\u0002\u02d4\u02d5\u0003\u0002\u0002\u0002\u02d5\u02d3\u0003\u0002\u0002"+
		"\u0002\u02d5\u02d6\u0003\u0002\u0002\u0002\u02d6\u02d8\u0003\u0002\u0002"+
		"\u0002\u02d7\u02d1\u0003\u0002\u0002\u0002\u02d7\u02d3\u0003\u0002\u0002"+
		"\u0002\u02d8k\u0003\u0002\u0002\u0002\u02d9\u02db\u0005F$\u0002\u02da"+
		"\u02d9\u0003\u0002\u0002\u0002\u02da\u02db\u0003\u0002\u0002\u0002\u02db"+
		"\u02dc\u0003\u0002\u0002\u0002\u02dc\u02dd\u0007Y\u0002\u0002\u02dd\u02de"+
		"\u0005\u00d0i\u0002\u02dem\u0003\u0002\u0002\u0002\u02df\u02e0\u0007\u0014"+
		"\u0002\u0002\u02e0\u02e1\u0007H\u0002\u0002\u02e1\u02e2\u0005p9\u0002"+
		"\u02e2\u02e3\u0007I\u0002\u0002\u02e3o\u0003\u0002\u0002\u0002\u02e4\u02ee"+
		"\u0005F$\u0002\u02e5\u02e7\u0005F$\u0002\u02e6\u02e5\u0003\u0002\u0002"+
		"\u0002\u02e6\u02e7\u0003\u0002\u0002\u0002\u02e7\u02e8\u0003\u0002\u0002"+
		"\u0002\u02e8\u02ea\u0007Y\u0002\u0002\u02e9\u02e6\u0003\u0002\u0002\u0002"+
		"\u02ea\u02eb\u0003\u0002\u0002\u0002\u02eb\u02e9\u0003\u0002\u0002\u0002"+
		"\u02eb\u02ec\u0003\u0002\u0002\u0002\u02ec\u02ee\u0003\u0002\u0002\u0002"+
		"\u02ed\u02e4\u0003\u0002\u0002\u0002\u02ed\u02e9\u0003\u0002\u0002\u0002"+
		"\u02eeq\u0003\u0002\u0002\u0002\u02ef\u02f0\u0007\u000e\u0002\u0002\u02f0"+
		"\u02f1\u0007H\u0002\u0002\u02f1\u02f2\u0005,\u0017\u0002\u02f2\u02f3\u0007"+
		"I\u0002\u0002\u02f3s\u0003\u0002\u0002\u0002\u02f4\u02f5\u0007\b\u0002"+
		"\u0002\u02f5\u02f6\u0007H\u0002\u0002\u02f6\u02f7\u0005\u00b2Z\u0002\u02f7"+
		"\u02f8\u0007I\u0002\u0002\u02f8u\u0003\u0002\u0002\u0002\u02f9\u02fa\u0005"+
		"\u008aF\u0002\u02fa\u02fb\u0005\u00a6T\u0002\u02fbw\u0003\u0002\u0002"+
		"\u0002\u02fc\u02fd\u0007\u0018\u0002\u0002\u02fd\u02fe\u0005\u00c0a\u0002"+
		"\u02fey\u0003\u0002\u0002\u0002\u02ff\u0300\u0007\u0005\u0002\u0002\u0300"+
		"\u0301\u0007H\u0002\u0002\u0301\u0302\u0005v<\u0002\u0302\u0303\u0007"+
		"I\u0002\u0002\u0303\u0304\u0005\u00c0a\u0002\u0304{\u0003\u0002\u0002"+
		"\u0002\u0305\u0306\u0007\n\u0002\u0002\u0306\u0307\u0005\u00c0a\u0002"+
		"\u0307}\u0003\u0002\u0002\u0002\u0308\u0309\u0007\u0017\u0002\u0002\u0309"+
		"\u030a\u0007H\u0002\u0002\u030a\u030b\u0007\u0080\u0002\u0002\u030b\u030c"+
		"\u0007I\u0002\u0002\u030c\u007f\u0003\u0002\u0002\u0002\u030d\u0311\u0005"+
		"x=\u0002\u030e\u0310\u0005z>\u0002\u030f\u030e\u0003\u0002\u0002\u0002"+
		"\u0310\u0313\u0003\u0002\u0002\u0002\u0311\u030f\u0003\u0002\u0002\u0002"+
		"\u0311\u0312\u0003\u0002\u0002\u0002\u0312\u0315\u0003\u0002\u0002\u0002"+
		"\u0313\u0311\u0003\u0002\u0002\u0002\u0314\u0316\u0005|?\u0002\u0315\u0314"+
		"\u0003\u0002\u0002\u0002\u0315\u0316\u0003\u0002\u0002\u0002\u0316\u0081"+
		"\u0003\u0002\u0002\u0002\u0317\u0318\u0007\u0015\u0002\u0002\u0318\u0319"+
		"\u0007H\u0002\u0002\u0319\u031a\u0005X-\u0002\u031a\u031b\u0007I\u0002"+
		"\u0002\u031b\u031c\u0005\u00c0a\u0002\u031c\u0083\u0003\u0002\u0002\u0002"+
		"\u031d\u031e\u0007\u0004\u0002\u0002\u031e\u031f\u0005\u00c0a\u0002\u031f"+
		"\u0085\u0003\u0002\u0002\u0002\u0320\u0322\u0005\u008aF\u0002\u0321\u0320"+
		"\u0003\u0002\u0002\u0002\u0321\u0322\u0003\u0002\u0002\u0002\u0322\u0323"+
		"\u0003\u0002\u0002\u0002\u0323\u0324\u0005\u00a6T\u0002\u0324\u0325\u0005"+
		"\u00c0a\u0002\u0325\u0087\u0003\u0002\u0002\u0002\u0326\u0328\u0005\u008a"+
		"F\u0002\u0327\u0329\u0005\u0090I\u0002\u0328\u0327\u0003\u0002\u0002\u0002"+
		"\u0328\u0329\u0003\u0002\u0002\u0002\u0329\u032a\u0003\u0002\u0002\u0002"+
		"\u032a\u032b\u0007N\u0002\u0002\u032b\u0089\u0003\u0002\u0002\u0002\u032c"+
		"\u0331\u0005\u008cG\u0002\u032d\u0331\u0005\u008eH\u0002\u032e\u0331\u0005"+
		"R*\u0002\u032f\u0331\u0005T+\u0002\u0330\u032c\u0003\u0002\u0002\u0002"+
		"\u0330\u032d\u0003\u0002\u0002\u0002\u0330\u032e\u0003\u0002\u0002\u0002"+
		"\u0330\u032f\u0003\u0002\u0002\u0002\u0331\u0332\u0003\u0002\u0002\u0002"+
		"\u0332\u0330\u0003\u0002\u0002\u0002\u0332\u0333\u0003\u0002\u0002\u0002"+
		"\u0333\u008b\u0003\u0002\u0002\u0002\u0334\u0335\t\u0006\u0002\u0002\u0335"+
		"\u008d\u0003\u0002\u0002\u0002\u0336\u0337\t\u0007\u0002\u0002\u0337\u008f"+
		"\u0003\u0002\u0002\u0002\u0338\u033d\u0005\u0092J\u0002\u0339\u033a\u0007"+
		"O\u0002\u0002\u033a\u033c\u0005\u0092J\u0002\u033b\u0339\u0003\u0002\u0002"+
		"\u0002\u033c\u033f\u0003\u0002\u0002\u0002\u033d\u033b\u0003\u0002\u0002"+
		"\u0002\u033d\u033e\u0003\u0002\u0002\u0002\u033e\u0091\u0003\u0002\u0002"+
		"\u0002\u033f\u033d\u0003\u0002\u0002\u0002\u0340\u0343\u0005\u00a6T\u0002"+
		"\u0341\u0342\u0007S\u0002\u0002\u0342\u0344\u0005\u00b0Y\u0002\u0343\u0341"+
		"\u0003\u0002\u0002\u0002\u0343\u0344\u0003\u0002\u0002\u0002\u0344\u0093"+
		"\u0003\u0002\u0002\u0002\u0345\u0352\t\b\u0002\u0002\u0346\u0353\u0007"+
		"\u0080\u0002\u0002\u0347\u0349\u0007\u0080\u0002\u0002\u0348\u0347\u0003"+
		"\u0002\u0002\u0002\u0348\u0349\u0003\u0002\u0002\u0002\u0349\u034a\u0003"+
		"\u0002\u0002\u0002\u034a\u034c\u0007J\u0002\u0002\u034b\u034d\u0005\u0096"+
		"L\u0002\u034c\u034b\u0003\u0002\u0002\u0002\u034d\u034e\u0003\u0002\u0002"+
		"\u0002\u034e\u034c\u0003\u0002\u0002\u0002\u034e\u034f\u0003\u0002\u0002"+
		"\u0002\u034f\u0350\u0003\u0002\u0002\u0002\u0350\u0351\u0007K\u0002\u0002"+
		"\u0351\u0353\u0003\u0002\u0002\u0002\u0352\u0346\u0003\u0002\u0002\u0002"+
		"\u0352\u0348\u0003\u0002\u0002\u0002\u0353\u0095\u0003\u0002\u0002\u0002"+
		"\u0354\u0355\u0005\u0098M\u0002\u0355\u0356\u0005\u009aN\u0002\u0356\u0357"+
		"\u0007N\u0002\u0002\u0357\u0097\u0003\u0002\u0002\u0002\u0358\u035c\u0005"+
		"\u008cG\u0002\u0359\u035c\u0005R*\u0002\u035a\u035c\u0005T+\u0002\u035b"+
		"\u0358\u0003\u0002\u0002\u0002\u035b\u0359\u0003\u0002\u0002\u0002\u035b"+
		"\u035a\u0003\u0002\u0002\u0002\u035c\u035d\u0003\u0002\u0002\u0002\u035d"+
		"\u035b\u0003\u0002\u0002\u0002\u035d\u035e\u0003\u0002\u0002\u0002\u035e"+
		"\u0099\u0003\u0002\u0002\u0002\u035f\u0364\u0005\u009cO\u0002\u0360\u0361"+
		"\u0007O\u0002\u0002\u0361\u0363\u0005\u009cO\u0002\u0362\u0360\u0003\u0002"+
		"\u0002\u0002\u0363\u0366\u0003\u0002\u0002\u0002\u0364\u0362\u0003\u0002"+
		"\u0002\u0002\u0364\u0365\u0003\u0002\u0002\u0002\u0365\u009b\u0003\u0002"+
		"\u0002\u0002\u0366\u0364\u0003\u0002\u0002\u0002\u0367\u036e\u0005\u00a6"+
		"T\u0002\u0368\u036a\u0005\u00a6T\u0002\u0369\u0368\u0003\u0002\u0002\u0002"+
		"\u0369\u036a\u0003\u0002\u0002\u0002\u036a\u036b\u0003\u0002\u0002\u0002"+
		"\u036b\u036c\u0007Y\u0002\u0002\u036c\u036e\u0005\u00fa~\u0002\u036d\u0367"+
		"\u0003\u0002\u0002\u0002\u036d\u0369\u0003\u0002\u0002\u0002\u036e\u009d"+
		"\u0003\u0002\u0002\u0002\u036f\u0375\u0007)\u0002\u0002\u0370\u0372\u0007"+
		"\u0080\u0002\u0002\u0371\u0370\u0003\u0002\u0002\u0002\u0371\u0372\u0003"+
		"\u0002\u0002\u0002\u0372\u0373\u0003\u0002\u0002\u0002\u0373\u0374\u0007"+
		"Y\u0002\u0002\u0374\u0376\u0005\u00b2Z\u0002\u0375\u0371\u0003\u0002\u0002"+
		"\u0002\u0375\u0376\u0003\u0002\u0002\u0002\u0376\u0382\u0003\u0002\u0002"+
		"\u0002\u0377\u037c\u0005\u00f8}\u0002\u0378\u0379\u0007J\u0002\u0002\u0379"+
		"\u037a\u0005\u00a0Q\u0002\u037a\u037b\u0007K\u0002\u0002\u037b\u037d\u0003"+
		"\u0002\u0002\u0002\u037c\u0378\u0003\u0002\u0002\u0002\u037c\u037d\u0003"+
		"\u0002\u0002\u0002\u037d\u0383\u0003\u0002\u0002\u0002\u037e\u037f\u0007"+
		"J\u0002\u0002\u037f\u0380\u0005\u00a0Q\u0002\u0380\u0381\u0007K\u0002"+
		"\u0002\u0381\u0383\u0003\u0002\u0002\u0002\u0382\u0377\u0003\u0002\u0002"+
		"\u0002\u0382\u037e\u0003\u0002\u0002\u0002\u0383\u0399\u0003\u0002\u0002"+
		"\u0002\u0384\u0385\u0007D\u0002\u0002\u0385\u0386\u0007H\u0002\u0002\u0386"+
		"\u0387\u0005\u00b2Z\u0002\u0387\u0388\u0007O\u0002\u0002\u0388\u0389\u0005"+
		"\u00f8}\u0002\u0389\u038a\u0007I\u0002\u0002\u038a\u038b\u0007J\u0002"+
		"\u0002\u038b\u038c\u0005\u00a0Q\u0002\u038c\u038d\u0007K\u0002\u0002\u038d"+
		"\u0399\u0003\u0002\u0002\u0002\u038e\u038f\u0007E\u0002\u0002\u038f\u0390"+
		"\u0007H\u0002\u0002\u0390\u0391\u0005\u00b2Z\u0002\u0391\u0392\u0007O"+
		"\u0002\u0002\u0392\u0393\u0005\u00f8}\u0002\u0393\u0394\u0007I\u0002\u0002"+
		"\u0394\u0395\u0007J\u0002\u0002\u0395\u0396\u0005\u00a0Q\u0002\u0396\u0397"+
		"\u0007K\u0002\u0002\u0397\u0399\u0003\u0002\u0002\u0002\u0398\u036f\u0003"+
		"\u0002\u0002\u0002\u0398\u0384\u0003\u0002\u0002\u0002\u0398\u038e\u0003"+
		"\u0002\u0002\u0002\u0399\u009f\u0003\u0002\u0002\u0002\u039a\u039f\u0005"+
		"\u00a2R\u0002\u039b\u039c\u0007O\u0002\u0002\u039c\u039e\u0005\u00a2R"+
		"\u0002\u039d\u039b\u0003\u0002\u0002\u0002\u039e\u03a1\u0003\u0002\u0002"+
		"\u0002\u039f\u039d\u0003\u0002\u0002\u0002\u039f\u03a0\u0003\u0002\u0002"+
		"\u0002\u03a0\u03a3\u0003\u0002\u0002\u0002\u03a1\u039f\u0003\u0002\u0002"+
		"\u0002\u03a2\u03a4\u0007O\u0002\u0002\u03a3\u03a2\u0003\u0002\u0002\u0002"+
		"\u03a3\u03a4\u0003\u0002\u0002\u0002\u03a4\u00a1\u0003\u0002\u0002\u0002"+
		"\u03a5\u03a8\u0005\u00f8}\u0002\u03a6\u03a7\u0007S\u0002\u0002\u03a7\u03a9"+
		"\u0005\u00d8m\u0002\u03a8\u03a6\u0003\u0002\u0002\u0002\u03a8\u03a9\u0003"+
		"\u0002\u0002\u0002\u03a9\u00a3\u0003\u0002\u0002\u0002\u03aa\u03ac\u0007"+
		"d\u0002\u0002\u03ab\u03ad\u0005\u008aF\u0002\u03ac\u03ab\u0003\u0002\u0002"+
		"\u0002\u03ac\u03ad\u0003\u0002\u0002\u0002\u03ad\u03b4\u0003\u0002\u0002"+
		"\u0002\u03ae\u03b0\u0007d\u0002\u0002\u03af\u03b1\u0005\u008aF\u0002\u03b0"+
		"\u03af\u0003\u0002\u0002\u0002\u03b0\u03b1\u0003\u0002\u0002\u0002\u03b1"+
		"\u03b2\u0003\u0002\u0002\u0002\u03b2\u03b4\u0005\u00a4S\u0002\u03b3\u03aa"+
		"\u0003\u0002\u0002\u0002\u03b3\u03ae\u0003\u0002\u0002\u0002\u03b4\u00a5"+
		"\u0003\u0002\u0002\u0002\u03b5\u03b7\u0005\u00a4S\u0002\u03b6\u03b5\u0003"+
		"\u0002\u0002\u0002\u03b6\u03b7\u0003\u0002\u0002\u0002\u03b7\u03b8\u0003"+
		"\u0002\u0002\u0002\u03b8\u03b9\u0005\u00a8U\u0002\u03b9\u00a7\u0003\u0002"+
		"\u0002\u0002\u03ba\u03be\u0005\u00f8}\u0002\u03bb\u03bd\u0005\u00aaV\u0002"+
		"\u03bc\u03bb\u0003\u0002\u0002\u0002\u03bd\u03c0\u0003\u0002\u0002\u0002"+
		"\u03be\u03bc\u0003\u0002\u0002\u0002\u03be\u03bf\u0003\u0002\u0002\u0002"+
		"\u03bf\u03d2\u0003\u0002\u0002\u0002\u03c0\u03be\u0003\u0002\u0002\u0002"+
		"\u03c1\u03c2\u0007H\u0002\u0002\u03c2\u03c3\u0005\u00a6T\u0002\u03c3\u03c7"+
		"\u0007I\u0002\u0002\u03c4\u03c6\u0005\u00aaV\u0002\u03c5\u03c4\u0003\u0002"+
		"\u0002\u0002\u03c6\u03c9\u0003\u0002\u0002\u0002\u03c7\u03c5\u0003\u0002"+
		"\u0002\u0002\u03c7\u03c8\u0003\u0002\u0002\u0002\u03c8\u03d2\u0003\u0002"+
		"\u0002\u0002\u03c9\u03c7\u0003\u0002\u0002\u0002\u03ca\u03cb\u0007H\u0002"+
		"\u0002\u03cb\u03cd\u0007h\u0002\u0002\u03cc\u03ce\u0005\u00f8}\u0002\u03cd"+
		"\u03cc\u0003\u0002\u0002\u0002\u03cd\u03ce\u0003\u0002\u0002\u0002\u03ce"+
		"\u03cf\u0003\u0002\u0002\u0002\u03cf\u03d0\u0007I\u0002\u0002\u03d0\u03d2"+
		"\u0005b\u0032\u0002\u03d1\u03ba\u0003\u0002\u0002\u0002\u03d1\u03c1\u0003"+
		"\u0002\u0002\u0002\u03d1\u03ca\u0003\u0002\u0002\u0002\u03d2\u00a9\u0003"+
		"\u0002\u0002\u0002\u03d3\u03d5\u0007L\u0002\u0002\u03d4\u03d6\u0005\u00d8"+
		"m\u0002\u03d5\u03d4\u0003\u0002\u0002\u0002\u03d5\u03d6\u0003\u0002\u0002"+
		"\u0002\u03d6\u03d7\u0003\u0002\u0002\u0002\u03d7\u03de\u0007M\u0002\u0002"+
		"\u03d8\u03da\u0007H\u0002\u0002\u03d9\u03db\u0005\u00acW\u0002\u03da\u03d9"+
		"\u0003\u0002\u0002\u0002\u03da\u03db\u0003\u0002\u0002\u0002\u03db\u03dc"+
		"\u0003\u0002\u0002\u0002\u03dc\u03de\u0007I\u0002\u0002\u03dd\u03d3\u0003"+
		"\u0002\u0002\u0002\u03dd\u03d8\u0003\u0002\u0002\u0002\u03de\u00ab\u0003"+
		"\u0002\u0002\u0002\u03df\u03e2\u0005\u00b8]\u0002\u03e0\u03e1\u0007O\u0002"+
		"\u0002\u03e1\u03e3\u0007v\u0002\u0002\u03e2\u03e0\u0003\u0002\u0002\u0002"+
		"\u03e2\u03e3\u0003\u0002\u0002\u0002\u03e3\u00ad\u0003\u0002\u0002\u0002"+
		"\u03e4\u03e9\u0005\u008aF\u0002\u03e5\u03e7\u0005\u00a6T\u0002\u03e6\u03e5"+
		"\u0003\u0002\u0002\u0002\u03e6\u03e7\u0003\u0002\u0002\u0002\u03e7\u03ea"+
		"\u0003\u0002\u0002\u0002\u03e8\u03ea\u0005\u00b4[\u0002\u03e9\u03e6\u0003"+
		"\u0002\u0002\u0002\u03e9\u03e8\u0003\u0002\u0002\u0002\u03ea\u00af\u0003"+
		"\u0002\u0002\u0002\u03eb\u03fb\u0005\u00d2j\u0002\u03ec\u03ed\u0007J\u0002"+
		"\u0002\u03ed\u03f2\u0005\u00b0Y\u0002\u03ee\u03ef\u0007O\u0002\u0002\u03ef"+
		"\u03f1\u0005\u00b0Y\u0002\u03f0\u03ee\u0003\u0002\u0002\u0002\u03f1\u03f4"+
		"\u0003\u0002\u0002\u0002\u03f2\u03f0\u0003\u0002\u0002\u0002\u03f2\u03f3"+
		"\u0003\u0002\u0002\u0002\u03f3\u03f6\u0003\u0002\u0002\u0002\u03f4\u03f2"+
		"\u0003\u0002\u0002\u0002\u03f5\u03f7\u0007O\u0002\u0002\u03f6\u03f5\u0003"+
		"\u0002\u0002\u0002\u03f6\u03f7\u0003\u0002\u0002\u0002\u03f7\u03f8\u0003"+
		"\u0002\u0002\u0002\u03f8\u03f9\u0007K\u0002\u0002\u03f9\u03fb\u0003\u0002"+
		"\u0002\u0002\u03fa\u03eb\u0003\u0002\u0002\u0002\u03fa\u03ec\u0003\u0002"+
		"\u0002\u0002\u03fb\u00b1\u0003\u0002\u0002\u0002\u03fc\u03fd\u0005\u0098"+
		"M\u0002\u03fd\u03fe\u0005\u00b4[\u0002\u03fe\u0401\u0003\u0002\u0002\u0002"+
		"\u03ff\u0401\u0005P)\u0002\u0400\u03fc\u0003\u0002\u0002\u0002\u0400\u03ff"+
		"\u0003\u0002\u0002\u0002\u0401\u00b3\u0003\u0002\u0002\u0002\u0402\u0403"+
		"\u0005\u00a4S\u0002\u0403\u0404\u0005\u00b4[\u0002\u0404\u0418\u0003\u0002"+
		"\u0002\u0002\u0405\u0406\u0007H\u0002\u0002\u0406\u0407\u0005\u00b4[\u0002"+
		"\u0407\u0409\u0007I\u0002\u0002\u0408\u040a\u0005\u00b6\\\u0002\u0409"+
		"\u0408\u0003\u0002\u0002\u0002\u040a\u040b\u0003\u0002\u0002\u0002\u040b"+
		"\u0409\u0003\u0002\u0002\u0002\u040b\u040c\u0003\u0002\u0002\u0002\u040c"+
		"\u0418\u0003\u0002\u0002\u0002\u040d\u040f\u0007L\u0002\u0002\u040e\u0410"+
		"\u0005\u00d8m\u0002\u040f\u040e\u0003\u0002\u0002\u0002\u040f\u0410\u0003"+
		"\u0002\u0002\u0002\u0410\u0411\u0003\u0002\u0002\u0002\u0411\u0413\u0007"+
		"M\u0002\u0002\u0412\u040d\u0003\u0002\u0002\u0002\u0413\u0414\u0003\u0002"+
		"\u0002\u0002\u0414\u0412\u0003\u0002\u0002\u0002\u0414\u0415\u0003\u0002"+
		"\u0002\u0002\u0415\u0418\u0003\u0002\u0002\u0002\u0416\u0418\u0003\u0002"+
		"\u0002\u0002\u0417\u0402\u0003\u0002\u0002\u0002\u0417\u0405\u0003\u0002"+
		"\u0002\u0002\u0417\u0412\u0003\u0002\u0002\u0002\u0417\u0416\u0003\u0002"+
		"\u0002\u0002\u0418\u00b5\u0003\u0002\u0002\u0002\u0419\u041b\u0007L\u0002"+
		"\u0002\u041a\u041c\u0005\u00d8m\u0002\u041b\u041a\u0003\u0002\u0002\u0002"+
		"\u041b\u041c\u0003\u0002\u0002\u0002\u041c\u041d\u0003\u0002\u0002\u0002"+
		"\u041d\u0424\u0007M\u0002\u0002\u041e\u0420\u0007H\u0002\u0002\u041f\u0421"+
		"\u0005\u00b8]\u0002\u0420\u041f\u0003\u0002\u0002\u0002\u0420\u0421\u0003"+
		"\u0002\u0002\u0002\u0421\u0422\u0003\u0002\u0002\u0002\u0422\u0424\u0007"+
		"I\u0002\u0002\u0423\u0419\u0003\u0002\u0002\u0002\u0423\u041e\u0003\u0002"+
		"\u0002\u0002\u0424\u00b7\u0003\u0002\u0002\u0002\u0425\u042a\u0005\u00ae"+
		"X\u0002\u0426\u0427\u0007O\u0002\u0002\u0427\u0429\u0005\u00aeX\u0002"+
		"\u0428\u0426\u0003\u0002\u0002\u0002\u0429\u042c\u0003\u0002\u0002\u0002"+
		"\u042a\u0428\u0003\u0002\u0002\u0002\u042a\u042b\u0003\u0002\u0002\u0002"+
		"\u042b\u00b9\u0003\u0002\u0002\u0002\u042c\u042a\u0003\u0002\u0002\u0002"+
		"\u042d\u042f\u0005\u00bc_\u0002\u042e\u042d\u0003\u0002\u0002\u0002\u042f"+
		"\u0430\u0003\u0002\u0002\u0002\u0430\u042e\u0003\u0002\u0002\u0002\u0430"+
		"\u0431\u0003\u0002\u0002\u0002\u0431\u00bb\u0003\u0002\u0002\u0002\u0432"+
		"\u043f\u0005\u00be`\u0002\u0433\u0434\u0005\u00d0i\u0002\u0434\u0435\u0007"+
		"N\u0002\u0002\u0435\u043f\u0003\u0002\u0002\u0002\u0436\u043f\u0005\u00c0"+
		"a\u0002\u0437\u043f\u0005\u00c2b\u0002\u0438\u043f\u0005\u00ccg\u0002"+
		"\u0439\u043f\u0005\u00ceh\u0002\u043a\u043f\u0005\u0082B\u0002\u043b\u043f"+
		"\u0005\u0084C\u0002\u043c\u043f\u0005\u0080A\u0002\u043d\u043f\u0007N"+
		"\u0002\u0002\u043e\u0432\u0003\u0002\u0002\u0002\u043e\u0433\u0003\u0002"+
		"\u0002\u0002\u043e\u0436\u0003\u0002\u0002\u0002\u043e\u0437\u0003\u0002"+
		"\u0002\u0002\u043e\u0438\u0003\u0002\u0002\u0002\u043e\u0439\u0003\u0002"+
		"\u0002\u0002\u043e\u043a\u0003\u0002\u0002\u0002\u043e\u043b\u0003\u0002"+
		"\u0002\u0002\u043e\u043c\u0003\u0002\u0002\u0002\u043e\u043d\u0003\u0002"+
		"\u0002\u0002\u043f\u00bd\u0003\u0002\u0002\u0002\u0440\u0441\u0005\u00f8"+
		"}\u0002\u0441\u0442\u0007Y\u0002\u0002\u0442\u0443\u0005\u00bc_\u0002"+
		"\u0443\u044d\u0003\u0002\u0002\u0002\u0444\u0445\u0007!\u0002\u0002\u0445"+
		"\u0446\u0005\u00d8m\u0002\u0446\u0447\u0007Y\u0002\u0002\u0447\u0448\u0005"+
		"\u00bc_\u0002\u0448\u044d\u0003\u0002\u0002\u0002\u0449\u044a\u0007%\u0002"+
		"\u0002\u044a\u044b\u0007Y\u0002\u0002\u044b\u044d\u0005\u00bc_\u0002\u044c"+
		"\u0440\u0003\u0002\u0002\u0002\u044c\u0444\u0003\u0002\u0002\u0002\u044c"+
		"\u0449\u0003\u0002\u0002\u0002\u044d\u00bf\u0003\u0002\u0002\u0002\u044e"+
		"\u0453\u0007J\u0002\u0002\u044f\u0452\u0005\u0088E\u0002\u0450\u0452\u0005"+
		"\u00ba^\u0002\u0451\u044f\u0003\u0002\u0002\u0002\u0451\u0450\u0003\u0002"+
		"\u0002\u0002\u0452\u0455\u0003\u0002\u0002\u0002\u0453\u0451\u0003\u0002"+
		"\u0002\u0002\u0453\u0454\u0003\u0002\u0002\u0002\u0454\u0456\u0003\u0002"+
		"\u0002\u0002\u0455\u0453\u0003\u0002\u0002\u0002\u0456\u0457\u0007K\u0002"+
		"\u0002\u0457\u00c1\u0003\u0002\u0002\u0002\u0458\u0459\u0007.\u0002\u0002"+
		"\u0459\u045a\u0007H\u0002\u0002\u045a\u045b\u0005\u00d0i\u0002\u045b\u045c"+
		"\u0007I\u0002\u0002\u045c\u045f\u0005\u00bc_\u0002\u045d\u045e\u0007("+
		"\u0002\u0002\u045e\u0460\u0005\u00bc_\u0002\u045f\u045d\u0003\u0002\u0002"+
		"\u0002\u045f\u0460\u0003\u0002\u0002\u0002\u0460\u0468\u0003\u0002\u0002"+
		"\u0002\u0461\u0462\u0007=\u0002\u0002\u0462\u0463\u0007H\u0002\u0002\u0463"+
		"\u0464\u0005\u00d0i\u0002\u0464\u0465\u0007I\u0002\u0002\u0465\u0466\u0005"+
		"\u00bc_\u0002\u0466\u0468\u0003\u0002\u0002\u0002\u0467\u0458\u0003\u0002"+
		"\u0002\u0002\u0467\u0461\u0003\u0002\u0002\u0002\u0468\u00c3\u0003\u0002"+
		"\u0002\u0002\u0469\u046a\u0007,\u0002\u0002\u046a\u046b\u0007H\u0002\u0002"+
		"\u046b\u046c\u0005v<\u0002\u046c\u046e\u0007/\u0002\u0002\u046d\u046f"+
		"\u0005\u00d0i\u0002\u046e\u046d\u0003\u0002\u0002\u0002\u046e\u046f\u0003"+
		"\u0002\u0002\u0002\u046f\u0470\u0003\u0002\u0002\u0002\u0470\u0471\u0007"+
		"I\u0002\u0002\u0471\u0472\u0005\u00bc_\u0002\u0472\u00c5\u0003\u0002\u0002"+
		"\u0002\u0473\u0474\u0007,\u0002\u0002\u0474\u0479\u0007H\u0002\u0002\u0475"+
		"\u0476\u0005\u008aF\u0002\u0476\u0477\u0005\u0090I\u0002\u0477\u047a\u0003"+
		"\u0002\u0002\u0002\u0478\u047a\u0005\u00d0i\u0002\u0479\u0475\u0003\u0002"+
		"\u0002\u0002\u0479\u0478\u0003\u0002\u0002\u0002\u0479\u047a\u0003\u0002"+
		"\u0002\u0002\u047a\u047b\u0003\u0002\u0002\u0002\u047b\u047d\u0007N\u0002"+
		"\u0002\u047c\u047e\u0005\u00d0i\u0002\u047d\u047c\u0003\u0002\u0002\u0002"+
		"\u047d\u047e\u0003\u0002\u0002\u0002\u047e\u047f\u0003\u0002\u0002\u0002"+
		"\u047f\u0481\u0007N\u0002\u0002\u0480\u0482\u0005\u00d0i\u0002\u0481\u0480"+
		"\u0003\u0002\u0002\u0002\u0481\u0482\u0003\u0002\u0002\u0002\u0482\u0483"+
		"\u0003\u0002\u0002\u0002\u0483\u0484\u0007I\u0002\u0002\u0484\u0485\u0005"+
		"\u00bc_\u0002\u0485\u00c7\u0003\u0002\u0002\u0002\u0486\u0487\u0007C\u0002"+
		"\u0002\u0487\u0488\u0007H\u0002\u0002\u0488\u0489\u0005\u00d0i\u0002\u0489"+
		"\u048a\u0007I\u0002\u0002\u048a\u048b\u0005\u00bc_\u0002\u048b\u00c9\u0003"+
		"\u0002\u0002\u0002\u048c\u048d\u0007&\u0002\u0002\u048d\u048e\u0005\u00bc"+
		"_\u0002\u048e\u048f\u0007C\u0002\u0002\u048f\u0490\u0007H\u0002\u0002"+
		"\u0490\u0491\u0005\u00d0i\u0002\u0491\u0492\u0007I\u0002\u0002\u0492\u0493"+
		"\u0007N\u0002\u0002\u0493\u00cb\u0003\u0002\u0002\u0002\u0494\u0499\u0005"+
		"\u00c8e\u0002\u0495\u0499\u0005\u00caf\u0002\u0496\u0499\u0005\u00c6d"+
		"\u0002\u0497\u0499\u0005\u00c4c\u0002\u0498\u0494\u0003\u0002\u0002\u0002"+
		"\u0498\u0495\u0003\u0002\u0002\u0002\u0498\u0496\u0003\u0002\u0002\u0002"+
		"\u0498\u0497\u0003\u0002\u0002\u0002\u0499\u00cd\u0003\u0002\u0002\u0002"+
		"\u049a\u049b\u0007\u0031\u0002\u0002\u049b\u049c\u0005\u00f8}\u0002\u049c"+
		"\u049d\u0007N\u0002\u0002\u049d\u04a8\u0003\u0002\u0002\u0002\u049e\u049f"+
		"\u0007$\u0002\u0002\u049f\u04a8\u0007N\u0002\u0002\u04a0\u04a1\u0007\u001e"+
		"\u0002\u0002\u04a1\u04a8\u0007N\u0002\u0002\u04a2\u04a4\u0007\u0037\u0002"+
		"\u0002\u04a3\u04a5\u0005\u00d0i\u0002\u04a4\u04a3\u0003\u0002\u0002\u0002"+
		"\u04a4\u04a5\u0003\u0002\u0002\u0002\u04a5\u04a6\u0003\u0002\u0002\u0002"+
		"\u04a6\u04a8\u0007N\u0002\u0002\u04a7\u049a\u0003\u0002\u0002\u0002\u04a7"+
		"\u049e\u0003\u0002\u0002\u0002\u04a7\u04a0\u0003\u0002\u0002\u0002\u04a7"+
		"\u04a2\u0003\u0002\u0002\u0002\u04a8\u00cf\u0003\u0002\u0002\u0002\u04a9"+
		"\u04ae\u0005\u00d2j\u0002\u04aa\u04ab\u0007O\u0002\u0002\u04ab\u04ad\u0005"+
		"\u00d2j\u0002\u04ac\u04aa\u0003\u0002\u0002\u0002\u04ad\u04b0\u0003\u0002"+
		"\u0002\u0002\u04ae\u04ac\u0003\u0002\u0002\u0002\u04ae\u04af\u0003\u0002"+
		"\u0002\u0002\u04af\u00d1\u0003\u0002\u0002\u0002\u04b0\u04ae\u0003\u0002"+
		"\u0002\u0002\u04b1\u04b7\u0005\u00d6l\u0002\u04b2\u04b3\u0005\u00f0y\u0002"+
		"\u04b3\u04b4\u0005\u00d4k\u0002\u04b4\u04b5\u0005\u00d2j\u0002\u04b5\u04b7"+
		"\u0003\u0002\u0002\u0002\u04b6\u04b1\u0003\u0002\u0002\u0002\u04b6\u04b2"+
		"\u0003\u0002\u0002\u0002\u04b7\u00d3\u0003\u0002\u0002\u0002\u04b8\u04b9"+
		"\t\t\u0002\u0002\u04b9\u00d5\u0003\u0002\u0002\u0002\u04ba\u04c1\u0005"+
		"\u00dan\u0002\u04bb\u04bd\u0007X\u0002\u0002\u04bc\u04be\u0005\u00d6l"+
		"\u0002\u04bd\u04bc\u0003\u0002\u0002\u0002\u04bd\u04be\u0003\u0002\u0002"+
		"\u0002\u04be\u04bf\u0003\u0002\u0002\u0002\u04bf\u04c0\u0007Y\u0002\u0002"+
		"\u04c0\u04c2\u0005\u00d6l\u0002\u04c1\u04bb\u0003\u0002\u0002\u0002\u04c1"+
		"\u04c2\u0003\u0002\u0002\u0002\u04c2\u00d7\u0003\u0002\u0002\u0002\u04c3"+
		"\u04c4\u0005\u00d6l\u0002\u04c4\u00d9\u0003\u0002\u0002\u0002\u04c5\u04ca"+
		"\u0005\u00dco\u0002\u04c6\u04c7\u0007_\u0002\u0002\u04c7\u04c9\u0005\u00dc"+
		"o\u0002\u04c8\u04c6\u0003\u0002\u0002\u0002\u04c9\u04cc\u0003\u0002\u0002"+
		"\u0002\u04ca\u04c8\u0003\u0002\u0002\u0002\u04ca\u04cb\u0003\u0002\u0002"+
		"\u0002\u04cb\u00db\u0003\u0002\u0002\u0002\u04cc\u04ca\u0003\u0002\u0002"+
		"\u0002\u04cd\u04d2\u0005\u00dep\u0002\u04ce\u04cf\u0007^\u0002\u0002\u04cf"+
		"\u04d1\u0005\u00dep\u0002\u04d0\u04ce\u0003\u0002\u0002\u0002\u04d1\u04d4"+
		"\u0003\u0002\u0002\u0002\u04d2\u04d0\u0003\u0002\u0002\u0002\u04d2\u04d3"+
		"\u0003\u0002\u0002\u0002\u04d3\u00dd\u0003\u0002\u0002\u0002\u04d4\u04d2"+
		"\u0003\u0002\u0002\u0002\u04d5\u04da\u0005\u00e0q\u0002\u04d6\u04d7\u0007"+
		"g\u0002\u0002\u04d7\u04d9\u0005\u00e0q\u0002\u04d8\u04d6\u0003\u0002\u0002"+
		"\u0002\u04d9\u04dc\u0003\u0002\u0002\u0002\u04da\u04d8\u0003\u0002\u0002"+
		"\u0002\u04da\u04db\u0003\u0002\u0002\u0002\u04db\u00df\u0003\u0002\u0002"+
		"\u0002\u04dc\u04da\u0003\u0002\u0002\u0002\u04dd\u04e2\u0005\u00e2r\u0002"+
		"\u04de\u04df\u0007h\u0002\u0002\u04df\u04e1\u0005\u00e2r\u0002\u04e0\u04de"+
		"\u0003\u0002\u0002\u0002\u04e1\u04e4\u0003\u0002\u0002\u0002\u04e2\u04e0"+
		"\u0003\u0002\u0002\u0002\u04e2\u04e3\u0003\u0002\u0002\u0002\u04e3\u00e1"+
		"\u0003\u0002\u0002\u0002\u04e4\u04e2\u0003\u0002\u0002\u0002\u04e5\u04ea"+
		"\u0005\u00e4s\u0002\u04e6\u04e7\u0007f\u0002\u0002\u04e7\u04e9\u0005\u00e4"+
		"s\u0002\u04e8\u04e6\u0003\u0002\u0002\u0002\u04e9\u04ec\u0003\u0002\u0002"+
		"\u0002\u04ea\u04e8\u0003\u0002\u0002\u0002\u04ea\u04eb\u0003\u0002\u0002"+
		"\u0002\u04eb\u00e3\u0003\u0002\u0002\u0002\u04ec\u04ea\u0003\u0002\u0002"+
		"\u0002\u04ed\u04f2\u0005\u00e6t\u0002\u04ee\u04ef\t\n\u0002\u0002\u04ef"+
		"\u04f1\u0005\u00e6t\u0002\u04f0\u04ee\u0003\u0002\u0002\u0002\u04f1\u04f4"+
		"\u0003\u0002\u0002\u0002\u04f2\u04f0\u0003\u0002\u0002\u0002\u04f2\u04f3"+
		"\u0003\u0002\u0002\u0002\u04f3\u00e5\u0003\u0002\u0002\u0002\u04f4\u04f2"+
		"\u0003\u0002\u0002\u0002\u04f5\u04fa\u0005\u00e8u\u0002\u04f6\u04f7\t"+
		"\u000b\u0002\u0002\u04f7\u04f9\u0005\u00e8u\u0002\u04f8\u04f6\u0003\u0002"+
		"\u0002\u0002\u04f9\u04fc\u0003\u0002\u0002\u0002\u04fa\u04f8\u0003\u0002"+
		"\u0002\u0002\u04fa\u04fb\u0003\u0002\u0002\u0002\u04fb\u00e7\u0003\u0002"+
		"\u0002\u0002\u04fc\u04fa\u0003\u0002\u0002\u0002\u04fd\u0502\u0005\u00ea"+
		"v\u0002\u04fe\u04ff\t\f\u0002\u0002\u04ff\u0501\u0005\u00eav\u0002\u0500"+
		"\u04fe\u0003\u0002\u0002\u0002\u0501\u0504\u0003\u0002\u0002\u0002\u0502"+
		"\u0500\u0003\u0002\u0002\u0002\u0502\u0503\u0003\u0002\u0002\u0002\u0503"+
		"\u00e9\u0003\u0002\u0002\u0002\u0504\u0502\u0003\u0002\u0002\u0002\u0505"+
		"\u050a\u0005\u00ecw\u0002\u0506\u0507\t\r\u0002\u0002\u0507\u0509\u0005"+
		"\u00ecw\u0002\u0508\u0506\u0003\u0002\u0002\u0002\u0509\u050c\u0003\u0002"+
		"\u0002\u0002\u050a\u0508\u0003\u0002\u0002\u0002\u050a\u050b\u0003\u0002"+
		"\u0002\u0002\u050b\u00eb\u0003\u0002\u0002\u0002\u050c\u050a\u0003\u0002"+
		"\u0002\u0002\u050d\u0512\u0005\u00eex\u0002\u050e\u050f\t\u000e\u0002"+
		"\u0002\u050f\u0511\u0005\u00eex\u0002\u0510\u050e\u0003\u0002\u0002\u0002"+
		"\u0511\u0514\u0003\u0002\u0002\u0002\u0512\u0510\u0003\u0002\u0002\u0002"+
		"\u0512\u0513\u0003\u0002\u0002\u0002\u0513\u00ed\u0003\u0002\u0002\u0002"+
		"\u0514\u0512\u0003\u0002\u0002\u0002\u0515\u0516\u0007H\u0002\u0002\u0516"+
		"\u0517\u0005\u00b2Z\u0002\u0517\u0518\u0007I\u0002\u0002\u0518\u0519\u0005"+
		"\u00eex\u0002\u0519\u051c\u0003\u0002\u0002\u0002\u051a\u051c\u0005\u00f0"+
		"y\u0002\u051b\u0515\u0003\u0002\u0002\u0002\u051b\u051a\u0003\u0002\u0002"+
		"\u0002\u051c\u00ef\u0003\u0002\u0002\u0002\u051d\u052e\u0005\u00f4{\u0002"+
		"\u051e\u051f\u0007`\u0002\u0002\u051f\u052e\u0005\u00f0y\u0002\u0520\u0521"+
		"\u0007a\u0002\u0002\u0521\u052e\u0005\u00f0y\u0002\u0522\u0523\u0005\u00f2"+
		"z\u0002\u0523\u0524\u0005\u00eex\u0002\u0524\u052e\u0003\u0002\u0002\u0002"+
		"\u0525\u052b\u0007:\u0002\u0002\u0526\u0527\u0007H\u0002\u0002\u0527\u0528"+
		"\u0005\u00b2Z\u0002\u0528\u0529\u0007I\u0002\u0002\u0529\u052c\u0003\u0002"+
		"\u0002\u0002\u052a\u052c\u0005\u00f0y\u0002\u052b\u0526\u0003\u0002\u0002"+
		"\u0002\u052b\u052a\u0003\u0002\u0002\u0002\u052c\u052e\u0003\u0002\u0002"+
		"\u0002\u052d\u051d\u0003\u0002\u0002\u0002\u052d\u051e\u0003\u0002\u0002"+
		"\u0002\u052d\u0520\u0003\u0002\u0002\u0002\u052d\u0522\u0003\u0002\u0002"+
		"\u0002\u052d\u0525\u0003\u0002\u0002\u0002\u052e\u00f1\u0003\u0002\u0002"+
		"\u0002\u052f\u0530\t\u000f\u0002\u0002\u0530\u00f3\u0003\u0002\u0002\u0002"+
		"\u0531\u0543\u0005X-\u0002\u0532\u0533\u0007L\u0002\u0002\u0533\u0534"+
		"\u0005\u00d0i\u0002\u0534\u0535\u0007M\u0002\u0002\u0535\u0542\u0003\u0002"+
		"\u0002\u0002\u0536\u0538\u0007H\u0002\u0002\u0537\u0539\u0005\u00f6|\u0002"+
		"\u0538\u0537\u0003\u0002\u0002\u0002\u0538\u0539\u0003\u0002\u0002\u0002"+
		"\u0539\u053a\u0003\u0002\u0002\u0002\u053a\u0542\u0007I\u0002\u0002\u053b"+
		"\u053c\u0007P\u0002\u0002\u053c\u0542\u0005\u00f8}\u0002\u053d\u053e\u0007"+
		"Q\u0002\u0002\u053e\u0542\u0005\u00f8}\u0002\u053f\u0542\u0007`\u0002"+
		"\u0002\u0540\u0542\u0007a\u0002\u0002\u0541\u0532\u0003\u0002\u0002\u0002"+
		"\u0541\u0536\u0003\u0002\u0002\u0002\u0541\u053b\u0003\u0002\u0002\u0002"+
		"\u0541\u053d\u0003\u0002\u0002\u0002\u0541\u053f\u0003\u0002\u0002\u0002"+
		"\u0541\u0540\u0003\u0002\u0002\u0002\u0542\u0545\u0003\u0002\u0002\u0002"+
		"\u0543\u0541\u0003\u0002\u0002\u0002\u0543\u0544\u0003\u0002\u0002\u0002"+
		"\u0544\u00f5\u0003\u0002\u0002\u0002\u0545\u0543\u0003\u0002\u0002\u0002"+
		"\u0546\u054b\u0005\u00d2j\u0002\u0547\u0548\u0007O\u0002\u0002\u0548\u054a"+
		"\u0005\u00d2j\u0002\u0549\u0547\u0003\u0002\u0002\u0002\u054a\u054d\u0003"+
		"\u0002\u0002\u0002\u054b\u0549\u0003\u0002\u0002\u0002\u054b\u054c\u0003"+
		"\u0002\u0002\u0002\u054c\u00f7\u0003\u0002\u0002\u0002\u054d\u054b\u0003"+
		"\u0002\u0002\u0002\u054e\u054f\u0007\u0080\u0002\u0002\u054f\u00f9\u0003"+
		"\u0002\u0002\u0002\u0550\u0551\t\u0010\u0002\u0002\u0551\u00fb\u0003\u0002"+
		"\u0002\u0002\u00a0\u00ff\u010f\u0117\u011a\u011d\u0120\u0128\u012c\u012f"+
		"\u0132\u013a\u013d\u0140\u014a\u0151\u0156\u0158\u016a\u0176\u017b\u017e"+
		"\u018b\u019e\u01a6\u01b4\u01bd\u01c5\u01cf\u01d4\u01dc\u01de\u01e7\u01f1"+
		"\u01f3\u01fc\u0200\u0203\u020b\u020e\u0210\u0213\u0219\u022c\u0233\u023a"+
		"\u0240\u0244\u0251\u0255\u025c\u0261\u0276\u027c\u0281\u0287\u028b\u0292"+
		"\u0298\u029c\u02a4\u02aa\u02b0\u02b5\u02b9\u02c0\u02c3\u02cf\u02d5\u02d7"+
		"\u02da\u02e6\u02eb\u02ed\u0311\u0315\u0321\u0328\u0330\u0332\u033d\u0343"+
		"\u0348\u034e\u0352\u035b\u035d\u0364\u0369\u036d\u0371\u0375\u037c\u0382"+
		"\u0398\u039f\u03a3\u03a8\u03ac\u03b0\u03b3\u03b6\u03be\u03c7\u03cd\u03d1"+
		"\u03d5\u03da\u03dd\u03e2\u03e6\u03e9\u03f2\u03f6\u03fa\u0400\u040b\u040f"+
		"\u0414\u0417\u041b\u0420\u0423\u042a\u0430\u043e\u044c\u0451\u0453\u045f"+
		"\u0467\u046e\u0479\u047d\u0481\u0498\u04a4\u04a7\u04ae\u04b6\u04bd\u04c1"+
		"\u04ca\u04d2\u04da\u04e2\u04ea\u04f2\u04fa\u0502\u050a\u0512\u051b\u052b"+
		"\u052d\u0538\u0541\u0543\u054b"
	private val _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray())

	protected final val _decisionToDFA =
		(0 until _ATN.getNumberOfDecisions())
		.map{i => new DFA(_ATN.getDecisionState(i), i)}
		.toArray


}
class ObjCParser(input: TokenStream) extends Parser(input) {
    import ObjCParser._

	_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache)

	override def getGrammarFileName() = "ObjC.g4"
	override def getRuleNames() = ruleNames
	override def getSerializedATN() = _serializedATN
	override def getATN() = _ATN
	override def getVocabulary() = VOCABULARY

	@deprecated("Use VOCABULARY instead.", "")
	override def getTokenNames() = tokenNames

	@throws(classOf[RecognitionException])
	private def matchToken(ttype: Int) = `match`(ttype)



	@throws(classOf[RecognitionException])
	final def translationUnit(): TranslationUnitContext = {
		val _localctx = new TranslationUnitContext(_ctx, getState)
		enterRule(_localctx, 0, RULE_translation_unit)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(251) 
			_errHandler.sync(this)
			_la = _input.LA(1)
			do {
				setState(250)
				externalDeclaration()
				setState(253) 
				_errHandler.sync(this)
				_la = _input.LA(1)
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << PROTOCOL) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (IMPORT - 133)) | (1L << (INCLUDE - 133)) | (1L << (COMMENT - 133)) | (1L << (LINE_COMMENT - 133)))) != 0) )
			setState(255)
			matchToken(EOF)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def externalDeclaration(): ExternalDeclarationContext = {
		val _localctx = new ExternalDeclarationContext(_ctx, getState)
		enterRule(_localctx, 2, RULE_external_declaration)
		try {
			setState(269)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,1,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(257)
				matchToken(COMMENT)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(258)
				matchToken(LINE_COMMENT)

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(259)
				preprocessorDeclaration()

			case 4 =>
				enterOuterAlt(_localctx, 4)
				setState(260)
				functionDefinition()

			case 5 =>
				enterOuterAlt(_localctx, 5)
				setState(261)
				declaration()

			case 6 =>
				enterOuterAlt(_localctx, 6)
				setState(262)
				classInterface()

			case 7 =>
				enterOuterAlt(_localctx, 7)
				setState(263)
				classImplementation()

			case 8 =>
				enterOuterAlt(_localctx, 8)
				setState(264)
				categoryInterface()

			case 9 =>
				enterOuterAlt(_localctx, 9)
				setState(265)
				categoryImplementation()

			case 10 =>
				enterOuterAlt(_localctx, 10)
				setState(266)
				protocolDeclaration()

			case 11 =>
				enterOuterAlt(_localctx, 11)
				setState(267)
				protocolDeclarationList()

			case 12 =>
				enterOuterAlt(_localctx, 12)
				setState(268)
				classDeclarationList()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def preprocessorDeclaration(): PreprocessorDeclarationContext = {
		val _localctx = new PreprocessorDeclarationContext(_ctx, getState)
		enterRule(_localctx, 4, RULE_preprocessor_declaration)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(271)
			_la = _input.LA(1)
			if ( !(_la==IMPORT || _la==INCLUDE) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def classInterface(): ClassInterfaceContext = {
		val _localctx = new ClassInterfaceContext(_ctx, getState)
		enterRule(_localctx, 6, RULE_class_interface)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(273)
			matchToken(INTERFACE)
			setState(274)
			className()
			setState(277)
			_la = _input.LA(1)
			if (_la==COLON) {
				setState(275)
				matchToken(COLON)
				setState(276)
				superclassName()
			}

			setState(280)
			_la = _input.LA(1)
			if (_la==LT) {
				setState(279)
				protocolReferenceList()
			}

			setState(283)
			_la = _input.LA(1)
			if (_la==LBRACE) {
				setState(282)
				instanceVariables()
			}

			setState(286)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				setState(285)
				interfaceDeclarationList()
			}

			setState(288)
			matchToken(END)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def categoryInterface(): CategoryInterfaceContext = {
		val _localctx = new CategoryInterfaceContext(_ctx, getState)
		enterRule(_localctx, 8, RULE_category_interface)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(290)
			matchToken(INTERFACE)
			setState(291)
			className()
			setState(292)
			matchToken(LPAREN)
			setState(294)
			_la = _input.LA(1)
			if (_la==IDENTIFIER) {
				setState(293)
				categoryName()
			}

			setState(296)
			matchToken(RPAREN)
			setState(298)
			_la = _input.LA(1)
			if (_la==LT) {
				setState(297)
				protocolReferenceList()
			}

			setState(301)
			_la = _input.LA(1)
			if (_la==LBRACE) {
				setState(300)
				instanceVariables()
			}

			setState(304)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				setState(303)
				interfaceDeclarationList()
			}

			setState(306)
			matchToken(END)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def classImplementation(): ClassImplementationContext = {
		val _localctx = new ClassImplementationContext(_ctx, getState)
		enterRule(_localctx, 10, RULE_class_implementation)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(308)
			matchToken(IMPLEMENTATION)

			setState(309)
			className()
			setState(312)
			_la = _input.LA(1)
			if (_la==COLON) {
				setState(310)
				matchToken(COLON)
				setState(311)
				superclassName()
			}

			setState(315)
			_la = _input.LA(1)
			if (_la==LBRACE) {
				setState(314)
				instanceVariables()
			}

			setState(318)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				setState(317)
				implementationDefinitionList()
			}

			setState(320)
			matchToken(END)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def categoryImplementation(): CategoryImplementationContext = {
		val _localctx = new CategoryImplementationContext(_ctx, getState)
		enterRule(_localctx, 12, RULE_category_implementation)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(322)
			matchToken(IMPLEMENTATION)

			setState(323)
			className()
			setState(324)
			matchToken(LPAREN)
			setState(325)
			categoryName()
			setState(326)
			matchToken(RPAREN)
			setState(328)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				setState(327)
				implementationDefinitionList()
			}

			setState(330)
			matchToken(END)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolDeclaration(): ProtocolDeclarationContext = {
		val _localctx = new ProtocolDeclarationContext(_ctx, getState)
		enterRule(_localctx, 14, RULE_protocol_declaration)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(332)
			matchToken(PROTOCOL)

			setState(333)
			protocolName()
			setState(335)
			_la = _input.LA(1)
			if (_la==LT) {
				setState(334)
				protocolReferenceList()
			}

			setState(342)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OPTIONAL) | (1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				setState(340)
				_input.LA(1) match {
				case PROPERTY | AUTO | BYCOPY | BYREF | CHAR | CONST | DOUBLE | ENUM | EXTERN | FLOAT | ID | IN | INOUT | INT | LONG | ONEWAY | OUT | REGISTER | SHORT | SIGNED | STATIC | STRUCT | TYPEDEF | UNION | UNSIGNED | VOID | VOLATILE | NS_OPTIONS | NS_ENUM | WWEAK | WUNSAFE_UNRETAINED | ADD | SUB | IDENTIFIER =>
					setState(337)
					interfaceDeclarationList()

				case OPTIONAL =>
					setState(338)
					matchToken(OPTIONAL)

				case T__0 =>
					setState(339)
					matchToken(T__0)

				case _ =>
					throw new NoViableAltException(this)
				}
				setState(344)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
			setState(345)
			matchToken(END)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolDeclarationList(): ProtocolDeclarationListContext = {
		val _localctx = new ProtocolDeclarationListContext(_ctx, getState)
		enterRule(_localctx, 16, RULE_protocol_declaration_list)
		try {
			enterOuterAlt(_localctx, 1)
			setState(347)
			matchToken(PROTOCOL)
			setState(348)
			protocolList()
			setState(349)
			matchToken(SEMI)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def classDeclarationList(): ClassDeclarationListContext = {
		val _localctx = new ClassDeclarationListContext(_ctx, getState)
		enterRule(_localctx, 18, RULE_class_declaration_list)
		try {
			enterOuterAlt(_localctx, 1)
			setState(351)
			matchToken(CLASS)
			setState(352)
			classList()
			setState(353)
			matchToken(SEMI)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def classList(): ClassListContext = {
		val _localctx = new ClassListContext(_ctx, getState)
		enterRule(_localctx, 20, RULE_class_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(355)
			className()
			setState(360)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(356)
				matchToken(COMMA)
				setState(357)
				className()
				setState(362)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolReferenceList(): ProtocolReferenceListContext = {
		val _localctx = new ProtocolReferenceListContext(_ctx, getState)
		enterRule(_localctx, 22, RULE_protocol_reference_list)
		try {
			enterOuterAlt(_localctx, 1)
			setState(363)
			matchToken(LT)
			setState(364)
			protocolList()
			setState(365)
			matchToken(GT)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolList(): ProtocolListContext = {
		val _localctx = new ProtocolListContext(_ctx, getState)
		enterRule(_localctx, 24, RULE_protocol_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(367)
			protocolName()
			setState(372)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(368)
				matchToken(COMMA)
				setState(369)
				protocolName()
				setState(374)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertyDeclaration(): PropertyDeclarationContext = {
		val _localctx = new PropertyDeclarationContext(_ctx, getState)
		enterRule(_localctx, 26, RULE_property_declaration)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(375)
			matchToken(PROPERTY)
			setState(377)
			_la = _input.LA(1)
			if (_la==LPAREN) {
				setState(376)
				propertyAttributesDeclaration()
			}

			setState(380)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,20,_ctx) match {
			case 1 =>
				setState(379)
				ibOutletSpecifier()

			case _ =>
			}
			setState(382)
			structDeclaration()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertyAttributesDeclaration(): PropertyAttributesDeclarationContext = {
		val _localctx = new PropertyAttributesDeclarationContext(_ctx, getState)
		enterRule(_localctx, 28, RULE_property_attributes_declaration)
		try {
			enterOuterAlt(_localctx, 1)
			setState(384)
			matchToken(LPAREN)
			setState(385)
			propertyAttributesList()
			setState(386)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertyAttributesList(): PropertyAttributesListContext = {
		val _localctx = new PropertyAttributesListContext(_ctx, getState)
		enterRule(_localctx, 30, RULE_property_attributes_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(388)
			propertyAttribute()
			setState(393)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(389)
				matchToken(COMMA)
				setState(390)
				propertyAttribute()
				setState(395)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertyAttribute(): PropertyAttributeContext = {
		val _localctx = new PropertyAttributeContext(_ctx, getState)
		enterRule(_localctx, 32, RULE_property_attribute)
		try {
			setState(412)
			_input.LA(1) match {
			case NONATOMIC =>
				enterOuterAlt(_localctx, 1)
				setState(396)
				matchToken(NONATOMIC)

			case ASSIGNPA =>
				enterOuterAlt(_localctx, 2)
				setState(397)
				matchToken(ASSIGNPA)

			case WEAK =>
				enterOuterAlt(_localctx, 3)
				setState(398)
				matchToken(WEAK)

			case STRONG =>
				enterOuterAlt(_localctx, 4)
				setState(399)
				matchToken(STRONG)

			case RETAIN =>
				enterOuterAlt(_localctx, 5)
				setState(400)
				matchToken(RETAIN)

			case READONLY =>
				enterOuterAlt(_localctx, 6)
				setState(401)
				matchToken(READONLY)

			case READWRITE =>
				enterOuterAlt(_localctx, 7)
				setState(402)
				matchToken(READWRITE)

			case RPAREN | COMMA =>
				enterOuterAlt(_localctx, 8)


			case GETTER =>
				enterOuterAlt(_localctx, 9)
				setState(404)
				matchToken(GETTER)
				setState(405)
				matchToken(ASSIGN)
				setState(406)
				matchToken(IDENTIFIER)

			case SETTER =>
				enterOuterAlt(_localctx, 10)
				setState(407)
				matchToken(SETTER)
				setState(408)
				matchToken(ASSIGN)
				setState(409)
				matchToken(IDENTIFIER)
				setState(410)
				matchToken(COLON)

			case IDENTIFIER =>
				enterOuterAlt(_localctx, 11)
				setState(411)
				matchToken(IDENTIFIER)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def ibOutletSpecifier(): IbOutletSpecifierContext = {
		val _localctx = new IbOutletSpecifierContext(_ctx, getState)
		enterRule(_localctx, 34, RULE_ib_outlet_specifier)
		try {
			setState(420)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,23,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(414)
				matchToken(IDENTIFIER)
				setState(415)
				matchToken(LPAREN)
				setState(416)
				className()
				setState(417)
				matchToken(RPAREN)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(419)
				matchToken(IDENTIFIER)

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def className(): ClassNameContext = {
		val _localctx = new ClassNameContext(_ctx, getState)
		enterRule(_localctx, 36, RULE_class_name)
		try {
			enterOuterAlt(_localctx, 1)
			setState(422)
			matchToken(IDENTIFIER)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def superclassName(): SuperclassNameContext = {
		val _localctx = new SuperclassNameContext(_ctx, getState)
		enterRule(_localctx, 38, RULE_superclass_name)
		try {
			enterOuterAlt(_localctx, 1)
			setState(424)
			matchToken(IDENTIFIER)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def categoryName(): CategoryNameContext = {
		val _localctx = new CategoryNameContext(_ctx, getState)
		enterRule(_localctx, 40, RULE_category_name)
		try {
			enterOuterAlt(_localctx, 1)
			setState(426)
			matchToken(IDENTIFIER)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolName(): ProtocolNameContext = {
		val _localctx = new ProtocolNameContext(_ctx, getState)
		enterRule(_localctx, 42, RULE_protocol_name)
		try {
			enterOuterAlt(_localctx, 1)
			setState(428)
			matchToken(IDENTIFIER)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def instanceVariables(): InstanceVariablesContext = {
		val _localctx = new InstanceVariablesContext(_ctx, getState)
		enterRule(_localctx, 44, RULE_instance_variables)
		var _la = 0
		try {
			setState(466)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,28,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(430)
				matchToken(LBRACE)
				setState(434)
				_errHandler.sync(this)
				_la = _input.LA(1)
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					setState(431)
					structDeclaration()
					setState(436)
					_errHandler.sync(this)
					_la = _input.LA(1)
				}
				setState(437)
				matchToken(RBRACE)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(438)
				matchToken(LBRACE)
				setState(439)
				visibilitySpecification()
				setState(441) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(440)
					structDeclaration()
					setState(443) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) )
				setState(445)
				matchToken(RBRACE)

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(447)
				matchToken(LBRACE)
				setState(449) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(448)
					structDeclaration()
					setState(451) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) )
				setState(453)
				instanceVariables()
				setState(454)
				matchToken(RBRACE)

			case 4 =>
				enterOuterAlt(_localctx, 4)
				setState(456)
				matchToken(LBRACE)
				setState(457)
				visibilitySpecification()
				setState(459) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(458)
					structDeclaration()
					setState(461) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) )
				setState(463)
				instanceVariables()
				setState(464)
				matchToken(RBRACE)

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def visibilitySpecification(): VisibilitySpecificationContext = {
		val _localctx = new VisibilitySpecificationContext(_ctx, getState)
		enterRule(_localctx, 46, RULE_visibility_specification)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(468)
			_la = _input.LA(1)
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def interfaceDeclarationList(): InterfaceDeclarationListContext = {
		val _localctx = new InterfaceDeclarationListContext(_ctx, getState)
		enterRule(_localctx, 48, RULE_interface_declaration_list)
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(474) 
			_errHandler.sync(this)
			_alt = 1
			do {
				_alt match {
				case 1 =>
					setState(474)
					_input.LA(1) match {
					case AUTO | BYCOPY | BYREF | CHAR | CONST | DOUBLE | ENUM | EXTERN | FLOAT | ID | IN | INOUT | INT | LONG | ONEWAY | OUT | REGISTER | SHORT | SIGNED | STATIC | STRUCT | TYPEDEF | UNION | UNSIGNED | VOID | VOLATILE | NS_OPTIONS | NS_ENUM | WWEAK | WUNSAFE_UNRETAINED | IDENTIFIER =>
						setState(470)
						declaration()

					case ADD =>
						setState(471)
						classMethodDeclaration()

					case SUB =>
						setState(472)
						instanceMethodDeclaration()

					case PROPERTY =>
						setState(473)
						propertyDeclaration()

					case _ =>
						throw new NoViableAltException(this)
					}

				case _ =>
					throw new NoViableAltException(this)
				}
				setState(476) 
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx)
			} while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER )
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def classMethodDeclaration(): ClassMethodDeclarationContext = {
		val _localctx = new ClassMethodDeclarationContext(_ctx, getState)
		enterRule(_localctx, 50, RULE_class_method_declaration)
		try {
			enterOuterAlt(_localctx, 1)
			setState(478)
			matchToken(ADD)
			setState(479)
			methodDeclaration()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def instanceMethodDeclaration(): InstanceMethodDeclarationContext = {
		val _localctx = new InstanceMethodDeclarationContext(_ctx, getState)
		enterRule(_localctx, 52, RULE_instance_method_declaration)
		try {
			enterOuterAlt(_localctx, 1)
			setState(481)
			matchToken(SUB)
			setState(482)
			methodDeclaration()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def methodDeclaration(): MethodDeclarationContext = {
		val _localctx = new MethodDeclarationContext(_ctx, getState)
		enterRule(_localctx, 54, RULE_method_declaration)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(485)
			_la = _input.LA(1)
			if (_la==LPAREN) {
				setState(484)
				methodType()
			}

			setState(487)
			methodSelector()
			setState(488)
			matchToken(SEMI)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def implementationDefinitionList(): ImplementationDefinitionListContext = {
		val _localctx = new ImplementationDefinitionListContext(_ctx, getState)
		enterRule(_localctx, 56, RULE_implementation_definition_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(495) 
			_errHandler.sync(this)
			_la = _input.LA(1)
			do {
				setState(495)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,32,_ctx) match {
				case 1 =>
					setState(490)
					functionDefinition()

				case 2 =>
					setState(491)
					declaration()

				case 3 =>
					setState(492)
					classMethodDefinition()

				case 4 =>
					setState(493)
					instanceMethodDefinition()

				case 5 =>
					setState(494)
					propertyImplementation()

				case _ =>
				}
				setState(497) 
				_errHandler.sync(this)
				_la = _input.LA(1)
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (IDENTIFIER - 64)))) != 0) )
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def classMethodDefinition(): ClassMethodDefinitionContext = {
		val _localctx = new ClassMethodDefinitionContext(_ctx, getState)
		enterRule(_localctx, 58, RULE_class_method_definition)
		try {
			enterOuterAlt(_localctx, 1)
			setState(499)
			matchToken(ADD)
			setState(500)
			methodDefinition()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def instanceMethodDefinition(): InstanceMethodDefinitionContext = {
		val _localctx = new InstanceMethodDefinitionContext(_ctx, getState)
		enterRule(_localctx, 60, RULE_instance_method_definition)
		try {
			enterOuterAlt(_localctx, 1)
			setState(502)
			matchToken(SUB)
			setState(503)
			methodDefinition()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def methodDefinition(): MethodDefinitionContext = {
		val _localctx = new MethodDefinitionContext(_ctx, getState)
		enterRule(_localctx, 62, RULE_method_definition)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(506)
			_la = _input.LA(1)
			if (_la==LPAREN) {
				setState(505)
				methodType()
			}

			setState(508)
			methodSelector()
			setState(510)
			_la = _input.LA(1)
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (MUL - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				setState(509)
				initDeclaratorList()
			}

			setState(513)
			_la = _input.LA(1)
			if (_la==SEMI) {
				setState(512)
				matchToken(SEMI)
			}

			setState(515)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def methodSelector(): MethodSelectorContext = {
		val _localctx = new MethodSelectorContext(_ctx, getState)
		enterRule(_localctx, 64, RULE_method_selector)
		try {
			var _alt = 0
			setState(526)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,39,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(517)
				selector()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(519) 
				_errHandler.sync(this)
				_alt = 1
				do {
					_alt match {
					case 1 =>
						setState(518)
						keywordDeclarator()

					case _ =>
						throw new NoViableAltException(this)
					}
					setState(521) 
					_errHandler.sync(this)
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx)
				} while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER )
				setState(524)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,38,_ctx) match {
				case 1 =>
					setState(523)
					parameterList()

				case _ =>
				}

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def keywordDeclarator(): KeywordDeclaratorContext = {
		val _localctx = new KeywordDeclaratorContext(_ctx, getState)
		enterRule(_localctx, 66, RULE_keyword_declarator)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(529)
			_la = _input.LA(1)
			if (_la==RETAIN || _la==IDENTIFIER) {
				setState(528)
				selector()
			}

			setState(531)
			matchToken(COLON)
			setState(535)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==LPAREN) {
				setState(532)
				methodType()
				setState(537)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
			setState(538)
			matchToken(IDENTIFIER)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def selector(): SelectorContext = {
		val _localctx = new SelectorContext(_ctx, getState)
		enterRule(_localctx, 68, RULE_selector)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(540)
			_la = _input.LA(1)
			if ( !(_la==RETAIN || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def methodType(): MethodTypeContext = {
		val _localctx = new MethodTypeContext(_ctx, getState)
		enterRule(_localctx, 70, RULE_method_type)
		try {
			enterOuterAlt(_localctx, 1)
			setState(542)
			matchToken(LPAREN)
			setState(543)
			typeName()
			setState(544)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertyImplementation(): PropertyImplementationContext = {
		val _localctx = new PropertyImplementationContext(_ctx, getState)
		enterRule(_localctx, 72, RULE_property_implementation)
		try {
			setState(554)
			_input.LA(1) match {
			case SYNTHESIZE =>
				enterOuterAlt(_localctx, 1)
				setState(546)
				matchToken(SYNTHESIZE)
				setState(547)
				propertySynthesizeList()
				setState(548)
				matchToken(SEMI)

			case DYNAMIC =>
				enterOuterAlt(_localctx, 2)
				setState(550)
				matchToken(DYNAMIC)
				setState(551)
				propertySynthesizeList()
				setState(552)
				matchToken(SEMI)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertySynthesizeList(): PropertySynthesizeListContext = {
		val _localctx = new PropertySynthesizeListContext(_ctx, getState)
		enterRule(_localctx, 74, RULE_property_synthesize_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(556)
			propertySynthesizeItem()
			setState(561)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(557)
				matchToken(COMMA)
				setState(558)
				propertySynthesizeItem()
				setState(563)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def propertySynthesizeItem(): PropertySynthesizeItemContext = {
		val _localctx = new PropertySynthesizeItemContext(_ctx, getState)
		enterRule(_localctx, 76, RULE_property_synthesize_item)
		try {
			setState(568)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,44,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(564)
				matchToken(IDENTIFIER)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(565)
				matchToken(IDENTIFIER)
				setState(566)
				matchToken(ASSIGN)
				setState(567)
				matchToken(IDENTIFIER)

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def blockType(): BlockTypeContext = {
		val _localctx = new BlockTypeContext(_ctx, getState)
		enterRule(_localctx, 78, RULE_block_type)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(570)
			typeSpecifier()
			setState(571)
			matchToken(LPAREN)
			setState(572)
			matchToken(CARET)
			setState(574)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NS_OPTIONS - 66)) | (1L << (NS_ENUM - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				setState(573)
				typeSpecifier()
			}

			setState(576)
			matchToken(RPAREN)
			setState(578)
			_la = _input.LA(1)
			if (_la==LPAREN) {
				setState(577)
				blockParameters()
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def typeSpecifier(): TypeSpecifierContext = {
		val _localctx = new TypeSpecifierContext(_ctx, getState)
		enterRule(_localctx, 80, RULE_type_specifier)
		var _la = 0
		try {
			setState(602)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,49,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(580)
				matchToken(VOID)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(581)
				matchToken(CHAR)

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(582)
				matchToken(SHORT)

			case 4 =>
				enterOuterAlt(_localctx, 4)
				setState(583)
				matchToken(INT)

			case 5 =>
				enterOuterAlt(_localctx, 5)
				setState(584)
				matchToken(LONG)

			case 6 =>
				enterOuterAlt(_localctx, 6)
				setState(585)
				matchToken(FLOAT)

			case 7 =>
				enterOuterAlt(_localctx, 7)
				setState(586)
				matchToken(DOUBLE)

			case 8 =>
				enterOuterAlt(_localctx, 8)
				setState(587)
				matchToken(SIGNED)

			case 9 =>
				enterOuterAlt(_localctx, 9)
				setState(588)
				matchToken(UNSIGNED)

			case 10 =>
				enterOuterAlt(_localctx, 10)
				setState(589)
				matchToken(ID)
				setState(591)
				_la = _input.LA(1)
				if (_la==LT) {
					setState(590)
					protocolReferenceList()
				}


			case 11 =>
				enterOuterAlt(_localctx, 11)
				setState(593)
				className()
				setState(595)
				_la = _input.LA(1)
				if (_la==LT) {
					setState(594)
					protocolReferenceList()
				}


			case 12 =>
				enterOuterAlt(_localctx, 12)
				setState(597)
				structOrUnionSpecifier()

			case 13 =>
				enterOuterAlt(_localctx, 13)
				setState(598)
				enumSpecifier()

			case 14 =>
				enterOuterAlt(_localctx, 14)
				setState(599)
				matchToken(IDENTIFIER)

			case 15 =>
				enterOuterAlt(_localctx, 15)
				setState(600)
				matchToken(IDENTIFIER)
				setState(601)
				pointer()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def typeQualifier(): TypeQualifierContext = {
		val _localctx = new TypeQualifierContext(_ctx, getState)
		enterRule(_localctx, 82, RULE_type_qualifier)
		try {
			setState(607)
			_input.LA(1) match {
			case CONST =>
				enterOuterAlt(_localctx, 1)
				setState(604)
				matchToken(CONST)

			case VOLATILE =>
				enterOuterAlt(_localctx, 2)
				setState(605)
				matchToken(VOLATILE)

			case BYCOPY | BYREF | IN | INOUT | ONEWAY | OUT =>
				enterOuterAlt(_localctx, 3)
				setState(606)
				protocolQualifier()

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolQualifier(): ProtocolQualifierContext = {
		val _localctx = new ProtocolQualifierContext(_ctx, getState)
		enterRule(_localctx, 84, RULE_protocol_qualifier)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(609)
			_la = _input.LA(1)
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0)) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def primaryExpression(): PrimaryExpressionContext = {
		val _localctx = new PrimaryExpressionContext(_ctx, getState)
		enterRule(_localctx, 86, RULE_primary_expression)
		try {
			setState(628)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,51,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(611)
				matchToken(IDENTIFIER)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(612)
				constant()

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(613)
				matchToken(STRING_LITERAL)

			case 4 =>
				enterOuterAlt(_localctx, 4)
				setState(614)
				matchToken(LPAREN)
				setState(615)
				expression()
				setState(616)
				matchToken(RPAREN)

			case 5 =>
				enterOuterAlt(_localctx, 5)
				setState(618)
				matchToken(SELF)

			case 6 =>
				enterOuterAlt(_localctx, 6)
				setState(619)
				matchToken(SUPER)

			case 7 =>
				enterOuterAlt(_localctx, 7)
				setState(620)
				messageExpression()

			case 8 =>
				enterOuterAlt(_localctx, 8)
				setState(621)
				selectorExpression()

			case 9 =>
				enterOuterAlt(_localctx, 9)
				setState(622)
				protocolExpression()

			case 10 =>
				enterOuterAlt(_localctx, 10)
				setState(623)
				encodeExpression()

			case 11 =>
				enterOuterAlt(_localctx, 11)
				setState(624)
				dictionaryExpression()

			case 12 =>
				enterOuterAlt(_localctx, 12)
				setState(625)
				arrayExpression()

			case 13 =>
				enterOuterAlt(_localctx, 13)
				setState(626)
				boxExpression()

			case 14 =>
				enterOuterAlt(_localctx, 14)
				setState(627)
				blockExpression()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def dictionaryPair(): DictionaryPairContext = {
		val _localctx = new DictionaryPairContext(_ctx, getState)
		enterRule(_localctx, 88, RULE_dictionary_pair)
		try {
			enterOuterAlt(_localctx, 1)
			setState(630)
			postfixExpression()
			setState(631)
			matchToken(COLON)
			setState(634)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,52,_ctx) match {
			case 1 =>
				setState(632)
				postfixExpression()

			case 2 =>
				setState(633)
				expression()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def dictionaryExpression(): DictionaryExpressionContext = {
		val _localctx = new DictionaryExpressionContext(_ctx, getState)
		enterRule(_localctx, 90, RULE_dictionary_expression)
		var _la = 0
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(636)
			matchToken(AT)
			setState(637)
			matchToken(LBRACE)
			setState(639)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
				setState(638)
				dictionaryPair()
			}

			setState(645)
			_errHandler.sync(this)
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx)
			while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt == 1 ) {
					setState(641)
					matchToken(COMMA)
					setState(642)
					dictionaryPair() 
				}
				setState(647)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx)
			}
			setState(649)
			_la = _input.LA(1)
			if (_la==COMMA) {
				setState(648)
				matchToken(COMMA)
			}

			setState(651)
			matchToken(RBRACE)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def arrayExpression(): ArrayExpressionContext = {
		val _localctx = new ArrayExpressionContext(_ctx, getState)
		enterRule(_localctx, 92, RULE_array_expression)
		var _la = 0
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(653)
			matchToken(AT)
			setState(654)
			matchToken(LBRACK)
			setState(656)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
				setState(655)
				postfixExpression()
			}

			setState(662)
			_errHandler.sync(this)
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx)
			while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt == 1 ) {
					setState(658)
					matchToken(COMMA)
					setState(659)
					postfixExpression() 
				}
				setState(664)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx)
			}
			setState(666)
			_la = _input.LA(1)
			if (_la==COMMA) {
				setState(665)
				matchToken(COMMA)
			}

			setState(668)
			matchToken(RBRACK)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def boxExpression(): BoxExpressionContext = {
		val _localctx = new BoxExpressionContext(_ctx, getState)
		enterRule(_localctx, 94, RULE_box_expression)
		try {
			setState(680)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,60,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(670)
				matchToken(AT)
				setState(671)
				matchToken(LPAREN)
				setState(674)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,59,_ctx) match {
				case 1 =>
					setState(672)
					postfixExpression()

				case 2 =>
					setState(673)
					expression()

				case _ =>
				}
				setState(676)
				matchToken(RPAREN)

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(678)
				matchToken(AT)
				setState(679)
				constant()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def blockParameters(): BlockParametersContext = {
		val _localctx = new BlockParametersContext(_ctx, getState)
		enterRule(_localctx, 96, RULE_block_parameters)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(682)
			matchToken(LPAREN)
			setState(686)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,61,_ctx) match {
			case 1 =>
				setState(683)
				typeVariableDeclarator()

			case 2 =>
				setState(684)
				typeName()

			case 3 =>
				setState(685)
				matchToken(VOID)

			case _ =>
			}
			setState(695)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(688)
				matchToken(COMMA)
				setState(691)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,62,_ctx) match {
				case 1 =>
					setState(689)
					typeVariableDeclarator()

				case 2 =>
					setState(690)
					typeName()

				case _ =>
				}
				setState(697)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
			setState(698)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def blockExpression(): BlockExpressionContext = {
		val _localctx = new BlockExpressionContext(_ctx, getState)
		enterRule(_localctx, 98, RULE_block_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(700)
			matchToken(CARET)
			setState(702)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NS_OPTIONS - 66)) | (1L << (NS_ENUM - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				setState(701)
				typeSpecifier()
			}

			setState(705)
			_la = _input.LA(1)
			if (_la==LPAREN) {
				setState(704)
				blockParameters()
			}

			setState(707)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def messageExpression(): MessageExpressionContext = {
		val _localctx = new MessageExpressionContext(_ctx, getState)
		enterRule(_localctx, 100, RULE_message_expression)
		try {
			enterOuterAlt(_localctx, 1)
			setState(709)
			matchToken(LBRACK)
			setState(710)
			receiver()
			setState(711)
			messageSelector()
			setState(712)
			matchToken(RBRACK)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def receiver(): ReceiverContext = {
		val _localctx = new ReceiverContext(_ctx, getState)
		enterRule(_localctx, 102, RULE_receiver)
		try {
			setState(717)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,66,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(714)
				expression()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(715)
				className()

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(716)
				matchToken(SUPER)

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def messageSelector(): MessageSelectorContext = {
		val _localctx = new MessageSelectorContext(_ctx, getState)
		enterRule(_localctx, 104, RULE_message_selector)
		var _la = 0
		try {
			setState(725)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,68,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(719)
				selector()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(721) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(720)
					keywordArgument()
					setState(723) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (COLON - 87)) | (1L << (RETAIN - 87)) | (1L << (IDENTIFIER - 87)))) != 0) )

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def keywordArgument(): KeywordArgumentContext = {
		val _localctx = new KeywordArgumentContext(_ctx, getState)
		enterRule(_localctx, 106, RULE_keyword_argument)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(728)
			_la = _input.LA(1)
			if (_la==RETAIN || _la==IDENTIFIER) {
				setState(727)
				selector()
			}

			setState(730)
			matchToken(COLON)
			setState(731)
			expression()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def selectorExpression(): SelectorExpressionContext = {
		val _localctx = new SelectorExpressionContext(_ctx, getState)
		enterRule(_localctx, 108, RULE_selector_expression)
		try {
			enterOuterAlt(_localctx, 1)
			setState(733)
			matchToken(SELECTOR)
			setState(734)
			matchToken(LPAREN)
			setState(735)
			selectorName()
			setState(736)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def selectorName(): SelectorNameContext = {
		val _localctx = new SelectorNameContext(_ctx, getState)
		enterRule(_localctx, 110, RULE_selector_name)
		var _la = 0
		try {
			setState(747)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,72,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(738)
				selector()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(743) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(740)
					_la = _input.LA(1)
					if (_la==RETAIN || _la==IDENTIFIER) {
						setState(739)
						selector()
					}

					setState(742)
					matchToken(COLON)
					setState(745) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (COLON - 87)) | (1L << (RETAIN - 87)) | (1L << (IDENTIFIER - 87)))) != 0) )

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def protocolExpression(): ProtocolExpressionContext = {
		val _localctx = new ProtocolExpressionContext(_ctx, getState)
		enterRule(_localctx, 112, RULE_protocol_expression)
		try {
			enterOuterAlt(_localctx, 1)
			setState(749)
			matchToken(PROTOCOL)
			setState(750)
			matchToken(LPAREN)
			setState(751)
			protocolName()
			setState(752)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def encodeExpression(): EncodeExpressionContext = {
		val _localctx = new EncodeExpressionContext(_ctx, getState)
		enterRule(_localctx, 114, RULE_encode_expression)
		try {
			enterOuterAlt(_localctx, 1)
			setState(754)
			matchToken(ENCODE)
			setState(755)
			matchToken(LPAREN)
			setState(756)
			typeName()
			setState(757)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def typeVariableDeclarator(): TypeVariableDeclaratorContext = {
		val _localctx = new TypeVariableDeclaratorContext(_ctx, getState)
		enterRule(_localctx, 116, RULE_type_variable_declarator)
		try {
			enterOuterAlt(_localctx, 1)
			setState(759)
			declarationSpecifiers()
			setState(760)
			declarator()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def tryStatement(): TryStatementContext = {
		val _localctx = new TryStatementContext(_ctx, getState)
		enterRule(_localctx, 118, RULE_try_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(762)
			matchToken(TRY)
			setState(763)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def catchStatement(): CatchStatementContext = {
		val _localctx = new CatchStatementContext(_ctx, getState)
		enterRule(_localctx, 120, RULE_catch_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(765)
			matchToken(CATCH)
			setState(766)
			matchToken(LPAREN)
			setState(767)
			typeVariableDeclarator()
			setState(768)
			matchToken(RPAREN)
			setState(769)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def finallyStatement(): FinallyStatementContext = {
		val _localctx = new FinallyStatementContext(_ctx, getState)
		enterRule(_localctx, 122, RULE_finally_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(771)
			matchToken(FINALLY)
			setState(772)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def throwStatement(): ThrowStatementContext = {
		val _localctx = new ThrowStatementContext(_ctx, getState)
		enterRule(_localctx, 124, RULE_throw_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(774)
			matchToken(THROW)
			setState(775)
			matchToken(LPAREN)
			setState(776)
			matchToken(IDENTIFIER)
			setState(777)
			matchToken(RPAREN)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def tryBlock(): TryBlockContext = {
		val _localctx = new TryBlockContext(_ctx, getState)
		enterRule(_localctx, 126, RULE_try_block)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(779)
			tryStatement()
			setState(783)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==CATCH) {
				setState(780)
				catchStatement()
				setState(785)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
			setState(787)
			_la = _input.LA(1)
			if (_la==FINALLY) {
				setState(786)
				finallyStatement()
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def synchronizedStatement(): SynchronizedStatementContext = {
		val _localctx = new SynchronizedStatementContext(_ctx, getState)
		enterRule(_localctx, 128, RULE_synchronized_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(789)
			matchToken(SYNCHRONIZED)
			setState(790)
			matchToken(LPAREN)
			setState(791)
			primaryExpression()
			setState(792)
			matchToken(RPAREN)
			setState(793)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def autoreleaseStatement(): AutoreleaseStatementContext = {
		val _localctx = new AutoreleaseStatementContext(_ctx, getState)
		enterRule(_localctx, 130, RULE_autorelease_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(795)
			matchToken(AUTORELEASEPOOL)
			setState(796)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def functionDefinition(): FunctionDefinitionContext = {
		val _localctx = new FunctionDefinitionContext(_ctx, getState)
		enterRule(_localctx, 132, RULE_function_definition)
		try {
			enterOuterAlt(_localctx, 1)
			setState(799)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,75,_ctx) match {
			case 1 =>
				setState(798)
				declarationSpecifiers()

			case _ =>
			}
			setState(801)
			declarator()
			setState(802)
			compoundStatement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def declaration(): DeclarationContext = {
		val _localctx = new DeclarationContext(_ctx, getState)
		enterRule(_localctx, 134, RULE_declaration)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(804)
			declarationSpecifiers()
			setState(806)
			_la = _input.LA(1)
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (MUL - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				setState(805)
				initDeclaratorList()
			}

			setState(808)
			matchToken(SEMI)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def declarationSpecifiers(): DeclarationSpecifiersContext = {
		val _localctx = new DeclarationSpecifiersContext(_ctx, getState)
		enterRule(_localctx, 136, RULE_declaration_specifiers)
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(814) 
			_errHandler.sync(this)
			_alt = 1
			do {
				_alt match {
				case 1 =>
					setState(814)
					_input.LA(1) match {
					case WWEAK | WUNSAFE_UNRETAINED =>
						setState(810)
						arcBehaviourSpecifier()

					case AUTO | EXTERN | REGISTER | STATIC | TYPEDEF =>
						setState(811)
						storageClassSpecifier()

					case CHAR | DOUBLE | ENUM | FLOAT | ID | INT | LONG | SHORT | SIGNED | STRUCT | UNION | UNSIGNED | VOID | NS_OPTIONS | NS_ENUM | IDENTIFIER =>
						setState(812)
						typeSpecifier()

					case BYCOPY | BYREF | CONST | IN | INOUT | ONEWAY | OUT | VOLATILE =>
						setState(813)
						typeQualifier()

					case _ =>
						throw new NoViableAltException(this)
					}

				case _ =>
					throw new NoViableAltException(this)
				}
				setState(816) 
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx)
			} while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER )
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def arcBehaviourSpecifier(): ArcBehaviourSpecifierContext = {
		val _localctx = new ArcBehaviourSpecifierContext(_ctx, getState)
		enterRule(_localctx, 138, RULE_arc_behaviour_specifier)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(818)
			_la = _input.LA(1)
			if ( !(_la==WWEAK || _la==WUNSAFE_UNRETAINED) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def storageClassSpecifier(): StorageClassSpecifierContext = {
		val _localctx = new StorageClassSpecifierContext(_ctx, getState)
		enterRule(_localctx, 140, RULE_storage_class_specifier)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(820)
			_la = _input.LA(1)
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def initDeclaratorList(): InitDeclaratorListContext = {
		val _localctx = new InitDeclaratorListContext(_ctx, getState)
		enterRule(_localctx, 142, RULE_init_declarator_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(822)
			initDeclarator()
			setState(827)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(823)
				matchToken(COMMA)
				setState(824)
				initDeclarator()
				setState(829)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def initDeclarator(): InitDeclaratorContext = {
		val _localctx = new InitDeclaratorContext(_ctx, getState)
		enterRule(_localctx, 144, RULE_init_declarator)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(830)
			declarator()
			setState(833)
			_la = _input.LA(1)
			if (_la==ASSIGN) {
				setState(831)
				matchToken(ASSIGN)
				setState(832)
				initializer()
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def structOrUnionSpecifier(): StructOrUnionSpecifierContext = {
		val _localctx = new StructOrUnionSpecifierContext(_ctx, getState)
		enterRule(_localctx, 146, RULE_struct_or_union_specifier)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(835)
			_la = _input.LA(1)
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
			setState(848)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,83,_ctx) match {
			case 1 =>
				setState(836)
				matchToken(IDENTIFIER)

			case 2 =>
				setState(838)
				_la = _input.LA(1)
				if (_la==IDENTIFIER) {
					setState(837)
					matchToken(IDENTIFIER)
				}

				setState(840)
				matchToken(LBRACE)
				setState(842) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(841)
					structDeclaration()
					setState(844) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0) )
				setState(846)
				matchToken(RBRACE)

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def structDeclaration(): StructDeclarationContext = {
		val _localctx = new StructDeclarationContext(_ctx, getState)
		enterRule(_localctx, 148, RULE_struct_declaration)
		try {
			enterOuterAlt(_localctx, 1)
			setState(850)
			specifierQualifierList()
			setState(851)
			structDeclaratorList()
			setState(852)
			matchToken(SEMI)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def specifierQualifierList(): SpecifierQualifierListContext = {
		val _localctx = new SpecifierQualifierListContext(_ctx, getState)
		enterRule(_localctx, 150, RULE_specifier_qualifier_list)
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(857) 
			_errHandler.sync(this)
			_alt = 1
			do {
				_alt match {
				case 1 =>
					setState(857)
					_input.LA(1) match {
					case WWEAK | WUNSAFE_UNRETAINED =>
						setState(854)
						arcBehaviourSpecifier()

					case CHAR | DOUBLE | ENUM | FLOAT | ID | INT | LONG | SHORT | SIGNED | STRUCT | UNION | UNSIGNED | VOID | NS_OPTIONS | NS_ENUM | IDENTIFIER =>
						setState(855)
						typeSpecifier()

					case BYCOPY | BYREF | CONST | IN | INOUT | ONEWAY | OUT | VOLATILE =>
						setState(856)
						typeQualifier()

					case _ =>
						throw new NoViableAltException(this)
					}

				case _ =>
					throw new NoViableAltException(this)
				}
				setState(859) 
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx)
			} while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER )
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def structDeclaratorList(): StructDeclaratorListContext = {
		val _localctx = new StructDeclaratorListContext(_ctx, getState)
		enterRule(_localctx, 152, RULE_struct_declarator_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(861)
			structDeclarator()
			setState(866)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(862)
				matchToken(COMMA)
				setState(863)
				structDeclarator()
				setState(868)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def structDeclarator(): StructDeclaratorContext = {
		val _localctx = new StructDeclaratorContext(_ctx, getState)
		enterRule(_localctx, 154, RULE_struct_declarator)
		var _la = 0
		try {
			setState(875)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,88,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(869)
				declarator()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(871)
				_la = _input.LA(1)
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (MUL - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					setState(870)
					declarator()
				}

				setState(873)
				matchToken(COLON)
				setState(874)
				constant()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def enumSpecifier(): EnumSpecifierContext = {
		val _localctx = new EnumSpecifierContext(_ctx, getState)
		enterRule(_localctx, 156, RULE_enum_specifier)
		var _la = 0
		try {
			setState(918)
			_input.LA(1) match {
			case ENUM =>
				enterOuterAlt(_localctx, 1)
				setState(877)
				matchToken(ENUM)
				setState(883)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,90,_ctx) match {
				case 1 =>
					setState(879)
					_la = _input.LA(1)
					if (_la==IDENTIFIER) {
						setState(878)
						matchToken(IDENTIFIER)
					}

					setState(881)
					matchToken(COLON)
					setState(882)
					typeName()

				case _ =>
				}
				setState(896)
				_input.LA(1) match {
				case IDENTIFIER =>
					setState(885)
					identifier()
					setState(890)
					_errHandler.sync(this)
					getInterpreter().adaptivePredict(_input,91,_ctx) match {
					case 1 =>
						setState(886)
						matchToken(LBRACE)
						setState(887)
						enumeratorList()
						setState(888)
						matchToken(RBRACE)

					case _ =>
					}

				case LBRACE =>
					setState(892)
					matchToken(LBRACE)
					setState(893)
					enumeratorList()
					setState(894)
					matchToken(RBRACE)

				case _ =>
					throw new NoViableAltException(this)
				}

			case NS_OPTIONS =>
				enterOuterAlt(_localctx, 2)
				setState(898)
				matchToken(NS_OPTIONS)
				setState(899)
				matchToken(LPAREN)
				setState(900)
				typeName()
				setState(901)
				matchToken(COMMA)
				setState(902)
				identifier()
				setState(903)
				matchToken(RPAREN)
				setState(904)
				matchToken(LBRACE)
				setState(905)
				enumeratorList()
				setState(906)
				matchToken(RBRACE)

			case NS_ENUM =>
				enterOuterAlt(_localctx, 3)
				setState(908)
				matchToken(NS_ENUM)
				setState(909)
				matchToken(LPAREN)
				setState(910)
				typeName()
				setState(911)
				matchToken(COMMA)
				setState(912)
				identifier()
				setState(913)
				matchToken(RPAREN)
				setState(914)
				matchToken(LBRACE)
				setState(915)
				enumeratorList()
				setState(916)
				matchToken(RBRACE)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def enumeratorList(): EnumeratorListContext = {
		val _localctx = new EnumeratorListContext(_ctx, getState)
		enterRule(_localctx, 158, RULE_enumerator_list)
		var _la = 0
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(920)
			enumerator()
			setState(925)
			_errHandler.sync(this)
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx)
			while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt == 1 ) {
					setState(921)
					matchToken(COMMA)
					setState(922)
					enumerator() 
				}
				setState(927)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx)
			}
			setState(929)
			_la = _input.LA(1)
			if (_la==COMMA) {
				setState(928)
				matchToken(COMMA)
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def enumerator(): EnumeratorContext = {
		val _localctx = new EnumeratorContext(_ctx, getState)
		enterRule(_localctx, 160, RULE_enumerator)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(931)
			identifier()
			setState(934)
			_la = _input.LA(1)
			if (_la==ASSIGN) {
				setState(932)
				matchToken(ASSIGN)
				setState(933)
				constantExpression()
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def pointer(): PointerContext = {
		val _localctx = new PointerContext(_ctx, getState)
		enterRule(_localctx, 162, RULE_pointer)
		var _la = 0
		try {
			setState(945)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,99,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(936)
				matchToken(MUL)
				setState(938)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,97,_ctx) match {
				case 1 =>
					setState(937)
					declarationSpecifiers()

				case _ =>
				}

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(940)
				matchToken(MUL)
				setState(942)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					setState(941)
					declarationSpecifiers()
				}

				setState(944)
				pointer()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def declarator(): DeclaratorContext = {
		val _localctx = new DeclaratorContext(_ctx, getState)
		enterRule(_localctx, 164, RULE_declarator)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(948)
			_la = _input.LA(1)
			if (_la==MUL) {
				setState(947)
				pointer()
			}

			setState(950)
			directDeclarator()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def directDeclarator(): DirectDeclaratorContext = {
		val _localctx = new DirectDeclaratorContext(_ctx, getState)
		enterRule(_localctx, 166, RULE_direct_declarator)
		var _la = 0
		try {
			var _alt = 0
			setState(975)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,104,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(952)
				identifier()
				setState(956)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx)
				while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt == 1 ) {
						setState(953)
						declaratorSuffix() 
					}
					setState(958)
					_errHandler.sync(this)
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx)
				}

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(959)
				matchToken(LPAREN)
				setState(960)
				declarator()
				setState(961)
				matchToken(RPAREN)
				setState(965)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx)
				while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt == 1 ) {
						setState(962)
						declaratorSuffix() 
					}
					setState(967)
					_errHandler.sync(this)
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx)
				}

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(968)
				matchToken(LPAREN)
				setState(969)
				matchToken(CARET)
				setState(971)
				_la = _input.LA(1)
				if (_la==IDENTIFIER) {
					setState(970)
					identifier()
				}

				setState(973)
				matchToken(RPAREN)
				setState(974)
				blockParameters()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def declaratorSuffix(): DeclaratorSuffixContext = {
		val _localctx = new DeclaratorSuffixContext(_ctx, getState)
		enterRule(_localctx, 168, RULE_declarator_suffix)
		var _la = 0
		try {
			setState(987)
			_input.LA(1) match {
			case LBRACK =>
				enterOuterAlt(_localctx, 1)
				setState(977)
				matchToken(LBRACK)
				setState(979)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
					setState(978)
					constantExpression()
				}

				setState(981)
				matchToken(RBRACK)

			case LPAREN =>
				enterOuterAlt(_localctx, 2)
				setState(982)
				matchToken(LPAREN)
				setState(984)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					setState(983)
					parameterList()
				}

				setState(986)
				matchToken(RPAREN)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def parameterList(): ParameterListContext = {
		val _localctx = new ParameterListContext(_ctx, getState)
		enterRule(_localctx, 170, RULE_parameter_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(989)
			parameterDeclarationList()
			setState(992)
			_la = _input.LA(1)
			if (_la==COMMA) {
				setState(990)
				matchToken(COMMA)
				setState(991)
				matchToken(ELIPSIS)
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def parameterDeclaration(): ParameterDeclarationContext = {
		val _localctx = new ParameterDeclarationContext(_ctx, getState)
		enterRule(_localctx, 172, RULE_parameter_declaration)
		try {
			enterOuterAlt(_localctx, 1)
			setState(994)
			declarationSpecifiers()
			setState(999)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,110,_ctx) match {
			case 1 =>
				setState(996)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,109,_ctx) match {
				case 1 =>
					setState(995)
					declarator()

				case _ =>
				}

			case 2 =>
				setState(998)
				abstractDeclarator()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def initializer(): InitializerContext = {
		val _localctx = new InitializerContext(_ctx, getState)
		enterRule(_localctx, 174, RULE_initializer)
		var _la = 0
		try {
			var _alt = 0
			setState(1016)
			_input.LA(1) match {
			case ENCODE | PROTOCOL | SELECTOR | SUPER | SELF | SIZEOF | LPAREN | LBRACK | AT | BANG | TILDE | INC | DEC | SUB | MUL | BITAND | CARET | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL =>
				enterOuterAlt(_localctx, 1)
				setState(1001)
				assignmentExpression()

			case LBRACE =>
				enterOuterAlt(_localctx, 2)
				setState(1002)
				matchToken(LBRACE)
				setState(1003)
				initializer()
				setState(1008)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx)
				while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt == 1 ) {
						setState(1004)
						matchToken(COMMA)
						setState(1005)
						initializer() 
					}
					setState(1010)
					_errHandler.sync(this)
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx)
				}
				setState(1012)
				_la = _input.LA(1)
				if (_la==COMMA) {
					setState(1011)
					matchToken(COMMA)
				}

				setState(1014)
				matchToken(RBRACE)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def typeName(): TypeNameContext = {
		val _localctx = new TypeNameContext(_ctx, getState)
		enterRule(_localctx, 176, RULE_type_name)
		try {
			setState(1022)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,114,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(1018)
				specifierQualifierList()
				setState(1019)
				abstractDeclarator()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(1021)
				blockType()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def abstractDeclarator(): AbstractDeclaratorContext = {
		val _localctx = new AbstractDeclaratorContext(_ctx, getState)
		enterRule(_localctx, 178, RULE_abstract_declarator)
		var _la = 0
		try {
			var _alt = 0
			setState(1045)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,118,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(1024)
				pointer()
				setState(1025)
				abstractDeclarator()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(1027)
				matchToken(LPAREN)
				setState(1028)
				abstractDeclarator()
				setState(1029)
				matchToken(RPAREN)
				setState(1031) 
				_errHandler.sync(this)
				_alt = 1
				do {
					_alt match {
					case 1 =>
						setState(1030)
						abstractDeclaratorSuffix()

					case _ =>
						throw new NoViableAltException(this)
					}
					setState(1033) 
					_errHandler.sync(this)
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx)
				} while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER )

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(1040) 
				_errHandler.sync(this)
				_la = _input.LA(1)
				do {
					setState(1035)
					matchToken(LBRACK)
					setState(1037)
					_la = _input.LA(1)
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
						setState(1036)
						constantExpression()
					}

					setState(1039)
					matchToken(RBRACK)
					setState(1042) 
					_errHandler.sync(this)
					_la = _input.LA(1)
				} while ( _la==LBRACK )

			case 4 =>
				enterOuterAlt(_localctx, 4)


			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def abstractDeclaratorSuffix(): AbstractDeclaratorSuffixContext = {
		val _localctx = new AbstractDeclaratorSuffixContext(_ctx, getState)
		enterRule(_localctx, 180, RULE_abstract_declarator_suffix)
		var _la = 0
		try {
			setState(1057)
			_input.LA(1) match {
			case LBRACK =>
				enterOuterAlt(_localctx, 1)
				setState(1047)
				matchToken(LBRACK)
				setState(1049)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
					setState(1048)
					constantExpression()
				}

				setState(1051)
				matchToken(RBRACK)

			case LPAREN =>
				enterOuterAlt(_localctx, 2)
				setState(1052)
				matchToken(LPAREN)
				setState(1054)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					setState(1053)
					parameterDeclarationList()
				}

				setState(1056)
				matchToken(RPAREN)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def parameterDeclarationList(): ParameterDeclarationListContext = {
		val _localctx = new ParameterDeclarationListContext(_ctx, getState)
		enterRule(_localctx, 182, RULE_parameter_declaration_list)
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(1059)
			parameterDeclaration()
			setState(1064)
			_errHandler.sync(this)
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx)
			while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt == 1 ) {
					setState(1060)
					matchToken(COMMA)
					setState(1061)
					parameterDeclaration() 
				}
				setState(1066)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def statementList(): StatementListContext = {
		val _localctx = new StatementListContext(_ctx, getState)
		enterRule(_localctx, 184, RULE_statement_list)
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(1068) 
			_errHandler.sync(this)
			_alt = 1
			do {
				_alt match {
				case 1 =>
					setState(1067)
					statement()

				case _ =>
					throw new NoViableAltException(this)
				}
				setState(1070) 
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx)
			} while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER )
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def statement(): StatementContext = {
		val _localctx = new StatementContext(_ctx, getState)
		enterRule(_localctx, 186, RULE_statement)
		try {
			setState(1084)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,124,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(1072)
				labeledStatement()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(1073)
				expression()
				setState(1074)
				matchToken(SEMI)

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(1076)
				compoundStatement()

			case 4 =>
				enterOuterAlt(_localctx, 4)
				setState(1077)
				selectionStatement()

			case 5 =>
				enterOuterAlt(_localctx, 5)
				setState(1078)
				iterationStatement()

			case 6 =>
				enterOuterAlt(_localctx, 6)
				setState(1079)
				jumpStatement()

			case 7 =>
				enterOuterAlt(_localctx, 7)
				setState(1080)
				synchronizedStatement()

			case 8 =>
				enterOuterAlt(_localctx, 8)
				setState(1081)
				autoreleaseStatement()

			case 9 =>
				enterOuterAlt(_localctx, 9)
				setState(1082)
				tryBlock()

			case 10 =>
				enterOuterAlt(_localctx, 10)
				setState(1083)
				matchToken(SEMI)

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def labeledStatement(): LabeledStatementContext = {
		val _localctx = new LabeledStatementContext(_ctx, getState)
		enterRule(_localctx, 188, RULE_labeled_statement)
		try {
			setState(1098)
			_input.LA(1) match {
			case IDENTIFIER =>
				enterOuterAlt(_localctx, 1)
				setState(1086)
				identifier()
				setState(1087)
				matchToken(COLON)
				setState(1088)
				statement()

			case CASE =>
				enterOuterAlt(_localctx, 2)
				setState(1090)
				matchToken(CASE)
				setState(1091)
				constantExpression()
				setState(1092)
				matchToken(COLON)
				setState(1093)
				statement()

			case DEFAULT =>
				enterOuterAlt(_localctx, 3)
				setState(1095)
				matchToken(DEFAULT)
				setState(1096)
				matchToken(COLON)
				setState(1097)
				statement()

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def compoundStatement(): CompoundStatementContext = {
		val _localctx = new CompoundStatementContext(_ctx, getState)
		enterRule(_localctx, 190, RULE_compound_statement)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1100)
			matchToken(LBRACE)
			setState(1105)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << TRY) | (1L << SUPER) | (1L << SELF) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CASE) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (STRING_LITERAL - 128)) | (1L << (HEX_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (FLOATING_POINT_LITERAL - 128)))) != 0)) {
				setState(1103)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,126,_ctx) match {
				case 1 =>
					setState(1101)
					declaration()

				case 2 =>
					setState(1102)
					statementList()

				case _ =>
				}
				setState(1107)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
			setState(1108)
			matchToken(RBRACE)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def selectionStatement(): SelectionStatementContext = {
		val _localctx = new SelectionStatementContext(_ctx, getState)
		enterRule(_localctx, 192, RULE_selection_statement)
		try {
			setState(1125)
			_input.LA(1) match {
			case IF =>
				enterOuterAlt(_localctx, 1)
				setState(1110)
				matchToken(IF)
				setState(1111)
				matchToken(LPAREN)
				setState(1112)
				expression()
				setState(1113)
				matchToken(RPAREN)
				setState(1114)
				statement()
				setState(1117)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,128,_ctx) match {
				case 1 =>
					setState(1115)
					matchToken(ELSE)
					setState(1116)
					statement()

				case _ =>
				}

			case SWITCH =>
				enterOuterAlt(_localctx, 2)
				setState(1119)
				matchToken(SWITCH)
				setState(1120)
				matchToken(LPAREN)
				setState(1121)
				expression()
				setState(1122)
				matchToken(RPAREN)
				setState(1123)
				statement()

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def forInStatement(): ForInStatementContext = {
		val _localctx = new ForInStatementContext(_ctx, getState)
		enterRule(_localctx, 194, RULE_for_in_statement)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1127)
			matchToken(FOR)
			setState(1128)
			matchToken(LPAREN)
			setState(1129)
			typeVariableDeclarator()
			setState(1130)
			matchToken(IN)
			setState(1132)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
				setState(1131)
				expression()
			}

			setState(1134)
			matchToken(RPAREN)
			setState(1135)
			statement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def forStatement(): ForStatementContext = {
		val _localctx = new ForStatementContext(_ctx, getState)
		enterRule(_localctx, 196, RULE_for_statement)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1137)
			matchToken(FOR)
			setState(1138)
			matchToken(LPAREN)
			setState(1143)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,131,_ctx) match {
			case 1 =>
				setState(1139)
				declarationSpecifiers()
				setState(1140)
				initDeclaratorList()

			case 2 =>
				setState(1142)
				expression()

			case _ =>
			}
			setState(1145)
			matchToken(SEMI)
			setState(1147)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
				setState(1146)
				expression()
			}

			setState(1149)
			matchToken(SEMI)
			setState(1151)
			_la = _input.LA(1)
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
				setState(1150)
				expression()
			}

			setState(1153)
			matchToken(RPAREN)
			setState(1154)
			statement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def whileStatement(): WhileStatementContext = {
		val _localctx = new WhileStatementContext(_ctx, getState)
		enterRule(_localctx, 198, RULE_while_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(1156)
			matchToken(WHILE)
			setState(1157)
			matchToken(LPAREN)
			setState(1158)
			expression()
			setState(1159)
			matchToken(RPAREN)
			setState(1160)
			statement()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def doStatement(): DoStatementContext = {
		val _localctx = new DoStatementContext(_ctx, getState)
		enterRule(_localctx, 200, RULE_do_statement)
		try {
			enterOuterAlt(_localctx, 1)
			setState(1162)
			matchToken(DO)
			setState(1163)
			statement()
			setState(1164)
			matchToken(WHILE)
			setState(1165)
			matchToken(LPAREN)
			setState(1166)
			expression()
			setState(1167)
			matchToken(RPAREN)
			setState(1168)
			matchToken(SEMI)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def iterationStatement(): IterationStatementContext = {
		val _localctx = new IterationStatementContext(_ctx, getState)
		enterRule(_localctx, 202, RULE_iteration_statement)
		try {
			setState(1174)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,134,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(1170)
				whileStatement()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(1171)
				doStatement()

			case 3 =>
				enterOuterAlt(_localctx, 3)
				setState(1172)
				forStatement()

			case 4 =>
				enterOuterAlt(_localctx, 4)
				setState(1173)
				forInStatement()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def jumpStatement(): JumpStatementContext = {
		val _localctx = new JumpStatementContext(_ctx, getState)
		enterRule(_localctx, 204, RULE_jump_statement)
		var _la = 0
		try {
			setState(1189)
			_input.LA(1) match {
			case GOTO =>
				enterOuterAlt(_localctx, 1)
				setState(1176)
				matchToken(GOTO)
				setState(1177)
				identifier()
				setState(1178)
				matchToken(SEMI)

			case CONTINUE =>
				enterOuterAlt(_localctx, 2)
				setState(1180)
				matchToken(CONTINUE)
				setState(1181)
				matchToken(SEMI)

			case BREAK =>
				enterOuterAlt(_localctx, 3)
				setState(1182)
				matchToken(BREAK)
				setState(1183)
				matchToken(SEMI)

			case RETURN =>
				enterOuterAlt(_localctx, 4)
				setState(1184)
				matchToken(RETURN)
				setState(1186)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
					setState(1185)
					expression()
				}

				setState(1188)
				matchToken(SEMI)

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def expression(): ExpressionContext = {
		val _localctx = new ExpressionContext(_ctx, getState)
		enterRule(_localctx, 206, RULE_expression)
		try {
			var _alt = 0
			enterOuterAlt(_localctx, 1)
			setState(1191)
			assignmentExpression()
			setState(1196)
			_errHandler.sync(this)
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx)
			while ( _alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt == 1 ) {
					setState(1192)
					matchToken(COMMA)
					setState(1193)
					assignmentExpression() 
				}
				setState(1198)
				_errHandler.sync(this)
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def assignmentExpression(): AssignmentExpressionContext = {
		val _localctx = new AssignmentExpressionContext(_ctx, getState)
		enterRule(_localctx, 208, RULE_assignment_expression)
		try {
			setState(1204)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,138,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(1199)
				conditionalExpression()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(1200)
				unaryExpression()
				setState(1201)
				assignmentOperator()
				setState(1202)
				assignmentExpression()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def assignmentOperator(): AssignmentOperatorContext = {
		val _localctx = new AssignmentOperatorContext(_ctx, getState)
		enterRule(_localctx, 210, RULE_assignment_operator)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1206)
			_la = _input.LA(1)
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ASSIGN - 81)) | (1L << (ADD_ASSIGN - 81)) | (1L << (SUB_ASSIGN - 81)) | (1L << (MUL_ASSIGN - 81)) | (1L << (DIV_ASSIGN - 81)) | (1L << (AND_ASSIGN - 81)) | (1L << (OR_ASSIGN - 81)) | (1L << (XOR_ASSIGN - 81)) | (1L << (MOD_ASSIGN - 81)) | (1L << (LSHIFT_ASSIGN - 81)) | (1L << (RSHIFT_ASSIGN - 81)))) != 0)) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def conditionalExpression(): ConditionalExpressionContext = {
		val _localctx = new ConditionalExpressionContext(_ctx, getState)
		enterRule(_localctx, 212, RULE_conditional_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1208)
			logicalOrExpression()
			setState(1215)
			_la = _input.LA(1)
			if (_la==QUESTION) {
				setState(1209)
				matchToken(QUESTION)
				setState(1211)
				_la = _input.LA(1)
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
					setState(1210)
					conditionalExpression()
				}

				setState(1213)
				matchToken(COLON)
				setState(1214)
				conditionalExpression()
			}

		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def constantExpression(): ConstantExpressionContext = {
		val _localctx = new ConstantExpressionContext(_ctx, getState)
		enterRule(_localctx, 214, RULE_constant_expression)
		try {
			enterOuterAlt(_localctx, 1)
			setState(1217)
			conditionalExpression()
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def logicalOrExpression(): LogicalOrExpressionContext = {
		val _localctx = new LogicalOrExpressionContext(_ctx, getState)
		enterRule(_localctx, 216, RULE_logical_or_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1219)
			logicalAndExpression()
			setState(1224)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==OR) {
				setState(1220)
				matchToken(OR)
				setState(1221)
				logicalAndExpression()
				setState(1226)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def logicalAndExpression(): LogicalAndExpressionContext = {
		val _localctx = new LogicalAndExpressionContext(_ctx, getState)
		enterRule(_localctx, 218, RULE_logical_and_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1227)
			inclusiveOrExpression()
			setState(1232)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==AND) {
				setState(1228)
				matchToken(AND)
				setState(1229)
				inclusiveOrExpression()
				setState(1234)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def inclusiveOrExpression(): InclusiveOrExpressionContext = {
		val _localctx = new InclusiveOrExpressionContext(_ctx, getState)
		enterRule(_localctx, 220, RULE_inclusive_or_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1235)
			exclusiveOrExpression()
			setState(1240)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==BITOR) {
				setState(1236)
				matchToken(BITOR)
				setState(1237)
				exclusiveOrExpression()
				setState(1242)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def exclusiveOrExpression(): ExclusiveOrExpressionContext = {
		val _localctx = new ExclusiveOrExpressionContext(_ctx, getState)
		enterRule(_localctx, 222, RULE_exclusive_or_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1243)
			andExpression()
			setState(1248)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==CARET) {
				setState(1244)
				matchToken(CARET)
				setState(1245)
				andExpression()
				setState(1250)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def andExpression(): AndExpressionContext = {
		val _localctx = new AndExpressionContext(_ctx, getState)
		enterRule(_localctx, 224, RULE_and_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1251)
			equalityExpression()
			setState(1256)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==BITAND) {
				setState(1252)
				matchToken(BITAND)
				setState(1253)
				equalityExpression()
				setState(1258)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def equalityExpression(): EqualityExpressionContext = {
		val _localctx = new EqualityExpressionContext(_ctx, getState)
		enterRule(_localctx, 226, RULE_equality_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1259)
			relationalExpression()
			setState(1264)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==EQUAL || _la==NOTEQUAL) {
				setState(1260)
				_la = _input.LA(1)
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this)
				} else {
					consume()
				}
				setState(1261)
				relationalExpression()
				setState(1266)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def relationalExpression(): RelationalExpressionContext = {
		val _localctx = new RelationalExpressionContext(_ctx, getState)
		enterRule(_localctx, 228, RULE_relational_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1267)
			shiftExpression()
			setState(1272)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (GT - 82)) | (1L << (LT - 82)) | (1L << (LE - 82)) | (1L << (GE - 82)))) != 0)) {
				setState(1268)
				_la = _input.LA(1)
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (GT - 82)) | (1L << (LT - 82)) | (1L << (LE - 82)) | (1L << (GE - 82)))) != 0)) ) {
				_errHandler.recoverInline(this)
				} else {
					consume()
				}
				setState(1269)
				shiftExpression()
				setState(1274)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def shiftExpression(): ShiftExpressionContext = {
		val _localctx = new ShiftExpressionContext(_ctx, getState)
		enterRule(_localctx, 230, RULE_shift_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1275)
			additiveExpression()
			setState(1280)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==SHIFT_R || _la==SHIFT_L) {
				setState(1276)
				_la = _input.LA(1)
				if ( !(_la==SHIFT_R || _la==SHIFT_L) ) {
				_errHandler.recoverInline(this)
				} else {
					consume()
				}
				setState(1277)
				additiveExpression()
				setState(1282)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def additiveExpression(): AdditiveExpressionContext = {
		val _localctx = new AdditiveExpressionContext(_ctx, getState)
		enterRule(_localctx, 232, RULE_additive_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1283)
			multiplicativeExpression()
			setState(1288)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==ADD || _la==SUB) {
				setState(1284)
				_la = _input.LA(1)
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this)
				} else {
					consume()
				}
				setState(1285)
				multiplicativeExpression()
				setState(1290)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def multiplicativeExpression(): MultiplicativeExpressionContext = {
		val _localctx = new MultiplicativeExpressionContext(_ctx, getState)
		enterRule(_localctx, 234, RULE_multiplicative_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1291)
			castExpression()
			setState(1296)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (MUL - 98)) | (1L << (DIV - 98)) | (1L << (MOD - 98)))) != 0)) {
				setState(1292)
				_la = _input.LA(1)
				if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (MUL - 98)) | (1L << (DIV - 98)) | (1L << (MOD - 98)))) != 0)) ) {
				_errHandler.recoverInline(this)
				} else {
					consume()
				}
				setState(1293)
				castExpression()
				setState(1298)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def castExpression(): CastExpressionContext = {
		val _localctx = new CastExpressionContext(_ctx, getState)
		enterRule(_localctx, 236, RULE_cast_expression)
		try {
			setState(1305)
			_errHandler.sync(this)
			getInterpreter().adaptivePredict(_input,151,_ctx) match {
			case 1 =>
				enterOuterAlt(_localctx, 1)
				setState(1299)
				matchToken(LPAREN)
				setState(1300)
				typeName()
				setState(1301)
				matchToken(RPAREN)
				setState(1302)
				castExpression()

			case 2 =>
				enterOuterAlt(_localctx, 2)
				setState(1304)
				unaryExpression()

			case _ =>
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def unaryExpression(): UnaryExpressionContext = {
		val _localctx = new UnaryExpressionContext(_ctx, getState)
		enterRule(_localctx, 238, RULE_unary_expression)
		try {
			setState(1323)
			_input.LA(1) match {
			case ENCODE | PROTOCOL | SELECTOR | SUPER | SELF | LPAREN | LBRACK | AT | CARET | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL =>
				enterOuterAlt(_localctx, 1)
				setState(1307)
				postfixExpression()

			case INC =>
				enterOuterAlt(_localctx, 2)
				setState(1308)
				matchToken(INC)
				setState(1309)
				unaryExpression()

			case DEC =>
				enterOuterAlt(_localctx, 3)
				setState(1310)
				matchToken(DEC)
				setState(1311)
				unaryExpression()

			case BANG | TILDE | SUB | MUL | BITAND =>
				enterOuterAlt(_localctx, 4)
				setState(1312)
				unaryOperator()
				setState(1313)
				castExpression()

			case SIZEOF =>
				enterOuterAlt(_localctx, 5)
				setState(1315)
				matchToken(SIZEOF)
				setState(1321)
				_errHandler.sync(this)
				getInterpreter().adaptivePredict(_input,152,_ctx) match {
				case 1 =>
					setState(1316)
					matchToken(LPAREN)
					setState(1317)
					typeName()
					setState(1318)
					matchToken(RPAREN)

				case 2 =>
					setState(1320)
					unaryExpression()

				case _ =>
				}

			case _ =>
				throw new NoViableAltException(this)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def unaryOperator(): UnaryOperatorContext = {
		val _localctx = new UnaryOperatorContext(_ctx, getState)
		enterRule(_localctx, 240, RULE_unary_operator)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1325)
			_la = _input.LA(1)
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (BANG - 84)) | (1L << (TILDE - 84)) | (1L << (SUB - 84)) | (1L << (MUL - 84)) | (1L << (BITAND - 84)))) != 0)) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def postfixExpression(): PostfixExpressionContext = {
		val _localctx = new PostfixExpressionContext(_ctx, getState)
		enterRule(_localctx, 242, RULE_postfix_expression)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1327)
			primaryExpression()
			setState(1345)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (DOT - 70)) | (1L << (STRUCTACCESS - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)))) != 0)) {
				setState(1343)
				_input.LA(1) match {
				case LBRACK =>
					setState(1328)
					matchToken(LBRACK)
					setState(1329)
					expression()
					setState(1330)
					matchToken(RBRACK)

				case LPAREN =>
					setState(1332)
					matchToken(LPAREN)
					setState(1334)
					_la = _input.LA(1)
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LPAREN - 70)) | (1L << (LBRACK - 70)) | (1L << (AT - 70)) | (1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (SUB - 70)) | (1L << (MUL - 70)) | (1L << (BITAND - 70)) | (1L << (CARET - 70)) | (1L << (IDENTIFIER - 70)) | (1L << (CHARACTER_LITERAL - 70)) | (1L << (STRING_LITERAL - 70)) | (1L << (HEX_LITERAL - 70)) | (1L << (DECIMAL_LITERAL - 70)) | (1L << (OCTAL_LITERAL - 70)) | (1L << (FLOATING_POINT_LITERAL - 70)))) != 0)) {
						setState(1333)
						argumentExpressionList()
					}

					setState(1336)
					matchToken(RPAREN)

				case DOT =>
					setState(1337)
					matchToken(DOT)
					setState(1338)
					identifier()

				case STRUCTACCESS =>
					setState(1339)
					matchToken(STRUCTACCESS)
					setState(1340)
					identifier()

				case INC =>
					setState(1341)
					matchToken(INC)

				case DEC =>
					setState(1342)
					matchToken(DEC)

				case _ =>
					throw new NoViableAltException(this)
				}
				setState(1347)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def argumentExpressionList(): ArgumentExpressionListContext = {
		val _localctx = new ArgumentExpressionListContext(_ctx, getState)
		enterRule(_localctx, 244, RULE_argument_expression_list)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1348)
			assignmentExpression()
			setState(1353)
			_errHandler.sync(this)
			_la = _input.LA(1)
			while (_la==COMMA) {
				setState(1349)
				matchToken(COMMA)
				setState(1350)
				assignmentExpression()
				setState(1355)
				_errHandler.sync(this)
				_la = _input.LA(1)
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def identifier(): IdentifierContext = {
		val _localctx = new IdentifierContext(_ctx, getState)
		enterRule(_localctx, 246, RULE_identifier)
		try {
			enterOuterAlt(_localctx, 1)
			setState(1356)
			matchToken(IDENTIFIER)
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


	@throws(classOf[RecognitionException])
	final def constant(): ConstantContext = {
		val _localctx = new ConstantContext(_ctx, getState)
		enterRule(_localctx, 248, RULE_constant)
		var _la = 0
		try {
			enterOuterAlt(_localctx, 1)
			setState(1358)
			_la = _input.LA(1)
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (CHARACTER_LITERAL - 127)) | (1L << (HEX_LITERAL - 127)) | (1L << (DECIMAL_LITERAL - 127)) | (1L << (OCTAL_LITERAL - 127)) | (1L << (FLOATING_POINT_LITERAL - 127)))) != 0)) ) {
			_errHandler.recoverInline(this)
			} else {
				consume()
			}
		}
		catch {
		case re: RecognitionException =>
			_localctx.exception = re
			_errHandler.reportError(this, re)
			_errHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		_localctx
	}


}