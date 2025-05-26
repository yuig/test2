package ua2;

import android.graphics.Canvas;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tr;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z2;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends g0 implements i0 {

    /* renamed from: j, reason: collision with root package name */
    public final g1 f121512j;

    /* renamed from: k, reason: collision with root package name */
    public final a1 f121513k;

    /* renamed from: l, reason: collision with root package name */
    public final es.a f121514l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f121515m;

    /* renamed from: n, reason: collision with root package name */
    public final Function1 f121516n;

    /* renamed from: o, reason: collision with root package name */
    public final Function0 f121517o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f121518p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f121519q;

    /* renamed from: r, reason: collision with root package name */
    public int f121520r;

    /* renamed from: s, reason: collision with root package name */
    public final wa2.j f121521s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(LegoPinGridCellImpl parent, LegoPinGridCellImpl trackingDataProvider, LegoPinGridCellImpl navigationManager, hs1.q imageCache, es.a adFormats, qa2.u setCollectionPosition, y3.l navigateToCloseupDirectly, qa2.v navigateToCloseupComprehensive) {
        super(parent);
        wa2.j jVar;
        Intrinsics.checkNotNullParameter(parent, "legoGridCell");
        Intrinsics.checkNotNullParameter(trackingDataProvider, "trackingDataProvider");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(setCollectionPosition, "setCollectionPosition");
        Intrinsics.checkNotNullParameter(navigateToCloseupDirectly, "navigateToCloseupDirectly");
        Intrinsics.checkNotNullParameter(navigateToCloseupComprehensive, "navigateToCloseupComprehensive");
        this.f121512j = trackingDataProvider;
        this.f121513k = navigationManager;
        this.f121514l = adFormats;
        this.f121515m = setCollectionPosition;
        this.f121516n = navigateToCloseupDirectly;
        this.f121517o = navigateToCloseupComprehensive;
        Intrinsics.checkNotNullParameter(parent, "<this>");
        es.c cVar = (es.c) adFormats;
        this.f121518p = cVar.y(parent.C0);
        Intrinsics.checkNotNullParameter(parent, "<this>");
        this.f121519q = cVar.z(parent.C0);
        this.f121520r = parent.getContext().getResources().getDimensionPixelSize(this.f121518p ? m60.r0.lego_grid_cell_chips_spacing_dpa : m60.r0.lego_grid_cell_chips_spacing);
        Intrinsics.checkNotNullParameter(parent, "<this>");
        if (cVar.a(parent.C0) == cs.c.TWO_BY_TWO) {
            boolean z13 = this.f121518p;
            boolean z14 = this.f121519q;
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(imageCache, "imageCache");
            jVar = new wa2.k(parent, z13, z14, imageCache);
        } else {
            jVar = new wa2.j(parent, this.f121518p, this.f121519q, imageCache);
        }
        this.f121521s = jVar;
    }

    @Override // ua2.h0
    public final boolean B() {
        ArrayList arrayList;
        ArrayList arrayList2;
        wa2.j jVar = this.f121521s;
        int i13 = jVar.f128810o;
        f30 f30Var = null;
        f30 f30Var2 = (i13 < 0 || (arrayList2 = jVar.f128821z) == null) ? null : (f30) arrayList2.get(i13);
        String uid = f30Var2 != null ? f30Var2.getUid() : null;
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this.f121512j;
        nx.d0 d0Var = legoPinGridCellImpl.W1;
        HashMap I0 = legoPinGridCellImpl.I0();
        f30 S = com.bumptech.glide.d.S(this.f121502f);
        if (S != null && Intrinsics.d(S.d5(), Boolean.TRUE)) {
            if (!this.f121518p) {
                this.f121517o.invoke();
                return false;
            }
            this.f121515m.invoke(Integer.valueOf(jVar.f128810o + 1));
            int i14 = jVar.f128810o;
            if (i14 >= 0 && (arrayList = jVar.f128821z) != null) {
                f30Var = (f30) arrayList.get(i14);
            }
            if (f30Var != null) {
                this.f121516n.invoke(f30Var);
            }
            return true;
        }
        if (uid == null) {
            I0.put("index", String.valueOf(jVar.f128810o));
            h32.u0 u0Var = h32.u0.PRODUCT_PIN_CHIP;
            h32.g0 Y = legoPinGridCellImpl.Y();
            f30 f30Var3 = legoPinGridCellImpl.C0;
            Intrinsics.f(f30Var3);
            d0Var.f0(u0Var, Y, f30Var3.getUid(), I0, false);
        } else {
            h32.u0 u0Var2 = h32.u0.VISUAL_LINK_CHIP;
            h32.g0 Y2 = legoPinGridCellImpl.Y();
            f30 f30Var4 = legoPinGridCellImpl.C0;
            Intrinsics.f(f30Var4);
            d0Var.f0(u0Var2, Y2, f30Var4.getUid(), I0, false);
            NavigationImpl z03 = Navigation.z0(z2.a(), uid);
            LegoPinGridCellImpl legoPinGridCellImpl2 = (LegoPinGridCellImpl) this.f121513k;
            legoPinGridCellImpl2.g(z03);
            legoPinGridCellImpl2.getEventManager().d(z03);
        }
        return false;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        wa2.j jVar = this.f121521s;
        boolean l13 = jVar.l(i13, i14);
        if (l13) {
            jVar.k(i13, i14);
        }
        return l13;
    }

    public final void E(int i13) {
        this.f121521s.f128809n = i13;
    }

    public final void F() {
        this.f121521s.f128808m = true;
    }

    public final void G(List chips) {
        ArrayList arrayList;
        sr y13;
        Intrinsics.checkNotNullParameter(chips, "chips");
        LegoPinGridCell legoPinGridCell = this.f121502f;
        f30 S = com.bumptech.glide.d.S(legoPinGridCell);
        es.c cVar = (es.c) this.f121514l;
        this.f121518p = cVar.y(S);
        Intrinsics.checkNotNullParameter(legoPinGridCell, "<this>");
        this.f121519q = cVar.z(legoPinGridCell.getC0());
        this.f121520r = legoPinGridCell.getContext().getResources().getDimensionPixelSize(this.f121518p ? m60.r0.lego_grid_cell_chips_spacing_dpa : m60.r0.lego_grid_cell_chips_spacing);
        boolean z13 = this.f121518p;
        boolean z14 = this.f121519q;
        wa2.j jVar = this.f121521s;
        jVar.E = z13;
        jVar.F = z14;
        jVar.f128815t.setColor(z13 ? jVar.G : jVar.H);
        tr imageSize = tr.SIZE140x140;
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        if (chips != null) {
            arrayList = new ArrayList();
            for (Object obj : chips) {
                if (((f30) obj).A4() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty() || (arrayList.size() < 3 && !jVar.E)) {
            jVar.f128821z = null;
            return;
        }
        jVar.f128820y = new ArrayList(3);
        jVar.f128821z = new ArrayList();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 < arrayList.size()) {
                f30 f30Var = (f30) CollectionsKt.U(i13, arrayList);
                qa2.c cVar2 = (qa2.c) jVar.f128817v.get(i13);
                Map A4 = f30Var != null ? f30Var.A4() : null;
                if (A4 == null) {
                    A4 = kotlin.collections.z0.d();
                }
                if ((!A4.isEmpty()) && (y13 = b40.y(f30Var, imageSize)) != null) {
                    String j13 = y13.j();
                    String str = j13 != null ? j13 : "";
                    ArrayList arrayList2 = jVar.f128820y;
                    if (arrayList2 != null) {
                        arrayList2.add(str);
                    }
                    cVar2.f103239h = str;
                }
                if (f30Var != null) {
                    ArrayList arrayList3 = jVar.f128821z;
                    Intrinsics.g(arrayList3, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.Pin>");
                    dl2.b.t(arrayList3).add(f30Var);
                }
            } else {
                ArrayList arrayList4 = jVar.f128820y;
                if (arrayList4 != null) {
                    arrayList4.add("");
                }
            }
        }
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121521s;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f121521s.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int i15 = this.f121520r;
        wa2.j jVar = this.f121521s;
        jVar.f128814s = i15;
        jVar.j(i14, bs1.c.v0(com.bumptech.glide.d.S(this.f121502f)), i13);
        jVar.i();
        return new z0(i13, jVar.b());
    }
}
