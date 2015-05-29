package tree.binaryTree;

public class BinaryTreeNode {
	private int _val;
	private BinaryTreeNode _left;
	private BinaryTreeNode _right;
	
	BinaryTreeNode(){
		_val = 0;
		_left = null;
		setRight(null);
	}
	
	BinaryTreeNode(int value){
		_val = value;
		_left = null;
		setRight(null);
	}
	
	BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right){
		_val = value;
		_left = left;
		setRight(right);
	}
	
	public void visit(){
		System.out.print(_val + "\t");
	}

	public BinaryTreeNode getLeft() {
		return _left;
	}

	public void setLeft(BinaryTreeNode _left) {
		this._left = _left;
	}

	public BinaryTreeNode getRight() {
		return _right;
	}

	public void setRight(BinaryTreeNode _right) {
		this._right = _right;
	}
}
