package hb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f68619a;

    /* renamed from: b, reason: collision with root package name */
    public final float f68620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68621c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f68622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, float f13, float f14, int i13, int i14, Float f15) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68619a = f13;
        this.f68620b = f14;
        this.f68621c = i13;
        Paint paint = new Paint(1);
        paint.setColor(i14);
        if (f15 != null) {
            float floatValue = f15.floatValue();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(floatValue);
        }
        this.f68622d = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(this.f68619a, this.f68620b, this.f68621c, this.f68622d);
    }
}
