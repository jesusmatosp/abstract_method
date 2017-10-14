package pe.edu.unmsm.factorymethod.logger;


public class LoggerFactory {

	private String tipoLogger = "";
	
	private BaseStream baseStream;
	
	public LoggerFactory(String tipoLogger){
		this.tipoLogger = tipoLogger;
	}
	
	public Logger getLogger(){
		if(tipoLogger.equals("DATA_BASE")){
			return new DataBaseLogger();
		}else if(tipoLogger.equals("FILE")){
			return new FileLogger();
		}else if(tipoLogger.equals("NETWORK")){
			return new SocketLogger();
		}
		return null;
		
	}
	
}