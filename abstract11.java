package javalearning;

abstract class abstract11 //abstract class
{
  public abstract void animalsound();//abstract method does not have body
  public void sleep()//regular method
  {
	  System.out.println("zzzzz");
  }
}
class Pig extends abstract11
{
	public void animalsound()
	{
		System.out.println("wee weee");
	}
}
class Dog extends abstract11
{
	public void animalsound()
	{
		System.out.println("bow bow");
	}
}
class Main{
	public static void main(String []args) {
		Pig mypig=new Pig();//create pig object
		Dog mydog=new Dog();
		mypig.animalsound();
		mydog.animalsound();
		System.out.println("is it working");
	}
}
