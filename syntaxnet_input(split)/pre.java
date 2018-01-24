package abc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pre {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//原始檔案分段做並去雜訊
//		FileReader fr = new FileReader("syntaxnet_input/test/C-1.txt");
//		 BufferedReader br = new BufferedReader(fr);
//		 FileWriter fw = new FileWriter("syntaxnet_input(split)/test/C-1-8.txt");
//		
//		 int i = 1;
//		 while (br.ready()) {
//			 
//			 String str = br.readLine();
//			 if(i>2){
//				 //System.out.println(str);
//				 //System.out.println(str.substring(0,1));
//				 if(str.substring(0,1).equals("8")){
//					 String str1 = str.replace("-", "");
//					 String str2 = str1.replace(":", "");
//					 String str3 = str2.replaceAll("[1-9]", "");
//					 fw.write(str3 + "\r\n"); 
//					 System.out.println(str3);
//				 }
//				 
//			 }
//			 i++;
//			 
//			
//		 }
//		
//		 fr.close();
//		 fw.close();
		 //Parsing Tree處理  and 給編號
		 FileReader fr1 = new FileReader("syntaxnet_input(split)/test/C-1#8.txt");
		 BufferedReader br1 = new BufferedReader(fr1);
		 FileWriter fw1 = new FileWriter("syntaxnet_input(split)/test/C-1/C-1#8.txt");
		 
		 
		 int j = 1;	
		 int k = 1;  
		 while (br1.ready()) {
			 
			 String str = br1.readLine();
			//if(j > 1){		//略過大標題
				if(str.substring(0,5).equals("Input")){
					fw1.write("\r\n" + k + "\r\n");		
					k++;
				}
				
			//}
			fw1.write(str + "\r\n");
			j++;
			 
		 }
		 fr1.close();
		 fw1.close();
		 
	}

}
