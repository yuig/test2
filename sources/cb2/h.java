package cb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f27322a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f27323b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f27324c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f27325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f27322a = paint;
        Path path = new Path();
        this.f27323b = path;
        this.f27324c = new Rect();
        this.f27325d = new Rect();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(wc0.a.contextual_overlay, context.getTheme()));
        path.setFillType(Path.FillType.EVEN_ODD);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f27323b, this.f27322a);
    }
}
