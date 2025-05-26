package i71;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f71664a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f71665b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f71666c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f71667d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f71668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, float f13, float f14, float f15) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71664a = new Paint(1);
        this.f71665b = new Paint(1);
        this.f71666c = new Paint(1);
        this.f71667d = new Paint(1);
        float f16 = 2 * f13;
        this.f71668e = new RectF(getLeft() + f16, getTop() + f16, getLeft() + f16 + f14, f16 + getTop() + f15);
    }

    @Override // android.view.View
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawArc(this.f71668e, 180.0f, 90.0f, true, this.f71666c);
        canvas.drawArc(this.f71668e, 270.0f, 90.0f, true, this.f71667d);
        canvas.drawArc(this.f71668e, 0.0f, 90.0f, true, this.f71664a);
        canvas.drawArc(this.f71668e, 90.0f, 90.0f, true, this.f71665b);
    }
}
