//
// Created by erick on 12/7/2022.
//

#include <iostream>
#include <fstream>
#include <set>
#include <queue>

using namespace std;

int main() {

    ifstream input("input.txt");

    string line;

    set<char> letters;

    queue<char> letterQueue;
    queue<char> temp;

    int count = 0;
    int minLength = 14; // Minimum sequence length

    getline(input, line);

    for (char c : line) {
        letterQueue.push(c); // Maintain a queue of the last sequence of letters to be checked
        letters.clear();

        if (letterQueue.size() > minLength) { // Account for initial values not entirely filling queue
            letterQueue.pop();
        }

        temp = letterQueue; // Copy queue for iteration in set

        count++;

        while(!temp.empty()) { // Check for duplicates in queue
            letters.insert(temp.front());
            temp.pop();
        }

        if (letters.size() == minLength) {
            break;
        }
    }

    cout << count;

    return 0;
}
