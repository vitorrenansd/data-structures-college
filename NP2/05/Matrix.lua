-- Matrix class
Matrix = {}
Matrix.__index = Matrix

-- Constructor
function Matrix:new(rows, cols)
    local obj = {
        rows = rows,
        cols = cols,
        data = {}
    }
    -- Initialize the matrix with zeros
    for i = 1, rows do
        obj.data[i] = {}
        for j = 1, cols do
            obj.data[i][j] = 0
        end
    end
    setmetatable(obj, Matrix)
    return obj
end