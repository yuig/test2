package g8;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public class a1 implements q8.k0 {
    public androidx.media3.common.b A;
    public androidx.media3.common.b B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f64186a;

    /* renamed from: d, reason: collision with root package name */
    public final s7.q f64189d;

    /* renamed from: e, reason: collision with root package name */
    public final s7.m f64190e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f64191f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.common.b f64192g;

    /* renamed from: h, reason: collision with root package name */
    public s7.j f64193h;

    /* renamed from: p, reason: collision with root package name */
    public int f64201p;

    /* renamed from: q, reason: collision with root package name */
    public int f64202q;

    /* renamed from: r, reason: collision with root package name */
    public int f64203r;

    /* renamed from: s, reason: collision with root package name */
    public int f64204s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f64208w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f64211z;

    /* renamed from: b, reason: collision with root package name */
    public final h7.b f64187b = new h7.b();

    /* renamed from: i, reason: collision with root package name */
    public int f64194i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f64195j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f64196k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f64199n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f64198m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f64197l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public q8.j0[] f64200o = new q8.j0[1000];

    /* renamed from: c, reason: collision with root package name */
    public final e5.d f64188c = new e5.d(new c3.e(11));

    /* renamed from: t, reason: collision with root package name */
    public long f64205t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f64206u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f64207v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f64210y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f64209x = true;
    public boolean D = true;

    public a1(l8.m mVar, s7.q qVar, s7.m mVar2) {
        this.f64189d = qVar;
        this.f64190e = mVar2;
        this.f64186a = new x0(mVar);
    }

    public final void A(androidx.media3.common.b bVar, qq2.c cVar) {
        androidx.media3.common.b bVar2;
        androidx.media3.common.b bVar3 = this.f64192g;
        boolean z13 = bVar3 == null;
        DrmInitData drmInitData = bVar3 == null ? null : bVar3.f18769s;
        this.f64192g = bVar;
        DrmInitData drmInitData2 = bVar.f18769s;
        s7.q qVar = this.f64189d;
        if (qVar != null) {
            int d2 = qVar.d(bVar);
            a7.q a13 = bVar.a();
            a13.M = d2;
            bVar2 = a13.a();
        } else {
            bVar2 = bVar;
        }
        cVar.f104884c = bVar2;
        cVar.f104883b = this.f64193h;
        if (qVar == null) {
            return;
        }
        if (z13 || !Objects.equals(drmInitData, drmInitData2)) {
            s7.j jVar = this.f64193h;
            s7.m mVar = this.f64190e;
            s7.j c13 = qVar.c(mVar, bVar);
            this.f64193h = c13;
            cVar.f104883b = c13;
            if (jVar != null) {
                jVar.c(mVar);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th3) {
            throw th3;
        }
        return v() ? this.f64195j[s(this.f64204s)] : this.C;
    }

    public final int C(qq2.c cVar, k7.e eVar, int i13, boolean z13) {
        int i14;
        boolean z14 = (i13 & 2) != 0;
        h7.b bVar = this.f64187b;
        synchronized (this) {
            try {
                eVar.f78455f = false;
                i14 = -3;
                if (v()) {
                    androidx.media3.common.b bVar2 = ((y0) this.f64188c.d(r())).f64480a;
                    if (!z14 && bVar2 == this.f64192g) {
                        int s13 = s(this.f64204s);
                        if (y(s13)) {
                            eVar.f57530b = this.f64198m[s13];
                            if (this.f64204s == this.f64201p - 1 && (z13 || this.f64208w)) {
                                eVar.e(536870912);
                            }
                            eVar.f78456g = this.f64199n[s13];
                            bVar.f67850a = this.f64197l[s13];
                            bVar.f67851b = this.f64196k[s13];
                            bVar.f67852c = this.f64200o[s13];
                            i14 = -4;
                        } else {
                            eVar.f78455f = true;
                        }
                    }
                    A(bVar2, cVar);
                    i14 = -5;
                } else {
                    if (!z13 && !this.f64208w) {
                        androidx.media3.common.b bVar3 = this.B;
                        if (bVar3 == null || (!z14 && bVar3 == this.f64192g)) {
                        }
                        A(bVar3, cVar);
                        i14 = -5;
                    }
                    eVar.f57530b = 4;
                    eVar.f78456g = Long.MIN_VALUE;
                    i14 = -4;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (i14 == -4 && !eVar.i(4)) {
            boolean z15 = (i13 & 1) != 0;
            if ((i13 & 4) == 0) {
                if (z15) {
                    x0 x0Var = this.f64186a;
                    x0.f(x0Var.f64476e, eVar, this.f64187b, x0Var.f64474c);
                } else {
                    x0 x0Var2 = this.f64186a;
                    x0Var2.f64476e = x0.f(x0Var2.f64476e, eVar, this.f64187b, x0Var2.f64474c);
                }
            }
            if (!z15) {
                this.f64204s++;
            }
        }
        return i14;
    }

    public final void D() {
        E(true);
        s7.j jVar = this.f64193h;
        if (jVar != null) {
            jVar.c(this.f64190e);
            this.f64193h = null;
            this.f64192g = null;
        }
    }

    public final void E(boolean z13) {
        x0 x0Var = this.f64186a;
        x0Var.a(x0Var.f64475d);
        w0 w0Var = x0Var.f64475d;
        bf.b.t(w0Var.f64467c == null);
        w0Var.f64465a = 0L;
        w0Var.f64466b = x0Var.f64473b;
        w0 w0Var2 = x0Var.f64475d;
        x0Var.f64476e = w0Var2;
        x0Var.f64477f = w0Var2;
        x0Var.f64478g = 0L;
        x0Var.f64472a.a();
        this.f64201p = 0;
        this.f64202q = 0;
        this.f64203r = 0;
        this.f64204s = 0;
        this.f64209x = true;
        this.f64205t = Long.MIN_VALUE;
        this.f64206u = Long.MIN_VALUE;
        this.f64207v = Long.MIN_VALUE;
        this.f64208w = false;
        this.f64188c.b();
        if (z13) {
            this.A = null;
            this.B = null;
            this.f64210y = true;
            this.D = true;
        }
    }

    public final synchronized boolean F(int i13) {
        synchronized (this) {
            this.f64204s = 0;
            x0 x0Var = this.f64186a;
            x0Var.f64476e = x0Var.f64475d;
        }
        int i14 = this.f64202q;
        if (i13 >= i14 && i13 <= this.f64201p + i14) {
            this.f64205t = Long.MIN_VALUE;
            this.f64204s = i13 - i14;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j13, boolean z13) {
        int n13;
        try {
            synchronized (this) {
                this.f64204s = 0;
                x0 x0Var = this.f64186a;
                x0Var.f64476e = x0Var.f64475d;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        int s13 = s(0);
        if (v() && j13 >= this.f64199n[s13] && (j13 <= this.f64207v || z13)) {
            if (this.D) {
                int i13 = this.f64201p - this.f64204s;
                n13 = 0;
                while (true) {
                    if (n13 >= i13) {
                        if (!z13) {
                            i13 = -1;
                        }
                        n13 = i13;
                    } else {
                        if (this.f64199n[s13] >= j13) {
                            break;
                        }
                        s13++;
                        if (s13 == this.f64194i) {
                            s13 = 0;
                        }
                        n13++;
                    }
                }
            } else {
                n13 = n(s13, this.f64201p - this.f64204s, j13, true);
            }
            if (n13 == -1) {
                return false;
            }
            this.f64205t = j13;
            this.f64204s += n13;
            return true;
        }
        return false;
    }

    public final synchronized void H(int i13) {
        boolean z13;
        if (i13 >= 0) {
            try {
                if (this.f64204s + i13 <= this.f64201p) {
                    z13 = true;
                    bf.b.i(z13);
                    this.f64204s += i13;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        z13 = false;
        bf.b.i(z13);
        this.f64204s += i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        if (((g8.y0) ((android.util.SparseArray) r10).valueAt(((android.util.SparseArray) r10).size() - 1)).f64480a.equals(r9.B) == false) goto L52;
     */
    @Override // q8.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, int r12, int r13, int r14, q8.j0 r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.a1.a(long, int, int, int, q8.j0):void");
    }

    @Override // q8.k0
    public final void b(androidx.media3.common.b bVar) {
        androidx.media3.common.b o13 = o(bVar);
        boolean z13 = false;
        this.f64211z = false;
        this.A = bVar;
        synchronized (this) {
            try {
                this.f64210y = false;
                if (!Objects.equals(o13, this.B)) {
                    if (((SparseArray) this.f64188c.f57216c).size() != 0) {
                        Object obj = this.f64188c.f57216c;
                        if (((y0) ((SparseArray) obj).valueAt(((SparseArray) obj).size() - 1)).f64480a.equals(o13)) {
                            Object obj2 = this.f64188c.f57216c;
                            this.B = ((y0) ((SparseArray) obj2).valueAt(((SparseArray) obj2).size() - 1)).f64480a;
                            boolean z14 = this.D;
                            androidx.media3.common.b bVar2 = this.B;
                            this.D = z14 & a7.o0.a(bVar2.f18765o, bVar2.f18761k);
                            this.E = false;
                            z13 = true;
                        }
                    }
                    this.B = o13;
                    boolean z142 = this.D;
                    androidx.media3.common.b bVar22 = this.B;
                    this.D = z142 & a7.o0.a(bVar22.f18765o, bVar22.f18761k);
                    this.E = false;
                    z13 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        z0 z0Var = this.f64191f;
        if (z0Var == null || !z13) {
            return;
        }
        z0Var.b();
    }

    @Override // q8.k0
    public final void d(int i13, int i14, d7.d0 d0Var) {
        while (true) {
            x0 x0Var = this.f64186a;
            if (i13 <= 0) {
                x0Var.getClass();
                return;
            }
            int c13 = x0Var.c(i13);
            w0 w0Var = x0Var.f64477f;
            l8.a aVar = w0Var.f64467c;
            d0Var.i(aVar.f81985a, ((int) (x0Var.f64478g - w0Var.f64465a)) + aVar.f81986b, c13);
            i13 -= c13;
            long j13 = x0Var.f64478g + c13;
            x0Var.f64478g = j13;
            w0 w0Var2 = x0Var.f64477f;
            if (j13 == w0Var2.f64466b) {
                x0Var.f64477f = w0Var2.f64468d;
            }
        }
    }

    @Override // q8.k0
    public final int e(a7.k kVar, int i13, boolean z13) {
        x0 x0Var = this.f64186a;
        int c13 = x0Var.c(i13);
        w0 w0Var = x0Var.f64477f;
        l8.a aVar = w0Var.f64467c;
        int read = kVar.read(aVar.f81985a, ((int) (x0Var.f64478g - w0Var.f64465a)) + aVar.f81986b, c13);
        if (read == -1) {
            if (z13) {
                return -1;
            }
            throw new EOFException();
        }
        long j13 = x0Var.f64478g + read;
        x0Var.f64478g = j13;
        w0 w0Var2 = x0Var.f64477f;
        if (j13 != w0Var2.f64466b) {
            return read;
        }
        x0Var.f64477f = w0Var2.f64468d;
        return read;
    }

    public final synchronized boolean f(long j13) {
        if (this.f64201p == 0) {
            return j13 > this.f64206u;
        }
        synchronized (this) {
            if (Math.max(this.f64206u, q(this.f64204s)) >= j13) {
                return false;
            }
            l(this.f64202q + g(j13));
            return true;
        }
    }

    public final int g(long j13) {
        int i13 = this.f64201p;
        int s13 = s(i13 - 1);
        while (i13 > this.f64204s && this.f64199n[s13] >= j13) {
            i13--;
            s13--;
            if (s13 == -1) {
                s13 = this.f64194i - 1;
            }
        }
        return i13;
    }

    public final long h(int i13) {
        this.f64206u = Math.max(this.f64206u, q(i13));
        this.f64201p -= i13;
        int i14 = this.f64202q + i13;
        this.f64202q = i14;
        int i15 = this.f64203r + i13;
        this.f64203r = i15;
        int i16 = this.f64194i;
        if (i15 >= i16) {
            this.f64203r = i15 - i16;
        }
        int i17 = this.f64204s - i13;
        this.f64204s = i17;
        int i18 = 0;
        if (i17 < 0) {
            this.f64204s = 0;
        }
        while (true) {
            e5.d dVar = this.f64188c;
            if (i18 >= ((SparseArray) dVar.f57216c).size() - 1) {
                break;
            }
            int i19 = i18 + 1;
            if (i14 < ((SparseArray) dVar.f57216c).keyAt(i19)) {
                break;
            }
            ((d7.i) dVar.f57217d).accept(((SparseArray) dVar.f57216c).valueAt(i18));
            ((SparseArray) dVar.f57216c).removeAt(i18);
            int i23 = dVar.f57215b;
            if (i23 > 0) {
                dVar.f57215b = i23 - 1;
            }
            i18 = i19;
        }
        if (this.f64201p != 0) {
            return this.f64196k[this.f64203r];
        }
        int i24 = this.f64203r;
        if (i24 == 0) {
            i24 = this.f64194i;
        }
        return this.f64196k[i24 - 1] + this.f64197l[r6];
    }

    public final void i(long j13, boolean z13, boolean z14) {
        long j14;
        int i13;
        x0 x0Var = this.f64186a;
        synchronized (this) {
            try {
                int i14 = this.f64201p;
                j14 = -1;
                if (i14 != 0) {
                    long[] jArr = this.f64199n;
                    int i15 = this.f64203r;
                    if (j13 >= jArr[i15]) {
                        if (z14 && (i13 = this.f64204s) != i14) {
                            i14 = i13 + 1;
                        }
                        int n13 = n(i15, i14, j13, z13);
                        if (n13 != -1) {
                            j14 = h(n13);
                        }
                    }
                }
            } finally {
            }
        }
        x0Var.b(j14);
    }

    public final void j() {
        long h10;
        x0 x0Var = this.f64186a;
        synchronized (this) {
            int i13 = this.f64201p;
            h10 = i13 == 0 ? -1L : h(i13);
        }
        x0Var.b(h10);
    }

    public final void k(long j13) {
        long max;
        if (this.f64201p == 0) {
            return;
        }
        synchronized (this) {
            max = Math.max(this.f64206u, q(this.f64204s));
        }
        bf.b.i(j13 > max);
        m(this.f64202q + g(j13));
    }

    public final long l(int i13) {
        int i14 = this.f64202q;
        int i15 = this.f64201p;
        int i16 = (i14 + i15) - i13;
        boolean z13 = false;
        bf.b.i(i16 >= 0 && i16 <= i15 - this.f64204s);
        int i17 = this.f64201p - i16;
        this.f64201p = i17;
        this.f64207v = Math.max(this.f64206u, q(i17));
        if (i16 == 0 && this.f64208w) {
            z13 = true;
        }
        this.f64208w = z13;
        e5.d dVar = this.f64188c;
        for (int size = ((SparseArray) dVar.f57216c).size() - 1; size >= 0 && i13 < ((SparseArray) dVar.f57216c).keyAt(size); size--) {
            ((d7.i) dVar.f57217d).accept(((SparseArray) dVar.f57216c).valueAt(size));
            ((SparseArray) dVar.f57216c).removeAt(size);
        }
        dVar.f57215b = ((SparseArray) dVar.f57216c).size() > 0 ? Math.min(dVar.f57215b, ((SparseArray) dVar.f57216c).size() - 1) : -1;
        int i18 = this.f64201p;
        if (i18 == 0) {
            return 0L;
        }
        return this.f64196k[s(i18 - 1)] + this.f64197l[r9];
    }

    public final void m(int i13) {
        long l13 = l(i13);
        x0 x0Var = this.f64186a;
        bf.b.i(l13 <= x0Var.f64478g);
        x0Var.f64478g = l13;
        int i14 = x0Var.f64473b;
        if (l13 != 0) {
            w0 w0Var = x0Var.f64475d;
            if (l13 != w0Var.f64465a) {
                while (x0Var.f64478g > w0Var.f64466b) {
                    w0Var = w0Var.f64468d;
                }
                w0 w0Var2 = w0Var.f64468d;
                w0Var2.getClass();
                x0Var.a(w0Var2);
                w0 w0Var3 = new w0(w0Var.f64466b, i14);
                w0Var.f64468d = w0Var3;
                if (x0Var.f64478g == w0Var.f64466b) {
                    w0Var = w0Var3;
                }
                x0Var.f64477f = w0Var;
                if (x0Var.f64476e == w0Var2) {
                    x0Var.f64476e = w0Var3;
                    return;
                }
                return;
            }
        }
        x0Var.a(x0Var.f64475d);
        w0 w0Var4 = new w0(x0Var.f64478g, i14);
        x0Var.f64475d = w0Var4;
        x0Var.f64476e = w0Var4;
        x0Var.f64477f = w0Var4;
    }

    public final int n(int i13, int i14, long j13, boolean z13) {
        int i15 = -1;
        for (int i16 = 0; i16 < i14; i16++) {
            long j14 = this.f64199n[i13];
            if (j14 > j13) {
                return i15;
            }
            if (!z13 || (this.f64198m[i13] & 1) != 0) {
                if (j14 == j13) {
                    return i16;
                }
                i15 = i16;
            }
            i13++;
            if (i13 == this.f64194i) {
                i13 = 0;
            }
        }
        return i15;
    }

    public androidx.media3.common.b o(androidx.media3.common.b bVar) {
        if (this.F == 0 || bVar.f18770t == Long.MAX_VALUE) {
            return bVar;
        }
        a7.q a13 = bVar.a();
        a13.f1186s = bVar.f18770t + this.F;
        return new androidx.media3.common.b(a13);
    }

    public final synchronized long p() {
        return this.f64207v;
    }

    public final long q(int i13) {
        long j13 = Long.MIN_VALUE;
        if (i13 == 0) {
            return Long.MIN_VALUE;
        }
        int s13 = s(i13 - 1);
        for (int i14 = 0; i14 < i13; i14++) {
            j13 = Math.max(j13, this.f64199n[s13]);
            if ((this.f64198m[s13] & 1) != 0) {
                break;
            }
            s13--;
            if (s13 == -1) {
                s13 = this.f64194i - 1;
            }
        }
        return j13;
    }

    public final int r() {
        return this.f64202q + this.f64204s;
    }

    public final int s(int i13) {
        int i14 = this.f64203r + i13;
        int i15 = this.f64194i;
        return i14 < i15 ? i14 : i14 - i15;
    }

    public final synchronized int t(long j13, boolean z13) {
        int s13 = s(this.f64204s);
        if (v() && j13 >= this.f64199n[s13]) {
            if (j13 > this.f64207v && z13) {
                return this.f64201p - this.f64204s;
            }
            int n13 = n(s13, this.f64201p - this.f64204s, j13, true);
            if (n13 == -1) {
                return 0;
            }
            return n13;
        }
        return 0;
    }

    public final synchronized androidx.media3.common.b u() {
        return this.f64210y ? null : this.B;
    }

    public final boolean v() {
        return this.f64204s != this.f64201p;
    }

    public final void w() {
        this.f64211z = true;
    }

    public final synchronized boolean x(boolean z13) {
        androidx.media3.common.b bVar;
        boolean z14 = true;
        if (v()) {
            if (((y0) this.f64188c.d(r())).f64480a != this.f64192g) {
                return true;
            }
            return y(s(this.f64204s));
        }
        if (!z13 && !this.f64208w && ((bVar = this.B) == null || bVar == this.f64192g)) {
            z14 = false;
        }
        return z14;
    }

    public final boolean y(int i13) {
        s7.j jVar = this.f64193h;
        return jVar == null || jVar.getState() == 4 || ((this.f64198m[i13] & 1073741824) == 0 && this.f64193h.d());
    }

    public final void z() {
        s7.j jVar = this.f64193h;
        if (jVar == null || jVar.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException a13 = this.f64193h.a();
        a13.getClass();
        throw a13;
    }
}
