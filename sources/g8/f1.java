package g8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import pk.v2;

/* loaded from: classes3.dex */
public final class f1 extends a7.b1 {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f64252n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f64253b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64254c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64255d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64256e;

    /* renamed from: f, reason: collision with root package name */
    public final long f64257f;

    /* renamed from: g, reason: collision with root package name */
    public final long f64258g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f64259h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f64260i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f64261j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f64262k;

    /* renamed from: l, reason: collision with root package name */
    public final a7.i0 f64263l;

    /* renamed from: m, reason: collision with root package name */
    public final a7.c0 f64264m;

    static {
        a7.w wVar = new a7.w();
        a7.z zVar = new a7.z();
        List emptyList = Collections.emptyList();
        v2 v2Var = v2.f100502e;
        a7.b0 b0Var = new a7.b0();
        a7.e0 e0Var = a7.e0.f982d;
        Uri uri = Uri.EMPTY;
        bf.b.t(zVar.f1244b == null || zVar.f1243a != null);
        if (uri != null) {
            new a7.d0(uri, null, zVar.f1243a != null ? new a7.a0(zVar) : null, emptyList, null, v2Var, null, -9223372036854775807L);
        }
        wVar.a();
        b0Var.a();
        a7.l0 l0Var = a7.l0.I;
    }

    public f1(long j13, long j14, long j15, long j16, long j17, long j18, boolean z13, boolean z14, boolean z15, Object obj, a7.i0 i0Var, a7.c0 c0Var) {
        this.f64253b = j13;
        this.f64254c = j14;
        this.f64255d = j15;
        this.f64256e = j16;
        this.f64257f = j17;
        this.f64258g = j18;
        this.f64259h = z13;
        this.f64260i = z14;
        this.f64261j = z15;
        this.f64262k = obj;
        i0Var.getClass();
        this.f64263l = i0Var;
        this.f64264m = c0Var;
    }

    @Override // a7.b1
    public final int b(Object obj) {
        return f64252n.equals(obj) ? 0 : -1;
    }

    @Override // a7.b1
    public final a7.z0 g(int i13, a7.z0 z0Var, boolean z13) {
        bf.b.m(i13, 1);
        Object obj = z13 ? f64252n : null;
        long j13 = -this.f64257f;
        z0Var.getClass();
        z0Var.o(null, obj, 0, this.f64255d, j13, a7.b.f945g, false);
        return z0Var;
    }

    @Override // a7.b1
    public final int i() {
        return 1;
    }

    @Override // a7.b1
    public final Object m(int i13) {
        bf.b.m(i13, 1);
        return f64252n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // a7.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a7.a1 n(int r23, a7.a1 r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            bf.b.m(r2, r1)
            long r1 = r0.f64258g
            boolean r13 = r0.f64260i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f64261j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f64256e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = a7.a1.f927q
            a7.c0 r14 = r0.f64264m
            long r1 = r0.f64256e
            r17 = r1
            a7.i0 r4 = r0.f64263l
            java.lang.Object r5 = r0.f64262k
            long r6 = r0.f64253b
            long r8 = r0.f64254c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f64259h
            r19 = 0
            long r1 = r0.f64257f
            r20 = r1
            r3 = r24
            r3.c(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.f1.n(int, a7.a1, long):a7.a1");
    }

    @Override // a7.b1
    public final int p() {
        return 1;
    }

    public f1(long j13, long j14, long j15, long j16, boolean z13, boolean z14, boolean z15, e8.c cVar, a7.i0 i0Var) {
        this(-9223372036854775807L, -9223372036854775807L, j13, j14, j15, j16, z13, z14, false, cVar, i0Var, z15 ? i0Var.f1074c : null);
    }

    public f1(long j13, boolean z13, boolean z14, a7.i0 i0Var) {
        this(j13, j13, 0L, 0L, z13, false, z14, null, i0Var);
    }
}
