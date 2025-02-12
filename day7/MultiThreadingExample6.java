package com.celcom.day7;
//Inter-Thread Communication
class Resource{
	private String resource;

	public String getData() {
		return resource;
	}

	public void setData(String resource) {
		this.resource = resource;
	}
	
}
class Reader extends Thread{
	Resource resource;
	Reader(Resource resource){
		this.resource=resource;
	}
	@Override
	public void run() {
		synchronized(resource) {
			System.out.println("Reader is waiting for writer to write the data");
			try {
				resource.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Data from the resource is: "+resource.getData());
		}
		
	}
}
class Writer extends Thread{
	Resource resource;
	Writer(Resource resource){
		this.resource=resource;
	}
	@Override
	public void run() {
		synchronized(resource) {
			System.out.println("Writer is writing the data.....");
			resource.setData("Hello Reader");
			resource.notify();
		}
		
	}
}
public class MultiThreadingExample6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Resource resource=new Resource();
		Reader reader =new Reader(resource);
		reader.start();
		
		Thread.sleep(2000);
		
		Writer writer =new Writer(resource);
		writer.start();
		

	}

}
