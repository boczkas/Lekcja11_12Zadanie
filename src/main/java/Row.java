import java.util.ArrayList;
import java.util.List;

public class Row {
    List<Field> fields;

    public Row() {
        this.fields = new ArrayList<>();
    }

    public void initialize(int size) {
    }

    public void show() {
        for (int i = 0; i < fields.size(); i++) {
            System.out.print(fields.get(i).getSymbol() + " ");
        }
    }
}
