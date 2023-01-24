//
// Created by erick on 12/8/2022.
//

#include "node.h"

#include <iostream>
#include <utility>
#include <vector>

using namespace std;

Node* getNewNode(int data, Node* parent, string name) {
    Node* newNode = new Node();
    newNode->data = data;
    newNode->name = std::move(name);
    newNode->parent = parent;
    return newNode;
}

int sum(Node* node) {
    int count = 0;
    count += node->data;
    for (Node* n : node->children) {
        count += sum(n);
    }
    return count;
}

/*
 * Check for the minimum size directory above a given limit
 * Minimum size is initially full disk size
 * If the size of the current directory exceeds the limit but is below the smallest so far, set min to current node
 */
int checkMin(Node* node, int* minSize, int sizeLimit) {
    int count = 0;
    count += node->data;
    for (Node* n : node->children) {
        count += checkMin(n, minSize, sizeLimit);
    }
    *minSize = (count <= *minSize && count >= sizeLimit) ? count : *minSize; // Check if node is smaller than min
    return count;
}

void print(Node* node) { // Pretty printing
    cout << node->name << " : " << sum(node) << endl;
    for (Node* n : node->children) {
        print(n);
    }
}

void addChild(Node* node, int data, string name) {
    Node* newNode = getNewNode(data, node, std::move(name));
    node->children.push_back(newNode);
}

int getData(Node* node) {
    return node->data;
}

void setData(Node* node, int data) {
    node->data = data;
}

string getName(Node* node) {
    return node->name;
}