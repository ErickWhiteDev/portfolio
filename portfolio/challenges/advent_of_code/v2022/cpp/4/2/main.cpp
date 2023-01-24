//
// Created by erick on 12/7/2022.
//

#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>

using namespace std;

int main() {

    ifstream input("input.txt");

    string line;
    string substring;
    string interval;

    int bounds[4];

    int i = 0;
    int count = 0;

    while (getline(input, line)) {
        stringstream s(line);

        while (getline(s, substring,  ',')) {
            stringstream t(substring);

            while (getline(t, interval, '-')) {
                bounds[i] = stoi(interval);
                i++;
            }

            if (i % 4 == 0) {
                /*
                 * For two intervals [a,b], [c,d], check if [a,b] ∩ [c,d] ≠ {}
                 */
                if (
                        (bounds[0] <= bounds[2] && bounds[2] <= bounds[1]) ||
                        (bounds[0] <= bounds[3] && bounds[3] <= bounds[1]) ||
                        (bounds[2] <= bounds[0] && bounds[0] <= bounds[3]) ||
                        (bounds[2] <= bounds[1] && bounds[1] <= bounds[3])
                    ) {
                    count++;
                }
                i = 0;
            }
        }
    }

    input.close();

    cout << count;

    return 0;
}