package ads_mobile_sdk;

import bj.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rm1 implements a.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final a.v7 f10685a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f10686b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.k f10687c;

    /* renamed from: d, reason: collision with root package name */
    public final n f10688d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10689e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10690f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10691g;

    /* renamed from: h, reason: collision with root package name */
    public final h92 f10692h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10693i;

    public rm1(a.o8 nativeRenderComponentProvider, ss2 traceMetaSet, wi.k baseRequest, n nativeRequest, long j13, int i13, String requestId, h92 requestType, int i14) {
        Intrinsics.checkNotNullParameter(nativeRenderComponentProvider, "nativeRenderComponentProvider");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f10685a = nativeRenderComponentProvider;
        this.f10686b = traceMetaSet;
        this.f10687c = baseRequest;
        this.f10688d = nativeRequest;
        this.f10689e = j13;
        this.f10690f = i13;
        this.f10691g = requestId;
        this.f10692h = requestType;
        this.f10693i = i14;
    }

    @Override // a.p4
    public final a.x1 a(cf2 serverTransaction, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        a40 a40Var = (a40) this.f10685a.get();
        wi.k kVar = this.f10687c;
        a40Var.getClass();
        kVar.getClass();
        a40Var.f2242g = kVar;
        n nVar = this.f10688d;
        nVar.getClass();
        a40Var.f2248m = nVar;
        adConfiguration.getClass();
        a40Var.f2238c = adConfiguration;
        vo voVar = serverTransaction.f3893b.f14212b;
        voVar.getClass();
        a40Var.f2237b = voVar;
        a40Var.f2239d = serverTransaction;
        h92 h92Var = this.f10692h;
        h92Var.getClass();
        a40Var.f2243h = h92Var;
        o52 o52Var = this.f10686b.f11215a;
        o52Var.getClass();
        a40Var.f2245j = o52Var;
        v01 v01Var = this.f10686b.f11216b;
        v01Var.getClass();
        a40Var.f2246k = v01Var;
        String str = this.f10691g;
        str.getClass();
        a40Var.f2244i = str;
        a40Var.f2240e = Long.valueOf(this.f10689e);
        a40Var.f2241f = Integer.valueOf(this.f10690f);
        a40Var.f2247l = Integer.valueOf(this.f10693i);
        kh2.a1.k(vo.class, a40Var.f2237b);
        kh2.a1.k(r0.class, a40Var.f2238c);
        kh2.a1.k(cf2.class, a40Var.f2239d);
        kh2.a1.k(Long.class, a40Var.f2240e);
        kh2.a1.k(Integer.class, a40Var.f2241f);
        kh2.a1.k(wi.k.class, a40Var.f2242g);
        kh2.a1.k(h92.class, a40Var.f2243h);
        kh2.a1.k(String.class, a40Var.f2244i);
        kh2.a1.k(o52.class, a40Var.f2245j);
        kh2.a1.k(v01.class, a40Var.f2246k);
        kh2.a1.k(Integer.class, a40Var.f2247l);
        kh2.a1.k(n.class, a40Var.f2248m);
        return (a.x1) new b40(a40Var.f2236a, a40Var.f2237b, a40Var.f2238c, a40Var.f2239d, a40Var.f2240e, a40Var.f2241f, a40Var.f2242g, a40Var.f2243h, a40Var.f2245j, a40Var.f2246k, a40Var.f2247l, a40Var.f2248m).f2710J.get();
    }
}
