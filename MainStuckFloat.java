package ASD3;

public class MainStuckFloat {
public static void main(String[] args) {
		classstuckfloat sc=new classstuckfloat();
			sc.push(1.2f);
			sc.push(2.3f);
			sc.push(3.4f);
			sc.cetak();
			float d0=sc.pop();
			System.out.println(d0);
			sc.cetak();
	}
}
