package ResolverOperacion

fun suma (a:Int,b:Int):Int{
    return a+b
}

fun resta (a:Int,b:Int):Int{
    return a-b
}

fun multiplicacion (a:Int,b:Int):Int{
    return a*b
}

fun division (a:Int,b:Int):Double{
    return (a.toDouble()/b.toDouble())
}

fun potencia(a:Int,b:Int):Double{
    return Math.pow(a.toDouble(),b.toDouble())
}