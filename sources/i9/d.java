package i9;

import a7.m0;
import a7.n0;
import d7.d0;
import d9.o;
import java.io.EOFException;
import l0.k;
import q8.k0;
import q8.r;
import q8.s;
import q8.t;
import q8.u;
import q8.z;

/* loaded from: classes3.dex */
public final class d implements s {

    /* renamed from: v, reason: collision with root package name */
    public static final a.e f71737v = new a.e(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f71738a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71739b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f71740c;

    /* renamed from: d, reason: collision with root package name */
    public final q8.c f71741d;

    /* renamed from: e, reason: collision with root package name */
    public final z f71742e;

    /* renamed from: f, reason: collision with root package name */
    public final t5.e f71743f;

    /* renamed from: g, reason: collision with root package name */
    public final r f71744g;

    /* renamed from: h, reason: collision with root package name */
    public u f71745h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f71746i;

    /* renamed from: j, reason: collision with root package name */
    public k0 f71747j;

    /* renamed from: k, reason: collision with root package name */
    public int f71748k;

    /* renamed from: l, reason: collision with root package name */
    public n0 f71749l;

    /* renamed from: m, reason: collision with root package name */
    public long f71750m;

    /* renamed from: n, reason: collision with root package name */
    public long f71751n;

    /* renamed from: o, reason: collision with root package name */
    public long f71752o;

    /* renamed from: p, reason: collision with root package name */
    public long f71753p;

    /* renamed from: q, reason: collision with root package name */
    public int f71754q;

    /* renamed from: r, reason: collision with root package name */
    public f f71755r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f71756s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f71757t;

    /* renamed from: u, reason: collision with root package name */
    public long f71758u;

    public d() {
        this(-9223372036854775807L);
    }

    public static long c(n0 n0Var) {
        if (n0Var == null) {
            return -9223372036854775807L;
        }
        int d2 = n0Var.d();
        for (int i13 = 0; i13 < d2; i13++) {
            m0 c13 = n0Var.c(i13);
            if (c13 instanceof o) {
                o oVar = (o) c13;
                if (oVar.f54025a.equals("TLEN")) {
                    return d7.n0.X(Long.parseLong((String) oVar.f54038c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f71748k = 0;
        this.f71750m = -9223372036854775807L;
        this.f71751n = 0L;
        this.f71754q = 0;
        this.f71758u = j14;
        f fVar = this.f71755r;
        if (fVar instanceof b) {
            k kVar = ((b) fVar).f71733c.f102885b;
            int i13 = kVar.f81235b;
            if (i13 != 0 && j14 - kVar.m(i13 - 1) < 100000) {
                return;
            }
            this.f71757t = true;
            this.f71747j = this.f71744g;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r5 != 1231971951) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038c  */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r48, q8.c0 r49) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.d.d(q8.t, q8.c0):int");
    }

    public final void e() {
        f fVar = this.f71755r;
        if ((fVar instanceof a) && fVar.h()) {
            long j13 = this.f71753p;
            if (j13 == -1 || j13 == this.f71755r.g()) {
                return;
            }
            a aVar = (a) this.f71755r;
            long j14 = this.f71753p;
            this.f71755r = new a(aVar.f71727i, aVar.f71728j, j14, aVar.f71726h, aVar.f71729k);
            u uVar = this.f71745h;
            uVar.getClass();
            uVar.j(this.f71755r);
            this.f71746i.getClass();
            this.f71755r.l();
        }
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f71745h = uVar;
        k0 D = uVar.D(0, 1);
        this.f71746i = D;
        this.f71747j = D;
        this.f71745h.A();
    }

    public final boolean g(t tVar) {
        f fVar = this.f71755r;
        if (fVar != null) {
            long g13 = fVar.g();
            if (g13 != -1 && tVar.k() > g13 - 4) {
                return true;
            }
        }
        try {
            return !tVar.c(this.f71740c.f53806a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r18 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        r17.p(r3 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        r16.f71748k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:
    
        r17.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(q8.t r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            if (r18 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r17.g()
            long r3 = r17.h()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            if (r3 != 0) goto L41
            int r3 = r0.f71738a
            r3 = r3 & 8
            if (r3 != 0) goto L22
            r3 = 0
            goto L24
        L22:
            a.e r3 = i9.d.f71737v
        L24:
            t5.e r5 = r0.f71743f
            a7.n0 r3 = r5.x(r1, r3)
            r0.f71749l = r3
            if (r3 == 0) goto L33
            q8.z r5 = r0.f71742e
            r5.b(r3)
        L33:
            long r5 = r17.k()
            int r3 = (int) r5
            if (r18 != 0) goto L3d
            r1.p(r3)
        L3d:
            r5 = r4
        L3e:
            r6 = r5
            r7 = r6
            goto L44
        L41:
            r3 = r4
            r5 = r3
            goto L3e
        L44:
            boolean r8 = r16.g(r17)
            r9 = 1
            if (r8 == 0) goto L57
            if (r6 <= 0) goto L4e
            goto La7
        L4e:
            r16.e()
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L57:
            d7.d0 r8 = r0.f71740c
            r8.K(r4)
            int r8 = r8.k()
            if (r5 == 0) goto L70
            long r10 = (long) r5
            r12 = -128000(0xfffffffffffe0c00, float:NaN)
            r12 = r12 & r8
            long r12 = (long) r12
            r14 = -128000(0xfffffffffffe0c00, double:NaN)
            long r10 = r10 & r14
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 != 0) goto L77
        L70:
            int r10 = q8.b.e(r8)
            r11 = -1
            if (r10 != r11) goto L99
        L77:
            int r5 = r7 + 1
            if (r7 != r2) goto L87
            if (r18 == 0) goto L7e
            return r4
        L7e:
            r16.e()
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L87:
            if (r18 == 0) goto L92
            r17.g()
            int r6 = r3 + r5
            r1.m(r6)
            goto L95
        L92:
            r1.p(r9)
        L95:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L44
        L99:
            int r6 = r6 + 1
            if (r6 != r9) goto La4
            q8.c r5 = r0.f71741d
            r5.a(r8)
            r5 = r8
            goto Lb4
        La4:
            r8 = 4
            if (r6 != r8) goto Lb4
        La7:
            if (r18 == 0) goto Lae
            int r3 = r3 + r7
            r1.p(r3)
            goto Lb1
        Lae:
            r17.g()
        Lb1:
            r0.f71748k = r5
            return r9
        Lb4:
            int r10 = r10 + (-4)
            r1.m(r10)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.d.h(q8.t, boolean):boolean");
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        return h(tVar, true);
    }

    public d(long j13) {
        this.f71738a = 0;
        this.f71739b = j13;
        this.f71740c = new d0(10);
        this.f71741d = new q8.c();
        this.f71742e = new z();
        this.f71750m = -9223372036854775807L;
        this.f71743f = new t5.e(15);
        r rVar = new r();
        this.f71744g = rVar;
        this.f71747j = rVar;
        this.f71753p = -1L;
    }
}
