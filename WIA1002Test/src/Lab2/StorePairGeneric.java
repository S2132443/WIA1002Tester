/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

// Modify the following program to become a generic class called StorePairGeneric.
public class StorePairGeneric <T extends Comparable> implements Comparable<StorePairGeneric<T>> { // Have the StorePair class implement the Comparable interface.
        
        private T first, second;
        
        public StorePairGeneric(T newFirst, T newSecond) {
            first = newFirst;
            second = newSecond;
        }
        
        public T getFirst() {
            return first;
        }
        
        public T getSecond() {
            return second;
        }
        
        public void setPair(T newFirst, T newSecond) {
            first = newFirst;
            second = newSecond;
        }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override // Override the Object equals() method in the StorePair class to compare the first values of two objects for equality.

    public boolean equals(Object o) {
        if (o instanceof StorePairGeneric) {
        return (getFirst() == ((StorePairGeneric)o).getFirst());
        }
        else {
            return false;
        }
    }
    
    @Override // Override the compareTo()method to compare the first values of two objects.
    public int compareTo(StorePairGeneric<T> o) {
        return (this.first).compareTo(o.first);
    }
    
}

