package to.msn.wings.dialogargs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ボタンクリック時に呼び出されるイベントリスナー
        val btn = findViewById<Button>(R.id.btnSend)
        btn.setOnClickListener {
            // SubActivityへのインテントを作成
            val i = Intent(this, SubActivity::class.java)
            // アクティビティを起動
            startActivity(i)
        }
    }
}