import com.joincoded.task_accountstatmentlist.data.TransactionType


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccountStatementComposable(
    name: String,
    type: TransactionType,
    date: String,
    amount: Double,
    accountNumber: Int,
    modifier: Modifier = Modifier){
          Card (modifier = Modifier
              .width(350.dp)
              .height(200.dp)
              .padding(12.dp)){

              Column(modifier = Modifier
                  .height(190.dp)
                  .width(340.dp)
                  .padding(9.dp)) {

                  Text(text = name)
                  Spacer(modifier = Modifier.padding(5.dp) )
                  Text(text = "$type")
                  Spacer(modifier = Modifier.padding(5.dp) )
                  Text(text = date)
                  Spacer(modifier = Modifier.padding(5.dp) )
                  Text(text = "$amount")
                  Spacer(modifier = Modifier.padding(5.dp) )
                  Text(text = "$accountNumber")


              }

          }
    }


