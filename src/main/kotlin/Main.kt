fun main() {
text("Suee","Bee")
    numbers(3,2,1)
    words("Banana")

    var calculate = Calculator(20,10,2)
    calculate.addition()
    calculate.subtraction()
    calculate.division()
    calculate.multiplication()
}
//NO. 1
fun text (text1:String,text2:String){
    if (text1>text2){
        println(text1[0])
    }else{
        (text1==text2)
        println(text1[0])
}}
//N0. 2
fun numbers (num1:Int,num2:Int,num3:Int){
    var nums = arrayOf(num1,num2,num3)
    println(nums.average())
    println(arrayOf(nums.maxOf()))
//    { x -> (x>x) })

}
//NO. 3
fun words (word:String){
    println(word.split(""))

}
//NO. 4
//fun all (){
//    var words = arrayOf("word1","word2","word3")
//    println(words.toString())
//
//}

//NO. 5
class Calculator(var nums1: Int,var nums2: Int,var nums3: Int){

    fun addition (){
        println(nums1+nums2)
    }

    fun subtraction (){
        println(nums1-nums2)
    }

    fun division (){
        println(nums2/nums3)
    }
    fun multiplication (){
        println(nums1*nums2)
    }
}
