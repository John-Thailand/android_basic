package to.msn.wings.dialogargs

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View

class SimpleView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val p = Paint().apply {
        color = Color.CYAN
        strokeWidth = 5f
        typeface = Typeface.SERIF
        textSize = 50f
        textAlign = Paint.Align.CENTER
        textScaleX = 1.5f
        textSkewX = -0.5f
    }

    // 描画のコア
    // Androidがビューを表示/更新する際に呼び出すメソッド
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawColor(Color.WHITE)
        canvas?.drawText("WINGSプロジェクト", 400f, 300f, p)
    }
}