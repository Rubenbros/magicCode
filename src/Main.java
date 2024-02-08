import java.util.Scanner;

public class Main {
    //Este código te pide un número y después de un montón de operaciones te devuelve
    //el mismo número que le has ofrecido. Adivina donde esta la trampa.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Negador negador = new Negador();
        Sumador sumador = new Sumador();
        Multiplicador multiplicador = new Multiplicador();
        System.out.println("Introduce un número:");

        int num = scanner.nextInt();
        int num2 = num;
        num2=sumador.sumar(num);
        for( int i = num;num2==i;i++){
            num = negador.neganeganegar(num);
        }
        num2=multiplicador.multiplicar(num2);
        num2=multiplicador.multiplicar(num2,num);
        int num3 = sumador.sumar(num2,num);
        while(num3>0){
            num3 = num3-1;
            num2 = sumador.sumar(num3,num);
            num3 = multiplicador.multiplicar(Math.random()*10,Math.random()*10);
        }
        num = multiplicador.multiplicar(num2*num,num);
        boolean cambiameParaSalirDelBucle = false;
        int num4 = 1;
        while(!cambiameParaSalirDelBucle){
            for(int i = num4;i>0;i--){
                System.out.print("ja");
            }
            System.out.println();
            int random = (int) (Math.random() * 1000) + 1;
            if(random==69){
                cambiameParaSalirDelBucle = true;
            }
            num4++;
        }
        int resultado= multiplicador.multiplicar(sumador.sumamar(num3,num2));

        System.out.println("\nTu número era el " + resultado);
    }
}