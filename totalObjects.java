public class totalObjects
{

   private int numObjects = 0;
   private static totalObjects instance;

   private totalObjects() {};

   public static totalObjects getInstance() {
      if (instance == null) {
          instance = new totalObjects();
      }
      return instance;
  }

   public void objectAdded()
   {
      numObjects++;
   }

   public int getTotalObjects()
   {
      return numObjects;
   }




}