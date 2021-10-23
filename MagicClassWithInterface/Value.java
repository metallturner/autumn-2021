public class Value implements Magic {
    int n;
    int e;

    public Value(int n, int e) {
        this.n = n;
        this.e = e;
    }


    @Override
    public int calcFact() {
        int res = 1;
        for (int i = 1; i <= Math.abs(this.n); i++) {
            if (n < 0) {
                res = res * -i;
            } else
                res = res * i;
        }
            return res;
        }


        @Override
        public int calcAbs () {
        return Math.abs(this.n);
        }


    @Override
    public int calcPow() {
        return (int) Math.pow(this.n, this.e);
    }
}
