static String reverseString(CQStack s, String st)
{
  String str="";
  int l=st.length();
  for(int i=0;i<l;i++)
  {
    s.push(st.charAt(i));
  }
  for(int i=0;i<l;i++)
  {
    str=str+(char)s.pop();
  }
 return str;
}
