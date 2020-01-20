public class NullObjectDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Jared");
        System.out.println(customer1.getName());
    }
}
