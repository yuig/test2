package kv0;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.f1;
import java.util.HashMap;
import jk2.a0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import x02.a2;

/* loaded from: classes5.dex */
public final class s extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final jv0.i f81003k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81004l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f81005m;

    /* renamed from: n, reason: collision with root package name */
    public final jv0.o f81006n;

    /* renamed from: o, reason: collision with root package name */
    public final aq.e f81007o;

    /* renamed from: p, reason: collision with root package name */
    public final yi0.a f81008p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jv0.i taggedProductsProvider, String str, d0 pinalytics, jv0.o listener, aq.e eVar) {
        super(null);
        Intrinsics.checkNotNullParameter(taggedProductsProvider, "taggedProductsProvider");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81003k = taggedProductsProvider;
        this.f81004l = str;
        this.f81005m = pinalytics;
        this.f81006n = listener;
        this.f81007o = eVar;
        yi0.a aVar = new yi0.a(listener);
        this.f81008p = aVar;
        o(0, aVar);
        g(nl.b.s(taggedProductsProvider.b(), new r(this, 1), null, null, 6));
        g(nl.b.s(taggedProductsProvider.d(), new r(this, 2), null, null, 6));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // xk1.c
    public final uj2.q k() {
        uj2.q e13 = this.f81003k.e();
        ev0.g gVar = new ev0.g(7, new r(this, 0));
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        e13.getClass();
        a0 a0Var = new a0(e13, gVar, a2Var, cVar);
        Intrinsics.checkNotNullExpressionValue(a0Var, "doOnNext(...)");
        return a0Var;
    }

    public final void v(f1 f1Var, String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        String str2 = this.f81004l;
        if (str2 != null) {
        }
        bs1.c.G1("pin_id", str, hashMap);
        bs1.c.G1("is_sticker_tag", bool != null ? bool.booleanValue() ? "0" : SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : null, hashMap);
        aq.e eVar = this.f81007o;
        if (eVar != null) {
            hashMap.put("pin_type", eVar.toString());
        }
        d0.B(this.f81005m, f1Var, null, null, hashMap, 22);
    }
}
