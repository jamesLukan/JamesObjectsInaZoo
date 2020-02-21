public class Giraffe extends Animal{
    public Giraffe(String name){
        super(name, "leaves");

    }


    public void eat(String food){
        System.out.println(name + " eats " + food);
        if(food == favoriteFood){
            System.out.println("Yum!!! " + name + " wants more " + food);
            System.out.println(name + " sleeps for 8 hours.");
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }

}
