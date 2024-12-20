package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("multipleData").getLastRowNum();
		for (int i=0;i<=count;i++)
			count1=wb.getSheet("multipleData").getRow(i).getFirstCellNum();
		for (int j=0;j<=count;j++)
			wb.getSheet("multipleData").getRow(i).getCellComment(null).getstringvalue();
		System.out.println(data+"");
	}
	System.out.println();					
}	
			
}
