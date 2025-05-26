package p7;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import d7.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l8.x;
import n7.q0;
import pk.c1;

/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final x f99018a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.q f99019b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f99020c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99021d;

    /* renamed from: e, reason: collision with root package name */
    public final g7.f f99022e;

    /* renamed from: f, reason: collision with root package name */
    public final long f99023f;

    /* renamed from: g, reason: collision with root package name */
    public final int f99024g;

    /* renamed from: h, reason: collision with root package name */
    public final t f99025h;

    /* renamed from: i, reason: collision with root package name */
    public final k0.a f99026i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f99027j;

    /* renamed from: k, reason: collision with root package name */
    public final n f99028k;

    /* renamed from: l, reason: collision with root package name */
    public final o[] f99029l;

    /* renamed from: m, reason: collision with root package name */
    public k8.t f99030m;

    /* renamed from: n, reason: collision with root package name */
    public q7.c f99031n;

    /* renamed from: o, reason: collision with root package name */
    public int f99032o;

    /* renamed from: p, reason: collision with root package name */
    public BehindLiveWindowException f99033p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f99034q;

    /* renamed from: r, reason: collision with root package name */
    public long f99035r;

    public q(h8.g gVar, x xVar, q7.c cVar, com.google.firebase.messaging.q qVar, int i13, int[] iArr, k8.t tVar, int i14, g7.f fVar, long j13, int i15, boolean z13, ArrayList arrayList, t tVar2, q0 q0Var, k0.a aVar, boolean z14, n nVar) {
        this.f99018a = xVar;
        this.f99031n = cVar;
        this.f99019b = qVar;
        this.f99020c = iArr;
        this.f99030m = tVar;
        this.f99021d = i14;
        if (nVar != n.NEVER) {
            this.f99022e = new i8.e(fVar);
        } else {
            this.f99022e = fVar;
        }
        this.f99032o = i13;
        this.f99023f = j13;
        this.f99024g = i15;
        this.f99025h = tVar2;
        this.f99026i = aVar;
        this.f99035r = -9223372036854775807L;
        this.f99027j = z14;
        this.f99028k = nVar;
        long d2 = cVar.d(i13);
        ArrayList j14 = j();
        this.f99029l = new o[tVar.length()];
        int i16 = 0;
        while (i16 < this.f99029l.length) {
            q7.m mVar = (q7.m) j14.get(tVar.f(i16));
            q7.b z15 = qVar.z(mVar.f102658b);
            int i17 = i16;
            this.f99029l[i17] = new o(d2, mVar, z15 == null ? (q7.b) mVar.f102658b.get(0) : z15, ((o5.a) gVar).a(i14, mVar.f102657a, z13, arrayList, tVar2), 0L, mVar.l());
            i16 = i17 + 1;
        }
    }

    public static Pair i(long j13, q7.j jVar, o oVar) {
        long j14 = j13 + 1;
        if (j14 >= oVar.e()) {
            return null;
        }
        k kVar = oVar.f99014d;
        bf.b.w(kVar);
        q7.j e13 = kVar.e(j14 - oVar.f99016f);
        q7.b bVar = oVar.f99013c;
        String x13 = b7.c.x(b7.c.O(bVar.f102600a, jVar.f102651c), b7.c.O(bVar.f102600a, e13.f102651c));
        StringBuilder sb3 = new StringBuilder();
        long j15 = e13.f102649a;
        String o13 = a.a.o(sb3, j15, "-");
        long j16 = e13.f102650b;
        if (j16 != -1) {
            StringBuilder i13 = n60.o.i(o13);
            i13.append(j15 + j16);
            o13 = i13.toString();
        }
        return new Pair(x13, o13);
    }

    @Override // h8.m
    public final void a() {
        for (o oVar : this.f99029l) {
            h8.i iVar = oVar.f99011a;
            if (iVar != null) {
                ((h8.e) iVar).d();
            }
        }
    }

    @Override // h8.m
    public final void b() {
        BehindLiveWindowException behindLiveWindowException = this.f99033p;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.f99018a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r3 < (((r0.i() + r10) + r8) - 1)) goto L15;
     */
    @Override // h8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r19, m7.x1 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            p7.o[] r0 = r7.f99029l
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5f
            r5 = r0[r4]
            p7.k r6 = r5.f99014d
            if (r6 == 0) goto L5c
            long r8 = r5.e()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L5c
        L1b:
            p7.k r0 = r5.f99014d
            bf.b.w(r0)
            long r3 = r5.f99015e
            long r3 = r0.f(r1, r3)
            long r10 = r5.f99016f
            long r3 = r3 + r10
            long r12 = r5.g(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L51
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4a
            bf.b.w(r0)
            long r16 = r0.i()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L51
        L4a:
            long r3 = r3 + r14
            long r3 = r5.g(r3)
            r5 = r3
            goto L52
        L51:
            r5 = r12
        L52:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5c:
            int r4 = r4 + 1
            goto L8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.q.c(long, m7.x1):long");
    }

    @Override // h8.m
    public final boolean d(h8.f fVar, boolean z13, k0.a aVar, a10.e eVar) {
        l8.q v13;
        long j13;
        if (!z13) {
            return false;
        }
        t tVar = this.f99025h;
        if (tVar != null) {
            long j14 = tVar.f99049d;
            boolean z14 = j14 != -9223372036854775807L && j14 < fVar.f68029g;
            u uVar = tVar.f99050e;
            if (uVar.f99056f.f102607d) {
                if (!uVar.f99058h) {
                    if (z14) {
                        if (uVar.f99057g) {
                            uVar.f99058h = true;
                            uVar.f99057g = false;
                            j jVar = uVar.f99052b.f98980a;
                            jVar.E.removeCallbacks(jVar.f99001x);
                            jVar.E();
                        }
                    }
                }
                return true;
            }
        }
        boolean z15 = this.f99031n.f102607d;
        o[] oVarArr = this.f99029l;
        if (!z15 && (fVar instanceof h8.p)) {
            IOException iOException = (IOException) aVar.f77780d;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f18780d == 404) {
                o oVar = oVarArr[this.f99030m.d(fVar.f68026d)];
                long e13 = oVar.e();
                if (e13 != -1 && e13 != 0) {
                    k kVar = oVar.f99014d;
                    bf.b.w(kVar);
                    if (((h8.p) fVar).a() > ((kVar.i() + oVar.f99016f) + e13) - 1) {
                        this.f99034q = true;
                        return true;
                    }
                }
            }
        }
        o oVar2 = oVarArr[this.f99030m.d(fVar.f68026d)];
        c1 c1Var = oVar2.f99012b.f102658b;
        com.google.firebase.messaging.q qVar = this.f99019b;
        q7.b z16 = qVar.z(c1Var);
        q7.b bVar = oVar2.f99013c;
        if (z16 != null && !bVar.equals(z16)) {
            return true;
        }
        k8.t tVar2 = this.f99030m;
        c1 c1Var2 = oVar2.f99012b.f102658b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar2.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (tVar2.c(i14, elapsedRealtime)) {
                i13++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i15 = 0; i15 < c1Var2.size(); i15++) {
            hashSet.add(Integer.valueOf(((q7.b) c1Var2.get(i15)).f102602c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList b13 = qVar.b(c1Var2);
        for (int i16 = 0; i16 < b13.size(); i16++) {
            hashSet2.add(Integer.valueOf(((q7.b) b13.get(i16)).f102602c));
        }
        l8.p pVar = new l8.p(size, size - hashSet2.size(), length, i13);
        if ((!pVar.a(2) && !pVar.a(1)) || (v13 = eVar.v(pVar, aVar)) == null || !pVar.a(v13.f82080b)) {
            return false;
        }
        int i17 = v13.f82080b;
        if (i17 == 2) {
            k8.t tVar3 = this.f99030m;
            return tVar3.h(tVar3.d(fVar.f68026d), v13.f82081c);
        }
        if (i17 != 1) {
            return false;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() + v13.f82081c;
        String str = bVar.f102601b;
        Map map = (Map) qVar.f33803a;
        if (map.containsKey(str)) {
            Long l13 = (Long) map.get(str);
            int i18 = n0.f53866a;
            j13 = Math.max(elapsedRealtime2, l13.longValue());
        } else {
            j13 = elapsedRealtime2;
        }
        map.put(str, Long.valueOf(j13));
        int i19 = bVar.f102602c;
        if (i19 != Integer.MIN_VALUE) {
            Integer valueOf = Integer.valueOf(i19);
            Map map2 = (Map) qVar.f33804b;
            if (map2.containsKey(valueOf)) {
                Long l14 = (Long) map2.get(valueOf);
                int i23 = n0.f53866a;
                elapsedRealtime2 = Math.max(elapsedRealtime2, l14.longValue());
            }
            map2.put(valueOf, Long.valueOf(elapsedRealtime2));
        }
        return true;
    }

    @Override // h8.m
    public final void e(h8.f fVar) {
        if (fVar.f68025c == 2) {
            int d2 = this.f99030m.d(fVar.f68026d);
            o[] oVarArr = this.f99029l;
            o oVar = oVarArr[d2];
            if (oVar.f99014d == null) {
                h8.i iVar = oVar.f99011a;
                bf.b.w(iVar);
                q8.m a13 = ((h8.e) iVar).a();
                if (a13 != null) {
                    q7.m mVar = oVar.f99012b;
                    l lVar = new l(a13, mVar.f102659c);
                    oVarArr[d2] = new o(oVar.f99015e, mVar, oVar.f99013c, oVar.f99011a, oVar.f99016f, lVar);
                }
            }
        }
        t tVar = this.f99025h;
        if (tVar != null) {
            tVar.f(fVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e A[EDGE_INSN: B:50:0x013e->B:51:0x013e BREAK  A[LOOP:0: B:33:0x00e0->B:39:0x0137], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0263  */
    @Override // h8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(m7.y0 r61, long r62, java.util.List r64, a7.o r65) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.q.f(m7.y0, long, java.util.List, a7.o):void");
    }

    @Override // h8.m
    public final boolean g(long j13, h8.f fVar, List list) {
        if (this.f99033p != null) {
            return false;
        }
        return this.f99030m.s(j13, fVar, list);
    }

    @Override // h8.m
    public final int h(long j13, List list) {
        return (this.f99033p != null || this.f99030m.length() < 2) ? list.size() : this.f99030m.p(j13, list);
    }

    public final ArrayList j() {
        List list = this.f99031n.b(this.f99032o).f102641c;
        ArrayList arrayList = new ArrayList();
        for (int i13 : this.f99020c) {
            arrayList.addAll(((q7.a) list.get(i13)).f102596c);
        }
        return arrayList;
    }

    public final o k(int i13) {
        o[] oVarArr = this.f99029l;
        o oVar = oVarArr[i13];
        q7.b z13 = this.f99019b.z(oVar.f99012b.f102658b);
        if (z13 == null || z13.equals(oVar.f99013c)) {
            return oVar;
        }
        o b13 = oVar.b(z13);
        oVarArr[i13] = b13;
        return b13;
    }

    public final void l(k8.t tVar) {
        this.f99030m = tVar;
    }
}
