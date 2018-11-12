package iterator.bst;

import iterator.Iterator;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class BstIterator<T extends Comparable<T>> implements Iterator {

    private ArrayDeque<TreeNode<T>> pathStack;

    public BstIterator(TreeNode<T> root) {
        this.pathStack = new ArrayDeque<>();
        pushPathToNextSmallest(root);
    }

    private void pushPathToNextSmallest(TreeNode<T> root) {
        while (root != null) {
            pathStack.push(root);
            root = root.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !pathStack.isEmpty();
    }

    @Override
    public TreeNode<T> next() {
        if(pathStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            TreeNode<T> next = pathStack.pop();
            pushPathToNextSmallest(next.getRight());
            return next;
        }
    }
}
