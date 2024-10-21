package to.msn.wings.dialogargs

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SimpleView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    // 描画のためのスタイルを準備
    private val p = Paint().apply {
        color = Color.CYAN
        strokeWidth = 100f
    }

    // 描画のコア
    // Androidがビューを表示/更新する際に呼び出すメソッド
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        // ビューへの描画
        canvas?.drawColor(Color.RED)
        canvas?.drawPoint(100f, 100f, p)
    }
}