package t7;

import a7.n0;
import a7.o0;
import android.net.Uri;
import androidx.lifecycle.n1;
import androidx.media3.common.ParserException;
import g7.a0;
import g8.b0;
import g8.c0;
import g8.h0;
import g8.m1;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import m7.x0;
import m7.x1;
import n7.q0;
import pk.c1;
import pk.v2;
import pk.y0;

/* loaded from: classes3.dex */
public final class n implements c0, v7.r {

    /* renamed from: a, reason: collision with root package name */
    public final k f116522a;

    /* renamed from: b, reason: collision with root package name */
    public final v7.t f116523b;

    /* renamed from: c, reason: collision with root package name */
    public final c f116524c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f116525d;

    /* renamed from: e, reason: collision with root package name */
    public final k0.a f116526e;

    /* renamed from: f, reason: collision with root package name */
    public final s7.q f116527f;

    /* renamed from: g, reason: collision with root package name */
    public final s7.m f116528g;

    /* renamed from: h, reason: collision with root package name */
    public final a10.e f116529h;

    /* renamed from: i, reason: collision with root package name */
    public final h0 f116530i;

    /* renamed from: j, reason: collision with root package name */
    public final l8.m f116531j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentityHashMap f116532k;

    /* renamed from: l, reason: collision with root package name */
    public final w f116533l;

    /* renamed from: m, reason: collision with root package name */
    public final n1 f116534m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f116535n;

    /* renamed from: o, reason: collision with root package name */
    public final int f116536o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f116537p;

    /* renamed from: q, reason: collision with root package name */
    public final q0 f116538q;

    /* renamed from: r, reason: collision with root package name */
    public final t5.e f116539r = new t5.e(this);

    /* renamed from: s, reason: collision with root package name */
    public final long f116540s;

    /* renamed from: t, reason: collision with root package name */
    public b0 f116541t;

    /* renamed from: u, reason: collision with root package name */
    public int f116542u;

    /* renamed from: v, reason: collision with root package name */
    public m1 f116543v;

    /* renamed from: w, reason: collision with root package name */
    public t[] f116544w;

    /* renamed from: x, reason: collision with root package name */
    public t[] f116545x;

    /* renamed from: y, reason: collision with root package name */
    public int f116546y;

    /* renamed from: z, reason: collision with root package name */
    public g8.l f116547z;

    public n(k kVar, v7.t tVar, c cVar, a0 a0Var, k0.a aVar, s7.q qVar, s7.m mVar, a10.e eVar, h0 h0Var, l8.m mVar2, n1 n1Var, boolean z13, int i13, boolean z14, q0 q0Var, long j13) {
        this.f116522a = kVar;
        this.f116523b = tVar;
        this.f116524c = cVar;
        this.f116525d = a0Var;
        this.f116526e = aVar;
        this.f116527f = qVar;
        this.f116528g = mVar;
        this.f116529h = eVar;
        this.f116530i = h0Var;
        this.f116531j = mVar2;
        this.f116534m = n1Var;
        this.f116535n = z13;
        this.f116536o = i13;
        this.f116537p = z14;
        this.f116538q = q0Var;
        this.f116540s = j13;
        n1Var.getClass();
        y0 y0Var = c1.f100372b;
        v2 v2Var = v2.f100502e;
        this.f116547z = new g8.l(v2Var, v2Var);
        this.f116532k = new IdentityHashMap();
        this.f116533l = new w();
        this.f116544w = new t[0];
        this.f116545x = new t[0];
    }

    public static androidx.media3.common.b i(androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z13) {
        n0 n0Var;
        int i13;
        String str;
        int i14;
        int i15;
        String str2;
        String str3;
        List list;
        y0 y0Var = c1.f100372b;
        List list2 = v2.f100502e;
        if (bVar2 != null) {
            str3 = bVar2.f18761k;
            n0Var = bVar2.f18762l;
            i14 = bVar2.E;
            i13 = bVar2.f18755e;
            i15 = bVar2.f18756f;
            str = bVar2.f18754d;
            str2 = bVar2.f18752b;
            list = bVar2.f18753c;
        } else {
            String x13 = d7.n0.x(1, bVar.f18761k);
            n0Var = bVar.f18762l;
            if (z13) {
                i14 = bVar.E;
                i13 = bVar.f18755e;
                i15 = bVar.f18756f;
                str = bVar.f18754d;
                str2 = bVar.f18752b;
                list2 = bVar.f18753c;
            } else {
                i13 = 0;
                str = null;
                i14 = -1;
                i15 = 0;
                str2 = null;
            }
            List list3 = list2;
            str3 = x13;
            list = list3;
        }
        String f13 = o0.f(str3);
        int i16 = z13 ? bVar.f18758h : -1;
        int i17 = z13 ? bVar.f18759i : -1;
        a7.q qVar = new a7.q();
        qVar.f1168a = bVar.f18751a;
        qVar.f1169b = str2;
        qVar.f1170c = c1.r(list);
        qVar.f1180m = o0.r(bVar.f18764n);
        qVar.f1181n = o0.r(f13);
        qVar.f1177j = str3;
        qVar.f1178k = n0Var;
        qVar.f1175h = i16;
        qVar.f1176i = i17;
        qVar.D = i14;
        qVar.f1172e = i13;
        qVar.f1173f = i15;
        qVar.f1171d = str;
        return new androidx.media3.common.b(qVar);
    }

    @Override // g8.d1
    public final long a() {
        return this.f116547z.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if ((!v7.b.a(r4, r14)) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052 A[SYNTHETIC] */
    @Override // v7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.net.Uri r17, k0.a r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            t7.t[] r2 = r0.f116544w
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L9c
            r8 = r2[r6]
            t7.j r9 = r8.f116580d
            android.net.Uri[] r10 = r9.f116487e
            boolean r10 = d7.n0.l(r10, r1)
            if (r10 != 0) goto L1d
            r13 = r18
            r4 = 1
            r5 = 1
            goto L97
        L1d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3c
            k8.t r12 = r9.f116501s
            l8.p r12 = d7.b.v(r12)
            a10.e r8 = r8.f116585i
            r13 = r18
            l8.q r8 = r8.v(r12, r13)
            if (r8 == 0) goto L3e
            int r12 = r8.f82080b
            r14 = 2
            if (r12 != r14) goto L3e
            long r14 = r8.f82081c
            goto L3f
        L3c:
            r13 = r18
        L3e:
            r14 = r10
        L3f:
            r8 = 0
        L40:
            android.net.Uri[] r12 = r9.f116487e
            int r5 = r12.length
            r4 = -1
            if (r8 >= r5) goto L52
            r5 = r12[r8]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L4f
            goto L53
        L4f:
            int r8 = r8 + 1
            goto L40
        L52:
            r8 = r4
        L53:
            if (r8 != r4) goto L57
        L55:
            r5 = 1
            goto L90
        L57:
            k8.t r5 = r9.f116501s
            int r5 = r5.l(r8)
            if (r5 != r4) goto L60
            goto L55
        L60:
            boolean r4 = r9.f116503u
            android.net.Uri r8 = r9.f116499q
            boolean r8 = r1.equals(r8)
            r4 = r4 | r8
            r9.f116503u = r4
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 == 0) goto L55
            k8.t r4 = r9.f116501s
            boolean r4 = r4.h(r5, r14)
            if (r4 == 0) goto L8e
            v7.t r4 = r9.f116489g
            v7.c r4 = (v7.c) r4
            java.util.HashMap r4 = r4.f124248d
            java.lang.Object r4 = r4.get(r1)
            v7.b r4 = (v7.b) r4
            if (r4 == 0) goto L8e
            boolean r4 = v7.b.a(r4, r14)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L96
            goto L90
        L8e:
            r5 = 1
            goto L96
        L90:
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 == 0) goto L96
            r4 = r5
            goto L97
        L96:
            r4 = 0
        L97:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L9c:
            g8.b0 r1 = r0.f116541t
            r1.i(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.b(android.net.Uri, k0.a, boolean):boolean");
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        t[] tVarArr = this.f116545x;
        int length = tVarArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            t tVar = tVarArr[i13];
            if (tVar.A == 2) {
                j jVar = tVar.f116580d;
                int a13 = jVar.f116501s.a();
                Uri[] uriArr = jVar.f116487e;
                int length2 = uriArr.length;
                v7.t tVar2 = jVar.f116489g;
                v7.k a14 = (a13 >= length2 || a13 == -1) ? null : ((v7.c) tVar2).a(true, uriArr[jVar.f116501s.q()]);
                if (a14 != null) {
                    c1 c1Var = a14.f124315r;
                    if (!c1Var.isEmpty()) {
                        long j14 = a14.f124305h - ((v7.c) tVar2).f124259o;
                        long j15 = j13 - j14;
                        int c13 = d7.n0.c(c1Var, Long.valueOf(j15), true);
                        long j16 = ((v7.h) c1Var.get(c13)).f124289e;
                        return x1Var.a(j15, j16, (!a14.f124343c || c13 == c1Var.size() - 1) ? j16 : ((v7.h) c1Var.get(c13 + 1)).f124289e) + j14;
                    }
                }
            } else {
                i13++;
            }
        }
        return j13;
    }

    @Override // v7.r
    public final void d() {
        for (t tVar : this.f116544w) {
            ArrayList arrayList = tVar.f116590n;
            if (!arrayList.isEmpty()) {
                l lVar = (l) com.bumptech.glide.c.P(arrayList);
                int b13 = tVar.f116580d.b(lVar);
                if (b13 == 1) {
                    lVar.L = true;
                } else if (b13 == 0) {
                    tVar.f116594r.post(new w2.c(20, tVar, lVar));
                } else if (b13 == 2 && !tVar.T) {
                    l8.w wVar = tVar.f116586j;
                    if (wVar.d()) {
                        wVar.a();
                    }
                }
            }
        }
        this.f116541t.i(this);
    }

    public final t e(String str, int i13, Uri[] uriArr, androidx.media3.common.b[] bVarArr, androidx.media3.common.b bVar, List list, Map map, long j13) {
        return new t(str, i13, this.f116539r, new j(this.f116522a, this.f116523b, uriArr, bVarArr, this.f116524c, this.f116525d, this.f116533l, this.f116540s, list, this.f116538q, this.f116526e), map, this.f116531j, j13, bVar, this.f116527f, this.f116528g, this.f116529h, this.f116530i, this.f116536o);
    }

    @Override // g8.c0
    public final long f(long j13) {
        t[] tVarArr = this.f116545x;
        if (tVarArr.length > 0) {
            boolean I = tVarArr[0].I(j13, false);
            int i13 = 1;
            while (true) {
                t[] tVarArr2 = this.f116545x;
                if (i13 >= tVarArr2.length) {
                    break;
                }
                tVarArr2[i13].I(j13, I);
                i13++;
            }
            if (I) {
                this.f116533l.f116612a.clear();
            }
        }
        return j13;
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f116547z.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.HashMap] */
    @Override // g8.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(g8.b0 r27, long r28) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.h(g8.b0, long):void");
    }

    @Override // g8.c0
    public final long k() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0291  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // g8.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(k8.t[] r37, boolean[] r38, g8.b1[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.l(k8.t[], boolean[], g8.b1[], boolean[], long):long");
    }

    @Override // g8.c0
    public final void n() {
        for (t tVar : this.f116544w) {
            tVar.F();
            if (tVar.T && !tVar.D) {
                throw ParserException.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        if (this.f116543v != null) {
            return this.f116547z.q(y0Var);
        }
        for (t tVar : this.f116544w) {
            if (!tVar.D) {
                x0 x0Var = new x0();
                x0Var.f86477a = tVar.P;
                tVar.q(new m7.y0(x0Var));
            }
        }
        return false;
    }

    @Override // g8.c0
    public final m1 r() {
        m1 m1Var = this.f116543v;
        m1Var.getClass();
        return m1Var;
    }

    @Override // g8.d1
    public final long t() {
        return this.f116547z.t();
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        for (t tVar : this.f116545x) {
            if (tVar.C && !tVar.C()) {
                int length = tVar.f116598v.length;
                for (int i13 = 0; i13 < length; i13++) {
                    tVar.f116598v[i13].i(j13, z13, tVar.N[i13]);
                }
            }
        }
    }

    @Override // g8.d1
    public final void v(long j13) {
        this.f116547z.v(j13);
    }
}
