/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//

package com.microsoft.windowsazure.serviceruntime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RoleInstanceInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RoleInstanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Endpoints" type="{}EndpointsInfo"/>
 *       &lt;/all>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="faultDomain" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="updateDomain" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleInstanceInfo", propOrder = {

})
class RoleInstanceInfo {

    @XmlElement(name = "Endpoints", required = true)
    protected EndpointsInfo endpoints;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected int faultDomain;
    @XmlAttribute(required = true)
    protected int updateDomain;

    /**
     * Gets the value of the endpoints property.
     * 
     * @return possible object is {@link EndpointsInfo }
     * 
     */
    public EndpointsInfo getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the value of the endpoints property.
     * 
     * @param value
     *            allowed object is {@link EndpointsInfo }
     * 
     */
    public void setEndpoints(EndpointsInfo value) {
        this.endpoints = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the faultDomain property.
     * 
     */
    public int getFaultDomain() {
        return faultDomain;
    }

    /**
     * Sets the value of the faultDomain property.
     * 
     */
    public void setFaultDomain(int value) {
        this.faultDomain = value;
    }

    /**
     * Gets the value of the updateDomain property.
     * 
     */
    public int getUpdateDomain() {
        return updateDomain;
    }

    /**
     * Sets the value of the updateDomain property.
     * 
     */
    public void setUpdateDomain(int value) {
        this.updateDomain = value;
    }

}
