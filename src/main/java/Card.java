public class Card {
    private String number;
    private String date;
    private int cvc;
    private int sumOnCard;

    public Card(int sumOnCard) {
        this.sumOnCard=sumOnCard;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getSumOnCard() {
        return sumOnCard;
    }

    public void setSumOnCard(int sumOnCard) {
        this.sumOnCard = sumOnCard;
    }
}
