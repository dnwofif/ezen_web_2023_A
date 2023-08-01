package 복습.part4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class part4_2 {

public static void main(String[] args) throws IOException {
	
	while(true) {
		
		Scanner scanner = new Scanner(System.in);
		String filePath = "./src/복습/part4/part4재고파일.txt";
		FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
		FileInputStream fileInputStream = new FileInputStream(filePath);
		File file = new File(filePath);
		
		byte[] inByteArray = new byte[ (int)file.length()];
		fileInputStream.read( inByteArray );
		String fileInfo = new String(inByteArray);
			System.out.println( fileInfo );
			
		String[] 재고관리 = fileInfo.split("\n"); System.out.println("제품별 분리 : "+ Arrays.toString(재고관리));
		System.out.println("\n-----------------메뉴-----------------");
		System.out.println(" -1:제품등록 0:결제 ");
			for(int i=0; i<재고관리.length; i++) {
				if(!재고관리[i].equals("")) {
					String name = 재고관리[i].split(",")[0];
					int stock = Integer.parseInt(재고관리[i].split(",")[1]);
					int price = Integer.parseInt(재고관리[i].split(",")[2]);
					int basket = Integer.parseInt(재고관리[i].split(",")[3]);
					
					if(stock == 0) {
						System.out.println((i+1)+":"+name+"[재고없음]");
					}else {
						System.out.println((i+1)+":"+name+"["+price+"]");
					}
				}
			}
		
		}//while e
	}//main e
}//class e
