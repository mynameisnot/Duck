package model;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
		
	}
	public void display(){
		System.out.println("其实，我是一只MallardDuck");
	}
}
