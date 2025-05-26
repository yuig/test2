package n3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s3.f2;
import s3.q1;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: b, reason: collision with root package name */
    public final u2.p f89057b;

    /* renamed from: e, reason: collision with root package name */
    public q1 f89060e;

    /* renamed from: f, reason: collision with root package name */
    public j f89061f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f89062g;

    /* renamed from: c, reason: collision with root package name */
    public final o3.b f89058c = new o3.b();

    /* renamed from: d, reason: collision with root package name */
    public final g1.p f89059d = new g1.p(2);

    /* renamed from: h, reason: collision with root package name */
    public boolean f89063h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f89064i = true;

    public h(u2.p pVar) {
        this.f89057b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // n3.i
    public final boolean a(g1.p pVar, q3.x xVar, e eVar, boolean z13) {
        g1.p pVar2;
        o3.b bVar;
        Object obj;
        boolean z14;
        boolean z15;
        boolean z16;
        j jVar;
        boolean z17;
        int i13;
        int i14;
        List list;
        boolean a13 = super.a(pVar, xVar, eVar, z13);
        s3.n nVar = this.f89057b;
        if (!nVar.f120054m) {
            return true;
        }
        ?? r83 = 0;
        while (nVar != 0) {
            if (nVar instanceof f2) {
                this.f89060e = kh2.w.J((f2) nVar);
            } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof s3.n)) {
                u2.p pVar3 = nVar.f110843o;
                int i15 = 0;
                nVar = nVar;
                r83 = r83;
                while (pVar3 != null) {
                    if ((pVar3.f120044c & 16) != 0) {
                        i15++;
                        r83 = r83;
                        if (i15 == 1) {
                            nVar = pVar3;
                        } else {
                            if (r83 == 0) {
                                r83 = new k2.e(new u2.p[16]);
                            }
                            if (nVar != 0) {
                                r83.b(nVar);
                                nVar = 0;
                            }
                            r83.b(pVar3);
                        }
                    }
                    pVar3 = pVar3.f120047f;
                    nVar = nVar;
                    r83 = r83;
                }
                if (i15 == 1) {
                }
            }
            nVar = com.bumptech.glide.c.g(r83);
        }
        int m13 = pVar.m();
        int i16 = 0;
        while (true) {
            pVar2 = this.f89059d;
            bVar = this.f89058c;
            if (i16 >= m13) {
                break;
            }
            long i17 = pVar.i(i16);
            q qVar = (q) pVar.n(i16);
            if (bVar.c(i17)) {
                long h10 = qVar.h();
                long e13 = qVar.e();
                if (a3.c.f(h10) && a3.c.f(e13)) {
                    ArrayList arrayList = new ArrayList(qVar.c().size());
                    List c13 = qVar.c();
                    i13 = m13;
                    int size = c13.size();
                    z17 = a13;
                    int i18 = 0;
                    while (i18 < size) {
                        c cVar = (c) c13.get(i18);
                        long j13 = i17;
                        long b13 = cVar.b();
                        if (a3.c.f(b13)) {
                            i14 = size;
                            long c14 = cVar.c();
                            list = c13;
                            q1 q1Var = this.f89060e;
                            Intrinsics.f(q1Var);
                            arrayList.add(new c(c14, q1Var.W(xVar, b13), cVar.a()));
                        } else {
                            i14 = size;
                            list = c13;
                        }
                        i18++;
                        size = i14;
                        c13 = list;
                        i17 = j13;
                    }
                    q1 q1Var2 = this.f89060e;
                    Intrinsics.f(q1Var2);
                    long W = q1Var2.W(xVar, h10);
                    q1 q1Var3 = this.f89060e;
                    Intrinsics.f(q1Var3);
                    pVar2.j(i17, q.b(qVar, q1Var3.W(xVar, e13), W, arrayList));
                    i16++;
                    m13 = i13;
                    a13 = z17;
                }
            }
            z17 = a13;
            i13 = m13;
            i16++;
            m13 = i13;
            a13 = z17;
        }
        boolean z18 = a13;
        if (pVar2.h()) {
            bVar.b();
            this.f89065a.h();
            return true;
        }
        for (int e14 = bVar.e() - 1; -1 < e14; e14--) {
            if (pVar.g(bVar.d(e14)) < 0) {
                bVar.i(e14);
            }
        }
        ArrayList arrayList2 = new ArrayList(pVar2.m());
        int m14 = pVar2.m();
        for (int i19 = 0; i19 < m14; i19++) {
            arrayList2.add(pVar2.n(i19));
        }
        j jVar2 = new j(arrayList2, eVar);
        int size2 = arrayList2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i23);
            if (eVar.a(((q) obj).d())) {
                break;
            }
            i23++;
        }
        q qVar2 = (q) obj;
        if (qVar2 != null) {
            if (z13) {
                z14 = false;
                if (!this.f89063h && (qVar2.f() || qVar2.i())) {
                    Intrinsics.f(this.f89060e);
                    z15 = true;
                    this.f89063h = !c0.d.e2(qVar2, r4.f102180c);
                    if (this.f89063h == this.f89062g && (o.a(jVar2.f89073d, 3) || o.a(jVar2.f89073d, 4) || o.a(jVar2.f89073d, 5))) {
                        jVar2.f89073d = this.f89063h ? 4 : 5;
                    } else if (!o.a(jVar2.f89073d, 4) && this.f89062g && !this.f89064i) {
                        jVar2.f89073d = 3;
                    } else if (o.a(jVar2.f89073d, 5) && this.f89063h && qVar2.f()) {
                        jVar2.f89073d = 3;
                    }
                }
            } else {
                z14 = false;
                this.f89063h = false;
            }
            z15 = true;
            if (this.f89063h == this.f89062g) {
            }
            if (!o.a(jVar2.f89073d, 4)) {
            }
            if (o.a(jVar2.f89073d, 5)) {
                jVar2.f89073d = 3;
            }
        } else {
            z14 = false;
            z15 = true;
        }
        if (!z18 && o.a(jVar2.f89073d, 3) && (jVar = this.f89061f) != null) {
            ?? r13 = jVar.f89070a;
            int size3 = r13.size();
            ?? r63 = jVar2.f89070a;
            if (size3 == r63.size()) {
                int size4 = r63.size();
                for (?? r73 = z14; r73 < size4; r73++) {
                    if (a3.c.b(((q) r13.get(r73)).e(), ((q) r63.get(r73)).e())) {
                    }
                }
                z16 = z14;
                this.f89061f = jVar2;
                return z16;
            }
        }
        z16 = z15;
        this.f89061f = jVar2;
        return z16;
    }

    @Override // n3.i
    public final void b(e eVar) {
        super.b(eVar);
        j jVar = this.f89061f;
        if (jVar == null) {
            return;
        }
        this.f89062g = this.f89063h;
        List list = jVar.f89070a;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            q qVar = (q) list.get(i13);
            boolean z13 = !qVar.f();
            boolean z14 = !eVar.a(qVar.d());
            boolean z15 = !this.f89063h;
            if ((z13 && z14) || (z13 && z15)) {
                this.f89058c.h(qVar.d());
            }
        }
        this.f89063h = false;
        this.f89064i = o.a(jVar.f89073d, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k2.e] */
    public final void d() {
        k2.e eVar = this.f89065a;
        int i13 = eVar.f78184c;
        if (i13 > 0) {
            Object[] objArr = eVar.f78182a;
            int i14 = 0;
            do {
                ((h) objArr[i14]).d();
                i14++;
            } while (i14 < i13);
        }
        s3.n nVar = this.f89057b;
        ?? r43 = 0;
        while (nVar != 0) {
            if (nVar instanceof f2) {
                ((f2) nVar).c0();
            } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof s3.n)) {
                u2.p pVar = nVar.f110843o;
                int i15 = 0;
                nVar = nVar;
                r43 = r43;
                while (pVar != null) {
                    if ((pVar.f120044c & 16) != 0) {
                        i15++;
                        r43 = r43;
                        if (i15 == 1) {
                            nVar = pVar;
                        } else {
                            if (r43 == 0) {
                                r43 = new k2.e(new u2.p[16]);
                            }
                            if (nVar != 0) {
                                r43.b(nVar);
                                nVar = 0;
                            }
                            r43.b(pVar);
                        }
                    }
                    pVar = pVar.f120047f;
                    nVar = nVar;
                    r43 = r43;
                }
                if (i15 == 1) {
                }
            }
            nVar = com.bumptech.glide.c.g(r43);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(e eVar) {
        k2.e eVar2;
        int i13;
        g1.p pVar = this.f89059d;
        boolean z13 = false;
        int i14 = 0;
        z13 = false;
        if (!pVar.h()) {
            u2.p pVar2 = this.f89057b;
            if (pVar2.f120054m) {
                j jVar = this.f89061f;
                Intrinsics.f(jVar);
                q1 q1Var = this.f89060e;
                Intrinsics.f(q1Var);
                long j13 = q1Var.f102180c;
                s3.n nVar = pVar2;
                ?? r83 = 0;
                while (nVar != 0) {
                    if (nVar instanceof f2) {
                        ((f2) nVar).W(jVar, k.Final, j13);
                    } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof s3.n)) {
                        u2.p pVar3 = nVar.f110843o;
                        int i15 = 0;
                        nVar = nVar;
                        r83 = r83;
                        while (pVar3 != null) {
                            if ((pVar3.f120044c & 16) != 0) {
                                i15++;
                                r83 = r83;
                                if (i15 == 1) {
                                    nVar = pVar3;
                                } else {
                                    if (r83 == 0) {
                                        r83 = new k2.e(new u2.p[16]);
                                    }
                                    if (nVar != 0) {
                                        r83.b(nVar);
                                        nVar = 0;
                                    }
                                    r83.b(pVar3);
                                }
                            }
                            pVar3 = pVar3.f120047f;
                            nVar = nVar;
                            r83 = r83;
                        }
                        if (i15 == 1) {
                        }
                    }
                    nVar = com.bumptech.glide.c.g(r83);
                }
                if (pVar2.f120054m && (i13 = (eVar2 = this.f89065a).f78184c) > 0) {
                    Object[] objArr = eVar2.f78182a;
                    do {
                        ((h) objArr[i14]).e(eVar);
                        i14++;
                    } while (i14 < i13);
                }
                z13 = true;
            }
        }
        b(eVar);
        pVar.a();
        this.f89060e = null;
        return z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v3, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean f(e eVar, boolean z13) {
        k2.e eVar2;
        int i13;
        if (this.f89059d.h()) {
            return false;
        }
        s3.n nVar = this.f89057b;
        if (!nVar.f120054m) {
            return false;
        }
        j jVar = this.f89061f;
        Intrinsics.f(jVar);
        q1 q1Var = this.f89060e;
        Intrinsics.f(q1Var);
        long j13 = q1Var.f102180c;
        s3.n nVar2 = nVar;
        ?? r73 = 0;
        while (nVar2 != 0) {
            if (nVar2 instanceof f2) {
                ((f2) nVar2).W(jVar, k.Initial, j13);
            } else if ((nVar2.f120044c & 16) != 0 && (nVar2 instanceof s3.n)) {
                u2.p pVar = nVar2.f110843o;
                int i14 = 0;
                nVar2 = nVar2;
                r73 = r73;
                while (pVar != null) {
                    if ((pVar.f120044c & 16) != 0) {
                        i14++;
                        r73 = r73;
                        if (i14 == 1) {
                            nVar2 = pVar;
                        } else {
                            if (r73 == 0) {
                                r73 = new k2.e(new u2.p[16]);
                            }
                            if (nVar2 != 0) {
                                r73.b(nVar2);
                                nVar2 = 0;
                            }
                            r73.b(pVar);
                        }
                    }
                    pVar = pVar.f120047f;
                    nVar2 = nVar2;
                    r73 = r73;
                }
                if (i14 == 1) {
                }
            }
            nVar2 = com.bumptech.glide.c.g(r73);
        }
        if (nVar.f120054m && (i13 = (eVar2 = this.f89065a).f78184c) > 0) {
            Object[] objArr = eVar2.f78182a;
            int i15 = 0;
            do {
                h hVar = (h) objArr[i15];
                Intrinsics.f(this.f89060e);
                hVar.f(eVar, z13);
                i15++;
            } while (i15 < i13);
        }
        if (nVar.f120054m) {
            ?? r14 = 0;
            while (nVar != 0) {
                if (nVar instanceof f2) {
                    ((f2) nVar).W(jVar, k.Main, j13);
                } else if ((nVar.f120044c & 16) != 0 && (nVar instanceof s3.n)) {
                    u2.p pVar2 = nVar.f110843o;
                    int i16 = 0;
                    nVar = nVar;
                    r14 = r14;
                    while (pVar2 != null) {
                        if ((pVar2.f120044c & 16) != 0) {
                            i16++;
                            r14 = r14;
                            if (i16 == 1) {
                                nVar = pVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new k2.e(new u2.p[16]);
                                }
                                if (nVar != 0) {
                                    r14.b(nVar);
                                    nVar = 0;
                                }
                                r14.b(pVar2);
                            }
                        }
                        pVar2 = pVar2.f120047f;
                        nVar = nVar;
                        r14 = r14;
                    }
                    if (i16 == 1) {
                    }
                }
                nVar = com.bumptech.glide.c.g(r14);
            }
        }
        return true;
    }

    public final void g(long j13, g1.a0 a0Var) {
        o3.b bVar = this.f89058c;
        if (bVar.c(j13) && a0Var.d(this) < 0) {
            bVar.g(j13);
            this.f89059d.k(j13);
        }
        k2.e eVar = this.f89065a;
        int i13 = eVar.f78184c;
        if (i13 > 0) {
            Object[] objArr = eVar.f78182a;
            int i14 = 0;
            do {
                ((h) objArr[i14]).g(j13, a0Var);
                i14++;
            } while (i14 < i13);
        }
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f89057b + ", children=" + this.f89065a + ", pointerIds=" + this.f89058c + ')';
    }
}
