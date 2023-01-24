//
// Created by erick on 12/17/2022.
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
    int count = 0;
    int max;

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
    int visArray[height][width]; // Mark which trees are visible

    memset(treeArray, 0, sizeof(treeArray)); // Fill arrays with zeros
    memset(visArray, 0, sizeof(visArray));

    for (int i = 0; i < height; i++) { // Populate array of trees from input
        getline(input, inputLine);

        for (int j = 0; j < width; j++) {
            treeArray[i][j] = inputLine[j] - '0';
        }
    }

    input.close();

    for (int i = 0; i < height; i++) { // Scan horizontally for visible trees
        max = -1;

        for (int j = 0; j < width; j++) { // Scan from left side
            if (treeArray[i][j] > max) {
                visArray[i][j] = 1;
                max = treeArray[i][j];

                if (treeArray[i][j] == 9) {
                    break;
                }
            }
        }

        max = -1;

        for (int j = height - 1; j >= 0; j--) { // Scan from right side
            if (treeArray[i][j] > max) {
                visArray[i][j] = 1;

                max = treeArray[i][j];

                if (treeArray[i][j] == 9) {
                    break;
                }
            }
        }
    }

    for (int i = 0; i < width; i++) { // Scan vertically for visible trees
        max = -1;

        for (int j = 0; j < height; j++) { // Scan from top
            if(treeArray[j][i] > max) {
                visArray[j][i] = 1;
                max =  treeArray[j][i];

                if (treeArray[j][i] == 9) {
                    break;
                }
            }
        }

        max = -1;

        for (int j = height - 1; j >= 0; j--) { // Scan from bottom
            if (treeArray[j][i] > max) {
                visArray[j][i] = 1;
                max = treeArray[j][i];

                if (treeArray[j][i] == 9) {
                    break;
                }
            }
        }
    }

    for (int i = 0; i < height; i++) { // Sum up visible trees from visibility array
        for (int j = 0; j < width; j++) {
            count += visArray[i][j];
        }
    }

    cout << count << endl;

    return 0;
}