package qj1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bs1.c;
import kotlin.jvm.internal.Intrinsics;
import pj1.e;
import ui1.d;

/* loaded from: classes5.dex */
public final class a extends e implements ui1.a {

    /* renamed from: n, reason: collision with root package name */
    public int f104017n;

    /* renamed from: o, reason: collision with root package name */
    public Rect f104018o;

    /* renamed from: p, reason: collision with root package name */
    public int f104019p;

    /* renamed from: q, reason: collision with root package name */
    public int f104020q;

    public final void G(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f100282f.f128846i = displayState.f104022b;
        A(displayState.f104021a);
        int i13 = displayState.f104023c;
        View view = this.f121492a;
        this.f104019p = c.W(view, i13) / 2;
        this.f104017n = c.W(view, displayState.f104024d);
        Integer num = displayState.f104025e;
        if (num != null) {
            this.f104020q = c.W(view, num.intValue());
        }
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return (this.f100282f.f128846i || !this.f104018o.contains(i13, i14)) ? ui1.b.f122290a : d.f122291a;
    }

    @Override // pj1.e, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f100289m;
        int i18 = this.f104020q;
        int i19 = i17 + i18;
        int D = D(i13 + i18, i15 - i18, this.f104017n);
        int i23 = this.f104020q;
        int E = E(i13 + i23, i15 - i23, this.f104017n);
        int i24 = this.f104017n + i19;
        Rect rect = this.f104018o;
        rect.set(D, i19, E, i24);
        this.f100282f.Q.set(rect.centerX() - this.f104019p, rect.centerY() - this.f104019p, rect.centerX() + this.f104019p, rect.centerY() + this.f104019p);
        super.r(canvas, i13, 0, i15, i16);
    }
}
