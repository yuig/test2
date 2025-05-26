package vj1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bs1.c;
import kotlin.jvm.internal.Intrinsics;
import pj1.d;
import pj1.e;
import ui1.j;

/* loaded from: classes5.dex */
public final class a extends e implements ui1.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f125923n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f125924o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View pinRepView) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        this.f125923n = c.W(pinRepView, wy1.b.grid_cell_expand_tappable_size);
        this.f125924o = new Rect();
    }

    public final void G(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        A(displayState.f125925a);
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return this.f125924o.contains(i13, i14) ? j.f122297a : ui1.b.f122290a;
    }

    @Override // pj1.e, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d dVar = this.f100285i;
        d dVar2 = d.BOTTOM;
        int i17 = this.f125923n;
        int i18 = dVar == dVar2 ? this.f100288l - i17 : 0;
        this.f125924o.set(D(i13, i15, i17), i18, E(i13, i15, i17), i17 + i18);
        super.r(canvas, i13, 0, i15, i16);
    }
}
