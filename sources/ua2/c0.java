package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final int f121448l;

    /* renamed from: m, reason: collision with root package name */
    public final int f121449m;

    /* renamed from: n, reason: collision with root package name */
    public final BitmapDrawable f121450n;

    /* renamed from: o, reason: collision with root package name */
    public final va2.l f121451o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, int i13, int i14, rm1.q gestaltIcon, rm1.c gestaltIconColor, rm1.i gestaltIconSize, g92.d iconTheme) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gestaltIcon, "gestaltIcon");
        Intrinsics.checkNotNullParameter(gestaltIconColor, "gestaltIconColor");
        Intrinsics.checkNotNullParameter(gestaltIconSize, "gestaltIconSize");
        Intrinsics.checkNotNullParameter(iconTheme, "iconTheme");
        this.f121448l = i13;
        this.f121449m = i14;
        this.f121450n = com.bumptech.glide.d.D(new rm1.d(new rm1.f(gestaltIcon, gestaltIconSize), gestaltIconColor, null, 0, null, 28), context, iconTheme);
        this.f121451o = new va2.l(context);
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f121451o.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128846i) {
            return;
        }
        this.f121451o.draw(canvas);
        canvas.save();
        boolean z13 = this.f128838a;
        BitmapDrawable bitmapDrawable = this.f121450n;
        if (z13) {
            canvas.scale(-1.0f, 1.0f, bitmapDrawable.getBounds().centerX(), bitmapDrawable.getBounds().centerX());
        }
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }
}
