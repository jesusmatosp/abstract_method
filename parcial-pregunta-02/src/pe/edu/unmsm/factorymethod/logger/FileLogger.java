package pe.edu.unmsm.factorymethod.logger;

public class FileLogger implements Logger {

	private FileStream fileStream;
	
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("File Logger");
	}

	
}
