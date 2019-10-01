public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.alko = true;
        System.out.println("Name: "+drink1.name);
        System.out.println("Alcohol? "+drink1.alko);
        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "Vodka";
        ingredient1.volume = 50;
        drink1.ingredient = ingredient1;
                System.out.println("Skladniki:");
        System.out.println(drink1.ingredient.name+" - "+drink1.ingredient.volume);
        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "Lime juice";
        ingredient2.volume = 40;
        drink1.ingredient = ingredient2;
        System.out.println(drink1.ingredient.name+" - "+drink1.ingredient.volume);
        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "Water";
        ingredient3.volume = 60;
        drink1.ingredient = ingredient3;
        System.out.println(drink1.ingredient.name+" - "+drink1.ingredient.volume);
        Ingredient ingredient4 = new Ingredient();
        ingredient4.name = "Mint";
        drink1.ingredient.name = ingredient4.name;
        System.out.println(drink1.ingredient.name);
        drink1.price = 16;


        System.out.println("Price: "+drink1.price+"zl");
        System.out.print("Vol: ");
        System.out.println( ingredient1.volume+ingredient2.volume+ingredient3.volume);
    }
}
