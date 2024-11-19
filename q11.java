class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Decimal: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Decimal: " + number);
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class q11 {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(255);
        hexNum.showNum();
    }
}
