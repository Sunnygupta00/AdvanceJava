#WrapperClass means
  object type of premitive data
  like int ka bada bhai Integer and etc..,

  1) autoboxing
  Converting primitives into objects  
  Jab ham chote se bada convert krte hai usse autoboxing kehte hai
  example :
  int a = 5;
  Integer b = a; //autoboxing, now compiler will write Integer.valueOf(a) internally  

  2)unboxing
  Wrapper class to premitive
  bade se chota conversion
  //Converting Integer to int   
  Example:
  Integer a=new Integer(3);    
  int i=a.intValue();//converting Integer to int explicitly  
  int j=a;//unboxing, now compiler will write a.intValue() internally    
    
