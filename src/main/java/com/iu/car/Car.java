package com.iu.car;

public class Car {
	
	private Wheel wheel; //카는 휠에 의해 의존적
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	//생성자를 이용한 의존성 주입
	public Car(Wheel wheel) {
		this.wheel = wheel;
	}
	
	//메소드를 통한 DI, setter
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Wheel getWheel() {
		return wheel;
	}
	
	
	
	
}
