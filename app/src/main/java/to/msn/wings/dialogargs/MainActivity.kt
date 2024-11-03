package to.msn.wings.dialogargs

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn = findViewById<Button>(R.id.btnSend)
//        btn.setOnClickListener {
//            val txtName = findViewById<EditText>(R.id.txtName)
//            // インテントを作成してアクティビティを起動
//            startActivity(
//                // ACTION_SENDアクションでテキストボックスの値を送信
//                Intent(Intent.ACTION_SEND).apply {
//                    type = "text/plain"
//                    putExtra(Intent.EXTRA_TEXT, txtName.text.toString())
//                }
//            )
//        }
    }
}