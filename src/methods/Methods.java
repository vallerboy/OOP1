package methods;

/**
 * Created by Lenovo on 17.07.2017.
 */
public class Methods {
    public static void main(String[] args) {
        new Methods();
    }

    public Methods() {
        // Konstruktor klasy Methods
        // Prezntacja "Cwiczenia metody"
        // Zrelizowane zadania: 1,2,5,7
        System.out.println(isSquare(16));
    }

    // 1
    private int add(int a, int b){
        return a + b;
    }

    // 2
    private int substract(int a, int b){
        return a - b;
    }

    // 5
    private boolean isPitagors(int a, int b, int c){
        return a * a + b * b == c * c ? true : false;
    }

    // 7
    private boolean isSquare(int n){
        if(n == 1){
            return true;
        }
        for(int i = 2; i <= n; i++){
            if(Math.pow(i, 2) == n){
                return true;
            }
        }
        return false;
    }


}
