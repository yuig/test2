package t7;

import a7.b0;
import a7.c0;
import a7.d0;
import a7.i0;
import a7.j0;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.n1;
import d7.n0;
import g7.a0;
import g8.e0;
import g8.f1;
import g8.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l8.z;
import n7.q0;
import pk.c1;

/* loaded from: classes3.dex */
public final class o extends g8.a implements v7.s {

    /* renamed from: h, reason: collision with root package name */
    public final k f116548h;

    /* renamed from: i, reason: collision with root package name */
    public final c f116549i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f116550j;

    /* renamed from: k, reason: collision with root package name */
    public final k0.a f116551k;

    /* renamed from: l, reason: collision with root package name */
    public final s7.q f116552l;

    /* renamed from: m, reason: collision with root package name */
    public final a10.e f116553m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f116554n;

    /* renamed from: o, reason: collision with root package name */
    public final int f116555o;

    /* renamed from: q, reason: collision with root package name */
    public final v7.t f116557q;

    /* renamed from: r, reason: collision with root package name */
    public final long f116558r;

    /* renamed from: t, reason: collision with root package name */
    public c0 f116560t;

    /* renamed from: u, reason: collision with root package name */
    public a0 f116561u;

    /* renamed from: v, reason: collision with root package name */
    public i0 f116562v;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f116556p = false;

    /* renamed from: s, reason: collision with root package name */
    public final long f116559s = 0;

    static {
        j0.a("media3.exoplayer.hls");
    }

    public o(i0 i0Var, c cVar, k kVar, n1 n1Var, k0.a aVar, s7.q qVar, a10.e eVar, v7.c cVar2, long j13, boolean z13, int i13) {
        this.f116562v = i0Var;
        this.f116560t = i0Var.f1074c;
        this.f116549i = cVar;
        this.f116548h = kVar;
        this.f116550j = n1Var;
        this.f116551k = aVar;
        this.f116552l = qVar;
        this.f116553m = eVar;
        this.f116557q = cVar2;
        this.f116558r = j13;
        this.f116554n = z13;
        this.f116555o = i13;
    }

    public static v7.f x(long j13, c1 c1Var) {
        v7.f fVar = null;
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            v7.f fVar2 = (v7.f) c1Var.get(i13);
            long j14 = fVar2.f124289e;
            if (j14 > j13 || !fVar2.f124278l) {
                if (j14 > j13) {
                    break;
                }
            } else {
                fVar = fVar2;
            }
        }
        return fVar;
    }

    @Override // g8.a
    public final g8.c0 b(e0 e0Var, l8.m mVar, long j13) {
        h0 a13 = a(e0Var);
        s7.m mVar2 = new s7.m(this.f64175d.f111329c, 0, e0Var);
        a0 a0Var = this.f116561u;
        q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        return new n(this.f116548h, this.f116557q, this.f116549i, a0Var, this.f116551k, this.f116552l, mVar2, this.f116553m, a13, mVar, this.f116550j, this.f116554n, this.f116555o, this.f116556p, q0Var, this.f116559s);
    }

    @Override // g8.a
    public final synchronized i0 j() {
        return this.f116562v;
    }

    @Override // g8.a
    public final void l() {
        v7.c cVar = (v7.c) this.f116557q;
        l8.w wVar = cVar.f124252h;
        if (wVar != null) {
            wVar.b();
        }
        Uri uri = cVar.f124256l;
        if (uri != null) {
            v7.b bVar = (v7.b) cVar.f124248d.get(uri);
            bVar.f124233b.b();
            IOException iOException = bVar.f124241j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // g8.a
    public final void n(a0 a0Var) {
        this.f116561u = a0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        s7.q qVar = this.f116552l;
        qVar.e(myLooper, q0Var);
        qVar.b();
        h0 a13 = a(null);
        d0 d0Var = j().f1073b;
        d0Var.getClass();
        v7.c cVar = (v7.c) this.f116557q;
        cVar.getClass();
        cVar.f124253i = n0.n(null);
        cVar.f124251g = a13;
        cVar.f124254j = this;
        Map emptyMap = Collections.emptyMap();
        Uri uri = d0Var.f969a;
        bf.b.x(uri, "The uri must be set.");
        g7.i iVar = new g7.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        k0.a aVar = cVar.f124250f;
        if (aVar != null) {
            l8.k kVar = new l8.k(aVar, "h");
            kVar.f82037j = "m";
            iVar = kVar.a().a(iVar);
        }
        z zVar = new z(4, cVar.f124245a.f116467a.a(), iVar, cVar.f124246b.n());
        bf.b.t(cVar.f124252h == null);
        l8.w wVar = new l8.w("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f124252h = wVar;
        wVar.g(zVar, cVar, cVar.f124247c.w(zVar.f82102c));
    }

    @Override // g8.a
    public final void q(g8.c0 c0Var) {
        n nVar = (n) c0Var;
        ((v7.c) nVar.f116523b).f124249e.remove(nVar);
        for (t tVar : nVar.f116544w) {
            if (tVar.D) {
                for (s sVar : tVar.f116598v) {
                    sVar.j();
                    s7.j jVar = sVar.f64193h;
                    if (jVar != null) {
                        jVar.c(sVar.f64190e);
                        sVar.f64193h = null;
                        sVar.f64192g = null;
                    }
                }
            }
            j jVar2 = tVar.f116580d;
            v7.b bVar = (v7.b) ((v7.c) jVar2.f116489g).f124248d.get(jVar2.f116487e[jVar2.f116501s.q()]);
            if (bVar != null) {
                bVar.f124242k = false;
            }
            jVar2.f116498p = null;
            tVar.f116586j.f(tVar);
            tVar.f116594r.removeCallbacksAndMessages(null);
            tVar.H = true;
            tVar.f116595s.clear();
        }
        nVar.f116541t = null;
    }

    @Override // g8.a
    public final void t() {
        v7.c cVar = (v7.c) this.f116557q;
        cVar.f124256l = null;
        cVar.f124257m = null;
        cVar.f124255k = null;
        cVar.f124259o = -9223372036854775807L;
        cVar.f124252h.f(null);
        cVar.f124252h = null;
        HashMap hashMap = cVar.f124248d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((v7.b) it.next()).f124233b.f(null);
        }
        cVar.f124253i.removeCallbacksAndMessages(null);
        cVar.f124253i = null;
        hashMap.clear();
        this.f116552l.a();
    }

    @Override // g8.a
    public final synchronized void w(i0 i0Var) {
        this.f116562v = i0Var;
    }

    public final void y(v7.k kVar) {
        f1 f1Var;
        long j13;
        long j14;
        long j15;
        boolean z13 = kVar.f124313p;
        long j16 = kVar.f124305h;
        long o03 = z13 ? n0.o0(j16) : -9223372036854775807L;
        int i13 = kVar.f124301d;
        long j17 = (i13 == 2 || i13 == 1) ? o03 : -9223372036854775807L;
        v7.c cVar = (v7.c) this.f116557q;
        v7.n nVar = cVar.f124255k;
        nVar.getClass();
        sp2.i iVar = new sp2.i(14, nVar, kVar);
        boolean z14 = cVar.f124258n;
        long j18 = kVar.f124318u;
        long j19 = 0;
        c1 c1Var = kVar.f124315r;
        boolean z15 = kVar.f124304g;
        long j23 = o03;
        long j24 = kVar.f124302e;
        if (z14) {
            long j25 = j17;
            long j26 = j16 - cVar.f124259o;
            boolean z16 = kVar.f124312o;
            long j27 = z16 ? j26 + j18 : -9223372036854775807L;
            long X = z13 ? n0.X(n0.E(this.f116558r)) - (j16 + j18) : 0L;
            long j28 = this.f116560t.f959a;
            v7.j jVar = kVar.f124319v;
            if (j28 != -9223372036854775807L) {
                j14 = n0.X(j28);
            } else {
                if (j24 != -9223372036854775807L) {
                    j13 = j18 - j24;
                } else {
                    long j29 = jVar.f124299d;
                    if (j29 == -9223372036854775807L || kVar.f124311n == -9223372036854775807L) {
                        j13 = jVar.f124298c;
                        if (j13 == -9223372036854775807L) {
                            j13 = 3 * kVar.f124310m;
                        }
                    } else {
                        j13 = j29;
                    }
                }
                j14 = j13 + X;
            }
            long j33 = j18 + X;
            long j34 = n0.j(j14, X, j33);
            c0 c0Var = j().f1074c;
            boolean z17 = c0Var.f962d == -3.4028235E38f && c0Var.f963e == -3.4028235E38f && jVar.f124298c == -9223372036854775807L && jVar.f124299d == -9223372036854775807L;
            b0 b0Var = new b0();
            b0Var.f953a = n0.o0(j34);
            b0Var.f956d = z17 ? 1.0f : this.f116560t.f962d;
            b0Var.f957e = z17 ? 1.0f : this.f116560t.f963e;
            c0 c0Var2 = new c0(b0Var);
            this.f116560t = c0Var2;
            if (j24 == -9223372036854775807L) {
                j24 = j33 - n0.X(c0Var2.f959a);
            }
            if (z15) {
                j19 = j24;
            } else {
                v7.f x13 = x(j24, kVar.f124316s);
                if (x13 != null) {
                    j15 = x13.f124289e;
                } else if (!c1Var.isEmpty()) {
                    v7.h hVar = (v7.h) c1Var.get(n0.c(c1Var, Long.valueOf(j24), true));
                    v7.f x14 = x(j24, hVar.f124284m);
                    j15 = x14 != null ? x14.f124289e : hVar.f124289e;
                }
                j19 = j15;
            }
            f1Var = new f1(j25, j23, j27, kVar.f124318u, j26, j19, true, !z16, i13 == 2 && kVar.f124303f, iVar, j(), this.f116560t);
        } else {
            long j35 = j17;
            if (j24 != -9223372036854775807L && !c1Var.isEmpty()) {
                j19 = (z15 || j24 == j18) ? j24 : ((v7.h) c1Var.get(n0.c(c1Var, Long.valueOf(j24), true))).f124289e;
            }
            i0 j36 = j();
            long j37 = kVar.f124318u;
            f1Var = new f1(j35, j23, j37, j37, 0L, j19, true, false, true, iVar, j36, null);
        }
        o(f1Var);
    }
}
