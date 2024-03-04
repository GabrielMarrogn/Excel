import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<String> alfa = new ArrayList<>();
        List<String> respostas = new ArrayList<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            alfa.add(Character.toString(c));
        }

        while (sc.hasNext()) {
            String letras = sc.nextLine();

            String[] arr = letras.split("");

            if (arr.length > 3) {
                respostas.add("Essa coluna nao existe Tobias!");
                continue;
            }

            int total = 0;
            int j = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                
                int k = alfa.indexOf(arr[i])+1;

                total += k * Math.pow(26, j);
                j++;

            }

            if (total > 16384) {
                respostas.add("Essa coluna nao existe Tobias!");
            } else {
                respostas.add(Integer.toString(total));
            }

        }

        for (String p : respostas) {
            System.out.println(p);
        }

        sc.close();
    }

}