package Basics

fun main() {

    for(i in 1..5){
        println("The value is $i")
        if(i==3){
            break;
        }
    }
    println("Out of the loop")

}