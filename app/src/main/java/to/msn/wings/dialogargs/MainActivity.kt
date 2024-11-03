package to.msn.wings.dialogargs

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

        val btn = findViewById<Button>(R.id.btnSend)
        btn.setOnClickListener {
            val txtKeywd = findViewById<EditText>(R.id.txtKeywd)
            // インテントを作成してアクティビティを起動
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(txtKeywd.text.toString())
                )
            )
        }
    }
}