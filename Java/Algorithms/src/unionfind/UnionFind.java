package unionfind;

/**
 * Created with IntelliJ IDEA.
 * User: complexityclass
 * Date: 7/20/13
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UnionFind<Item> {

    void union(Item p,Item q);
    Item find(Item p);


}
