package to.msn.wings.dialogargs

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // インテントを取得&トーストに反映
        val txtName = intent.getStringExtra("txtName")
        Toast.makeText(
            this, "こんにちは、${txtName}さん！",
            Toast.LENGTH_SHORT
        ).show()

        // ボタンクリック時に呼び出されるイベントリスナー
        val btn = findViewById<Button>(R.id.btnBack)
        btn.setOnClickListener {
            // SubActivityを終了
            finish()
        }
    }
}