public class LinkedBST<E extends Comparable<E>> extends AbstractBST<E>{

    private class Node {

        E value;
        Node left;
        Node right;

        public Node(E value) {
            this.value = value;
            left = right = null;
        }

        E find(E target) {
            if (target.compareTo(value) == 0)
                return value;
            if (target.compareTo(value) < 0)
                if (left == null)
                    return null;
                else
                    return left.find(target);
            else if (right == null)
                return null;
            else
                return right.find(target);
        }

        boolean add(E item) {
            if (item.compareTo(value) == 0)
                return false;
            if (item.compareTo(value) < 0)
                if (left == null)
                    left = new Node(item);
                else
                    return left.add(item);
            else if (right == null)
                right = new Node(item);
            else
                return right.add(item);
            return true;
        }

        private Node findRightMostParent(){
            // if i am the parent of the inorder predecessor node
            if(this.right.right == null)
                return this;
            return this.right.findRightMostParent();
        }

        private Node remove(E target){
            // three conceptual cases
            // first case: when deleted node is a leaf node
            if(this.left == null && this.right == null)
                return null;
            else if(this.right == null)
                return left;
            else if(this.left == null)
                return right;
            else{
                // this is the case when the deleted node has two children

                // find the inorder predecessor
                Node parent = left.findRightMostParent();

                Node inorderPredecessor = parent.right;
                this.value = inorderPredecessor.value;
                parent.right = inorderPredecessor.left;
                return this;
            }
        }

        private Node delete(E target){

            // first we need to look for the target in the tree
            if(target.compareTo(value) == 0){
                // we are at the right place to perform the deletion
                // actually remove the node
                return this.remove(target);

            }
            else if(target.compareTo(value) < 0){
                if(left != null)
                    left = left.delete(target);
            }
            else if(target.compareTo(value) > 0){
                if(right != null)
                    right = right.delete(target);
            }
            return this;
        }

    }


        //attribute
        protected Node root;

        public LinkedBST() {
            root = null;
        }

        public boolean add(E item) {
            if (root == null) {
                root = new Node(item);
                return true;
            } else
                return root.add(item);
        }

        public E find(E target) {
            return root == null ? null : root.find(target);
        }


        public E delete(E target){
            E found = find(target);
            if(found != null)
                root = root.delete(target);
            return found;
        }

}
