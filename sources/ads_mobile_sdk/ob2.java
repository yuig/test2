package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ob2 implements a.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final a.v7 f9204a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f9205b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.k f9206c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9207d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9208e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9209f;

    /* renamed from: g, reason: collision with root package name */
    public final h92 f9210g;

    public ob2(a.o8 rewardedRenderComponentProvider, ss2 traceMetaSet, wi.k baseRequest, long j13, int i13, String requestId, h92 requestType) {
        Intrinsics.checkNotNullParameter(rewardedRenderComponentProvider, "rewardedRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f9204a = rewardedRenderComponentProvider;
        this.f9205b = traceMetaSet;
        this.f9206c = baseRequest;
        this.f9207d = j13;
        this.f9208e = i13;
        this.f9209f = requestId;
        this.f9210g = requestType;
    }

    @Override // a.p4
    public final a.x1 a(cf2 serverTransaction, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        z40 z40Var = (z40) this.f9204a.get();
        wi.k kVar = this.f9206c;
        z40Var.getClass();
        kVar.getClass();
        z40Var.f14614g = kVar;
        adConfiguration.getClass();
        z40Var.f14610c = adConfiguration;
        vo voVar = serverTransaction.f3893b.f14212b;
        voVar.getClass();
        z40Var.f14609b = voVar;
        z40Var.f14611d = serverTransaction;
        h92 h92Var = this.f9210g;
        h92Var.getClass();
        z40Var.f14615h = h92Var;
        o52 o52Var = this.f9205b.f11215a;
        o52Var.getClass();
        z40Var.f14617j = o52Var;
        v01 v01Var = this.f9205b.f11216b;
        v01Var.getClass();
        z40Var.f14618k = v01Var;
        String str = this.f9209f;
        str.getClass();
        z40Var.f14616i = str;
        z40Var.f14612e = Long.valueOf(this.f9207d);
        z40Var.f14613f = Integer.valueOf(this.f9208e);
        kh2.a1.k(vo.class, z40Var.f14609b);
        kh2.a1.k(r0.class, z40Var.f14610c);
        kh2.a1.k(cf2.class, z40Var.f14611d);
        kh2.a1.k(Long.class, z40Var.f14612e);
        kh2.a1.k(Integer.class, z40Var.f14613f);
        kh2.a1.k(wi.k.class, z40Var.f14614g);
        kh2.a1.k(h92.class, z40Var.f14615h);
        kh2.a1.k(String.class, z40Var.f14616i);
        kh2.a1.k(o52.class, z40Var.f14617j);
        kh2.a1.k(v01.class, z40Var.f14618k);
        return (a.x1) new a50(z40Var.f14608a, z40Var.f14609b, z40Var.f14610c, z40Var.f14611d, z40Var.f14612e, z40Var.f14613f, z40Var.f14614g, z40Var.f14615h, z40Var.f14617j, z40Var.f14618k).f2276t.get();
    }
}
