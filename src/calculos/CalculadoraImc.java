package calculos;

public class CalculadoraImc {
	
	public double peso, altura, imc;
	
	public void calcular() {
		
		imc = peso / (altura * altura);
		
	}
	
	public void classificar() {
		if(imc < 18.5) {
			System.out.println("Classifica��o: Abaixo do peso.");
		} else if(imc > 18.5 && imc < 25) {
			System.out.println("Classifica��o: Peso normal.");
		} else if(imc > 25 && imc < 30) {
			System.out.println("Classifica��o: Sobrepeso.");
		} else if(imc > 30 && imc < 35) {
			System.out.println("Classifica��o: ");
		} else if(imc > 35 && imc < 40) {
			System.out.println("Classifica��o: Obesidade grau II.");
		} else if(imc > 40 || imc == 40) {
			System.out.println("Classifica��o: Obesidade grau III ou M�rbida.");
		}
	}

}
