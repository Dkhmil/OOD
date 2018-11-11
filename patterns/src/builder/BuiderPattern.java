package builder;

public class BuiderPattern {
    public static void main(String[] args) {
        MealBuilder meal = new MealBuilder();
        Meal vegMeal = meal.prepareNoVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCoast());


        MealBuilder meal1 = new MealBuilder();
        Meal noVegMeal = meal1.prepareVegMeal();
        noVegMeal.showItems();
        System.out.println(noVegMeal.getCoast());
    }
}
