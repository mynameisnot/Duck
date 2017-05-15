package model;

public class BubberDuck extends Duck{ 
	public BubberDuck(){
		quackBehavior=new MuteQuack();
		flyBehavior=new FlyNoWay();
		
	}
	public void display(){
		System.out.println("其实，我是一只BubberDuck");
	}
}
