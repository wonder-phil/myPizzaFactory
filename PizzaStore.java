public class PizzaShop {
    private String name;
    private String address;

    public static void main(String[] args) {
        PizzaShop myPizzaShop = new PizzaShop("Gourmet Pizza", "123 Flavor  St");   
    }

    public PizzaShop(String name, String address) {
        this.name = name;
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void openShop() {
        System.out.println(name + " at " + address + " is now open!");
    }

    public void closeShop() {
        System.out.println(name + " is now closed.");
    }
}