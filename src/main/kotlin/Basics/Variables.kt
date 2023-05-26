package Basics


fun main(){

    val name = "Sundaram";

    println(name);

    var age  = 34;
    println(age);
    age = 38;
    println(age)

    println("Name is $name and length is ${name.length}") //String interepolation using $. and to call function.

    var multiline = "ABC \n DEF";
    println(multiline)
    var count  =0 ;
    count++;
    count++;
    println("count is $count")

    //Multiline using """ quotes to print in different lines.
    var multiline1 = """     
        ABC
        DEF
    """.trimIndent()
  //If -else in kotlin is an expression ......

    var position = 1;
    var name1 = "Sundaram"
    var result = if(name.length==1)
    {
        println("The posiition is $position");
        name1
    }
    else{
        println("The posiiton is not matched");
        name1.length
    }
    println(result)



    //1->GOLD , 2 ->SILVER , 3 -> BRONZE

    var index = 2;



   val myresult = when(index) {
       1 ->{ "GOLD"}
       2 -> {"SILVER"}
       3 -> {"GOLD"}
       else ->{
       "NO MEDAL"
       }
   }
     println(myresult)




}
