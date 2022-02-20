public class Int_int {
    public static void main(String[] args) {
        Int RfInt = new Int(0);
        int normalInt = 0;

        Plus(RfInt, normalInt);
        System.out.println(RfInt.value);
        System.out.println(normalInt);
    }
    public static void Plus(Int W, int normalInt) {
        W.value = W.value + 1;
        normalInt = normalInt + 1;
    }

    public static class Int {
        public int value;
        public Int(int x){
            value = x;
        }
    }
}
