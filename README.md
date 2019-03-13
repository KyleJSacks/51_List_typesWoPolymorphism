# 51_List_typesWoPolymorphism
## Title: List_inArraySlots

*Partners: Kyle Sacks and Amy Lei*

**Fields**
* *filledElements* : the number of non-null elements in a list
* *list* : holds a reference to an array of Elements
* *INITIAL_CAPACITY* : starting length of list



**Constructors**
* List_inArraySlots(): instantiates new list of Element with initial capacity 



**Methods** 
* *size()* : returns number of non-null elemeents
* *toString()* : returns string representation of the array
* *add()* : adds a reference to an instance of Element when given the data type and value.
* *get()* : returns the value given its index
* *expand()* : doubles the size of the array 

UserOfList tests instantiation, size(), expand(), and add. 


## Title: Element

*Partners: Kyle Sacks and Amy Lei*

**Fields**
* *type* 
* *intValue*
* *doubleValue* 
* *stringValue* 
* *INTS DOUBLES STRINGS* : named constants to represent the int that corresponds to each data type


**Constructors**
* Element(type, intVal, doubleVal, stringVal): instantiates an Element with corresponding values



**Methods** 
* *toString()* : returns string representation of the value Element holds

