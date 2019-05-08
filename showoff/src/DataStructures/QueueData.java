package DataStructures;

public class QueueData {
	int queu[]=new int[5];
	int size;
	int rear;
	int front;
	public void enqueue(int data){
		queu[rear] = data;
		rear++;
		size++;
		
	}
	public void show(){
		System.out.print("element :::");
		for(int i=0;i<size;i++){
			System.out.print(queu[i]+"");
		}
	}

}
