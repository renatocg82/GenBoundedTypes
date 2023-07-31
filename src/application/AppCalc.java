package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;

public class AppCalc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		List<Product> pList = new ArrayList<>();
		
		String path = "C:\\temp\\ws_eclipse\\GenBoundedTypes\\inEx.txt";
		
		try (FileReader fr = new FileReader(path) ; BufferedReader br = new BufferedReader(fr)){
			
			String line = br.readLine();
			
			while (line != null) {
				String[] strList = line.split(",");
				pList.add(new Product(strList[0], Double.parseDouble(strList[1])));
				
				line = br.readLine();
			}
			
			
			System.out.println("Most Expensive: ");
			Product expProd = CalculationService.max(pList);
			System.out.println(expProd);
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		scStr.close();
		sc.close();
	}

}
