package collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProductPriceChangeApp {


		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			
			Map<Integer,String> map1=new LinkedHashMap<Integer,String>();
			Map<Integer,Integer> map2=new LinkedHashMap<Integer,Integer>();
			for(int i=0;i<n;i++) {
				int productCode=scan.nextInt();
				String catogary=scan.next();
				int price=scan.nextInt();
				
				map1.put(productCode,catogary);
				map2.put(productCode,price);
			}
			Map<Integer,Integer> map3=ProductService.changeProductPrice(map1, map2);
			if(map3==null || map3.isEmpty())
				System.out.println("No Electronic Products");
			for(Map.Entry<Integer, Integer> e:map3.entrySet()) {
				System.out.println(e.getKey()+" - "+e.getValue());
			}
			scan.close();
		}

	}


//CODE HERE
 class ProductService {

	
	static Map<Integer, Integer>  changeProductPrice(Map<Integer, String> map1, Map<Integer, Integer> map2) {
		
		if(map1==null || map2==null){
			return null;
		}
		Map<Integer, Integer> map3=new LinkedHashMap<Integer,Integer>();
		
		Iterator<Entry<Integer, String>> itr1=map1.entrySet().iterator();
		Iterator<Entry<Integer, Integer>> itr2=map2.entrySet().iterator();
		while(itr1.hasNext() && itr2.hasNext()) {
			
			Map.Entry<Integer, String> entry1=(Entry<Integer, String>) itr1.next();
			Map.Entry<Integer, Integer> entry2=(Entry<Integer, Integer>) itr2.next();
			if(entry1.getValue().equalsIgnoreCase("electronic")) { 
			    float d=Math.round(entry2.getValue()*10)/(float)100;
				float i=entry2.getValue()-d;
				map3.put(entry1.getKey(),Math.round(i));
			}
		}
		return map3;
	}
}


 
/*
 * Problem Statement: Change Product Price This program is used to provide 10%
 * discount on product price, if the product belongs to 'electronic' category.
 * 
 * User provides the product details which include product code, category and
 * price. Product code and price are integers and category is string.
 * 
 * The product details need to be stored in two Maps, which maintain the
 * insertion order. The First map contains product code as key and category as
 * value. The second map contains same product code as key and price as value.
 * 
 * The designed solution contains a ProductService class having a static method
 * used for calculating discounted price.
 * 
 * Create a class ProductService with the static method having the below
 * signature
 * 
 * changeProductPrice(Map<Integer, String> , Map<Integer, Integer> ):
 * Map<Integer, Integer> The input to the method are two Maps containing the
 * product details The method should return a Map containing only products of
 * electronic category with key as product code and value as discounted price
 * The discounted price should be rounded to the nearest integer The sequence of
 * the products in the returned map should be maintained as per the insertion
 * sequence If one or both the input maps are null, method should return null If
 * there are no electronic products in the input, an empty map should be
 * returned Complete the main method in ProductPriceChangeApp as given below
 * 
 * Accept inputs from the console The first input is integer(n) denoting the
 * number of products, followed by product code, category and price of 'n'
 * products The product details should be stored in two maps and passed to the
 * static method The output Map should be displayed as per the format given in
 * example section Example Sample Input: 3 101 electronic 1000 102 apparel 2000
 * 103 electronic 50
 * 
 * Expected Output: 101 - 900 103 - 45 Sample Input: 4 1001 Electronic 6000 1004
 * electronic 200 1006 toys 500 1002 ELECTRONIC 150
 * 
 * Expected Output: 1001 - 5400 1004 - 180 1002 - 135
 */