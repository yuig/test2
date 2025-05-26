package d8;

import a7.o;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import d7.n0;
import h8.i;
import h8.m;
import h8.n;
import j9.p;
import j9.q;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k8.t;
import l8.k;
import l8.x;
import l9.j;
import m7.x1;
import m7.y0;
import pk.v2;

/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final x f53945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53946b;

    /* renamed from: c, reason: collision with root package name */
    public final i[] f53947c;

    /* renamed from: d, reason: collision with root package name */
    public final g7.f f53948d;

    /* renamed from: e, reason: collision with root package name */
    public final k0.a f53949e;

    /* renamed from: f, reason: collision with root package name */
    public t f53950f;

    /* renamed from: g, reason: collision with root package name */
    public e8.c f53951g;

    /* renamed from: h, reason: collision with root package name */
    public int f53952h;

    /* renamed from: i, reason: collision with root package name */
    public BehindLiveWindowException f53953i;

    /* renamed from: j, reason: collision with root package name */
    public long f53954j = -9223372036854775807L;

    public c(x xVar, e8.c cVar, int i13, t tVar, g7.f fVar, k0.a aVar, j jVar, boolean z13) {
        q[] qVarArr;
        this.f53945a = xVar;
        this.f53951g = cVar;
        this.f53946b = i13;
        this.f53950f = tVar;
        this.f53948d = fVar;
        this.f53949e = aVar;
        e8.b bVar = cVar.f57722f[i13];
        this.f53947c = new i[tVar.length()];
        for (int i14 = 0; i14 < this.f53947c.length; i14++) {
            int f13 = tVar.f(i14);
            androidx.media3.common.b bVar2 = bVar.f57710j[f13];
            if (bVar2.f18769s != null) {
                e8.a aVar2 = cVar.f57721e;
                aVar2.getClass();
                qVarArr = aVar2.f57700c;
            } else {
                qVarArr = null;
            }
            q[] qVarArr2 = qVarArr;
            int i15 = bVar.f57701a;
            int i16 = i15 == 2 ? 4 : 0;
            long j13 = cVar.f57723g;
            this.f53947c[i14] = new h8.e(new j9.i(jVar, !z13 ? 35 : 3, null, new p(f13, i15, bVar.f57703c, -9223372036854775807L, j13, j13, bVar2, 0, qVarArr2, i16, null, null), v2.f100502e, null), bVar.f57701a, bVar2);
        }
    }

    @Override // h8.m
    public final void a() {
        for (i iVar : this.f53947c) {
            ((h8.e) iVar).d();
        }
    }

    @Override // h8.m
    public final void b() {
        BehindLiveWindowException behindLiveWindowException = this.f53953i;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.f53945a.b();
    }

    @Override // h8.m
    public final long c(long j13, x1 x1Var) {
        e8.b bVar = this.f53951g.f57722f[this.f53946b];
        int e13 = n0.e(bVar.f57715o, j13, true);
        long[] jArr = bVar.f57715o;
        long j14 = jArr[e13];
        return x1Var.a(j13, j14, (j14 >= j13 || e13 >= bVar.f57711k - 1) ? j14 : jArr[e13 + 1]);
    }

    @Override // h8.m
    public final boolean d(h8.f fVar, boolean z13, k0.a aVar, a10.e eVar) {
        l8.q v13 = eVar.v(d7.b.v(this.f53950f), aVar);
        if (z13 && v13 != null && v13.f82080b == 2) {
            t tVar = this.f53950f;
            if (tVar.h(tVar.d(fVar.f68026d), v13.f82081c)) {
                return true;
            }
        }
        return false;
    }

    @Override // h8.m
    public final void e(h8.f fVar) {
    }

    @Override // h8.m
    public final void f(y0 y0Var, long j13, List list, o oVar) {
        int i13;
        long c13;
        k kVar;
        if (this.f53953i != null) {
            return;
        }
        e8.b[] bVarArr = this.f53951g.f57722f;
        int i14 = this.f53946b;
        e8.b bVar = bVarArr[i14];
        if (bVar.f57711k == 0) {
            oVar.f1154a = !r5.f57720d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f57715o;
        if (isEmpty) {
            i13 = n0.e(jArr, j13, true);
        } else {
            int a13 = (int) (((h8.p) ep.b.i(list, 1)).a() - this.f53952h);
            if (a13 < 0) {
                this.f53953i = new BehindLiveWindowException();
                return;
            }
            i13 = a13;
        }
        int i15 = bVar.f57711k;
        if (i13 >= i15) {
            oVar.f1154a = !this.f53951g.f57720d;
            return;
        }
        long j14 = y0Var.f86486a;
        long j15 = j13 - j14;
        e8.c cVar = this.f53951g;
        if (cVar.f57720d) {
            e8.b bVar2 = cVar.f57722f[i14];
            int i16 = bVar2.f57711k - 1;
            c13 = (bVar2.c(i16) + bVar2.f57715o[i16]) - j14;
        } else {
            c13 = -9223372036854775807L;
        }
        int length = this.f53950f.length();
        h8.q[] qVarArr = new h8.q[length];
        int i17 = 0;
        while (i17 < length) {
            this.f53950f.f(i17);
            qVarArr[i17] = new b(bVar, i13);
            i17++;
            length = length;
        }
        int i18 = i13;
        this.f53950f.u(j14, j15, c13, list, qVarArr);
        long j16 = jArr[i18];
        long c14 = bVar.c(i18) + j16;
        long j17 = list.isEmpty() ? j13 : -9223372036854775807L;
        int i19 = i18 + this.f53952h;
        int a14 = this.f53950f.a();
        i iVar = this.f53947c[a14];
        int f13 = this.f53950f.f(a14);
        Uri a15 = bVar.a(f13, i18);
        k0.a aVar = this.f53949e;
        if (aVar != null) {
            kVar = new k(aVar, "s");
            kVar.f82030c = this.f53950f;
            long max = Math.max(0L, j15);
            bf.b.i(max >= 0);
            kVar.f82031d = max;
            kVar.c(y0Var.f86487b);
            kVar.f82033f = Boolean.valueOf(this.f53951g.f57720d);
            kVar.f82034g = y0Var.a(this.f53954j);
            kVar.f82035h = list.isEmpty();
            kVar.b(c14 - j16);
            int i23 = 1 + i18;
            if (i23 < i15) {
                kVar.f82038k = b7.c.x(a15, bVar.a(f13, i23));
            }
        } else {
            kVar = null;
        }
        this.f53954j = SystemClock.elapsedRealtime();
        androidx.media3.common.b r13 = this.f53950f.r();
        int t13 = this.f53950f.t();
        Object j18 = this.f53950f.j();
        Map emptyMap = Collections.emptyMap();
        bf.b.x(a15, "The uri must be set.");
        g7.i iVar2 = new g7.i(a15, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null);
        if (kVar != null) {
            iVar2 = kVar.a().a(iVar2);
        }
        oVar.f1155b = new n(this.f53948d, iVar2, r13, t13, j18, j16, c14, j17, -9223372036854775807L, i19, 1, j16, iVar);
    }

    @Override // h8.m
    public final boolean g(long j13, h8.f fVar, List list) {
        if (this.f53953i != null) {
            return false;
        }
        return this.f53950f.s(j13, fVar, list);
    }

    @Override // h8.m
    public final int h(long j13, List list) {
        return (this.f53953i != null || this.f53950f.length() < 2) ? list.size() : this.f53950f.p(j13, list);
    }
}
