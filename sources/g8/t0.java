package g8;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m7.x1;

/* loaded from: classes3.dex */
public final class t0 implements c0, q8.u, l8.r, l8.v, z0 {
    public static final Map R;
    public static final androidx.media3.common.b S;
    public boolean A;
    public s0 B;
    public q8.e0 C;
    public long D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f64403J;
    public boolean K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f64404a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.f f64405b;

    /* renamed from: c, reason: collision with root package name */
    public final s7.q f64406c;

    /* renamed from: d, reason: collision with root package name */
    public final a10.e f64407d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f64408e;

    /* renamed from: f, reason: collision with root package name */
    public final s7.m f64409f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f64410g;

    /* renamed from: h, reason: collision with root package name */
    public final l8.m f64411h;

    /* renamed from: i, reason: collision with root package name */
    public final String f64412i;

    /* renamed from: j, reason: collision with root package name */
    public final long f64413j;

    /* renamed from: k, reason: collision with root package name */
    public final int f64414k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.media3.common.b f64415l;

    /* renamed from: m, reason: collision with root package name */
    public final long f64416m;

    /* renamed from: n, reason: collision with root package name */
    public final l8.w f64417n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.appcompat.app.d f64418o;

    /* renamed from: p, reason: collision with root package name */
    public final a7.o f64419p;

    /* renamed from: q, reason: collision with root package name */
    public final n0 f64420q;

    /* renamed from: r, reason: collision with root package name */
    public final n0 f64421r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f64422s;

    /* renamed from: t, reason: collision with root package name */
    public b0 f64423t;

    /* renamed from: u, reason: collision with root package name */
    public c9.b f64424u;

    /* renamed from: v, reason: collision with root package name */
    public a1[] f64425v;

    /* renamed from: w, reason: collision with root package name */
    public r0[] f64426w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f64427x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f64428y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f64429z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        R = Collections.unmodifiableMap(hashMap);
        a7.q qVar = new a7.q();
        qVar.f1168a = "icy";
        qVar.f1181n = a7.o0.r("application/x-icy");
        S = qVar.a();
    }

    public t0(Uri uri, g7.f fVar, androidx.appcompat.app.d dVar, s7.q qVar, s7.m mVar, a10.e eVar, h0 h0Var, v0 v0Var, l8.m mVar2, String str, int i13, int i14, androidx.media3.common.b bVar, long j13, m8.a aVar) {
        this.f64404a = uri;
        this.f64405b = fVar;
        this.f64406c = qVar;
        this.f64409f = mVar;
        this.f64407d = eVar;
        this.f64408e = h0Var;
        this.f64410g = v0Var;
        this.f64411h = mVar2;
        this.f64412i = str;
        this.f64413j = i13;
        this.f64414k = i14;
        this.f64415l = bVar;
        this.f64417n = aVar != null ? new l8.w(aVar) : new l8.w("ProgressiveMediaPeriod");
        this.f64418o = dVar;
        this.f64416m = j13;
        this.f64419p = new a7.o(1);
        this.f64420q = new n0(this, 1);
        this.f64421r = new n0(this, 2);
        this.f64422s = d7.n0.n(null);
        this.f64426w = new r0[0];
        this.f64425v = new a1[0];
        this.M = -9223372036854775807L;
        this.F = 1;
    }

    @Override // q8.u
    public final void A() {
        this.f64427x = true;
        this.f64422s.post(this.f64420q);
    }

    public final void B(int i13) {
        i();
        if (this.N) {
            if ((!this.f64429z || this.B.f64399b[i13]) && !this.f64425v[i13].x(false)) {
                this.M = 0L;
                this.N = false;
                this.H = true;
                this.L = 0L;
                this.O = 0;
                for (a1 a1Var : this.f64425v) {
                    a1Var.E(false);
                }
                b0 b0Var = this.f64423t;
                b0Var.getClass();
                b0Var.i(this);
            }
        }
    }

    public final q8.k0 C(r0 r0Var) {
        int length = this.f64425v.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (r0Var.equals(this.f64426w[i13])) {
                return this.f64425v[i13];
            }
        }
        if (this.f64427x) {
            d7.u.g("ProgressiveMediaPeriod", "Extractor added new track (id=" + r0Var.f64396a + ") after finishing tracks.");
            return new q8.r();
        }
        s7.q qVar = this.f64406c;
        qVar.getClass();
        s7.m mVar = this.f64409f;
        mVar.getClass();
        a1 a1Var = new a1(this.f64411h, qVar, mVar);
        a1Var.f64191f = this;
        int i14 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.f64426w, i14);
        r0VarArr[length] = r0Var;
        int i15 = d7.n0.f53866a;
        this.f64426w = r0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.f64425v, i14);
        a1VarArr[length] = a1Var;
        this.f64425v = a1VarArr;
        return a1Var;
    }

    @Override // q8.u
    public final q8.k0 D(int i13, int i14) {
        return C(new r0(i13, false));
    }

    public final void E(q8.e0 e0Var) {
        this.C = this.f64424u == null ? e0Var : new q8.w(-9223372036854775807L);
        this.D = e0Var.l();
        boolean z13 = !this.K && e0Var.l() == -9223372036854775807L;
        this.E = z13;
        this.F = z13 ? 7 : 1;
        if (this.f64428y) {
            this.f64410g.y(this.D, e0Var, z13);
        } else {
            y();
        }
    }

    public final void F() {
        p0 p0Var = new p0(this, this.f64404a, this.f64405b, this.f64418o, this, this.f64419p);
        if (this.f64428y) {
            bf.b.t(x());
            long j13 = this.D;
            if (j13 != -9223372036854775807L && this.M > j13) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            q8.e0 e0Var = this.C;
            e0Var.getClass();
            long j14 = e0Var.e(this.M).f102898a.f102915b;
            long j15 = this.M;
            p0Var.f64376g.f102894a = j14;
            p0Var.f64379j = j15;
            p0Var.f64378i = true;
            p0Var.f64382m = false;
            for (a1 a1Var : this.f64425v) {
                a1Var.f64205t = this.M;
            }
            this.M = -9223372036854775807L;
        }
        this.O = o();
        this.f64417n.g(p0Var, this, this.f64407d.w(this.F));
    }

    public final boolean G() {
        return this.H || x();
    }

    @Override // g8.d1
    public final long a() {
        return t();
    }

    @Override // g8.z0
    public final void b() {
        this.f64422s.post(this.f64420q);
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        i();
        if (!this.C.h()) {
            return 0L;
        }
        q8.d0 e13 = this.C.e(j13);
        return x1Var.a(j13, e13.f102898a.f102914a, e13.f102899b.f102914a);
    }

    @Override // l8.r
    public final void d(l8.u uVar, long j13, long j14) {
        p0 p0Var = (p0) uVar;
        if (this.D == -9223372036854775807L && this.C != null) {
            long w13 = w(true);
            long j15 = w13 == Long.MIN_VALUE ? 0L : w13 + 10000;
            this.D = j15;
            this.f64410g.y(j15, this.C, this.E);
        }
        g7.y yVar = p0Var.f64372c;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f64407d.getClass();
        this.f64408e.e(vVar, 1, -1, null, 0, null, p0Var.f64379j, this.D);
        this.P = true;
        b0 b0Var = this.f64423t;
        b0Var.getClass();
        b0Var.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // l8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l8.s e(l8.u r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.t0.e(l8.u, long, long, java.io.IOException, int):l8.s");
    }

    @Override // g8.c0
    public final long f(long j13) {
        i();
        boolean[] zArr = this.B.f64399b;
        if (!this.C.h()) {
            j13 = 0;
        }
        this.H = false;
        boolean z13 = this.L == j13;
        this.L = j13;
        if (x()) {
            this.M = j13;
            return j13;
        }
        int i13 = this.F;
        l8.w wVar = this.f64417n;
        if (i13 != 7 && (this.P || wVar.d())) {
            int length = this.f64425v.length;
            for (int i14 = 0; i14 < length; i14++) {
                a1 a1Var = this.f64425v[i14];
                if (a1Var.r() != 0 || !z13) {
                    if (this.A ? a1Var.F(a1Var.f64202q) : a1Var.G(j13, false)) {
                        continue;
                    } else if (!zArr[i14] && this.f64429z) {
                    }
                }
            }
            return j13;
        }
        this.N = false;
        this.M = j13;
        this.P = false;
        this.I = false;
        if (wVar.d()) {
            for (a1 a1Var2 : this.f64425v) {
                a1Var2.j();
            }
            wVar.a();
        } else {
            wVar.f82099c = null;
            for (a1 a1Var3 : this.f64425v) {
                a1Var3.E(false);
            }
        }
        return j13;
    }

    @Override // g8.d1
    public final boolean g() {
        boolean z13;
        if (this.f64417n.d()) {
            a7.o oVar = this.f64419p;
            synchronized (oVar) {
                z13 = oVar.f1154a;
            }
            if (z13) {
                return true;
            }
        }
        return false;
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f64423t = b0Var;
        androidx.media3.common.b bVar = this.f64415l;
        if (bVar == null) {
            this.f64419p.h();
            F();
        } else {
            D(this.f64414k, 3).b(bVar);
            E(new q8.b0(-9223372036854775807L, new long[]{0}, new long[]{0}));
            A();
            this.M = j13;
        }
    }

    public final void i() {
        bf.b.t(this.f64428y);
        this.B.getClass();
        this.C.getClass();
    }

    @Override // q8.u
    public final void j(q8.e0 e0Var) {
        this.f64422s.post(new w2.c(23, this, e0Var));
    }

    @Override // g8.c0
    public final long k() {
        if (this.I) {
            this.I = false;
            return this.L;
        }
        if (!this.H) {
            return -9223372036854775807L;
        }
        if (!this.P && o() <= this.O) {
            return -9223372036854775807L;
        }
        this.H = false;
        return this.L;
    }

    @Override // g8.c0
    public final long l(k8.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        boolean[] zArr3;
        k8.t tVar;
        i();
        s0 s0Var = this.B;
        m1 m1Var = s0Var.f64398a;
        int i13 = this.f64403J;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int length = tVarArr.length;
            zArr3 = s0Var.f64400c;
            if (i15 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i15];
            if (b1Var != null && (tVarArr[i15] == null || !zArr[i15])) {
                int i16 = ((q0) b1Var).f64394a;
                bf.b.t(zArr3[i16]);
                this.f64403J--;
                zArr3[i16] = false;
                b1VarArr[i15] = null;
            }
            i15++;
        }
        boolean z13 = !this.G ? j13 == 0 || this.A : i13 != 0;
        for (int i17 = 0; i17 < tVarArr.length; i17++) {
            if (b1VarArr[i17] == null && (tVar = tVarArr[i17]) != null) {
                bf.b.t(tVar.length() == 1);
                bf.b.t(tVar.f(0) == 0);
                int b13 = m1Var.b(tVar.m());
                bf.b.t(!zArr3[b13]);
                this.f64403J++;
                zArr3[b13] = true;
                this.I = tVar.r().f18771u | this.I;
                b1VarArr[i17] = new q0(this, b13);
                zArr2[i17] = true;
                if (!z13) {
                    a1 a1Var = this.f64425v[b13];
                    z13 = (a1Var.r() == 0 || a1Var.G(j13, true)) ? false : true;
                }
            }
        }
        if (this.f64403J == 0) {
            this.N = false;
            this.H = false;
            this.I = false;
            l8.w wVar = this.f64417n;
            if (wVar.d()) {
                a1[] a1VarArr = this.f64425v;
                int length2 = a1VarArr.length;
                while (i14 < length2) {
                    a1VarArr[i14].j();
                    i14++;
                }
                wVar.a();
            } else {
                this.P = false;
                for (a1 a1Var2 : this.f64425v) {
                    a1Var2.E(false);
                }
            }
        } else if (z13) {
            j13 = f(j13);
            while (i14 < b1VarArr.length) {
                if (b1VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
                i14++;
            }
        }
        this.G = true;
        return j13;
    }

    @Override // l8.v
    public final void m() {
        for (a1 a1Var : this.f64425v) {
            a1Var.D();
        }
        this.f64418o.L();
    }

    @Override // g8.c0
    public final void n() {
        int w13 = this.f64407d.w(this.F);
        l8.w wVar = this.f64417n;
        IOException iOException = wVar.f82099c;
        if (iOException != null) {
            throw iOException;
        }
        l8.t tVar = wVar.f82098b;
        if (tVar != null) {
            if (w13 == Integer.MIN_VALUE) {
                w13 = tVar.f82084a;
            }
            IOException iOException2 = tVar.f82088e;
            if (iOException2 != null && tVar.f82089f > w13) {
                throw iOException2;
            }
        }
        if (this.P && !this.f64428y) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    public final int o() {
        int i13 = 0;
        for (a1 a1Var : this.f64425v) {
            i13 += a1Var.f64202q + a1Var.f64201p;
        }
        return i13;
    }

    @Override // l8.r
    public final void p(l8.u uVar, long j13, long j14, int i13) {
        v vVar;
        p0 p0Var = (p0) uVar;
        g7.y yVar = p0Var.f64372c;
        if (i13 == 0) {
            vVar = new v(p0Var.f64370a, p0Var.f64380k, j13);
        } else {
            vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        }
        this.f64408e.h(vVar, 1, -1, null, 0, null, p0Var.f64379j, this.D, i13);
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        if (this.P) {
            return false;
        }
        l8.w wVar = this.f64417n;
        if (wVar.c() || this.N) {
            return false;
        }
        if ((this.f64428y || this.f64415l != null) && this.f64403J == 0) {
            return false;
        }
        boolean h10 = this.f64419p.h();
        if (wVar.d()) {
            return h10;
        }
        F();
        return true;
    }

    @Override // g8.c0
    public final m1 r() {
        i();
        return this.B.f64398a;
    }

    @Override // l8.r
    public final void s(l8.u uVar, long j13, long j14, boolean z13) {
        p0 p0Var = (p0) uVar;
        g7.y yVar = p0Var.f64372c;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f64407d.getClass();
        this.f64408e.c(vVar, 1, -1, null, 0, null, p0Var.f64379j, this.D);
        if (z13) {
            return;
        }
        for (a1 a1Var : this.f64425v) {
            a1Var.E(false);
        }
        if (this.f64403J > 0) {
            b0 b0Var = this.f64423t;
            b0Var.getClass();
            b0Var.i(this);
        }
    }

    @Override // g8.d1
    public final long t() {
        long j13;
        boolean z13;
        i();
        if (this.P || this.f64403J == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.M;
        }
        if (this.f64429z) {
            int length = this.f64425v.length;
            j13 = Long.MAX_VALUE;
            for (int i13 = 0; i13 < length; i13++) {
                s0 s0Var = this.B;
                if (s0Var.f64399b[i13] && s0Var.f64400c[i13]) {
                    a1 a1Var = this.f64425v[i13];
                    synchronized (a1Var) {
                        z13 = a1Var.f64208w;
                    }
                    if (!z13) {
                        j13 = Math.min(j13, this.f64425v[i13].p());
                    }
                }
            }
        } else {
            j13 = Long.MAX_VALUE;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = w(false);
        }
        return j13 == Long.MIN_VALUE ? this.L : j13;
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        if (this.A) {
            return;
        }
        i();
        if (x()) {
            return;
        }
        boolean[] zArr = this.B.f64400c;
        int length = this.f64425v.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f64425v[i13].i(j13, z13, zArr[i13]);
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
    }

    public final long w(boolean z13) {
        int i13;
        long j13 = Long.MIN_VALUE;
        while (i13 < this.f64425v.length) {
            if (!z13) {
                s0 s0Var = this.B;
                s0Var.getClass();
                i13 = s0Var.f64400c[i13] ? 0 : i13 + 1;
            }
            j13 = Math.max(j13, this.f64425v[i13].p());
        }
        return j13;
    }

    public final boolean x() {
        return this.M != -9223372036854775807L;
    }

    public final void y() {
        long j13;
        int i13;
        if (this.Q || this.f64428y || !this.f64427x || this.C == null) {
            return;
        }
        for (a1 a1Var : this.f64425v) {
            if (a1Var.u() == null) {
                return;
            }
        }
        this.f64419p.f();
        int length = this.f64425v.length;
        a7.c1[] c1VarArr = new a7.c1[length];
        boolean[] zArr = new boolean[length];
        int i14 = 0;
        while (true) {
            j13 = this.f64416m;
            if (i14 >= length) {
                break;
            }
            androidx.media3.common.b u13 = this.f64425v[i14].u();
            u13.getClass();
            String str = u13.f18765o;
            boolean m13 = a7.o0.m(str);
            boolean z13 = m13 || a7.o0.q(str);
            zArr[i14] = z13;
            this.f64429z = z13 | this.f64429z;
            this.A = j13 != -9223372036854775807L && length == 1 && a7.o0.o(str);
            c9.b bVar = this.f64424u;
            if (bVar != null) {
                if (m13 || this.f64426w[i14].f64397b) {
                    a7.n0 n0Var = u13.f18762l;
                    a7.n0 n0Var2 = n0Var == null ? new a7.n0(bVar) : n0Var.a(bVar);
                    a7.q a13 = u13.a();
                    a13.f1178k = n0Var2;
                    u13 = new androidx.media3.common.b(a13);
                }
                if (m13 && u13.f18758h == -1 && u13.f18759i == -1 && (i13 = bVar.f26964a) != -1) {
                    a7.q a14 = u13.a();
                    a14.f1175h = i13;
                    u13 = new androidx.media3.common.b(a14);
                }
            }
            int d2 = this.f64406c.d(u13);
            a7.q a15 = u13.a();
            a15.M = d2;
            androidx.media3.common.b a16 = a15.a();
            c1VarArr[i14] = new a7.c1(Integer.toString(i14), a16);
            this.I = a16.f18771u | this.I;
            i14++;
        }
        this.B = new s0(new m1(c1VarArr), zArr);
        if (this.A && this.D == -9223372036854775807L) {
            this.D = j13;
            this.C = new o0(this, this.C);
        }
        this.f64410g.y(this.D, this.C, this.E);
        this.f64428y = true;
        b0 b0Var = this.f64423t;
        b0Var.getClass();
        b0Var.e(this);
    }

    public final void z(int i13) {
        i();
        s0 s0Var = this.B;
        boolean[] zArr = s0Var.f64401d;
        if (zArr[i13]) {
            return;
        }
        androidx.media3.common.b bVar = s0Var.f64398a.a(i13).f967d[0];
        this.f64408e.b(a7.o0.j(bVar.f18765o), bVar, 0, null, this.L);
        zArr[i13] = true;
    }
}
