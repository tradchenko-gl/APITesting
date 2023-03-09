import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class TestData {

    @DataProvider(name = "IDCategoryNameTests")
    public Object[][] idCategoryName() {
        return new Object[][] {
                {5, "jewelery", "John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet"}
        };
    }

//    public Object[][] readExcelData() throws Exception{
//        FileInputStream file = new FileInputStream(new File("ID_Category_Title.csv"));
//        XSSFWorkbook workbook = new XSSFWorkbook(file);
//        XSSFSheet sheet = workbook.getSheetAt(0);
//
//        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
//        int colCount = sheet.getRow(0).getLastCellNum();
//        Object[][] data = new Object[rowCount][colCount];
//
//        for (int i = 1; i <= rowCount; i++) {
//            Row row = sheet.getRow(i);
//            for (int j = 0; j < colCount; j++) {
//                Cell cell = row.getCell(j);
//                data[i - 1][j] = cell.getStringCellValue();
//            }
//        }
//
//        return data;
//    }
}
