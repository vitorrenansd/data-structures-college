from classes.BinarySearchTree import BinarySearchTree

tree = BinarySearchTree()
tree.insert(20)
tree.insert(10)
tree.insert(30)
tree.insert(25)

print(tree.search(10))  # True
print(tree.search(15))  # False
print(tree.search(25))  # True
