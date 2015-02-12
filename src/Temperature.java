/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.util.Scanner;
public class Temperature {
	
	public static Scanner kbd = new Scanner(System.in);
        public static final int TEMP =2;
	public static final int MONTH=12;
	
	public static int[][] aTemp = new int [TEMP][MONTH];
	public static String[] monthArray = new String [MONTH];
	
    //Main method is used to call methods 
	public static void main(String [] args){
	
	
		
		System.out.println("Enter Year: ");
		String year= kbd.next();
		aTemp= inputTempYear();
		displayTemp(aTemp);
		System.out.println("FINAL SUMMARY OF "+year);
	
	}
//Method to take values for a single month		
	public static void inputLowAndHighTempForMonth(int [][] arrayTemp, int month){
		
		System.out.println("Enter the low and high temperature for month # "+(month+1));
		for(int i=0; i<TEMP; i++){
				arrayTemp[i][month]=kbd.nextInt();
		}
	}
//Method to take values for an entire year
	public static int [][] inputTempYear(){
			int[][] temp = new int [TEMP][MONTH];
			for(int i=0; i<MONTH; i++){
				inputLowAndHighTempForMonth( temp, i);
			}
			return temp;
	}
//Method to calculate average low
	public static int calculateAvgLow( int [][] aTemp){
		int temp=0;
				for(int i=0; i<MONTH; i++){
					temp+=aTemp[0][i];
				}
		return temp/12;
	}
//Method to calculate average high
	public static int calculateAvgHigh(int [][] aTemp){
		int temp=0;
				for(int i= 0; i<MONTH; i++){
					temp+=aTemp[1][i];
				}
		return temp/12;
	}
//Method to calculate lowest temp
	public static int calculateLowestTemp(int[][]arrayTemp){
	
		int indexLow=0;
			for(int i=0; i<MONTH; i++){
				if (aTemp[0][i]<indexLow)
					indexLow=aTemp[0][i];
				}
			
	return indexLow;
	}

	//Method to calculate the higest temp
	public static int calculateHighestTemp(int[][]aTemp){
		
		int indexHigh=0;
		for(int i=0; i<MONTH; i++){
			if (aTemp[1][i]>indexHigh)
				indexHigh=aTemp[1][i];
		}
		
	return indexHigh;
	
	}

	

	public static void displayTemp(int[][]aTemp){
		System.out.println("Average low temperature of : " +calculateAvgLow(aTemp));
		System.out.println("Average high temperature: "+calculateAvgHigh(aTemp));
		System.out.println("Lowest temperature : "+ calculateLowestTemp(aTemp));
		System.out.println("Highest temperature: "+ calculateHighestTemp(aTemp));

    
    
		
	}
}
	
	
	
