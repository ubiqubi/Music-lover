fun main() {
    // Вводим сумму покупки
    val purchaseAmount = 15000
    // Проверяем, является ли клиент постоянным покупателем
    val isRegularCustomer = true

    // Проверяем условия акции и применяем соответствующую скидку
    var discount = when {
        purchaseAmount in 0..1000 -> 0
        purchaseAmount in 1001..10000 -> 100
        else -> (purchaseAmount * 0.05).toInt()
    }

    // Применяем дополнительную скидку для постоянных покупателей
    if (isRegularCustomer) {
        discount += (purchaseAmount * 0.01).toInt()
    }

    // Вычисляем стоимость покупки с учетом скидки
    val totalAmount = purchaseAmount - discount

    // Выводим итоговую стоимость покупки
    println("Итоговая стоимость покупки: $totalAmount руб.")
}