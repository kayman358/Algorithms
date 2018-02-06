/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Kolade Arowolo
 */
public class EncapsulationDemo {

    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        this.empAge = newValue;
    }

    public void setEmpName(String newValue){
        this.empName = newValue;
    }

    public void setEmpSSN(int newValue){
        this.ssn = newValue;
    }
}

