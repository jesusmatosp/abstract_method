package pe.edu.unmsm.factorymethod.logger;

public class SocketLogger implements Logger{

	private SocketStream socketStream;
	
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Network Logger");
	}

	
	
}
