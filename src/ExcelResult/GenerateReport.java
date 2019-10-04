package ExcelResult;

import org.automationtesting.excelreport.Xl;

public class GenerateReport
{
	public static void main(String[] args) throws Exception 
	{
		//Xl.generateReport("excel-report.xlsx");
		Xl.generateReport("E:\\ExcelData","Report-generate.xlsx");
	}
}
