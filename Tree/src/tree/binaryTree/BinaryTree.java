package tree.binaryTree;

import java.util.Stack;


public class BinaryTree {
	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		
		node2.setRight(node4);
		node3.setLeft(node5);
		node3.setRight(node6);
		
		node4.setLeft(node7);
		
		BinaryTree.PreOrder(node1);
		System.out.println();
		BinaryTree.InOrder(node1);
		System.out.println();
		BinaryTree.postOrder(node1);
		
		

	}

	public static void PreOrder(BinaryTreeNode p){
		Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
		while(p != null || !nodes.empty()){
			if(p != null){
				while(p != null){
					p.visit();
					nodes.push(p);
					p = p.getLeft();
				}
			}
			else{
				p = nodes.peek();
				nodes.pop();
				if(p != null) p = p.getRight();
			}
		}
	}
	
	public static void InOrder(BinaryTreeNode p){
		Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
		
		while(p != null || !nodes.empty()){
			if(p != null) {
				nodes.push(p);
				p = p.getLeft();
			}
			else{
				p = nodes.peek();
				nodes.pop();
				p.visit();
				p = p.getRight();
			}
		}
	}
	
	public static void postOrder(BinaryTreeNode p){
		Stack<BinaryTreeNode> nodes = new Stack<BinaryTreeNode>();
		BinaryTreeNode rNode = null;
		
		while(p != null || !nodes.empty()){
			if(p != null){
				nodes.push(p);
				p = p.getLeft();
			}
			else{
				p = nodes.peek();
				if(p.getRight() == null || p.getRight() == rNode){
					p.visit(); 
					rNode = p;
					nodes.pop();
					p = null;
				}
				else{
					p = p.getRight();	
				}	
			}
		}
		
	}
}
