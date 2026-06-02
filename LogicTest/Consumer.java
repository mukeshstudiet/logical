public class Consumer extends Thread{

private content con;

private int number;

public void Consumer(Content con, int num){

	con = con;
	this.number=num;
	
}

public void run(){

	int value=0;

for (int i =0;i<10;i++){
	value=con.get();
	System.out.println("Consumer # " +this.number + +"got : "+ value);
}

}

}