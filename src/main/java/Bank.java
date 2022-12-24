public class Bank {
    private String numberCus;
    private String dateCus;
    private int cvcCus;

    public Bank(String numberCus, String dateCus, int cvcCus) {
        this.numberCus=numberCus;
        this.dateCus=dateCus;
        this.cvcCus=cvcCus;
    }

    public void CheckCard(Card cusCard, Card selCard, int price) {
        if (cusCard.getNumber().equals(numberCus) && cusCard.getDate().equals(dateCus) && cusCard.getCvc() == cvcCus) {
            System.out.println("Данные карты верны");
            if (cusCard.getSumOnCard() >= price) {
                cusCard.setSumOnCard(cusCard.getSumOnCard() - price);
                selCard.setSumOnCard(selCard.getSumOnCard() + price);
                System.out.println("Транзакция прошла успешно");
            }
        }
        else {
            System.out.println("Данные карты не верны");
            System.exit(0);
        }

    }


}
