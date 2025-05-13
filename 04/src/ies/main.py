import sorting.algorithm.BubbleSort as bubbleClass;
import sorting.algorithm.InsertionSort as insertionClass;
import sorting.algorithm.SelectionSort as selectionClass;

data = [3, 4, 9, 2, 5, 1, 8]

print('Original data: [3, 4, 9, 2, 5, 1, 8]')

print(f'BubbleSorted: {bubbleClass.sort(data)}')
print(f'InsertionSorted: {insertionClass.sort(data)}')
print(f'SelectionSorted: {selectionClass.sort(data)}')
