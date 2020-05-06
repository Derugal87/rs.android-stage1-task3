package subtask1

import kotlin.math.absoluteValue

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.size == 0) return null
        var result = ""
        var coef = numbers.size
        for(i in numbers.indices){
            if(numbers[i]==0){result += "" }
            else if (numbers[i]==-1) {  result+= " - "+"x"}
            else if(numbers[i]==1) {  result+= " + "+"x"}
            else if(numbers[i]>0) {
                if(i == coef - 1) {
                    result+= " + "+numbers[i].absoluteValue.toString()
                } else if (i == coef - 2) {
                    result+= " + "+numbers[i].absoluteValue.toString()+"x"
                }
                else if(numbers[i]==numbers.first()){
                    result+= numbers[i].absoluteValue.toString()+"x^"+(coef-i-1).toString()
                }
                else{
                    result+= " + "+numbers[i].absoluteValue.toString()+"x^"+(coef-i-1).toString()
                }
            }
            else if(numbers[i]<0) {  result+= " - "+numbers[i].absoluteValue.toString()+"x^"+(coef-i-1).toString()}

        }
        return result
    }
}
