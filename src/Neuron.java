import java.util.Random;

public class Neuron {
    int[] we = null;
    double[] wages = null;
    int n = 0;

    Neuron(int n) {
        this.n = n;
        we = new int[n];
        wages = new double[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++){
            //we[i] = 0;
            wages[i] = generator.nextDouble()*1.0;
            //System.out.println(wages[i]);
        }
    }

    public int licz(int[] we2){
        double temp = 0.0;
        this.we = we2;
        for (int i = 0; i< n; i++){
            temp += we[i]*wages[i];
        }
        return temp > 0.7 ? 1:0;
    }

    public void learning(int cel, int[] wejscie) {
        Random rand = new Random();
        for (int i = 0; i < 50000; i++) {
            //for (int j = 0; j<n;j++) we[j] = ((Math.random() < 0.5) ? 0 : 1);
            int temp = licz(wejscie);
            for (int j = 0; j<n;j++) wages[j] = wages[j]+wejscie[j]*(cel-temp)*0.1;
        }
    }


}
