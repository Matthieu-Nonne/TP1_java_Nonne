package personnages.principaux;
import personnages.Human;

public class Ronin extends Human {

    public Ronin(String name, int money, String drink) {
        super(name, money, drink);
    }


    private int honneur=1;

    public void giveMoney(Merchant commerçant, int money){
        commerçant.setMoney(commerçant.getMoney()+money);
        setMoney(getMoney()-money);
        talk("Tiens " + commerçant.getName() + ", voilà " + money + " ryо̄s");
        commerçant.winMoney(money);
    }

    public void duel(Yakuza yakuza){
        if (2*honneur>yakuza.getReputation()){
            setMoney(getMoney()+yakuza.getMoney());
            yakuza.lose();
            honneur+=1;
            talk("HAAA, j'ai gagné contre toi " + yakuza.getName() + " !!!");
        } else {
            honneur-=1;
            yakuza.win();
            talk("Merde, j'ai perdu...");
        }
    }

}
