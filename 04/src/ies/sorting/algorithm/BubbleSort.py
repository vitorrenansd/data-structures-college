def bubbleSort(arr):
    for n in range(len(arr) - 1, 0, -1):
        swapped = False  
        for i in range(n):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                swapped = True
        if not swapped:
            break

## BubbleSort implementation from https://www.geeksforgeeks.org/python-program-for-bubble-sort/
