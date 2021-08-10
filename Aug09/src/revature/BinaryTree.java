package revature;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T> {
	
	Node<T> root;
	public BinaryTree(){
		root = null;
	}
	
	public void add(T value) {
		if(root == null) {
			root = new Node<T>(value);
			return;
		}
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node<T> node = queue.poll();
			if(node.left == null) {
				node.left = new Node<T>(value);
				break;
			}
			else
				queue.add(node.left);
			if(node.right == null) {
				node.right = new Node<T>(value);
				break;
			}
			else
				queue.add(node.right);
		}
	}
	
	public void printLevelOrder() {
		System.out.println("The level ordering of this tree is:");
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node<T> node = queue.poll();
			System.out.print(node.value + " ");
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
		System.out.println();
	}
	
}

class Node <T>{
	T value;
	Node<T> left;
	Node<T> right;
	
	Node(T value){
		this.value = value;
		left = null;
		right = null;
	}
}
