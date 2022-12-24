import java.util.HashMap;

public class StoreHouse {
    HashMap<String, Integer> storage=new HashMap<String, Integer>();
    public StoreHouse(){
        storage.put("computer",100);
        storage.put("dishwasher",123);
        storage.put("coffee maker",264);
        storage.put("phone",56);
        storage.put("electric kettle",28);
        storage.put("iron",13);
        storage.put("microwave",59);
    }

    public boolean CheckProduct(String product){
        return storage.containsKey(product);
    }

    public void removeProduct(String product){
        storage.put(product, storage.get(product)-1);
    }
    public void sendToDelivery(String product){
        System.out.println("Товар " + product + " отправлен в доставку");
    }
}
