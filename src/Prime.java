public class Prime{

    public static void afiseazaNrPrim(int nr1, int nr2, int diff) {
        for (int i = nr1; i <nr2-diff; i++) {
            if (prim(i) && prim(i + diff)) {
                System.out.println(i + ", " + (i + diff));
            }
        }
    }
    public static boolean prim(int nr){
        for(int i=2; i<Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;

    }
}
