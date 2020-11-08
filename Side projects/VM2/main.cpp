#include "VM.h"

int Main() {
  VM vm;
  std::vector<i32> prog = {3, 4, 0x40000001, 0x40000000};
  // prog.push_back(3);
  // prog.push_back(4);
  // prog.push_back(0x40000001);
  // prog.push_back(0x40000000);
  vm.loadProgram(prog);
  vm.run();
  return 0;
}