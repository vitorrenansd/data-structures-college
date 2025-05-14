-- Sequential Search Class
SequentialSearch = {}
SequentialSearch.__index = SequentialSearch

function SequentialSearch:new()
    local self = setmetatable({}, SequentialSearch)
    return self
end

function SequentialSearch:search(list, key)
    local indices = {}
    for i = 1, #list do
        if list[i] == key then
            table.insert(indices, i)
        end
    end
    return indices
end

return SequentialSearch