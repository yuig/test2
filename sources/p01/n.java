package p01;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.tc0;
import com.pinterest.api.model.xc0;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import i01.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jk2.x;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import okhttp3.internal.Util;
import xk2.v;

/* loaded from: classes5.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f98385a;

    /* renamed from: b, reason: collision with root package name */
    public final o f98386b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f98387c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f98388d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f98389e;

    /* renamed from: f, reason: collision with root package name */
    public final v f98390f;

    /* renamed from: g, reason: collision with root package name */
    public final v f98391g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f98392h;

    /* renamed from: i, reason: collision with root package name */
    public k f98393i;

    /* renamed from: j, reason: collision with root package name */
    public d1 f98394j;

    public n(String queryPinId, o relatedPinsFilteringPresenterListener, d0 pinalytics, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(queryPinId, "queryPinId");
        Intrinsics.checkNotNullParameter(relatedPinsFilteringPresenterListener, "relatedPinsFilteringPresenterListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f98385a = queryPinId;
        this.f98386b = relatedPinsFilteringPresenterListener;
        this.f98387c = pinalytics;
        this.f98388d = crashReporting;
        this.f98389e = new ArrayList();
        this.f98390f = xk2.m.b(new l(this, 1));
        this.f98391g = xk2.m.b(new l(this, 0));
        this.f98392h = new LinkedHashMap();
        this.f98393i = k.UNFILTERED;
    }

    public final com.pinterest.feature.pin.closeup.datasource.c a() {
        return (com.pinterest.feature.pin.closeup.datasource.c) this.f98391g.getValue();
    }

    public final h0 b() {
        return (h0) this.f98390f.getValue();
    }

    public final void c() {
        o oVar = this.f98386b;
        if (oVar.isBoundToView()) {
            k kVar = this.f98393i;
            LinkedHashMap linkedHashMap = this.f98392h;
            k kVar2 = linkedHashMap.isEmpty() ? k.UNFILTERED : k.FILTERED;
            this.f98393i = kVar2;
            k kVar3 = k.FILTERED;
            boolean z13 = kVar == kVar3 && kVar2 == k.UNFILTERED;
            boolean z14 = kVar == k.UNFILTERED && kVar2 == kVar3;
            boolean z15 = kVar == kVar3 && kVar2 == kVar3;
            ArrayList arrayList = this.f98389e;
            if (!z14) {
                if (z13) {
                    oVar.onPinsLoadStartedAfterFilterUpdate();
                    a().Z();
                    oVar.setActiveRelatedPagedList(b());
                    d(b(), null);
                    b().Q(b().d().size(), arrayList);
                    return;
                }
                if (z15) {
                    oVar.onPinsLoadStartedAfterFilterUpdate();
                    a().Z();
                    oVar.setActiveRelatedPagedList(a());
                    d(a(), Util.B(linkedHashMap));
                    a().f0(e());
                    a().i2();
                    return;
                }
                return;
            }
            oVar.onPinsLoadStartedAfterFilterUpdate();
            h0 b13 = b();
            Iterator it = b().d().iterator();
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
            int size = b13.d().size();
            int i14 = size - 1;
            if (i13 >= 0 && i13 < b13.d().size() && i14 >= 0 && i14 < b13.d().size()) {
                arrayList.clear();
                arrayList.addAll(b().d().subList(i13, i14));
                b13.Y(i13, size);
            }
            b13.f49123m.dispose();
            b13.f49124n.cancel((CancellationException) null);
            b13.A = false;
            d(a(), null);
            oVar.setActiveRelatedPagedList(a());
            a().f0(e());
            a().n();
        }
    }

    public final void d(h0 h0Var, Map map) {
        uk2.f fVar = h0Var.f49129s;
        bv0.k kVar = new bv0.k(25, e.f98359k);
        fVar.getClass();
        int i13 = 2;
        xj2.c o13 = new x(fVar, kVar, i13).s().o(new com.pinterest.feature.pin.i(10, new rx0.f(map, h0Var, this, i13)), new com.pinterest.feature.pin.i(11, new m(this, h0Var, i13)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        this.f98386b.addDisposableToTrack(o13);
    }

    public final LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f98392h.entrySet()) {
            tc0 tc0Var = (tc0) entry.getKey();
            xc0 xc0Var = (xc0) entry.getValue();
            Integer u13 = tc0Var.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getTabType(...)");
            linkedHashMap.put(u13, y0.b(new Pair("tab_option_selections", e0.b(xc0Var.j()))));
        }
        return linkedHashMap;
    }
}
