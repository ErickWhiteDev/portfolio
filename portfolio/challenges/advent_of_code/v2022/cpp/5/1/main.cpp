//
// Created by erick on 12/7/2022.
//

#include <iostream>
#include <fstream>
#include <sstream>
#include <stack>

using namespace std;

int main() {

    ifstream input("input.txt");
    ifstream towers("towers.txt");

    string line;
    string command;

    stack<char> crates[9];

    int movements[3];

    int iter = 0;

    while (getline(towers, line)) {
        for (char c : line) {
            crates[iter].push(c); // Push a tower of crates to a stack
        }
        iter++;
    }

    towers.close();

    iter = 0;

    while (getline(input, line)) {
        stringstream substring(line);

        while (getline(substring, command, ' ')) {
            if (iter % 2) {
                movements[iter / 2] = stoi(command); // Split command into crate count, start tower, and end tower
            }

            iter++;
        }

        if (iter == 6){ // When command is fully read, move crates
            for (int i = 0; i < movements[0]; i++) {
                crates[movements[2] - 1].push(crates[movements[1] - 1].top());
                crates[movements[1] - 1].pop();
            }
        }

        iter = 0;
    }

    input.close();

    for (stack<char> c : crates) {
        cout << c.top();
    }

}
