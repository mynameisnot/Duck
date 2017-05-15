package Test;

import model.BubberDuck;
import model.Duck;
import model.FlyWithRocket;
import model.MallardDuck;
import model.Quack;
import model.RedheadDuck;
import model.Squeak;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("一共有三种鸭子，请看下面介绍");
		System.out.println("MallardDuck");
		Duck mallardDuck=new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		System.out.println("几天的学习后，MallardDuck也学会了用火箭飞");
		mallardDuck.setFlyBehavior(new FlyWithRocket());
		mallardDuck.performFly();
		System.out.println("几天的学习后，MallardDuck居然学会了吱吱叫(￣▽￣)");
		mallardDuck.setQuackBehavior(new Squeak());
		mallardDuck.performQuack();
		
		
		System.out.println("BubberDuck");
		Duck bubberDuck=new BubberDuck();
		bubberDuck.display();
		bubberDuck.performFly();
		bubberDuck.performQuack();
		System.out.println("我自生来不会叫也不会飞，但是天道酬勤，经过后天的努力，我学会了---");
		bubberDuck.setFlyBehavior(new FlyWithRocket());
		bubberDuck.performFly();
		bubberDuck.setQuackBehavior(new Squeak());
		bubberDuck.performQuack();
		
		System.out.println("RedheadDuck");
		Duck redheadDuck=new RedheadDuck();
		redheadDuck.display();
		redheadDuck.performFly();
		redheadDuck.performQuack();
		System.out.println("你以为我只会吱吱叫，其实我还会---");
		redheadDuck.setQuackBehavior(new Quack());
		redheadDuck.performQuack();
	}

}
