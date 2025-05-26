package id1;

import android.os.Handler;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.ProductFilterIconV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jk2.j1;
import jk2.x;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mk2.k;
import oa2.p;
import uj2.q;
import v.s;
import wk1.i;
import wk1.n;
import xk2.v;
import yq0.t;
import zd1.m;
import zd1.o;

/* loaded from: classes5.dex */
public class g extends n implements de1.c, m, xd1.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f72153a;

    /* renamed from: b, reason: collision with root package name */
    public final nr0.m f72154b;

    /* renamed from: c, reason: collision with root package name */
    public final p f72155c;

    /* renamed from: d, reason: collision with root package name */
    public final v f72156d;

    /* renamed from: e, reason: collision with root package name */
    public final v f72157e;

    /* renamed from: f, reason: collision with root package name */
    public final v f72158f;

    /* renamed from: g, reason: collision with root package name */
    public final a f72159g;

    /* renamed from: h, reason: collision with root package name */
    public final v f72160h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f72161i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h presenterParams, nr0.m dynamicGridViewBinderDelegateFactory, p legoUserRepPresenterFactory) {
        super(presenterParams.f72162a);
        Intrinsics.checkNotNullParameter(presenterParams, "presenterParams");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        this.f72153a = presenterParams;
        this.f72154b = dynamicGridViewBinderDelegateFactory;
        this.f72155c = legoUserRepPresenterFactory;
        this.f72156d = xk2.m.b(c.f72142i);
        this.f72157e = xk2.m.b(new b(this, 0));
        this.f72158f = xk2.m.b(new b(this, 2));
        this.f72159g = new a(this, 0);
        this.f72160h = xk2.m.b(new b(this, 3));
        this.f72161i = true;
    }

    @Override // wk1.q
    public void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(v3());
    }

    @Override // xd1.a
    /* renamed from: getShouldParseResponse */
    public final boolean getShouldParseDynamicHeights() {
        return this.f72161i;
    }

    @Override // zd1.m
    public final void r1(boolean z13) {
        ((Handler) this.f72156d.getValue()).post(new s(this, z13, 7));
    }

    public void subscribeToUiUpdates() {
        gb2.f fVar = gb2.f.f64747a;
        k kVar = gl1.c.f65741g;
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(15, f.f72149j);
        dVar.getClass();
        int i13 = 2;
        x xVar = new x(new j1(new j1(pk2.f.j(new j1(dVar, aVar, 0), new qt.b(15, f.f72150k), 2, "filter(...)"), new f5.g(false, 3), 0), new qt.a(15, new e(this, 1)), 0), new qt.b(15, f.f72151l), 2);
        if (kVar != null) {
            xVar.A(kVar);
        }
        xj2.c F = xVar.F(new rr.c(5, new e(this, i13)), ck2.i.f27925e, ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void u3() {
        if (isBound()) {
            ((t) ((gd1.c) getView())).resetRecyclerScrollListener();
            v3().Z();
            ((Handler) this.f72156d.getValue()).post(new s81.g(this, 3));
        }
    }

    @Override // xd1.a
    public final void updateFixedHeightImageSpec(bb2.e fixedHeightImageSpec) {
        Intrinsics.checkNotNullParameter(fixedHeightImageSpec, "fixedHeightImageSpec");
        ((Handler) this.f72156d.getValue()).post(new a11.p(12, fixedHeightImageSpec, this));
    }

    public hd1.b v3() {
        return (hd1.b) this.f72160h.getValue();
    }

    public final hd1.c w3() {
        h hVar = this.f72153a;
        HashMap hashMap = hVar.f72165d;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        q<Boolean> networkStateStream = getNetworkStateStream();
        Object obj = this.f72159g.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        nr0.k kVar = (nr0.k) obj;
        wk1.c cVar = hVar.f72162a;
        yk1.v vVar = cVar.f130137h;
        k81.k kVar2 = hVar.f72167f;
        kVar2.a(this);
        Unit unit = Unit.f80348a;
        return new hd1.c(hashMap, hVar.f72164c, presenterPinalytics, networkStateStream, kVar, vVar, hVar.f72163b, hVar.f72166e, kVar2, hVar.f72171j, hVar.f72172k, hVar.f72173l, new e(this, 0), new gv0.b(this, 23), hVar.f72174m, hVar.f72175n, hVar.f72176o, cVar.f130131b.f103320a, hVar.f72177p, hVar.f72178q, hVar.f72179r, hVar.f72180s, hVar.f72181t, hVar.f72182u, this.f72155c, hVar.f72183v, hVar.f72184w, hVar.f72185x, hVar.f72186y, hVar.f72187z, hVar.A, hVar.B, hVar.C, hVar.D, hVar.E);
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: x3 */
    public void r3(gd1.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        subscribeToUiUpdates();
    }

    @Override // de1.g
    /* renamed from: z3 */
    public void g2(HashMap filterApiSpec, ArrayList selectedProductFilters, int i13, de1.a filterAction) {
        Intrinsics.checkNotNullParameter(filterApiSpec, "filterApiSpec");
        Intrinsics.checkNotNullParameter(selectedProductFilters, "selectedProductFilters");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        if (isBound()) {
            hd1.b v33 = v3();
            List list = o.f141736j;
            v33.h0(o.f141736j, filterApiSpec);
            yk1.n view = getView();
            Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.shopping.baseshoppingfeed.BaseShoppingFeedContract.BaseShoppingFeedView.ShoppingProductFilterView");
            ProductFilterIconV2 productFilterIconV2 = ((jd1.d) ((gd1.b) view)).W0;
            if (productFilterIconV2 != null) {
                productFilterIconV2.c(i13);
            }
            o oVar = this.f72153a.f72168g;
            if (oVar != null) {
                oVar.f(selectedProductFilters);
            }
            u3();
        }
    }
}
