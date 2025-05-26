package e82;

import a.cb;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final cr1.e f57831a;

    /* renamed from: b, reason: collision with root package name */
    public final a f57832b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f57833c;

    /* renamed from: d, reason: collision with root package name */
    public String f57834d;

    /* renamed from: e, reason: collision with root package name */
    public String f57835e;

    /* renamed from: f, reason: collision with root package name */
    public String f57836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f57837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f57838h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.f f57839i;

    /* renamed from: j, reason: collision with root package name */
    public final uk2.f f57840j;

    /* renamed from: k, reason: collision with root package name */
    public String f57841k;

    /* renamed from: l, reason: collision with root package name */
    public String f57842l;

    /* renamed from: m, reason: collision with root package name */
    public String f57843m;

    public f(cr1.e autoPublishService, a autoOrgService, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(autoPublishService, "autoPublishService");
        Intrinsics.checkNotNullParameter(autoOrgService, "autoOrgService");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f57831a = autoPublishService;
        this.f57832b = autoOrgService;
        this.f57833c = pinalytics;
        this.f57839i = cb.r("create(...)");
        this.f57840j = cb.r("create(...)");
    }

    public final kk2.l a(w network) {
        Intrinsics.checkNotNullParameter(network, "network");
        String apiParam = network.getApiParam();
        Intrinsics.checkNotNullExpressionValue(apiParam, "getApiParam(...)");
        kk2.t l13 = this.f57831a.a(apiParam, n00.b.a(n00.c.BOARD_VIEW)).r(tk2.e.f118017c).l(wj2.c.a());
        int i13 = 0;
        b bVar = new b(i13, new d(this, i13));
        int i14 = 1;
        xj2.c o13 = l13.o(bVar, new b(i14, new d(this, i14)));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        return (kk2.l) o13;
    }

    public final kk2.t b(w network, boolean z13) {
        Intrinsics.checkNotNullParameter(network, "network");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String str = this.f57834d;
        if (str != null) {
        }
        hashMap.put("is_ingestion_enabled", z13 ? "False" : "True");
        int i13 = 0;
        if (!z13) {
            hashMap2.put("publish_all", String.valueOf(false));
            hashMap.put("is_backfilled", String.valueOf(false));
        }
        hashMap2.put("action", z13 ? "pause" : "unpause");
        String apiParam = network.getApiParam();
        Intrinsics.checkNotNullExpressionValue(apiParam, "getApiParam(...)");
        uj2.b0<vd0.c> b13 = this.f57831a.b(apiParam, hashMap);
        b bVar = new b(2, new e(this, network, hashMap2, i13));
        b13.getClass();
        return pk2.f.k(new kk2.g(new kk2.g(b13, bVar, 3), new b(3, new e(this, network, hashMap2, 1)), 1).r(tk2.e.f118017c), "observeOn(...)");
    }

    public final kk2.b c(w network, boolean z13) {
        Intrinsics.checkNotNullParameter(network, "network");
        lb0.m c13 = ((lb0.b) this.f57832b.f57815a).c();
        c13.putBoolean("auto_org_enabled", z13);
        c13.apply();
        vd0.c cVar = new vd0.c();
        cVar.s("auto_org_enabled", Boolean.FALSE);
        kk2.b j13 = uj2.b0.j(cVar);
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }
}
