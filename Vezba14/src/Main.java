public class Main {

    public static void main(String[] args) {
	    int x = 523134;
	    int y = 325423;

	    if(x%y==0){
            System.out.println("Nema ostatka");
        } else if(x%y>1000){
            System.out.println("Ostatak je veci od 1000");
        } else if(x%y<1000){
            System.out.println("Ostatak je manji od 1000");
        }
    }
}
