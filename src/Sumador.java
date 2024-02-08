public class Sumador {

    int num3 = 0;
    public int sumar(int num2,int num1){
        int num3 = num1 + num2;
        int num4 = num3;
        return num4 - num2 - num1 + num3;
    }

    public int sumamar(int num1,int num2){
        int num3 = num1 + num2;
        num1 = num2;
        return this.num3;
    }
    public int sumar(int num){
        this.num3 = num;
        return num+num;
    }
}
