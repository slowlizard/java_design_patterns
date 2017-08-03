package tree;

public class BinNodePtr implements BinNode {
	private Object value;

	private BinNode leftChild;

	private BinNode rightChild;

	public BinNodePtr() {

		this.leftChild = this.rightChild = null;
		this.value = null;

	}

	public BinNodePtr(Object value) {

		this.leftChild = this.rightChild = null;
		this.value = value;

	}

	public BinNodePtr(Object value, BinNode leftChild, BinNode rightChild) {

		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;

	}

	@Override
	public BinNode left() {

		return leftChild;
	}

	@Override
	public void setElement(Object v) {

		this.value = v;

	}

	@Override
	public BinNode setLeft(BinNode node) {
		return this.leftChild = node;

	}

	@Override
	public BinNode right() {

		return rightChild;
	}

	@Override
	public boolean isLeaf() {

		return (leftChild != null) && (rightChild != null);
	}

	@Override
	public Object getElement() {
		return value;
	}

	@Override
	public BinNode setRight(BinNode node) {

		return rightChild = node;

	}

}
