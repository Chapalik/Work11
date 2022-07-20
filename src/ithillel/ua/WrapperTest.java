package ithillel.ua;

public class WrapperTest {
    public static void main(String[] args) {

        //2
        Byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 10);
        Byte b3 = new Byte((byte) 10);
        Byte b4 = Byte.parseByte("10");
        Short sh1 = 11;
        Short sh2 = Short.valueOf((short) 11);
        Short sh3 = new Short((short) 11);
        Short sh4 = Short.parseShort("11");
        Integer i1 = 12;
        Integer i2 = Integer.valueOf(12);
        Integer i3 = new Integer(12);
        Integer i4 = Integer.parseInt("12");
        Long l1 = 15l;
        Long l2 = Long.valueOf(15);
        Long l3 = new Long(15);
        Long l4 = Long.parseLong("15");
        Double d1 = 13.00;
        Double d2 = Double.valueOf(13);
        Double d3 = new Double(13);
        Double d4 = Double.parseDouble("13");
        Float f1 = 14.00f;
        Float f2 = Float.valueOf(14);
        Float f3 = new Float(14);
        Float f4 = Float.parseFloat("14");

        //3
        Double dd = 16.66;
        byte bd = dd.byteValue();
        short shd = dd.shortValue();
        int id = dd.intValue();
        long ld = dd.longValue();
        float fd = dd.floatValue();

        //4
        Double d41 = 42.00, d42 = 0.0;
        Double nanValue = d41 / d42;
        Double infinityValue = d42 / d42;
        System.out.println("nanValue = " + nanValue);
        System.out.println("infinityValue = " + infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("Переменная " + nanValue + "= NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Переменная " + nanValue + " = Infinity");
        }

        if (infinityValue.isNaN()) {
            System.out.println("Переменная " + infinityValue + " = NaN");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Переменная " + infinityValue + " = Infinity");
        }

        //5
        Long l51 = 120l, l52 = 120l;
        System.out.println(l51 == l52);
        l51 = 1200l;
        l52 = 1200l;
        System.out.println(l51 == l52);

    }
}
