import java.util.Objects;

class Type1 {
    public Integer a;

    public int getA() {
        return a;
    }

    public void setA(String a) {
        this.a = Integer.parseInt(a);
    }

    protected void setA(int a){
        this.a = a;
    }

    int increaseValueA(){
        return ++this.a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type1 type1 = (Type1) o;
        return Objects.equals(a, type1.a);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a);
    }
}
// public , private , protected
// -------------------------------------------------------------------

public class PublicPrivateProtected{

    public static void main(String[] args) {
        Type1 obj = new Type1();
        obj.setA("12");
        obj.setA(12);

        Type1 obj1= new Type1();
        obj1.setA(3);
        obj1.increaseValueA();
        obj.increaseValueA();

        Type1 obj2= new Type1();
//        obj2.setA(12);

        System.out.println("");
        System.out.println(obj2.getA());
    }

}
