class LazyProperty(val initializer: () -> Int) {
   var lazyVal: Int? = null
    val lazy: Int
        get() {
            if(lazyVal == null) {
                lazyVal = initializer()
            }
            return lazyVal!!
        }
}
