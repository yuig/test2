package p7;

import a7.c0;
import a7.d0;
import a7.i0;
import a7.j0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.lifecycle.n1;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import d7.n0;
import g7.a0;
import g8.e0;
import g8.h0;
import g8.v;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l8.w;
import l8.x;
import l8.y;
import l8.z;
import n7.q0;

/* loaded from: classes.dex */
public final class j extends g8.a {
    public static final /* synthetic */ int R = 0;
    public g7.f A;
    public w B;
    public a0 C;
    public DashManifestStaleException D;
    public Handler E;
    public c0 F;
    public Uri G;
    public final Uri H;
    public q7.c I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f98984J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;
    public i0 Q;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f98985h;

    /* renamed from: i, reason: collision with root package name */
    public final g7.e f98986i;

    /* renamed from: j, reason: collision with root package name */
    public final a f98987j;

    /* renamed from: k, reason: collision with root package name */
    public final n1 f98988k;

    /* renamed from: l, reason: collision with root package name */
    public final k0.a f98989l;

    /* renamed from: m, reason: collision with root package name */
    public final s7.q f98990m;

    /* renamed from: n, reason: collision with root package name */
    public final a10.e f98991n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.firebase.messaging.q f98992o;

    /* renamed from: p, reason: collision with root package name */
    public final long f98993p;

    /* renamed from: q, reason: collision with root package name */
    public final long f98994q;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f98995r;

    /* renamed from: s, reason: collision with root package name */
    public final y f98996s;

    /* renamed from: t, reason: collision with root package name */
    public final g f98997t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f98998u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f98999v;

    /* renamed from: w, reason: collision with root package name */
    public final e f99000w;

    /* renamed from: x, reason: collision with root package name */
    public final e f99001x;

    /* renamed from: y, reason: collision with root package name */
    public final g f99002y;

    /* renamed from: z, reason: collision with root package name */
    public final x f99003z;

    static {
        j0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [p7.e] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p7.e] */
    public j(i0 i0Var, q7.c cVar, g7.e eVar, y yVar, a aVar, n1 n1Var, k0.a aVar2, s7.q qVar, a10.e eVar2, long j13, long j14) {
        this.Q = i0Var;
        this.F = i0Var.f1074c;
        d0 d0Var = i0Var.f1073b;
        d0Var.getClass();
        Uri uri = d0Var.f969a;
        this.G = uri;
        this.H = uri;
        this.I = cVar;
        this.f98986i = eVar;
        this.f98996s = yVar;
        this.f98987j = aVar;
        this.f98989l = aVar2;
        this.f98990m = qVar;
        this.f98991n = eVar2;
        this.f98993p = j13;
        this.f98994q = j14;
        this.f98988k = n1Var;
        this.f98992o = new com.google.firebase.messaging.q(6);
        final int i13 = 0;
        final int i14 = 1;
        boolean z13 = cVar != null;
        this.f98985h = z13;
        this.f98995r = a(null);
        this.f98998u = new Object();
        this.f98999v = new SparseArray();
        this.f99002y = new g(this);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        if (!z13) {
            this.f98997t = new g(this);
            this.f99003z = new g(this);
            this.f99000w = new Runnable(this) { // from class: p7.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f98969b;

                {
                    this.f98969b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i13;
                    j jVar = this.f98969b;
                    switch (i15) {
                        case 0:
                            jVar.E();
                            break;
                        default:
                            jVar.C(false);
                            break;
                    }
                }
            };
            this.f99001x = new Runnable(this) { // from class: p7.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f98969b;

                {
                    this.f98969b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i14;
                    j jVar = this.f98969b;
                    switch (i15) {
                        case 0:
                            jVar.E();
                            break;
                        default:
                            jVar.C(false);
                            break;
                    }
                }
            };
            return;
        }
        bf.b.t(!cVar.f102607d);
        this.f98997t = null;
        this.f99000w = null;
        this.f99001x = null;
        this.f99003z = new n1();
    }

    public static long x(q7.c cVar, long j13) {
        k l13;
        int size = cVar.f102616m.size() - 1;
        q7.h b13 = cVar.b(size);
        long X = n0.X(b13.f102640b);
        long d2 = cVar.d(size);
        long X2 = n0.X(j13);
        long X3 = n0.X(cVar.f102604a);
        long X4 = n0.X(cVar.f102608e);
        if (X4 == -9223372036854775807L || X4 >= 5000000) {
            X4 = 5000000;
        }
        int i13 = 0;
        while (true) {
            List list = b13.f102641c;
            if (i13 >= list.size()) {
                return ue.c.q(X4, 1000L, RoundingMode.CEILING);
            }
            List list2 = ((q7.a) list.get(i13)).f102596c;
            if (!list2.isEmpty() && (l13 = ((q7.m) list2.get(0)).l()) != null) {
                long d13 = (l13.d(d2, X2) + (X3 + X)) - X2;
                if (d13 > 0 && (d13 < X4 - 100000 || (d13 > X4 && d13 < 100000 + X4))) {
                    X4 = d13;
                }
            }
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(q7.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f102641c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            q7.a r2 = (q7.a) r2
            int r2 = r2.f102595b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.y(q7.h):boolean");
    }

    public static boolean z(q7.h hVar) {
        int i13 = 0;
        while (true) {
            List list = hVar.f102641c;
            if (i13 >= list.size()) {
                return false;
            }
            k l13 = ((q7.m) ((q7.a) list.get(i13)).f102596c.get(0)).l();
            if (l13 == null || l13.h()) {
                return true;
            }
            i13++;
        }
    }

    public final void A(z zVar, long j13, long j14) {
        long j15 = zVar.f82100a;
        Uri d2 = zVar.d();
        Map b13 = zVar.b();
        zVar.a();
        v vVar = new v(d2, b13, j14);
        this.f98991n.getClass();
        this.f98995r.c(vVar, zVar.f82102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void B(IOException iOException) {
        d7.u.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.M = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        C(true);
    }

    public final void C(boolean z13) {
        long j13;
        q7.h hVar;
        long j14;
        long j15;
        q7.h hVar2;
        long j16;
        long j17;
        long j18;
        long j19;
        long j23;
        boolean z14;
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f98999v;
            if (i13 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i13);
            if (keyAt >= this.P) {
                ((d) sparseArray.valueAt(i13)).p(this.I, keyAt - this.P);
            }
            i13++;
        }
        q7.h b13 = this.I.b(0);
        int size = this.I.f102616m.size() - 1;
        q7.h b14 = this.I.b(size);
        long d2 = this.I.d(size);
        long X = n0.X(n0.E(this.M));
        long d13 = this.I.d(0);
        long X2 = n0.X(b13.f102640b);
        boolean y13 = y(b13);
        int i14 = 0;
        long j24 = X2;
        while (true) {
            List list = b13.f102641c;
            long j25 = j24;
            j13 = d2;
            if (i14 >= list.size()) {
                X2 = j25;
                break;
            }
            q7.a aVar = (q7.a) list.get(i14);
            List list2 = aVar.f102596c;
            int i15 = aVar.f102595b;
            boolean z15 = (i15 == 1 || i15 == 2) ? false : true;
            if ((!y13 || !z15) && !list2.isEmpty()) {
                k l13 = ((q7.m) list2.get(0)).l();
                if (l13 == null || l13.j(d13, X) == 0) {
                    break;
                }
                long c13 = l13.c(l13.b(d13, X)) + X2;
                z14 = y13;
                j24 = Math.max(j25, c13);
            } else {
                z14 = y13;
                j24 = j25;
            }
            i14++;
            y13 = z14;
            d2 = j13;
        }
        long X3 = n0.X(b14.f102640b);
        boolean y14 = y(b14);
        long j26 = Long.MAX_VALUE;
        int i16 = 0;
        while (true) {
            List list3 = b14.f102641c;
            if (i16 >= list3.size()) {
                hVar = b13;
                j14 = X;
                j15 = j26;
                break;
            }
            q7.a aVar2 = (q7.a) list3.get(i16);
            List list4 = aVar2.f102596c;
            int i17 = aVar2.f102595b;
            hVar = b13;
            boolean z16 = (i17 == 1 || i17 == 2) ? false : true;
            if ((y14 && z16) || list4.isEmpty()) {
                j18 = X3;
                j23 = X;
                j19 = j13;
            } else {
                k l14 = ((q7.m) list4.get(0)).l();
                if (l14 == null) {
                    j15 = X3 + j13;
                    j14 = X;
                    break;
                }
                j18 = X3;
                j19 = j13;
                long j27 = l14.j(j19, X);
                if (j27 == 0) {
                    j14 = X;
                    j15 = j18;
                    break;
                } else {
                    j23 = X;
                    long b15 = (l14.b(j19, X) + j27) - 1;
                    j26 = Math.min(j26, l14.a(b15, j19) + l14.c(b15) + j18);
                }
            }
            i16++;
            j13 = j19;
            b13 = hVar;
            X3 = j18;
            X = j23;
        }
        boolean z17 = this.I.f102607d && !z(b14);
        if (z17) {
            long j28 = this.I.f102609f;
            if (j28 != -9223372036854775807L) {
                X2 = Math.max(X2, j15 - n0.X(j28));
            }
        }
        long j29 = j15 - X2;
        q7.c cVar = this.I;
        if (cVar.f102607d) {
            bf.b.t(cVar.f102604a != -9223372036854775807L);
            long X4 = (j14 - n0.X(this.I.f102604a)) - X2;
            F(X4, j29);
            long o03 = n0.o0(X2) + this.I.f102604a;
            long X5 = X4 - n0.X(this.F.f959a);
            long min = Math.min(this.f98994q, j29 / 2);
            j17 = X5 < min ? min : X5;
            j16 = o03;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            j16 = -9223372036854775807L;
            j17 = 0;
        }
        long X6 = X2 - n0.X(hVar2.f102640b);
        q7.c cVar2 = this.I;
        o(new f(cVar2.f102604a, j16, this.M, this.P, X6, j29, j17, cVar2, j(), this.I.f102607d ? this.F : null));
        if (this.f98985h) {
            return;
        }
        Handler handler = this.E;
        e eVar = this.f99001x;
        handler.removeCallbacks(eVar);
        if (z17) {
            this.E.postDelayed(eVar, x(this.I, n0.E(this.M)));
        }
        if (this.f98984J) {
            E();
            return;
        }
        if (z13) {
            q7.c cVar3 = this.I;
            if (cVar3.f102607d) {
                long j33 = cVar3.f102608e;
                if (j33 != -9223372036854775807L) {
                    if (j33 == 0) {
                        j33 = 5000;
                    }
                    D(Math.max(0L, (this.K + j33) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void D(long j13) {
        this.E.postDelayed(this.f99000w, j13);
    }

    public final void E() {
        Uri uri;
        this.E.removeCallbacks(this.f99000w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.f98984J = true;
            return;
        }
        synchronized (this.f98998u) {
            uri = this.G;
        }
        this.f98984J = false;
        Map emptyMap = Collections.emptyMap();
        bf.b.x(uri, "The uri must be set.");
        g7.i iVar = new g7.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        if (this.f98989l != null) {
            l8.k kVar = new l8.k(this.f98989l, "d");
            kVar.f82037j = "m";
            q7.c cVar = this.I;
            if (cVar != null) {
                kVar.f82033f = Boolean.valueOf(cVar.f102607d);
            }
            iVar = kVar.a().a(iVar);
        }
        this.B.g(new z(4, this.A, iVar, this.f98996s), this.f98997t, this.f98991n.w(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.F(long, long):void");
    }

    @Override // g8.a
    public final g8.c0 b(e0 e0Var, l8.m mVar, long j13) {
        int intValue = ((Integer) e0Var.f64233a).intValue() - this.P;
        h0 a13 = a(e0Var);
        s7.m mVar2 = new s7.m(this.f64175d.f111329c, 0, e0Var);
        int i13 = this.P + intValue;
        q7.c cVar = this.I;
        a0 a0Var = this.C;
        long j14 = this.M;
        q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        d dVar = new d(i13, cVar, this.f98992o, intValue, this.f98987j, a0Var, this.f98989l, this.f98990m, mVar2, this.f98991n, a13, j14, this.f99003z, mVar, this.f98988k, this.f99002y, q0Var);
        this.f98999v.put(i13, dVar);
        return dVar;
    }

    @Override // g8.a
    public final synchronized i0 j() {
        return this.Q;
    }

    @Override // g8.a
    public final void l() {
        this.f99003z.b();
    }

    @Override // g8.a
    public final void n(a0 a0Var) {
        this.C = a0Var;
        Looper myLooper = Looper.myLooper();
        q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        s7.q qVar = this.f98990m;
        qVar.e(myLooper, q0Var);
        qVar.b();
        if (this.f98985h) {
            C(false);
            return;
        }
        this.A = this.f98986i.a();
        this.B = new w("DashMediaSource");
        this.E = n0.n(null);
        E();
    }

    @Override // g8.a
    public final void q(g8.c0 c0Var) {
        d dVar = (d) c0Var;
        u uVar = dVar.f98955n;
        uVar.f99059i = true;
        uVar.f99054d.removeCallbacksAndMessages(null);
        for (h8.l lVar : dVar.f98961t) {
            lVar.D(dVar);
        }
        dVar.f98960s = null;
        this.f98999v.remove(dVar.f98942a);
    }

    @Override // g8.a
    public final void t() {
        this.f98984J = false;
        this.A = null;
        w wVar = this.B;
        if (wVar != null) {
            wVar.e();
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.f98999v.clear();
        com.google.firebase.messaging.q qVar = this.f98992o;
        ((Map) qVar.f33803a).clear();
        ((Map) qVar.f33804b).clear();
        ((Map) qVar.f33805c).clear();
        this.f98990m.a();
    }

    @Override // g8.a
    public final synchronized void w(i0 i0Var) {
        this.Q = i0Var;
    }
}
