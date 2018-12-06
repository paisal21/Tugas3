package ASD3;

public class MainStackString {
public static void main(String[] args) {
		classstackstring st= new classstackstring();
		
		st.push("nas");
    st.push("masdar");
		st.push("yusuf");
		st.push("alfandhy");
		
		String d0=st.pop();
		System.out.println(d0);
		st.cetak();
	}
}
