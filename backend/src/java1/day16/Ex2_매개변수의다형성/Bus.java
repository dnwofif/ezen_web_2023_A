package java1.day16.Ex2_매개변수의다형성;

public class Bus extends Vehicle {
	@Override public void run() { 
		System.out.println("버스가 달립니다."); 
	}
}