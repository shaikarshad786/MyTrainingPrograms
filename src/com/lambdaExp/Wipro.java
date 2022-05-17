package com.lambdaExp;

public class Wipro {
	public String getPasswordForWipro(Employee e) {
		EmployeeService eService=(a,b)->{
		String s1=e.getEmpName().substring(0, 4);
		String ph=String.valueOf(b);
		String s2=ph.substring(ph.length()-2);
		return s1.concat(s2);
		};
		return eService.generatePassword(e.getEmpName(), e.getEmpPhone());
	} 
}
