from classes.Node import Node

class BinarySearchTree:
    def __init__(self):
        self.root = None

    # Inserir valor na arvore
    def insert(self, value):
        newNode = Node(value)
        if self.root is None:
            self.root = newNode
        else:
            self.insertRecursive(self.root, newNode)

    def insertRecursive(self, current, newNode):
        if newNode.value < current.value:
            if current.left is None:
                current.left = newNode
            else:
                self.insertRecursive(current.left, newNode)
        else:
            if current.right is None:
                current.right = newNode
            else:
                self.insertRecursive(current.right, newNode)

    # Buscar valor
    def search(self, value):
        return self.searchRecursive(self.root, value)

    def searchRecursive(self, current, value):
        if current is None:
            return False
        if value == current.value:
            return True
        elif value < current.value:
            return self.searchRecursive(current.left, value)
        else:
            return self.searchRecursive(current.right, value)