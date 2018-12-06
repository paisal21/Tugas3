package ASD3;

import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int nas = -1;

	public void insert(Float value) {
		nas++;
		kelase.add(nas,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(nas>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			nas--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+nas+" > VARIABLE: "+kelase.toString());
	}
}
