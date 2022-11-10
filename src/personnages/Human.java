package personnages;

public class Human {
    private String name;
    private int money;
    private String drink;

    public Human(String name, int money, String drink){
        this.name=name;
        this.money=money;
        this.drink=drink;
    }


    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }


    public void talk(String text){
        System.out.println("(" + this.name + ")" + text);
    }

    public void sayHello(){
        talk("Bonjour je m'appelle " + this.name + " et j'aime boire du " + this.drink
        + " et j'ai " + money + " ryо̄s en poche");
    }

    public void drink(){
        talk("Mmmh, un bon verre de " + this.drink + " ! GLOUPS !");
    }


    public void winMoney(int sommeGagnee){
        this.money+=sommeGagnee;
        talk("Merci pour ces " + sommeGagnee + " ryо̄s");
    }

    public void loseMoney(int sommePerdue){
        this.money-=sommePerdue;
    }
}
