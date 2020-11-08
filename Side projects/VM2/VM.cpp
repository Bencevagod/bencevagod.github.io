#include "VM.h"
/*
* Instruction format:
* header - 2bits
* body - 30 bits
*
* Header fornat:
* 0 => pos. integer
* 1 => primitive instruct.
* 2 => negative int.
* 3 => undefined
*/
// functions

VM::VM() {
  memory.reserve(1000000);
}

i32 VM::getType(i32 instruction) {
  i32 type = 0xc0000000;
  type = (type & instruction) >> 30;
  return type;
}

i32 VM::getData(i32 instruction) {
  i32 data = 0x3fffffff;
  data = data & instruction;
  return data;
}

void VM::fetch() {
  pc++;
}

void VM::decode() {
  typ = getType(memory[pc]);
  dat = getData(memory[pc]);
}

void VM::execute() {
  if (typ == 0 || typ == 2) {
    sp++;
    memory[sp] = dat;
  } else {
    doPrimitive();
  }
}

void VM::doPrimitive() {
  switch(dat) {
    case 0: // halt
      std::cout << "halt" << std::endl;
      running = 0;
      break;
    case 1: // add
      std::cout << "add " << memory[sp - 1] << " and " << memory[sp] << std::endl;
      memory[sp - 1] = memory[sp - 1] + memory[sp];
      sp--;
      std::cout << memory[sp] << std::endl;
      break;
    case 2: // substract
      std::cout << "substract " << memory[sp - 1] << " from " << memory[sp] << std::endl;
      memory[sp - 1] = memory[sp - 1] - memory[sp];
      sp--;
      std::cout << memory[sp] << std::endl;
      break;
  }
}

void VM::run() {
  pc -= 1;
  while (running == 1) {
    fetch();
    decode();
    execute();
    std::cout << "top of stack: " << memory[sp] << std::endl;
  }
}

void VM::loadProgram(std::vector<i32> prog) {
  for(i32 i = 0; i < prog.size(); i++) {
    memory[pc + i] = prog[i];
  }
}