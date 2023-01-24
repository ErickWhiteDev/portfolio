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

    set<char> bags[3];
    set<char> firstTwo;

    int count = 0;

    int i = 0;

    while (getline(input, line)) {

        bags[i % 3].clear(); // Alternate between bags based on iteration count
        bags[i % 3].insert(line.begin(), line.end());

        if (i % 3 == 2) {
            firstTwo.clear();

            for (char c : bags[0]) {
                for (char d : bags[1]) {
                    if (c == d) {
                        firstTwo.insert(c); // Letters in common to first two sacks
                    }
                }
            }

            for (char c : firstTwo) {
                for (char d : bags[2]) {
                    if (c == d) {
                        count += int(c) < 97 ? int(c) - 38 : int(c) - 96; // Adjust int conversion to make lowercase letters first
                    }
                }
            }
        }

        i++;
    }

    input.close();

    cout << count;

    return 0;
}