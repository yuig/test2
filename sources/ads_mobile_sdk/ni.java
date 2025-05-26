package ads_mobile_sdk;

import a.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ni implements a.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final a.v7 f8815a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f8816b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.k f8817c;

    /* renamed from: d, reason: collision with root package name */
    public final vi.d f8818d;

    /* renamed from: e, reason: collision with root package name */
    public final z1 f8819e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8820f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8821g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8822h;

    public ni(a.o8 bannerRenderComponentProvider, ss2 traceMetaSet, wi.k baseRequest, vi.d bannerRequest, z1 refreshListener, long j13, int i13, String requestId) {
        Intrinsics.checkNotNullParameter(bannerRenderComponentProvider, "bannerRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f8815a = bannerRenderComponentProvider;
        this.f8816b = traceMetaSet;
        this.f8817c = baseRequest;
        this.f8818d = bannerRequest;
        this.f8819e = refreshListener;
        this.f8820f = j13;
        this.f8821g = i13;
        this.f8822h = requestId;
    }

    @Override // a.p4
    public final a.x1 a(cf2 serverTransaction, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        b10 b10Var = (b10) this.f8815a.get();
        wi.k kVar = this.f8817c;
        b10Var.getClass();
        kVar.getClass();
        b10Var.f2624g = kVar;
        vi.d dVar = this.f8818d;
        dVar.getClass();
        b10Var.f2630m = dVar;
        adConfiguration.getClass();
        b10Var.f2620c = adConfiguration;
        b10Var.f2625h = h92.f5900f;
        vo voVar = serverTransaction.f3893b.f14212b;
        voVar.getClass();
        b10Var.f2619b = voVar;
        b10Var.f2621d = serverTransaction;
        z1 z1Var = this.f8819e;
        z1Var.getClass();
        b10Var.f2629l = z1Var;
        o52 o52Var = this.f8816b.f11215a;
        o52Var.getClass();
        b10Var.f2627j = o52Var;
        v01 v01Var = this.f8816b.f11216b;
        v01Var.getClass();
        b10Var.f2628k = v01Var;
        String str = this.f8822h;
        str.getClass();
        b10Var.f2626i = str;
        b10Var.f2622e = Long.valueOf(this.f8820f);
        b10Var.f2623f = Integer.valueOf(this.f8821g);
        kh2.a1.k(vo.class, b10Var.f2619b);
        kh2.a1.k(r0.class, b10Var.f2620c);
        kh2.a1.k(cf2.class, b10Var.f2621d);
        kh2.a1.k(Long.class, b10Var.f2622e);
        kh2.a1.k(Integer.class, b10Var.f2623f);
        kh2.a1.k(wi.k.class, b10Var.f2624g);
        kh2.a1.k(h92.class, b10Var.f2625h);
        kh2.a1.k(String.class, b10Var.f2626i);
        kh2.a1.k(o52.class, b10Var.f2627j);
        kh2.a1.k(v01.class, b10Var.f2628k);
        kh2.a1.k(z1.class, b10Var.f2629l);
        kh2.a1.k(vi.d.class, b10Var.f2630m);
        return (a.x1) new c10(b10Var.f2618a, b10Var.f2619b, b10Var.f2620c, b10Var.f2621d, b10Var.f2622e, b10Var.f2623f, b10Var.f2624g, b10Var.f2625h, b10Var.f2627j, b10Var.f2628k, b10Var.f2629l, b10Var.f2630m).f3700v.get();
    }
}
