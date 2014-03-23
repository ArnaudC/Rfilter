
public class RFilter {

    public static void main(String[] args) {
        System.out.println(rMessageFilter("hj fezh\"efgz \n dioaz\rj za'io da&fze$cfez"));
    }
    
    static String rMessageFilter(String in) {
        return in.replace("\n", "\\n").
                replace("\r", "\\r").
                replace(";", ",").
                replace("\"", "\"\"").
                replace("'", "''").
                replace("#", "$");
    }
}
