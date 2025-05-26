package uj1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bs1.c;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import pj1.e;
import ui1.i;

/* loaded from: classes2.dex */
public final class a extends e implements ui1.a {

    /* renamed from: n, reason: collision with root package name */
    public int f122327n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f122328o;

    /* renamed from: p, reason: collision with root package name */
    public int f122329p;

    /* renamed from: q, reason: collision with root package name */
    public int f122330q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f122331r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        this.f122327n = c.W(pinRepView, wy1.b.grid_cell_expand_tappable_size);
        this.f122328o = new Rect();
    }

    public final void G(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        A(displayState.f122332a);
        this.f122331r = displayState.f122333b;
        int i13 = displayState.f122334c;
        View view = this.f121492a;
        this.f122329p = c.W(view, i13) / 2;
        this.f122327n = c.W(view, displayState.f122335d);
        Integer num = displayState.f122336e;
        if (num != null) {
            this.f122330q = c.W(view, num.intValue());
        }
    }

    public final boolean H() {
        return this.f122331r;
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return this.f122328o.contains(i13, i14) ? i.f122296a : ui1.b.f122290a;
    }

    @Override // pj1.e, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i18 = this.f100289m;
        if (this.f122331r) {
            i17 = this.f122327n;
            i18 += i17;
        } else {
            i17 = 0;
        }
        int i19 = i17;
        int i23 = this.f122330q;
        int D = D(i13 + i23, i15 - i23, this.f122327n);
        int i24 = this.f122330q;
        int E = E(i13 + i24, i15 - i24, this.f122327n);
        int i25 = this.f122327n + i18;
        Rect rect = this.f122328o;
        rect.set(D, i18, E, i25);
        this.f100282f.Q.set(rect.centerX() - this.f122329p, rect.centerY() - this.f122329p, rect.centerX() + this.f122329p, rect.centerY() + this.f122329p);
        super.r(canvas, i13, i19, i15, i16);
    }
}
