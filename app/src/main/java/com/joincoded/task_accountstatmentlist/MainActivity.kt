package com.joincoded.task_accountstatmentlist

import AccountStatementComposable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joincoded.task_accountstatmentlist.repo.StatementsRepo
import com.joincoded.task_accountstatmentlist.ui.theme.TaskAccountStatmentListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val secondDummyList = StatementsRepo.dummyList
        setContent {
            TaskAccountStatmentListTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn{
                        items(secondDummyList){
                            AccountStatementComposable(
                                name = it.name,
                                             type = it.type,
                                             date = it.date,
                                             amount = it.amount,
                                              accountNumber = it.accountNumber)
                        }
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskAccountStatmentListTheme {
        Greeting("Android")
    }
}