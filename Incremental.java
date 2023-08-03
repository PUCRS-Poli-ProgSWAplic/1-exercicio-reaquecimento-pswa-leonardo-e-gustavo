public class Incremental {
    private static Incremental inc=null;
    private static int count;
    private static int numero;
    private Incremental() {
        this.count=0;
        this.numero=count;
    }

    public static Incremental getInstance(){
        if(inc==null){
            inc=new Incremental();
            return inc;
        }
        else {
            count++;
            numero=count;
            return inc;
        }
    }
    public String toString() {
        return "Incremental " + numero;
    }
}

class TesteIncremental {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Incremental inc = Incremental.getInstance();
            System.out.println(inc);
        }
    }
}
