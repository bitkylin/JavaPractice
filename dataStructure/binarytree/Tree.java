package binarytree;

/**
 * 二叉树演示程序
 * 在控制台输出预设二叉树的深度
 */
public class Tree {
    /**
     * 此二叉树的根节点
     */
    private BiTreeNode node1;

    /**
     * 二叉树演示程序入口
     *
     * @param args 控制台参数
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.init();
        System.out.println(tree.depth(tree.node1));
    }

    /**
     * 返回此二叉树的深度
     *
     * @param root 二叉树节点
     * @return 该节点的深度
     */
    private int depth(BiTreeNode root) {
        int left = root.left == null ? 0 : depth(root.getLeft());
        int right = root.right == null ? 0 : depth(root.getRight());
        return (left > right) ? (left + 1) : (right + 1);
    }

    /**
     * 初始化一棵二叉树
     */
    private void init() {
        BiTreeNode node7 = BiTreeNode.create(7, null, null);
        BiTreeNode node6 = BiTreeNode.create(6, null, null);
        BiTreeNode node5 = BiTreeNode.create(5, node7, null);
        BiTreeNode node4 = BiTreeNode.create(4, null, null);
        BiTreeNode node3 = BiTreeNode.create(3, null, node6);
        BiTreeNode node2 = BiTreeNode.create(2, node4, node5);
        node1 = BiTreeNode.create(1, node2, node3);
    }
}
