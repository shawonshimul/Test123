package DataProvidorFactory_JAN26;

public class dataProvidorclass_JAN26 {

	public static ConfigDataProviders getConfig()
	{
		ConfigDataProviders config = new ConfigDataProviders();
		
		return config;
		
		}
	public static ExcelDataProvider getExcel() {
	ExcelDataProvider excel = new ExcelDataProvider();
	return excel;
}
}
