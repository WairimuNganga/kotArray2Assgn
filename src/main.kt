fun main(){
var product = intsPrd(arrayOf(23,45,67,89,90))
    println(product)
    var sum = intsSum(arrayOf(2,2.0,45,7.2,5.2,6,9,4))
    println(sum)
    var vowels = getVowels(arrayOf('a','g','u','w','e','t','i','o'))
    println(vowels)
}
fun intsPrd(product:Array<Int>):Int{
    var no = 1
    product.forEach { num->
        no*=num
    }
    return no
}
fun intsSum(total:Array<Any>):Double{
    var no = 0.0
    total.forEach { nm->
        if(nm is Double){
         no+=nm
        }
    }
    return no
}
fun getVowels(letters:Array<Char>):Int{
    var output = 0
    letters.forEach {zippy ->
        if (zippy=='a'||zippy=='e'||zippy=='i'||zippy=='o'||zippy=='u'){
            output++
    }
        }
    return output
}
