package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));
		dog.bark();

		Dog v1 = new Husky();
		Husky vs = new Dog();
		Huggable v2 = new Husky();
		Huggable v3 - new TeddyBear();
		Husky v4 = new TeddyBear();

		Dog v1 = new Husky();
		Husky v2 = (Husky) v1;

		ArrayList<Huggable> hugList = new ArrayList<Huggable>();
		hugList.add(new Husky());
		hugList.add(new TeddyBear());

		for (Hugable thing : hugList) {
			things.hug;
		}
	}
}