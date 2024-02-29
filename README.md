# Pizza Ordering System

This Java program simulates a pizza ordering system where users can create pizzas of different sizes, add toppings, and include side orders. The program utilizes object-oriented principles to model pizzas and manage them within a pizza list.

## Features

- **Pizza Class:** Defines a pizza object with attributes such as size, price, toppings, and side orders. Users can add toppings and side orders to a pizza instance.

- **PizzaList Class:** Manages a list of Pizza objects. Users can add pizzas to the list, remove individual pizzas by index, or remove all pizzas from the list.

- **Main Class:** Contains the main method where pizzas are created, added to the pizza list, and manipulated. It also includes a method to print out the details of all pizzas in the list.

## How to Use

1. **Create Pizzas:** Instantiate Pizza objects by specifying the size and price. Add toppings and side orders using the respective methods.

2. **Manage Pizza List:** Add pizzas to the PizzaList instance. Remove individual pizzas by index or remove all pizzas at once.

3. **View Pizza Details:** Use the `printPizza` method to display details of all pizzas in the list.

## Usage Example

```java
// Create PizzaList instance
PizzaList pizzaList = new PizzaList();

// Create Pizza objects
Pizza pizza = new Pizza("small", (float)5.2);
pizza.addTopping("Mushrooms");
// Add more toppings and side orders as needed

// Add pizzas to the list
pizzaList.addToPizzaList(pizza);

// View details of pizzas in the list
printPizza(pizzaList.getPizzaList());

// Remove a pizza
pizzaList.removePizzaFromPizzaList(0);

// Add more pizzas, remove all pizzas, etc.
```
##Contributing
Contributions to enhance the functionality, improve code quality, or fix bugs are welcome. Please fork the repository, make your changes, and submit a pull request for review.

##License
This project is licensed under the MIT License. See the LICENSE file for details.

Feel free to customize it further or add more sections based on your project's needs.
