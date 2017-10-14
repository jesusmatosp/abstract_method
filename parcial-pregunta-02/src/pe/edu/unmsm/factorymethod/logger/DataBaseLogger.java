package pe.edu.unmsm.factorymethod.logger;

public class DataBaseLogger implements Logger{

	private DataBaseStream dataBaseStream;
	
	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Data Base Logger");
		dataBaseStream = new DataBaseStream();
	}

}
