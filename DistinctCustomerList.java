package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class DistinctCustomerList {
	
	/**
	 *
	 * @author Er. Dilpreet Kaur
	 */


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
	                List <Integer> l1=null;
	                       l1= new ArrayList<>();
	                List <Integer> l2=null;
	                       l2= new ArrayList<>();
	                        List <Integer> l3=null;
	                       l3= new ArrayList<>();
	                try{       
	                int m = sc.nextInt();
	                if(m>0){
	                for(int i =0 ;i <m;i++)
	                {
	                    l1.add(sc.nextInt());
	                }}
	                
	                int n = sc.nextInt();
	                if(n>0)
	                {
	                for(int i =0 ;i <n;i++)
	                {
	                    l2.add(sc.nextInt());
	                }
	                }
	               Integer[]output= DistinctCustomerList.getDistinctCustomers(l1, l2);
	               if(output==null)
	               {
	               	System.out.println(l3);
	               }
	               else{
	               for(int i=0;i<output.length;i++)
	               {
	                   l3.add(output[i]);
	               }
	               System.out.println(l3);
	               }
	        } catch(Exception e)
	                {
	                  System.out.println(l3);
	                }

		}

		public static Integer[] getDistinctCustomers(List<Integer> first, List<Integer> second) {
			Integer[] output = null;
	                try{
			
	                TreeSet <Integer> t1=new TreeSet<Integer>();
	                TreeSet <Integer> t2=new TreeSet<Integer>();
	              
	                
	                t1.addAll(first);
	                t2.addAll(second);
	                first.clear();
	                second.clear();
	                first.addAll(t1);
	                second.addAll(t2);
	                
	                
	                List<Integer> union = new ArrayList<Integer>(first);
	                union.addAll(second);
	                List<Integer> intersection = new ArrayList<Integer>(first);
	                intersection.retainAll(second);
	                union.removeAll(intersection);
	                
	              
	             
	              
	               
	                 
	                Collections.sort(union, new Comparator<Integer>(){
			
					

	                    @Override
	                    public int compare(Integer o1, Integer o2) {
	                        
	                    if(o1>o2)  
	                        return -1;  
	                    else  
	                        return 1;  
	                    }
				});
	                     
	                  
	                    output = new Integer[union.size()];
	                    for(int k=0;k<union.size();k++)
	                    {
	                       
	                        output[k]=union.get(k);
	                        
	                    }
	                }
	                catch(Exception e)
	                {
	                	output = new Integer[0];
	                    return output;
	                }
	              
	                
	                return output;
			//CODE END
		
		}
	}
	 


