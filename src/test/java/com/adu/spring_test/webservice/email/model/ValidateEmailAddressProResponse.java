
package com.adu.spring_test.webservice.email.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidateEmailAddressProResult" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validateEmailAddressProResult"
})
@XmlRootElement(name = "ValidateEmailAddressProResponse")
public class ValidateEmailAddressProResponse {

    @XmlElement(name = "ValidateEmailAddressProResult")
    @XmlSchemaType(name = "unsignedByte")
    protected short validateEmailAddressProResult;

    /**
     * 获取validateEmailAddressProResult属性的值。
     * 
     */
    public short getValidateEmailAddressProResult() {
        return validateEmailAddressProResult;
    }

    /**
     * 设置validateEmailAddressProResult属性的值。
     * 
     */
    public void setValidateEmailAddressProResult(short value) {
        this.validateEmailAddressProResult = value;
    }

}
