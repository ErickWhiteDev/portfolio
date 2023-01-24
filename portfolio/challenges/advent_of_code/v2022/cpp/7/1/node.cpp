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

int sum(Node* node) { // Used in pretty printing, sums size of all files and subdirectories in directory
    int count = 0;
    count += node->data;
    for (Node* n : node->children) {
        count += sum(n);
    }
    return count;
}

/*
 * Check the size of a directory and all subdirectories and compare it to a set size limit
 * If the size is less than this limit, add this size to a tally
 * Pass the size upwards to a parent node
 */
int checkSize(Node* node, int* tally, int sizeLimit) {
    int count = 0;
    count += node->data;
    for (Node* n : node->children) { // Tally children first
        count += checkSize(n, tally, sizeLimit);
    }
    *tally += count <= sizeLimit ? count : 0; // If total count for a directory is under the limit, add to tally
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