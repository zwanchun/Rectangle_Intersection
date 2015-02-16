package a2;

import java.util.Scanner;

public class A2Jedi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		process_input(s);
	}
	
	public static void process_input(Scanner s) {
		int n = s.nextInt();// The number of rectangles
		Rectangle[] rectangles=new Rectangle[n];//use array to store access to rectangle objects
		int[][] intersect_matrix=new int[n][n];//array to store intersect situation of all rectangles
		/*assign values to rectangles*/
		for(int i=0;i<n;i++){
			String label=s.next();
			rectangles[i]=new Rectangle(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),label);
		}
		/*judge if two rectangles intersect*/
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(rectangles[i].intersects(rectangles[j])){
					intersect_matrix[i][j]=1;
					intersect_matrix[j][i]=1;
				}
			}
		}
		int flag;//variable to show if the rectangle intersects with at least one rectangle
		for (int i = 0; i < n; i++) {
			flag=0;//variable to show if the rectangle intersects with at least one rectangle
			System.out.print(rectangles[i].getLabel()+" intersects ");
			for(int j=0;j<n;j++){
				if(intersect_matrix[i][j]==1){
					System.out.print(rectangles[j].getLabel()+" ");//print intersection rectangles' labels
					flag=1;
				}
			}
			if (flag==0) System.out.print("nothing");//nothing intersects
			System.out.print("\n");//new line
		}   		
	}
}
