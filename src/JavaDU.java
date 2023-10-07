import java.util.ArrayList;
import java.util.List;

public class JavaDU {
    public static List<Integer> findDuplicates(int[] ar) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j] && !duplicates.contains(ar[i])) {
                    duplicates.add(ar[i]);
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] numeros = {1,2,2,3,8, 8,4,46,84};
        List<Integer> duplicate= findDuplicates(numeros);
        System.out.println("El número duplicado es: "+ duplicate);
    }
}
