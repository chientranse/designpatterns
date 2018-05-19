package edu.chientran98.designpattern.iterator;

/**
 *
 * @author yeula
 */
public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public NameIterator() {
        }

        @Override
        public boolean hasNext() {
            if (index >= names.length) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
