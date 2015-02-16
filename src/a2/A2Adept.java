package a2;

import java.util.Scanner;

public class A2Adept {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		process_input(s);
	}
	
	public static void process_input(Scanner s) {
		int n = s.nextInt();// The number of rectangles
		Rectangle[] rectangles=new Rectangle[n];//use array to store access to rectangle objects
		int[] pnum_contained=new int[n];//array to store number of points contained
		
		/*assign values to rectangles*/
		for(int i=0;i<n;i++){
			String label=s.next();
			/*extract coordinates of bottom_left and upper_right corner of each rectangles*/
			rectangles[i]=new Rectangle(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),label);
		}
		
		
		int m=s.nextInt();//The number of points
		Point[] points=new Point[m];//array to store access to points
		/*assign values to points*/
		for(int i=0;i<m;i++){
			points[i]=new Point(s.nextInt(),s.nextInt());
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(rectangles[i].testPoint(points[j])) {//judge if inside rectangle
					pnum_contained[i]++;
				}
			}
			/*print out result*/
			System.out.println(rectangles[i].getLabel()+" contains "+pnum_contained[i]+" points");
		}
		
		

	}
}
