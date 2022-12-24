
public class Store {
    int price=1000;
    Customer customer=new Customer();
    Card cusCard=new Card(50000);
    Card selCard=new Card(10000);
    StoreHouse storeHouse=new StoreHouse();
    Delivery delivery=new Delivery();
    Bank bank=new Bank("1111111111111111","11/12",123 );

    public void doSale(){
        customer.Input(cusCard, delivery);
        bank.CheckCard(cusCard,selCard,price);
        if(!storeHouse.CheckProduct(customer.getProduct())){
            System.out.println("Товара нет в наличии!");
            System.exit(0);
        }
        storeHouse.removeProduct(customer.getProduct());
        storeHouse.sendToDelivery(customer.getProduct());
        delivery.sendToCustomer();
    }


}
