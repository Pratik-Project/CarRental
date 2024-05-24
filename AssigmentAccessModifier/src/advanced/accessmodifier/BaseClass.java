package advanced.accessmodifier;

public class BaseClass {
	
	protected void baseMethod() {
		
		System.out.println("This is base method");
	}
	
	
	private int baseVariable = 40;
	
	
	
	public static void main(String[] args) {
		
		BaseClass baseClass=new BaseClass();
		
		System.out.println(baseClass.baseVariable);//Base variable can be accessed inside the class because it has 
		         //private access modifier
		
		
		
	}

}
