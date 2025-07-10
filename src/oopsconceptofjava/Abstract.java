package oopsconceptofjava;


 abstract class musicalInstrument{
     public void play(){
         System.out.println("Playing the Instrument");
     }
     public abstract void makeSound();


}
    class guitar extends musicalInstrument{

        @Override
        public void makeSound() {
            System.out.println(" Turning the Guitar strings..!");
        }

    }

    class piano extends musicalInstrument{

        @Override
        public void makeSound() {
            System.out.println("Adjusting the piano keys..!");
        }
    }
class flute extends musicalInstrument{

    @Override
    public void makeSound() {
        System.out.println("Flute: Cleaning and tuning the Flute..!");
    }
}


public class Abstract {
    public static void main(String[] args) {

        musicalInstrument g = new guitar();
        musicalInstrument p = new piano();
        musicalInstrument f = new flute();


        g.play();
        g.makeSound();
        p.play();
        p.makeSound();
        f.play();
        f.makeSound();
    }

}
