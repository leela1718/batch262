package practiseTestng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class TestngDummy14
{
	@DataProvider(name="exceldata")
	public Object[][] method1() throws Exception
	{
		File f=new File("src\\test\\resources\\datafiles\\logintestdata.xlsx"); // connecting to excel file
		FileInputStream fi=new FileInputStream(f);// By default file is stored in harddisk it will be taken into ram
		Workbook wb=WorkbookFactory.create(fi); //Considering that file into Excel
		Sheet sh=wb.getSheetAt(0); // take 1st sheet from workbook
		int RowNum=sh.getPhysicalNumberOfRows(); //count of rows
		int ColNum=sh.getRow(0).getLastCellNum(); // count of last coloms
		Object data[][]=new Object[RowNum-1][ColNum]; //array size as per count of data
		for(int i=1; i<RowNum;i++) // Loop works from 2nd row because 1st row has headdings
		{
			for(int j=0; j<ColNum; j++)
			{
				try
				{
					// get values as string when they are in int,float,double..etc in excel file
					DataFormatter df=new DataFormatter();
					data[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
				}
				catch(Exception ex)
				{
					data[i-1][j]=" ";
				}
			}
		}
		fi.close();
		wb.close();
		return(data);
	}
}
