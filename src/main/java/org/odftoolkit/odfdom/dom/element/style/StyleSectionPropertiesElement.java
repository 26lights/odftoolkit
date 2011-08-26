/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.attribute.fo.FoBackgroundColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginLeftAttribute;
import org.odftoolkit.odfdom.dom.attribute.fo.FoMarginRightAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleProtectAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleEditableAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextDontBalanceTextColumnsAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleWritingModeAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeBinaryDataElement;
import org.odftoolkit.odfdom.dom.element.text.TextNotesConfigurationElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:section-properties}.
 *
 */
public class StyleSectionPropertiesElement extends OdfStylePropertiesBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.STYLE, "section-properties" );


	/**
	 * Create the instance of <code>StyleSectionPropertiesElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleSectionPropertiesElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:section-properties}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

    public final static OdfStyleProperty BackgroundColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.FO, "background-color"));
    public final static OdfStyleProperty MarginLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.FO, "margin-left"));
    public final static OdfStyleProperty MarginRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.FO, "margin-right"));
    public final static OdfStyleProperty Protect = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.STYLE, "protect"));
    public final static OdfStyleProperty Editable = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.STYLE, "editable"));
    public final static OdfStyleProperty DontBalanceTextColumns = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.TEXT, "dont-balance-text-columns"));
    public final static OdfStyleProperty WritingMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.SectionProperties, OdfName.newName(OdfNamespaceNames.STYLE, "writing-mode"));


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoBackgroundColorAttribute</code> , See {@odf.attribute fo:background-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoBackgroundColorAttribute()
	{
		FoBackgroundColorAttribute attr = (FoBackgroundColorAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "background-color" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoBackgroundColorAttribute</code> , See {@odf.attribute fo:background-color}
	 *
	 * @param foBackgroundColorValue   The type is <code>String</code>
	 */
	public void setFoBackgroundColorAttribute( String foBackgroundColorValue )
	{
		FoBackgroundColorAttribute attr =  new FoBackgroundColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foBackgroundColorValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See {@odf.attribute fo:margin-left}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginLeftAttribute()
	{
		FoMarginLeftAttribute attr = (FoMarginLeftAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin-left" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginLeftAttribute</code> , See {@odf.attribute fo:margin-left}
	 *
	 * @param foMarginLeftValue   The type is <code>String</code>
	 */
	public void setFoMarginLeftAttribute( String foMarginLeftValue )
	{
		FoMarginLeftAttribute attr =  new FoMarginLeftAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginLeftValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FoMarginRightAttribute</code> , See {@odf.attribute fo:margin-right}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFoMarginRightAttribute()
	{
		FoMarginRightAttribute attr = (FoMarginRightAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.FO), "margin-right" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FoMarginRightAttribute</code> , See {@odf.attribute fo:margin-right}
	 *
	 * @param foMarginRightValue   The type is <code>String</code>
	 */
	public void setFoMarginRightAttribute( String foMarginRightValue )
	{
		FoMarginRightAttribute attr =  new FoMarginRightAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( foMarginRightValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleProtectAttribute</code> , See {@odf.attribute style:protect}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleProtectAttribute()
	{
		StyleProtectAttribute attr = (StyleProtectAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "protect" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleProtectAttribute</code> , See {@odf.attribute style:protect}
	 *
	 * @param styleProtectValue   The type is <code>String</code>
	 */
	public void setStyleProtectAttribute( String styleProtectValue )
	{
		StyleProtectAttribute attr =  new StyleProtectAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleProtectValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleEditableAttribute</code> , See {@odf.attribute style:editable}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleEditableAttribute()
	{
		StyleEditableAttribute attr = (StyleEditableAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "editable" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleEditableAttribute</code> , See {@odf.attribute style:editable}
	 *
	 * @param styleEditableValue   The type is <code>Boolean</code>
	 */
	public void setStyleEditableAttribute( Boolean styleEditableValue )
	{
		StyleEditableAttribute attr =  new StyleEditableAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( styleEditableValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextDontBalanceTextColumnsAttribute</code> , See {@odf.attribute text:dont-balance-text-columns}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextDontBalanceTextColumnsAttribute()
	{
		TextDontBalanceTextColumnsAttribute attr = (TextDontBalanceTextColumnsAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "dont-balance-text-columns" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextDontBalanceTextColumnsAttribute</code> , See {@odf.attribute text:dont-balance-text-columns}
	 *
	 * @param textDontBalanceTextColumnsValue   The type is <code>Boolean</code>
	 */
	public void setTextDontBalanceTextColumnsAttribute( Boolean textDontBalanceTextColumnsValue )
	{
		TextDontBalanceTextColumnsAttribute attr =  new TextDontBalanceTextColumnsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textDontBalanceTextColumnsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleWritingModeAttribute</code> , See {@odf.attribute style:writing-mode}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleWritingModeAttribute()
	{
		StyleWritingModeAttribute attr = (StyleWritingModeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "writing-mode" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleWritingModeAttribute</code> , See {@odf.attribute style:writing-mode}
	 *
	 * @param styleWritingModeValue   The type is <code>String</code>
	 */
	public void setStyleWritingModeAttribute( String styleWritingModeValue )
	{
		StyleWritingModeAttribute attr =  new StyleWritingModeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleWritingModeValue );
	}

	/**
	 * Create child element {@odf.element office:binary-data}.
	 *
	 * @return   return  the element {@odf.element office:binary-data}
	 * DifferentQName 
	 */
	public OfficeBinaryDataElement newOfficeBinaryDataElement()
	{
		OfficeBinaryDataElement  officeBinaryData = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeBinaryDataElement.class);
		this.appendChild( officeBinaryData);
		return  officeBinaryData;
	}                   
               
	/**
	 * Create child element {@odf.element style:column-sep}.
	 *
     * @param styleWidthAttributeValue  the <code>String</code> value of <code>StyleWidthAttribute</code>, see {@odf.attribute  style:width} at specification
	 * @return   return  the element {@odf.element style:column-sep}
	 * DifferentQName 
	 */
    
	public StyleColumnSepElement newStyleColumnSepElement(String styleWidthAttributeValue)
	{
		StyleColumnSepElement  styleColumnSep = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleColumnSepElement.class);
		styleColumnSep.setStyleWidthAttribute( styleWidthAttributeValue );
		this.appendChild( styleColumnSep);
		return  styleColumnSep;      
	}
    
	/**
	 * Create child element {@odf.element style:column}.
	 *
     * @param styleRelWidthAttributeValue  the <code>String</code> value of <code>StyleRelWidthAttribute</code>, see {@odf.attribute  style:rel-width} at specification
	 * @return   return  the element {@odf.element style:column}
	 * DifferentQName 
	 */
    
	public StyleColumnElement newStyleColumnElement(String styleRelWidthAttributeValue)
	{
		StyleColumnElement  styleColumn = ((OdfFileDom)this.ownerDocument).newOdfElement(StyleColumnElement.class);
		styleColumn.setStyleRelWidthAttribute( styleRelWidthAttributeValue );
		this.appendChild( styleColumn);
		return  styleColumn;      
	}
    
	/**
	 * Create child element {@odf.element text:notes-configuration}.
	 *
     * @param textNoteClassAttributeValue  the <code>String</code> value of <code>TextNoteClassAttribute</code>, see {@odf.attribute  text:note-class} at specification
	 * @return   return  the element {@odf.element text:notes-configuration}
	 * DifferentQName 
	 */
    
	public TextNotesConfigurationElement newTextNotesConfigurationElement(String textNoteClassAttributeValue)
	{
		TextNotesConfigurationElement  textNotesConfiguration = ((OdfFileDom)this.ownerDocument).newOdfElement(TextNotesConfigurationElement.class);
		textNotesConfiguration.setTextNoteClassAttribute( textNoteClassAttributeValue );
		this.appendChild( textNotesConfiguration);
		return  textNotesConfiguration;      
	}
    
}
