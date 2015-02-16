package a2;

import java.util.Scanner;

public class A2Novice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		process_input(s);
	}
	
	public static void process_input(Scanner s) {
		int n=s.nextInt();// The number of rectangles
		int num_square=0, num_wider=0, num_taller=0;//variable to store the number of square, wider and taller rectangles
		Rectangle min_peri=null, max_peri=null, min_area=null,max_area=null;//variable to store address to min/max perimeter rectangles etc.
		
		for(int i=0;i<n;i++){
			String label=s.next();
			
			Rectangle rectangles=new Rectangle(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),label);//create a new rectangle, using rectangles to store address 
			
			/*judge square, wider,taller*/
			if(rectangles.isSquare()) num_square++;
			else if(rectangles.isWide()) num_wider++;
			else if(rectangles.isTall()) num_taller++;
			
			/*judge min,max perimeter and area*/
			if(i==0){
				min_peri=rectangles;
				max_peri=rectangles;
				min_area=rectangles;
				max_area=rectangles;
			}
			else{
				if(rectangles.getPerimeter()<min_peri.getPerimeter()) min_peri=rectangles;
				if(rectangles.getPerimeter()>max_peri.getPerimeter()) max_peri=rectangles;
				if(rectangles.getArea()<min_area.getArea()) min_area=rectangles;
				if(rectangles.getArea()>max_area.getArea()) max_area=rectangles;
			}
		}
		/*print out result*/
		System.out.println("Square count = "+num_square);
		System.out.println("Wide count = "+num_wider);
		System.out.println("Tall count = "+num_taller);
		System.out.println("Min perimeter = "+min_peri.getPerimeter()+" ("+min_peri.getLabel()+")");
		System.out.println("Max perimeter = "+max_peri.getPerimeter()+" ("+max_peri.getLabel()+")");
		System.out.println("Min area = "+min_area.getArea()+" ("+min_area.getLabel()+")");
		System.out.println("Max area = "+max_area.getArea()+" ("+max_area.getLabel()+")");
		
		

		
		

	}
}
