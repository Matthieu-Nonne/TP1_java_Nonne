package personnages.principaux;
import personnages.Human;

public class Merchant extends Human {
    public Merchant(String name, int money) {
        super(name, money, "thé");
    }

    public int beExtorted(){
        int n = getMoney();
        loseMoney(n);
        talk("Le monde est vraiment trop injuste !!!");
        return n;
    }

    public void recevoir(int moneyReçu){
        setMoney(getMoney()+moneyReçu);
    }

}
