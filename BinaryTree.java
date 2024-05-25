public class BinaryTree<ContentType> {
    ContentType content; 
    BinaryTree<ContentType> leftTree; 
    BinaryTree<ContentType> rightTree;

    public BinaryTree(ContentType content, BinaryTree<ContentType>  leftTree, BinaryTree<ContentType>  rightTree) {
        this.content = content;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }
    
    public ContentType getContent() {
        return content;
    }

    public void setContent(ContentType content) {
        this.content = content;
    }

    public BinaryTree<ContentType>  getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BinaryTree<ContentType>  leftTree) {
        this.leftTree = leftTree;
    }

    public BinaryTree<ContentType>  getRightTree() {
        return rightTree;
    }

    public void setRightTree(BinaryTree<ContentType>  rightTree) {
        this.rightTree = rightTree;
    }

}
