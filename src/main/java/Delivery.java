public class Delivery {
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sendToCustomer() {
        System.out.println("Товар доставлен покупателю по адресу: " + address);
    }
}
