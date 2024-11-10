public class Type1 {
    public int a ;

    public int getA() {
        return a;
    }

    protected void setA(int a) {
        this.a = a;
    }
}
// public , private , protected
// -------------------------------------------------------------------

class Main{

    public static void main(String[] args) {
        Type1 obj = new Type1();
        obj.setA(12);

        System.out.println("");
        System.out.println(obj.getA());
    }

}
