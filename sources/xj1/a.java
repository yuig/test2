package xj1;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import jj1.e;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import u50.n;
import ua2.b1;
import ua2.f1;
import ua2.z0;
import wa2.b0;
import wa2.l;

/* loaded from: classes5.dex */
public final class a extends f1 implements e {

    /* renamed from: f, reason: collision with root package name */
    public final b0 f135156f;

    /* renamed from: g, reason: collision with root package name */
    public int f135157g;

    /* renamed from: h, reason: collision with root package name */
    public int f135158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView) {
        super(pinRepView, b1.FIXED);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Context context = pinRepView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f135156f = new b0(context);
    }

    public final void A(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        String str = displayState.f135160b;
        b0 b0Var = this.f135156f;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        b0Var.f128669n = str;
        String str2 = displayState.f135161c;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        b0Var.f128670o = str2;
        n cornerRadius = displayState.f135159a;
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        b0Var.f128678w = cornerRadius.a(b0Var.f128667l).intValue();
    }

    public final void B(boolean z13) {
        a0.x(this.f121492a, this.f135156f, z13, 48);
    }

    @Override // jj1.e
    public final void b(int i13, int i14, int i15) {
        this.f135157g = i14;
        this.f135158h = i15;
    }

    @Override // ua2.f1
    public final l k() {
        return this.f135156f;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f135156f.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int i15 = this.f135158h;
        b0 b0Var = this.f135156f;
        b0Var.g(i15);
        b0Var.f(i13);
        b0Var.e(this.f135157g);
        b0Var.h();
        return new z0(b0Var.f128841d, b0Var.f128842e);
    }
}
