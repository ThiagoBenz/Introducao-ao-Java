import java.util.Scanner;

public class IMCLoop {

    public static void main(String[] args) {
        
        double peso=0;
        double altura=0;
        double imc=0;
        Scanner scanner = new Scanner(System.in);
        String classificacao = "";
        boolean i = true;
        while (i) {
            System.out.println("Digite o peso: ");
        peso = scanner.nextDouble();

        System.out.println("Digite a Altura: ");
        altura = scanner.nextDouble();
        

        imc = peso/Math.pow(altura, 2);
        System.out.println("O IMC é: "+imc);
        
        if (imc<18.5) {
            classificacao = "Magreza";
        }else if(imc>=18.5 && imc<24.9){
            classificacao = "Normal";
        }else if(imc>=24.9 && imc < 29.9){
            classificacao = "Sobrepeso";
        }else if(imc >=29.9 && imc<39.9){
            classificacao = "Obesidade";
        }else if (imc >=39.9) {
            classificacao = "Obesidade Grave";      
        }
        System.out.println(classificacao);
        System.out.println("Deseja calcular mais um IMC? 1-sim 2-nao");
        int resp = scanner.nextInt(); 
         
        if (resp==1) {
            continue;
        }else {
            scanner.close();
            i = false;
        }
        
        }
        
    }
    
}
