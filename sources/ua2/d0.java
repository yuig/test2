package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final int f121477j;

    /* renamed from: k, reason: collision with root package name */
    public final g1 f121478k;

    /* renamed from: l, reason: collision with root package name */
    public final ta2.a f121479l;

    /* renamed from: m, reason: collision with root package name */
    public final va2.k f121480m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f121481n;

    /* renamed from: o, reason: collision with root package name */
    public String f121482o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LegoPinGridCellImpl legoGridCell, int i13, LegoPinGridCellImpl trackingDataProvider, rm1.c defaultIconColor, ta2.a aVar) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
        Intrinsics.checkNotNullParameter(defaultIconColor, "defaultIconColor");
        this.f121477j = i13;
        this.f121478k = trackingDataProvider;
        this.f121479l = aVar;
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f121480m = new va2.k(context, defaultIconColor);
    }

    @Override // ua2.h0
    public final boolean A() {
        return false;
    }

    @Override // ua2.h0
    public final boolean B() {
        if (!this.f121481n) {
            return false;
        }
        LegoPinGridCell legoPinGridCell = this.f121502f;
        kg.p.Z(this.f121478k, legoPinGridCell.getG(), this.f121482o, this.f121479l, legoPinGridCell);
        return false;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        boolean contains = this.f121480m.h().contains(i13, i14);
        this.f121481n = contains;
        return contains;
    }

    @Override // ua2.h0
    public final Integer D() {
        return !this.f121481n ? 0 : null;
    }

    public final void E(String str) {
        this.f121482o = str;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121480m;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121477j;
        int i18 = i13 + i17;
        int i19 = this.f121497h;
        int i23 = i15 - i17;
        int i24 = this.f121498i;
        va2.k kVar = this.f121480m;
        kVar.setBounds(i18, i19, i23, i24);
        kVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.k kVar = this.f121480m;
        BitmapDrawable bitmapDrawable = kVar.f125398n;
        kVar.e(Math.max(bitmapDrawable.getIntrinsicHeight(), bitmapDrawable.getIntrinsicWidth()));
        return new z0(i13, kVar.f128842e);
    }
}
