package ASD3;
import sun.misc.Queue;
public class MainQueueDouble {

	public static void main(String[] args) {
		QueueDouble q = new QueueDouble();
		q.cetak();
		
		q.insert(1.1);q.cetak();
		q.insert(2.1);q.cetak();
		q.insert(3.1);q.cetak();
		q.insert(4.1);q.cetak();
		
	}
}
