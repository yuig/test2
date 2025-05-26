package yj1;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ti1.w;
import ua2.d1;
import ua2.z0;
import ui1.h;
import wa2.l;

/* loaded from: classes2.dex */
public final class a extends d1 implements ui1.a {

    /* renamed from: h, reason: collision with root package name */
    public final e f139205h;

    /* renamed from: i, reason: collision with root package name */
    public Function0 f139206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Context context = pinRepView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f139205h = new e(context);
    }

    public final void A(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f139205h.h(displayState.e());
    }

    public final void B(w eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        return this.f139205h.j().contains(i13, i14) ? h.f122295a : ui1.b.f122290a;
    }

    @Override // ua2.f1
    public final l k() {
        return this.f139205h;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        e eVar = this.f139205h;
        boolean z13 = eVar.f128838a;
        int i17 = z13 ? 0 : i15 - eVar.f128841d;
        if (z13) {
            i15 = eVar.f128841d;
        }
        eVar.setBounds(i17, this.f121483f, i15, this.f121484g);
        eVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        e eVar = this.f139205h;
        eVar.k();
        return new z0(i13, eVar.f128842e);
    }
}
