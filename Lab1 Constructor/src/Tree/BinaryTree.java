package Tree;

public class BinaryTree {



	public Main root;

	public BinaryTree(){
		this.root = null;
	}

	public Main insert(int data){
		Main newNode = new Main(data);  
		if (root == null){  
			root = newNode;
		}
		else {
			Main cNode = root;
			Main pNode = null;

			while (cNode != null){
				pNode = cNode;

				if (cNode.data < newNode.data){
					cNode = cNode.right;
				}


				else if (cNode.data > newNode.data){
					cNode = cNode.left;

				}

				else {
					return cNode;
				}
			}

			if (pNode.data < newNode.data){    
				pNode.right = newNode;       
			}
			else {                      
				pNode.left = newNode;  
			}

		}return newNode;

	}
}
