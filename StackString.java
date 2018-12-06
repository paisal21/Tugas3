package ASD3;

import java.util.ArrayList;
public class StackString {
	ArrayList<String>containert = new ArrayList<String>();
	int ecor = -1;
	
	public void push(String value){
		ecor++;
		containert.add(ecor,value);
	}
	public String pop(){
		String value = "KOSONG";
		if (ecor>-1){
		value = containert.get(top);
		containert.remove(top);
		ecor--;}
		return value;
		}
	
	public void cetak (){
		System.out.println("ECOR : " +ecor+ " # nama-nama : "+containert.toString());
	}
}
