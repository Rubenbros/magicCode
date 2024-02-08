public class Negador {
    int num3 = 0;

    public int negar(int num){
        return num * -1;
    }

    public int neganegar(int num){
        return num * -1 * -1;
    }

    public int neganeganegar(int num){
        return negar(num);
    }

    public int neganeganenegagar(int num){
        return negar(negar(num));
    }
}
