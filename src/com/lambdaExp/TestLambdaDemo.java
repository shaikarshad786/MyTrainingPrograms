package com.lambdaExp;

//class A implements CustomerService{
//
//	@Override
//	public boolean login(String userName, String password) {
//		if(userName.equals("admin") && password.equals("123")) {
//			return true;
//		}
//		else {
//		return false;
//	}
//	
//}

public class TestLambdaDemo {

	public static void main(String[] args) {
		
		
//		A a=new A();
//		a.login("admin", "123");
		
//		CustomerService service=new CustomerService() {
//			
//			@Override
//			public boolean login(String userName, String password) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
//		
		
		
		
		
		CustomerService service=(name,pass)->{if(name.equals("admin") && pass.equals("123")) {
			return true;
		}
			return false;
		};
		boolean b=service.login("admin", "123");
		if(b) {
			System.out.println("Valid User");
		}
		else {
			System.out.println("Invalid User");
		}
	}

}
