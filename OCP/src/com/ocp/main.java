package com.ocp;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Shape> list=new ArrayList<Shape>();
		Rectangle rect1=new Rectangle();
		rect1.setHeight(15);
		rect1.setLength(10);
		list.add(rect1);
		Circle circle1=new Circle();
		circle1.setRadius(10);
		list.add(circle1);
		Rectangle rect2=new Rectangle();
		rect2.setHeight(20);
		rect2.setLength(5);
		list.add(rect2);
		Circle circle2=new Circle();
		circle2.setRadius(8);
		list.add(circle2);
		Triangle triangle=new Triangle();
		triangle.setHeight(10);
		triangle.setLength(15);
		list.add(triangle);
		for(Shape sp:list)
		{
			if(sp instanceof Rectangle)
				System.out.println("Rectange's Area= "+sp.CalculateArea());
			else if(sp instanceof Triangle)
				System.out.println("Triangle's Area= "+sp.CalculateArea());
			else
				System.out.println("Circle's Area= "+sp.CalculateArea());
			
				
			
		}
		
//		List<AllShape> list=new ArrayList<AllShape>();
//		AllShape shape1=new AllShape();
//		shape1.setType(ShapeType.Rectangle);
//		shape1.setHeight(10);
//		shape1.setLength(15);
//		list.add(shape1);
//		AllShape shape2=new AllShape();
//		shape2.setType(ShapeType.Circle);
//		shape2.setRadius(10);
//		list.add(shape2);
//		AllShape triangle=new AllShape();
//		triangle.setType(ShapeType.Triangle);
//		triangle.setHeight(10);
//		triangle.setLength(15);
//		list.add(triangle);
//		for(AllShape shape:list)
//		{
//			if(shape.getType()==ShapeType.Rectangle)
//				System.out.println("Rectangle's Area= "+shape.CalculateArea2());
//			else if(shape.getType()==ShapeType.Triangle)
//				System.out.println("Triangle's Area= "+shape.CalculateArea2());
//			else
//				System.out.println("Circle's Area= "+shape.CalculateArea2());
//			
//		}
//		
		

	}

}
