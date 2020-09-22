package VM;

public class ByteCode {

    public static final short IADD = 1; //int add
    public static final short ISUB = 2;
    public static final short IMUL = 3;
    public static final short ILT = 4; //int less than
    public static final short IEQ = 5; //int equals to
    public static final short BR = 6; //branch
    public static final short BRT = 7; //branch if true
    public static final short BRF = 8; //branch if false
    public static final int ICONST = 9; //push constant integer to stack
    public static final int LOAD = 10; //load from local
    public static final int GLOAD = 11; //load from global
    public static final int STORE = 12; //store in local
    public static final int GSTORE = 13; //store in global
    public static final int PRINT = 14; //print stack top
    public static final int POP = 15; //throw away top of stack
    public static final int HALT = 16;
}
