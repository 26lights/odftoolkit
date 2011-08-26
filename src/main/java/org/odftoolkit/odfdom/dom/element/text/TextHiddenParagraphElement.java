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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextConditionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIsHiddenAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:hidden-paragraph}.
 *
 */
public class TextHiddenParagraphElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "hidden-paragraph" );


	/**
	 * Create the instance of <code>TextHiddenParagraphElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextHiddenParagraphElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:hidden-paragraph}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextHiddenParagraphElement}
	 *
     * @param textConditionAttributeValue  The mandatory attribute {@odf.attribute  text:condition}"
     *
	 */
	public void init(String textConditionAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextConditionAttribute</code> , See {@odf.attribute text:condition}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextConditionAttribute()
	{
		TextConditionAttribute attr = (TextConditionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "condition" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextConditionAttribute</code> , See {@odf.attribute text:condition}
	 *
	 * @param textConditionValue   The type is <code>String</code>
	 */
	public void setTextConditionAttribute( String textConditionValue )
	{
		TextConditionAttribute attr =  new TextConditionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textConditionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIsHiddenAttribute</code> , See {@odf.attribute text:is-hidden}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextIsHiddenAttribute()
	{
		TextIsHiddenAttribute attr = (TextIsHiddenAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "is-hidden" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIsHiddenAttribute</code> , See {@odf.attribute text:is-hidden}
	 *
	 * @param textIsHiddenValue   The type is <code>Boolean</code>
	 */
	public void setTextIsHiddenAttribute( Boolean textIsHiddenValue )
	{
		TextIsHiddenAttribute attr =  new TextIsHiddenAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textIsHiddenValue.booleanValue() );
	}

}
