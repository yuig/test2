package g8;

import java.util.ArrayList;
import m7.x1;

/* loaded from: classes3.dex */
public final class i1 implements c0, l8.r {

    /* renamed from: a, reason: collision with root package name */
    public final g7.i f64286a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.e f64287b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.a0 f64288c;

    /* renamed from: d, reason: collision with root package name */
    public final a10.e f64289d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f64290e;

    /* renamed from: f, reason: collision with root package name */
    public final m1 f64291f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f64292g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final long f64293h;

    /* renamed from: i, reason: collision with root package name */
    public final l8.w f64294i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.b f64295j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f64296k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f64297l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f64298m;

    /* renamed from: n, reason: collision with root package name */
    public int f64299n;

    public i1(g7.i iVar, g7.e eVar, g7.a0 a0Var, androidx.media3.common.b bVar, long j13, a10.e eVar2, h0 h0Var, boolean z13, m8.a aVar) {
        this.f64286a = iVar;
        this.f64287b = eVar;
        this.f64288c = a0Var;
        this.f64295j = bVar;
        this.f64293h = j13;
        this.f64289d = eVar2;
        this.f64290e = h0Var;
        this.f64296k = z13;
        this.f64291f = new m1(new a7.c1("", bVar));
        this.f64294i = aVar != null ? new l8.w(aVar) : new l8.w("SingleSampleMediaPeriod");
    }

    @Override // g8.d1
    public final long a() {
        return (this.f64297l || this.f64294i.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        return j13;
    }

    @Override // l8.r
    public final void d(l8.u uVar, long j13, long j14) {
        h1 h1Var = (h1) uVar;
        this.f64299n = (int) h1Var.f64281c.f63852b;
        byte[] bArr = h1Var.f64282d;
        bArr.getClass();
        this.f64298m = bArr;
        this.f64297l = true;
        g7.y yVar = h1Var.f64281c;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f64289d.getClass();
        this.f64290e.e(vVar, 1, -1, this.f64295j, 0, null, 0L, this.f64293h);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    @Override // l8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l8.s e(l8.u r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r12 = r22
            r1 = r23
            r2 = r17
            g8.h1 r2 = (g8.h1) r2
            g7.y r2 = r2.f64281c
            g8.v r3 = new g8.v
            android.net.Uri r4 = r2.f63853c
            java.util.Map r2 = r2.f63854d
            r5 = r20
            r3.<init>(r4, r2, r5)
            int r2 = d7.n0.f53866a
            a10.e r2 = r0.f64289d
            r2.getClass()
            boolean r4 = r12 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L57
            boolean r4 = r12 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L57
            boolean r4 = r12 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r4 != 0) goto L57
            boolean r4 = r12 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r4 != 0) goto L57
            int r4 = androidx.media3.datasource.DataSourceException.f18777b
            r4 = r12
        L36:
            if (r4 == 0) goto L4b
            boolean r7 = r4 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L46
            r7 = r4
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.f18778a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L46
            goto L57
        L46:
            java.lang.Throwable r4 = r4.getCause()
            goto L36
        L4b:
            int r4 = r1 + (-1)
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L58
        L57:
            r7 = r5
        L58:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L67
            int r2 = r2.w(r5)
            if (r1 < r2) goto L65
            goto L67
        L65:
            r1 = r6
            goto L68
        L67:
            r1 = r5
        L68:
            boolean r2 = r0.f64296k
            if (r2 == 0) goto L7b
            if (r1 == 0) goto L7b
            java.lang.String r1 = "SingleSampleMediaPeriod"
            java.lang.String r2 = "Loading failed, treating as end-of-stream."
            d7.u.h(r1, r2, r12)
            r0.f64297l = r5
            l8.s r1 = l8.w.f82095e
        L79:
            r14 = r1
            goto L86
        L7b:
            if (r4 == 0) goto L83
            l8.s r1 = new l8.s
            r1.<init>(r6, r7)
            goto L79
        L83:
            l8.s r1 = l8.w.f82096f
            goto L79
        L86:
            boolean r1 = r14.c()
            r13 = r1 ^ 1
            r8 = 0
            long r10 = r0.f64293h
            g8.h0 r1 = r0.f64290e
            r4 = 1
            r5 = -1
            androidx.media3.common.b r6 = r0.f64295j
            r7 = 0
            r15 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r15
            r12 = r22
            r1.f(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.i1.e(l8.u, long, long, java.io.IOException, int):l8.s");
    }

    @Override // g8.c0
    public final long f(long j13) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f64292g;
            if (i13 >= arrayList.size()) {
                return j13;
            }
            g1 g1Var = (g1) arrayList.get(i13);
            if (g1Var.f64269a == 2) {
                g1Var.f64269a = 1;
            }
            i13++;
        }
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f64294i.d();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        b0Var.e(this);
    }

    @Override // g8.c0
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // g8.c0
    public final long l(k8.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            b1 b1Var = b1VarArr[i13];
            ArrayList arrayList = this.f64292g;
            if (b1Var != null && (tVarArr[i13] == null || !zArr[i13])) {
                arrayList.remove(b1Var);
                b1VarArr[i13] = null;
            }
            if (b1VarArr[i13] == null && tVarArr[i13] != null) {
                g1 g1Var = new g1(this);
                arrayList.add(g1Var);
                b1VarArr[i13] = g1Var;
                zArr2[i13] = true;
            }
        }
        return j13;
    }

    @Override // g8.c0
    public final void n() {
    }

    @Override // l8.r
    public final void p(l8.u uVar, long j13, long j14, int i13) {
        h1 h1Var = (h1) uVar;
        g7.y yVar = h1Var.f64281c;
        this.f64290e.h(i13 == 0 ? new v(h1Var.f64279a, h1Var.f64280b, j13) : new v(yVar.f63853c, yVar.f63854d, j14), 1, -1, this.f64295j, 0, null, 0L, this.f64293h, i13);
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        if (this.f64297l) {
            return false;
        }
        l8.w wVar = this.f64294i;
        if (wVar.d() || wVar.c()) {
            return false;
        }
        g7.f a13 = this.f64287b.a();
        g7.a0 a0Var = this.f64288c;
        if (a0Var != null) {
            a13.f(a0Var);
        }
        wVar.g(new h1(a13, this.f64286a), this, this.f64289d.w(1));
        return true;
    }

    @Override // g8.c0
    public final m1 r() {
        return this.f64291f;
    }

    @Override // l8.r
    public final void s(l8.u uVar, long j13, long j14, boolean z13) {
        g7.y yVar = ((h1) uVar).f64281c;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f64289d.getClass();
        this.f64290e.c(vVar, 1, -1, null, 0, null, 0L, this.f64293h);
    }

    @Override // g8.d1
    public final long t() {
        return this.f64297l ? Long.MIN_VALUE : 0L;
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
    }

    @Override // g8.d1
    public final void v(long j13) {
    }
}
