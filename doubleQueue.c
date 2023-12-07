#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 5

typedef struct {
    int array[MAX_SIZE];
    int front, rear;
} Deque;

void initializeDeque(Deque *deque) {
    deque->front = -1;
    deque->rear = -1;
}

int isEmpty(Deque *deque) {
    return deque->front == -1;
}

int isFull(Deque *deque) {
    return (deque->rear + 1) % MAX_SIZE == deque->front;
}

void enqueueFront(Deque *deque, int value) {
    if (isFull(deque)) {
        printf("Deque is full\n");
        return;
    }

    if (isEmpty(deque)) {
        deque->front = 0;
        deque->rear = 0;
    } else {
        deque->front = (deque->front - 1 + MAX_SIZE) % MAX_SIZE;
    }

    deque->array[deque->front] = value;
}

void enqueueRear(Deque *deque, int value) {
    if (isFull(deque)) {
        printf("Deque is full\n");
        return;
    }

    if (isEmpty(deque)) {
        deque->front = 0;
        deque->rear = 0;
    } else {
        deque->rear = (deque->rear + 1) % MAX_SIZE;
    }

    deque->array[deque->rear] = value;
}

int dequeueFront(Deque *deque) {
    if (isEmpty(deque)) {
        printf("Deque is empty\n");
        exit(EXIT_FAILURE);
    }

    int value = deque->array[deque->front];

    if (deque->front == deque->rear) {
        // Last element is being dequeued, reset front and rear
        deque->front = -1;
        deque->rear = -1;
    } else {
        deque->front = (deque->front + 1) % MAX_SIZE;
    }

    return value;
}

int dequeueRear(Deque *deque) {
    if (isEmpty(deque)) {
        printf("Deque is empty\n");
        exit(EXIT_FAILURE);
    }

    int value = deque->array[deque->rear];

    if (deque->front == deque->rear) {
        // Last element is being dequeued, reset front and rear
        deque->front = -1;
        deque->rear = -1;
    } else {
        deque->rear = (deque->rear - 1 + MAX_SIZE) % MAX_SIZE;
    }

    return value;
}

int front(Deque *deque) {
    if (isEmpty(deque)) {
        printf("Deque is empty\n");
        exit(EXIT_FAILURE);
    }
    return deque->array[deque->front];
}

int rear(Deque *deque) {
    if (isEmpty(deque)) {
        printf("Deque is empty\n");
        exit(EXIT_FAILURE);
    }
    return deque->array[deque->rear];
}

int main() {
    Deque deque;
    initializeDeque(&deque);

    enqueueRear(&deque, 1);
    enqueueRear(&deque, 2);
    enqueueFront(&deque, 3);

    printf("Front element: %d\n", front(&deque));
    printf("Rear element: %d\n", rear(&deque));

    dequeueFront(&deque);
    printf("Front element after dequeue: %d\n", front(&deque));

    enqueueRear(&deque, 4);
    enqueueFront(&deque, 5);

    while (!isEmpty(&deque)) {
        printf("Dequeued element from rear: %d\n", dequeueRear(&deque));
    }

    return 0;
}
