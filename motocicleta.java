class Motocicleta {

    String fabricante;
    String cor;
    boolean estadoMotor = false; //inicializamos com falso
	
	//Primeiro método
    void ligaMotor(){
		if (estadoMotor == true)
			System.out.println("O motor já está ligado.");
		else {
			estadoMotor = true; //sinalizo que o motor está ligado;
			System.out.println("O motor agora foi ligado.");
		}			
    }
	
	//Segundo método
    void mostreValores() {
		System.out.println ("Fabricante: " + fabricante + " Cor: " + cor);
		if (estadoMotor == true)
			System.out.println ("O motor está ligado.");
		else System.out.println ("O motor está desligado.");
    }
	
	public static void main(String args[]){
		Motocicleta moto = new Motocicleta();
		moto.fabricante = "Honda";
		moto.cor = "Prata";
		System.out.println("Invocando o método mostreValores...");
		moto.mostreValores();
		System.out.println("-----------------------------------");
		System.out.println("Ligando o motor...");
		moto.ligaMotor();
		System.out.println("-----------------------------------");
		System.out.println("Invocando o método mostreValores...");
		moto.mostreValores();
		System.out.println("-----------------------------------");
		System.out.println("Ligando o motor...");
		moto.ligaMotor();		
	}
}
