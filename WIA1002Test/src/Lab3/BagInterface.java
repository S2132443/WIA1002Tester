/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

public interface BagInterface<T> {
    
//    Gets the current number of entries in this bag.
//    
//    @return The integer number of entries currently in the bag.
    public int getCurrentSize();
    
//    Sees whether this bag is empty.
//            
//    @return True if the bag is empty, or false if not
    public boolean isEmpty();
    
//  Adds a new entry to this bag.
    
//    @param newEntry The object to be added as a new entry.
//    @return True if the addition is successful, or false if not.
      public boolean add(T newEntry);
      
//    Removes one unspecified entry from thid bag, if possible.
      
//    @return Either the removed entry, if the removal was succesful, or null
      public T remove();
      
      public boolean remove(T anEntry);
      
      public void clear();
      
      public int getFrequencyOf(T anEntry);
      
      public boolean contains(T anEntry);
      
      public T[] toArray();
      
      public BagInterface<T> union(BagInterface<T> anotherBag);
      
      public BagInterface<T> intersection(BagInterface<T> anotherBag);
      
      public BagInterface<T> difference(BagInterface<T> anotherBag);
    
    
}
