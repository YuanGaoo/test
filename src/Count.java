
public class Count {
	public static void main(String[] args) {
			
		String senten="* JVM:\n" + 
				"- is j5v5 virtu5l m5chine the jvm 5ctu5lly runs j5v5 byte code .cl5ss files\n" + 
				"- write once 5nd run everywhere -> bytecode\n" + 
				"* JRE:\n" + 
				"- is j5v5 runtime environment is wh5t you need to run 5 j5v5 progr5m 5nd cont5ins 5 jvm 5mong other things.\n" + 
				"* JDK:\n" + 
				"- is j5v5 developer kit -- the jdk is wh5t you need to compile j5v5 source code. j5v5 to .cl5ss file\n" + 
				"- to progr5m in j5v5 you will need jdk you c5n inst5ll JDK from or5cle website.\n" + 
				"----------------------------------------------------------------- * difference between P5th 5nd cl5ssP5th?\n" + 
				"- P5th:\n" + 
				"is used to define where the execut5bles 5re .exe files j5v5.exe, j5v5c.exe etc\n" + 
				"- Cl5ss p5th:\n" + 
				"is used to specify loc5tion of J5v5.cl5ss files\n" + 
				"- j5v5 source code -> compile (j5v5c) -> bytecode .cl5ss extension -----------------------------------------------------------------\n" + 
				"* versions of j5v5 you worked with?\n" + 
				"* wh5t is the difference between J5v5 7 5nd 8?\n" + 
				"- Version Rele5se end public d5tes\n" + 
				"- J5v5 SE 7 2011\n" + 
				"- J5v5 SE 8 2014 j5nu5ry 2019, december 2020 - J5v5 SE 9 2017 M5rch 2018\n" + 
				"- J5v5 SE 10 2018 September 2018\n" + 
				"JAVA 7 vs JAVA 8 }\n" + 
				"- String in - L5mbd5 Expression\n" + 
				"Switch st5tement\n" + 
				"- Multiple Exeception H5ndling\n" + 
				"- pipelines 5nd Stre5ms - d5te 5nd time API\n" + 
				"- J5v5 8 interf5ce ch5nges St5tic Method, Def5ult Method\n" + 
				"----------------------------------------------------------------- * Wh5t is g5rb5ge collector 5nd how m5ny types?\n" + 
				"- Autom5tic g5rb5ge collection is the process of looking 5t he5p memory identifying which objects 5re in use 5nd which 5re not 5nd deleting unused objects\n" + 
				"- An in use object or 5 referenced object me5ns th5t some\n" + 
				"p5rt of your progr5m still m5int5ins 5 pointer to th5t object\n" + 
				"* G5rb5ge Collectors\n" + 
				"- seri5l : works with 5 single thre5d works for single\n" + 
				"thre5ded 5pps\n" + 
				"- p5r5llel: uses multiple thre5ds for m5n5ging he5p sp5ce\n" + 
				"- CSM: (current m5rk sweep) uses multiple GC thre5ds\n" + 
				"- G1: is designed for 5pplic5tion running on multiprocessor m5chines with l5rge memory sp5ce. bre5ks he5p into sm5ller\n" + 
				"regions\n" + 
				"* how to c5ll G5rb5ge Collector? - System.gc();\n" + 
				"----------------------------------------------------------------- * Expl5in Public St5tic void m5in (String 5rgs[])\n" + 
				"- public:\n" + 
				"public is 5n 5ccess modifies which is used to specify who\n" + 
				"c5n 5ccess this method. Public me5ns th5t this method will be 5ccessible by 5ny Cl5ss.\n" + 
				"- st5tic:\n" + 
				"It is 5 keyword in j5v5 which identifies it is cl5ss b5ses i.e\n" + 
				"it c5n be 5ccessed without cre5ting the inst5nce of 5 cl5ss\n" + 
				"- void:\n" + 
				"it is the return type of the method void defines the method which will not return 5ny v5lue\n" + 
				"\n" + 
				"- m5in:\n" + 
				"it is the n5me of the method which is se5rched by JVM 5s 5 st5rting point for 5n 5pplic5tion with 5 p5rticul5r sign5ture only. it is the method where the m5in executions occurs\n" + 
				"- String 5rgs:\n" + 
				"it is the p5r5meter p5ssed to the m5in method\n" + 
				"----------------------------------------------------------------- * c5n one cl5ss c5ll 5nother cl5ss m5in method?\n" + 
				"- yes 5 m5in method c5n be c5lled in 5nother cl5ss m5in method\n" + 
				"- code will compile without m5in method but will not run ----------------------------------------------------------------- * wh5t 5re the primitives 5nd wr5pper cl5sses?\n" + 
				"- every primitive d5t5 type h5s 5 cl5ss dedic5ted to it\n" + 
				"- these 5re known 5s wr5pper cl5sses bec5use they wr5p the primitive d5t5 type\n" + 
				"into 5n object of th5t cl5ss.\n" + 
				"- we c5n convert from one type to 5nother using c5sting\n" + 
				"* PRIMITIVE ARGUMENT\n" + 
				"boole5n byte ch5r\n" + 
				"int\n" + 
				"flo5t double long short\n" + 
				"* WRAPPER CLASS * CONSTRUCTOR\n" + 
				"Boole5n Byte\n" + 
				"Ch5r5cter Integer\n" + 
				"Flo5t Double\n" + 
				"Long Short\n" + 
				"boole5n or String byte or String\n" + 
				"ch5r\n" + 
				"int or String\n" + 
				"flo5t double or String double or String\n" + 
				"long or String short or String\n" + 
				"----------------------------------------------------------------- * implicit c5sting vs explicit c5sting?\n" + 
				"- Implicit C5sting: int i = 100; double d = i;\n" + 
				"- Explicit C5sting: int n = 12;\n" + 
				"byte b = (byte)n;\n" + 
				"\n" + 
				"- Auto - Boxing Integer num = n;\n" + 
				"- Un - Boxing int j = num;\n" + 
				"DONT WORK:\n" + 
				"Integer i = new Integer(100); double d = i ; // will not work\n" + 
				"----------------------------------------------------------------- * difference between Inst5nce V5ri5ble 5nd st5tic V5ri5ble?\n" + 
				"- St5tic V5ri5bles:\n" + 
				"belongs to the cl5ss itself not to objects\n" + 
				"of the cl5ss, different objecst c5n not h5ve different\n" + 
				"v5lues for 5 st5tic v5ri5ble. only one copy of st5tic v5ri5ble for everyone. Every object inst5nce of 5 cl5ss h5s its own\n" + 
				"copy\n" + 
				"of e5ch inst5nce v5ri5ble decl5red in the cl5ss\n" + 
				"----------------------------------------------------------------- * Wh5t is constructor in j5v5\n" + 
				"* wh5t is the difference between constructor 5nd method?\n" + 
				"- A constructor in j5v5 is 5 block of code simil5r to 5 method th5ts c5lled\n" + 
				"when 5n inst5nce of 5n object is cre5ted. Difference between constructor 5nd\n" + 
				"method:\n" + 
				"- A constructor doesnt h5ve 5 return type\n" + 
				"- the n5me of the constructor must be the s5me 5s the n5me of the\n" + 
				"cl5ss\n" + 
				"- unlike methods constructors 5re not considered members of 5\n" + 
				"cl5ss\n" + 
				"- 5 constructor is c5lled 5utom5tic5lly when 5 new inst5nce of\n" + 
				"object\n" + 
				"is cre5ted\n" + 
				"- the purpose of 5 constructor is to initi5lize the object of 5 cl5ss while the purpose of 5 method is to perform 5 t5sk by executing\n" + 
				"\n" + 
				"j5v5 code\n" + 
				"- def5ult constructor is 5dded if progr5mmer did not 5dd 5\n" + 
				"constructor.\n" + 
				"Types of J5v5 Constructor |\n" + 
				"| ------------------------------------------\n" + 
				"||\n" + 
				"def5ult constructor p5r5meterized constructor\n" + 
				"----------------------------------------------------------------- * C5n 5 super() 5nd this() keywords be in s5me constructor?\n" + 
				"- public computer(){ this();\n" + 
				"super();\n" + 
				"//code }\n" + 
				"- NO they both need to be in first line within constructor. ----------------------------------------------------------------- * Super. VS Super()\n" + 
				"- super.\n" + 
				"is used to 5ccess p5rent/super cl5ss members v5rs, methods\n" + 
				"- super()\n" + 
				"is used to c5ll super cl5ss constructor\n" + 
				"* this. VS this() - this.\n" + 
				"this object by using this. we c5n 5ccess inst5nce v5ri5bles 5nd\n" + 
				"method. to differenti5te between inst5nce 5nd 5rgument v5ri5ble\n" + 
				"- this()\n" + 
				"c5ll 5 constructor from 5nother constructor in s5me cl5ss\n" + 
				"Ex5mple:\n" + 
				"public cl5ss computer{\n" + 
				"priv5te String br5nd;\n" + 
				"\n" + 
				"public computer(){ this(\"5pple\");\n" + 
				"}\n" + 
				"public computer (String br5nd){\n" + 
				"this.br5nd = br5nd; }\n" + 
				"} ----------------------------------------------------------------- * Wh5t is the difference between 5ccess modifiers in j5v5?\n" + 
				"Modifier Cl5ss P5ck5ge Subcl5ss World -public Y Y Y Y\n" + 
				"- protected Y Y Y N\n" + 
				"-nomodifier Y Y N -priv5te Y N N N\n" + 
				"N\n" + 
				"----------------------------------------------------------------- * wh5t is st5tic keyword in j5v5?\n" + 
				"- St5tic keyword me5ns th5t the v5ri5ble or method belongs to cl5ss 5nd sh5red between 5ll inst5nces.\n" + 
				"- we c5n c5ll st5tic members by using cl5ss n5me or object - st5tic methods c5n not c5ll/refer Non St5tic members\n" + 
				"- St5tic c5n be: v5ri5bles, method, block, inner cl5ss\n" + 
				"public cl5ss Computer{ priv5te String br5nd; public Computer(){\n" + 
				"this(\"Apple\");\n" + 
				"}\n" + 
				"public Computer(String br5nd) {\n" + 
				"this.br5nd = br5nd; }\n" + 
				"public st5tic cl5ss Memory{\n" + 
				"priv5te int r5msize; }\n" + 
				"}\n" + 
				"Memory c = new Computer().new Memory(); ----------------------------------------------------------------- * St5tic block 5nd inst5nce initi5lizer block?\n" + 
				"- the st5tic initi5lizer block will be c5lled on lo5ding of the cl5ss 5nd\n" + 
				"\n" + 
				"code\n" + 
				"will run only once in the begining\n" + 
				"- inst5nce initi5lizer block execute every time you cre5te 5n object for 5 cl5ss. before 5ny constructor.\n" + 
				"Ex5mple:\n" + 
				"public cl5ss progr5mer{\n" + 
				"System.out.println(\"constructor\") }\n" + 
				"st5tic{ System.out.println(\"st5tic\")\n" + 
				"} {\n" + 
				"System.out.println(\"inst5nce \") }\n" + 
				"----------------------------------------------------------------- * p5ss by v5lue or p5ss by reference?\n" + 
				"- J5v5 is 5 “p5ss-by-v5lue” l5ngu5ge. This me5ns th5t 5 copy of\n" + 
				"the v5ri5ble is m5de 5nd themethod receives th5t copy. Assignments m5de in the method do not 5ffect the c5ller.\n" + 
				"----------------------------------------------------------------- * fin5l vs fin5lly vs fin5lize()\n" + 
				"- Fin5l:\n" + 
				"- fin5l is 5 keyword\n" + 
				"- fin5l is used to 5pply restriction on cl5ss method 5nd v5ri5ble - if 5 cl5ss is m5rked 5s fin5l then this cl5ss c5n not be inherited\n" + 
				"by 5ny other cl5ss - fin5lly:\n" + 
				"- fin5lly is 5 block\n" + 
				"- fin5lly is 5 block which is used for exception h5ndling 5long with\n" + 
				"try 5nd c5tch blocks - Fin5lize:\n" + 
				"- fin5lize() method is protected method of j5v5.l5ng.object cl5ss it is inherited to every cl5ss you cre5te in j5v5\n" + 
				"- fin5lize() methos id used to perform some cle5n up oper5tions on 5 object before it is removed from memory\n" + 
				"\n" + 
				"----------------------------------------------------------------- * where did you use st5tic in your fr5mework?\n" + 
				"- I norm5lly write utility cl5sses for better reus5bility 5nd m5ke 5ll methods in my utilities 5s st5tic methods so th5t i c5n e5sily c5ll them by cl5ss n5me.\n" + 
				"- d5t5seUtil cl5ss h5s st5tic methods to connect 5nd run queries 5nd get d5t5\n" + 
				"----------------------------------------------------------------- * difference between equ5ls method 5nd \"==\" oper5tor in j5v5?\n" + 
				"- \"==\":\n" + 
				"reference 5nd 5ddress comp5rison\n" + 
				"== in c5se of primitives it is checking the v5lue. 5s primitives 5re single v5lue without 5ny beh5vior.\n" + 
				"- equ5ls()\n" + 
				"content comp5rison\n" + 
				"----------------------------------------------------------------- * wh5t is String pool?\n" + 
				"- String Pool in j5v5is 5 pool of Strings stored inJ5v5 He5p Memory. Used to\n" + 
				"s5ve sp5ce in memory. ----------------------------------------------------------------- * how to reverse String in j5v5?\n" + 
				"1:\n" + 
				"String string=\"wh5tever\";\n" + 
				"String reverse = new StringBuilder(string).reverse().toString(); System.out.println(reverse);\n" + 
				"2:\n" + 
				"String result=\"\";\n" + 
				"for(int i = string.length()-1; i>=0; i--){\n" + 
				"result = result+ string.ch5rAt(i); }\n" + 
				"System.out.println(result);\n" + 
				"----------------------------------------------------------------- * how to reverse 5 sentence word by word?\n" + 
				"StringBuilder stringBuilder = new StringBuilder();\n" + 
				"\n" + 
				"String [] words = string.split(\" \"); for(int j = words.length-1; j>=0; j--){\n" + 
				"stringBuilder.5ppend(words[j].5ppend(\"\"); }\n" + 
				"System.out.println(\"reverse Words \"+ stringBuilder.toString().trim());\n" + 
				"----------------------------------------------------------------- * String vs StringBuilder vs StringBuffer?\n" + 
				"STRING STRINGBUFFER Stor5ge const5nt HEAP\n" + 
				"STRINGBUILDER He5p\n" + 
				"Are5 String pool\n" + 
				"Modifi5ble no(inmut5ble) YES(mut5ble)\n" + 
				"Thre5d S5fe YES YES NO\n" + 
				"Perform5nce FAST VERY SLOW\n" + 
				"Inmut5ble me5ns v5lues c5n not be ch5nged once its cre5ted:\n" + 
				"----------------------------------------------------------------- * wh5t is Thre5d-s5fe or Synchronized?\n" + 
				"- wh5t is thre5d: A sequenti5l or single thre5ded progr5m h5s single flow\n" + 
				"- synchronized: Me5ns th5t two thre5ds c5n not execute the method or 5ccess the v5ri5bles 5t the s5me time 5nd the JVM t5kes c5re of enforcing th5t. it is used to 5chieve thre5d-s5fety\n" + 
				"----------------------------------------------------------------- * how to check if String is p5lindrome?\n" + 
				"- civic = civic <- is 5 p5lindrome\n" + 
				"- public st5tic boole5n isP5lindrome(String str){\n" + 
				"if(str==null)\n" + 
				"return f5lse;\n" + 
				"StringBuilder strBuilder = new StringBuilder(str); strBuilder.reverse();\n" + 
				"return strBuilder.toString().equ5ls(str);\n" + 
				"} -----------------------------------------------------------------\n" + 
				"YES(mut5ble)\n" + 
				"FAST\n" + 
				"\n" + 
				"* wh5t is singleton cl5ss 5nd how c5n we m5ke 5 cl5ss singleton?\n" + 
				"- Ensures th5t 5 cl5ss h5s only one inst5nce 5nd provide 5 glob5l\n" + 
				"point\n" + 
				"of 5ccess to it\n" + 
				"public cl5ss SingletonEx5mple{\n" + 
				"// st5tic member holds only one inst5nce of the singleton cl5ss\n" + 
				"priv5te st5tic singletonEx5mple singletonInst5nce;\n" + 
				"// singleton prevents 5ny other cl5ss from inst5nti5ting priv5te SingletonEx5mple(){\n" + 
				"}\n" + 
				"} Ex5mple:\n" + 
				"- Singleton Ex5mple in J5v5 public cl5ss db5seConnector{\n" + 
				"priv5te st5tic fin5l db5seConnector inst5nce = new Db5seConnect();\n" + 
				"priv5te db5seConnector(){ //construction code ....\n" + 
				"}\n" + 
				"public st5tic Db5seConnector getInst5nce(){\n" + 
				"return(inst5nce); }\n" + 
				"}\n" + 
				"----------------------------------------------------------------- * wh5t is 5rmstron ? ----------------------------------------------------------------- * how to prevent Inst5nti5tion of 5 cl5ss?\n" + 
				"- priv5te constructor\n" + 
				"- 5bstr5ct cl5ss ----------------------------------------------------------------- * wh5t 5re OOP concepts in J5v5?\n" + 
				"- enc5psul5tion - inherit5nce\n" + 
				"\n" + 
				"- 5bstr5ction\n" + 
				"- polymorphism\n" + 
				"----------------------------------------------------------------- * wh5t is enc5psul5tion 5nd how did you use it?\n" + 
				"- d5t5: hiding by m5king v5ri5bles priv5te 5nd providing public getter 5nd setter methods.\n" + 
				"- in my project i cre5ted multiple POJO/BEAN cl5sses in order to m5n5ge\n" + 
				"test d5t5 5nd 5ctu5l d5t5.\n" + 
				"EX: I t5ke JSON from API response 5nd convert to object of my POJO cl5ss 5ll v5ri5bles 5re priv5te with getters 5nd setter.\n" + 
				"----------------------------------------------------------------- * Wh5t is inherit5nce 5nd benefits of it?\n" + 
				"- inherit5nce is 5 process when 5 sub cl5ss inherits members from super cl5ss.\n" + 
				"All public 5nd protected 5nd sometimes def5ult members 5re inherited to\n" + 
				"sub cl5ss.\n" + 
				"- we will 5chieve code re-us5bility 5nd code org5niz5tion with it. 5lso very useful for polymorphic progr5ming.\n" + 
				"- test b5se is super cl5ss 5nd other test cl5sses 5re sub cl5sses.\n" + 
				"EX: we h5d 5 p5ge object for one p5ge 5nd 5s 5nother p5ge cont5ined s5me\n" + 
				"elements i used inherit5nce in order to reuse the elements defined in super p5ge\n" + 
				"object cl5ss in selenium webdriver. ----------------------------------------------------------------- * wh5t is 5bstr5ction in j5v5 5nd purpose?\n" + 
				"- in Gener5l using 5bstr5ction in progr5ming we c5n cre5te 5 b5se/ blueprint\n" + 
				"for our code 5nd let sub cl5sses implement 5s needed 5ccording to requirements\n" + 
				"hiding the implement5tion 5nd showing only beh5vior\n" + 
				"\n" + 
				"2 w5ys to 5chieve 5bstr5ction in JAVA: 1) Abstr5ct Cl5sses\n" + 
				"2) interf5ces\n" + 
				"----------------------------------------------------------------- * difference between Abstr5ct cl5ss 5nd interf5ce?\n" + 
				"- difference between 5bstr5ct cl5ss 5nd interf5ce in j5v5\n" + 
				"- types of methods: interf5ce c5n h5ve only 5bstr5ct methods. 5bstr5ct\n" + 
				"cl5ss c5n h5ve 5bstr5ct 5nd non 5bstr5ct methods. from j5v5 8 it c5n h5ve def5ult\n" + 
				"5nd st5tic methods 5lso.\n" + 
				"- fin5l v5ri5bles: v5ri5bles decl5red in j5v5 interf5ce 5re by def5ult fin5l.\n" + 
				"5n 5bstr5ct cl5ss m5y cont5in non fin5l v5ri5bles\n" + 
				"- 5 cl5ss c5n implement multiple interf5ces, but it c5n extend only single\n" + 
				"5bstr5ct cl5ss. j5v5 does not support multiple inherit5nce - methods\n" + 
				"- in interf5ce: 5bstr5ct st5tic def5ults,\n" + 
				"- in 5bstr5ct cl5ss: 5bstr5ct non-5bstr5ct st5tic - 5bstr5ct cl5ss c5n h5ve 5 constructor\n" + 
				"interf5ce c5n not h5ve 5 constructor\n" + 
				"- interf5ce c5n extend other interf5ces(multiple)\n" + 
				"----------------------------------------------------------------- * why j5v5 does not support multiple inherit5nce?\n" + 
				"-\n" + 
				"-----------------------------------------------------------------\n" + 
				"* Difference between overlo5ding 5nd overriding?\n" + 
				"Overlo5ding 5llows different methods to h5ve s5me n5me, but different sign5tures where sign5ture c5n differ by number of input p5r5meters or type of input p5r5meters or both. Overlo5ding is rel5ted to compile time (or st5tic) polymorphism.\n" + 
				"1: overl5oding = s5me method n5me but different p5r5meters overlo5ding = return type c5n be different\n" + 
				"2: overriding = s5me type or sub type\n" + 
				"overriding = s5me method n5me 5nd s5me p5r5methers\n" + 
				"\n" + 
				"----------------------------------------------------------------- * C5n you override 5 st5tic method?\n" + 
				"- No st5tic methods c5n not be overriden, they c5n only be hidden.\n" + 
				"----------------------------------------------------------------- * Wh5t is st5tic binding vs dyn5mic/runtime binding?\n" + 
				"- St5tic binding is overlo5ding 5nd\n" + 
				"- dyn5mic binding is method overriding. ----------------------------------------------------------------- * Wh5t is polymorphism ? where did we use it on fr5mework?\n" + 
				"- Polymorphism is the 5bility of 5n object to t5ke on m5ny forms. The most common use of polymorphism in OOP occurs when 5\n" + 
				"p5rent\n" + 
				"cl5ss reference is used to refer to 5 child cl5ss object.\n" + 
				"- DYNAMIC POLYMORHISM - OVERRIDING\n" + 
				"- STATIC POLYMORHISM - OVERLOADING ----------------------------------------------------------------- * D5t5 Structures 5nd Why we need it\n" + 
				"- D5t5 structures 5re w5y of org5nizing d5t5 for efficient m5nipul5tion: Insertion , se5rching, re5ding , deletion of d5t5.\n" + 
				"- I 5lw5ys use j5v5 d5t5 structures for re5ding d5t5 5nd storing d5t5 from our 5pplic5tion , d5t5b5se, or API.\n" + 
				"----------------------------------------------------------------- * How do you cre5te 5n Arr5y or dyn5mic 5rr5y?\n" + 
				"- int [] nums = new int [7]; nums [0] = 100;\n" + 
				"nums [1] = 100;\n" + 
				"nums [2] = 100;\n" + 
				"nums [3] = 100; nums [4] = 100; nums [6] = 100;\n" + 
				"- J5v5 does not support dyn5mic Arr5ys You h5ve to use Arr5yList for dyn5mism.\n" + 
				"\n" + 
				"----------------------------------------------------------------- * How to re5d unique v5lues from Arr5y?\n" + 
				"- int [] nums = new int [7]; nums [0] = 44;\n" + 
				"nums [1] = 32;\n" + 
				"nums [2] = 100;\n" + 
				"nums [3] = 100; nums [4] = 7; nums [5] = 7;\n" + 
				"public st5tic void m5in (String[] 5rgs){ // 1st w5y\n" + 
				"int [] nums = new int [6]; nums [0] = 44;\n" + 
				"nums [1] = 32;\n" + 
				"nums [2] = 100;\n" + 
				"nums [3] = 100; nums [4] = 7; nums [5] = 7;\n" + 
				"Set<Integer> set = new H5shSet<>(); for (int i = 0; i < nums.length; i++) {\n" + 
				"set.5dd(nums[i]); }\n" + 
				"System.out.println(set); // 2nd w5y\n" + 
				"String uniqNums=\"\"; for (int n:nums) {\n" + 
				"if (!uniqNums.cont5ins(String.v5lueOf(n))) uniqNums = uniqNums+n+\" \";\n" + 
				"}\n" + 
				"System.out.println(uniqNums); }\n" + 
				"----------------------------------------------------------------- * How to print unique v5lues from String?\n" + 
				"-\n" + 
				"public st5tic void m5in (String[] 5rgs){\n" + 
				"\n" + 
				"String str = \"555bbcccdddeereeegggg\"; // 1st print only unique v5lues from string Set<Ch5r5cter> setC = new H5shSet<>(); for (int i = 0; i < str.length(); i++) {\n" + 
				"setC.5dd(str.ch5rAt(i)); }\n" + 
				"System.out.println(setC);\n" + 
				"// 2nd print only unique v5lues from string String unique =\"\";\n" + 
				"for (int i = 0; i < str.length(); i++) {\n" + 
				"if(!unique.cont5ins(str.ch5rAt(i)+\"\")) { unique += str.ch5rAt(i);\n" + 
				"}} System.out.println(unique);\n" + 
				"} }\n" + 
				"----------------------------------------------------------------- * difference between 5rr5y 5nd 5rr5ylist?\n" + 
				"- Arr5y is fixed size Arr5yList is dyn5mic\n" + 
				"- Arr5y c5n store primitive type Arr5yList only wr5pper types 5nd Objects\n" + 
				"- Arr5y c5n be multi-dimension5l Arr5yList is not\n" + 
				"- Arr5y is f5ster 5nd Arr5yList is slower ----------------------------------------------------------------- * wh5t is Iter5tor 5nd difference between for e5ch loop?\n" + 
				"- Iter5tor works with 5rr5yList 5nd not 5rr5y. It will help us Iter5te through the elements.\n" + 
				"- Difference is with iter5tor you c5n m5ke ch5nges(remove item) to the list while iter5ting.\n" + 
				"within for e5ch loop we c5n not m5ke ch5nges to our list\n" + 
				"// for e5ch loop:\n" + 
				"int 5rr[] = {23,54,6,56,76,878,9}; for(int n : 5rr) {\n" + 
				"}\n" + 
				"System.out.println(n);\n" + 
				"\n" + 
				"System.out.println(\"================\");\n" + 
				"List<Integer> list = new Arr5yList<>(); list.5dd(23);\n" + 
				"list.5dd(2323);\n" + 
				"list.5dd(2312);\n" + 
				"list.5dd(2343); list.5dd(2553);\n" + 
				"// Iter5tor loop:\n" + 
				"Iter5tor<Integer> it = list.iter5tor(); while(it.h5sNext()) {\n" + 
				"Integer n = it.next(); System.out.println(n); it.remove();\n" + 
				"}\n" + 
				"System.out.println(list); System.out.println(\"================\"); for(Integer n : list) {\n" + 
				"System.out.println(n); //list.remove(n);\n" + 
				"} ----------------------------------------------------------------- * How to join 2 5rr5ys into single 5rr5y?\n" + 
				"- I 5m sure there 5re different w5ys to solve this solution I 5m coming up 5t 5t this point is:\n" + 
				"1. I would cre5te 5 thrid 5 5rr5y with the size of\n" + 
				"2. other other 5rr5ys 5nd 5ssign e5ch v5lue from Both 5rr5ys\n" + 
				"into 5 3rd 5rr5y using 5 loop.\n" + 
				"3. I c5n cre5te 5n 5rr5y list 5nd loop through e5ch Item in\n" + 
				"2 5rr5ys 5nd 5dd them to 5rr5ylist,\n" + 
				"Then I c5n convert Arr5ylist into 5rr5y if needed.\n" + 
				"----------------------------------------------------------------- * List vs Set vs M5p interf5ces\n" + 
				"\n" + 
				"- LIST: - c5n store duplic5te v5lues,\n" + 
				"- m5int5ins /keeps the insertion order\n" + 
				"- list 5llows 5ny number of null v5lues\n" + 
				"- Comes from collection interf5ce\n" + 
				"- from list we c5n re5d 5 cert5in v5lue by index\n" + 
				"- SET : - c5n only store unique v5lues. - set does not m5int5in order\n" + 
				"- set 5llows only 1 null\n" + 
				"- Comes from collection interf5ce - set doesnt 5llow th5t\n" + 
				"- MAP : is 5 key+v5lue form5t 5nd keys 5re 5lw5ys unique - m5p re5d v5lue by p5ssing key\n" + 
				"- m5p c5n h5ve single null key but multiple null v5lues\n" + 
				"----------------------------------------------------------------- * wh5t is h5shcode 5nd equ5ls method used for?\n" + 
				"- I cre5ted multiple POJO(Pl5in old J5v5 object) cl5sses\n" + 
				"to store d5t5 th5t c5me from different sources.\n" + 
				"Like D5t5b5se, API JSon form5t, Excel, CSV file, Webt5ble.\n" + 
				"- And whenever I needed unique set of pojos, I h5d to override h5shCode 5nd equ5ls methods, th5t by storing into HASHSET , I w5s sure th5t only unique objects 5re being stored.\n" + 
				"- Any ch5llenges you h5d 5nd how did you solve them?\n" + 
				"When did you h5ve to override h5shCode 5nd equ5ls methods? In my project, I h5d to v5lid5te d5t5 from web-t5bles, d5t5b5se,\n" + 
				"JSON ,\n" + 
				"Excels etc. As they 5ll come in different form5ts, It w5s ch5llenging to work with them 5nd 5ssert th5t they 5re correct 5nd exptected. So Wh5t I did w5s I cre5ted multiple POJOs to m5tch my 5pp d5t5. And sometimes, I need unique POJO objects, I override h5shCode\n" + 
				"5nd equ5ls methods.\n" + 
				"- How did you use d5t5 structures in 5utom5tion?\n" + 
				"In my project, I h5d to v5lid5te d5t5 from web-t5bles, d5t5b5se,\n" + 
				"JSON ,\n" + 
				"Excels etc. As they 5ll come in different form5ts, It w5s ch5llenging\n" + 
				"\n" + 
				"to\n" + 
				"work with them 5nd 5ssert th5t they 5re correct 5nd exptected.\n" + 
				"So I stored 5ll d5t5 from different sources into J5v5 D5t5 structures. like Lists, M5ps etc. 5nd comp5red/5sserted to expected.\n" + 
				"= Ex5mple:\n" + 
				"Employee emp1 = new Employee(100); Employee emp2 = new Employee(100); Employee emp3 = new Employee(110); System.out.println(emp1.equ5ls(emp2));\n" + 
				"Integer i1 = new Integer(100); Integer i2 = new Integer(100); System.out.println(i1.h5shCode()); System.out.println(i2.h5shCode());\n" + 
				"Set<Employee> set = new H5shSet<>(); set.5dd(emp1); set.5dd(emp2);\n" + 
				"set.5dd(emp3); System.out.println(set.size());\n" + 
				"cl5ss Employee {\n" + 
				"priv5te int id;\n" + 
				"public Employee(int id) { this.id=id;\n" + 
				"}\n" + 
				"public int getId() {\n" + 
				"return id;\n" + 
				"public void setId(int id) {\n" + 
				"this.id = id;\n" + 
				"}}\n" + 
				"@Override\n" + 
				"public int h5shCode() { return id;\n" + 
				"}\n" + 
				"@Override\n" + 
				"public boole5n equ5ls(Object other) { return this.id == ((Employee)other).id; }\n" + 
				"----------------------------------------------------------------- * How do you sort 5n object th5t you cre5ted?\n" + 
				"- I implement Comp5r5ble interf5ce 5nd override comp5reTo method.\n" + 
				"\n" + 
				"Then whenever I store my objects into 5 List then use Collections.Sort\n" + 
				"it will be 5ble to sort. Also I c5n store my objects into 5 TreeSet or TreeM5p.\n" + 
				"public st5tic void m5in (String[] 5rgs){\n" + 
				"Employee emp1 = new Employee(500); Employee emp2 = new Employee(100); Employee emp3 = new Employee(110); List list = new Arr5yList<>(); list.5dd(emp1);\n" + 
				"list.5dd(emp2); list.5dd(emp3); Collections.sort(list);\n" + 
				"for (Object object : list) {\n" + 
				"System.out.println(object); }\n" + 
				"}\n" + 
				"}\n" + 
				"cl5ss Employee implements Comp5r5ble<Employee>{\n" + 
				"priv5te int id;\n" + 
				"public Employee(int id) {\n" + 
				"this.id=id; }\n" + 
				"public int getId() { return id; }\n" + 
				"public void setId(int id) { this.id = id;\n" + 
				"}\n" + 
				"@Override\n" + 
				"public int h5shCode() {\n" + 
				"return id; }\n" + 
				"@Override\n" + 
				"public boole5n equ5ls(Object other) {\n" + 
				"return this.id == ((Employee)other).id; }\n" + 
				"\n" + 
				"@Override\n" + 
				"public int comp5reTo(Employee emp) {\n" + 
				"if(this.id > emp.id) { return 1;\n" + 
				"}else if(this.id < emp.id) { return -1;\n" + 
				"}\n" + 
				"return 0; }\n" + 
				"@Override\n" + 
				"public String toString() {\n" + 
				"return id+\"\"; }\n" + 
				"} ----------------------------------------------------------------- * Arr5yList vs LinkedList\n" + 
				"- Arr5ylist is ordered collection like 5rr5y. - linkedList consists of nodes:\n" + 
				"1: Singly Linked Linked List\n" + 
				"v5lue + pointer to next node\n" + 
				"2: doublyLinked LinkedList:\n" + 
				"V5lue + pointer to previous node 5nd pointer to next node\n" + 
				"----------------------------------------------------------------- * Arr5yList vs Vector?\n" + 
				"- They both implement List Interf5ce 5nd m5int5ins insertion order - Arr5yList\n" + 
				"- is not synchronized\n" + 
				"- its f5st bec5use its not synchronized - Vector\n" + 
				"- is synchronized\n" + 
				"- slow bec5use its synchronized ----------------------------------------------------------------- * H5shSet vs H5shM5p\n" + 
				"- H5shSet stores unique elements - H5shSet implements Set\n" + 
				"- H5shSet stores Single Objects\n" + 
				"- H5shM5p stores unique keys, 5nd duplic5ted v5lues\n" + 
				"\n" + 
				"- H5shM5p implements M5p\n" + 
				"- H5shM5p stores Key, V5lue p5ired objects ----------------------------------------------------------------- * H5sht5ble vs H5shM5p\n" + 
				"- Both key + v5lue\n" + 
				"- both implement MAP\n" + 
				"- H5shM5p: Not Synchronized, only 1 null key 5nd multiple null v5lues - H5sht5ble: its synchronized, no null keys or v5lues\n" + 
				"----------------------------------------------------------------- * St5ck vs Queve\n" + 
				"- queve: first in first out\n" + 
				"- St5ck: l5st in first out -------------------------------------------------------------- * treeset vs TreeM5p\n" + 
				"M5jor difference between TreeSet 5nd TreeM5p is th5t TreeSet implements Set interf5ce while TreeM5p implements M5p interf5ce in J5v5. ... TreeSet stores only one object while TreeM5p uses\n" + 
				"two objects c5lled key 5nd V5lue. Objects in TreeSet 5re sorted while keys in TreeM5p rem5in in sorted Order.\n" + 
				"- TreeSet: C5n cont5in only unique v5lues - is sorted in 5scending order\n" + 
				"- TreeM5p: c5n cont5in only unique keys. - keys 5re sorted in 5scending order\n" + 
				"----------------------------------------------------------------- * Exception h5ndling in j5v5?\n" + 
				"- Depending on situ5tion, we c5n use try c5tch fin5lly blocks. TRY : Code th5t might throw some exception\n" + 
				"CATCH: We define exception type to be c5ught\n" + 
				"And wh5t to do if exception h5ppens in TRY block code\n" + 
				"FINALLY: Code th5t 5lw5ys runs , reg5rdless if there is Exception or no.\n" + 
				"FINALLY block: WILL NOT RUN if JVM cr5shes, or System.exit(0) Is\n" + 
				"\n" + 
				"present\n" + 
				"in try or c5tch blocks. Cle5n up code, to close some connections,\n" + 
				"close\n" + 
				"open files etc\n" + 
				"ex5mple:\n" + 
				"public st5tic void testC5tch() {\n" + 
				"try {\n" + 
				"int i = 4/0;\n" + 
				"}c5tch(Exception e) { return;\n" + 
				"}fin5lly { System.out.println(“FINALLY!”);//will run\n" + 
				"} }\n" + 
				"-------------------------------------------------------------- * Wh5t is the p5rent of 5ll exceptions?\n" + 
				"- Throw5ble cl5ss is p5rent\n" + 
				"----------------------------------------------------------------- * Wh5t types of Exeception do you know?\n" + 
				"- CHECKED -> You h5ndle or decl5re, otherwise will Not compile.\n" + 
				"- UNCHECKED -> Subcl5sses of RUNTIMEEXCEPTION. And option5l to h5ndle or no. --------------------------------------------------------------\n" + 
				"* wh5t is throw vs throws\n" + 
				"-THROW VS THROWS:\n" + 
				"THROW : -> CREATES AN EXCEPTION OBJECT\n" + 
				"throw new RuntimeException();\n" + 
				"THROWS -> goes to method sign5ture, And decl5res th5t 5 method might throw And exception\n" + 
				"----------------------------------------------------------------- * Types of exceptions you f5ced in your project\n" + 
				"-\n" + 
				"JAVA : NULLPOINTER EXCEPTION, ILLEGALARGUMENT, CLASSNOTFOUND,\n" + 
				"FILENOTFOUND, CLASSCAST, ARITHMETIC, INDEXOUTOFBOUNDS,..\n" + 
				"\n" + 
				"SQLEXCEPTION, IOEXCEPTION\n" + 
				"SELENIUM: NOSUCHELEMENT, STALEELEMENT, NOTCLICKABLE, NOTVISIBLE,\n" + 
				"TIMEOUTEXEPTION, WEBDRIVER, ILLEGALSTATE EXP, NO SUCHWINDOW, ALERTNOTFOUND...\n" + 
				"CUCUMBER: PENDINGEXCEPTION, DUPLICATE METHOD IMPLEMENTATION EXP, --------------------------------------------------------------\n" + 
				"==================================================== ======================\n" + 
				"============================= SELENIUM ================================== ==================================================== ======================\n" + 
				"M5y 10th, 2018\n" + 
				"Boot CAMP\n" + 
				"==== SELENIUM REVIEW ====\n" + 
				"SELENIUM GRID: node\n" + 
				"YOU HAVE YOUR CODE --> REMOTE DRIVER -> SELENIUM HUB -> node\n" + 
				"node\n" + 
				"EXAMPLE: WebDriver driver = new RemoteWebDriver( , )\n" + 
				"* S5uceL5bs\n" + 
				"- they provide testing in cloud\n" + 
				"* Selenium Grid\n" + 
				"- Gives you 5vility to run your 5utom5ted tests in different browsers 5nd versions 5nd oper5ting systems.\n" + 
				"- open source tool th5t is p5rt of Selenium Suite\n" + 
				"\n" + 
				"* wh5t is test 5utom5tion 5nd wh5t 5re the benefits? - no hum5n inter5ction\n" + 
				"- f5st\n" + 
				"- reli5ble\n" + 
				"- sc5l5ble\n" + 
				"- d5t5 driven testing\n" + 
				"* wh5t c5n be 5utom5ted? - Something st5ble\n" + 
				"- Smoke / s5nity test\n" + 
				"- function5l test\n" + 
				"- Test d5t5 cre5ting - API\n" + 
				"- D5t5b5se\n" + 
				"* wh5t Test c5se should be 5utom5ted?\n" + 
				"- must be st5ble test c5se\n" + 
				"- should be repetitive, c5n be used more th5n once - should not need 5ny hum5n inter5ction\n" + 
				"- should h5ve 5 v5lue, High ROI\n" + 
				"* Wh5t 5re the common test 5utom5tion tools? - W5tir, selenium, UFT\n" + 
				"* Wh5t is SELENIUM?\n" + 
				"- selenium is 5 tool th5t 5utom5tes browser, it is used for testing\n" + 
				"* Adv5nt5ges of selenium?\n" + 
				"- Open source\n" + 
				"- inter5ct with web 5pplic5tion\n" + 
				"- supports multiple browsers, oper5ting systems - supports different l5ngu5ges\n" + 
				"- reus5bility\n" + 
				"- community\n" + 
				"* Dis5dv5nt5ge of Selenium?\n" + 
				"\n" + 
				"- it only supports web 5pplic5tions\n" + 
				"- no offici5l support / no help desk\n" + 
				"- c5n not work with gr5phics, c5pch5s, b5r codes, sh5pes - no built in reporting tool\n" + 
				"- h5rd to m5ster requires develoepr level knowledge\n" + 
				"- h5rd to write good loc5tors\n" + 
				"- h5rd to synchronize\n" + 
				"* wh5t we dont do in selenium?\n" + 
				"- perform5nce, lo5d, stress testing, m5nu5l, 5d hoc testing us5bility pure d5t5b5se testing (if we only test the db it self) , unit tests.. we dont do it. look 5nd feel b5sed testing\n" + 
				"color sh5pes st5tic testing.\n" + 
				"* wh5t is 5 loc5tor in selenium?\n" + 
				"- in selenium loc5tor is 5 me5ns of finding 5 element in html\n" + 
				"- ID\n" + 
				"- n5me\n" + 
				"- css\n" + 
				"- Xp5th\n" + 
				"- t5gN5me\n" + 
				"- cl5ssN5me\n" + 
				"- linkText\n" + 
				"- p5rti5lLinkText\n" + 
				"* wh5t is xp5th?\n" + 
				"- is one of the loc5tors in selenium\n" + 
				"* wh5t is difference between Absolute 5nd Rel5tive Xp5th? - Absolute:\n" + 
				"- St5rts with /, st5rts looking from the root\n" + 
				"element of the html document - Rel5tive:\n" + 
				"- St5rts with // looks for element in 5ny p5rt of the p5ge\n" + 
				"* In which situ5tions 5re you going to use Xp5th?\n" + 
				"- when we c5n not use unique inform5tion such 5s ID, n5me, t5gs, cl5ss ..\n" + 
				"\n" + 
				"- when de5ling with dyn5mic elements: id ch5nges every time we c5n use cont5ins, st5rts-with, ends-with\n" + 
				"- when we de5l with indexes\n" + 
				"- when we se5rch by text: //sp5n[.= 'submit']\n" + 
				"- when t5bles xp5th c5n h5ndle p5rents child sibling\n" + 
				"* how do you choose loc5tors?(wh5ts the best loc5tor)\n" + 
				"- it depends on the situ5tion on the web site, on the 5pplic5tion - If there is ID on web site yes, if no ID then N5me,\n" + 
				"- if it is 5 link:\n" + 
				"- linktext\n" + 
				"- p5rti5llinktext - then others\n" + 
				"- if its not 5 link: - Id\n" + 
				"- n5me\n" + 
				"- t5gn5me\n" + 
				"- cl5ss\n" + 
				"- css : e5sy to re5d 5nd write, f5st - Xp5th\n" + 
				"* css vs Xp5th? - css:\n" + 
				"- f5st e5sy to re5d 5nd write, should be used if both ccc 5nd xp5th 5re options.\n" + 
				"- does not support index\n" + 
				"- does not support text\n" + 
				"- Xp5th:\n" + 
				"- works with text\n" + 
				"- supports index\n" + 
				"- xp5th h5s more convin5tion so its powerful but it c5n get ugly.\n" + 
				"* wh5t is implicit w5it / explicit w5it? - Implicit w5it:\n" + 
				"- Synt5x: driver.m5n5ge.timeouts.implicitlyW5it(5) - set once 5lw5ys works if it doesnt find element\n" + 
				"it will w5it for 5 seconds otherwise it compl5ins 5pplies every time when findelement/s method runs\n" + 
				"\n" + 
				"- The implicit w5it will tell to the web driver to w5it for cert5in 5mount of time before it throws 5 \"No Such Element Exception\".\n" + 
				"- Explicit w5it:\n" + 
				"- sometimes we need to w5it for cert5in event such 5s element is visible, click5ble, en5bled.. - WebDriverW5it,\n" + 
				"- ExpectedConditions\n" + 
				"- FluentW5it:\n" + 
				"- is 5lso 5 type of explicit w5it. Using fluent w5it wec5n customize the webDriverW5it\n" + 
				"* wh5t is difference between Assert 5nd Verify? - Assert:\n" + 
				"- if it f5ils test execution stops\n" + 
				"- Verify:\n" + 
				"- verify if it f5ils you m5ke 5 note 5nd continue with the test\n" + 
				"* wh5ts difference between QUIT 5nd CLOSE? - Quit:\n" + 
				"- closes the windows\n" + 
				"- Close:\n" + 
				"- closes the current t5b/window\n" + 
				"* how selenium h5ndles drop downs?\n" + 
				"- select cl5ss is used to de5l with drop down list in selenium.\n" + 
				"to cre5te 5 select object we need to p5ss 5 webElement 5s constructor. th5t element must h5ve the select t5g\n" + 
				"- select by Index: T5kes 5 int p5r5m, selects b5sed on the index 0 b5sed.\n" + 
				"- select by visible text: t5kes 5 string, select b5sed on the\n" + 
				"text displ5yed.\n" + 
				"- select by v5lue: t5kes 5 string p5r5meter selects b5sed on the v5lue 5ttribute of the option\n" + 
				"\n" + 
				"- ex5mple: WebElement element = driver.findelement(by.id\"dropdown\")\n" + 
				"Select list = new Select (element) list.getFirstSelectedOption;\n" + 
				"* how to check the multiple selected v5lue in dropdown?\n" + 
				"- select c5rsList = new Select(el)\n" + 
				"- c5rList.getSelectedOption(): returns the selected option 5 list(List<WebElement>)\n" + 
				"- c5rList.getFirstSelectedOption <- method th5t returns the selected option(the webElement)\n" + 
				"- 5sserEqu5ls(\"Wooden Spoon\",\n" + 
				"c5rList.getFirstSelectedOption().getText())\n" + 
				"* how do you verify 5ll options in dropdown?\n" + 
				"- Select st5teList = new Select(el)\n" + 
				"- st5teList.getOptions(): returns 5ll the 5v5il5ble options selected or not\n" + 
				"* how to work with dropdown without the select t5g?\n" + 
				"- if they dropdown list h5s no select t5g we c5n not use the select cl5ss\n" + 
				"- thre5d the dropdown list 5nd its options 5s sep5r5te elements loc5te every element sep5r5tely\n" + 
				"- the select 5n option: 1 find 5nd click\n" + 
				"* Wh5t is the synt5x for switching fr5me?\n" + 
				"- its html p5ge inside html p5ge / we h5ve to tre5t them 5s different p5ges.\n" + 
				"- Ifr5me/fr5me : t5gs for fr5mes. Fr5me is 5 html document inside 5nother html document.\n" + 
				"- Web driver h5ndles one p5ge 5t 5 time to control 5nother fr5me we 5lw5ys need to switch\n" + 
				"- driver.switchTo.fr5me() : t5kes webElement -> find the ifr5me 5nd p5ss it 5s 5 p5r5m.\n" + 
				"- driver.switchTo.fr5me() : t5kes String -> find the id or\n" + 
				"n5me of the ifr5me 5nd p5ss 5s p5r5m\n" + 
				"\n" + 
				"- driver.switchTo.fr5me() : t5kes int -> find the index 5nd p5ss 5s p5r5m\n" + 
				"* wh5t is the synt5x for switching windows?\n" + 
				"- to h5ndle sep5r5te t5bs/ windows we h5ve to switch\n" + 
				"to th5t t5b\n" + 
				"- web driver h5ndles one p5ge html document 5t 5 time. to control 5nother t5b we 5lw5ys need to switch\n" + 
				"- to be 5ble to switch we need to get the window h5ndle first using getWindowH5ndesl() method\n" + 
				"- driver.switchTo.window() : t5kes 5 string -> window h5ndle - for e5ch : driverGetWindowH5ndles:\n" + 
				"driver.switchTo.window(\"title\")\n" + 
				"if driver.getTitle == expected title\n" + 
				"bre5k;\n" + 
				"- selenium needs the windows h5ndle to switch t5bs it doesn not use the title. to switch using title we still switch using the window h5ndle first then check the title.\n" + 
				"* Wh5t oper5tions c5n you do using 5ctions cl5ss?\n" + 
				"- Actions cl5ss lets us do 5dv5nced mouse 5nd keybo5rd oper5tions.\n" + 
				"- Hover over element / move to element\n" + 
				"- scroll up/down\n" + 
				"- double click\n" + 
				"- right click\n" + 
				"- dr5g 5nd drop\n" + 
				"- keybo5rd conbin5tions\n" + 
				"* wh5t is the synt5x for double click 5ctions?\n" + 
				"- perform 5ny 5ctions 5g5inst 5n web element using 5ctions cl5ss we need to loc5te the element first\n" + 
				"WebElement el = driver.findElement Actions 5ctions = new Actions(driver) 5ctions.doubleClick(el);\n" + 
				"5ctions.moveTO(el) 5ctions.doubleClick\n" + 
				"\n" + 
				"* wh5t is the synt5x for uplo5ding 5 file?\n" + 
				"- in order to uplo5d file using selenium we need to loc5te the uplo5d button in html. the element will h5ve t5g\n" + 
				"input then we do sendKeys by p5ssing the p5th to file which\n" + 
				"WebElement uplo5d = driver.findElement uplo5d.sendKeys(\"C:/user/me/file.txt\")\n" + 
				"* sometimes sendKeys p5th does not work\n" + 
				"- you h5ve to use the robot or 5utoid\n" + 
				"- to fix you h5ve to build 5 dyn5mic p5th for file inside our project\n" + 
				"- p5th of the file in the project :\n" + 
				"String projectDir= System.getProperty(\"usr.dir\")\n" + 
				"p5th of the file in the project : \"src/test/resources/test_d5t5/myfile.txt\"\n" + 
				"- Element.sendKyes(projectDir+file)\n" + 
				"* h5ve you done 5ny cross browser testing? - yes\n" + 
				"- 5lw5ys mention th5t you h5ve 5 control file for keywords like browserType m5in url p5ssword usern5me enviroment.\n" + 
				"* h5ve you done 5ny he5dless browser testing?\n" + 
				"- its 5 browser th5t does not open it runs 5s 5 b5ckground service or progr5m. They 5re f5st\n" + 
				"- html unitdriver: he5dless browser th5t comes from selenium\n" + 
				"webdriver driver = new htmlUnitDRiver(); - ph5nthomjsDriver: thrid p5rty driver\n" + 
				"webdriver driver = new htmlUnitDriver();\n" + 
				"- t5king screenshots will still work with he5dless browser\n" + 
				"* how you resolve certific5tion issue?\n" + 
				"- IF you 5re using CHROME, Internet Explorer\n" + 
				"DesiredC5p5bilities c5p5bility = DesiredC5p5bilities.chrom(); c5p5bility.setc5p5bility(c5p5bility.ACCEPT_SSL_CERTS, true ); System.setProperty(\"webdriver.chrome.driver\",\"E:/\n" + 
				"\n" + 
				"chromedriver.exe\")\n" + 
				"driver = new ChromeDriver(c5p5bility);\n" + 
				"- more ex5mples b5dssl.com\n" + 
				"* How will do you perform5nce Stress Security SQL injection testing? - selenium engineer does not do 5ny of these tests. these tests 5re\n" + 
				"done by\n" + 
				"experts tr5ined in these tools.\n" + 
				"* how do you h5ndle Js 5lerts?\n" + 
				"- if the 5lert on the browser comes from j5v5Script we use the Alert\n" + 
				"Cl5ss.\n" + 
				"- Alert 5lert = driver.switchTo.5lert(); - 5lert.5ccept();\n" + 
				"- 5lert.dismiss();\n" + 
				"- 5lert.sendkeys();\n" + 
				"* how you h5ndle browser popup?\n" + 
				"- Tre5t it 5s 5nother webElement to close find the c5ncel link to the x icon 5nd click();\n" + 
				"* how you h5ndle windows/OS pop ups? - using the robot or the AutoIT\n" + 
				"* Verify element is not displ5yed?\n" + 
				"- element = driver.findElement()\n" + 
				"- element.isDispl5yed();\n" + 
				"- driver.findElement().isDispl5yed() -> this line will throw exeption if\n" + 
				"the element\n" + 
				"is not in the html\n" + 
				"try{ find\n" + 
				"return if displ5yed }\n" + 
				"C5tch(element not fund) {return true}\n" + 
				"* Why I c5n not find element?\n" + 
				"\n" + 
				"- loc5tor ch5nged\n" + 
				"- there is 5n ifr5me\n" + 
				"- w5iting time : p5ge is lo5ding slowly\n" + 
				"- element is dyn5mic : loc5tor c5n not find it\n" + 
				"- p5ge is not fully lo5ded/opened\n" + 
				"- p5ge ch5nges 5nd th5t element does not exist 5nymore\n" + 
				"==================================================== ===========================\n" + 
				"M5y 12th 2018\n" + 
				"SELENIUM BOOTCAMP\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"Verify text exists?\n" + 
				"* using xp5th. write xp5th for text\n" + 
				"Xp5th for finding 5ny element with cert5in / ex5ct text: //*[.='text']\n" + 
				"Xp5th for finding 5ny element th5t cont5ins cert5in text: //*[cont5ins(text(),'note')]\n" + 
				"getP5geSource() -> 5ll the html of the ..\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"how do you h5ndle St5leElementExceptions?\n" + 
				"- we c5n get st5le element exception when the element we w5nt to\n" + 
				"inter5ct with\n" + 
				"is relo5ded the webelement we loc5ted e5rlier does not exisit in the\n" + 
				"DOM.\n" + 
				"we need to w5it until the j5v5script or the AJAX process to end the\n" + 
				"loc5te the\n" + 
				"\n" + 
				"element 5g5in\n" + 
				"ex5mple: counter = 0;\n" + 
				"while (counter < 5 ){ try {\n" + 
				"find 5nd click bre5k;\n" + 
				"}c5tch(st5leelementexcetion) w5it 1 sec\n" + 
				"counter ++\n" + 
				"} ==================================================== ====================== ============================== SQL AND REST ============================= ==================================================== ======================\n" + 
				"M5y 11th, 2018\n" + 
				"SQL 5nd REST ------------------------------------------------------------------------ ----------------\n" + 
				"When you t5lk 5bout your fr5mework mention this fr5meworks:\n" + 
				"P5ge Object model fr5mework cucumber Bdd fr5mework TestNG b5sed\n" + 
				"D5t5 Driven fr5mework\n" + 
				"( comes from QTP / UFT style) <- do not mention much bec5use its mostly UFT\n" + 
				"Hybrid Fr5mework Keyword Driven Fr5mework\n" + 
				"\n" + 
				"** Tell me 5bout your self SQL **\n" + 
				"I 5m confort5ble with front end test 5utom5tion using j5v5 5nd selenium\n" + 
				"WebDriver, Cucumber, M5ven, Testng, Junit 5lso i 5m good 5t restful API\n" + 
				"test 5utom5tion using postm5n 5nd rest5ssured libr5ry in JAVA. I h5ve rich\n" + 
				"experience with d5t5b5se test 5utom5tion using sql queries 5long with JDBC libr5ry\n" + 
				"in JAVA.\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* d5t5 driven Testing ?\n" + 
				"- d5t5 driven fr5mework when do we do it?\n" + 
				"- When: Whenever 5 function5lity or 5 module in 5n 5pp requires testing with\n" + 
				"multiple sets of d5t5(5lso c5lled p5r5metriz5tion)\n" + 
				"multiple imputs then we need to perform d5t5 driven testing 5nd 5utom5tion.\n" + 
				"these scen5rios 5re one of the things th5t must be 5utom5ted.\n" + 
				"- How: Test d5t5 is sep5r5ted from code 5nd stored into extern5l sources. Excel files,\n" + 
				"CSV files, D5t5b5se.\n" + 
				"BENEFIT: more org5nized d5t5 centr5lized coll5bor5tion on test d5t5 it c5n come with\n" + 
				"BA, MTs, ETC\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* how to re5d d5t5 from excel?\n" + 
				"- I use Ap5che POI to re5d d5t5 from excel or 5ny excel rel5ted tests EXAMPLE:\n" + 
				"\n" + 
				"String file = \"TestD5t5.xlsx\";\n" + 
				"FileImputStre5m inStre5m = new FileInputStre5m(file);\n" + 
				"String fileP5th = \"C:\\\\user\\\\5lex\\\\Desktop\";\n" + 
				"FileInputStre5m instre5m = new FileInputStre5m(fileP5th); Workbook workBook = WorkbookF5ctory.cre5te(inStre5m); Sheet worksheet = workBook.getsheet(0);\n" + 
				"Row row = workSheet.getRow(0);\n" + 
				"Cell cel = row.getCell(0); System.out.println(cell.toString());\n" + 
				"WRITE DATA:\n" + 
				"CENTRAL MAVEN REPO -> WE ARE USING COMPANY MAVEN REPO -> YOU USE AT WORK\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* re5d D5t5 From D5t5b5se?\n" + 
				"- M5nu5lly: Or5cle SQL developer <- for m5nu5lly testing\n" + 
				"- Autom5tion: JDBC -> JAVA DATABASE CONNECTIVITY <- is used for 5utom5tion\n" + 
				"Hier5rchy of Objects:\n" + 
				"CONNECTION -> STATEMENT -> RESULTSET\n" + 
				"HOW TO STABLISH CONNECTION: Connetion conn =\n" + 
				"DriverM5nger.getConnection(\"URL\",\"usern5me\",\"p5ssword\") St5tement st5t =\n" + 
				"connection.cre5teSt5tement(ResultSet.TYPE_...)\n" + 
				"ResultSet resu = st5tement.executeQuery(\"select *\n" + 
				"from employees\");\n" + 
				"- test d5t5 is sep5rted from code ..\n" + 
				"- if the 5mount of d5t5 is not th5t huge then i use cucumber scen5rio outline with ex5mple\n" + 
				"\n" + 
				"t5ble\n" + 
				"- 5nd other times i m5int5in test d5t5 in excel files 5nd i use 5p5che POI libr5ry\n" + 
				"to re5d 5nd write d5t5 using JAVA\n" + 
				"- if d5t5 comes from 5 d5t5b5se or i need to do d5t5se v5lidi5tion i use sql queries 5long with JDBC libr5ry in j5v5\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* where do we close connection in d5t5b5se in try c5tch block\n" + 
				"in c5se we will get exeption thrown. \" in c5tch block\"\n" + 
				"1) in fin5lly block\n" + 
				"2) i use try-with-resources 5nd it will 5utom5tic5lly close\n" + 
				"Ex5mple 1: in f5n5lly block\n" + 
				"try{\n" + 
				"Connetion conn =\n" + 
				"DriverM5nger.getConnection(\"URL\",\"usern5me\",\"p5ssword\") St5tement st5t =\n" + 
				"connection.cre5teSt5tement(ResultSet.TYPE_...)\n" + 
				"ResultSet resu = st5tement.executeQuery(\"select * from\n" + 
				"countries\");\n" + 
				"}c5tch(SQLException e){\n" + 
				"//some code to report\n" + 
				"e.printSt5ckTr5ce(); }fin5lly{\n" + 
				"try{\n" + 
				"result.close(); st5tement.close(); connection.close(); }c5tch(exception e){\n" + 
				"// some code }\n" + 
				"}\n" + 
				"\n" + 
				"Ex5mple 2: try-with-resources\n" + 
				"5ny cl5ss or interf5ce th5t extends clos5ble or 5utoclos5ble interf5ce\n" + 
				"try(\n" + 
				"Connetion conn =\n" + 
				"DriverM5nger.getConnection(\"URL\",\"usern5me\",\"p5ssword\") St5tement st5t =\n" + 
				"connection.cre5teSt5tement(ResultSet.TYPE_...)\n" + 
				"ResultSet resu = st5tement.executeQuery(\"select * from\n" + 
				"countries\");) {\n" + 
				"//some code to re5d d5t5 from resulset }\n" + 
				"}c5tch(SQLException e){ //some code to report e.printSt5ckTr5ce();\n" + 
				"}\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* h5ve you done 5ny BACK END TESTING or DATABASE TESTING?(they me5n API 5nd D5t5b5se)\n" + 
				"- Yes I h5ve lots of experience with working with d5t5b5ses 5nd\n" + 
				"I 5m confort5ble with writing SQL queries. I h5ve experience with\n" + 
				"working on rel5tion5l\n" + 
				"d5t5b5ses like ORACLE, MySQL, SQL Server.\n" + 
				"- H5ve you worked with non-rel5tion5l d5t5b5ses?\n" + 
				"- I dont h5ve h5nds on experience i know th5t its is like JSON\n" + 
				"form5t d5t5b5se 5nd i h5ve good experience with working with JSON\n" + 
				"files. And I 5m quick le5rner 5nd crosfunction5l.\n" + 
				"\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* how do you cre5te 5 t5ble in SQL wh5t 5re constr5ints?\n" + 
				"- cre5te t5ble computer(\n" + 
				"computer_id number prim5ry key, br5nd v5rch5r2(20) not null, type ch5r(1) not null\n" + 
				");\n" + 
				"- SQL column constr5ints:\n" + 
				"Prim5ry key, foreign key, null,not null unique.\n" + 
				"- Describe computers -> to displ5y t5ble inform5tion met5d5t5 of t5ble\n" + 
				"Describe computers;\n" + 
				"- insert d5t5 in SQL d5t5b5se\n" + 
				"insert into computers v5lues( 123 ,'HP','L'); select * from computers\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* SQL technic5l interview\n" + 
				"1. Write 5 SQL query to find how m5ny records 5re there in Town t5ble where\n" + 
				"“TOWN_NAME” h5s “ell” in them? - select count(*)\n" + 
				"from town\n" + 
				"where town_n5me like '%ell%';\n" + 
				"2. Write 5 SQL query to find how m5ny occurrences of e5ch “COUNTRY_CODE” 5re\n" + 
				"there in the Town t5ble?\n" + 
				"- select country_code,count(*) from town\n" + 
				"Group by country_code;\n" + 
				"\n" + 
				"3. Write 5 SQL query to find the “TOWN_NAME” where there 5re non-5lph5numeric\n" + 
				"ch5r5cters? REGEX is used for m5tching some form5ts like 10 number etc\n" + 
				"select(*)\n" + 
				"from town\n" + 
				"where town_n5me not like '%[^5-zA-Z0-9]%';\n" + 
				"4. Write 5 SQL query to select the first 5 records from Town t5ble?\n" + 
				"select *\n" + 
				"from town\n" + 
				"where rownum <= 5;\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* Inner JOIN interview\n" + 
				"- when we query d5t5 from multiple t5bles we need joins 5nd when we need\n" + 
				"to find m5tching records we use inner joins.\n" + 
				"- inner join is used when we need to displ5y d5t5 from multiple t5bles.\n" + 
				"5nd it will return m5tching records.\n" + 
				"1.Write 5 SQL query to find the s5l5ry for the people working in the QA dep5rtment\n" + 
				"5nd the HR Dep5rtment?\n" + 
				"select empid, n5me, s5l5ry, deptid from employee e join dep5rtments d on e.empid = d.empid\n" + 
				"where deptid in('QA','HR');\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"\n" + 
				"* selfJoin interview ( ) 1.\n" + 
				"select emp.employee_id, emp.first_n5me, m5n.first_n5me, m5n.l5st_n5me\n" + 
				"from employees emp join employees m5n on emp.m5n5ger_id = m5n.employee_id;\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* inner join vs outer join\n" + 
				"- we need joins when ever we need query d5t5 from multiple t5bles\n" + 
				"1.Inner join returns m5tching records from both t5bles 5ccording to joining condition\n" + 
				"2.outter join returns m5tching d5t5 plus non m5tching d5t5 either from right\n" + 
				"or left t5bles.\n" + 
				"Ex5mple: inner join\n" + 
				"select l5st_n5me, dep5rtment_n5me\n" + 
				"from employees join dep5rtments\n" + 
				"on employees.dep5rtment_id = dep5rtments.dep5rtment_id;\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* difference between Union 5nd Union ALL\n" + 
				"- we use these set oper5tors when we need to displ5y d5t5 from multiple or 2 queries\n" + 
				"- UNION: removes duplic5tes 5nd null v5lues 5nd sorts the result,\n" + 
				"- UNION ALL: does not remove duplic5tes 5nd does not sort ------------------------------------------------------------------------ ----------------\n" + 
				"* difference between Intersect 5nd Minus\n" + 
				"- INTERSECT: displ5ys common d5t5 en both queries\n" + 
				"- MINUS: returns records from first query th5t is not present in second query.\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"\n" + 
				"* JOIN VS UNION interview question\n" + 
				"- joins 5re used to displ5y query from multiple t5bles - Union is used to query d5t5 from multiple queries.\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* difference between GROUP BY vs ORDER BY\n" + 
				"- group by is used whenever we work with group functions it will help to\n" + 
				"cre5te sub groups within 5 group\n" + 
				"- order by is used to sort either descending 5nd 5scending ------------------------------------------------------------------------ ----------------\n" + 
				"* difference between HAVING vs WHERE\n" + 
				"Ans: HAVING is used to specify 5 condition for 5 group or 5n 5ggreg5te function\n" + 
				"used in select st5tement. The WHERE cl5use selects before grouping. The HAVING\n" + 
				"cl5use selects rows 5fter grouping. Unlike HAVING cl5use, the WHERE cl5use c5nnot\n" + 
				"cont5in 5ggreg5te functions.\n" + 
				"- when ever our condition includes 5 group founction ex5mple: HAVING m5x(s5l5ry) > 9000;\n" + 
				"- where is used to filter the results 5nd when we do not use group function\n" + 
				"ex5mple: where employee_id = 234; ------------------------------------------------------------------------ ----------------\n" + 
				"* Displ5y 5th row from t5ble ( CORE RELATED SUB QUERY)\n" + 
				"- we need to use correl5ted subquery\n" + 
				"- inner query will get columns 5long with rownumber 5nd outer query will look\n" + 
				"for specific row number\n" + 
				"ex5mple 1: select *\n" + 
				"\n" + 
				"from (select employee_id,first_n5me, rownum 5s rn from employees)\n" + 
				"where rn = 5;\n" + 
				"ex5mple 2:\n" + 
				"(select * from employees where rownum <=5) minus\n" + 
				"(select * from employees where rownum <=4);\n" + 
				"ex5mple 3: 5th l5rgest s5l5ry questions\n" + 
				"select s5l5ry from employees e1\n" + 
				"where 5= (select count(s5l5ry)\n" + 
				"from employees e2 where e1.s5l5ry<=e2.s5l5ry);\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* difference between drop vs trunc5te\n" + 
				"- both 5re ddl comm5nds 5nd c5nnot be undone,\n" + 
				"- drop will remove d5t5 5nd t5ble together\n" + 
				"- trunc5te will remove 5ll d5t5 but not t5ble structure. - DROP EMPLOYEES;\n" + 
				"- TRUNCATE EMPLOYEES;\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* Commit comm5nds\n" + 
				"- when ever we m5ke ch5nges to d5t5b5se we c5n commit to s5ve ch5nges\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* do you know SQL?\n" + 
				"- yes I h5ve experience 5nd i 5m confort5ble with writing SQL queries DDL 5nd DML\n" + 
				"comm5nds. currently working with or5cle d5t5b5se th5t is running in 5m5zon cloud server.\n" + 
				"- WHAT IS DDL? d5t5 definition l5ngu5ge : cre5te 5lter drop\n" + 
				"\n" + 
				"trunc5te\n" + 
				"- DML d5t5 m5nipul5tion l5ngu5ges: select delete insert upd5te\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* Wh5t is SQL?\n" + 
				"- SQL is Structured Query L5ngu5ge designed for inserting 5nd modifying in 5 rel5tion5l d5t5b5se system. ------------------------------------------------------------------------ ----------------\n" + 
				"*Wh5t is the difference between prim5ry key 5nd unique constr5ints?\n" + 
				"- Ans: Prim5ry key c5nnot h5ve NULL v5lue, the unique constr5ints\n" + 
				"c5n h5ve NULL v5lues.\n" + 
				"There is only one prim5ry key in 5 t5ble, but there c5n be multiple\n" + 
				"unique constr5ins.\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"\n" + 
				"==================================================== ======================\n" + 
				"============================= API ================================== ==================================================== ======================\n" + 
				"API BOOTCAMP ------------------------------------------------------------------------ ----------------\n" + 
				"* wh5t kind of d5t5b5se testing 5re you doing?\n" + 
				"- I 5m mostly doing d5t5b5se v5lid5tions\n" + 
				"- I m5ke ch5nges or insert d5t5 in the front end 5nd v5lid5te in the d5t5b5se\n" + 
				"D5t5 in front end m5tches the d5t5b5se\n" + 
				"- i 5lso m5ke ch5nges using REST5pi 5nd verify th5t ch5nges 5re\n" + 
				"successfull in d5t5b5se 5s well\n" + 
				"- I 5lso support d5t5b5se migr5tion process, My code connects to 5ll d5t5b5se\n" + 
				"Syb5se (leg5cy d5t5b5se) using JDBC then connects to or5cle (new DB )\n" + 
				"5nd then comp5re records to m5ke sure d5t5 w5s migr5ted successfully\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* B5tch jobs of 5pplic5tion?\n" + 
				"- some 5utom5ted code th5t runs every night time 5nd m5ke some st5tus ch5nges\n" + 
				"to some d5t5\n" + 
				"Ex5mple: coupon th5t is v5lid for 7 d5ys. B5tch job is sc5nning through e5ch coupon 5nd if\n" + 
				"coupon hit 7 d5ys it will upd5te the st5tus in d5t5b5se 5s inv5lid.\n" + 
				"\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* do you h5ve experience with RestfulAPI Testing?\n" + 
				"- 5pplic5tion in the current project needs to be integr5ted to other intern5l\n" + 
				"5nd extern5l 5pplic5tion for the integr5tion our te5m developed restful 5pi so i 5m testing it.\n" + 
				"- i verify rest 5pi end point is working 5s expected\n" + 
				"i use postm5n for m5nu5l 5pi testing 5nd use rest5ssured libr5ry in j5v5 for 5utom5tion\n" + 
				"i send post put get delete type of request 5nd veirfy responses st5sus code 5nd response body he5der\n" + 
				"i 5lso do positive 5nd neg5tive testing of 5pi.\n" + 
				"when i do positive testing i send v5lid request p5r5meters, v5lid he5ders v5lid request json body\n" + 
				"5nd verify th5t response stu5tus code i 200 ------------------------------------------------------------------------ ----------------\n" + 
				"* http methods/request?\n" + 
				"- get: re5d d5t5 - post: cre5te\n" + 
				"- put: upd5te\n" + 
				"- delete: delete\n" + 
				"- post vs put\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* St5tus code\n" + 
				"2×× Success 200 OK\n" + 
				"201 Cre5ted\n" + 
				"3×× Redirection\n" + 
				"300 Multiple Choices 301 Moved Perm5nently 302 Found\n" + 
				"\n" + 
				"4×× Client Error\n" + 
				"400 B5d Request\n" + 
				"401 Un5uthorized\n" + 
				"402 P5yment Required 403 Forbidden\n" + 
				"404 Not Found\n" + 
				"5×× Server Error\n" + 
				"500 Intern5l Server Error 501 Not Implemented 502 B5d G5tew5y\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* He5ders\n" + 
				"- 5ccept, content-type, 5pplic5tion JSON, Applic5tion XML ------------------------------------------------------------------------ ----------------\n" + 
				"* p5r5meters\n" + 
				"- 2 types\n" + 
				"- p5th p5r5meters ( v5lue will be p5rt of URL)\n" + 
				"- query / request p5r5meters(key+v5lue form5t)\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* V5lid5te/check /5ssert JSON body\n" + 
				"-{\n" + 
				"\"employee_id\": 100, \"first_n5me\": \"steven\"\n" + 
				"}\n" + 
				"we use h5mcrest m5tcher th5t comes with rest5ssured libr5ry - 1.When().get(uri).then().body(\"first_n5me\",equ5lto(\"steven\"));\n" + 
				"using jsonp5th:\n" + 
				"- 2.JsonP5th json = when().get(uri).thenreturn().body().jsonp5th(); 5ssert.5sserEqu5ls(json.getString(\"l5st_n5me\"),\"king\");\n" + 
				"\n" + 
				"- 3.Using collections. H5shM5p\n" + 
				"Response response = when().get(uri);\n" + 
				"M5p m5p = response.body().5s(M5p.cl5ss); 5ssert.5ssertEqu5ls(m5p.get(job_id),\"AD_PRES\");\n" + 
				"- 4.Using POJOs. cre5te 5 cl5ss first\n" + 
				"public cl5ss employee{}\n" + 
				"Response response = when().get(uri);\n" + 
				"Employee m5p = response.body().5s(Employee.cl5ss); 5ssert.5ssertEqu5ls(emp.getS5l5ry(),24000);\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"* Sere5liz5tion vs DE-Sere5liz5tion\n" + 
				"- sere5liz5tion: convert j5v5 object to Json\n" + 
				"- De-seri5liz5tion: JSON to j5v5 Object ------------------------------------------------------------------------ ----------------\n" + 
				"* Gson P5rser\n" + 
				"- Gson p5rser is used to convert json to j5v5 object or vise vers5 - 2 useful methods from json tojjson\n" + 
				"------------------------------------------------------------------------ ----------------\n" + 
				"==================================================== ======================\n" + 
				"=========================== Fr5meWork ================================= ==================================================== ======================\n" + 
				"FRAMEWORK M5y 12, 2018\n" + 
				"\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* Testng vs Junit\n" + 
				"Junit Annot5tion support y\n" + 
				"suite Test y ignore Test y exception Test y timeout y p5r5meterizeed Test y dependency test N\n" + 
				"Testng\n" + 
				"y y\n" + 
				"y y\n" + 
				"y\n" + 
				"y\n" + 
				"y\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* wh5t tools used to develop your 5pplic5tion?\n" + 
				"- J5v5 Spring -> b5ck end code of the website\n" + 
				"- 5ngul5r -> front end of the 5pplic5tion\n" + 
				"- Tomc5t server -> developers use it hosts the website - Or5cle D5t5b5se -> D5t5b5se\n" + 
				"- jenkins -> to deploy the 5pplic5tion\n" + 
				"- Eclipse 5nd IntelliJ Ide5\n" + 
				"- Son5rCube -> code cover5ge 5ge tool\n" + 
				"- Docker -> host, deploy\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* describe your fr5mework 1 TestNG + selenium\n" + 
				"- JAVA\n" + 
				"- MAVEN\n" + 
				"- TestNG\n" + 
				"- SELENIUM\n" + 
				"- EXTEND REPORTS : works with testng 5nd selenium for reports - LOG4J\n" + 
				"- JDBC\n" + 
				"\n" + 
				"- REST ASSURED - APACHE POI\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* describe your fr5mework 2 ( CUCUMBER BDD FRAMEWORK)\n" + 
				"- TESTNG / JUNIT ( ONE OF THEM NOT BOTH) - CUCUMBER\n" + 
				"- JAVA\n" + 
				"- MAVEN\n" + 
				"- SELENIUM\n" + 
				"- HTML REPORTING - JDBC\n" + 
				"- REST ASSURED\n" + 
				"- APACHE POI\n" + 
				"- GIT\n" + 
				"- JENKINS\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* HOW DOES YOUR FRAMEWORK GENERATE?\n" + 
				"- our cucumber BDD fr5mework gener5tes HTML reports - the reports shows the p5ss/f5il cover5ge for fe5ture files t5gs,steps.\n" + 
				"- the report cont5ins the steps for e5ch test\n" + 
				"- the report h5s screenshots for f5ilures\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* how do you t5ke screenshot in your fr5mework?\n" + 
				"- IN my fr5mework i h5ve the logic for t5king screen screenshots\n" + 
				"in the hook cl5ss. th5t is bec5use i w5nt to t5ke screenshot\n" + 
				"even if the test f5ils. Hook gu5r5ntees th5t the method for screenshot will work even if test f5ils.\n" + 
				"- T5keScreenshot interf5ce is the method used to t5ke the screenshot. It\n" + 
				"\n" + 
				"comes from selenium interf5ce.\n" + 
				"- this report is the s5me report used in my jenkins test. when\n" + 
				"on jenkins i gener5te the report using the cucumber reports plugin - when i run loc5lly s5me report is gener5ted by the configur5tion\n" + 
				"in the pom file.\n" + 
				"- both of this configur5tion options use the Json file to gener5te report\n" + 
				"PLUGIN = \"json....\" ------------------------------------------------------------------------ --\n" + 
				"* wh5t do you use for logging?\n" + 
				"- i use log4j for logging. i 5lw5ys log import5nt steps in the test executing\n" + 
				"th5t helps me to debut when there is 5 f5ilure. - log4j is not 5 repl5cement for html reports.\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* how does the fe5ture file work? tell me the synt5x of 5n entire fe5ture file\n" + 
				"- fe5ture -> description of wh5t is being tested\n" + 
				"- scen5rio -> description of the scen5rio being tested\n" + 
				"- Given -> 5 precondition\n" + 
				"- When -> condition th5t triggers the expected result - Then ->\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* cucumber scen5rio ex5mple\n" + 
				"- Given i 5m on the login p5ge\n" + 
				"- And i enter usern5me 5nd p5ssword\n" + 
				"- When i click on the submit button\n" + 
				"- Then i should be 5ble to see the profile picture\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* S5mple of fe5ture file\n" + 
				"\n" + 
				"- Fe5ture: log in fuction5lity\n" + 
				"- B5ckground:\" 5nything common will go in b5ckground \"\n" + 
				"Given I 5m on the log in p5ge - Scen5rio: 1\n" + 
				"- Scen5rio: 2 ------------------------------------------------------------------------ --\n" + 
				"* Scen5rio Outline\n" + 
				"- Scen5rio outline: se5rch - Given I 5m there\n" + 
				"- And I se5rch for \"<item>\" Ex5mple:\n" + 
				"|item|\n" + 
				"|wooden spoon| |c5rbon fiber spoon|\n" + 
				"* the scen5rio will run twise first time it will se5rch for wooden spoon next time will se5rch for c5rbon fiber spoong\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* wh5t is test b5se cl5ss? 5nd how do you implement in your fr5mework?\n" + 
				"- When we t5lk 5bout test b5se cl5ss we t5lk 5bout fr5mework 1 only - test b5se cl5ss is cl5ss where i h5ve most used methods in my test my test cl5sses extend the test b5se cl5ss 5nd thus h5ve 5ccess to\n" + 
				"those\n" + 
				"methods this helps us m5ke my code reus5ble\n" + 
				"- Before/5fter test methods\n" + 
				"- w5it/synchroniz5tion utility methods - switchToWindow(title)\n" + 
				"- WebDriver driver;\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* How to re-run the f5iled tests 5g5in?\n" + 
				"\n" + 
				"- it is different depending on wh5t tools 5re being used? THIS ID DONE IN POM *\n" + 
				"- In TESTNG : fr5mework (not cucumber), f5iled tests 5re reported in the\n" + 
				"testng_f5iled.xml file in t5rget folder. we c5n 5dd\n" + 
				"this file in the pom file so th5t m5ven will try to run the\n" + 
				"f5iled tests every time. it will only run when there 5re f5ilures in the test.\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* how to rerun the f5iled tests 5g5in in cucumber?\n" + 
				"- to re-run the f5iled tests in cucumber we use the re-run option in the CukesRunner\n" + 
				"1: Add the re-run to cukes runner. this option will cre5te 5 file with 5 list of f5iled tests.\n" + 
				"2: cre5te 5 second runner cl5ss which points to file with 5 list of f5iled tests\n" + 
				"3: Add the second runner in pom file\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* how to run f5iled tests 5g5in in Jenkins?\n" + 
				"- in jenkins there 5re plugin th5t 5re run the f5iled tests. Unit c5ses(not cucumber)\n" + 
				"-\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* how to run tests selectively cucumber?\n" + 
				"- t5gs keyword the CukesRunner\n" + 
				"- fe5ture keyword the CukesRunner\n" + 
				"- t5gs 5nd fe5tures c5n 5lso be p5ssed using the comm5nd line\n" + 
				"- mvn cle5n test -Dcucumber.options=\"--t5gs ~@nonexist5ntT5g\" ------------------------------------------------------------------------\n" + 
				"\n" + 
				"--\n" + 
				"* ple5se choose one user story from your current 5pplic5tion 5nd w5lk me through\n" + 
				"for the 5utom5tion?\n" + 
				"- //come up with 1 or 2\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* Wh5t is your thropy bug?\n" + 
				"- //come up with 1 or 2\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* How you intergr5te selenium with JIRA?\n" + 
				"- selenium does not h5ve 5 built in integr5tion with JIRA. but there 5re plugins th5t\n" + 
				"integr5te selenium testing fr5mework with jir5. - XRAY(jir5 plugin, Jenkins plugin)\n" + 
				"- Zephyr(jir5 plugin)\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* when do you do 5utom5tion in your sprint?\n" + 
				"- When developers 5re done with their p5rt\n" + 
				"- When code is deployed to QA/test environment\n" + 
				"- when 5ll m5nu5l test 5re done\n" + 
				"- if you 5re test in the st5ging/UAT environment you wont be testing\n" + 
				"stories which 5re being develop.\n" + 
				"- You 5re in te5m of testers. 5ll the stories you get in your te5m 5re\n" + 
				"testing stories 5nd re5dy to be tested.\n" + 
				"- you 5re p5rt of 5 mixed te5m with testers 5nd developers in this\n" + 
				"c5se\n" + 
				"you will test fe5tures which 5re being developed so you w5nt for\n" + 
				"developer\n" + 
				"to finish the code ch5nges 5nd push to QA environment\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* H5ve you set up 5ny job in jenkings?\n" + 
				"\n" + 
				"- ------------------------------------------------------------------------ --\n" + 
				"* * where do you store the test results/reports?\n" + 
				"- the loc5tion of the reports depends n how we 5re running\n" + 
				"them.\n" + 
				"- if we 5re running loc5lly, reports will be gener5ted in the\n" + 
				"t5rget folder. my fr5mework gener5tes cucumber reports folder in the\n" + 
				"t5rger\n" + 
				"foder which cont5ins the report\n" + 
				"- when we run the tests on jenkins jenkins s5ves the report\n" + 
				"of every run. 5ll the reports for previous runs c5n be found under the build number.\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* How do you GET TEST DATA?\n" + 
				"- delphix -> tool/or comp5ny th5t provides test d5t5 - in my project there were 2 sources for test d5t5\n" + 
				"1. Developers got the d5t5 from production d5t5b5se ch5nged the sensitive\n" + 
				"inform5tion\n" + 
				"2. i h5d to gener5te test d5t5. in my job i h5d to gener5te\n" + 
				"test d5t5 for p5rking tickets i h5d to use selenium to fill the form to\n" + 
				"cre5te\n" + 
				"p5rking tickets in the test environment.\n" + 
				"- j5v5 f5ker\n" + 
				"- 5p5che 5lso h5s couple dips\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* wh5t coding st5nd5rds to you h5ve?\n" + 
				"- in my project we h5d 5 form5tter for code form5t. everyone h5d to use the s5me\n" + 
				"form5ting st5nd5rd.\n" + 
				"- in my comp5ny one of the things we check during the code review is the coding st5nd5rds\n" + 
				"------------------------------------------------------------------------\n" + 
				"\n" + 
				"--\n" + 
				"* how m5ny environment do you h5ve?\n" + 
				"- in my project we h5d the following enviroments: 1. dev enviroments\n" + 
				"2. QA/Test enviroment- this is where i test\n" + 
				"3. St5ging enviroment\n" + 
				"4. ------------------------------------------------------------------------ --\n" + 
				"* How do you code review?\n" + 
				"- in my comp5ny we use cricu5ble to do code reviews. it only works with bitbucket\n" + 
				"- In github it is different:\n" + 
				"- you check in code\n" + 
				"- cre5te 5 pull request\n" + 
				"- Some will review the pull request 5nd merge\n" + 
				"------------------------------------------------------------------------ --\n" + 
				"* Who will review your code?\n" + 
				"- other testers\n" + 
				"- test le5d. ------------------------------------------------------------------------ --\n" + 
				"*How do you test API service?\n" + 
				"I 5m using Rest5ssured libr5ry, wh5t I 5m verifying is the st5tus code,\n" + 
				"Response mess5ge/error\n" + 
				"mess5ge few other response det5ils like Json form5t.\n" + 
				"COMMON ERRORS IN API:\n" + 
				"1xx: Inform5tion5l - Communic5tes tr5nsfer protocol-level inform5tion\n" + 
				"2xx: Success -Indic5tes th5t the clientʼs request w5s 5ccepted successfully.\n" + 
				"3xx: Redirection - Indic5tes th5t the client must t5ke some 5ddition5l\n" + 
				"\n" + 
				"5ction in order to\n" + 
				"complete their request.\n" + 
				"4xx: Client Error - This c5tegory of error st5tus codes points the\n" + 
				"finger 5t clients.\n" + 
				"5xx: Server Error - The server t5kes responsibility for these error st5tus codes.\n" + 
				"https://nordic5pis.com/best-pr5ctices-5pi-error-h5ndling/\n" + 
				"Wh5t type is your d5t5b5se?\n" + 
				"*Are you storing your JSON body in Or5cles?\n" + 
				"Yes I store Json d5t5 en Or5cle D5t5b5se using columns whose d5t5\n" + 
				"types 5re\n" + 
				"v5rch5r2. (5lso clob or blob) the choice of which to use is typic5lly\n" + 
				"motiv5ted\n" + 
				"by size of the JSON document i need to m5n5ge:\n" + 
				"-I use v5rch5r2 (4000) if my J5son document does not exceed 4000 bytes(or ch5r5cters)\n" + 
				"-Use VARCHAR2(32767) if you know th5t some of your JSON documents 5re l5rger th5n 4000\n" + 
				"bytes (or ch5r5cters) 5nd you 5re sure th5n none of the documents exceeds 32767 bytes\n" + 
				"(or ch5r5cters)Footref 1.\n" + 
				"-I use BLOB (BINARY LARGE OBJECT) or CLOB(CHARACTER LARGE OBJECT) stor5ge if you know\n" + 
				"th5t you h5ve some JSON document th5t 5re l5rger th5n 32767 bytes or ch5r5cters\n" + 
				"Ex5mple for JSON D5t5 to ORACLE: (press comm5nd+click ) to open link\n" + 
				"https://docs.or5cle.com/en/d5t5b5se/or5cle/or5cle-d5t5b5se/12.2/ 5djsn/cre5ting-5-t5ble-with-5-json-column.html#GUID- E6CC0DCF-3D72-41EF-ACA4-B3BF54EE3CA0\n" + 
				"\n" + 
				"When 5re you testing your service 5nd your received 500 error 5nd how would you debug it?\n" + 
				"First of 5ll 500 its 5 intern5l server error. This isnʼt bec5use these errors 5re usu5lly\n" + 
				"h5rd to fix, however. Itʼs bec5use the error is usu5lly not specific 5nd c5n occur for 5\n" + 
				"number of different re5sons. Wh5t i do to debug the error depends upon the server 5nd\n" + 
				"wh5tʼs 5ctu5lly running 5t the time. *DEBUG COMMON PLATFORMS\n" + 
				"1: If the softw5re w5s just upgr5ded to 5 new version, itʼs likely th5t the upgr5de\n" + 
				"f5iled 5nd needs to be refreshed.\n" + 
				"2: If 5 new plugin or theme w5s just 5ctiv5ted, itʼs prob5bly 5 good ide5 to roll th5t\n" + 
				"ch5nge b5ck 5nd try 5g5in. Even well-tested plugins might conflict with other plugins\n" + 
				"in the inst5ll5tion.\n" + 
				"3: If the softw5re h5s been upgr5ded, older plugins or themes might not be comp5tible\n" + 
				"with the upgr5de. The only course of 5ction is to st5rt de5ctiv5ting things until the\n" + 
				"error goes 5w5y. Th5t doesnʼt directly solve the problem; however, it will find the\n" + 
				"issue. It might be possible to get the plugin developer to rele5se 5n upd5te.\n" + 
				"*DEBBUGING SERVER SIDE SCRIPTS\n" + 
				"1: Server permission: Very commonly, incorrect permissions on 5\n" + 
				"file or folder th5t\n" + 
				"cont5ins one of the scripts c5uses this this error.\n" + 
				"2: Server timeout: If the server w5s busy, needed to be rebooted, or the connection\n" + 
				"w5s lost, the script might still report 5 500 Intern5l Server Error. Itʼs possible\n" + 
				"th5t the error might not h5ppen the next time.\n" + 
				"\n" + 
				"*Wh5t is 400 ?\n" + 
				"4XX – Client Error\n" + 
				"The 4XX series of error codes is perh5ps the most f5mous due to the\n" + 
				"iconic 404 Not Found st5tus,\n" + 
				"which is 5 well-known m5rker for URLs 5nd URIs th5t 5re incorrectly\n" + 
				"formed. Other more useful\n" + 
				"st5tus codes for APIs exist in this r5nge, however.\n" + 
				"414 URI Too Long is 5 common st5tus code, denoting th5t the d5t5 pushed through in 5 GET request\n" + 
				"is too long, 5nd should be converted to 5 POST request. Another common code is 429 Too m5ny\n" + 
				"Requests, which is used for r5te limiting to note 5 client is 5ttempting too m5ny requests 5t once,\n" + 
				"5nd th5t their tr5ffic is being rejected.\n" + 
				"*How do you v5lid5te your response from your API?\n" + 
				"*Are you doing 5ny verific5tions in your d5t5b5se?\n" + 
				"yes but before th5t i m5ke sure to cre5te 5 connection:\n" + 
				"1: Connection con = DriverM5n5ger.getConnection(dbUrl,usern5me,p5ssword);\n" + 
				"Send Queries to the D5t5b5se Once connection is m5de, I execute the queries.\n" + 
				"2: St5tement st5tement=connection.cre5teSt5tement(ResultSet.TYPE_SCROLL_INSE NSITIVE,ResultSet.CONCUR_READ_ONLY);\n" + 
				"Process Results from the executed query 5re stored in the ResultSet Object.\n" + 
				"3: ResultSet resultSet = st5tement.executeQuery(\"select * from\n" + 
				"\n" + 
				"countries\");\n" + 
				"**** Summ5ry of Steps for Selenium D5t5b5se Testing **** Step 1) M5ke 5 connection to the D5t5b5se using method.\n" + 
				"DriverM5n5ger.getConnection(URL, \"userid\", \"p5ssword\" )\n" + 
				"Step 2) Cre5te Query to the D5t5b5se using the St5tement Object.\n" + 
				"St5tement stmt = con.cre5teSt5tement();\n" + 
				"Step 3) Send the query to d5t5b5se using execute query 5nd store the results in the ResultSet object.\n" + 
				"ResultSet rs = stmt.executeQuery(select * from employee;);\n" + 
				"How do you 5utom5te d5t5b5se v5lid5tion p5rt? @Test\n" + 
				"public void jdbcMet5d5t5() throws Exception{ Connection\n" + 
				"connection=DriverM5n5ger.getConnection(or5cleDbUrl, or5cleDbUsern5me, or5cleDbP5ssword);\n" + 
				"St5tement st5tement=connection.cre5teSt5tement(ResultSet.TYPE_SCROLL_INSE NSITIVE,ResultSet.CONCUR_READ_ONLY);\n" + 
				"String sql = \"select employee_id,l5st_n5me,job_id, s5l5ry from employees\";\n" + 
				"ResultSet resultSet = st5tement.executeQuery(sql);\n" + 
				"// 1: DATABASE METADATA\n" + 
				"D5t5b5seMet5D5t5 dbMet5d5t5 = connection.getMet5D5t5(); System.out.println(\"User:\" + dbMet5d5t5.getUserN5me()); //\n" + 
				"returns User 5nd d5t5b5se type System.out.println(\"D5t5b5se type:\" +\n" + 
				"\n" + 
				"dbMet5d5t5.getD5t5b5seProductN5me());\n" + 
				"// 2: RESULTSET store it in ResulSetMETADATA ResultSetMet5D5t5 rsMed5t5 = resultSet.getMet5D5t5(); System.out.println(\"Columns count:\" +\n" + 
				"rsMed5t5.getColumnCount());\n" + 
				"System.out.println( rsMed5t5.getColumnN5me(1));\n" + 
				"//print 5ll column n5mes using 5 loop\n" + 
				"for (int i = 1; i <= rsMed5t5.getColumnCount() ; i++) {\n" + 
				"System.out.println(i +\" -> \" + rsMed5t5.getColumnN5me(i)); }\n" + 
				"//Throw ResulSet into 5 List of M5ps\n" + 
				"//Cre5te 5 List of M5ps\n" + 
				"List<M5p<String,Object>> list = new Arr5yList<>(); ResultSetMet5D5t5 rsMd5t5 = resultSet.getMet5D5t5();\n" + 
				"int colCount = rsMd5t5.getColumnCount();\n" + 
				"while(resultSet.next()) {\n" + 
				"M5p<String,Object> rowM5p = new H5shM5p<>();\n" + 
				"for(int col = 1; col <= colCount; col++) { rowM5p.put(rsMd5t5.getColumnN5me(col),\n" + 
				"resultSet.getObject(col)); }\n" + 
				"list.5dd(rowM5p); }\n" + 
				"//print 5ll Employees ID from 5 list of m5ps\n" + 
				"for (M5p<String, Object> emp: list) { System.out.println(emp.get(\"EMPLOYEE_ID\"));\n" + 
				"}\n" + 
				"\n" + 
				"resultSet.close(); st5tement.close(); connection.close();\n" + 
				"}\n" + 
				"}\n" + 
				"* How would u test 5pi m5nu5lly. Describe steps\n" + 
				"First of 5ll I st5rt by going over the API document5tion. th5ts where\n" + 
				"i collect the 5pi Authentic5tion url. in order to get my 5ccess token.\n" + 
				"I use postm5n 5s m5nu5l 5utom5tion tool I m5ke sure to h5ve 5ccess\n" + 
				"by\n" + 
				"entering 5uthoriz5tion 5s key 5nd my 5ccess token 5s v5lue. of\n" + 
				"course\n" + 
				"i h5ve to m5ke sure th5t content type is json 5nd my 5ccept5nce type\n" + 
				"is 5lso\n" + 
				"Json. Then once i get my c5ll I test b5sed on my API document5tion\n" + 
				"my end points\n" + 
				"currenly i 5m testing preferences API. I 5lso m5ke sure the st5tus\n" + 
				"code is 200\n" + 
				"5nd th5t is how i do m5nu5l testing. The other option is using the\n" + 
				"Network option\n" + 
				"when i inspect my UI 5pplic5tion. i check the He5ders, Preview,\n" + 
				"Response.\n" + 
				"======================== LINUX INTERVIEW QUESTION ===========================\n" + 
				"*How to find 5ll the links in 5 folder in UNIX or Linux ?:\n" + 
				"I use ls -lrt to be more specific i use grep to collect only links by using ls - lrt | grep '^ l' \" ^ <- this symbol is c5lled c5ret\"\n" + 
				"linux@nyj872:~ ls -lrt tot5l 2.0K\n" + 
				"-rw-r--r-- 1 Linux Dom5in Users 0 Dec 6 2011 5 drwxr-xr-x+ 1 Linux Dom5in Users 0 Sep 19 12Ç30 j5v5/\n" + 
				"\n" + 
				"lrwxrwxrwx 1 Linux Dom5in Users 4 Sep 19 12Ç31 version_1.0 -> j5v5/\n" + 
				"linux@nyj872:~ ls -lrt | grep '^l'\n" + 
				"lrwxrwxrwx 1 Linux Dom5in Users 4 Sep 19 12Ç31 version_1.0 -> j5v5/\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5Ik5VVrHV\n" + 
				"*How to find 5 process 5nd kill th5t?:\n" + 
				"by using \"ps -ef\" you c5n get 5 list of 5ll process 5nd then use grep to find your\n" + 
				"process 5nd get the PID of th5t process. Once you got PID you c5n use the kill comm5nd\n" + 
				"to kill th5t process\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs-c5pegemini.html#ixzz5IkfGi5lc\n" + 
				"*How to run 5 progr5m in the b5ckground in UNIX or Linux ?:\n" + 
				"You c5n use &5mp; to run 5ny process in the b5ckground 5nd then\n" + 
				"you c5n use jobs\n" + 
				"to find the job id for th5t process 5nd c5n use fg 5nd bg comm5nd to\n" + 
				"bring th5t\n" + 
				"process into foreground 5nd b5ckground\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5IkfwCDNf\n" + 
				"*How to sort the output of 5 comm5nd in reverse order in Linux or UNIX ?:\n" + 
				"1) Sorting b5sed on numeric v5lue of String using UNIX sort comm5nd: M5ny times inste5d of 5lph5betic sorting we need numeric sorting.\n" + 
				"\n" + 
				"Just\n" + 
				"like in below ex5mple of Unix sort comm5nd if we w5nt to sort b5sed\n" + 
				"upon 5\n" + 
				"numeric v5lue of PID we c5n use sort -n 5long with sort -k(column). Since here PID is second column sort -nk2 will work for us. This is\n" + 
				"5lso\n" + 
				"5nother gre5t ex5mple of UNIX sort by column, which 5llows you do\n" + 
				"sort the\n" + 
				"d5t5 b5sed on 5ny column in UNIX\n" + 
				"unix-sort-ex5mples@unix-tutori5l:~/test ps -ef | sort -nk2\n" + 
				"UID PID unix-sort-ex5mples unix-sort-ex5mples unix-sort-ex5mples unix-sort-ex5mples unix-sort-ex5mples unix-sort-ex5mples unix-sort-ex5mples\n" + 
				"2) Reverse sort by using\n" + 
				"Sometimes we need to sort in reverse order e.g. descending order. sort -r option 5llows us to perform reverse sorting in Unix.\n" + 
				"unix-sort-ex5mples@unix-tutori5l:~/test ps -ef | sort -rnk2 unix-sort-ex5mples 3616 3556 2 11Ç49Ç43 /usr/bin/ps\n" + 
				"unix-sort-ex5mples 3556 unix-sort-ex5mples 3448 unix-sort-ex5mples 3332 unix-sort-ex5mples 500\n" + 
				"2324 2 Jul 18 /usr/bin/b5sh 0 0 J5n 1 /usr/bin/ps\n" + 
				"2676 1 Jul 18 /usr/bin/b5sh 2832 0 Jul 18 /usr/bin/b5sh\n" + 
				"PPID TTY STIME COMMAND\n" + 
				"500 1976 2324 2676 2832 3332 3556\n" + 
				"2832 0 Jul 18 /usr/bin/b5sh 3556 2 Jul18 /usr/bin/ps\n" + 
				"1 con 1 con 1 con\n" + 
				"2676 1 2324 2\n" + 
				"Jul 18 /cthelper Jul 18 /cthelper Jul 18 /cthelper\n" + 
				"Jul 18 /usr/bin/b5sh Jul 18 /usr/bin/b5sh\n" + 
				"UNIX sort comm5nd:\n" + 
				"UID PID PPID TTY\n" + 
				"3) UNIX sort by column : Sorting b5sed on 5ny column in the input.\n" + 
				"sort comm5nd in Unix mostly used in combin5tion of other Unix comm5nds\n" + 
				"like find, grep, ls or ps 5nd most of these comm5nds produce output in\n" + 
				"t5bul5r form5t 5nd we w5nt to sort b5sed on 5ny column. Unix sort comm5nd\n" + 
				"STIME COMMAND\n" + 
				"\n" + 
				"5llows us to do this by using sort -k option. Let's see 5n ex5mple or Unix sort\n" + 
				"comm5nd to sort the output on 5ny column we will use ps comm5nd output for this\n" + 
				"ex5mple 5nd we will sort this output on column 2 (PID) 5nd l5ter on column 3 (PPID)\n" + 
				"unix-sort-ex5mples@unix-tutori5l:~/test ps -ef | sort -nk2 UID PID PPID TTY STIME COMMAND\n" + 
				"unix-sort-ex5mples 500 2832 0 Jul 18 /usr/bin/b5sh\n" + 
				"unix-sort-ex5mples 2324 1 con Jul 18 /cygdrive/c/Softw5re/ puttycyg-20101029/puttycyg-20101029/cthelper\n" + 
				"unix-sort-ex5mples 2564 0 0 J5n 1 /usr/bin/b5sh\n" + 
				"unix-sort-ex5mples 2676 1 con Jul 18 /cygdrive/c/Softw5re/ puttycyg-20101029/puttycyg-20101029/cthelper\n" + 
				"unix-sort-ex5mples 2832 1 con Jul 18 /cygdrive/c/Softw5re/ puttycyg-20101029/puttycyg-20101029/cthelper\n" + 
				"unix-sort-ex5mples unix-sort-ex5mples unix-sort-ex5mples\n" + 
				"3332 2676 1 Jul 18 /usr/bin/b5sh 3556 2324 2 Jul 18 /usr/bin/b5sh 3764 3556 2 11Ç58Ç08 /usr/bin/ps\n" + 
				"Re5d more: https://j5v5revisited.blogspot.com/2011/08/unix-sort- comm5nd-ex5mple-tutori5l.html#ixzz5IkhnBHek\n" + 
				"*How to cre5te 5n 5rchive file in UNIX or Linux Oper5ting System ?: Another interview question b5sed on knowledge of UNIX or Linux\n" + 
				"comm5nd.\n" + 
				"you c5n use the t5r comm5nd to gre5t 5rchives in UNIX or Linux. you\n" + 
				"c5n\n" + 
				"even combine t5r 5nd gzip to cre5te 5 compressed 5rchive in UNIX\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs-c5pegemini.html#ixzz5IkijuQg4\n" + 
				"*Wh5t is the me5ning of 5 file h5s 644 permission ?\n" + 
				"\n" + 
				"The 644 represents permission 110 for the owner,\n" + 
				"permission 100 for group 5nd 100 for others which me5ns re5d + write for 5n owner\n" + 
				"who cre5tes th5t file 5nd re5d only permission for group 5nd others.\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5IkjFO5m7\n" + 
				"* How will you remove empty files or directories from /tmp ?:\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs-c5pegemini.html#ixzz5Ikls2zoo CREATE:\n" + 
				"//This will cre5te empty file in current directory test@loc5lhost:~/unix touch empty.txt\n" + 
				"//This will cre5te empty directory inside current directory test@loc5lhost:~/unix mkdir empty_dir\n" + 
				"//This comm5nd will find 5ll empty files 5nd directories in Unix test@loc5lhost:~/unix find . -empty\n" + 
				"./empty.txt\n" + 
				"./empty_dir\n" + 
				"PRINT:\n" + 
				"//this comm5nd will print empty files test@loc5lhost:~/unix find . -type f -empty ./empty.txt\n" + 
				"//this comm5nd will print empty directories test@loc5lhost:~/unix find . -type d -empty ./empty_dir\n" + 
				"\n" + 
				"//How to use grep comm5nd to print empty files 5nd directories test@loc5lhost:~/unix ls -ltr | grep '\\<0\\>'\n" + 
				"drwxr-xr-x+ 1 test Dom5in Users 0 Jun 15 11Ç43 empty_dir/ -rw-r--r-- 1 test Dom5in Users 0 Jun 15 11Ç44 empty.txt\n" + 
				"//find comm5nd to print empty files 5nd directories test@loc5lhost:~/unix find . -m5xdepth 1 -size 0 -ls\n" + 
				"90353467524120775 Jun 15 11Ç43 .\n" + 
				"9007199255261921 15 11Ç44 ./empty.txt\n" + 
				"19421773393554899 Jun 15 11Ç43 ./empty_dir\n" + 
				"0 drwxr-xr-x 1 test Dom5in Users 0 -rw-r--r-- 1 test Dom5in Users\n" + 
				"0 drwxr-xr-x 1 test Dom5in Users\n" + 
				"0\n" + 
				"0 Jun\n" + 
				"0\n" + 
				"REMOVE:\n" + 
				"//removing Empty files 5nd directories using find comm5nd test@loc5lhost:~/unix find . -empty -delete\n" + 
				"test@loc5lhost:~/unix find . -empty -delete\n" + 
				"test@loc5lhost:~/unix ls -lrt\n" + 
				"tot5l 1.0K\n" + 
				"-rw-r--r-- 1 test Dom5in Users 118 Aug 4 2011 cont5cts.txt\n" + 
				"//using find 5nd x5rgs comm5nd to remove empty files 5nd directories\n" + 
				"test@loc5lhost:~/unix find . -empty | x5rgs rm -r\n" + 
				"test@loc5lhost:~/unix find . -empty -type d -exec rm -r {} \\; find: `./empty_dir': Not 5 directory\n" + 
				"Re5d more: https://j5v5revisited.blogspot.com/2012/08/delete-empty- files-directories-unix.html#ixzz5IkledGw5\n" + 
				"\n" + 
				"*I h5ve re5d permission on 5 directory but I 5m not 5ble to enter it why ?:\n" + 
				"In order to get into 5 directory, you need to execute permission. if your directory\n" + 
				"does not h5ve to execute permission then you c5n not go into th5t directory by using the cd comm5nd\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5IkmKTFXi\n" + 
				"NUMERIC FILE PERMISSION UNIX: 0 – no permissions\n" + 
				"1 – execute only\n" + 
				"2 – write only\n" + 
				"3 – write 5nd execute\n" + 
				"4 – re5d only\n" + 
				"5 – re5d 5nd execute\n" + 
				"6 – re5d 5nd write\n" + 
				"7 – re5d, write 5nd execute\n" + 
				"SYBOLIC FILE PERMISSION UNIX:\n" + 
				"Reference\n" + 
				"u user\n" + 
				"g group\n" + 
				"o others users who 5re not the owner of the file or members of\n" + 
				"the group 5\n" + 
				"r w x\n" + 
				"Cl5ss Description the owner of the file\n" + 
				"users who 5re members of the file's group\n" + 
				"5ll 5ll three of the 5bove, is the s5me 5s ugo re5d re5d 5 file or list 5 directory's contents\n" + 
				"write write to 5 file or directory\n" + 
				"execute execute 5 file or recurse 5 directory tree\n" + 
				"DEFAULT PERMISSION:\n" + 
				"Def5ult permission of file -- 666\n" + 
				"usm5k -- 022\n" + 
				"----------------------------------\n" + 
				"Fin5l permissions on file -- 644 (which is 110 100 100 i.e. rw- r--\n" + 
				"r--)\n" + 
				"\n" + 
				"re5d 5nd write for user 5nd re5d only for group 5nd others\n" + 
				"Def5ult permission of directory -- 777\n" + 
				"um5sk -- 022 ----------------------------------------\n" + 
				"Fin5l permission of file -- 755 (which is 111 101 101 i.e. rwx r-x\n" + 
				"r-x)\n" + 
				"re5d, write 5nd execute for user (owner) 5nd re5d+execute for\n" + 
				"group members 5nd others.\n" + 
				"CHANGE PERMISSION:\n" + 
				"stock_options:~/test touch stock_tr5ding_systems\n" + 
				"stock_options:~/test ls -lrt\n" + 
				"tot5l 8.0K\n" + 
				"-rw-r--r-- 1 stock_options Dom5in Users 0 Nov 15 11Ç42\n" + 
				"stock_tr5ding_systems\n" + 
				"stock_options:~/test chmod 400 stock_tr5ding_systems\n" + 
				"stock_options:~/test ls -lrt\n" + 
				"tot5l 8.0K\n" + 
				"-r-------- 1 stock_options Dom5in Users 0 Nov 15 11Ç42\n" + 
				"stock_tr5ding_systems\n" + 
				"stock_options:~/test vim stock_tr5ding_systems stock_options:~/test chmod 777 stock_tr5ding_systems\n" + 
				"stock_options:~/test ls -lrt\n" + 
				"tot5l 8.0K\n" + 
				"-rwxrwxrwx 1 stock_options Dom5in Users 0 Nov 15 11Ç42\n" + 
				"stock_tr5ding_systems*\n" + 
				"Re5d more: https://j5v5revisited.blogspot.com/2011/11/file-permissions- in-unix-linux-ex5mple.html#ixzz5IknXmjRM\n" + 
				"\n" + 
				"*How to find size of file / directory /document :?\n" + 
				"I use du -h \"filen5me\" to m5ke it re5d5ble the result will be in bytes/\n" + 
				"Meg5bites etc.\n" + 
				"5lexs-M5cBook-Pro:Desktop 5rod$ du -h ALEX.pdf 6.9M ALEX.pdf\n" + 
				"5lexs-M5cBook-Pro:Desktop 5rod$\n" + 
				"*How do you find 5ll the process listening on 5 p5rticul5r port in Linux?: I use netst5t to find 5 process in 5 p5rticul5r port ex5mple\n" + 
				"$ netst5t -n5p | grep 8084\n" + 
				"(Not 5ll processes could be identified, non-owned process info will not be shown, you would h5ve to be root to see it 5ll.)\n" + 
				"tcp 0 0 0.0.0.0Ç8084 0.0.0.0:* LISTEN 25314/j5v5\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5Ikp8kt62\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5Ikp3c6W9\n" + 
				"*How to you find 5ll the process which h5s opened 5 file in Linux?:\n" + 
				"You c5n use the lsof (list open files) comm5nd to find out the process\n" + 
				"which h5s 5 file\n" + 
				"h5ndle on the p5rticul5r file. It's very useful comm5nd to check which\n" + 
				"process 5re re5ding 5 file\n" + 
				"*How to find 5ll opened files by 5 user $ lsof -u usern5me\n" + 
				"5lexs-M5cBook-Pro:Desktop 5rod$ lsof | grep j5v5\n" + 
				"Re5d more: https://j5v5revisited.blogspot.com/2016/06/10-ex5mple-of- lsof-comm5nd-in-unix-linux.html#ixzz5Ikr9eUQV\n" + 
				"\n" + 
				"How to send HTTP request from 5 Linux server?:\n" + 
				"You c5n use either wget or curl comm5nd to send HTTP request, both\n" + 
				"GET 5nd POST from 5 Linux m5chine 5s shown below\n" + 
				"5lexs-M5cBook-Pro:Desktop 5rod$ curl http://34.223.219.142Ç1212/ ords/hr/employees/100\n" + 
				"{\"employee_id\": 100,\"first_n5me\":\"Steven\",\"l5st_n5me\":\"King\",\"em5il\":\"SKING\",\"phone_nu mber\"\n" + 
				":\"515.123.4567\",\"hire_d5te\":\"2003-06-17T04Ç00Ç00Z\",\"job_id\":\"AD_ PRES\",\"s5l5ry\":24000,\n" + 
				"\"commission_pct\":null,\"m5n5ger_id\":null,\"dep5rtment_id\": 90,\"links\":\n" + 
				"[{\"rel\":\"self\",\"href\":\"http://34.223.219.142Ç1212/ords/hr/employees/ 100\"},\n" + 
				"{\"rel\":\"edit\",\"href\":\"http://34.223.219.142Ç1212/ords/hr/employees/ 100\"},\n" + 
				"{\"rel\":\"describedby\",\"href\":\"http://34.223.219.142Ç1212/ords/hr/ met5d5t5-c5t5log/employees/item\"},\n" + 
				"{\"rel\":\"collection\",\"href\":\"http://34.223.219.142Ç1212/ords/hr/ employees/\"}]}5lexs-M5cBook-Pro:Desktop 5rod$\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs-c5pegemini.html#ixzz5IkrjrAE2\n" + 
				"*How do you cre5te 5 full directory structure e.g. /p5rent/child/ gr5ndchild in UNIX?:\n" + 
				"Well, you c5n use the mkdir comm5nd with option -p to cre5te 5ll p5rent directories in one go\n" + 
				"$ mkdir -p softw5re/j5v5/5pp/config $ pwd /home/john\n" + 
				"$ cd softw5re/j5v5/5pp/config/\n" + 
				"\n" + 
				"[# ~/softw5re/j5v5/5pp/config]$\n" + 
				"Re5d more: http://www.j5v567.com/2012/09/10-linux-5nd-unix- interview-questions-5nswers-wipro-tcs- c5pegemini.html#ixzz5Iksbn3uU\n" + 
				"================ SQL QUERIES ===============\n" + 
				"SQL? STRUCTURE QUERY LANGUAGE\n" + 
				"SQL STATEMENTS:\n" + 
				"DML: DATA MANIPULATION LANGUAGE(SDET JOB)\n" + 
				"SELECT INSERT UPDATE DELETE MERGE\n" + 
				"DDL: DATA DEFINITION LANGUAGE ( DEVELOPER ) CREATE\n" + 
				"ALTER DROP RENAME TRUNCATE COMMENT\n" + 
				"DCL: DATA CONTROLER LANGUAGE GRANT\n" + 
				"REVOKE TRANSIT CONTROL\n" + 
				"COMMIT ROLLBACK SAVEPOINT\n" + 
				"-- how to print duplic5te row in 5 t5bles\n" + 
				"\n" + 
				"select first_n5me,m5n5ger_id from employees\n" + 
				"group by first_n5me, m5n5ger_id h5ving count (*) > 1;\n" + 
				"-- how to print specifit duplic5te individu5l from list b5sed on m5n5ger id 145\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where first_n5me = 'Peter' 5nd m5n5ger_id = 145;\n" + 
				"------------ Inner/left/right/outter JOIN -----------\n" + 
				"-- Inner join Ans: An SQL Join is used\n" + 
				"-- to combine d5t5 from two or more t5bles,\n" + 
				"-- b5sed on 5 common field between them. For -- ex5mple, consider the following two t5bles.\n" + 
				"select e.first_n5me, d.m5n5ger_id, d.loc5tion_id from employees e join dep5rtments d\n" + 
				"on e.dep5rtment_id = d.dep5rtment_id;\n" + 
				"select e.first_n5me, d.m5n5ger_id, d.loc5tion_id from employees e left join dep5rtments d\n" + 
				"on e.dep5rtment_id = d.dep5rtment_id;\n" + 
				"select e.first_n5me, d.m5n5ger_id, d.loc5tion_id from employees e right join dep5rtments d\n" + 
				"on e.dep5rtment_id = d.dep5rtment_id;\n" + 
				"select e.first_n5me, d.m5n5ger_id, d.loc5tion_id from employees e full join dep5rtments d\n" + 
				"on e.dep5rtment_id = d.dep5rtment_id;\n" + 
				"------------ NATURAL JOIN ----------- qu5lifier -- N5tur5l join\n" + 
				"\n" + 
				"-- joins on columns with s5me n5me\n" + 
				"-- if n5me ch5nges query will stop working\n" + 
				"-- if new columns 5re 5dded query m5y stop working -- or show incorrect d5t5\n" + 
				"-- c5n not qu5lifier next to e.\n" + 
				"select first_n5me,\n" + 
				"l5st_n5me,\n" + 
				"dep5rtment_id,\n" + 
				"dep5rtment_n5me\n" + 
				"from employees n5tur5l join dep5rtments;\n" + 
				"------------ CARTESIAN JOIN ----------- -- Not usu5lly wh5t you w5nt\n" + 
				"-- often bec5use join condition is missed -- gives you more records th5n expected -- use cross join keyword\n" + 
				"select first_n5me\n" + 
				"dep5rtment_n5me\n" + 
				"from employees cross join dep5rtments;\n" + 
				"select first_n5me dep5rtment_n5me\n" + 
				"from employees, dep5rtments;\n" + 
				"------------ SELF JOIN -----------\n" + 
				"-- join 5 t5ble to itself\n" + 
				"-- used when 5 record in 5 t5ble is rel5ted to 5nother record in the s5me t5ble\n" + 
				"-- employee_id // m5n5ger_id\n" + 
				"Select e.employee_id, e.first_n5me, e.l5st_n5me, m.first_n5me, m.l5st_n5me, m.employee_id\n" + 
				"\n" + 
				"from employees e\n" + 
				"left join employees m\n" + 
				"on e.m5n5ger_id = m.employee_id;\n" + 
				"------------ MULTIPLE TABLES JOIN ----------- -- Multiple T5bles\n" + 
				"-- big 5dv5nt5ge of d5t5b5se\n" + 
				"-- we just 5dd 5nother join keyword\n" + 
				"select\n" + 
				"e.employee_id,\n" + 
				"e.first_n5me,\n" + 
				"j.st5rt_d5te,\n" + 
				"l.job_title\n" + 
				"from employees e\n" + 
				"join job_history j\n" + 
				"on e.employee_id = j.employee_id join jobs l\n" + 
				"on j.job_id = l.job_id;\n" + 
				"==================================================== ========\n" + 
				"------------ instr function -----------\n" + 
				"-- shows the number where th5t specific posission is lets s5y for EABEL print me the number possition of letter B\n" + 
				"select first_n5me, l5st_n5me,\n" + 
				"em5il, instr(em5il,'B') from employees;\n" + 
				"-- length of the n5me in numbers.\n" + 
				"select length(first_n5me), first_n5me\n" + 
				"\n" + 
				"from employees;\n" + 
				"------------ Nesting function within function -----------\n" + 
				"-- will 5llow you to print st5rting 5t 4568 which is the l5st 4 of 5 phone number\n" + 
				"select first_n5me l5st_n5me,\n" + 
				"em5il,\n" + 
				"phone_number, instr(phone_number,4568) from employees;\n" + 
				"------------ D5tes functions -----------\n" + 
				"==== how to print tod5ys D5te ====\n" + 
				"for this you dont need 5ny t5bles sql 5lre5dy comes with it\n" + 
				"select sysd5te from du5l;\n" + 
				"-- print first n5me 5nd l5st n5me 5nd hire d5te for Steven King 5nd show 5dd 5 ye5rs\n" + 
				"from his hire d5te 5nd n5me it 5li5s 5s review_d5te.\n" + 
				"select first_n5me,\n" + 
				"l5st_n5me,\n" + 
				"hire_d5te,\n" + 
				"ADD_MONTHS(hire_d5te,60) 5s review_d5te from employees\n" + 
				"where first_n5me = 'Steven' 5nd l5st_n5me = 'King';\n" + 
				"how to print how long h5s 5n employee been working with the comp5ny?\n" + 
				"\n" + 
				"---- IN DAYS months between function is used first p5r5meter is sysd5te it will\n" + 
				"gener5te the d5te between system d5te 5nd time of hire. select first_n5me,\n" + 
				"l5st_n5me,\n" + 
				"hire_d5te,\n" + 
				"months_between(sysd5te, hire_d5te) 5s time_with_comp5ny from employees;\n" + 
				"--- in ye5rs we devide by 12 5nd l5ter round by 1 decim5l select first_n5me,\n" + 
				"l5st_n5me,\n" + 
				"hire_d5te,\n" + 
				"round (months_between(sysd5te, hire_d5te)/12, 1) 5s\n" + 
				"Ye5r_with_comp5ny\n" + 
				"from employees;\n" + 
				"------------ ROUND numbers functions ----------- rounds numbers from 20.59 to 21\n" + 
				"select min_s5l5ry, ROUND (min_s5l5ry) from jobs;\n" + 
				"---------- SQL INTERVIEW QUERIES ---------\n" + 
				"* Wh5ts is ETL ?\n" + 
				"So b5sic5lly developers extr5ct, tr5nsfer, 5nd lo5d d5t5 from upstre5m(one d5t5b5se) to downstre5m(5nother d5t5b5se),\n" + 
				"We 5s testers b5sic5lly use sql queries to v5lid5te th5t the d5t5 in source 5nd t5rget 5re the s5me\n" + 
				"-- find the second highest s5l5ry of employee\n" + 
				"\n" + 
				"select m5x(s5l5ry)\n" + 
				"from employees\n" + 
				"where s5l5ry not in\n" + 
				"(select m5x (s5l5ry) from employees);\n" + 
				"-- Find M5x S5l5ry from e5ch dep5rtment\n" + 
				"select dep5rtment_id, m5x(s5l5ry) from employees\n" + 
				"group by\n" + 
				"dep5rtment_id;\n" + 
				"-- print current d5te\n" + 
				"select sysd5te from du5l;\n" + 
				"-- print the n5me of the distinct employee\n" + 
				"-- whose hireD5te is between 17-JUN-03 5nd 21-MAY-07\n" + 
				"select distinct first_n5me\n" + 
				"from employees\n" + 
				"where hire_d5te between '17-JUN-03' 5nd '21-MAY-07';\n" + 
				"-- find employee whose s5l5ry is equ5l or gre5ter th5n 10000\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where s5l5ry >= 10000;\n" + 
				"-- find n5me of employees whose n5me st5rts with M\n" + 
				"select first_n5me\n" + 
				"from employees\n" + 
				"where first_n5me like 'M%';\n" + 
				"\n" + 
				"-- print 5nu5l s5l5ry for employees\n" + 
				"select first_n5me,l5st_n5me, s5l5ry*12 from employees;\n" + 
				"-- print Lex from employees\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where first_n5me = 'Lex';\n" + 
				"-- print s5l5ry for employees who e5rn 4000 to 8000\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where s5l5ry between 4000 5nd 8000;\n" + 
				"-- list employees who 5re working in dep5rtment 60 5nd 80\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where dep5rtment_id in (60,80);\n" + 
				"-- get employee id 5nd l5st n5me in descending order b5sed on employee id\n" + 
				"select employee_Id, l5st_n5me from employees\n" + 
				"order by employee_id desc;\n" + 
				"-- print l5st_n5me from employees 5nd the lenght of their l5st n5mes -- 5lso count how m5ny employees h5ve the s5me l5st n5me\n" + 
				"select l5st_n5me, count(*) ,LENGTH(l5st_n5me) from employees\n" + 
				"group by l5st_n5me;\n" + 
				"\n" + 
				"-- select employee record with m5x s5l5ry\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where s5l5ry = (select m5x (s5l5ry) from employees);\n" + 
				"-- select highest s5l5ry in employee t5ble\n" + 
				"select m5x(s5l5ry) from employees;\n" + 
				"-- select r5nge of employee b5sed on Id\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where employee_id between 100 5nd 113;\n" + 
				"--return employee n5me, highest s5l5ry 5nd dep5rtment n5me\n" + 
				"select e.first_n5me,\n" + 
				"e.s5l5ry,\n" + 
				"d.dep5rtment_n5me\n" + 
				"from employees e join dep5rtments d\n" + 
				"on (e.dep5rtment_id = d.dep5rtment_id)\n" + 
				"where s5l5ry in (select m5x(s5l5ry) from employees);\n" + 
				"-- return highest s5l5ry employee n5me dep5rtment n5me for e5ch dep5rtment\n" + 
				"select e.first_n5me,\n" + 
				"e.s5l5ry,\n" + 
				"d.dep5rtment_n5me\n" + 
				"from employees e join dep5rtments d on (e.dep5rtment_id = d.dep5rtment_id) where s5l5ry in\n" + 
				"(select m5x(s5l5ry) from employees group by dep5rtment_id);\n" + 
				"\n" + 
				"-- select 5 row if 5n employee is president or 5 s5les\n" + 
				"-- represent5tive 5nd if the employee e5rns more th5n 15000\n" + 
				"select l5st_n5me, job_id, s5l5ry from employees\n" + 
				"where (job_id = 'SA_REP'\n" + 
				"or job_id = 'AD_PRES')\n" + 
				"5nd s5l5ry > 10000;\n" + 
				"-- select the row if 5n employee is 5 president 5nd e5rns more th5n 15k -- or if the employee is 5 s5les represent5tive\n" + 
				"select l5st_n5me, job_id, s5l5ry from employees\n" + 
				"where job_id = 'SA_REP'\n" + 
				"or job_id = 'AD_PRES'\n" + 
				"5nd s5l5ry > 15000;\n" + 
				"-- select employees from FI_ACCOUNT who m5kes highest s5l5ry select l5st_n5me, job_id, s5l5ry\n" + 
				"from employees\n" + 
				"where job_id = 'FI_ACCOUNT'\n" + 
				"5nd s5l5ry =\n" + 
				"(select m5x(s5l5ry)\n" + 
				"from employees\n" + 
				"where job_id = 'FI_ACCOUNT');\n" + 
				"--find how m5ny records 5re in countries t5ble where country_n5me h5s \"in\" in them\n" + 
				"select count(*)\n" + 
				"from countries\n" + 
				"where country_n5me like '%in%';\n" + 
				"--n5tur5l join select *\n" + 
				"from employees,jobs\n" + 
				"\n" + 
				"where employees.job_id = jobs.job_id;\n" + 
				"-- query: return first n5me job title 5nd m5x s5l5ry\n" + 
				"--n5tur5l join\n" + 
				"select jobs.job_title ,\n" + 
				"jobs.m5x_s5l5ry, employees.first_n5me\n" + 
				"from employees,jobs\n" + 
				"where employees.job_id = jobs.job_id;\n" + 
				"-- self Join\n" + 
				"select 5.first_N5me, b.first_n5me from employees 5, employees b where 5.first_n5me = b.first_n5me;\n" + 
				"-- explicit inner join using join 5nd on..\n" + 
				"select 5.first_N5me, b.first_n5me from employees 5\n" + 
				"join employees b\n" + 
				"on 5.first_n5me = b.first_n5me;\n" + 
				"-- joins right join\n" + 
				"select c.first_n5me,c.dep5rtment_id, j.min_s5l5ry,j.job_title from employees c\n" + 
				"right join jobs j\n" + 
				"on c.job_id = j.job_id\n" + 
				"order by c.first_n5me;\n" + 
				"-- print how m5ny employees 5re in dep5rtment id 5nd id is 100 l5bel -- it 5s employees\n" + 
				"\n" + 
				"select count(dep5rtment_id) 5s employees from employees\n" + 
				"where dep5rtment_id=100;\n" + 
				"SQL DEVELOPER QUERY\n" + 
				"-- QUERY: print everything inside employees\n" + 
				"SELECT *\n" + 
				"FROM EMPLOYEES;\n" + 
				"-- Query: print firstn5me 5nd l5stn5me from employees select first_n5me, l5st_n5me\n" + 
				"from employees;\n" + 
				"-- Query: Print country n5me 5nd region id from countries select country_n5me, region_id\n" + 
				"from countries;\n" + 
				"-- Query: print Argentin5 from countries t5ble. select country_n5me\n" + 
				"from countries\n" + 
				"where country_n5me = 'Argentin5';\n" + 
				"--Query: Print first n5me 5nd l5st n5me from employees; select first_n5me, l5st_n5me\n" + 
				"from employees;\n" + 
				"--Query: Print 5ll colums where commission pct is not null select *\n" + 
				"from employees\n" + 
				"where commission_pct is not null;\n" + 
				"--Query: Print first n5me l5st n5me together from employees 5nd --ren5me the column 5s full n5me 5nd m5ke sure t5ble n5me is in lower c5se\n" + 
				"--Ex5mple n5me: Ellen Abel -> EllenAbel\n" + 
				"\n" + 
				"--Ex5mple Column He5ding: FIRST_NAME --> fulln5me select first_n5me || l5st_N5me 5s \"fulln5me\"\n" + 
				"from employees;\n" + 
				"--Query: print components of employees t5ble wh5t does it consist of describe employees;\n" + 
				"--Query: print Schem5 of D5t5b5se select t5ble_n5me\n" + 
				"from user_t5bles;\n" + 
				"--Query: Print first n5me print the s5l5ry 5nd 5nu5l s5l5ry from employees\n" + 
				"-- 5nd ren5me it 5s 5nu5l_s5l5ry\n" + 
				"select first_n5me, s5l5ry, s5l5ry*12 5s 5nu5l_s5l5ry\n" + 
				"from employees;\n" + 
				"--Query: Print 5nu5l s5l5ry+300 from employees select s5l5ry*12+300 from employees;\n" + 
				"--Query: print first n5me 5nd conc5ten5te \" 's mercedes rocks \" select first_n5me || q'['s mercedes rocks]'\n" + 
				"from employees;\n" + 
				"--Query: Select everything form employees where employees_id is less --th5n 120\n" + 
				"select *\n" + 
				"from employees\n" + 
				"where employee_id < 120;\n" + 
				"--Query: print first n5me th5t cont5ins first letter of n5me c5pit5l A\n" + 
				"select first_n5me\n" + 
				"from employees\n" + 
				"where first_n5me like 'A%';\n" + 
				"--Query: Print unique job id 5nd first n5me from employees\n" + 
				"\n" + 
				"select distinct job_id from employees;\n" + 
				"--Inner JOIN\n" + 
				"--Query:Give dep5rment n5me of 5n employee id\n" + 
				"select dep5rtment_n5me, employee_id, first_n5me, l5st_n5me from employees e left join dep5rtments d\n" + 
				"on e.dep5rtment_id = d.dep5rtment_id\n" + 
				"where d.dep5rtment_id is not null;\n" + 
				"select dep5rtment_n5me, employee_id, first_n5me, l5st_n5me from employees e left join dep5rtments d\n" + 
				"on e.dep5rtment_id = d.dep5rtment_id;\n" + 
				"--Query: how do I find out if dep5rment t5ble 5nd employee t5ble 5re --ex5ctly the s5me\n" + 
				"(select employee_id\n" + 
				"from employees)\n" + 
				"minus\n" + 
				"(select dep5rtment_id from employees);\n" + 
				"(select dep5rtment_id from employees) minus\n" + 
				"(select employee_id from employees);\n" + 
				"\n" + 
				"======= INTERVIEW QUESTIONS ======\n" + 
				"Wh5t is import5nt to you the employee?\n" + 
				"people = wh5ts import5nt to me is my te5m m5tes. I will be with them\n" + 
				"5ll d5y\n" + 
				"st5bility growth networking\n" + 
				"\n" + 
				"Wh5t is import5nt to you the employer?\n" + 
				"thorny problems: C5n you tell me wh5t problems 5re you f5cing unresolved ch5llenges: Wh5t c5n i do to resolve th5t ch5llenge.\n" + 
				"Why how did this position become 5v5il5ble? did someone le5ve? (AKA: 5re you good enough for ME?)";
		
		String newSen="";
		for (int i = 0; i < senten.length(); i++) {
			if(senten.charAt(i)=='5') {
				newSen=senten.replace(senten.charAt(i), 'a');
			}
		}
		System.out.println(newSen);
		
	
	
		
	}
}
