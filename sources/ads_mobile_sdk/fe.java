package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fe implements a.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final a.v7 f5121a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f5122b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.k f5123c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5124d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5125e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5126f;

    /* renamed from: g, reason: collision with root package name */
    public final h92 f5127g;

    public fe(a.o8 renderComponentProvider, ss2 traceMetaSet, wi.k baseRequest, long j13, int i13, String requestId, h92 requestType) {
        Intrinsics.checkNotNullParameter(renderComponentProvider, "renderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f5121a = renderComponentProvider;
        this.f5122b = traceMetaSet;
        this.f5123c = baseRequest;
        this.f5124d = j13;
        this.f5125e = i13;
        this.f5126f = requestId;
        this.f5127g = requestType;
    }

    @Override // a.p4
    public final a.x1 a(cf2 serverTransaction, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        x00 x00Var = (x00) this.f5121a.get();
        wi.k kVar = this.f5123c;
        x00Var.getClass();
        kVar.getClass();
        x00Var.f13339g = kVar;
        adConfiguration.getClass();
        x00Var.f13335c = adConfiguration;
        vo voVar = serverTransaction.f3893b.f14212b;
        voVar.getClass();
        x00Var.f13334b = voVar;
        x00Var.f13336d = serverTransaction;
        h92 h92Var = this.f5127g;
        h92Var.getClass();
        x00Var.f13340h = h92Var;
        o52 o52Var = this.f5122b.f11215a;
        o52Var.getClass();
        x00Var.f13342j = o52Var;
        v01 v01Var = this.f5122b.f11216b;
        v01Var.getClass();
        x00Var.f13343k = v01Var;
        String str = this.f5126f;
        str.getClass();
        x00Var.f13341i = str;
        x00Var.f13337e = Long.valueOf(this.f5124d);
        x00Var.f13338f = Integer.valueOf(this.f5125e);
        kh2.a1.k(vo.class, x00Var.f13334b);
        kh2.a1.k(r0.class, x00Var.f13335c);
        kh2.a1.k(cf2.class, x00Var.f13336d);
        kh2.a1.k(Long.class, x00Var.f13337e);
        kh2.a1.k(Integer.class, x00Var.f13338f);
        kh2.a1.k(wi.k.class, x00Var.f13339g);
        kh2.a1.k(h92.class, x00Var.f13340h);
        kh2.a1.k(String.class, x00Var.f13341i);
        kh2.a1.k(o52.class, x00Var.f13342j);
        kh2.a1.k(v01.class, x00Var.f13343k);
        return (a.x1) new y00(x00Var.f13333a, x00Var.f13334b, x00Var.f13335c, x00Var.f13336d, x00Var.f13337e, x00Var.f13338f, x00Var.f13339g, x00Var.f13340h, x00Var.f13342j, x00Var.f13343k).f13929t.get();
    }
}
