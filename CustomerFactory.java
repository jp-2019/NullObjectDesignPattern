public class CustomerFactory {
    public static String[] names = {"Greg", "Jeannie", "Julia"};

    //attaching another method (getCustomer) to abstract class
    //but if there's a name missing, fail gracefully and return null customer
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
