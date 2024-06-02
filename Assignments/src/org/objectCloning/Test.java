package org.objectCloning;

public class Test {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		try {
		
		Insurance s=new Insurance("rohit","2024000143",(double) 14000);
		
		
		Insurance clone=(Insurance) s.clone();
		
		
		System.out.println("Original copy>>"+s);
		System.out.println("Cloned copy>>"+clone);
		
		clone.setClaimNumber("2024000123");
		clone.setPremiumAmount(1440.00);
		clone.setPolicyHolder("virat");
		
		System.out.println(clone.getClaimNumber());
		System.out.println(clone.getPremiumAmount());
		System.out.println(clone.getPolicyHolder());
		
		}catch(CloneNotSupportedException e) {
			
			System.out.println(e);;
		}
		
		
	}

}
