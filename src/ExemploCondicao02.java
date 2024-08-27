
public class ExemploCondicao02 {

   //Quero Adicionar Um Desconto Gradativo
   //Valor Maior Que 1000 - 10%
   //Valor Maior Que 2000 - 20%
    //Valor Maior Que 3000 - 30%
    //Valor Menor Que 1000 - 0%

    public static void main(String[] args) {

        double valorBruto = 2500;
        double desconto = 0d;


        if (valorBruto > 1000) {
            desconto = valorBruto * 0.10;
        }
        else if (valorBruto > 2000) {
            desconto = valorBruto * (20 / 100);
        }
        else if(valorBruto > 3000) {
            desconto = valorBruto * (30 / 100);
        }
        System.out.println("valor bruto é " + valorBruto);
        System.out.println("Valor do desconto é " + desconto);
    }
}



