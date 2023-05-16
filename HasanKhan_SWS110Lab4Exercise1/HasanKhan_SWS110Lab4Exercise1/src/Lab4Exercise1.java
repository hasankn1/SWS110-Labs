public class Lab4Exercise1 {

	public static void main(String[] args) {
		
		int number1 = 1; int number2 = 2; int number3 = 3; int number4 = 4; int number5 = 5;
		// Int variables used to hold number values
		
		System.out.println("N		N*10		N*100		N*1000");
		
		for (int number = 1; number <=5; number++) {
		// for statement initializes the value for number to be 1, then repeats it 5 times adding 1 each time.
			while(number <= 5) {
		    	   
	   	   if (number == 1) {
	   		   // if number is 1 do this:
	   		   System.out.print(+number);
	   		   number1 = 1 * 10;
	   		   System.out.print("	 	"+number1+"");
	   		   number1 = 1 * 100;
	   		   System.out.print("		"+number1+"");
	   		   number1 = 1 * 1000;
	   		   System.out.print("		"+number1+"\n");
	   		   number++;
		        
		        if (number == 2) {
		        	// if number is 2 do this:
					System.out.print(+number);
					number2 = 2 * 10;
					System.out.print("	 	"+number2+"");
					number2 = 2 * 100;
					System.out.print("		"+number2+"");
					number2 = 2 * 1000;
					System.out.print("		"+number2+"\n");
					number++;
					
					if (number == 3) {
						// if number is 3 do this:
						System.out.print(+number);
						number3 = 3 * 10;
						System.out.print("	 	"+number3+"");
						number3 = 3 * 100;
						System.out.print("		"+number3+"");
						number3 = 3 * 1000;
						System.out.print("		"+number3+"\n");
						number++;
						
						if (number == 4) {
							// if number is 4 do this:
							System.out.print(+number);
							number4 = 4 * 10;
							System.out.print("	 	"+number4+"");
							number4 = 4 * 100;
							System.out.print("		"+number4+"");
							number4 = 4 * 1000;
							System.out.print("		"+number4+"\n");
							number++;
							
							if (number == 5) {
								// if number is 5 do this:
								System.out.print(+number);
								number5 = 5 * 10;
								System.out.print("	 	"+number5+"");
								number5 = 5 * 100;
								System.out.print("		"+number5+"");
								number5 = 5 * 1000;
								System.out.print("		"+number5+"\n");
									}	
						       }
							}
						}
	   	   			}
				}
			}
		}
	}