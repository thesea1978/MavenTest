package com.huawei.MavenTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.huawei.MavenTest.excelconfig.CommonConfigItem;
import com.huawei.MavenTest.excelconfig.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
		Config config = new Config();
	
		CommonConfigItem commonCfgItem1 = new CommonConfigItem();
		commonCfgItem1.setKey("key1");
		commonCfgItem1.setValue("value1");
		commonCfgItem1.setDefaultValue("default value1");
		config.setCommonConfigItem("key1", commonCfgItem1);

		CommonConfigItem commonCfgItem2 = new CommonConfigItem();
		commonCfgItem2.setKey("key2");
		commonCfgItem2.setValue("value2");
		commonCfgItem2.setDefaultValue("default value2");
		config.setCommonConfigItem("key2", commonCfgItem2);

		CommonConfigItem commonCfgItem3 = new CommonConfigItem();
		commonCfgItem3.setKey("key3");
		commonCfgItem3.setValue("value3");
		commonCfgItem3.setDefaultValue("default value3");
		config.setCommonConfigItem("key3", commonCfgItem3);
		
		String value = config.getCommonConfigItem("key3");
		System.out.println(value);
		
        System.out.println( "Hello World!" );
    }
    
/*    public static void readXlsx()
    {
    	File file = new File("J:\\workspace\\TEST\\test.xlsx");

        XSSFWorkbook xssfWorkbook = null;
		try {
			xssfWorkbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        int rowstart = xssfSheet.getFirstRowNum();
        int rowEnd = xssfSheet.getLastRowNum();
        for(int i=rowstart;i<=rowEnd;i++)
        {
            XSSFRow row = xssfSheet.getRow(i);
            if(null == row) continue;
            int cellStart = row.getFirstCellNum();
            int cellEnd = row.getLastCellNum();

            for(int k=cellStart;k<=cellEnd;k++)
            {
                XSSFCell cell = row.getCell(k);
                if(null==cell) continue;

                switch (cell.getCellType())
                {
                    case HSSFCell.CELL_TYPE_NUMERIC: // 数字
                        System.out.print(cell.getNumericCellValue()
                                + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_STRING: // 字符串
                        System.out.print(cell.getStringCellValue()
                                + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
                        System.out.println(cell.getBooleanCellValue()
                                + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_FORMULA: // 公式
                        System.out.print(cell.getCellFormula() + "   ");
                        break;
                    case HSSFCell.CELL_TYPE_BLANK: // 空值
                        System.out.println(" ");
                        break;
                    case HSSFCell.CELL_TYPE_ERROR: // 故障
                        System.out.println(" ");
                        break;
                    default:
                        System.out.print("未知类型   ");
                        break;
                }

            }
            System.out.print("\n");
        }

    }
*/}
