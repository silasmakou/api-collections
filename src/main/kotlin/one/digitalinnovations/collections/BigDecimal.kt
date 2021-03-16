package one.digitalinnovations.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor //soma de todos os salarios
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO // media de todos os salarios
    else this.somatoria() / this.size.toBigDecimal() //divide pelo tamanho do array