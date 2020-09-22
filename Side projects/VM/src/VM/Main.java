package VM;

import java.util.Arrays;

import static VM.ByteCode.*;

public class Main {

    static int[] hello = {
            ICONST, 5,
            ICONST, 162,
            IMUL,
            PRINT,
            HALT
    };
    public static void main(String[] args) {
        VM vm = new VM(hello, 0, 1);
        vm.cpu();
//        System.out.println(Arrays.toString(vm.stack));
    }
}
