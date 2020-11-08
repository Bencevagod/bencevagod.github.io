CFLAGS=-std=c++11

all: VM

VM: VM.o main.o
	$(CXX) $(CFLAGS) VM.o main.o -o VM

main.o: VM.h  main.cpp
	$(CXX) $(CFLAGS) -c main.cpp

VM.o: VM.h VM.cpp
	$(CXX) $(CFLAGS) -c VM.cpp

clean:
	rm -f *.o VM
