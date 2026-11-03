//rrayList names = new ArrayList<>();
//names.add("Ram");
//names.add("Pooja");
//names.add("Ravi");
//System.out.println(names.get(1));    o/p= pooja


//ArrayList list = new ArrayList<>();
//list.add(10);
//list.add(20);
//list.add(30);
///list.remove(1);
//System.out.println(list);             o/p= 10,30



 //What happens when an element is inserted at index 1 in an ArrayList that already contains [A, B, C]?
   //A. A and B shift one position left
   //B. The element at index 1 is replaced
   //C. B and C shift one position right
   //D. The list automatically sorts itself
//ANSWER=  B and C shift one position right

   
   
//Which declaration allows a LinkedList to be used through the Queue interface?
  // A. List<Integer> q = new Queue<>();
   //B. Queue<Integer> q = new LinkedList<>();
   //C. Queue<Integer> q = new ArrayList<>();
   //D. Stack<Integer> q = new LinkedList<>();
   //ANSWER=Queue<Integer> q = new LinkedList<>();

   

//LinkedList<String> names = new LinkedList<>();
//names.add("Ram");
//names.add("Ravi");
//names.addFirst("Pooja");
//names.addLast("Kiran");
//System.out.println(names.getFirst());                   O/P=Pooja





//A Stack contains [10, 20, 30], with 30 at the top. What is the result after peek() followed by pop()?
  // ANSWER= peek returns 30; pop returns 30


   
   
//6. Which method should you use to find the 1-based position of an element in a Stack, counting from the top?
  // ANS= search()


//Vector<Integer> v = new Vector<>();
//v.add(5);
//v.add(10);
//v.set(0, 15);
//System.out.println(v.get(0) + v.get(1));                       O/P=25





//8. Why can frequent get(index) operations be slower in a LinkedList than in an ArrayList?
  // A. LinkedList does not support indexes
   //B. LinkedList sorts elements before every access
   //C. ArrayList stores elements outside memory
   //D. LinkedList must traverse nodes to reach the index

//9. Which statement best describes the effect of Vector's synchronized methods?
  // A. They provide synchronization for individual method calls
   //B. They make Vector immutable after creation
   //C. They make every sequence of multiple operations automatically atomic
   //D. They prevent all other threads from accessing the program

//10. What is the output?

//Vector<String> v = new Vector<>();
//v.add("A");
//v.add("B");
//v.add("C");
//v.removeElement("B");
//v.insertElementAt("D", 1);
//System.out.println(v);
  // A. [A, B, C, D]
 // B. [D, A, C]
  // C. [A, D, C]
   //D. [A, C, D]


