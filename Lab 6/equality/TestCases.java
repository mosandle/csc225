import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestCases
{
   @Test
   public void testExercise1()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));
   }

   @Test
   public void testExercise2()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(1, 10), LocalTime.of(2, 0));

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise3()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise4()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
         LocalTime.of(9, 10), LocalTime.of(10, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
   }
   @Test
   public void testExercise5(){
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
              LocalTime.of(9, 10), LocalTime.of(10, 0));

      final Student molly = new Student("Molly", "Sandler", 18, Collections.singletonList(one));
      final Student zach = new Student("Stone", "Zach", 19, Collections.singletonList(two));
      assertNotEquals(molly.hashCode(), zach.hashCode());
   }

   @Test
   public void testExercise6(){
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
              LocalTime.of(9, 10), LocalTime.of(10, 0));

      final Student molly = new Student("Molly", "Sandler", 18, Collections.singletonList(one));
      final Student zach = new Student("Stone", "Zach", 19, Collections.singletonList(two));
      assertEquals(molly.hashCode(), molly.hashCode());
   }

   @Test
   public void testExercise7(){
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
              LocalTime.of(9, 10), LocalTime.of(10, 0));

      final Student molly = new Student("Molly", "Sandler", 18, Collections.singletonList(one));
      final Student zach = new Student("Stone", "Zach", 19, Collections.singletonList(two));
      assertEquals(true, molly.equals(molly));
   }

   @Test
   public void testExercise8(){
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
              LocalTime.of(9, 10), LocalTime.of(10, 0));

      final Student molly = new Student("Molly", "Sandler", 18, Collections.singletonList(one));
      final Student zach = new Student("Stone", "Zach", 19, Collections.singletonList(two));
      assertEquals(false, molly.equals(zach));
   }


}//end of it
