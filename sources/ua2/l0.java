package ua2;

import android.content.Context;
import android.graphics.Canvas;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final int f121559j;

    /* renamed from: k, reason: collision with root package name */
    public final vn1.c f121560k;

    /* renamed from: l, reason: collision with root package name */
    public final wa2.t f121561l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(LegoPinGridCellImpl legoGridCell, Context context, int i13, vn1.c ratingColor) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ratingColor, "ratingColor");
        this.f121559j = i13;
        this.f121560k = ratingColor;
        this.f121561l = new wa2.t(context, i13);
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121561l;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121559j;
        int i18 = i13 + i17;
        int i19 = this.f121497h;
        int i23 = i15 - i17;
        int i24 = this.f121498i;
        wa2.t tVar = this.f121561l;
        tVar.setBounds(i18, i19, i23, i24);
        tVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        wa2.t tVar = this.f121561l;
        tVar.g(i14);
        tVar.f(i13);
        tVar.h();
        return new z0(i13, tVar.f128842e);
    }
}
