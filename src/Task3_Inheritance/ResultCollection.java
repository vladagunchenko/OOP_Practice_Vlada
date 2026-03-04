package Task3_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class ResultCollection {

    private List<CalcResult> results = new ArrayList<>();

    public void addResult(CalcResult result) {
        results.add(result);
    }

    public void showAll() {
        for (CalcResult r : results) {
            r.display();
        }
    }
}