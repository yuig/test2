package ic1;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import u40.c0;

/* loaded from: classes5.dex */
public final class f extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public jc1.g f72077k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f72078l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f72079m;

    /* renamed from: n, reason: collision with root package name */
    public final Function1 f72080n;

    /* renamed from: o, reason: collision with root package name */
    public final oc.c f72081o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f72082p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jc1.g gVar, boolean z13, boolean z14, jc1.d allPinsOptionChanged, oc.c apolloClient) {
        super(null);
        Intrinsics.checkNotNullParameter(allPinsOptionChanged, "allPinsOptionChanged");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        this.f72077k = gVar;
        this.f72078l = z13;
        this.f72079m = z14;
        this.f72080n = allPinsOptionChanged;
        this.f72081o = apolloClient;
        this.f72082p = new LinkedHashMap();
        o(7, new ac1.j(9));
        o(1, new ac1.j(10));
        o(6, new ac1.j(11));
        o(8, new ac1.j(12));
        o(2, new ac1.j(13));
        o(0, new ac1.j(14));
        o(5, new ac1.j(15));
        o(4, new ac1.j(16));
        o(9, new h90.m(this, 22));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((v) CollectionsKt.F0(this.f135191h).get(i13)).f72091a;
    }

    @Override // xk1.c
    public final uj2.q k() {
        oc.a c13 = this.f72081o.c(new c0());
        d7.b.E(c13, vc.f.NetworkOnly);
        int i13 = 1;
        int i14 = 2;
        uj2.q u13 = new kk2.g(com.bumptech.glide.d.u0(c13).k(new a(i13, new e(this, 0))), new ec1.a(3, new e(this, i13)), 3).k(new a(i14, new e(this, i14))).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    @Override // xk1.c, wk1.e
    public final void onUnbind() {
        this.f72077k = null;
        super.onUnbind();
    }

    @Override // xk1.c, vq0.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void u1(int i13, v item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.u1(i13, item);
        this.f72082p.put(k0.f80436a.b(item.getClass()), item);
    }
}
