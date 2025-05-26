package kj1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import hs1.q;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pk.a0;
import ua2.b1;
import ua2.f1;
import ua2.z0;
import wa2.l;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class f extends f1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f79852f;

    /* renamed from: g, reason: collision with root package name */
    public e f79853g;

    /* renamed from: h, reason: collision with root package name */
    public final v f79854h;

    /* renamed from: i, reason: collision with root package name */
    public int f79855i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SbaPinRep pinRepView, q imageCache) {
        super(pinRepView, b1.FIXED);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f79852f = pinRepView.getResources().getDimensionPixelSize(r0.attribution_badge_container_padding);
        this.f79853g = e.END;
        this.f79854h = m.b(new p91.v(25, pinRepView, imageCache));
    }

    public final void A(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f79853g = displayState.f79848b;
        oe.f fVar = displayState.f79847a;
        if (fVar instanceof d) {
            C().h(((d) fVar).i1(), new mp0.b(1, this, displayState));
        } else if (fVar instanceof c) {
            E(((c) fVar).i1());
        }
    }

    public final void B(boolean z13) {
        va2.d C = C();
        if (C != null) {
            a0.x(this.f121492a, C, z13, null);
        }
    }

    public final va2.d C() {
        return (va2.d) this.f79854h.getValue();
    }

    public final void D(int i13) {
        this.f79855i = i13;
    }

    public final void E(Integer num) {
        Drawable drawable;
        View view = this.f121492a;
        if (num != null) {
            Context context = view.getContext();
            int intValue = num.intValue();
            Object obj = d5.a.f53679a;
            drawable = context.getDrawable(intValue);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            C().k(drawable);
            view.requestLayout();
            view.invalidate();
        }
    }

    @Override // ua2.f1
    public final l k() {
        return C();
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (C().f128846i) {
            return;
        }
        int i18 = this.f79852f;
        int w13 = w() + i18;
        boolean z13 = this.f121494c;
        if (!(z13 && this.f79853g == e.START) && (z13 || this.f79853g != e.END)) {
            i17 = this.f79855i + i13 + i18;
        } else {
            i17 = i15 - ((x() + i18) + this.f79855i);
        }
        int x13 = x() + i17;
        C().j(i17, i18, x13, w13);
        C().l(i17, i18, x13, w13);
        C().draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        C().g(i14);
        C().i();
        return new z0(C().f128841d, C().f128842e);
    }
}
