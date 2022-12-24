import java.util.Scanner;

public class Customer {
    private String product;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void Input(Card cusCard, Delivery delivery){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of card: ");
        cusCard.setNumber(in.next());
        System.out.print("Input a date of card: ");
        cusCard.setDate(in.next());
        System.out.print("Input a cvc of card: ");
        cusCard.setCvc(in.nextInt());
        System.out.print("Input an address of delivery: ");
        delivery.setAddress(in.next());
        System.out.print("Input a product: ");
        setProduct(in.next());
    }



}
