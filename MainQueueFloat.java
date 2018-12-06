package ASD3;
import sun.misc.Queue;
public class MainQueueFloat {

	public static void main(String[] args) {
		QueueFloat q = new QueueFloat();
		q.cetak();
		
		q.insert(1.1f);q.cetak();
		q.insert(2.1f);q.cetak();
		q.insert(3.1f);q.cetak();
		q.insert(4.1f);q.cetak();
	}
}
