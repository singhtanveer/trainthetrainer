package com.tanveer.inheritance.withAnnotation.tablePerClassStrategy;

import javax.persistence.Entity;

@Entity
public class Addition extends Calculation {
	
	String calculationMethod;

	public String getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(String calculationMethod) {
		this.calculationMethod = calculationMethod;
	}
	

}
