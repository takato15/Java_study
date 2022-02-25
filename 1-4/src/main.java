
public class main {
	public static void main(String[] args) {
		//宣言
		double pi = 3.14;
		int pie = 5;
		
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		
		//再代入
		pi = 10;
		
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
	}
}
