# Домашнее задание.
# Тема: "Модификаторы доступа, наследование"
Построен на базе следующих технологий:
* Java
## Банковские счета
* Систему из классов, описывающую банковские счета
* Система расположена пакете accounts
* У каждого счёта есть баланс (long) и имя владельца (String)
* У каждого счёта есть две операции: оплатить (pay(long amount)) и пополнить (add(long amount));
* Каждая операция возвращает boolean о том, успешно ли она прошла
* Есть три вида счёта: накопительный (SavingsAccount), расчётный (CheckingAccount) и кредитный (CreditAccount)
* Счета реализуют следующую логику
* ![](image.png)