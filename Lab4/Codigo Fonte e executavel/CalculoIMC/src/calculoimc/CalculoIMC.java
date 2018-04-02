package calculoimc;
import javax.swing.JOptionPane;;


public class CalculoIMC
{

 public static void main(String[] args) 
 {
     boolean result;
 String speso,saltura;
 
 float peso, altura;
 float imc;
 String classifica;
 

 String bemVindo = ("Programa para calculo do IMC! \n (Ok para continuar) \n\n");
		JOptionPane.showMessageDialog(null,bemVindo);
result= false;

 speso = JOptionPane.showInputDialog("Digite o peso em Kg(Ex:70)");//recebe peso
 
result = speso.matches("\\d+")&&(Float.parseFloat(speso)>1)&&!(speso.indexOf(',') != -1||speso.indexOf('.') != -1 );//resultado esperado(somentte numeros maior que 1, sem virgula ou pontos)



while (!result){//reagindo a resultado de teste falho
    String messageError = ("erro de digitação:\n campo só aceita numeros inteiros maiores que 1");
		JOptionPane.showMessageDialog(null, messageError);
    speso = JOptionPane.showInputDialog("Digite o peso em Kg(Ex:70)");
    result = speso.matches("\\d+")&&(Float.parseFloat(speso)>1)&&!(speso.indexOf(',') != -1||speso.indexOf('.') != -1 );//testando se somente tem numeros

}
peso = Float.parseFloat(speso); // peso foi validade e transformado em float



saltura = JOptionPane.showInputDialog("Digite a sua altura em cm positivo abaixo de 200(Ex:180)");//recebe altura
result = saltura.matches("\\d+")&&(Float.parseFloat(saltura)<200&&Float.parseFloat(saltura)>0)&&!(saltura.indexOf(',') != -1||saltura.indexOf('.') != -1 ); //resultado esperado(somentte numeros maior que 1, sem virgula ou pontos)


   
       
while (!result){
    String messageError = ("erro de digitação:\n campo só aceita numero");
		JOptionPane.showMessageDialog(null, messageError);
    saltura = JOptionPane.showInputDialog("Digite a sua altura em cm positivo abaixo de 200(Ex:180)");
    result = saltura.matches("\\d+")&&(Float.parseFloat(saltura)<200&&Float.parseFloat(saltura)>0)&&!(saltura.indexOf(',') != -1||saltura.indexOf('.') != -1 ); //resultado esperado(somentte numeros maior que 1, sem virgula ou pontos)
}
altura = Float.parseFloat(saltura);//altura foi validada

 imc = (float) (peso/(altura*altura*0.0001));

 
 if (imc < 20.7)
 classifica = "  Abaixo do peso: \n Você está abaixo do peso recomendado.";
 else if (imc < 26.4)
 classifica = "- No peso normal: \nVocê está muito bem! Continue assim";
 else if (imc < 31.1)
 classifica = "Acima do peso: \n Você está acima do peso recomendado. Cuidado!";
 else
 classifica = "Obesidade: \n Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
 
 
 JOptionPane.showMessageDialog(null, "IMC Calculado = "+imc+" - \n "+classifica);
 
 
 
 
 }
 }