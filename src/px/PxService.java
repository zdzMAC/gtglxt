package px;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class PxService {
	public static List<PxInfo> importExcel(InputStream fis){  
        List<PxInfo> infos = new ArrayList<PxInfo>();  
        PxInfo info;  
          
        try {  
            //打开文件  
            Workbook book = Workbook.getWorkbook(fis);  
            //得到第一个工作表对象  
            Sheet sheet = book.getSheet(0);  
            //得到第一个工作表中的总行数  
            int rowCount = sheet.getRows();
           // System.out.println("==================PXrowCount======================="+rowCount);
            //日期格式化  
            DateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            //循环取出Excel中的内容  
            Date date = new Date();
            for (int i = 1; i < rowCount; i++) {  
            	info = new PxInfo();  
            	//Cell[] cells = new Cell[18];
                Cell[] cells = sheet.getRow(i);
                int cellslength=cells.length;
//                int celllength=cell.length;
//                for(int j=0;j<cell.length;j++){
//                		cells[j]=cell[j];
//                }
//                for(int k =cellslength;k<cellslength;k++){
//                	cells[k]=;
//                }
                if(cells[0].equals("")){
                	continue;
                }
                if(cellslength >=2){
                	
                	info.setSignupDate(cells[1].getContents().toString());
                }
                if(cellslength >=3){
                	info.setName(cells[2].getContents().toString());
                	
                }
                if(cellslength >=4){
                	info.setSex(cells[3].getContents().toString());
                	
                }
                if(cellslength >=5){
                	info.setIdCard(cells[4].getContents().toString());
                	
                }
                if(cellslength >=6){
                	info.setLevelEdu(cells[5].getContents().toString());
                	
                }
                if(cellslength >=7){
                	info.setUnitOrPerson(cells[6].getContents().toString());
                	
                }
                if(cellslength >=8){
                	info.setTelephone(cells[7].getContents().toString());
                	
                }
                if(cellslength >=9){
                	
                	info.setContactOfUnit(cells[8].getContents().toString());
                }
                if(cellslength >=10){
                	info.setUnitPhone(cells[9].getContents().toString());
                	
                }
                if(cellslength >=11){
                	info.setTrainPlace(cells[10].getContents().toString());
                	
                }
                if(cellslength >=12){
                	info.setTrainType(cells[11].getContents().toString());
                	
                }
                if(cellslength >=13){
                	info.setTest(cells[12].getContents().toString());
                	
                }
                if(cellslength >=14){
                	info.setStandardAmount(cells[13].getContents().toString());
                	
                }
                if(cellslength >=15){
                	info.setDiscountAmount(cells[14].getContents().toString());
                	
                }
                if(cellslength >=16){
                	info.setPayCost(cells[15].getContents().toString());
                	
                }
                if(cellslength >=17){
                	info.setPayNumber(cells[16].getContents().toString());
                	
                }
                if(cellslength >=18){
                	
                	if(!cells[17].getContents().toString().equals("")){
                		info.setDueToDate(ft.parse(cells[17].getContents().toString()));
                	}
                }
                if(cellslength >=19){

                    if(!cells[18].getContents().toString().equals("")){
                        info.setTestDate(ft.parse(cells[18].getContents().toString()));
                    }
                }
                if(cellslength >=20){
                	info.setLicenseStatus(cells[19].getContents().toString());
                }
                if(cellslength >=21){

                    if(!cells[20].getContents().toString().equals("")){
                        info.setCertificateUsedDate(ft.parse(cells[20].getContents().toString()));
                    }
                }
                if(cellslength >=22){
                    info.setCertificateNum(cells[21].getContents().toString());
                }
                if(cellslength >=23){
                    info.setStudentId(cells[22].getContents().toString());
                }
                if(cellslength >=24){
                    info.setFirstRetestFee(cells[23].getContents().toString());
                }
                if(cellslength >=25){
                    info.setSecondRetestFee(cells[24].getContents().toString());
                }
                if(cellslength >=26){
                    info.setThirdRetestFee(cells[25].getContents().toString());
                }
                if(cellslength >=27){
                    info.setFirstRetesPayNumber(cells[26].getContents().toString());
                }
                if(cellslength >=28){
                    info.setSecondRetestPayNumber(cells[27].getContents().toString());
                }
                if(cellslength >=29){
                    info.setThirdRetesPayNumber(cells[28].getContents().toString());
                }
                if(cellslength >=30 && !"".equals(cells[29].getContents().toString())){
                    info.setTheoryResults(Integer.parseInt(cells[29].getContents().toString()));
                }
                if(cellslength >=31 && !"".equals(cells[30].getContents().toString())){
                    info.setActualResults(Integer.parseInt(cells[30].getContents().toString()));
                }
                if(cellslength >=32 && !"".equals(cells[31].getContents().toString())){
                    info.setFirstRetesttheoryResults(Integer.parseInt(cells[31].getContents().toString()));
                }
                if(cellslength >=33 && !"".equals(cells[32].getContents().toString())){
                    info.setSecondRetesttheoryResults(Integer.parseInt(cells[32].getContents().toString()));
                }
                if(cellslength >=34 && !"".equals(cells[33].getContents().toString())){
                    info.setThirdRetesttheoryResults(Integer.parseInt(cells[33].getContents().toString()));
                }
                if(cellslength >=35 && !"".equals(cells[34].getContents().toString())){
                    info.setFirstRetestactualResults(Integer.parseInt(cells[34].getContents().toString()));
                }
                if(cellslength >=36 && !"".equals(cells[35].getContents().toString())){
                    info.setSecondRetestactualResults(Integer.parseInt(cells[35].getContents().toString()));
                }
                if(cellslength >=37 && !"".equals(cells[36].getContents().toString())){
                    info.setThirdRetestactualResults(Integer.parseInt(cells[36].getContents().toString()));
                }
                infos.add(info);
            }  
              
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        return infos;  
    }
}
