package com.csi.corebasics;

public class FinalizeConcept {

	public void finalize(){
		System.out.println("I AM FROM PUNE");
	}
	public static void main(String[] args) {
		FinalizeConcept fc1=new FinalizeConcept();
		FinalizeConcept fc2=new FinalizeConcept();
		fc1=fc2;
		System.gc();
	}
}
