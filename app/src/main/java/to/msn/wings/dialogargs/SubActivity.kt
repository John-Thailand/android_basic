package to.msn.wings.dialogargs

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val btn = findViewById<Button>(R.id.btnBack)
        btn.setOnClickListener {
            val txtName = findViewById<EditText>(R.id.txtName)
            // 結果情報を設定し、現在のアクティビティを終了
            setResult(
                RESULT_OK,
                Intent().apply {
                    // インテントにテキストボックスからの入力値をセット
                    putExtra("txtName", txtName.text.toString())
                }
            )
        }
        finish()
    }
}