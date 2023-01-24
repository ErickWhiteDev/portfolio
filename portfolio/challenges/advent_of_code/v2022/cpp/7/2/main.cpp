//
// Created by erick on 12/17/2022.
//

#include "node.h"

#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>

using namespace std;

int main() {

    ifstream input("input.txt");

    string inputLine;
    string command;

    bool scanning;

    int totalSize = 70000000;
    int minSize = totalSize;
    int spaceUsed;
    int spaceNeeded = 30000000;
    int spaceToClear;

    vector<string> currLine;

    Node* root = getNewNode(0, nullptr, "root");
    Node* currNode;

    while(getline(input, inputLine)) {
        stringstream s(inputLine);
        currLine.clear();


        while(getline(s, command, ' ')) {
            currLine.push_back(command); // Put current line of commands into array
        }

        if (currLine[0] == "$") {
            scanning = false;

            if (currLine[1] == "cd") {
                if (currLine[2] == "/") {
                    currNode = root; // Navigate to root of directory
                }
                else if (currLine[2] == "..") {
                    currNode = currNode->parent; // Navigate one level up in tree
                }
                else {
                    for (Node* n : currNode->children) {
                        if (getName(n) == currLine[2]) { // Navigate to a child directory with a specific name
                            currNode = n;
                            break;
                        }
                    }
                }
            }
            else if (currLine[1] == "ls") {
                scanning = true; // Enable scanning a new directory to add files and subdirectories
            }
        }

        if (scanning) {
            try {
                setData(currNode, getData(currNode) + stoi(currLine[0])); // Add file size to node
            }
            catch (...) {
                if (!(currLine[1] == "ls")) {
                    addChild(currNode, 0, currLine[1]); // Add child (subdirectory) to node
                }
            }
        }
    }

    spaceUsed = sum(root); // Check total used space on drive
    spaceToClear = spaceNeeded - (totalSize - spaceUsed);
    checkMin(root, &minSize, spaceToClear); // Find smallest directory to delete to clear space

    cout << minSize << endl;

    return 0;
}