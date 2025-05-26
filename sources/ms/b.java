package ms;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import y92.g;
import yk1.n;

/* loaded from: classes3.dex */
public final class b extends View implements n, g {

    /* renamed from: a, reason: collision with root package name */
    public String f88092a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f88093b;

    /* renamed from: c, reason: collision with root package name */
    public float f88094c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f88095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88093b = new RectF();
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(eo1.b.color_themed_light_gray, context.getTheme()));
        this.f88095d = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.corner_radius_large);
        canvas.drawRoundRect(this.f88093b, dimensionPixelOffset, dimensionPixelOffset, this.f88095d);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        float f13 = size;
        float f14 = this.f88094c * f13;
        RectF rectF = this.f88093b;
        rectF.left = 0.0f;
        rectF.right = f13;
        rectF.top = 0.0f;
        rectF.bottom = f14;
        setMeasuredDimension(size, (int) f14);
    }

    @Override // y92.g
    public final boolean resizable() {
        return true;
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return this.f88092a;
    }
}
