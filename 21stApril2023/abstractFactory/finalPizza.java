package abstractFactory;

public class FinalPizza {
	 public static void main(String[] args) {
	        SimplePizzaFactory factory = new SimplePizzaFactory();
	        PizzaStore store = new PizzaStore(factory);

	        AbstractFactory pizza = store.orderPizza("cheese");
	        System.out.println(pizza.getName() + " ready"+"\n");

	        pizza = store.orderPizza("veggie");
	        System.out.println(pizza.getName() + " ready"+"\n");
	        
	        pizza = store.orderPizza("pepperoni");
	        System.out.println(pizza.getName() + " ready"+"\n");
	    }
}
