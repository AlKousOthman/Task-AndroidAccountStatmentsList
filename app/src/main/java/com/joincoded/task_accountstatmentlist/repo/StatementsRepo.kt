package com.joincoded.task_accountstatmentlist.repo

import com.joincoded.task_accountstatmentlist.data.TransactionType
import com.joincoded.task_accountstatmentlist.data.AccountStatement

class StatementsRepo {

    companion object {
        var dummyList = listOf<AccountStatement>(
            AccountStatement(
                name = "Othman",
                type = TransactionType.DEPOSIT,
                date = "22/1/2024",
                amount = 1500.0,
                accountNumber = 4321
            ),
            AccountStatement(
                name = "Abdulmalik",
                type = TransactionType.WITHDRAW,
                date = "22/1/2024",
                amount = 7000.0,
                accountNumber = 8987
            ),
            AccountStatement(
                name = "Jasim",
                type = TransactionType.DEPOSIT,
                date = "22/1/2024",
                amount = 50.0,
                accountNumber = 4765
            ),
            AccountStatement(
                name = "Abbas",
                type = TransactionType.WITHDRAW,
                date = "22/1/2024",
                amount = 200.0,
                accountNumber = 3456
            )
        )
    }
}