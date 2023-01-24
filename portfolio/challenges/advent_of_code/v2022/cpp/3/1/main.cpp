//
// Created by erick on 12/7/2022.
//

#include <iostream>
#include <fstream>
#include <set>

using namespace std;

int main() {

    ifstream input("input.txt");

    string line;

    set<char> halves[2];

    int count = 0;

    while (getline(input, line)) {
        halves[0].clear();
        halves[1].clear();

        for (char c : line.substr(0,line.length() / 2)) {  // First half of sack
            halves[0].insert(c);
        }

        for (char c : line.substr(line.length() / 2)) { // Second half of sack
            halves[1].insert(c);
        }

        for (char c : halves[0]) {
            for (char d : halves[1]) {
                if (c == d) {
                    count += int(c) < 97 ? int(c) - 38 : int(c) - 96; // Adjust int conversion to make lowercase letters first
                }
            }
        }
    }

    input.close();

    cout << count;

    return 0;
}