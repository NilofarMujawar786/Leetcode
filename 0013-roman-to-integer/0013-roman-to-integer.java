class Solution {
    public int romanToInt(String s) {
        
        int a = 0;
int n = 0;
for (int j = s.length()-1; j >= 0; j--) {
switch(s.charAt(j)) {
case 'I': n = 1;break;
case 'V': n = 5; break;
case 'X': n = 10; break;
case 'L': n = 50; break;
case 'C': n = 100; break;
case 'D': n = 500; break;
case 'M': n = 1000; break;
}
if (4 * n < a)
a -= n;
else
a += n;
}
return a;
    }
}