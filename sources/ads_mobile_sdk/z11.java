package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z11 implements a.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final a.v7 f14518a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f14519b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.k f14520c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14521d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14522e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14523f;

    /* renamed from: g, reason: collision with root package name */
    public final h92 f14524g;

    public z11(a.o8 interstitialRenderComponentProvider, ss2 traceMetaSet, wi.k baseRequest, long j13, int i13, String requestId, h92 requestType) {
        Intrinsics.checkNotNullParameter(interstitialRenderComponentProvider, "interstitialRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f14518a = interstitialRenderComponentProvider;
        this.f14519b = traceMetaSet;
        this.f14520c = baseRequest;
        this.f14521d = j13;
        this.f14522e = i13;
        this.f14523f = requestId;
        this.f14524g = requestType;
    }

    @Override // a.p4
    public final a.x1 a(cf2 serverTransaction, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        u30 u30Var = (u30) this.f14518a.get();
        wi.k kVar = this.f14520c;
        u30Var.getClass();
        kVar.getClass();
        u30Var.f11822g = kVar;
        adConfiguration.getClass();
        u30Var.f11818c = adConfiguration;
        vo voVar = serverTransaction.f3893b.f14212b;
        voVar.getClass();
        u30Var.f11817b = voVar;
        u30Var.f11819d = serverTransaction;
        h92 h92Var = this.f14524g;
        h92Var.getClass();
        u30Var.f11823h = h92Var;
        o52 o52Var = this.f14519b.f11215a;
        o52Var.getClass();
        u30Var.f11825j = o52Var;
        v01 v01Var = this.f14519b.f11216b;
        v01Var.getClass();
        u30Var.f11826k = v01Var;
        String str = this.f14523f;
        str.getClass();
        u30Var.f11824i = str;
        u30Var.f11820e = Long.valueOf(this.f14521d);
        u30Var.f11821f = Integer.valueOf(this.f14522e);
        kh2.a1.k(vo.class, u30Var.f11817b);
        kh2.a1.k(r0.class, u30Var.f11818c);
        kh2.a1.k(cf2.class, u30Var.f11819d);
        kh2.a1.k(Long.class, u30Var.f11820e);
        kh2.a1.k(Integer.class, u30Var.f11821f);
        kh2.a1.k(wi.k.class, u30Var.f11822g);
        kh2.a1.k(h92.class, u30Var.f11823h);
        kh2.a1.k(String.class, u30Var.f11824i);
        kh2.a1.k(o52.class, u30Var.f11825j);
        kh2.a1.k(v01.class, u30Var.f11826k);
        return (a.x1) new v30(u30Var.f11816a, u30Var.f11817b, u30Var.f11818c, u30Var.f11819d, u30Var.f11820e, u30Var.f11821f, u30Var.f11822g, u30Var.f11823h, u30Var.f11825j, u30Var.f11826k).f12323u.get();
    }
}
