package builder;

public class main {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.Show();
		System.out.println("Total Cost :"+vegMeal.GetCost());
		Meal nonvegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nonvegMeal.Show();
		System.out.println("Total Cost : "+nonvegMeal.GetCost());

	}

}
