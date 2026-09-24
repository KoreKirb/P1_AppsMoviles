fun main(){
    var a=0
    var b=1

    for(i in 1..50){
        println(a)

        var sig = a + b
        a = b
        b = sig
    }
}

