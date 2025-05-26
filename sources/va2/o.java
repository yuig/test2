package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.StaticLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes4.dex */
public final class o extends wa2.l {

    /* renamed from: l, reason: collision with root package name */
    public final Context f125430l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f125431m;

    /* renamed from: n, reason: collision with root package name */
    public final l f125432n;

    /* renamed from: o, reason: collision with root package name */
    public BitmapDrawable f125433o;

    /* renamed from: p, reason: collision with root package name */
    public int f125434p;

    /* renamed from: q, reason: collision with root package name */
    public int f125435q;

    /* renamed from: r, reason: collision with root package name */
    public int f125436r;

    /* renamed from: s, reason: collision with root package name */
    public int f125437s;

    /* renamed from: t, reason: collision with root package name */
    public int f125438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f125430l = context;
        this.f125431m = new Rect();
        this.f125432n = new l(context);
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        this.f125432n.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f125432n.draw(canvas);
        BitmapDrawable bitmapDrawable = this.f125433o;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
    }

    public final Rect h() {
        return this.f125431m;
    }

    public final void i() {
        l lVar = this.f125432n;
        lVar.l();
        int i13 = lVar.f128842e;
        BitmapDrawable bitmapDrawable = this.f125433o;
        e(Math.max(i13, bitmapDrawable != null ? bitmapDrawable.getIntrinsicHeight() : 0));
    }

    public final void j(q icon, rm1.i iconSize, rm1.c iconColor, int i13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.f125433o = com.bumptech.glide.d.C(new rm1.d(new rm1.f(icon, iconSize), iconColor, null, 0, null, 28), this.f125430l);
        this.f125438t = i13;
    }

    public final void k(int i13) {
        this.f125432n.f125406r = i13;
    }

    public final void l(int i13) {
        int i14 = i13 - this.f125435q;
        BitmapDrawable bitmapDrawable = this.f125433o;
        this.f125432n.f125407s = ((i14 - (bitmapDrawable != null ? bitmapDrawable.getIntrinsicWidth() : 0)) - this.f125438t) - this.f125434p;
    }

    public final void m(int i13, int i14, int i15, int i16) {
        this.f125434p = i13;
        this.f125435q = i14;
        this.f125436r = i15;
        this.f125437s = i16;
    }

    public final void n(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f125432n.o(text);
    }

    public final void o(int i13, int i14, int i15, int i16) {
        int i17;
        int intrinsicWidth;
        int i18;
        setBounds(i13, i14, i15, i16);
        this.f125431m.set(i13, i14 - this.f125436r, i15, this.f125437s + i16);
        if (this.f128838a) {
            int i19 = i13 + this.f125435q;
            BitmapDrawable bitmapDrawable = this.f125433o;
            i17 = (bitmapDrawable != null ? bitmapDrawable.getIntrinsicWidth() : 0) + i19 + this.f125438t;
        } else {
            i17 = this.f125434p + i13;
        }
        if (this.f128838a) {
            intrinsicWidth = i15 - this.f125434p;
        } else {
            int i23 = i15 - this.f125435q;
            BitmapDrawable bitmapDrawable2 = this.f125433o;
            intrinsicWidth = (i23 - (bitmapDrawable2 != null ? bitmapDrawable2.getIntrinsicWidth() : 0)) - this.f125438t;
        }
        l lVar = this.f125432n;
        lVar.setBounds(i17, i14, intrinsicWidth, i16);
        Rect h10 = lVar.h();
        if (this.f128838a) {
            int i24 = this.f125434p + h10.right + this.f125438t;
            BitmapDrawable bitmapDrawable3 = this.f125433o;
            i18 = i15 - ((bitmapDrawable3 != null ? bitmapDrawable3.getIntrinsicWidth() : 0) + i24);
        } else {
            i18 = this.f125434p + h10.right + this.f125438t;
        }
        BitmapDrawable bitmapDrawable4 = this.f125433o;
        int intrinsicWidth2 = (bitmapDrawable4 != null ? bitmapDrawable4.getIntrinsicWidth() : 0) + i18;
        StaticLayout staticLayout = lVar.f125410v;
        Integer valueOf = staticLayout != null ? Integer.valueOf(staticLayout.getLineBottom(0)) : null;
        if (valueOf != null) {
            i16 = valueOf.intValue();
        }
        int i25 = ((i16 + i14) + i14) / 2;
        BitmapDrawable bitmapDrawable5 = this.f125433o;
        int intrinsicHeight = i25 - ((bitmapDrawable5 != null ? bitmapDrawable5.getIntrinsicHeight() : 0) / 2);
        BitmapDrawable bitmapDrawable6 = this.f125433o;
        int intrinsicHeight2 = ((bitmapDrawable6 != null ? bitmapDrawable6.getIntrinsicHeight() : 0) / 2) + i25;
        BitmapDrawable bitmapDrawable7 = this.f125433o;
        if (bitmapDrawable7 != null) {
            bitmapDrawable7.setBounds(i18, intrinsicHeight, intrinsicWidth2, intrinsicHeight2);
        }
    }

    public final void p(List style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f125432n.n(style);
    }
}
