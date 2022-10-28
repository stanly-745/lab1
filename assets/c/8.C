#include <stdio.h>
#include <limits.h>
int heap[1000], heapSize;
void Init()
{
heapSize = 0;
heap[0] = -INT_MAX;
}
void Insert(int element)
{
int now = heapSize;
heapSize++;
heap[heapSize] = element;

while (heap[now / 2] > element)
{
heap[now] = heap[now / 2];
now /= 2;
}
heap[now] = element;
}
int DeleteMin()
{
int minElement, lastElement, child, now;
minElement = heap[1];
lastElement = heap[heapSize--];
for (now = 1; now * 2 <= heapSize; now = child)
{
child = now * 2;
if (child != heapSize && heap[child + 1] < heap[child])
child++;
if (lastElement > heap[child])
heap[now] = heap[child];
else
break;
}
heap[now] = lastElement;
return minElement;
}
main()
{
int iter, element;
int number_of_elements;
printf("Program to demonstrate Heap:\nEnter the number of elements: ");
scanf("%d", &number_of_elements);

Init();
printf("Enter the elements: ");
for (iter = 0; iter < number_of_elements; iter++)
{
scanf("%d", &element);
Insert(element);
}
for (iter = 0; iter < number_of_elements; iter++)
printf("%d ", DeleteMin());
printf("\n");
getch();
}
