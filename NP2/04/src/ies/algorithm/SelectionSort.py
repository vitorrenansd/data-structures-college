def sort(arr):
    arr = arr.copy()
    step = 1
    n = len(arr)
    for i in range(n - 1):
        minIdx = i
        for j in range(i + 1, n):
            if arr[j] < arr[minIdx]:
                minIdx = j
        if minIdx != i:
            arr[i], arr[minIdx] = arr[minIdx], arr[i]
        print(f'SelectionSorting. Step {step}: {arr}')
        step += 1 
    return arr

# SelectionSort implementation from https://www.geeksforgeeks.org/selection-sort-algorithm-2/
