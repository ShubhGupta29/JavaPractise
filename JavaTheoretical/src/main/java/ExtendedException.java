public class ExtendedException {

    public static void main(String[] args) {

    }
}

class ClassA{
    public void methodA() throws Exception{}
    public void methodB() throws Exception{}
    public void methodC() throws Exception{}
}

class ClassB extends ClassA{
    @Override
    public void methodA(){}
    @Override
    public void methodB(){}
    @Override
    public void methodC(){}
}

class ClassC extends ClassA{
    @Override
    public void methodA() throws Exception{}
    @Override
    public void methodB() throws RuntimeException{}
    @Override
    public void methodC() throws NullPointerException{}
    // No need to explicitly specify exception
    // when above parent class has thrown exception
    // here compiler gets confused which methofd exception to choose
}
