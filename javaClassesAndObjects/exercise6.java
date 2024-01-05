//The class below should not be inherited by other classes. Add the correct modifier:

final class MyClass{
	private String menssage;
	
	public MyClass(String message){
		this.message = message;
	}
	
	public void printMessaeg(){
		System.out.println("Message: " + message);
	}
	
	public static void main(String[] args){
	 	MyClass myInstance = new MyClass("Hello world!");
	 	myInstance.printMessage();
	}
}
