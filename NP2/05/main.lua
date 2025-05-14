local MatrixClass = require("Matrix")

local myMatrix = MatrixClass:new(10, 10) -- Creates a 10x10 matrix

myMatrix:fill()

print("Number of non-zero positions in the matrix: " .. myMatrix:countNonZero())