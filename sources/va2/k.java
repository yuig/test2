package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rm1.q;

/* loaded from: classes2.dex */
public final class k extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f125396l;

    /* renamed from: m, reason: collision with root package name */
    public final int f125397m;

    /* renamed from: n, reason: collision with root package name */
    public final BitmapDrawable f125398n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, rm1.c defaultIconColor) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultIconColor, "defaultIconColor");
        this.f125396l = context;
        this.f125397m = r0.pin_grid_overflow_bounds_width;
        this.f125398n = com.bumptech.glide.d.C(new rm1.d(new rm1.f(q.ELLIPSIS), defaultIconColor, null, 0, null, 28), context);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int centerY = getBounds().centerY();
        BitmapDrawable bitmapDrawable = this.f125398n;
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight() / 2;
        bitmapDrawable.setBounds(this.f128838a ? getBounds().left : getBounds().right - bitmapDrawable.getIntrinsicWidth(), centerY - intrinsicHeight, this.f128838a ? bitmapDrawable.getIntrinsicWidth() + getBounds().left : getBounds().right, centerY + intrinsicHeight);
        bitmapDrawable.draw(canvas);
    }

    public final Rect h() {
        Rect bounds = this.f125398n.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        int V = bs1.c.V(this.f125396l, this.f125397m) / 2;
        bounds.set(centerX - V, centerY - V, centerX + V, centerY + V);
        return bounds;
    }
}
