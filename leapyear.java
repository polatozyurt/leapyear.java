import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year ;
		System.out.print("Y�l� giriniz: ");
		year = input.nextInt();
		int  leapCheck ;
		
		
		
		if(year%100 ==0) {
				if(year%400 == 0) {
				leapCheck=1 ;
				}
				else {
				leapCheck=0;
				}
			
			}
			else if (year%4 ==0) {
			leapCheck=1;
			
			}
			else {
			leapCheck=0;
			}
		
		if(leapCheck==1) {
			System.out.print(year +" bir art�k y�ld�r");
		}
		else if(leapCheck==0){
			System.out.print(year +" bir art�k y�l de�ildir!!");
		}
		
		
	}

}
