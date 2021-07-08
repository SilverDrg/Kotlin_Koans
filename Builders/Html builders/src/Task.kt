fun renderProductTable(): String {
    return html {
        table {
            tr/* TODO */ {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (product in products) {
                var index = 0
                var row = 0
                tr (getTitleColor()) {
                    td (getCellColor(index, row)) {
                        text(product.description)
                        index++
                    }
                    td (getCellColor(index, row)) {
                        text(product.price)
                        index++
                    }
                    td (getCellColor(index, row)) {
                        text(product.popularity)
                        index++
                    }
                }
                row++
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
