//
// Created by erick on 12/21/2022.
//

#include <iostream>
#include <fstream>
#include <vector>
#include <cstring>
#include <algorithm>

using namespace std;

int main() {

    ifstream input("input.txt");

    int width = 0;
    int height = 0;
    int max = 0;
    int left, right, up, down; // Counters for each direction

    string inputLine;

    while(getline(input, inputLine)) {
        if (!width) {
            width = inputLine.size();
        }
        height++;
    }

    input.close();
    inputLine.clear();

    input.open("input.txt");

    int treeArray[height][width];

    memset(treeArray, 0, sizeof(treeArray)); // Fill arrays with zeros

    for (int i = 0; i < height; i++) { // Populate array of trees from input
        getline(input, inputLine);

        for (int j = 0; j < width; j++) {
            treeArray[i][j] = inputLine[j] - '0';
        }
    }

    input.close();

    for (int i =  1; i < height - 1; i++) {
        for (int j = 1; j < width - 1; j++) {
            left = 0;
            right = 0;
            up = 0;
            down = 0;

            for (int k = i + 1; k < height; k++) { // Check visibility downwards
                down++;

                if (treeArray[k][j] >= treeArray[i][j]) {
                    break;
                }
            }

            for (int k = i - 1; k >= 0; k--) { // Check visibility upwards
                up++;

                if (treeArray[k][j] >= treeArray[i][j]) {
                    break;
                }
            }

            for (int k = j + 1; k < width; k++) { // Check visibility rightwards
                right++;

                if (treeArray[i][k] >= treeArray[i][j]) {
                    break;
                }
            }

            for (int k = j - 1; k >= 0; k--) { // Check visibility leftwards
                left++;

                if (treeArray[i][k] >= treeArray[i][j]) {
                    break;
                }
            }

            max = (left * right * up * down) > max ? (left * right * up * down) : max;
        }
    }

    cout << max << endl;

    return 0;
}