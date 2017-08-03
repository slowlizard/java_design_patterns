package tree;

public class BinNodeTree {

	private BinNode flag = null;
	private BinNode root = null;
	private int count = 0;

	/**
	 * insert的返回值作为下一次调用的参数。
	 * 
	 * @param element
	 * @return
	 */
	public BinNode insert(Object element) {
		if (count == 1) {
			root = flag;
		}
		count++;
		return flag = insert(flag, element);

	}

	public BinNode insert(BinNode node, Object value) {
		if (node == null || (node.left() != null && node.right() != null)) {
			return new BinNodePtr(value);
		}
		if (node.left() == null) {
			node.setLeft(new BinNodePtr(value));
			return node;
		}
		if (node.right() == null) {
			node.setRight(new BinNodePtr(value));
			return node.left();
		}
		return null;
	}

}
