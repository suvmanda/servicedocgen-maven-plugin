/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.codehaus.mojo.servicedocgen.descriptor;

import org.codehaus.mojo.servicedocgen.introspection.JParameter;

/**
 * {@link Descriptor} of a parameter of an {@link OperationDescriptor operation}.
 *
 * @see OperationDescriptor#getParameters()
 * @author hohwille
 */
public class ParameterDescriptor
    extends AbstractDescriptor
{

    private String name;

    private String location;

    private String description;

    private String example;

    private String defaultValue;

    private boolean required;

    private String javaScriptType;

    private JParameter javaParameter;

    /**
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * @param name is the name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * @see #LOCATION_BODY
     * @see #LOCATION_PATH
     * @see #LOCATION_HEADER
     * @see #LOCATION_QUERY
     * @see #LOCATION_FORM_DATA
     * @see #LOCATION_COOKIE
     * @return the in
     */
    public String getLocation()
    {
        return this.location;
    }

    /**
     * @param location is the location to set
     */
    public void setLocation( String location )
    {
        this.location = location;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        if ( this.description == null )
        {
            return "";
        }
        return this.description;
    }

    /**
     * @param description is the description to set
     */
    public void setDescription( String description )
    {
        this.description = description;
    }

    /**
     * @return the example
     */
    public String getExample()
    {
        return this.example;
    }

    /**
     * @param example is the example to set
     */
    public void setExample( String example )
    {
        this.example = example;
    }

    /**
     * @return the defaultValue
     */
    public String getDefaultValue()
    {
        return notNull( this.defaultValue );
    }

    /**
     * @param defaultValue is the defaultValue to set
     */
    public void setDefaultValue( String defaultValue )
    {
        this.defaultValue = defaultValue;
    }

    /**
     * @return the required
     */
    public boolean isRequired()
    {
        return this.required;
    }

    /**
     * @param required is the required to set
     */
    public void setRequired( boolean required )
    {
        this.required = required;
    }

    /**
     * @return the javaScriptType
     */
    public String getJavaScriptType()
    {
        return this.javaScriptType;
    }

    /**
     * @param javaScriptType is the javaScriptType to set
     */
    public void setJavaScriptType( String javaScriptType )
    {
        this.javaScriptType = javaScriptType;
    }

    /**
     * @return the javaParameter
     */
    public JParameter getJavaParameter()
    {
        return this.javaParameter;
    }

    /**
     * @param javaParameter is the javaParameter to set
     */
    public void setJavaParameter( JParameter javaParameter )
    {
        this.javaParameter = javaParameter;
    }

}
