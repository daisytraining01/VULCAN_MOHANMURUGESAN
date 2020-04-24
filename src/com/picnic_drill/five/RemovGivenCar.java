package com.picnic_drill.five;



public class RemovGivenCar {

	 public static void main(String[] args)  {
		 
		removeChar("REST ASSURED", "ST");
		 
	 }
	  static void removeChar(String string, String StringtoRemove) {
		 char sourceCh[] = string.toCharArray();
		 char removeCH[] = StringtoRemove.toCharArray();
		 char destinationCH[] = new char[sourceCh.length] ;
		 int k = 0;
		 for(int i =0;i<sourceCh.length;i++) {
			 boolean Same = false;
			 for(int j =0;j<removeCH.length;j++) {
				 
				 if(sourceCh[i]== removeCH[j]) {
					 Same = true;
				 }
				 
			 }
			 
			 if(!Same) {
				 destinationCH[k] = sourceCh[i];
				 k++;
			 }
			 
			 
		 }
		 
		 
		 
		 
		 
		System.out.println( String.valueOf( destinationCH));
	 }
	
	
}


/***************************OUTPUT********************************/
/*

RE AURED


*/
/*****************************************************************/ 
