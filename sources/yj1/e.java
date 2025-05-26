package yj1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.r0;
import rm1.f;
import rm1.q;
import wa2.l;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes5.dex */
public final class e extends l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f139212l;

    /* renamed from: m, reason: collision with root package name */
    public final int f139213m;

    /* renamed from: n, reason: collision with root package name */
    public final BitmapDrawable f139214n;

    /* renamed from: o, reason: collision with root package name */
    public final BitmapDrawable f139215o;

    /* renamed from: p, reason: collision with root package name */
    public BitmapDrawable f139216p;

    /* renamed from: q, reason: collision with root package name */
    public final k f139217q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f139218r;

    /* renamed from: s, reason: collision with root package name */
    public String f139219s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f139212l = context;
        this.f139213m = context.getResources().getDimensionPixelOffset(eo1.c.space_100);
        this.f139214n = com.bumptech.glide.d.C(new rm1.d(new f(q.STAR), null, null, 0, null, 30), context);
        BitmapDrawable C = com.bumptech.glide.d.C(new rm1.d(new f(q.STAR_OUTLINE), null, null, 0, null, 30), context);
        this.f139215o = C;
        this.f139216p = C;
        this.f139217q = m.a(n.NONE, new d(this, 0));
        this.f139218r = new Rect();
        this.f139219s = "";
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f139216p = this.f139215o;
        this.f139219s = "";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int centerY = getBounds().centerY();
        int intrinsicHeight = this.f139216p.getIntrinsicHeight() / 2;
        this.f139216p.setBounds(this.f128838a ? getBounds().left : getBounds().right - this.f139216p.getIntrinsicWidth(), centerY - intrinsicHeight, this.f128838a ? this.f139216p.getIntrinsicWidth() + getBounds().left : getBounds().right, intrinsicHeight + centerY);
        this.f139216p.draw(canvas);
        if (!z.j(this.f139219s)) {
            k kVar = this.f139217q;
            tn1.c cVar = (tn1.c) kVar.getValue();
            String str = this.f139219s;
            cVar.getTextBounds(str, 0, str.length(), this.f139218r);
            boolean z13 = this.f128838a;
            int i13 = this.f139213m;
            canvas.drawText(this.f139219s, z13 ? r5 + i13 : (r3 - i13) - r9.width(), centerY - ((((tn1.c) kVar.getValue()).descent() + ((tn1.c) kVar.getValue()).ascent()) / 2), (tn1.c) kVar.getValue());
        }
    }

    public final void h(c favoriteDisplayState) {
        Intrinsics.checkNotNullParameter(favoriteDisplayState, "favoriteDisplayState");
        this.f139219s = favoriteDisplayState.f139209b;
        this.f139216p = favoriteDisplayState.f139208a ? this.f139214n : this.f139215o;
        invalidateSelf();
    }

    public final Rect i() {
        Rect bounds = this.f139216p.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return bounds;
    }

    public final Rect j() {
        Rect bounds = this.f139216p.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        int V = bs1.c.V(this.f139212l, r0.pin_grid_overflow_bounds_width) / 2;
        bounds.set(centerX - V, centerY - V, centerX + V, centerY + V);
        return bounds;
    }

    public final void k() {
        int max = Math.max(this.f139216p.getIntrinsicHeight(), this.f139216p.getIntrinsicWidth());
        if (!z.j(this.f139219s)) {
            tn1.c cVar = (tn1.c) this.f139217q.getValue();
            String str = this.f139219s;
            int length = str.length();
            Rect rect = this.f139218r;
            cVar.getTextBounds(str, 0, length, rect);
            max += rect.width() + this.f139213m;
        }
        e(Math.max(this.f139216p.getIntrinsicHeight(), this.f139216p.getIntrinsicWidth()));
        f(max);
    }
}
