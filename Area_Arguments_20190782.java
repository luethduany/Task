
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double area = 0.0;
		
		if(args.length == 0 || args.length == 0 )
		{
			System.out.println("The Square side length is: 4");
			area = 4*4;
			System.out.println("The area of Square is: "+area);
		}
		else if (args.length == 2 || args.length == 3)
		{
			String shape = args[0];
			
			if(shape.compareToIgnoreCase("square")==0){
				//calculate the side length
				System.out.println("Square side length is: "+args[1]);
				double side = Double.parseDouble(args[1]);
				
				 //Area calculation and print it
				area = side*side;
				System.out.println("Area of Square is: "+area);
		   }
			else if(shape.compareToIgnoreCase("rectangle")== 0)
			{
				
				
				//Rectangle 
				if(args.length == 3)
				{
					//take length for the rectangle.
					System.out.println("Rectangle length: " +args[1]);
					double length = Double.parseDouble(args[1]);
					
					
					System.out.println("Rectangle width: " + args[2]);
					double width = Double.parseDouble(args[2]);
					
					//calculate the area and print it.
					area = length*width;
					
					System.out.println("Area of Rectangle is: "+area);
				}
				else 
				{
					System.out.println("wrong number of arguements.");
				}
				
			} else if(shape.compareToIgnoreCase("circle")== 0)
			{
				// circle 
				 // take radius of the circle
				System.out.println("The radius of circle is: "+args[1]);
				double radius = Double.parseDouble(args[1]);
				
				// calculate the area and print it
				area = 3.14*radius*radius;
				
				System.out.println("The Area of circle is: "+area);
			}
			else if(shape.compareToIgnoreCase("Triangle")== 0)
			{
				if(args.length == 3)
				{
					
					System.out.println("The base of triangle is:"+args[1]);
					double base = Double.parseDouble(args[1]);
					System.out.println("The height of triangle is:"+args[2]);
					double height = Double.parseDouble(args[2]);
					
					// calculating the area of Triangle.
					area = 0.5*base*height;
					System.out.println("The area of Triangle is: "+area);
				}
				else {
					System.out.println("Invalid entery for Triangle arguements.");
				}
			}
			
			
			
		}
		 
              else
			{
				System.out.println("The shape entered doesn't exist.");
			}


	}

}
