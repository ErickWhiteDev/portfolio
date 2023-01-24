//
// Created by erick on 12/8/2022.
//

#ifndef ADVENTOFCODE2022_NODE_H
#define ADVENTOFCODE2022_NODE_H

#include <vector>
#include <string>

using namespace std;

struct Node {
    int data;
    string name;
    Node* parent;
    vector<Node*> children;
};

struct Node* getNewNode(int data, Node* parent, string name);

int sum(Node* node);

int checkSize(Node* node, int* tally, int sizeLimit);

void print(Node* node);

void addChild(Node* node, int data, string name);

int getData(Node* node);

void setData(Node* node, int data);

string getName(Node* node);

#endif //ADVENTOFCODE2022_NODE_H
