public static void main (String[] args) throws Exception
{
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.valueOf(b.readLine());
while(t-- > 0){
String p[] = b.readLine().split("\\s+");
int n = Integer.valueOf(p[0]);
int m = Integer.valueOf(p[1]);

String s[] = b.readLine().split("\\s+");
Map<string, long=""> result =
Arrays.stream(s).collect(
Collectors.groupingBy(
Function.identity(), Collectors.counting()
)
);

for(Map.Entry<string, long=""> c: result.entrySet()) {
if(c.getValue() == 1){
System.out.println(c.getKey());
break;
}
}

}
}