package app;


public class Value {
  
   public int ID;

   public int LGAs;

   public int Category;
   public int Status;
   public String Sex;
   public int Value;

   /**
    * Create a movie withou setting any of the fields,
    * Fields will have default "empty" values
    */
   public Value() {
   }

   /**
    * Create a movie setting all of the fields
    */
   public Value(int ID, int LGAs, int Category, int Status, String Sex, int Value) {
      this.ID = ID;
      this.LGAs = LGAs;
      this.Category = Category;
      this.Status = Status;
      this.Sex = Sex;
      this.Value = Value;
   }
}
