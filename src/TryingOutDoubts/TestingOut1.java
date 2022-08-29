package TryingOutDoubts;

public class TestingOut1 {
    int var = 10;

    public static void main(String[] args) {
        TestingOut1 testingOut1 = new TestingOut1();
        testingOut1.haha(50);
        System.out.println(testingOut1.var);
    }


     void haha(int a) {
        var = a;
    }
}
