fun main() {
println(text(" "," "))
    println( numbers(arrayOf(2,4,5,78,90)))
    words("Banana")
    println(all(arrayOf("rye", "boy","teach")))

    var calculate = Calculator(20,10,2)
    calculate.addition()
    calculate.subtraction()
    calculate.division()
    calculate.multiplication()
}
//NO. 1
fun text (text1:String,text2:String): Any {
//   return when {
//       text1.length > text2.length -> text1[0]
//       text2.length > text1.length -> text1[0]
//       text2.length == text1.length -> text1[0]
//       else -> 'n'

//   }}
    if (text1.length > text2.length){
        return (text1[0])
    }else if (text1.length > text2.length) {
        return text2[0]
    }else if (text1.length == text2.length) {
        return text2[0]
    }else {
        return ("no")
}
}
//N0. 2
fun numbers (num:Array<Int>): Triple<Int, Int, Double>{
    var num1 = num.max()
    var num2 = num.min()
    var num3 = num.average()
    return Triple(num1,num2, num3)
}
//NO. 3
fun words (word:String){
    println(word.split(""))

}
//NO. 4
fun all (word:Array<String>):String{
    return word.joinToString(" ")
}
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
