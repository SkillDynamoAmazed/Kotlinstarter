package Basics


fun main(){

    val range = 1..10;
    for(i in range){
        println("i value is $i");
    }

    var reverse = 10 downTo 1;
    for(j in reverse){
        println("I value in decreasing order $j")
    }

    for(i in reverse step 3){
        println("After Skipping two elemnts $i")
    }



    exploreWhile();
    exploredoWhile();

}

fun exploreWhile(){
    var x =1;
    while(x<5){
        println("Value of x is $x")
        x++
    }


}

fun exploredoWhile(){
    var x = 3
    do {
        println("X value is $x")
        x++
    }while (x<5)
}


