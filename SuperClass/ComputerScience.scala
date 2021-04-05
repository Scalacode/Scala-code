package SuperClass


  class ComputerScience
  {
    def read
    {
      println("I'm reading")
    }
    def write
    {
      println("I'm writing")
    }
  }

  /* Subclass Scala */
  class Scala extends ComputerScience
  {
    // Note that readThanWrite() is only in Scala class
    def readThanWrite()
    {
      // Will invoke or call parent class read() method
      super.read

      // Will invoke or call parent class write() method
      super.write
    }
  }

  // Creating object
  object Geeks
  {
    // Main method
    def main(args: Array[String])
    {
      var ob = new Scala();

      // Calling readThanWrite() of Scala
      ob.readThanWrite();
    }
  }
