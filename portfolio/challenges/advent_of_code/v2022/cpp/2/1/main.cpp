//
// Created by erick on 12/6/2022.
//

#include <iostream>
#include <fstream>

using namespace std;

int main() {

    ifstream input("input.txt");

    string line;

    int count = 0;

    while (getline(input, line)) {
        // Handle rock-paper-scissors cases
        switch(line[2]) {
            case 'X':
                count += 1;
               switch(line[0]) {
                   case 'A':
                       count += 3;
                       break;
                   case 'B':
                       break;
                   case 'C':
                       count += 6;
                       break;
               }
               break;
            case 'Y':
                count += 2;
                switch(line[0]) {
                    case 'A':
                        count += 6;
                        break;
                    case 'B':
                        count += 3;
                        break;
                    case 'C':
                        break;
                }
                break;
            case 'Z':
                count += 3;
                switch(line[0]) {
                    case 'A':
                        break;
                    case 'B':
                        count += 6;
                        break;
                    case 'C':
                        count += 3;
                        break;
                }
                break;
        }
    }

    input.close();

    cout << count;

    return 0;
};