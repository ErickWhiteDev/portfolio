//
// Created by erick on 12/8/2022.
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

    int tally = 0; // Total size of directories greater than the size limit
    int sizeLimit = 100000;

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

    checkSize(root, &tally, sizeLimit); // Check which subdirectories are greater than the size limit

    cout << tally << endl;

    return 0;
}