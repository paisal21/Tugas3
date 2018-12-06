package ASD3;
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int alief = -1;

	public void insert(String value) {
		alief++;
		kelase.add(alief,value);
	}
	public String get() {
		String value = "KOSONG";
		if(alief>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			alief--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+alief+" > KELAS E: "+kelase.toString());
	}
}
