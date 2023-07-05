fun main(args: Array<String>) {
    library_user(mutableListOf(Libraby_system("river and the source")))

    library_user(mutableListOf(Libraby_system("Born a crime")))
    var final=remove_names(mutableListOf(Libraby_system("mshtahiki meya"), Libraby_system("betrayal in the city"),Libraby_system("" +
            "the cat and the rat")))
    listing(mutableListOf(Libraby_system("decolonizing the mind"),Libraby_system("the cat and the dog"),Libraby_system("" +
            "mary and the snake")))
    var artist1=Song("Christmas carols","loice mwau",2022,100)
    println( artist1.countingPlays(1000))
     movieTicket(14,isMonday = false)
 mynicknames(arrayOf("loice","kanini","mwau"))
 var student1=theaverage(mutableListOf(23,57,67,89))
    var student2=theaverage(mutableListOf(23,56,78,67))
    var student3=theaverage(mutableListOf(13,65,78,34))
    counting(arrayOf("loice","faith","mary","joyce"))
    println( check(arrayOf("loice","kanini","men","women")).contentToString())
     find_even(mutableListOf(1,2,3,4,5,6,7,8,9,10))
    find_longer5(arrayOf("maryanne","faith","lucyanne","lucy"))

    }





data class Libraby_system(var title:String){

}
fun library_user(names:MutableList<Libraby_system>) {

    names.addAll(mutableListOf(Libraby_system("Born a crime"),Libraby_system("A man in green Dungaree"),Libraby_system("Lost " +
            "in the forest")))
    println(names)
}


fun remove_names(removename: MutableList<Libraby_system>){
    removename.removeAt(2)
    println(removename)

}
fun listing(listMy_books:MutableList<Libraby_system>){
    listMy_books.forEach { item-> println(item.title) }
}

//TWO
//Create a class that can represent the structure of a song.
// The Song class must include these code elements:
//Properties for the title, artist, year published, and play count
//A property that indicates whether the song is popular.
// If the play count is less than 1,000, consider it unpopular.
//A method that prints a song description in this format:
//"[Title], performed by [artist], was released in [year published]."
class Song (var title: String,var artist:String,var yearPublished:Int,var playcount:Int){
    fun countingPlays(noofPlay:Int){
        if (noofPlay < 1000){
            println("$title is unpopular")
        }
        else{
            println("$title is popular")
        }
    }
}
//
//A children's ticket price of $15 for people 12 years old or younger.
//A standard ticket price of $30 for people between 13 and 60 years old. On Mondays,
// discount the standard ticket price to $25 for this same age group.
//A senior ticket price of $20 for people 61 years old and older. Assume that the maximum
// age of a moviegoer is 100 years old.
//A -1 value to indicate that the price is invalid when a user inputs an age
// outside of the age specifications.

fun movieTicket(age:Int,isMonday:Boolean){
    when(age){
        in 0..12-> println("the ticket price is $15")
        in 13..59 -> if (isMonday)  println("the movie price is $25") else  println("the movie price is $30")
        in 61..100 -> println("the ticket price is $20")
        else-> println(-1)
    }
}
//Create a program that simulates a restaurant menu, using arrays to store menu items and prices,
//variables to store user selections, and control-flow statements to calculate the bill.
data class  RestaurantMenu(var user_selection:String)
//while registering for some bank application that you have developed,
// user has to maintain a minimum balance of 1000. While validating the user’s amount, if you find that
// it is less than 1000, you may throw an exception to the calling method.
fun minimumAmount(amount:Int){
    throw Exception("you balance is less than 1000")
}

//array of strings and joins them into a string
fun mynicknames(mynames:Array<String>) {
    var final=mynames.joinToString("")
    println(final)
}
//average grade of all students in the list
//data class StudentsGrades(var math:Int,var eng:Int,var swahili:Int,var history:Int)
fun theaverage(  studentsgrades:MutableList<Int>){
    var sum=0
    for (student in studentsgrades){
        sum+=student
    }
    println(sum / studentsgrades.size)

}
//counting vowels
fun counting(characters:Array<String>){
    var vowels="aeiou"
    var count=0
    for (charr in characters){
        if(charr.contains(vowels)){
            count++
            println(count)
        }


    }

}
//if a string includes a given letter
fun check (mystring:Array<String>):Array<String>{
    var contains_vowels= arrayOf<String>()
    for(each in mystring){
        if(each.contains("a")){
             contains_vowels+=each
        }
    }
    return contains_vowels
}
//finding even numbers using filter
fun find_even(mynumbers:List<Int>){
    var new= listOf<Int>()
    var even=mynumbers.filter { it % 2 ==0 } .forEach { println( it) }



}
//finding the string whose length is greater than a give value
fun find_longer5(mystring:Array<String>){
  var longer=  mystring.forEach { it.length > 5 }
    println( longer)

}
