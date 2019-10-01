public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.alko = true;
        System.out.println("Name: "+drink1.name);
        System.out.println("Alcohol? "+drink1.alko);
        Ingredient ingredient1 = new Ingredient();
        ingredient1.volume=50;
        ingredient1.name="Vodka";
                drink1.ingredient1=ingredient1;
                System.out.println("Skladniki:");
        System.out.println(drink1.ingredient1.name+" - "+drink1.ingredient1.volume);
        Ingredient ingredient2 = new Ingredient();
        ingredient2.volume=40;
        ingredient2.name="Lime Juice";
        drink1.ingredient2=ingredient2;
                System.out.println(drink1.ingredient2.name+" - "+drink1.ingredient2.volume);
        Ingredient ingredient3 = new Ingredient();
        ingredient3.volume=60;
        ingredient3.name="Water";
        drink1.ingredient3=ingredient3;
                System.out.println(drink1.ingredient3.name+" - "+drink1.ingredient3.volume);
        Ingredient ingredient4 = new Ingredient();
        ingredient4.name="Mint";
        drink1.ingredient4 = ingredient4;
        System.out.println(drink1.ingredient4.name);
        drink1.price = 16;


        System.out.println("Price: "+drink1.price+"zl");
        System.out.print("Vol: ");
        System.out.println( drink1.ingredient1.volume+drink1.ingredient2.volume+drink1.ingredient3.volume);
    }
}
