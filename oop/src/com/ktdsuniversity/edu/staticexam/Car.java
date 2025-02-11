package com.ktdsuniversity.edu.staticexam;

public class Car {

	// 클래스 변수 (스태틱 변수)
	// OOP 프로젝트 내부 어디서나 접근 가능한 클래스 변수
	// com.ktdsuniversity.edu.staticexam.Car.instanceCount = 11;
//	public static int instanceCount = 0;
	// 클래스 상수 (스태틱 상수)
	// OOP 프로젝트 내부 어디서나 접근 가능한 클래스 상수.
	public final static int INSTANCE_COUNT = 0;
//	public static final int instacneCount1 = 0;

	// (인스턴스변수) 멤버변수
	private String name;

	// 생성자
	public Car(String name) {
		// 1. 클래스 변수의 값을 1 증가시킨다.
		// Car 타입의 인스턴스가 만들어질 때마다 값이 1씩 증가한다.
//		Car.instanceCount += 1;
		// The static field Car.instanceCount should be accessed in a static way
		// this.instanceCount += 1;

		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}