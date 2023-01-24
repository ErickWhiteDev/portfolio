//
// Created by erick on 12/6/2022.
//

#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {

    ifstream input("input.txt");

    string line;

    vector<int> elves;

    int count = 0;

    while (getline(input, line)) {
        if (line.empty()) { // Add calorie count to vector at empty line
            elves.push_back(count);
            count = 0;
        }
        else {
            count += stoi(line); // Increase calorie count
        }
    }

    input.close();

    sort(elves.begin(), elves.end(), greater<>()); // Put greatest count first

    cout << elves[0];

    return 0;
}