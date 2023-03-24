package co.edu.itm.undirectedgraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {

    private Scanner scanner;

    public Matrix(Scanner scanner){
        this.scanner = scanner;
    }
    public List<List<Boolean>> square(int size){
        List<List<Boolean>> matrix = new ArrayList<>();
        for(int i=1;i<=size; i++){
            List<Boolean> row = new ArrayList<>();
            for(int j=1; j<=size; j++){
                System.out.println(
                        String.format("Ingrese la posición %d,%d",i,j));
                boolean value = scanner.nextBoolean();
                row.add(value);
            }
            matrix.add(row);
        }
        return matrix;
    }

    void dynamic(int rows, int cols){

    }
}
