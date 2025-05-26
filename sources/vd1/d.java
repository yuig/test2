package vd1;

import es.h;
import id1.g;
import jk2.d0;
import kotlin.jvm.internal.Intrinsics;
import ls1.e;
import m60.w;
import n60.o;
import nr0.m;
import oa2.p;
import uj2.q;
import wk1.i;
import xk2.v;
import yq0.t;

/* loaded from: classes5.dex */
public final class d extends g {

    /* renamed from: j, reason: collision with root package name */
    public final String f125631j;

    /* renamed from: k, reason: collision with root package name */
    public final w f125632k;

    /* renamed from: l, reason: collision with root package name */
    public final lh0.d f125633l;

    /* renamed from: m, reason: collision with root package name */
    public final h f125634m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f125635n;

    /* renamed from: o, reason: collision with root package name */
    public e f125636o;

    /* renamed from: p, reason: collision with root package name */
    public final v f125637p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(id1.h presenterParams, String str, m dynamicGridViewBinderDelegateFactory, w eventManager, p legoUserRepPresenterFactory, lh0.d experiments, h adsCommonDisplay) {
        super(presenterParams, dynamicGridViewBinderDelegateFactory, legoUserRepPresenterFactory);
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f125631j = str;
        this.f125632k = eventManager;
        this.f125633l = experiments;
        this.f125634m = adsCommonDisplay;
        this.f125637p = xk2.m.b(new h81.b(this, 26));
    }

    @Override // id1.g, wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        super.addDataSources(dataSources);
        ((i) dataSources).b((hd1.d) this.f125637p.getValue());
    }

    @Override // wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        if (!this.f125635n) {
            super.onRecyclerRefresh();
            return;
        }
        ((t) ((gd1.c) getView())).setLoadState(yk1.i.LOADED);
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        e eVar = this.f125636o;
        if (eVar == null) {
            Intrinsics.r("pinChipEvent");
            throw null;
        }
        this.f125632k.i(eVar);
        super.onUnbind();
    }

    @Override // id1.g, wk1.n, wk1.q, yk1.p
    /* renamed from: x3 */
    public final void r3(gd1.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        id1.h hVar = this.f72153a;
        q y13 = hVar.f72162a.f130140k.y();
        ed1.g gVar = new ed1.g(28, new b(this, 0));
        ed1.g gVar2 = new ed1.g(29, c.f125628j);
        ck2.c cVar = ck2.i.f27923c;
        xj2.c F = y13.F(gVar, gVar2, cVar, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        String str = this.f125631j;
        if (str != null) {
            q L = hVar.f72162a.f130140k.L(str);
            hk2.b bVar = new hk2.b(new a(0, new b(this, 1)), new a(1, c.f125629k), cVar);
            try {
                L.d(new d0(bVar, 0L));
                addDisposable(bVar);
            } catch (NullPointerException e13) {
                throw e13;
            } catch (Throwable th3) {
                throw o.g(th3, "subscribeActual failed", th3);
            }
        }
    }
}
