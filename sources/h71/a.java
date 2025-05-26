package h71;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f67948a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f67949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i13, int i14, int i15, float f13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67948a = new RectF(getLeft(), getTop(), i13, i14);
        Paint paint = new Paint(1);
        this.f67949b = paint;
        paint.setColor(i15);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f13);
        float f14 = f13 / 2;
        this.f67948a.inset(f14, f14);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.f67948a, this.f67949b);
    }
}
