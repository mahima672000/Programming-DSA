/* The problem states that:

The function should be an iterative function and should return the middle of the linked list.
make sure to not use size data member directly or indirectly (by calculating size via making a traversal)
In the linked list of even size, consider the end of the first half as mid.
Constraints:

Size property should not be used directly or indirectly.
Constant time, single traversal is expected.
Iterative solution, (not recursion) is expected. */


import java.io.*;

import java.util.*;

public int mid() {
  Node s = head;
  Node f = head;
  while (f.next != null && f.next.next != null)
  { s = s.next;
    f = f.next.next;
  }
  return s.data;
}
