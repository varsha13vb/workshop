import java.io.*;
class rectangle
{
 int len,wid;
 void getdata(int x,int y)
{
 len=x;
 wid=y;
}
 void rarea()
{
 int area=(len*wid);
 return(area);
}
}
class rect
{
 public static void main(String args[])
 {
  int area1;
  rect r1=new rect();
  r1.getdata(5,6);
 System.out.println("area= "+area);
}
}