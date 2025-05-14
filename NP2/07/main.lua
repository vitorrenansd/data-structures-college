local SequentialClass = require("SequentialSearch")
local BinaryClass = require("BinarySearch")

local myList = {1, 3, 3, 5, 7, 7, 7, 9} 
local key = 7 -- with this list, should print "4, 5, 6"

-- Sequential Search
local seqSearch = SequentialClass:new()
local seqResult = seqSearch:search(myList, key)
print("Sequential Search results:")
for _, index in ipairs(seqResult) do
    print(index-1)
end

-- Binary Search
local binSearch = BinaryClass:new()
local binResult = binSearch:search(myList, key)
print("Binary Search results:")
for _, index in ipairs(binResult) do
    print(index-1)
end