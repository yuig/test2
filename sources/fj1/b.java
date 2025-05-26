package fj1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import rm1.d;
import rm1.f;
import rm1.q;
import ua2.z0;
import va2.l;

/* loaded from: classes5.dex */
public final class b extends ej1.a {

    /* renamed from: k, reason: collision with root package name */
    public BitmapDrawable f62242k;

    /* renamed from: l, reason: collision with root package name */
    public int f62243l;

    /* renamed from: m, reason: collision with root package name */
    public int f62244m;

    /* renamed from: n, reason: collision with root package name */
    public a f62245n;

    /* renamed from: o, reason: collision with root package name */
    public int f62246o;

    public final void C(c displayState) {
        BitmapDrawable C;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        A(displayState.f62247a);
        q qVar = displayState.f62250d;
        if (qVar == null) {
            throw new IllegalArgumentException("Icon must be provided");
        }
        d dVar = new d(new f(qVar, displayState.f62252f), displayState.f62251e, null, 0, null, 28);
        View view = this.f121492a;
        g92.d dVar2 = displayState.f62254h;
        if (dVar2 != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C = com.bumptech.glide.d.D(dVar, context, dVar2);
        } else {
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C = com.bumptech.glide.d.C(dVar, context2);
        }
        this.f62242k = C;
        this.f62243l = bs1.c.W(view, displayState.f62249c);
        Integer num = displayState.f62248b;
        int W = num != null ? bs1.c.W(view, num.intValue()) : C.getIntrinsicWidth();
        this.f62244m = W;
        this.f62245n = displayState.f62253g;
        this.f62246o = (C.getIntrinsicHeight() * W) / C.getIntrinsicWidth();
    }

    @Override // ej1.a, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        BitmapDrawable bitmapDrawable = this.f62242k;
        if (bitmapDrawable == null) {
            return;
        }
        int i23 = this.f62244m + this.f62243l;
        boolean z13 = this.f121494c;
        if (!(z13 && this.f62245n == a.START) && (z13 || this.f62245n != a.END)) {
            int i24 = this.f59098j;
            int i25 = i13 + i23 + i24;
            int i26 = i15 - i24;
            i17 = i25;
            i18 = i26;
        } else {
            int i27 = this.f59098j;
            i17 = i13 + i27;
            i18 = (i15 - i27) - i23;
        }
        int i28 = this.f121483f;
        int i29 = this.f121484g;
        l lVar = this.f59096h;
        lVar.setBounds(i17, i28, i18, i29);
        lVar.draw(canvas);
        if (this.f62245n == a.START) {
            i19 = this.f121494c ? (i15 - this.f59098j) - this.f62244m : this.f59098j + i13;
        } else {
            int abs = Math.abs(lVar.h().width());
            i19 = this.f121494c ? (i15 - abs) - i23 : i13 + abs + this.f62243l;
        }
        int i33 = this.f62244m;
        int i34 = ((i19 + i33) + i19) / 2;
        int i35 = (this.f121483f + this.f121484g) / 2;
        int i36 = i33 / 2;
        int i37 = this.f62246o / 2;
        bitmapDrawable.setBounds(i34 - i36, i35 - i37, i36 + i34, i37 + i35);
        canvas.save();
        if (this.f121494c) {
            canvas.scale(-1.0f, 1.0f, i34, i35);
        }
        bitmapDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // ej1.a, ua2.f1
    public final z0 y(int i13, int i14) {
        int i15 = ((i13 - (this.f59098j * 2)) - this.f62244m) - this.f62243l;
        l lVar = this.f59096h;
        lVar.f125407s = i15;
        lVar.l();
        return new z0(i13, Math.max(lVar.f128842e, this.f62246o));
    }
}
