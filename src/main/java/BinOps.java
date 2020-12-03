public class BinOps {
    public String sum(String a, String b) {
        return Integer.toBinaryString(parseInt(a) + parseInt(b));

    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(parseInt(a) * parseInt(b));
    }

    public int parseInt(String value) {
        return Integer.parseInt(value, 2);
    }

}
