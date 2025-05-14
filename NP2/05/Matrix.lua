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

-- Method to fill the matrix with user input
function Matrix:fill()
    for i = 1, self.rows do
        for j = 1, self.cols do
            io.write(string.format("Enter value for position [%d][%d]: ", i, j))
            local value = tonumber(io.read())
            self.data[i][j] = value or 0
        end
    end
end

-- Method to count non-zero values in the matrix
function Matrix:countNonZero()
    local count = 0
    for i = 1, self.rows do
        for j = 1, self.cols do
            if self.data[i][j] ~= 0 then
                count = count + 1
            end
        end
    end
    return count
end