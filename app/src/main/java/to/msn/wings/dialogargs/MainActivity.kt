package to.msn.wings.dialogargs

import android.content.Intent
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

        // 結果を受け取った時の処理を定義
        val startForResult = registerForActivityResult(
            StartActivityForResult()) { result ->
            // 結果コードをチェック
            if (result?.resultCode == RESULT_OK) {
                result.data?.let {
                    Toast.makeText(
                        this@MainActivity,
                        "こんにちは、${it.getStringExtra("txtName")}さん！",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        val btn = findViewById<Button>(R.id.btnSend)
        btn.setOnClickListener {
            // SubActivityを結果を戻してもらう前提で呼び出し
            startForResult.launch(Intent(this, SubActivity::class.java))
        }
    }
}