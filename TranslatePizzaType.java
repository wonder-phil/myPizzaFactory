public static class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzaType) {
        
        switch (pizzaType) {
            case PizzaType.Cheese:
                return "Cheese";
                break;
        
            case PizzaType.Peperoni:
                return "Peperoni";
                break;

            case PizzaType.Greek:
                return "Greek";
                break;
        
            case PizzaType.GlutenFree:
                return "GlutenFree";
                break;

            case PizzaType.Vegan:
                return "Vegan";
                break;
        
            default:
                System.err.println("Not a valid pizza type");
                break;
        }
    }

}

, 
    Greek,
    Peperoni,
    GlutenFree,
    Vegan