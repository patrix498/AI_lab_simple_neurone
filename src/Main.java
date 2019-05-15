import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
/*        Neuron neuron = new Neuron(2);

        //int[][]test = {{1,1},{0,0}};

        int[] wejscie = new int[2];
        wejscie[0] = 0;
        wejscie[1] = 1;


        neuron.learning(1, wejscie);

        for (double n:neuron.wages) {
            System.out.println(n);
        }*/

    //trzy warstowa sieć neuronowa


//
/*        int size = 3;
        int sizeArr[] = {3,2,1};

        */

/*
        ArrayList<Neuron> InputLayer = new ArrayList<>();
        ArrayList<Neuron> HiddenLayer = new ArrayList<>();
        ArrayList<Neuron> OutputLayer = new ArrayList<>();
*/

        int size = 3;
        int sizeArr[] = {3,2,1};
        int inputSize[] = {2,3,2};

        Neuron network[][] = new Neuron[3][];
        for (int k = 0; k < size; k++){
            network[k] = new Neuron[sizeArr[k]];
            for (int l=0; l < sizeArr[k]; l++){
                network[k][l] = new Neuron(inputSize[k]);
            }
        }

        System.out.println(obliczanie(network, size));

    }

    private static int obliczanie(Neuron[][] network, int size){

        int[] we = {1,1};

        int output[][] = new int[3][];
        output[0] = new int[3];
        output[1] = new int[2];
        output[2] = new int[1];

       for(int i = 0; i < 3; i++) {
            output[0][i] = network[0][i].licz(we);
        }

        for(int i = 1; i < 3; i++) {
            for (int j = 0; j < output[i].length; j++) {
                output[i][j] = network[i][j].licz(output[i-1]);
            }
        }
        return output[2][0];


    }
}
