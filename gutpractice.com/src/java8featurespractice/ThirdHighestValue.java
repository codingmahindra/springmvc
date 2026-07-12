package java8featurespractice;

public class ThirdHighestValue {

	//int[] arr = [10,20,4,45,99];
	
	public static void main(String []args){
	    
	    int highestvalue = Integer.MIN_VALUE;
	    int secondvalue = Integer.MIN_VALUE;
	    int thirdvalue = Integer.MIN_VALUE;
	    
	    int[] a = {10,20,4,45,99};
	    
	    for(int i = 0; i<a.length; i++){
	        
	        if(a[i] > highestvalue){
	            
	            thirdvalue = secondvalue;
	            secondvalue = highestvalue;
	            highestvalue = a[i];
	        }
	        else if( a[i] > secondvalue && a[i]!=highestvalue ){
	            thirdvalue  = secondvalue;
	            secondvalue = a[i];
	        }else if(a[i] >thirdvalue && a[i]!= secondvalue && a[i]!= highestvalue)
	        {
	        thirdvalue = a[i];
	        }
	    }
	    
	    System.out.println(thirdvalue);
	     
	}
	    
	    
	}
