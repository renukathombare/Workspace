#include <stdio.h>
#include <stdlib.h>

// Node structure for a circular singly linked list
typedef struct Node {
    int data;
    struct Node *next;
} Node;

// Function to create a new node
Node *createNode(int data) {
    Node *newNode = (Node *)malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Memory allocation failed\n");
        exit(EXIT_FAILURE);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to insert a new node at the end of the circular list
void appendCircular(Node **head, int data) {
    Node *newNode = createNode(data);

    if (*head == NULL) {
        *head = newNode;
        newNode->next = *head;
    } else {
        Node *temp = *head;
        while (temp->next != *head) {
            temp = temp->next;
        }
        temp->next = newNode;
        newNode->next = *head;
    }
}

// Function to print the elements of the circular list
void printCircularList(Node *head) {
    if (head == NULL) {
        printf("Circular Linked List is empty\n");
        return;
    }

    Node *temp = head;
    do {
        printf("%d -> ", temp->data);
        temp = temp->next;
    } while (temp != head);
    printf("(head)\n");
}

int main() {
    Node *circularList = NULL;

    appendCircular(&circularList, 1);
    appendCircular(&circularList, 2);
    appendCircular(&circularList, 3);

    printf("Circular Singly Linked List: ");
    printCircularList(circularList);

    return 0;
}
