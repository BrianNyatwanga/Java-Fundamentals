package com.Itbulls.nyatwanga.newpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegersAndDouble {

	public static void main(String[] args) {
		OperationsWithIntegersAndDouble r = new OperationsWithIntegersAndDouble();
		
		int i = 10;
		
		//System.out.println(i / 3);
		BigDecimal j = BigDecimal.valueOf(17);
		BigDecimal scale = BigDecimal.valueOf(i).setScale(3);
		BigDecimal real = scale.divide(j, RoundingMode.HALF_UP);
		//System.out.println(i/(6/17f));
		
		System.out.println(scale.divide(j, RoundingMode.HALF_UP));
		System.out.println(real);
		//System.out.println((double)i / 3);
		
		//BigDecimal
		
		BigDecimal rideFee = BigDecimal.valueOf(10).setScale(4);
		BigDecimal amountOfPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
		System.out.println(chargePerPerson);
		//TODO OPERATIONS WITH DOUBLE
		double d = 3.1;
		double d2 = 1.21;
				
		System.out.println(BigDecimal.valueOf(d- d2));
		BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(d2).setScale(2);
		System.out.println(bd3.subtract(bd4));
		
		
	}}