package a8;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import g8.a1;
import g8.b1;
import g8.m1;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import m7.x1;
import m7.y0;
import pk.a3;
import pk.c1;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public final class z implements g8.c0 {

    /* renamed from: a */
    public final l8.m f1479a;

    /* renamed from: b */
    public final Handler f1480b = d7.n0.n(null);

    /* renamed from: c */
    public final u f1481c;

    /* renamed from: d */
    public final p f1482d;

    /* renamed from: e */
    public final ArrayList f1483e;

    /* renamed from: f */
    public final ArrayList f1484f;

    /* renamed from: g */
    public final q f1485g;

    /* renamed from: h */
    public final d f1486h;

    /* renamed from: i */
    public g8.b0 f1487i;

    /* renamed from: j */
    public v2 f1488j;

    /* renamed from: k */
    public IOException f1489k;

    /* renamed from: l */
    public RtspMediaSource$RtspPlaybackException f1490l;

    /* renamed from: m */
    public long f1491m;

    /* renamed from: n */
    public long f1492n;

    /* renamed from: o */
    public long f1493o;

    /* renamed from: p */
    public boolean f1494p;

    /* renamed from: q */
    public boolean f1495q;

    /* renamed from: r */
    public boolean f1496r;

    /* renamed from: s */
    public boolean f1497s;

    /* renamed from: t */
    public boolean f1498t;

    /* renamed from: u */
    public int f1499u;

    /* renamed from: v */
    public boolean f1500v;

    public z(l8.m mVar, d dVar, Uri uri, q qVar, String str, SocketFactory socketFactory, boolean z13) {
        this.f1479a = mVar;
        this.f1486h = dVar;
        this.f1485g = qVar;
        u uVar = new u(this);
        this.f1481c = uVar;
        this.f1482d = new p(uVar, uVar, str, uri, socketFactory, z13);
        this.f1483e = new ArrayList();
        this.f1484f = new ArrayList();
        this.f1492n = -9223372036854775807L;
        this.f1491m = -9223372036854775807L;
        this.f1493o = -9223372036854775807L;
    }

    public static void A(z zVar) {
        a1 a1Var;
        if (zVar.f1496r || zVar.f1497s) {
            return;
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList = zVar.f1483e;
            if (i13 >= arrayList.size()) {
                zVar.f1497s = true;
                c1 r13 = c1.r(arrayList);
                x0 x0Var = new x0();
                for (int i14 = 0; i14 < r13.size(); i14++) {
                    a1Var = ((x) r13.get(i14)).f1472c;
                    String num = Integer.toString(i14);
                    androidx.media3.common.b u13 = a1Var.u();
                    bf.b.n(u13);
                    x0Var.g(new a7.c1(num, u13));
                }
                zVar.f1488j = x0Var.i();
                g8.b0 b0Var = zVar.f1487i;
                bf.b.n(b0Var);
                b0Var.e(zVar);
                return;
            }
            if (((x) arrayList.get(i13)).f1472c.u() == null) {
                return;
            } else {
                i13++;
            }
        }
    }

    public static void C(z zVar) {
        boolean z13;
        zVar.f1500v = true;
        zVar.f1482d.P();
        d b13 = zVar.f1486h.b();
        if (b13 == null) {
            zVar.f1490l = new IOException("No fallback data channel factory for TCP retry") { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                public RtspMediaSource$RtspPlaybackException(Exception exc) {
                    super(exc);
                }
            };
            return;
        }
        ArrayList arrayList = zVar.f1483e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = zVar.f1484f;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            x xVar = (x) arrayList.get(i13);
            z13 = xVar.f1473d;
            if (z13) {
                arrayList2.add(xVar);
            } else {
                w wVar = xVar.f1470a;
                x xVar2 = new x(zVar, wVar.f1466a, i13, b13);
                arrayList2.add(xVar2);
                xVar2.d();
                if (arrayList3.contains(wVar)) {
                    arrayList4.add(xVar2.f1470a);
                }
            }
        }
        c1 r13 = c1.r(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i14 = 0; i14 < r13.size(); i14++) {
            ((x) r13.get(i14)).c();
        }
    }

    public static boolean o(z zVar) {
        return zVar.f1492n != -9223372036854775807L;
    }

    public static f x(z zVar, Uri uri) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = zVar.f1483e;
            if (i13 >= arrayList.size()) {
                return null;
            }
            if (!((x) arrayList.get(i13)).f1473d) {
                w wVar = ((x) arrayList.get(i13)).f1470a;
                if (wVar.a().equals(uri)) {
                    return wVar.f1467b;
                }
            }
            i13++;
        }
    }

    public static void z(z zVar) {
        zVar.f1494p = true;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = zVar.f1483e;
            if (i13 >= arrayList.size()) {
                return;
            }
            zVar.f1494p = ((x) arrayList.get(i13)).f1473d & zVar.f1494p;
            i13++;
        }
    }

    public final void E() {
        ArrayList arrayList;
        boolean z13 = true;
        int i13 = 0;
        while (true) {
            arrayList = this.f1484f;
            if (i13 >= arrayList.size()) {
                break;
            }
            z13 &= ((w) arrayList.get(i13)).f1468c != null;
            i13++;
        }
        if (z13 && this.f1498t) {
            p pVar = this.f1482d;
            pVar.f1430f.addAll(arrayList);
            pVar.M();
        }
    }

    @Override // g8.d1
    public final long a() {
        return t();
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        return j13;
    }

    @Override // g8.c0
    public final long f(long j13) {
        if (t() == 0 && !this.f1500v) {
            this.f1493o = j13;
            return j13;
        }
        u(j13, false);
        this.f1491m = j13;
        if (this.f1492n != -9223372036854775807L) {
            p pVar = this.f1482d;
            int i13 = pVar.f1440p;
            if (i13 == 1) {
                return j13;
            }
            if (i13 != 2) {
                throw new IllegalStateException();
            }
            this.f1492n = j13;
            pVar.Q(j13);
            return j13;
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f1483e;
            if (i14 >= arrayList.size()) {
                return j13;
            }
            if (!((x) arrayList.get(i14)).f1472c.G(j13, false)) {
                this.f1492n = j13;
                if (this.f1494p) {
                    for (int i15 = 0; i15 < this.f1483e.size(); i15++) {
                        x xVar = (x) this.f1483e.get(i15);
                        bf.b.t(xVar.f1473d);
                        xVar.f1473d = false;
                        z(xVar.f1475f);
                        xVar.d();
                    }
                    if (this.f1500v) {
                        this.f1482d.S(d7.n0.o0(j13));
                    } else {
                        this.f1482d.Q(j13);
                    }
                } else {
                    this.f1482d.Q(j13);
                }
                for (int i16 = 0; i16 < this.f1483e.size(); i16++) {
                    x xVar2 = (x) this.f1483e.get(i16);
                    if (!xVar2.f1473d) {
                        g gVar = xVar2.f1470a.f1467b.f1318h;
                        gVar.getClass();
                        synchronized (gVar.f1330e) {
                            gVar.f1336k = true;
                        }
                        xVar2.f1472c.E(false);
                        xVar2.f1472c.f64205t = j13;
                    }
                }
                return j13;
            }
            i14++;
        }
    }

    @Override // g8.d1
    public final boolean g() {
        int i13;
        return !this.f1494p && ((i13 = this.f1482d.f1440p) == 2 || i13 == 1);
    }

    @Override // g8.c0
    public final void h(g8.b0 b0Var, long j13) {
        p pVar = this.f1482d;
        this.f1487i = b0Var;
        try {
            pVar.getClass();
            try {
                pVar.f1434j.a(pVar.O(pVar.f1433i));
                Uri uri = pVar.f1433i;
                String str = pVar.f1436l;
                bn0.a aVar = pVar.f1432h;
                aVar.k(aVar.d(4, str, a3.f100350g, uri));
            } catch (IOException e13) {
                d7.n0.g(pVar.f1434j);
                throw e13;
            }
        } catch (IOException e14) {
            this.f1489k = e14;
            d7.n0.g(pVar);
        }
    }

    @Override // g8.c0
    public final long k() {
        if (!this.f1495q) {
            return -9223372036854775807L;
        }
        this.f1495q = false;
        return 0L;
    }

    @Override // g8.c0
    public final long l(k8.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        ArrayList arrayList;
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            if (b1VarArr[i13] != null && (tVarArr[i13] == null || !zArr[i13])) {
                b1VarArr[i13] = null;
            }
        }
        ArrayList arrayList2 = this.f1484f;
        arrayList2.clear();
        int i14 = 0;
        while (true) {
            int length = tVarArr.length;
            arrayList = this.f1483e;
            if (i14 >= length) {
                break;
            }
            k8.t tVar = tVarArr[i14];
            if (tVar != null) {
                a7.c1 m13 = tVar.m();
                v2 v2Var = this.f1488j;
                v2Var.getClass();
                int indexOf = v2Var.indexOf(m13);
                x xVar = (x) arrayList.get(indexOf);
                xVar.getClass();
                arrayList2.add(xVar.f1470a);
                if (this.f1488j.contains(m13) && b1VarArr[i14] == null) {
                    b1VarArr[i14] = new y(this, indexOf);
                    zArr2[i14] = true;
                }
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            x xVar2 = (x) arrayList.get(i15);
            if (!arrayList2.contains(xVar2.f1470a)) {
                xVar2.c();
            }
        }
        this.f1498t = true;
        if (j13 != 0) {
            this.f1491m = j13;
            this.f1492n = j13;
            this.f1493o = j13;
        }
        E();
        return j13;
    }

    @Override // g8.c0
    public final void n() {
        IOException iOException = this.f1489k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // g8.d1
    public final boolean q(y0 y0Var) {
        return g();
    }

    @Override // g8.c0
    public final m1 r() {
        bf.b.t(this.f1497s);
        v2 v2Var = this.f1488j;
        v2Var.getClass();
        return new m1((a7.c1[]) v2Var.toArray(new a7.c1[0]));
    }

    @Override // g8.d1
    public final long t() {
        if (!this.f1494p) {
            ArrayList arrayList = this.f1483e;
            if (!arrayList.isEmpty()) {
                long j13 = this.f1491m;
                if (j13 != -9223372036854775807L) {
                    return j13;
                }
                boolean z13 = true;
                long j14 = Long.MAX_VALUE;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    x xVar = (x) arrayList.get(i13);
                    if (!xVar.f1473d) {
                        j14 = Math.min(j14, xVar.f1472c.p());
                        z13 = false;
                    }
                }
                if (z13 || j14 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j14;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        if (this.f1492n != -9223372036854775807L) {
            return;
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f1483e;
            if (i13 >= arrayList.size()) {
                return;
            }
            x xVar = (x) arrayList.get(i13);
            if (!xVar.f1473d) {
                xVar.f1472c.i(j13, z13, true);
            }
            i13++;
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
    }
}
