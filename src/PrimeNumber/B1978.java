package PrimeNumber;

import java.util.Scanner;

public class B1978 {
	public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	int cnt = scan.nextInt();
    	int count=0;
    	int result=0;
    	
    	for(int i=0; i<cnt; i++) {
    		int input = scan.nextInt();
    		for(int j=0; j<1000; j++) {
    			
    			if(j!=0&&j!=1&&input!=j&&input%j==0) {
    				count=1;
    			}
    			if(input<j) {
    				if(count==0&&input!=0&&input!=1) {
    					result++;
    				}
    				break;
    			}
    		}
    		count=0;
    	}
    	System.out.println(result);
    }    
}
