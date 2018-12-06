package ASD3;

import java.util.ArrayList;
public class StackDouble {
	ArrayList<Double>st=new ArrayList<Double>();
	public int ecor = -1;
	
		public void push(Double value){
			ecor++;
			st.add(top,value);
		}
		
			public double pop() {
				double value=top;
			if (ecor>-1){				
				value = st.get(ecor);
				st.remove(ecor);
				ecor--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(st.toString());
			}
}
