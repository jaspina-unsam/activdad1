import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAnalyzer  {

    public static int contadorImpares(List<Integer> inputList) {
        int count = 0;
        for(int i=0; i < inputList.size(); i++) {
            if (inputList.get(i) % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> inputList) {
        Map<Integer, Integer> consec = new HashMap<Integer, Integer>();
        for(int i=0; i < inputList.size()-1; i++) {
            if (inputList.get(i+1) - inputList.get(i) == 1) {
                consec.put(i, inputList.get(i));
                consec.put(i+1, inputList.get(i+1));
            }
        }
        return List.copyOf(consec.values());
    }
}