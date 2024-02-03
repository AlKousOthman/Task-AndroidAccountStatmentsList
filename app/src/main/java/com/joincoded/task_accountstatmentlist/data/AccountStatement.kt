package com.joincoded.task_accountstatmentlist.data

data class AccountStatement(
    var name: String,
    var type: TransactionType,
    var date: String,
    var amount: Double,
    var accountNumber: Int
)
