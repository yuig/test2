package ads_mobile_sdk;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jw1 {
    public final Boolean A;
    public kz2 B;

    /* renamed from: a, reason: collision with root package name */
    public int f6979a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f6980b;

    /* renamed from: c, reason: collision with root package name */
    public final il0 f6981c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6982d;

    /* renamed from: e, reason: collision with root package name */
    public final UUID f6983e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6984f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6985g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6986h;

    /* renamed from: i, reason: collision with root package name */
    public kl0 f6987i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6988j;

    /* renamed from: k, reason: collision with root package name */
    public Throwable f6989k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f6990l;

    /* renamed from: m, reason: collision with root package name */
    public long f6991m;

    /* renamed from: n, reason: collision with root package name */
    public long f6992n;

    /* renamed from: o, reason: collision with root package name */
    public long f6993o;

    /* renamed from: p, reason: collision with root package name */
    public final List f6994p;

    /* renamed from: q, reason: collision with root package name */
    public xi2 f6995q;

    /* renamed from: r, reason: collision with root package name */
    public od2 f6996r;

    /* renamed from: s, reason: collision with root package name */
    public ko0 f6997s;

    /* renamed from: t, reason: collision with root package name */
    public bc1 f6998t;

    /* renamed from: u, reason: collision with root package name */
    public ml0 f6999u;

    /* renamed from: v, reason: collision with root package name */
    public j41 f7000v;

    /* renamed from: w, reason: collision with root package name */
    public String f7001w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f7002x;

    /* renamed from: y, reason: collision with root package name */
    public zg2 f7003y;

    /* renamed from: z, reason: collision with root package name */
    public oy1 f7004z;

    public jw1(int i13, ss2 traceMetaSet, il0 cuiName, List tags, UUID rootTraceId, int i14, int i15, long j13, kl0 kl0Var, boolean z13, Throwable th3, Throwable th4, long j14, long j15, long j16, List errorMessages, xi2 xi2Var, od2 od2Var, ko0 ko0Var, bc1 bc1Var, ml0 processState, j41 j41Var, String str, Integer num, zg2 zg2Var, oy1 oy1Var, Boolean bool, kz2 kz2Var) {
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        Intrinsics.checkNotNullParameter(errorMessages, "errorMessages");
        Intrinsics.checkNotNullParameter(processState, "processState");
        this.f6979a = i13;
        this.f6980b = traceMetaSet;
        this.f6981c = cuiName;
        this.f6982d = tags;
        this.f6983e = rootTraceId;
        this.f6984f = i14;
        this.f6985g = i15;
        this.f6986h = j13;
        this.f6987i = kl0Var;
        this.f6988j = z13;
        this.f6989k = th3;
        this.f6990l = th4;
        this.f6991m = j14;
        this.f6992n = j15;
        this.f6993o = j16;
        this.f6994p = errorMessages;
        this.f6995q = xi2Var;
        this.f6996r = od2Var;
        this.f6997s = ko0Var;
        this.f6998t = bc1Var;
        this.f6999u = processState;
        this.f7000v = j41Var;
        this.f7001w = str;
        this.f7002x = num;
        this.f7003y = zg2Var;
        this.f7004z = oy1Var;
        this.A = bool;
        this.B = kz2Var;
    }

    public final long a() {
        return this.f6993o;
    }

    public final long b() {
        return this.f6992n;
    }

    public final long c() {
        return this.f6991m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw1)) {
            return false;
        }
        jw1 jw1Var = (jw1) obj;
        return this.f6979a == jw1Var.f6979a && Intrinsics.d(this.f6980b, jw1Var.f6980b) && this.f6981c == jw1Var.f6981c && Intrinsics.d(this.f6982d, jw1Var.f6982d) && Intrinsics.d(this.f6983e, jw1Var.f6983e) && this.f6984f == jw1Var.f6984f && this.f6985g == jw1Var.f6985g && this.f6986h == jw1Var.f6986h && this.f6987i == jw1Var.f6987i && this.f6988j == jw1Var.f6988j && Intrinsics.d(this.f6989k, jw1Var.f6989k) && Intrinsics.d(this.f6990l, jw1Var.f6990l) && zn2.b.d(this.f6991m, jw1Var.f6991m) && zn2.b.d(this.f6992n, jw1Var.f6992n) && zn2.b.d(this.f6993o, jw1Var.f6993o) && Intrinsics.d(this.f6994p, jw1Var.f6994p) && Intrinsics.d(this.f6995q, jw1Var.f6995q) && Intrinsics.d(this.f6996r, jw1Var.f6996r) && Intrinsics.d(this.f6997s, jw1Var.f6997s) && Intrinsics.d(this.f6998t, jw1Var.f6998t) && this.f6999u == jw1Var.f6999u && Intrinsics.d(this.f7000v, jw1Var.f7000v) && Intrinsics.d(this.f7001w, jw1Var.f7001w) && Intrinsics.d(this.f7002x, jw1Var.f7002x) && Intrinsics.d(this.f7003y, jw1Var.f7003y) && Intrinsics.d(this.f7004z, jw1Var.f7004z) && Intrinsics.d(this.A, jw1Var.A) && Intrinsics.d(this.B, jw1Var.B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c13 = a.a.c(this.f6986h, kh2.n3.f(this.f6985g, kh2.n3.f(this.f6984f, (this.f6983e.hashCode() + gh0.b.p((this.f6981c.hashCode() + ((this.f6980b.hashCode() + (Integer.hashCode(this.f6979a) * 31)) * 31)) * 31, this.f6982d)) * 31)), 31);
        kl0 kl0Var = this.f6987i;
        int hashCode = (c13 + (kl0Var == null ? 0 : kl0Var.hashCode())) * 31;
        boolean z13 = this.f6988j;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode + i13) * 31;
        Throwable th3 = this.f6989k;
        int hashCode2 = (i14 + (th3 == null ? 0 : th3.hashCode())) * 31;
        Throwable th4 = this.f6990l;
        int hashCode3 = (hashCode2 + (th4 == null ? 0 : th4.hashCode())) * 31;
        long j13 = this.f6991m;
        zn2.a aVar = zn2.b.f142311b;
        int p13 = gh0.b.p(a.a.c(this.f6993o, a.a.c(this.f6992n, a.a.c(j13, hashCode3, 31), 31), 31), this.f6994p);
        xi2 xi2Var = this.f6995q;
        int hashCode4 = (p13 + (xi2Var == null ? 0 : xi2Var.hashCode())) * 31;
        od2 od2Var = this.f6996r;
        int hashCode5 = (hashCode4 + (od2Var == null ? 0 : od2Var.hashCode())) * 31;
        ko0 ko0Var = this.f6997s;
        int hashCode6 = (hashCode5 + (ko0Var == null ? 0 : ko0Var.hashCode())) * 31;
        bc1 bc1Var = this.f6998t;
        int hashCode7 = (this.f6999u.hashCode() + ((hashCode6 + (bc1Var == null ? 0 : bc1Var.hashCode())) * 31)) * 31;
        j41 j41Var = this.f7000v;
        int hashCode8 = (hashCode7 + (j41Var == null ? 0 : j41Var.hashCode())) * 31;
        String str = this.f7001w;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f7002x;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        zg2 zg2Var = this.f7003y;
        int hashCode11 = (hashCode10 + (zg2Var == null ? 0 : zg2Var.hashCode())) * 31;
        oy1 oy1Var = this.f7004z;
        int hashCode12 = (hashCode11 + (oy1Var == null ? 0 : oy1Var.hashCode())) * 31;
        Boolean bool = this.A;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        kz2 kz2Var = this.B;
        return hashCode13 + (kz2Var != null ? kz2Var.hashCode() : 0);
    }

    public final String toString() {
        int i13 = this.f6979a;
        ss2 ss2Var = this.f6980b;
        il0 il0Var = this.f6981c;
        List list = this.f6982d;
        UUID uuid = this.f6983e;
        int i14 = this.f6984f;
        int i15 = this.f6985g;
        long j13 = this.f6986h;
        kl0 kl0Var = this.f6987i;
        boolean z13 = this.f6988j;
        Throwable th3 = this.f6989k;
        Throwable th4 = this.f6990l;
        String o13 = zn2.b.o(this.f6991m);
        String o14 = zn2.b.o(this.f6992n);
        String o15 = zn2.b.o(this.f6993o);
        List list2 = this.f6994p;
        xi2 xi2Var = this.f6995q;
        od2 od2Var = this.f6996r;
        ko0 ko0Var = this.f6997s;
        bc1 bc1Var = this.f6998t;
        ml0 ml0Var = this.f6999u;
        j41 j41Var = this.f7000v;
        String str = this.f7001w;
        Integer num = this.f7002x;
        zg2 zg2Var = this.f7003y;
        oy1 oy1Var = this.f7004z;
        Boolean bool = this.A;
        kz2 kz2Var = this.B;
        StringBuilder sb3 = new StringBuilder("PerTraceMeta(id=");
        sb3.append(i13);
        sb3.append(", traceMetaSet=");
        sb3.append(ss2Var);
        sb3.append(", cuiName=");
        sb3.append(il0Var);
        sb3.append(", tags=");
        sb3.append(list);
        sb3.append(", rootTraceId=");
        sb3.append(uuid);
        sb3.append(", parentTraceId=");
        sb3.append(i14);
        sb3.append(", traceDepth=");
        sb3.append(i15);
        sb3.append(", startTimeMillis=");
        sb3.append(j13);
        sb3.append(", gmsgName=");
        sb3.append(kl0Var);
        sb3.append(", isSuccess=");
        sb3.append(z13);
        sb3.append(", exception=");
        sb3.append(th3);
        sb3.append(", causingException=");
        sb3.append(th4);
        a.a.B(sb3, ", latency=", o13, ", cpuTime=", o14);
        sb3.append(", childCpuTime=");
        sb3.append(o15);
        sb3.append(", errorMessages=");
        sb3.append(list2);
        sb3.append(", signalMeta=");
        sb3.append(xi2Var);
        sb3.append(", scarCacheEvictionData=");
        sb3.append(od2Var);
        sb3.append(", h5Data=");
        sb3.append(ko0Var);
        sb3.append(", mraidData=");
        sb3.append(bc1Var);
        sb3.append(", processState=");
        sb3.append(ml0Var);
        sb3.append(", jsEngineData=");
        sb3.append(j41Var);
        sb3.append(", cronetProvider=");
        sb3.append(str);
        sb3.append(", customTabsNavigationEvent=");
        sb3.append(num);
        sb3.append(", signalCacheData=");
        sb3.append(zg2Var);
        sb3.append(", preloadData=");
        sb3.append(oy1Var);
        sb3.append(", hasNetworkConnectivity=");
        sb3.append(bool);
        sb3.append(", webViewData=");
        sb3.append(kz2Var);
        sb3.append(")");
        return sb3.toString();
    }

    public final void a(long j13) {
        this.f6993o = j13;
    }

    public final void b(long j13) {
        this.f6992n = j13;
    }

    public /* synthetic */ jw1(int i13, ss2 ss2Var, il0 il0Var, List list, UUID uuid, int i14, int i15, long j13, kl0 kl0Var, boolean z13, Throwable th3, Throwable th4, long j14, long j15, long j16, List list2, xi2 xi2Var, od2 od2Var, ko0 ko0Var, bc1 bc1Var, ml0 ml0Var, j41 j41Var, String str, Integer num, zg2 zg2Var, oy1 oy1Var, Boolean bool, kz2 kz2Var, int i16) {
        this(i13, ss2Var, il0Var, list, uuid, i14, i15, j13, kl0Var, z13, th3, th4, j14, j15, j16, list2, xi2Var, od2Var, ko0Var, bc1Var, ml0Var, j41Var, str, num, zg2Var, oy1Var, bool, kz2Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ jw1(int r37, ads_mobile_sdk.ss2 r38, ads_mobile_sdk.il0 r39, java.util.List r40, java.util.UUID r41, int r42, int r43, long r44, java.lang.Boolean r46, int r47) {
        /*
            r36 = this;
            zn2.a r0 = zn2.b.f142311b
            zn2.d r0 = zn2.d.SECONDS
            r1 = 0
            long r16 = dl2.b.P2(r1, r0)
            long r18 = dl2.b.P2(r1, r0)
            long r20 = dl2.b.P2(r1, r0)
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            ads_mobile_sdk.ml0 r27 = ads_mobile_sdk.ml0.PROCESS_STATE_UNKNOWN
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r47 & r0
            if (r0 == 0) goto L22
            r0 = 0
            r33 = r0
            goto L24
        L22:
            r33 = r46
        L24:
            r35 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jw1.<init>(int, ads_mobile_sdk.ss2, ads_mobile_sdk.il0, java.util.List, java.util.UUID, int, int, long, java.lang.Boolean, int):void");
    }
}
