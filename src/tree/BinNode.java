package tree;

public interface BinNode {


	BinNode left();

	void setElement(Object v);
	
	Object  getElement();

	BinNode setLeft(BinNode node);

	BinNode right();

	BinNode setRight(BinNode node);

	boolean isLeaf();

}
