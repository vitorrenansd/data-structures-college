def sort(arr):
    n = len(arr)
    for i in range(n - 1):
        minIdx = i
        
        # Iterate through the unsorted portion
        # to find the actual minimum
        for j in range(i + 1, n):
            if arr[j] < arr[minIdx]:
              
                # Update min_idx if a smaller element is found
                minIdx = j
        
        # Move minimum element to its
        # correct position
        arr[i], arr[minIdx] = arr[minIdx], arr[i]

# SelectionSort implementation from https://www.geeksforgeeks.org/selection-sort-algorithm-2/
