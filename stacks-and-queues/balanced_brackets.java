import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    Stack< Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if (ch == '(' || ch == '[' || ch == '{')
      {
        st.push(ch);
      }
      else if (ch == ')')
      {
        boolean val = handleClosing(st, '(');
        if (val == false)
        {
          System.out.println(val);
          return;
        }
      }
      else if (ch == ']')
      {
        boolean val = handleClosing(st, '[');
        if (val == false)
        {
          System.out.println(val);
          return;
        }
      }
      else if (ch == '}')
      {
        boolean val = handleClosing(st, '{');
        if (val == false)
        {
          System.out.println(val);
          return;
        }
      }
      else
      {

      }
    }
    if (st.size() == 0)
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }


  }
  public static boolean handleClosing(Stack < Character> st, char corresopch)
  {
    if (st.size() == 0)
    {
      return false;
    }
    else if (st.peek() != corresopch)
    {
      return false;
    }
    else
    {
      st.pop();
      return true;
    }
  }

}
