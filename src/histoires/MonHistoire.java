package histoires;

import personnages.Human;
import personnages.principaux.Merchant;
import personnages.principaux.Ronin;
import personnages.principaux.Samurai;
import personnages.principaux.Yakuza;

public class MonHistoire {
    public static void main(String[] args) {

        Human human = new Human("Prof", 10, "Porto");
            human.sayHello();
            human.drink();
        Merchant commercant = new Merchant("Marchand", 35);
            commercant.sayHello();
        Yakuza yakuza = new Yakuza("Yaku␣le␣noir", 42,
                "biere", "WarSong");
            yakuza.sayHello();
            yakuza.extort(commercant);
        Ronin ronin = new Ronin("Roro", 61, "sake");
            ronin.giveMoney(commercant, 10);
            ronin.duel(yakuza);
            ronin.sayHello();

    }
}
