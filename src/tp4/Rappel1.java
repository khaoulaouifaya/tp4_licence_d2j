package tp4;

public class Rappel1 {
	
	static int vitesse = 10;
	
	Rappel1(){
		vitesse++;
	}
	
	Rappel1(int v){
		this();
		vitesse+=v;
	}
	
	public static void main(String[] args) {
		Rappel1 r1=new Rappel1(20);
		Rappel1 r2=new Rappel1(30);
		System.out.println(r1.vitesse);
		System.out.println(r2.vitesse);
	}


}
