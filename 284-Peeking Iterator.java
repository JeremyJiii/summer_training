class PeekingIterator implements Iterator<Integer> {

    private int peekValue;
    private boolean peeked;
    private Iterator<Integer> itr;

	public PeekingIterator(Iterator<Integer> iterator) {
	    peeked = false;
	    peekValue = 0;
	    this.itr = iterator;
	}

	public Integer peek() {
        if (peeked) {
            return peekValue;
        }
            peeked = true;
            return peekValue = itr.next();
	}
	public Integer next() {
	    if (peeked) {
	        peeked = false;
	        return peekValue;
	    }
	    return itr.next();
	}
	public boolean hasNext() {
	    return peeked ? true : itr.hasNext();
	}
}
