public class NestedIterator implements Iterator<Integer> {
    
    private List<Integer> list = new ArrayList<>();
    private int cursor = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        construct(nestedList);
    }

    @Override
    public Integer next() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }
    
    private void construct(List<NestedInteger> nlist){
        for(NestedInteger n : nlist){
            if(n.isInteger()){
                list.add(n.getInteger());
            } else {
                construct(n.getList());                
            }
        }
    }
}
