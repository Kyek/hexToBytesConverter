fun main(args: Array<String>) {
    var hexString = "160ee4da151a47b33347384eb4ee541a"
    val hexChunked = ArrayList<Int>()
    println(hexArray)
    for (i in 0 until hexString.count() step 2) {
        hexChunked.add(Integer.parseInt(hexString.substring(i, i+2), 16))
    }
	println(hexChunked)
}
