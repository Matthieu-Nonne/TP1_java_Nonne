package personnages.principaux;

public class Samurai extends Ronin{

    private String seigneur;

    public Samurai(String name, int money, String drink, String seigneur){
        super(name, money, drink);
        this.seigneur=seigneur;
    }

    public void drink(String drink){
        talk("Mmmh, un bon berre de " + drink + " ! GLOUPS !");
    }

    public void sayHello(){
        super.sayHello();
        talk("Je sers le seigneur " + this.seigneur);
    }


}
