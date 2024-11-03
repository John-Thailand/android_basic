package to.msn.wings.dialogargs

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // ボタンクリック時に呼び出されるイベントリスナー
        val btn = findViewById<Button>(R.id.btnBack)
        btn.setOnClickListener {
            // SubActivityを終了
            finish()
        }
    }
}