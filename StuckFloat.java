package ASD3;

public class StuckFloat {
	ArrayList<Float>st=new ArrayList<Float>();
	public int ecor = -1;
	
	public void push(float value){
		ecor++;
		st.add(ecor,value);
	}
	public float pop(){
		float value = ecor;
		if (ecor>-1){
			value = st.get(ecor);
			st.remove(ecor);
			ecor--;
		}
		return value;}
		public void cetak(){
	System.out.println(st.toString());
		}
}
