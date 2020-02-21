public class Zoo {


    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn Rarity = new Unicorn("Rarity");
        Rarity.eat("marshmallows");
        Rarity.eat("meat");

        Giraffe Gemma = new Giraffe("Gemma");
        Gemma.eat("leaves");
        Gemma.eat("meat");

        Bee Stinger = new Bee("Stinger");
        Stinger.eat("pollen");
        Stinger.eat("ice cream");

        Animal[] animals = {Stinger, Gemma, Rarity, pooh, tigger};

        Zookeeper Zoebot = new Zookeeper("Zoebot");
        Zoebot.feedAnimals(animals, "steak");



    }


}


