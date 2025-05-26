package ua2;

import android.graphics.Canvas;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final int f121613j;

    /* renamed from: k, reason: collision with root package name */
    public final g1 f121614k;

    /* renamed from: l, reason: collision with root package name */
    public final a1 f121615l;

    /* renamed from: m, reason: collision with root package name */
    public final h1 f121616m;

    /* renamed from: n, reason: collision with root package name */
    public final va2.n f121617n;

    /* renamed from: o, reason: collision with root package name */
    public qa2.a f121618o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(LegoPinGridCell legoGridCell, int i13, g1 trackingDataProvider, a1 navigationManager, h1 utilsProvider) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(utilsProvider, "utilsProvider");
        this.f121613j = i13;
        this.f121614k = trackingDataProvider;
        this.f121615l = navigationManager;
        this.f121616m = utilsProvider;
        this.f121617n = new va2.n(legoGridCell);
        this.f121618o = qa2.a.UNDEFINED;
    }

    @Override // ua2.h0
    public final boolean B() {
        wy0 wy0Var;
        qa2.a aVar = this.f121618o;
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this.f121614k;
        f30 f30Var = legoPinGridCellImpl.C0;
        Intrinsics.f(f30Var);
        nx.d0 d0Var = legoPinGridCellImpl.W1;
        h32.g0 Y = legoPinGridCellImpl.Y();
        switch (u0.f121610a[aVar.ordinal()]) {
            case 1:
                h32.u0 u0Var = h32.u0.PIN_INTEREST;
                zs t63 = f30Var.t6();
                r5 = t63 != null ? t63.getUid() : null;
                if (r5 == null) {
                    r5 = "";
                }
                d0Var.b0(u0Var, Y, r5, false);
                break;
            case 2:
                if (b40.N(f30Var) != null) {
                    d0Var.b0(h32.u0.PIN_CELL_BUTTON_PROMOTED_PIN_SOURCE, Y, f30Var.getUid(), false);
                    break;
                }
                break;
            case 3:
                v7 D3 = f30Var.D3();
                if (D3 != null) {
                    d0Var.b0(h32.u0.PIN_BOARD, Y, D3.getUid(), false);
                    break;
                }
                break;
            case 4:
                d0Var.b0(h32.u0.PIN_USER, Y, b40.H(f30Var), false);
                break;
            case 5:
                d0Var.b0(h32.u0.PIN_USER, Y, b40.C(f30Var), false);
                break;
            case 6:
                d0Var.b0(h32.u0.PIN_BOARD, Y, b40.i(f30Var), false);
                break;
            case 7:
                h32.u0 u0Var2 = h32.u0.PIN_USER;
                c1 c1Var = this.f121617n.f125418o;
                if (c1Var != null && (wy0Var = c1Var.f121468q) != null) {
                    r5 = wy0Var.getUid();
                }
                d0Var.b0(u0Var2, Y, r5, false);
                break;
            case 8:
                ((LegoPinGridCellImpl) this.f121616m).getClass();
                vb0.j.f125466a.G("Attribution type is unknown", new Object[0]);
                break;
        }
        return ((LegoPinGridCellImpl) this.f121615l).f2();
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return this.f121617n.getBounds().contains(i13, i14);
    }

    @Override // ua2.h0
    public final Integer D() {
        return 0;
    }

    public final void E() {
        va2.n nVar = this.f121617n;
        nVar.getClass();
        vn1.g gVar = vn1.g.BODY_100;
        vn1.b bVar = vn1.b.START;
        nVar.f125423t.a(new va2.m(bVar, gVar, 0));
        nVar.f125424u.a(new va2.m(bVar, gVar, 1));
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121617n;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121613j;
        int i18 = i13 + i17;
        int i19 = this.f121497h;
        int i23 = i15 - i17;
        int i24 = this.f121498i;
        va2.n nVar = this.f121617n;
        nVar.setBounds(i18, i19, i23, i24);
        nVar.draw(canvas);
        u(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(java.lang.String.valueOf(r10 != null ? r10.getText() : null), r5.f121470s) == false) goto L23;
     */
    @Override // ua2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ua2.z0 y(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.v0.y(int, int):ua2.z0");
    }
}
