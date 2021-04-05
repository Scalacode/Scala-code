package SuperClass


  class Person
  {
    def message()
    {
      println("This is person class");
    }

  }

  /* Subclass Student */
  class Student extends Person
  {

    override def message()
    {
      println("This is student class")
    }

    // Note that display() is only in Student class
    def display()
    {
      // will invoke or call current class message() method
      message ()

      // will invoke or call parent class message() method
      super.message
    }
  }

  /* Creating object */
  object Geeks
  {
    // Main method
    def main(args: Array[String])
    {
      var s = new Student();

      // Calling display() of Student
      s.display();
    }
  }