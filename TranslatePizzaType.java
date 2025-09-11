public class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzaType) {
        
        switch (pizzaType) {
            case PizzaType.CHEESE:
                return "Cheese";
                
        
            case PizzaType.PEPPERONI:
                return "Pepperoni";
                

            case PizzaType.GREEK:
                return "Greek";
                
        
            case PizzaType.GLUTEN_FREE:
                return "GlutenFree";
                

            case PizzaType.VEGAN:
                return "Vegan";
                
        
            default:
                System.err.println("Not a valid pizza type");
                break;
        }
    }

}
