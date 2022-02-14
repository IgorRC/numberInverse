public class Main {
    public static void main(String [] args){
        Main main = new Main();
        System.out.println(main.reverse(234));
    }

    public int reverse(int numero){
        boolean negativo = false;
        if( numero < 0 ){
            numero = numero*(-1);
        }
        int reversoNumero = 0;
        int auxNumero = numero;
        byte longitud = 0;
        while(auxNumero > 0){
            auxNumero/=10;
            longitud++;
        }
        for(int i = 0 ; i < longitud ; i++){
            reversoNumero = reversoNumero*10 + (numero%10);
            numero/=10;
        }
        if(negativo == true){
            reversoNumero = reversoNumero*(-1);
        }
        return reversoNumero;
    }
}
