def sort(arr):
    arr = arr.copy()
    step = 1
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
            print(f'InsertionSorting. Step {step}: {arr}')
            step += 1 
        arr[j + 1] = key
    return arr

# InsertionSort implementation from https://www.geeksforgeeks.org/insertion-sort-algorithm/
