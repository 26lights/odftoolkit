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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsAscendingAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element db:index-column}.
 *
 */
public class DbIndexColumnElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DB, "index-column" );


	/**
	 * Create the instance of <code>DbIndexColumnElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbIndexColumnElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:index-column}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DbIndexColumnElement}
	 *
     * @param dbNameAttributeValue  The mandatory attribute {@odf.attribute  db:name}"
     *
	 */
	public void init(String dbNameAttributeValue)
	{
		setDbNameAttribute( dbNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbNameAttribute()
	{
		DbNameAttribute attr = (DbNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @param dbNameValue   The type is <code>String</code>
	 */
	public void setDbNameAttribute( String dbNameValue )
	{
		DbNameAttribute attr =  new DbNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbIsAscendingAttribute</code> , See {@odf.attribute db:is-ascending}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbIsAscendingAttribute()
	{
		DbIsAscendingAttribute attr = (DbIsAscendingAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.DB), "is-ascending" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbIsAscendingAttribute</code> , See {@odf.attribute db:is-ascending}
	 *
	 * @param dbIsAscendingValue   The type is <code>Boolean</code>
	 */
	public void setDbIsAscendingAttribute( Boolean dbIsAscendingValue )
	{
		DbIsAscendingAttribute attr =  new DbIsAscendingAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbIsAscendingValue.booleanValue() );
	}

}
