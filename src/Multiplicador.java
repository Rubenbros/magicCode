public class Multiplicador {
    int num3 = 0;

    public int multiplicar(int num){
        return num;
    }
    public int multiplicar(int num1,int num2){
        return num1 * num2;
    }
    public int multipliplicar(int num1,int num2,int num3){
        num1 = multiplicar(num1,num2);
        return num3;
    }

    public int multiplicar(double num1,double num2){
        return (int) (num1 * num2) % 10;
    }
}
