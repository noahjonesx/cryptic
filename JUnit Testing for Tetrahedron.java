////////////////////////////////////////////////////////////////////////////

import static org.junit.Assert.*;

import org.junit.Test;


public class TetrahedronTest {

   @Test
   public void testConstructor1() {
       Tetrahedron t=new Tetrahedron();
       String ret="Tetrahedron \"\" with six edges of length 0.0 has:";
       ret+="\n\theight = 0.0 units";
       ret+="\n\tsurface area = 0.0 square units";
       ret+="\n\tvolume = 0.0 cubic units";      
       assertEquals(ret,t.toString());
   }
  

   @Test
   public void testConstructor2() {
       Tetrahedron t=new Tetrahedron("Medium Example",12.8);
       String ret="Tetrahedron \"Medium Example\" with six edges of length 12.8 has:";
       ret+="\n\theight = 2.921 units";
       ret+="\n\tsurface area = 283.779 square units";
       ret+="\n\tvolume = 247.152 cubic units";
       assertEquals(ret,t.toString());
   }
  

   @Test
   public void testGetEdge() {
       Tetrahedron t=new Tetrahedron("Medium Example",12.8);
       assertEquals(12.8,t.getEdge(),.000001);
   }

   @Test
   public void testSetEdge() {
       Tetrahedron t=new Tetrahedron();
       boolean b1=t.setEdge(12.8);
       assertEquals(true,b1);
       boolean b2=t.setEdge(-3.4);
       assertEquals(false,b2);
   }
  
   @Test
   public void testGetLevel() {
       Tetrahedron t=new Tetrahedron("Medium Example",12.8);
       assertEquals("Medium Example",t.getLevel());
   }
  
   @Test
   public void testSetLevel() {
       Tetrahedron t=new Tetrahedron();
       String s1="Medium Example";
       boolean b1=t.setLevel(s1);
       assertEquals(true,b1);
       String s2=null;
       boolean b2=t.setLevel(s2);
       assertEquals(false,b2);
   }

   @Test
   public void testGetHeight() {
       Tetrahedron t=new Tetrahedron("Medium Example",12.8);      
       double height=Math.sqrt(2*12.8/3.0);
       assertEquals(height,t.getHeight(),.00001);
      
   }
  
   @Test
   public void testGetSurfaceArea() {
       Tetrahedron t=new Tetrahedron("Medium Example",12.8);
       assertEquals(Math.sqrt(3.0)*t.getEdge()*t.getEdge(),t.getSurfaceArea(),.000001);
   }
  
   @Test
   public void testGetVolume() {
       Tetrahedron t=new Tetrahedron("Medium Example",12.8);
       assertEquals(t.getEdge()*t.getEdge()*t.getEdge()/(6*Math.sqrt(2.0)),t.getVolume(),.0000001);
   }
  

   @Test
   public void testGetCount() {
       Tetrahedron.resetCo
         unt(0);
       Tetrahedron t1=new Tetrahedron("Medium Example",12.8);
       assertEquals(1,t1.getCount());
       Tetrahedron t2=new Tetrahedron("Small Example",7.9);
       assertEquals(2,t1.getCount());
       Tetrahedron t3=new Tetrahedron("Large Example",6.98);
       assertEquals(3,t1.getCount());
   }
  
   @Test
   public void testResetCount() {
       Tetrahedron.resetCount(0);
       Tetrahedron t1=new Tetrahedron("Medium Example",12.8);
       assertEquals(1,t1.getCount());
       Tetrahedron.resetCount(4);
       Tetrahedron t2=new Tetrahedron("Small Example",7.9);
       assertEquals(5,t1.getCount());
       Tetrahedron.resetCount(6);
       Tetrahedron t3=new Tetrahedron("Large Example",6.98);
       assertEquals(7,t1.getCount());
       Tetrahedron.resetCount(9);

   }
  
   @Test
   public void testEquals() {
       Tetrahedron t1=new Tetrahedron("Medium Example",12.8);
       Tetrahedron t2=new Tetrahedron("Medium Example",12.8);
       assertEquals(true,t1.equals(t2));
      
       Tetrahedron t3=new Tetrahedron("Small Example",0.8);
       Tetrahedron t4=new Tetrahedron("Samll Example",0.75);
       assertEquals(false,t3.equals(t4));
   }
  
   @Test
   public void testToString() {
       String ret;
      
       Tetrahedron t=new Tetrahedron();
       ret="Tetrahedron \"\" with six edges of length 0.0 has:";
       ret+="\n\theight = 0.0 units";
       ret+="\n\tsurface area = 0.0 square units";
       ret+="\n\tvolume = 0.0 cubic units";
       assertEquals(ret,t.toString());
      
      
      
       Tetrahedron t1=new Tetrahedron("Small Example",0.5);
       ret="Tetrahedron \"Small Example\" with six edges of length 0.5 has:";
       ret+="\n\theight = 0.577 units";
       ret+="\n\tsurface area = 0.433 square units";
       ret+="\n\tvolume = 0.015 cubic units";
       assertEquals(ret,t1.toString());
      
      
       Tetrahedron t2=new Tetrahedron("Medium Example",12.8);
       ret="Tetrahedron \"Medium Example\" with six edges of length 12.8 has:";
       ret+="\n\theight = 2.921 units";
       ret+="\n\tsurface area = 283.779 square units";
       ret+="\n\tvolume = 247.152 cubic units";
       assertEquals(ret,t2.toString());
      
      
       Tetrahedron t3=new Tetrahedron("Large Example",97.36);
       ret="Tetrahedron \"Large Example\" with six edges of length 97.36 has:";
       ret+="\n\theight = 8.056 units";
       ret+="\n\tsurface area = 16,418.057 square units";
       ret+="\n\tvolume = 108,761.565 cubic units";
       assertEquals(ret,t3.toString());
   }
      
}

////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////)_
