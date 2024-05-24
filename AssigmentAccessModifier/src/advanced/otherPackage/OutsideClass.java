package advanced.otherPackage;

import advanced.accessmodifier.DerivedClass;

public class OutsideClass  {
	
	public static void main(String[] args) {
		
		
		
		DerivedClass dc = new DerivedClass();
	
		System.out.println(dc.derivedVariable);//This can be access because of public access specifier
		
		dc.baseMethod();//Base method can be accessed because in derived class extended properties of base class
		                 //and we have made the object of derived class and it has protected so we can access by
		                 //outside the package by child class
		  
		dc.derivedMethod();//this can be access because of method has public access specifier that can be used anywhere
		
		/*
		 * System.out.println(dc.baseVariable); This base variable from other package
		 * class cant be access because of private access specifier
		 */
		
		
		
		
	}

}
