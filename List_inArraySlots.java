/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
		this.intElements = new int[INITIAL_CAPACITY];
		this.doubleElements = new double[INITIAL_CAPACITY];
		this.stringElements = new String[INITIAL_CAPACITY];
		this.typeOfElements = new int[INITIAL_CAPACITY];
		filledElements = 0;
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
		 return filledElements;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
		String ans = "[";
		for(int index=0;index<filledElements;index++){
			if (typeOfElements[index] == 0) ans += intElements[index];
			else if (typeOfElements[index] == 1) ans += doubleElements[index];
			else if (typeOfElements[index] == 2) ans += stringElements[index];
			ans += ",";
		}
		ans += "]";
		return ans;
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int type   // same meaning as in typeOfElements
                        , int    intValue
                        , double doubleValue
                        , String stringValue
                        ) {
				if(typeOfElements.length == filledElements) expand();
				if (type == 0) {typeOfElements[filledElements] = 0;
								intElements[filledElements] = intValue;
				}
				else if (type == 1) {typeOfElements[filledElements] = 1;
								     doubleElements[filledElements] = doubleValue;
				}
				else if (type == 2) {typeOfElements[filledElements] = 2;
								     stringElements[filledElements] = stringValue;
				}
				filledElements++;
				return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
          System.out.println( "expand... (for debugging)");
		   int[] extended = new int[filledElements * 2];         // instantiate an array with twice the capacity
			for(int index=0; index < filledElements;index++){      // copy over each non-null value
            extended[index] = typeOfElements[index];
			}
          typeOfElements = extended;
		   int[] extended2 = new int[filledElements * 2];         // instantiate an array with twice the capacity
			for(int index=0; index < filledElements;index++){      // copy over each non-null value
            extended2[index] = intElements[index];
			}
          intElements = extended2;  
		   double[] extended3 = new double[filledElements * 2];         // instantiate an array with twice the capacity
			for(int index=0; index < filledElements;index++){      // copy over each non-null value
            extended3[index] = doubleElements[index];
			}
          doubleElements = extended3;  	
		   String[] extended4 = new String[filledElements * 2];         // instantiate an array with twice the capacity
			for(int index=0; index < filledElements;index++){      // copy over each non-null value
            extended4[index] = stringElements[index];
			}
          stringElements = extended4;  		  
		  
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
      }
}