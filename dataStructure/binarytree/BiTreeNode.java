package binarytree;

/**
 * 二叉树节点类
 */
class BiTreeNode {

    /**
     * 左子树
     */
    BiTreeNode left = null;
    /**
     * 右子树
     */
    BiTreeNode right = null;
    /**
     * 节点的值
     */
    private int value;

    /**
     * 二叉树节点构造函数
     *
     * @param value 节点的值
     * @param left  左子树
     * @param right 右子树
     */
    private BiTreeNode(int value, BiTreeNode left, BiTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * 二叉树节点构造器
     *
     * @param value 节点的值
     * @param left  左子树
     * @param right 右子树
     * @return 构造成功的二叉树节点
     */
    static BiTreeNode create(int value, BiTreeNode left, BiTreeNode right) {
        return new BiTreeNode(value, left, right);
    }

    /**
     * 返回二叉树节点的值
     *
     * @return 二叉树节点的值
     */
    public int getValue() {
        return value;
    }

    /**
     * 返回二叉树节点的左子树
     *
     * @return 二叉树节点的左子树
     */
    BiTreeNode getLeft() {
        return left;
    }

    /**
     * 返回二叉树节点的右子树
     *
     * @return 二叉树节点的右子树
     */
    BiTreeNode getRight() {
        return right;
    }
}
