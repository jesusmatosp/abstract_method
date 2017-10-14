package pe.edu.unmsm.factorymethod.logger;

public class SingletonStream {
	private static SingletonStream instance = null;
	private BaseStream baseStream;
	
	public SingletonStream() {
		
	}
	
	public SingletonStream(BaseStream baseStream){
		this.baseStream = baseStream;
	}
	
	 public void doSomething() {
	        System.out.println(this.hashCode());
	    }

	    public static synchronized SingletonStream getInstance() {
	        if (instance == null) {
	            instance = new SingletonStream();
	        }
	        return instance;
	    }
}
