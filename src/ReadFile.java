import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ReadFile {
	static List<ArrayList<ArrayList<Integer>>> read(String filename, int noOfMatrix){
		 String element;
		 List<ArrayList<ArrayList<Integer>>> mat = new LinkedList<ArrayList<ArrayList<Integer>>>(); //list of matrices
		 
		 try{
			 BufferedReader buff = new BufferedReader(new FileReader(filename));
			 //loop reads number of matrix specified
			 for(int i =0;i<noOfMatrix;i++){
				 ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
				 while ((element = buff.readLine()) != null) {
					 //trims extra characters
		                if (element.trim().equals("")) {
		                    break; //break if nothing 
		                } 
		                else {
		                	ArrayList<Integer> row = new ArrayList<Integer>();
		                    String[] lineArray = element.split(" "); //split elements on space
		                    for (String number : lineArray) {
		                        row.add(Integer.parseInt(number));
		                    }
		                    temp.add(row); //add element to row
		                
		                
		                }
		         }
				 mat.add(temp); //add row to matrix
				 
				
			 }
			 buff.close(); 
		 }
		 catch (IOException e) {
	            System.err.println("Error: " + e);
		
		
	}
	
	
	return mat;	 
	}
	
	public static int[][] add(List<ArrayList<ArrayList<Integer>>> lst) {
		   int lsize = lst.size();
		   ArrayList<ArrayList<Integer>> A = lst.get(0); //get first element
		   int n = A.size();    
		   int[][] temp = new int[n][n];
		           for (int k = 0; k < n; k++) {
		        	   ArrayList<Integer> x = A.get(k); 
		               for (int j = 0; j < n; j++) {
		                   temp[k][j] = x.get(j);  //copy in temporary matrix
		               }
		           }
		   
		   for(int i=1;i<lsize;i++){
		       ArrayList<ArrayList<Integer>> B = lst.get(i);
		       int m = B.size();    
		               if(n != m){
		                   break;//break if n and m not equal
		               }
		               else{
		                   for (int k = 0; k < n; k++) {
		                	   ArrayList<Integer> x1 = B.get(k);
		                       for (int j = 0; j < n; j++) {
		                           
		                           temp[k][j] = temp[k][j] +x1.get(j);
		                       }
		                   }
		               }
		   }
		   
		   for (int k = 0; k < n; k++) {
		            for (int j = 0; j < n; j++){
		                System.out.print(+temp[k][j]+" ");
		            }
		            System.out.print("\n");
		    }
		   
		   return temp;
		}
	public static int[][] subtract(List<ArrayList<ArrayList<Integer>>> lst) {
		   int size = lst.size();
		   ArrayList<ArrayList<Integer>> A = lst.get(0); //get first element
		   int n = A.size();    
		   int[][] temp = new int[n][n];
		           for (int k = 0; k < n; k++) {
		        	   ArrayList<Integer> x = A.get(k);
		               for (int j = 0; j < n; j++) {
		                   temp[k][j] = x.get(j); //add in temp
		               }
		           }
		   
		   for(int i=1;i<size;i++){ //subtract all matrices in list
		       ArrayList<ArrayList<Integer>> B = lst.get(i);
		       int m = B.size();   
		               if(n != m){
		                   break;
		               }
		               else{
		                   for (int k = 0; k < n; k++) {
		                	   ArrayList<Integer> x1 = B.get(k);
		                       for (int j = 0; j < n; j++) {
		                           
		                           temp[k][j] = temp[k][j] - x1.get(j);
		                       }
		                   }
		               }
		   }
		   
		   for (int k = 0; k < n; k++) {
		            for (int j = 0; j < n; j++){
		                System.out.print(+temp[k][j]+" ");
		            }
		            System.out.print("\n");
		    }
		   
		   return temp;
		}
	
	public static int[][] multiply(List<ArrayList<ArrayList<Integer>>> lst) {
		ArrayList<ArrayList<Integer>> A = lst.get(0); //get matrices
		ArrayList<ArrayList<Integer>> B = lst.get(1);
		
		int asize = A.size();
		int bsize = B.size();
		int[][] x = new int[asize][asize];
		int[][] y = new int[bsize][bsize];
		
		
		for(int i =0;i< asize;i++){
			for(int j =0;j<asize;j++){
				x[i][j] = A.get(i).get(j);
				//System.out.print(x[i][j]);
				
			}
		}
		for(int i =0;i< bsize;i++){
			for(int j =0;j<bsize;j++){
				y[i][j] = B.get(i).get(j);
				//System.out.print(y[i][j]);
				
			}
		}
		
		 int xlen = x[0].length; 
	        int yrow = y.length;    
	        if(xlen != yrow) 
	        	return null; 
	        int xrow = x.length;    
	        int ylen = y[0].length;
	        int[][] res = new int[xrow][ylen];
	        for(int i = 0; i < xrow; i++) {         
	            for(int j = 0; j < ylen; j++) {     
	                for(int k = 0; k < xlen; k++) { 
	                    res[i][j] += x[i][k] * y[k][j];
	                }
	            }
	        }
	        int n = res.length;
	        for (int k = 0; k < n; k++) {
	                 for (int j = 0; j < n; j++){
	                     System.out.print(+res[k][j]+" ");
	                 }
	                 System.out.print("\n");
	         }
	        return res;
		
		
	}
	
	

}

