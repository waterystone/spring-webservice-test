
package com.adu.spring_test.webservice.email.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidateEmailAddressResult" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
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
    "validateEmailAddressResult"
})
@XmlRootElement(name = "ValidateEmailAddressResponse")
public class ValidateEmailAddressResponse {

    @XmlElement(name = "ValidateEmailAddressResult")
    @XmlSchemaType(name = "unsignedByte")
    protected short validateEmailAddressResult;

    /**
     * ��ȡvalidateEmailAddressResult���Ե�ֵ��
     * 
     */
    public short getValidateEmailAddressResult() {
        return validateEmailAddressResult;
    }

    /**
     * ����validateEmailAddressResult���Ե�ֵ��
     * 
     */
    public void setValidateEmailAddressResult(short value) {
        this.validateEmailAddressResult = value;
    }

}
