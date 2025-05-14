-- Binary Search Class
BinarySearch = {}
BinarySearch.__index = BinarySearch

function BinarySearch:new()
    local self = setmetatable({}, BinarySearch)
    return self
end

function BinarySearch:search(list, key)
    local function findOneIndex()
        local startIndex = 1
        local endIndex = #list
        while startIndex <= endIndex do
            local middle = math.floor((startIndex + endIndex) / 2)
            if list[middle] == key then
                return middle
            elseif list[middle] < key then
                startIndex = middle + 1
            else
                endIndex = middle - 1
            end
        end
        return nil
    end

    local foundIndex = findOneIndex()
    local indices = {}

    if not foundIndex then
        return indices -- key not found, return empty list
    end

    -- Explore left
    local i = foundIndex
    while i >= 1 and list[i] == key do
        i = i - 1
    end

    -- Explore right from the first correct index
    i = i + 1
    while i <= #list and list[i] == key do
        table.insert(indices, i)
        i = i + 1
    end

    return indices
end

return BinarySearch