package com.kotlin.study

/**
 * Created by zhangshuai on 2017/6/22.
 */
fun main(args: Array<String>) {
//    print("sum 3 + 5 = ")
//    println(sum(3,5))
//    printSum(-1,13)
//    printPara()
//    println("15 和 56 较大的是 ${maxOf(15, 56)}")
    printProduct("a","10")
    printProduct("9","s")
    printProduct("9","10")

}

/**
 * 简单的加法
 */
fun sum(a:Int, b:Int): Int {
    return a + b
}

/**
 * 根据参数推断返回类型
 *
 */
fun sum1(a:Int, b:Int) = a + b

/**
 * 占位符的字符串拼接
 *Unit类型解释:The type with only one value: the Unit object. This type
 * corresponds to the `void` type in Java.
 * Unit类型可以省略
 */
fun printSum(a:Int, b:Int): Unit{
    println("$a + $b = ${sum(a,b)}")
}

/**
 * 常量用val表示
 * 变量用var表示
 * $为占位符，不用再用加好来连接字符串了
 */
fun printPara() {
    val a = 1
    val b:Int = 5

    var c = 1
    println("c = $c")
    c = b
    println("a = $a, b= $b, c= $c")

}

/**
 * if else 写法
 * 可以省略{}
 * fun maxOf(a:Int, b:Int) = if(a>b) a else b
 *
 */
fun maxOf(a:Int, b:Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * 类型转换，当返回可能为空的时候需要加上'?'来标识
 */
fun parseInt(arg:String): Int? {
    return arg.toIntOrNull()
}

fun printProduct(arg1:String, arg2:String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if(x == null || y == null) {
        println("$arg1 或者 $arg2 不是一个数字")
    } else {
        println(x * y)
    }
}

/**
 * 类型判断
 */
fun getStringLenth(obj: Any): Int? {
    if(obj !is String) {
        return null
    }
    return obj.length
}