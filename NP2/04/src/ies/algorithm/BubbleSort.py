def sort(arr):
    arr = arr.copy()
    step = 1
    for n in range(len(arr) - 1, 0, -1):
        swapped = False  
        for i in range(n):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                swapped = True
                print(f'BubbleSorting. Step {step}: {arr}')
                step += 1   
        if not swapped:
            break
    return arr

## BubbleSort implementation from https://www.geeksforgeeks.org/python-program-for-bubble-sort/
