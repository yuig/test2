package d8;

import a7.d0;
import a7.i0;
import a7.j0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.n1;
import d7.n0;
import g7.a0;
import g7.i;
import g8.b0;
import g8.c0;
import g8.e0;
import g8.f1;
import g8.h0;
import g8.v;
import h8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import l8.k;
import l8.m;
import l8.r;
import l8.u;
import l8.w;
import l8.x;
import l8.y;
import l8.z;
import n7.q0;
import s7.q;
import u0.n;

/* loaded from: classes3.dex */
public final class f extends g8.a implements r {
    public static final /* synthetic */ int B = 0;
    public i0 A;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f53970h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f53971i;

    /* renamed from: j, reason: collision with root package name */
    public final g7.e f53972j;

    /* renamed from: k, reason: collision with root package name */
    public final d f53973k;

    /* renamed from: l, reason: collision with root package name */
    public final n1 f53974l;

    /* renamed from: m, reason: collision with root package name */
    public final k0.a f53975m;

    /* renamed from: n, reason: collision with root package name */
    public final q f53976n;

    /* renamed from: o, reason: collision with root package name */
    public final a10.e f53977o;

    /* renamed from: p, reason: collision with root package name */
    public final long f53978p;

    /* renamed from: q, reason: collision with root package name */
    public final h0 f53979q;

    /* renamed from: r, reason: collision with root package name */
    public final y f53980r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f53981s;

    /* renamed from: t, reason: collision with root package name */
    public g7.f f53982t;

    /* renamed from: u, reason: collision with root package name */
    public w f53983u;

    /* renamed from: v, reason: collision with root package name */
    public x f53984v;

    /* renamed from: w, reason: collision with root package name */
    public a0 f53985w;

    /* renamed from: x, reason: collision with root package name */
    public long f53986x;

    /* renamed from: y, reason: collision with root package name */
    public e8.c f53987y;

    /* renamed from: z, reason: collision with root package name */
    public Handler f53988z;

    static {
        j0.a("media3.exoplayer.smoothstreaming");
    }

    public f(i0 i0Var, g7.e eVar, y yVar, d dVar, n1 n1Var, k0.a aVar, q qVar, a10.e eVar2, long j13) {
        this.A = i0Var;
        d0 d0Var = i0Var.f1073b;
        d0Var.getClass();
        this.f53987y = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = d0Var.f969a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = n0.f53873h.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f53971i = uri2;
        this.f53972j = eVar;
        this.f53980r = yVar;
        this.f53973k = dVar;
        this.f53974l = n1Var;
        this.f53975m = aVar;
        this.f53976n = qVar;
        this.f53977o = eVar2;
        this.f53978p = j13;
        this.f53979q = a(null);
        this.f53970h = false;
        this.f53981s = new ArrayList();
    }

    @Override // g8.a
    public final c0 b(e0 e0Var, m mVar, long j13) {
        h0 a13 = a(e0Var);
        s7.m mVar2 = new s7.m(this.f64175d.f111329c, 0, e0Var);
        e8.c cVar = this.f53987y;
        a0 a0Var = this.f53985w;
        x xVar = this.f53984v;
        e eVar = new e(cVar, this.f53973k, a0Var, this.f53974l, this.f53975m, this.f53976n, mVar2, this.f53977o, a13, xVar, mVar);
        this.f53981s.add(eVar);
        return eVar;
    }

    @Override // l8.r
    public final void d(u uVar, long j13, long j14) {
        z zVar = (z) uVar;
        long j15 = zVar.f82100a;
        g7.y yVar = zVar.f82103d;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f53977o.getClass();
        this.f53979q.d(vVar, zVar.f82102c);
        this.f53987y = (e8.c) zVar.f82105f;
        this.f53986x = j13 - j14;
        x();
        if (this.f53987y.f57720d) {
            this.f53988z.postDelayed(new n(this, 19), Math.max(0L, (this.f53986x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    @Override // l8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l8.s e(l8.u r3, long r4, long r6, java.io.IOException r8, int r9) {
        /*
            r2 = this;
            l8.z r3 = (l8.z) r3
            g8.v r4 = new g8.v
            long r0 = r3.f82100a
            g7.y r5 = r3.f82103d
            android.net.Uri r0 = r5.f63853c
            java.util.Map r5 = r5.f63854d
            r4.<init>(r0, r5, r6)
            a10.e r5 = r2.f53977o
            r5.getClass()
            boolean r5 = r8 instanceof androidx.media3.common.ParserException
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L4d
            boolean r5 = r8 instanceof java.io.FileNotFoundException
            if (r5 != 0) goto L4d
            boolean r5 = r8 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r5 != 0) goto L4d
            boolean r5 = r8 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r5 != 0) goto L4d
            int r5 = androidx.media3.datasource.DataSourceException.f18777b
            r5 = r8
        L2c:
            if (r5 == 0) goto L41
            boolean r0 = r5 instanceof androidx.media3.datasource.DataSourceException
            if (r0 == 0) goto L3c
            r0 = r5
            androidx.media3.datasource.DataSourceException r0 = (androidx.media3.datasource.DataSourceException) r0
            int r0 = r0.f18778a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L3c
            goto L4d
        L3c:
            java.lang.Throwable r5 = r5.getCause()
            goto L2c
        L41:
            int r9 = r9 + (-1)
            int r9 = r9 * 1000
            r5 = 5000(0x1388, float:7.006E-42)
            int r5 = java.lang.Math.min(r9, r5)
            long r0 = (long) r5
            goto L4e
        L4d:
            r0 = r6
        L4e:
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L55
            l8.s r5 = l8.w.f82096f
            goto L5b
        L55:
            l8.s r5 = new l8.s
            r6 = 0
            r5.<init>(r6, r0)
        L5b:
            boolean r6 = r5.c()
            r6 = r6 ^ 1
            g8.h0 r7 = r2.f53979q
            int r3 = r3.f82102c
            r7.g(r4, r3, r8, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f.e(l8.u, long, long, java.io.IOException, int):l8.s");
    }

    @Override // g8.a
    public final synchronized i0 j() {
        return this.A;
    }

    @Override // g8.a
    public final void l() {
        this.f53984v.b();
    }

    @Override // g8.a
    public final void n(a0 a0Var) {
        this.f53985w = a0Var;
        Looper myLooper = Looper.myLooper();
        q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        q qVar = this.f53976n;
        qVar.e(myLooper, q0Var);
        qVar.b();
        if (this.f53970h) {
            this.f53984v = new n1();
            x();
            return;
        }
        this.f53982t = this.f53972j.a();
        w wVar = new w("SsMediaSource");
        this.f53983u = wVar;
        this.f53984v = wVar;
        this.f53988z = n0.n(null);
        y();
    }

    @Override // l8.r
    public final void p(u uVar, long j13, long j14, int i13) {
        v vVar;
        z zVar = (z) uVar;
        if (i13 == 0) {
            vVar = new v(zVar.f82100a, zVar.f82101b, j13);
        } else {
            long j15 = zVar.f82100a;
            g7.y yVar = zVar.f82103d;
            vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        }
        this.f53979q.h(vVar, zVar.f82102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i13);
    }

    @Override // g8.a
    public final void q(c0 c0Var) {
        e eVar = (e) c0Var;
        for (l lVar : eVar.f53968n) {
            lVar.D(null);
        }
        eVar.f53966l = null;
        this.f53981s.remove(c0Var);
    }

    @Override // l8.r
    public final void s(u uVar, long j13, long j14, boolean z13) {
        z zVar = (z) uVar;
        long j15 = zVar.f82100a;
        g7.y yVar = zVar.f82103d;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f53977o.getClass();
        this.f53979q.c(vVar, zVar.f82102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // g8.a
    public final void t() {
        this.f53987y = this.f53970h ? this.f53987y : null;
        this.f53982t = null;
        this.f53986x = 0L;
        w wVar = this.f53983u;
        if (wVar != null) {
            wVar.f(null);
            this.f53983u = null;
        }
        Handler handler = this.f53988z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f53988z = null;
        }
        this.f53976n.a();
    }

    @Override // g8.a
    public final synchronized void w(i0 i0Var) {
        this.A = i0Var;
    }

    public final void x() {
        f1 f1Var;
        l[] lVarArr;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f53981s;
            if (i13 >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i13);
            e8.c cVar = this.f53987y;
            eVar.f53967m = cVar;
            l[] lVarArr2 = eVar.f53968n;
            int length = lVarArr2.length;
            int i14 = 0;
            while (i14 < length) {
                c cVar2 = (c) lVarArr2[i14].f68041e;
                e8.b[] bVarArr = cVar2.f53951g.f57722f;
                int i15 = cVar2.f53946b;
                e8.b bVar = bVarArr[i15];
                int i16 = bVar.f57711k;
                e8.b bVar2 = cVar.f57722f[i15];
                if (i16 == 0 || bVar2.f57711k == 0) {
                    lVarArr = lVarArr2;
                    cVar2.f53952h += i16;
                } else {
                    int i17 = i16 - 1;
                    long[] jArr = bVar.f57715o;
                    long c13 = bVar.c(i17) + jArr[i17];
                    lVarArr = lVarArr2;
                    long j13 = bVar2.f57715o[0];
                    if (c13 <= j13) {
                        cVar2.f53952h += i16;
                    } else {
                        cVar2.f53952h = n0.e(jArr, j13, true) + cVar2.f53952h;
                    }
                }
                cVar2.f53951g = cVar;
                i14++;
                lVarArr2 = lVarArr;
            }
            b0 b0Var = eVar.f53966l;
            b0Var.getClass();
            b0Var.i(eVar);
            i13++;
        }
        long j14 = Long.MIN_VALUE;
        long j15 = Long.MAX_VALUE;
        for (e8.b bVar3 : this.f53987y.f57722f) {
            if (bVar3.f57711k > 0) {
                long[] jArr2 = bVar3.f57715o;
                j15 = Math.min(j15, jArr2[0]);
                int i18 = bVar3.f57711k - 1;
                j14 = Math.max(j14, bVar3.c(i18) + jArr2[i18]);
            }
        }
        if (j15 == Long.MAX_VALUE) {
            long j16 = this.f53987y.f57720d ? -9223372036854775807L : 0L;
            e8.c cVar3 = this.f53987y;
            boolean z13 = cVar3.f57720d;
            f1Var = new f1(j16, 0L, 0L, 0L, true, z13, z13, cVar3, j());
        } else {
            e8.c cVar4 = this.f53987y;
            if (cVar4.f57720d) {
                long j17 = cVar4.f57724h;
                if (j17 != -9223372036854775807L && j17 > 0) {
                    j15 = Math.max(j15, j14 - j17);
                }
                long j18 = j15;
                long j19 = j14 - j18;
                long X = j19 - n0.X(this.f53978p);
                if (X < 5000000) {
                    X = Math.min(5000000L, j19 / 2);
                }
                f1Var = new f1(-9223372036854775807L, j19, j18, X, true, true, true, this.f53987y, j());
            } else {
                long j23 = cVar4.f57723g;
                long j24 = j23 != -9223372036854775807L ? j23 : j14 - j15;
                f1Var = new f1(j15 + j24, j24, j15, 0L, true, false, false, this.f53987y, j());
            }
        }
        o(f1Var);
    }

    public final void y() {
        if (this.f53983u.c()) {
            return;
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = this.f53971i;
        bf.b.x(uri, "The uri must be set.");
        i iVar = new i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        k0.a aVar = this.f53975m;
        if (aVar != null) {
            k kVar = new k(aVar, "s");
            kVar.f82037j = "m";
            e8.c cVar = this.f53987y;
            if (cVar != null) {
                kVar.f82033f = Boolean.valueOf(cVar.f57720d);
            }
            iVar = kVar.a().a(iVar);
        }
        z zVar = new z(4, this.f53982t, iVar, this.f53980r);
        this.f53983u.g(zVar, this, this.f53977o.w(zVar.f82102c));
    }
}
