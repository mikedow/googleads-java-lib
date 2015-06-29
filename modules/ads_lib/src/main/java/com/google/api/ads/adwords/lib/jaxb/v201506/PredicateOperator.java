//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.29 at 11:51:34 AM PDT 
//


package com.google.api.ads.adwords.lib.jaxb.v201506;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Predicate.Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Predicate.Operator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EQUALS"/&gt;
 *     &lt;enumeration value="NOT_EQUALS"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NOT_IN"/&gt;
 *     &lt;enumeration value="GREATER_THAN"/&gt;
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/&gt;
 *     &lt;enumeration value="LESS_THAN"/&gt;
 *     &lt;enumeration value="LESS_THAN_EQUALS"/&gt;
 *     &lt;enumeration value="STARTS_WITH"/&gt;
 *     &lt;enumeration value="STARTS_WITH_IGNORE_CASE"/&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="CONTAINS_IGNORE_CASE"/&gt;
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/&gt;
 *     &lt;enumeration value="DOES_NOT_CONTAIN_IGNORE_CASE"/&gt;
 *     &lt;enumeration value="CONTAINS_ANY"/&gt;
 *     &lt;enumeration value="CONTAINS_ALL"/&gt;
 *     &lt;enumeration value="CONTAINS_NONE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Predicate.Operator")
@XmlEnum
public enum PredicateOperator {

    EQUALS,
    NOT_EQUALS,
    IN,
    NOT_IN,
    GREATER_THAN,
    GREATER_THAN_EQUALS,
    LESS_THAN,
    LESS_THAN_EQUALS,
    STARTS_WITH,
    STARTS_WITH_IGNORE_CASE,
    CONTAINS,
    CONTAINS_IGNORE_CASE,
    DOES_NOT_CONTAIN,
    DOES_NOT_CONTAIN_IGNORE_CASE,
    CONTAINS_ANY,
    CONTAINS_ALL,
    CONTAINS_NONE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PredicateOperator fromValue(String v) {
        return valueOf(v);
    }

}
