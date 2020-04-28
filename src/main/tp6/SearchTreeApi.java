package tp6;

public class SearchTreeApi<T> {

    public void inorden (BinarySearchTree <T> a){
        if (!a.isEmpty()){
            inorden(a.getLeft());
            System.out.println(( a.getRoot() + " "));
            inorden(a.getRight());
        }
    }

}
