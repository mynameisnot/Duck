package model;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
		quackBehavior=new Squeak();
		flyBehavior=new FlyWithRocket();
		
	}
	public void display(){
		System.out.println("其实，我是一只RedheadDuck");
	}
}
