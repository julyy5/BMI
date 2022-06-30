import org.w3c.dom.ls.LSOutput;

public class BmiService {
    public int calculate(int w, int h) {
        int result;
        if (w > h) {
            result = w * 10000 / h / h;
        } else {
            result = w * 10000 / h / h;
        }
        return result;
    }
}
