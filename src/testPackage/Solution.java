package testPackage;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     	int pos = 0;
    	
    	Scanner scanner = new Scanner(System.in);
    	int Q = scanner.nextInt();
    	Heap heap = new Heap(Q);
    	
    	
    	while(pos<Q) {
    		
    		int action = scanner.nextInt();
    		
    		
    		if(action == ACTIONS.ADD.getValue()) {
    			int value = scanner.nextInt();
    			heap.add(value);
    		}else if(action == ACTIONS.REMOVE.getValue()) {
    			int value = scanner.nextInt();
    			heap.remove(value);
    		}else if(action == ACTIONS.PRINT.getValue()) {
    			heap.printMin();
    			pos++;	
    			continue;
    		} 
    		
    		pos++;
    	} 
    	
    	scanner.close();
    }
    
    public static class Heap{
        private int size = 0;
        private int pos = 0;
        private int min = Integer.MAX_VALUE;
        
        private int[] data = null;
        public Heap(int size){
            this.size  = size;
            data = new int[size];
        }
        
        public void add(int value) {
        	data[pos] = value;
        	pos++;
        	if(min>value) {
        		min = value;
        	}
        }
        
        public void remove(int value) {
        	for(int i =0;i<data.length;i++) {
        		if(data[i] == value) {
        			data[i]=0;
        		}
        	}
        	if(min == value) {
        		minumim();
        	}
        }
        
        public void minumim() {
        	min = Integer.MAX_VALUE;
        	for(int i =0;i<data.length;i++) {
        		if(data[i]<min && data[i]!=0) {
        			min = data[i];
        		}
        	}
        }
        
        public void printMin() {
        	System.out.println(min);
        }
    }
    
    public enum ACTIONS{
        ADD(1),REMOVE(2),PRINT(3);
        
        private int value;
        ACTIONS(int value){
            this.value = value;
        }
        
        public int getValue() {
        	return value;
        }
    }
}