package com.rest.soap.wrapper.calc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Add")
public class Add {

    protected int intA;
    protected int intB;

    public int getIntA() {
        return intA;
    }

    public void setIntA(int value) {
        this.intA = value;
    }

    public int getIntB() {
        return intB;
    }

    public void setIntB(int value) {
        this.intB = value;
    }

}
