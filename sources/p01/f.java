package p01;

import com.pinterest.api.model.f30;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import de1.d0;
import dl1.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import jk2.x;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import xk2.v;
import zd1.c0;

/* loaded from: classes5.dex */
public final class f implements ov1.d, d0, g {

    /* renamed from: a, reason: collision with root package name */
    public final String f98361a;

    /* renamed from: b, reason: collision with root package name */
    public final o f98362b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f98363c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f98364d;

    /* renamed from: e, reason: collision with root package name */
    public final v f98365e;

    /* renamed from: f, reason: collision with root package name */
    public final v f98366f;

    /* renamed from: g, reason: collision with root package name */
    public a f98367g;

    /* renamed from: h, reason: collision with root package name */
    public String f98368h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f98369i;

    /* renamed from: j, reason: collision with root package name */
    public String f98370j;

    public f(String queryPinId, o relatedPinsFilteringPresenterListener, nx.d0 pinalytics, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(queryPinId, "queryPinId");
        Intrinsics.checkNotNullParameter(relatedPinsFilteringPresenterListener, "relatedPinsFilteringPresenterListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f98361a = queryPinId;
        this.f98362b = relatedPinsFilteringPresenterListener;
        this.f98363c = pinalytics;
        this.f98364d = crashReporting;
        this.f98365e = xk2.m.b(new b(this, 1));
        this.f98366f = xk2.m.b(new b(this, 0));
        this.f98367g = a.UNFILTERED;
        this.f98369i = new ArrayList();
    }

    @Override // de1.d0
    public final void Z(ArrayList appliedProductFilters) {
        boolean z13;
        Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
        super.Z(appliedProductFilters);
        this.f98369i = appliedProductFilters;
        c0 c0Var = new c0(new ArrayList());
        g3.D2(c0Var, appliedProductFilters, true, true);
        ArrayList<zd1.h> arrayList = this.f98369i;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (zd1.h hVar : arrayList) {
                if (hVar.c() == t32.f.PRODUCT_ON_SALE || hVar.c() == t32.f.PRODUCT_PRICE) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        o oVar = this.f98362b;
        oVar.updatePriceVisibilityOnGrid(z13);
        if (oVar.isBoundToView()) {
            a aVar = this.f98367g;
            a aVar2 = c0Var.getFilterSpecs().isEmpty() ^ true ? a.FILTERED : a.UNFILTERED;
            this.f98367g = aVar2;
            a aVar3 = a.FILTERED;
            boolean z14 = aVar == aVar3 && aVar2 == a.UNFILTERED;
            boolean z15 = aVar == a.UNFILTERED && aVar2 == aVar3;
            boolean z16 = aVar == aVar3 && aVar2 == aVar3;
            v vVar = this.f98365e;
            if (!z15) {
                if (z14) {
                    oVar.onPinsLoadStartedAfterFilterUpdate();
                    a().Z();
                    oVar.setActiveRelatedPagedList((h0) vVar.getValue());
                    c((h0) vVar.getValue());
                    ((h0) vVar.getValue()).i2();
                    return;
                }
                if (z16) {
                    oVar.onPinsLoadStartedAfterFilterUpdate();
                    a().Z();
                    oVar.setActiveRelatedPagedList(a());
                    c(a());
                    String unifiedFiltersApiSpec = c0Var.a();
                    this.f98368h = unifiedFiltersApiSpec;
                    if (unifiedFiltersApiSpec != null) {
                        com.pinterest.feature.pin.closeup.datasource.c a13 = a();
                        a13.getClass();
                        Intrinsics.checkNotNullParameter(unifiedFiltersApiSpec, "unifiedFiltersApiSpec");
                        f0 N = a13.N();
                        if (N != null) {
                            N.e("applied_unified_filters", unifiedFiltersApiSpec);
                        }
                    }
                    a().i2();
                    return;
                }
                return;
            }
            oVar.onPinsLoadStartedAfterFilterUpdate();
            h0 h0Var = (h0) vVar.getValue();
            Iterator it = ((h0) vVar.getValue()).d().iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (((s) it.next()) instanceof f30) {
                    break;
                } else {
                    i13++;
                }
            }
            int size = h0Var.d().size();
            int i14 = size - 1;
            if (i13 >= 0 && i13 < h0Var.d().size() && i14 >= 0 && i14 < h0Var.d().size()) {
                h0Var.Y(i13, size);
            }
            h0Var.f49123m.dispose();
            h0Var.f49124n.cancel((CancellationException) null);
            h0Var.A = false;
            c(a());
            oVar.setActiveRelatedPagedList(a());
            String unifiedFiltersApiSpec2 = c0Var.a();
            this.f98368h = unifiedFiltersApiSpec2;
            if (unifiedFiltersApiSpec2 != null) {
                com.pinterest.feature.pin.closeup.datasource.c a14 = a();
                a14.getClass();
                Intrinsics.checkNotNullParameter(unifiedFiltersApiSpec2, "unifiedFiltersApiSpec");
                f0 N2 = a14.N();
                if (N2 != null) {
                    N2.e("applied_unified_filters", unifiedFiltersApiSpec2);
                }
            }
            a().n();
        }
    }

    public final com.pinterest.feature.pin.closeup.datasource.c a() {
        return (com.pinterest.feature.pin.closeup.datasource.c) this.f98366f.getValue();
    }

    public final void b() {
        a().P(a().f49127q.size(), new o01.c());
    }

    public final void c(h0 h0Var) {
        uk2.f fVar = h0Var.f49129s;
        bv0.k kVar = new bv0.k(23, e.f98358j);
        fVar.getClass();
        int i13 = 2;
        xj2.c o13 = new x(fVar, kVar, i13).s().o(new com.pinterest.feature.pin.i(6, new d(this, h0Var, i13)), new com.pinterest.feature.pin.i(7, new d(this, h0Var, 3)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        this.f98362b.addDisposableToTrack(o13);
    }
}
