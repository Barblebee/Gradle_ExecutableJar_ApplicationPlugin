import org.apache.commons.text.similarity.LevenshteinDetailedDistance;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class Main {
    public static void main(String[] args) {
        String str1 = "Benno";
        String str2 = "Benni";
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        int distance = levenshteinDistance.apply(str1, str2);
        System.out.printf("Levenshtein-Distance between '%s' and '%s' is %d.%n", str1, str2, distance);
    }
}
