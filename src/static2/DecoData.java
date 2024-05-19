package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++;  //인스턴스 변수 접근 , compile error
        //instanceMethod(); //인스턴스 매서드 접근 , compile error

        staticValue; //정정 변수 접근
        staticMethod(); //정정 매서드 접근
    }

    public void instanceCall() {
        staticValue; //정정 변수 접근
        staticMethod(); //정정 매서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("instanceValue = " + staticValue);

    }
}
