public class vehicle{

    public static void main (String[]args){
     Petrol pe=new Petrol();
     pe.run();
    // Diesel de=new Diesel();
    // de.start();
     Electricengine ee=new Electricengine();
ee.start();
HydrogenEngine he=new  HydrogenEngine ();
he.start();
he.stop();
    }
}