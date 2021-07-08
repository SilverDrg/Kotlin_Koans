class DateIter(val range: DateRange) : Iterator<MyDate> {
    var current = range.start
    override fun hasNext() : Boolean = current <= range.end
    override fun next(): MyDate {
        val ret = current
        current = current.followingDate()
        return ret
    }
}

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override operator fun iterator() : Iterator<MyDate> = DateIter(this)
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}