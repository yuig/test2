package dj1;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import ua2.d1;
import ua2.z0;
import wa2.l;
import wa2.t;

/* loaded from: classes5.dex */
public final class b extends d1 {

    /* renamed from: h, reason: collision with root package name */
    public final int f55151h;

    /* renamed from: i, reason: collision with root package name */
    public final t f55152i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SbaPinRep pinRepView) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        int dimensionPixelSize = pinRepView.getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_no_card_padding);
        this.f55151h = dimensionPixelSize;
        Context context = pinRepView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f55152i = new t(context, dimensionPixelSize);
    }

    public final void A(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f55152i.i(displayState.f55148a, Integer.valueOf(displayState.f55149b), displayState.f55150c);
    }

    @Override // ua2.f1
    public final l k() {
        return this.f55152i;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f55151h;
        int i18 = i13 + i17;
        int i19 = this.f121483f;
        int i23 = i15 - i17;
        int i24 = this.f121484g;
        t tVar = this.f55152i;
        tVar.setBounds(i18, i19, i23, i24);
        tVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        t tVar = this.f55152i;
        tVar.g(i14);
        tVar.f(i13);
        tVar.h();
        return new z0(i13, tVar.f128842e);
    }
}
