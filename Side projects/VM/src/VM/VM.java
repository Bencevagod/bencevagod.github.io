package VM;

import static VM.ByteCode.*;

public class VM {
    int[] data;
    int[] code;
    int[] stack;

    int instructionPointer;
    int stackPointer = -1;
    int framePointer;

    boolean trace = false;

    public VM(int[] code, int mainInstructionPointer, int dataSize) {
        this.code = code;
        this.instructionPointer = mainInstructionPointer;
        data = new int[dataSize];
        stack = new int[100];
    }

    public void cpu() {
        int opCode = code[instructionPointer];
        while (opCode != HALT && instructionPointer < code.length) {
            opCode = code[instructionPointer]; //fetch
            if (trace) {
                System.err.printf("%04d: %d\n", instructionPointer, opCode);
            }
            instructionPointer++;
            switch (opCode) {
                case IADD:
                    int b = stack[stackPointer];
                    stackPointer--;
                    int a = stack[stackPointer];
                    stackPointer += 2;
                    stack[stackPointer] = b + a;
                    break;
                case ISUB:
                    b = stack[stackPointer];
                    stackPointer--;
                    stackPointer += 2;
                    a = stack[stackPointer];
                    stack[stackPointer] = a - b;
                    break;
                case IMUL:
                    b = stack[stackPointer];
                    stackPointer--;
                    a = stack[stackPointer];
                    stackPointer += 2;
                    stack[stackPointer] = b * a;
                    break;
                case ICONST:
                    int v = code[instructionPointer];
                    instructionPointer++;
                    stackPointer++;
                    stack[stackPointer] = v;
                    break;
                case PRINT:
                    v = stack[stackPointer];
                    //stackPointer--;
                    System.out.println(v);
                    break;
                case GLOAD:
                    //int addr = data[code[instructionPointer]];
                    stackPointer++;
                    stack[stackPointer] = data[code[instructionPointer]];
                    break;
                case GSTORE:
                    //v = stack[stackPointer];
                    data[code[instructionPointer]] = stack[stackPointer];
                    stackPointer--;
                    break;
                case HALT:
                    return;
            }
        }
    }
}
