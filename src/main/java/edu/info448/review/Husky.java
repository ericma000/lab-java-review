package edu.info448.review;

public class Husky extends Dog implements Huggable {...} {
	private String name;

	public Husky(String name) {
		this.name = name;
	}

	public void pullSled() {

	}

	public void bark() {
		System.out.print(this + "says: Woof!");
	}
}