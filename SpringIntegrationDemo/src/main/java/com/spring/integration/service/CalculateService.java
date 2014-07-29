package com.spring.integration.service;

public class CalculateService
{
   public void calculate(int i)
   {
	   int si=(12000*2*i)/100;
	   System.out.println("Your Simple Interest Is :Rs "+si);
   }
   public void seniorCitizen(int age)
   {
	   if(age>=60)
		   System.out.println("He/She is senior citizen, because his age is :"+age);
	   else
		   System.out.println("He/She is not senior citizen, because his age is not greater than : 60");
   }
}
