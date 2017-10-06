public class BinaryTree {
    private TreeNode root;
    private TreeNode InsertIntr(int value,TreeNode temproot){
        if(temproot==null){
            TreeNode node=new TreeNode();
            node.value=value;
            node.left=node.right=null;
            temproot=node;
        }
        else{
            if(value<=temproot.value){
                temproot.left=InsertIntr(value,temproot.left);
            }else {
                temproot.right = InsertIntr(value, temproot.right);
            }
        }
        return temproot;
    }

    public void InsertRecursive(int value){
        this.root=InsertIntr(value,root);
    }
}
