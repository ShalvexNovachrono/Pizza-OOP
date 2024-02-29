import java.util.ArrayList;


public class Main {
   static class Pizza {
       private String size;
       private float price;
       private ArrayList<String> topping;
       private ArrayList<String> sideOrder;

       public Pizza(String size, float price) {
           this.size = size;
           this.price = price;
           this.topping = new ArrayList<>();
           this.sideOrder = new ArrayList<>();
       }

       public void addTopping(String toppingName) {
           this.topping.add(toppingName);
       }

       public void addSideOrder(String toppingName) {
           this.sideOrder.add(toppingName);
       }

       public String getSize() {
           return size;
       }

       public float getPrice() {
           return price;
       }

       public ArrayList<String> getToppings() {
           return topping;
       }

       public ArrayList<String> getSideOrders() {
           return sideOrder;
       }
   }

   static class PizzaList {
       private ArrayList<Pizza> pizza;

       public PizzaList() {
           this.pizza = new ArrayList<>();
       }

       public void addToPizzaList(Pizza pizza) {
           this.pizza.add(pizza);
       }

       public void removeAllPizzaFromPizzaList() {
           this.pizza.removeAll(pizza);
       }

       public void removePizzaFromPizzaList(int index) {
           this.pizza.remove(index);
       }

       public ArrayList<Pizza> getPizzaList() {
           return pizza;
       }
   }

   static void printPizza(ArrayList<Pizza> pizzas) {
       for (int i = 0; i < pizzas.size(); i++) {
           System.out.println(pizzas.get(i).getSize());
           System.out.println(pizzas.get(i).getPrice());
       }
   }

   public static void main(String[] args) {
       PizzaList pizzaList = new PizzaList();

       Pizza pizza = new Pizza("small", (float)5.2);
       pizza.addTopping("Mushrooms");
       pizza.addTopping("Mushrooms2");
       pizza.addTopping("Mushrooms3");
       pizza.addSideOrder("Drink1");
       pizza.addSideOrder("Drink2");
       pizza.addSideOrder("Drink3");


       Pizza pizza1 = new Pizza("small", (float)1.2);
       pizza1.addTopping("Mushrooms");
       pizza1.addTopping("Mushrooms2");
       pizza1.addTopping("Mushrooms3");
       pizza1.addSideOrder("Drink1");
       pizza1.addSideOrder("Drink2");
       pizza1.addSideOrder("Drink3");

       // add two pizza
       pizzaList.addToPizzaList(pizza);
       pizzaList.addToPizzaList(pizza1);

       // show pizzas
       printPizza(pizzaList.getPizzaList());

       // remove pizza with index 0
       pizzaList.removePizzaFromPizzaList(0);


       // show pizzas
       printPizza(pizzaList.getPizzaList());

       // add pizza
       pizzaList.addToPizzaList(pizza);

       // show pizzas
       printPizza(pizzaList.getPizzaList());

       // remove all pizza
       pizzaList.removeAllPizzaFromPizzaList();

       // show pizzas
       printPizza(pizzaList.getPizzaList());
   }

}



