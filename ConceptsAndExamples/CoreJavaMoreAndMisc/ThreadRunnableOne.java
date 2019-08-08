class MySmpThread6 extends Thread{//step 1
	//Thread class is in java.lang package

	public MySmpThread6()
	{
		System.out.println("This is MySmpThread() Constructor");
	}
	
    int i = 1;
    
    //step 2
    @Override
    public void run(){//public void run() need to be overridden
        while(i <= 10){
          try{
            	
                System.out.println("Other Thread: "+(i*5));
                i++;
                Thread.sleep(10); //in milliseconds
            } catch (InterruptedException iex) {//checked exception
                System.out.println("Exception in thread: "+iex.getMessage());
                break;
            }
        }
    }
}

public class ThreadRunnableOne implements Runnable{
    public int myCount = 0;
    /*public MyRunnableThread(){
         
    }*/
    //step 2
    public void run() {
        while(myCount <= 10){
            try{
                System.out.println("Other RUnnable: "+(myCount*4));
                myCount++;
                Thread.sleep(300);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
    
    
    public static void main(String a[]) {
    	int i = 0;
    	
        System.out.println("Starting Main Thread...");
        
        //step 3
        ThreadRunnableOne mrt = new ThreadRunnableOne();
        
        //step 4
        Thread t = new Thread(mrt);
        new MySmpThread6().start();
        
        //step 5
        t.start();
        while(i <= 10){
            try{
            	++i;
                System.out.println("Main Thread: "+(i*3));
                Thread.sleep(200);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}