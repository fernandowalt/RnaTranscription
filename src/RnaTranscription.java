import java.util.stream.Collectors;

public class RnaTranscription {

    String transcribe(String dnaStrand) {
        return dnaStrand
                .toUpperCase()
                .chars()
                .mapToObj(c -> (char) c)
                .map(c -> c == 'A' ? "U" : c == 'G' ? "C" : c == 'C' ? "G" : "A")
                .collect(Collectors.joining());

    }
}

