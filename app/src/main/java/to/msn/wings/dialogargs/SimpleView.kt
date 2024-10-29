package to.msn.wings.dialogargs

import android.content.Context
import android.graphics.BitmapFactory
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
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.translate(200f, 200f)
        canvas?.scale(1.5f, 1.5f)
        canvas?.rotate(60f)
        canvas?.drawRect(0f, 0f, 200f, 200f, p)
    }
}