package d8;

import a.y3;
import a7.o0;
import androidx.lifecycle.n1;
import g7.a0;
import g8.b0;
import g8.b1;
import g8.c0;
import g8.c1;
import g8.d1;
import g8.h0;
import g8.m1;
import h8.l;
import java.util.AbstractList;
import java.util.ArrayList;
import k8.t;
import l8.x;
import m7.x1;
import pk.v2;
import pk.y0;
import s7.m;
import s7.q;

/* loaded from: classes3.dex */
public final class e implements c0, c1 {

    /* renamed from: a, reason: collision with root package name */
    public final d f53955a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f53956b;

    /* renamed from: c, reason: collision with root package name */
    public final x f53957c;

    /* renamed from: d, reason: collision with root package name */
    public final q f53958d;

    /* renamed from: e, reason: collision with root package name */
    public final k0.a f53959e;

    /* renamed from: f, reason: collision with root package name */
    public final m f53960f;

    /* renamed from: g, reason: collision with root package name */
    public final a10.e f53961g;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f53962h;

    /* renamed from: i, reason: collision with root package name */
    public final l8.m f53963i;

    /* renamed from: j, reason: collision with root package name */
    public final m1 f53964j;

    /* renamed from: k, reason: collision with root package name */
    public final n1 f53965k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f53966l;

    /* renamed from: m, reason: collision with root package name */
    public e8.c f53967m;

    /* renamed from: n, reason: collision with root package name */
    public l[] f53968n;

    /* renamed from: o, reason: collision with root package name */
    public g8.l f53969o;

    public e(e8.c cVar, d dVar, a0 a0Var, n1 n1Var, k0.a aVar, q qVar, m mVar, a10.e eVar, h0 h0Var, x xVar, l8.m mVar2) {
        this.f53967m = cVar;
        this.f53955a = dVar;
        this.f53956b = a0Var;
        this.f53957c = xVar;
        this.f53959e = aVar;
        this.f53958d = qVar;
        this.f53960f = mVar;
        this.f53961g = eVar;
        this.f53962h = h0Var;
        this.f53963i = mVar2;
        this.f53965k = n1Var;
        a7.c1[] c1VarArr = new a7.c1[cVar.f57722f.length];
        int i13 = 0;
        while (true) {
            e8.b[] bVarArr = cVar.f57722f;
            if (i13 >= bVarArr.length) {
                this.f53964j = new m1(c1VarArr);
                this.f53968n = new l[0];
                n1Var.getClass();
                y0 y0Var = pk.c1.f100372b;
                v2 v2Var = v2.f100502e;
                this.f53969o = new g8.l(v2Var, v2Var);
                return;
            }
            androidx.media3.common.b[] bVarArr2 = bVarArr[i13].f57710j;
            androidx.media3.common.b[] bVarArr3 = new androidx.media3.common.b[bVarArr2.length];
            for (int i14 = 0; i14 < bVarArr2.length; i14++) {
                androidx.media3.common.b bVar = bVarArr2[i14];
                a7.q a13 = bVar.a();
                a13.M = qVar.d(bVar);
                androidx.media3.common.b bVar2 = new androidx.media3.common.b(a13);
                a aVar2 = (a) dVar;
                if (aVar2.f53943c && aVar2.f53942b.r(bVar2)) {
                    a7.q a14 = bVar2.a();
                    a14.f1181n = o0.r("application/x-media3-cues");
                    a14.f1167J = aVar2.f53942b.h(bVar2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(bVar2.f18765o);
                    String str = bVar2.f18761k;
                    sb3.append(str != null ? " ".concat(str) : "");
                    a14.f1177j = sb3.toString();
                    a14.f1186s = Long.MAX_VALUE;
                    bVar2 = new androidx.media3.common.b(a14);
                }
                bVarArr3[i14] = bVar2;
            }
            c1VarArr[i13] = new a7.c1(Integer.toString(i13), bVarArr3);
            i13++;
        }
    }

    @Override // g8.d1
    public final long a() {
        return this.f53969o.a();
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        for (l lVar : this.f53968n) {
            if (lVar.f68037a == 2) {
                return lVar.f68041e.c(j13, x1Var);
            }
        }
        return j13;
    }

    @Override // g8.c0
    public final long f(long j13) {
        for (l lVar : this.f53968n) {
            lVar.E(j13);
        }
        return j13;
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f53969o.g();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f53966l = b0Var;
        b0Var.e(this);
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        b0 b0Var = this.f53966l;
        b0Var.getClass();
        b0Var.i(this);
    }

    @Override // g8.c0
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // g8.c0
    public final long l(t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j13) {
        int i13;
        ArrayList arrayList;
        t tVar;
        t[] tVarArr2 = tVarArr;
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (i14 < tVarArr2.length) {
            b1 b1Var = b1VarArr[i14];
            if (b1Var != null) {
                l lVar = (l) b1Var;
                t tVar2 = tVarArr2[i14];
                if (tVar2 == null || !zArr[i14]) {
                    lVar.D(null);
                    b1VarArr[i14] = null;
                } else {
                    ((c) lVar.f68041e).f53950f = tVar2;
                    arrayList2.add(lVar);
                }
            }
            if (b1VarArr[i14] != null || (tVar = tVarArr2[i14]) == null) {
                i13 = i14;
                arrayList = arrayList2;
            } else {
                int b13 = this.f53964j.b(tVar.m());
                e8.c cVar = this.f53967m;
                a aVar = (a) this.f53955a;
                g7.f a13 = aVar.f53941a.a();
                a0 a0Var = this.f53956b;
                if (a0Var != null) {
                    a13.f(a0Var);
                }
                i13 = i14;
                arrayList = arrayList2;
                l lVar2 = new l(this.f53967m.f57722f[b13].f57701a, null, null, new c(this.f53957c, cVar, b13, tVar, a13, this.f53959e, aVar.f53942b, aVar.f53943c), this, this.f53963i, j13, this.f53958d, this.f53960f, this.f53961g, this.f53962h, false);
                arrayList.add(lVar2);
                b1VarArr[i13] = lVar2;
                zArr2[i13] = true;
            }
            i14 = i13 + 1;
            arrayList2 = arrayList;
            tVarArr2 = tVarArr;
        }
        ArrayList arrayList3 = arrayList2;
        l[] lVarArr = new l[arrayList3.size()];
        this.f53968n = lVarArr;
        arrayList3.toArray(lVarArr);
        AbstractList y03 = com.bumptech.glide.d.y0(new y3(12), arrayList3);
        this.f53965k.getClass();
        this.f53969o = new g8.l(arrayList3, y03);
        return j13;
    }

    @Override // g8.c0
    public final void n() {
        this.f53957c.b();
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        return this.f53969o.q(y0Var);
    }

    @Override // g8.c0
    public final m1 r() {
        return this.f53964j;
    }

    @Override // g8.d1
    public final long t() {
        return this.f53969o.t();
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        for (l lVar : this.f53968n) {
            lVar.u(j13, z13);
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
        this.f53969o.v(j13);
    }
}
