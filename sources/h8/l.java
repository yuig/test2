package h8;

import a7.o0;
import d7.n0;
import g7.y;
import g8.a1;
import g8.b1;
import g8.c1;
import g8.d1;
import g8.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l8.u;
import l8.v;
import l8.w;
import m7.y0;
import p7.t;

/* loaded from: classes.dex */
public final class l implements b1, d1, l8.r, v {

    /* renamed from: a, reason: collision with root package name */
    public final int f68037a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f68038b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b[] f68039c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f68040d;

    /* renamed from: e, reason: collision with root package name */
    public final m f68041e;

    /* renamed from: f, reason: collision with root package name */
    public final c1 f68042f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f68043g;

    /* renamed from: h, reason: collision with root package name */
    public final a10.e f68044h;

    /* renamed from: i, reason: collision with root package name */
    public final w f68045i;

    /* renamed from: j, reason: collision with root package name */
    public final a7.o f68046j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f68047k;

    /* renamed from: l, reason: collision with root package name */
    public final List f68048l;

    /* renamed from: m, reason: collision with root package name */
    public final a1 f68049m;

    /* renamed from: n, reason: collision with root package name */
    public final a1[] f68050n;

    /* renamed from: o, reason: collision with root package name */
    public final c f68051o;

    /* renamed from: p, reason: collision with root package name */
    public f f68052p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.media3.common.b f68053q;

    /* renamed from: r, reason: collision with root package name */
    public k f68054r;

    /* renamed from: s, reason: collision with root package name */
    public long f68055s;

    /* renamed from: t, reason: collision with root package name */
    public long f68056t;

    /* renamed from: u, reason: collision with root package name */
    public int f68057u;

    /* renamed from: v, reason: collision with root package name */
    public a f68058v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f68059w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f68060x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f68061y;

    public l(int i13, int[] iArr, androidx.media3.common.b[] bVarArr, m mVar, c1 c1Var, l8.m mVar2, long j13, s7.q qVar, s7.m mVar3, a10.e eVar, h0 h0Var, boolean z13) {
        this.f68037a = i13;
        int i14 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f68038b = iArr;
        this.f68039c = bVarArr == null ? new androidx.media3.common.b[0] : bVarArr;
        this.f68041e = mVar;
        this.f68042f = c1Var;
        this.f68043g = h0Var;
        this.f68044h = eVar;
        this.f68059w = z13;
        this.f68045i = new w("ChunkSampleStream");
        this.f68046j = new a7.o(2);
        ArrayList arrayList = new ArrayList();
        this.f68047k = arrayList;
        this.f68048l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f68050n = new a1[length];
        this.f68040d = new boolean[length];
        int i15 = length + 1;
        int[] iArr2 = new int[i15];
        a1[] a1VarArr = new a1[i15];
        qVar.getClass();
        mVar3.getClass();
        a1 a1Var = new a1(mVar2, qVar, mVar3);
        this.f68049m = a1Var;
        iArr2[0] = i13;
        a1VarArr[0] = a1Var;
        while (i14 < length) {
            a1 a1Var2 = new a1(mVar2, null, null);
            this.f68050n[i14] = a1Var2;
            int i16 = i14 + 1;
            a1VarArr[i16] = a1Var2;
            iArr2[i16] = this.f68038b[i14];
            i14 = i16;
        }
        this.f68051o = new c(iArr2, a1VarArr);
        this.f68055s = j13;
        this.f68056t = j13;
    }

    public final boolean A() {
        return this.f68055s != -9223372036854775807L;
    }

    public final void B() {
        int C = C(this.f68049m.r(), this.f68057u - 1);
        while (true) {
            int i13 = this.f68057u;
            if (i13 > C) {
                return;
            }
            this.f68057u = i13 + 1;
            a aVar = (a) this.f68047k.get(i13);
            androidx.media3.common.b bVar = aVar.f68026d;
            if (!bVar.equals(this.f68053q)) {
                this.f68043g.b(this.f68037a, bVar, aVar.f68027e, aVar.f68028f, aVar.f68029g);
            }
            this.f68053q = bVar;
        }
    }

    public final int C(int i13, int i14) {
        ArrayList arrayList;
        do {
            i14++;
            arrayList = this.f68047k;
            if (i14 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i14)).c(0) <= i13);
        return i14 - 1;
    }

    public final void D(k kVar) {
        this.f68054r = kVar;
        a1 a1Var = this.f68049m;
        a1Var.j();
        s7.j jVar = a1Var.f64193h;
        if (jVar != null) {
            jVar.c(a1Var.f64190e);
            a1Var.f64193h = null;
            a1Var.f64192g = null;
        }
        for (a1 a1Var2 : this.f68050n) {
            a1Var2.j();
            s7.j jVar2 = a1Var2.f64193h;
            if (jVar2 != null) {
                jVar2.c(a1Var2.f64190e);
                a1Var2.f64193h = null;
                a1Var2.f64192g = null;
            }
        }
        this.f68045i.f(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(long r11) {
        /*
            r10 = this;
            r10.f68056t = r11
            r0 = 0
            r10.f68059w = r0
            boolean r1 = r10.A()
            if (r1 == 0) goto Le
            r10.f68055s = r11
            return
        Le:
            r1 = r0
        Lf:
            java.util.ArrayList r2 = r10.f68047k
            int r3 = r2.size()
            r4 = 0
            if (r1 >= r3) goto L36
            java.lang.Object r3 = r2.get(r1)
            h8.a r3 = (h8.a) r3
            long r5 = r3.f68029g
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L30
            long r6 = r3.f67998k
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L30
            goto L37
        L30:
            if (r5 <= 0) goto L33
            goto L36
        L33:
            int r1 = r1 + 1
            goto Lf
        L36:
            r3 = r4
        L37:
            g8.a1 r1 = r10.f68049m
            r5 = 1
            if (r3 == 0) goto L45
            int r3 = r3.c(r0)
            boolean r3 = r1.F(r3)
            goto L54
        L45:
            long r6 = r10.a()
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L4f
            r3 = r5
            goto L50
        L4f:
            r3 = r0
        L50:
            boolean r3 = r1.G(r11, r3)
        L54:
            g8.a1[] r6 = r10.f68050n
            if (r3 == 0) goto L6d
            int r1 = r1.r()
            int r1 = r10.C(r1, r0)
            r10.f68057u = r1
            int r1 = r6.length
        L63:
            if (r0 >= r1) goto La1
            r2 = r6[r0]
            r2.G(r11, r5)
            int r0 = r0 + 1
            goto L63
        L6d:
            r10.f68055s = r11
            r10.f68061y = r0
            r2.clear()
            r10.f68057u = r0
            l8.w r11 = r10.f68045i
            boolean r12 = r11.d()
            if (r12 == 0) goto L90
            r1.j()
            int r12 = r6.length
        L82:
            if (r0 >= r12) goto L8c
            r1 = r6[r0]
            r1.j()
            int r0 = r0 + 1
            goto L82
        L8c:
            r11.a()
            goto La1
        L90:
            r11.f82099c = r4
            r1.E(r0)
            int r11 = r6.length
            r12 = r0
        L97:
            if (r12 >= r11) goto La1
            r1 = r6[r12]
            r1.E(r0)
            int r12 = r12 + 1
            goto L97
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.l.E(long):void");
    }

    public final j F(int i13, long j13) {
        int i14 = 0;
        while (true) {
            a1[] a1VarArr = this.f68050n;
            if (i14 >= a1VarArr.length) {
                throw new IllegalStateException();
            }
            if (this.f68038b[i14] == i13) {
                boolean[] zArr = this.f68040d;
                bf.b.t(!zArr[i14]);
                zArr[i14] = true;
                a1VarArr[i14].G(j13, true);
                return new j(this, this, a1VarArr[i14], i14);
            }
            i14++;
        }
    }

    @Override // g8.d1
    public final long a() {
        if (A()) {
            return this.f68055s;
        }
        if (this.f68061y) {
            return Long.MIN_VALUE;
        }
        return y().f68030h;
    }

    @Override // g8.b1
    public final void b() {
        w wVar = this.f68045i;
        wVar.b();
        this.f68049m.z();
        if (wVar.d()) {
            return;
        }
        this.f68041e.b();
    }

    @Override // l8.r
    public final void d(u uVar, long j13, long j14) {
        f fVar = (f) uVar;
        this.f68052p = null;
        this.f68041e.e(fVar);
        long j15 = fVar.f68023a;
        y yVar = fVar.f68031i;
        g8.v vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        this.f68044h.getClass();
        this.f68043g.e(vVar, fVar.f68025c, this.f68037a, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h);
        this.f68042f.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    @Override // l8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l8.s e(l8.u r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            h8.f r1 = (h8.f) r1
            g7.y r2 = r1.f68031i
            long r2 = r2.f63852b
            boolean r4 = r1 instanceof h8.a
            java.util.ArrayList r5 = r0.f68047k
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.z(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r3
            goto L27
        L26:
            r2 = r7
        L27:
            g8.v r9 = new g8.v
            g7.y r8 = r1.f68031i
            android.net.Uri r10 = r8.f63853c
            java.util.Map r8 = r8.f63854d
            r11 = r25
            r9.<init>(r10, r8, r11)
            g8.a0 r8 = new g8.a0
            long r10 = r1.f68029g
            long r17 = d7.n0.o0(r10)
            long r10 = r1.f68030h
            long r19 = d7.n0.o0(r10)
            int r13 = r0.f68037a
            androidx.media3.common.b r14 = r1.f68026d
            int r12 = r1.f68025c
            int r15 = r1.f68027e
            java.lang.Object r10 = r1.f68028f
            r11 = r8
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            k0.a r10 = new k0.a
            r15 = r27
            r11 = r28
            r10.<init>(r9, r8, r15, r11)
            a10.e r8 = r0.f68044h
            r8.D(r10)
            h8.m r11 = r0.f68041e
            boolean r8 = r11.d(r1, r2, r10, r8)
            r14 = 0
            if (r8 == 0) goto L8d
            if (r2 == 0) goto L86
            if (r4 == 0) goto L83
            h8.a r2 = r0.w(r6)
            if (r2 != r1) goto L75
            r2 = r7
            goto L76
        L75:
            r2 = r3
        L76:
            bf.b.t(r2)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L83
            long r4 = r0.f68056t
            r0.f68055s = r4
        L83:
            l8.s r2 = l8.w.f82095e
            goto L8e
        L86:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            d7.u.g(r2, r4)
        L8d:
            r2 = r14
        L8e:
            if (r2 != 0) goto La5
            long r4 = a10.e.x(r10)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 == 0) goto La3
            l8.s r2 = new l8.s
            r2.<init>(r3, r4)
            goto La5
        La3:
            l8.s r2 = l8.w.f82096f
        La5:
            boolean r3 = r2.c()
            r3 = r3 ^ r7
            long r4 = r1.f68029g
            long r6 = r1.f68030h
            g8.h0 r8 = r0.f68043g
            int r10 = r1.f68025c
            int r11 = r0.f68037a
            androidx.media3.common.b r12 = r1.f68026d
            int r13 = r1.f68027e
            java.lang.Object r1 = r1.f68028f
            r22 = r2
            r2 = r14
            r14 = r1
            r15 = r4
            r17 = r6
            r19 = r27
            r20 = r3
            r8.f(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 == 0) goto Ld1
            r0.f68052p = r2
            g8.c1 r1 = r0.f68042f
            r1.i(r0)
        Ld1:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.l.e(l8.u, long, long, java.io.IOException, int):l8.s");
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f68045i.d();
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        if (A()) {
            return -3;
        }
        a aVar = this.f68058v;
        a1 a1Var = this.f68049m;
        if (aVar != null && aVar.c(0) <= a1Var.r()) {
            return -3;
        }
        B();
        return a1Var.C(cVar, eVar, i13, this.f68061y);
    }

    @Override // g8.b1
    public final boolean j() {
        return !A() && this.f68049m.x(this.f68061y);
    }

    @Override // l8.v
    public final void m() {
        this.f68049m.D();
        for (a1 a1Var : this.f68050n) {
            a1Var.D();
        }
        this.f68041e.a();
        k kVar = this.f68054r;
        if (kVar != null) {
            p7.d dVar = (p7.d) kVar;
            synchronized (dVar) {
                t tVar = (t) dVar.f98956o.remove(this);
                if (tVar != null) {
                    tVar.g();
                }
            }
        }
    }

    @Override // g8.b1
    public final int o(long j13) {
        if (A()) {
            return 0;
        }
        a1 a1Var = this.f68049m;
        int t13 = a1Var.t(j13, this.f68061y);
        a aVar = this.f68058v;
        if (aVar != null) {
            t13 = Math.min(t13, aVar.c(0) - a1Var.r());
        }
        a1Var.H(t13);
        B();
        return t13;
    }

    @Override // l8.r
    public final void p(u uVar, long j13, long j14, int i13) {
        g8.v vVar;
        f fVar = (f) uVar;
        if (i13 == 0) {
            vVar = new g8.v(fVar.f68023a, fVar.f68024b, j13);
        } else {
            long j15 = fVar.f68023a;
            y yVar = fVar.f68031i;
            vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        }
        this.f68043g.h(vVar, fVar.f68025c, this.f68037a, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h, i13);
    }

    @Override // g8.d1
    public final boolean q(y0 y0Var) {
        long j13;
        List list;
        if (!this.f68061y) {
            w wVar = this.f68045i;
            if (!wVar.d() && !wVar.c()) {
                boolean A = A();
                if (A) {
                    list = Collections.emptyList();
                    j13 = this.f68055s;
                } else {
                    j13 = y().f68030h;
                    list = this.f68048l;
                }
                this.f68041e.f(y0Var, j13, list, this.f68046j);
                a7.o oVar = this.f68046j;
                boolean z13 = oVar.f1154a;
                f fVar = (f) oVar.f1155b;
                oVar.f1155b = null;
                oVar.f1154a = false;
                if (z13) {
                    this.f68055s = -9223372036854775807L;
                    this.f68061y = true;
                    return true;
                }
                if (fVar == null) {
                    return false;
                }
                this.f68052p = fVar;
                boolean z14 = fVar instanceof a;
                c cVar = this.f68051o;
                if (z14) {
                    a aVar = (a) fVar;
                    if (A) {
                        long j14 = this.f68055s;
                        if (aVar.f68029g < j14) {
                            this.f68049m.f64205t = j14;
                            for (a1 a1Var : this.f68050n) {
                                a1Var.f64205t = this.f68055s;
                            }
                            if (this.f68059w) {
                                androidx.media3.common.b bVar = aVar.f68026d;
                                this.f68060x = !o0.a(bVar.f18765o, bVar.f18761k);
                            }
                        }
                        this.f68059w = false;
                        this.f68055s = -9223372036854775807L;
                    }
                    aVar.f68000m = cVar;
                    a1[] a1VarArr = cVar.f68006b;
                    int[] iArr = new int[a1VarArr.length];
                    for (int i13 = 0; i13 < a1VarArr.length; i13++) {
                        a1 a1Var2 = a1VarArr[i13];
                        iArr[i13] = a1Var2.f64202q + a1Var2.f64201p;
                    }
                    aVar.f68001n = iArr;
                    this.f68047k.add(aVar);
                } else if (fVar instanceof o) {
                    ((o) fVar).f68069k = cVar;
                }
                wVar.g(fVar, this, this.f68044h.w(fVar.f68025c));
                return true;
            }
        }
        return false;
    }

    @Override // l8.r
    public final void s(u uVar, long j13, long j14, boolean z13) {
        f fVar = (f) uVar;
        this.f68052p = null;
        this.f68058v = null;
        long j15 = fVar.f68023a;
        y yVar = fVar.f68031i;
        g8.v vVar = new g8.v(yVar.f63853c, yVar.f63854d, j14);
        this.f68044h.getClass();
        this.f68043g.c(vVar, fVar.f68025c, this.f68037a, fVar.f68026d, fVar.f68027e, fVar.f68028f, fVar.f68029g, fVar.f68030h);
        if (z13) {
            return;
        }
        if (A()) {
            this.f68049m.E(false);
            for (a1 a1Var : this.f68050n) {
                a1Var.E(false);
            }
        } else if (fVar instanceof a) {
            ArrayList arrayList = this.f68047k;
            w(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f68055s = this.f68056t;
            }
        }
        this.f68042f.i(this);
    }

    @Override // g8.d1
    public final long t() {
        if (this.f68061y) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f68055s;
        }
        long j13 = this.f68056t;
        a y13 = y();
        if (!y13.b()) {
            ArrayList arrayList = this.f68047k;
            y13 = arrayList.size() > 1 ? (a) ep.b.h(arrayList, 2) : null;
        }
        if (y13 != null) {
            j13 = Math.max(j13, y13.f68030h);
        }
        return Math.max(j13, this.f68049m.p());
    }

    public final void u(long j13, boolean z13) {
        long j14;
        if (A()) {
            return;
        }
        a1 a1Var = this.f68049m;
        int i13 = a1Var.f64202q;
        a1Var.i(j13, z13, true);
        a1 a1Var2 = this.f68049m;
        int i14 = a1Var2.f64202q;
        if (i14 > i13) {
            synchronized (a1Var2) {
                j14 = a1Var2.f64201p == 0 ? Long.MIN_VALUE : a1Var2.f64199n[a1Var2.f64203r];
            }
            int i15 = 0;
            while (true) {
                a1[] a1VarArr = this.f68050n;
                if (i15 >= a1VarArr.length) {
                    break;
                }
                a1VarArr[i15].i(j14, z13, this.f68040d[i15]);
                i15++;
            }
        }
        int min = Math.min(C(i14, 0), this.f68057u);
        if (min > 0) {
            n0.d0(0, min, this.f68047k);
            this.f68057u -= min;
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
        w wVar = this.f68045i;
        if (wVar.c() || A()) {
            return;
        }
        boolean d2 = wVar.d();
        ArrayList arrayList = this.f68047k;
        List list = this.f68048l;
        m mVar = this.f68041e;
        if (d2) {
            f fVar = this.f68052p;
            fVar.getClass();
            boolean z13 = fVar instanceof a;
            if (!(z13 && z(arrayList.size() - 1)) && mVar.g(j13, fVar, list)) {
                wVar.a();
                if (z13) {
                    this.f68058v = (a) fVar;
                    return;
                }
                return;
            }
            return;
        }
        int h10 = mVar.h(j13, list);
        if (h10 < arrayList.size()) {
            bf.b.t(!wVar.d());
            int size = arrayList.size();
            while (true) {
                if (h10 >= size) {
                    h10 = -1;
                    break;
                } else if (!z(h10)) {
                    break;
                } else {
                    h10++;
                }
            }
            if (h10 == -1) {
                return;
            }
            long j14 = y().f68030h;
            a w13 = w(h10);
            if (arrayList.isEmpty()) {
                this.f68055s = this.f68056t;
            }
            this.f68061y = false;
            this.f68043g.i(this.f68037a, w13.f68029g, j14);
        }
    }

    public final a w(int i13) {
        ArrayList arrayList = this.f68047k;
        a aVar = (a) arrayList.get(i13);
        n0.d0(i13, arrayList.size(), arrayList);
        this.f68057u = Math.max(this.f68057u, arrayList.size());
        int i14 = 0;
        this.f68049m.m(aVar.c(0));
        while (true) {
            a1[] a1VarArr = this.f68050n;
            if (i14 >= a1VarArr.length) {
                return aVar;
            }
            a1 a1Var = a1VarArr[i14];
            i14++;
            a1Var.m(aVar.c(i14));
        }
    }

    public final m x() {
        return this.f68041e;
    }

    public final a y() {
        return (a) ep.b.h(this.f68047k, 1);
    }

    public final boolean z(int i13) {
        int r13;
        a aVar = (a) this.f68047k.get(i13);
        if (this.f68049m.r() > aVar.c(0)) {
            return true;
        }
        int i14 = 0;
        do {
            a1[] a1VarArr = this.f68050n;
            if (i14 >= a1VarArr.length) {
                return false;
            }
            r13 = a1VarArr[i14].r();
            i14++;
        } while (r13 <= aVar.c(i14));
        return true;
    }
}
