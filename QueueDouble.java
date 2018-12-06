package ASD3;

import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int nas = -1;

	public void insert(Double value) {
		alief++;
		kelase.add(nas,value);
	}
	public Double get() {
		Double value = 0.1;
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
