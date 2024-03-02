package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("매서드 호출 전 : dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeRdference(dataA);
        System.out.println("매서드 호출 후 : dataA.value = " + dataA.value);

    }

    static void changeRdference(Data datax) {
        System.out.println("datax = " + datax);
        datax.value = 20;
    }
}
