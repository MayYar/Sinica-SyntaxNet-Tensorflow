package abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class process {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��l�ɮפ��q���åh���T
		
//		String folderPath = "syntaxnet_input/temp/";//��Ƨ����|
//            
//               java.io.File folder = new java.io.File(folderPath);
//               String[] list = folder.list(); 
//        
//                         for(int i = 0; i < list.length; i++){                 		 
//                    		 
//                    		 File fileDir = new File(folderPath+list[i]);
//                 				int k=1;
//                    			BufferedReader br = new BufferedReader(
//                    			   new InputStreamReader(
//                    	                      new FileInputStream(fileDir), "UTF8"));
////                    		 FileReader fr = new FileReader("syntaxnet_input/tp/C-14.txt");
////                    		 BufferedReader br = new BufferedReader(fr);
//                    		 
//                    			int ch;
//                    			for(ch = 1; ch<14; ch++){
//                    				FileWriter fw = new FileWriter("syntaxnet_input/tpp/"+list[i]+"-"+ch);
//                    				String s = Integer.toString(ch);//�۹諸�Ʀr(1.2.3....)
//	                    		 	while (br.ready()) {
//	                    			 
//	                    		 		String str = br.readLine();
//	                    		 		if(k > 2){	//���L�e������T
//	                    		 			if(str.substring(0,2).equals(s)){	//�j�󵥩�10�����p
//	                    		 					if(str.indexOf(":")>-1){	//�p�G���_��
//	                    		 						String[] term = str.split(":");
//	                    		 						if(term.length>1){
//	                    		 							System.out.println(term[0]);	//�q��
//	                    		 							System.out.println(term[1]);	//�y�l
//	                    		 							fw.write(term[1]+"\r\n");	//�u��y�l
//	                    		 						}
//	                    		 					}
//	                    		 				}else if(str.substring(0,1).equals(s)){
//	                    		 					if(str.indexOf(":")>-1){	//�p��10�����p
//	                    		 						String[] term = str.split(":");
//	                    		 						if(term.length>1){
//	                    		 							System.out.println(term[0]);
//	                    		 							System.out.println(term[1]);
//	                    		 							fw.write(term[1]+"\r\n");
//	                    		 						}
//	                    		 					}
//	                    		 				}else
//	                    		 					break;
//	                    		 		}k++;                 		 		
//	                    		 
//	                    		 	} fw.close();//while 
//                    			}//for
//                    			br.close();
                    			
        
	                    			
	                    		 		
	                    		 		

                         
		 //Parsing Tree�B�z  and ���s��
                    			String folderPath = "syntaxnet_input(split)/2/H/9/";//��Ƨ����|
                                
                                java.io.File folder = new java.io.File(folderPath);
                                String[] list = folder.list(); 
                         
                                          for(int i = 0; i < list.length; i++){                 		 
                                     		 
                                     		 File fileDir = new File(folderPath+list[i]);
                                  				
                                     			BufferedReader br = new BufferedReader(
                                     			   new InputStreamReader(
                                     	                      new FileInputStream(fileDir), "UTF8"));
                                     			
                                    			//for(int ch = 1; ch<list.length+1; ch++){                               				
                                    				FileWriter fw = new FileWriter("syntaxnet_input(split)/3/H/9/"+list[i]);
                                    				//System.out.println("file: "+list[i]);
                                    				
	 
		
		 int k = 1;  
		 while (br.ready()) {
			 
			 String str = br.readLine();
			
				if(str.length() != 0){
					if(str.substring(0,5).equals("Input")){ //�s���ٵ��y�l
					fw.write("\r\n" + k + "\r\n");		
					k++;
					}
				
				}

			
			fw.write(str + "\r\n");
			 //System.out.println(str);

			 
		 }
		 //br.close();
		 fw.flush();
		 fw.close();
                                    			//}
                                          }     			
	}
	
}
