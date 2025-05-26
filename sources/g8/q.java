package g8;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f64384a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.e f64385b;

    /* renamed from: c, reason: collision with root package name */
    public l9.j f64386c;

    /* renamed from: d, reason: collision with root package name */
    public a10.e f64387d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64388e;

    /* renamed from: f, reason: collision with root package name */
    public final long f64389f;

    /* renamed from: g, reason: collision with root package name */
    public final long f64390g;

    /* renamed from: h, reason: collision with root package name */
    public final float f64391h;

    /* renamed from: i, reason: collision with root package name */
    public final float f64392i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f64393j;

    public q(g7.w wVar) {
        this(wVar, new q8.q());
    }

    public static d0 h(Class cls, g7.e eVar) {
        try {
            return (d0) cls.getConstructor(g7.e.class).newInstance(eVar);
        } catch (Exception e13) {
            throw new IllegalStateException(e13);
        }
    }

    @Override // g8.d0
    public final void a(l9.j jVar) {
        jVar.getClass();
        this.f64386c = jVar;
        o oVar = this.f64384a;
        oVar.f64362f = jVar;
        oVar.f64357a.a(jVar);
        Iterator it = oVar.f64359c.values().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a(jVar);
        }
    }

    @Override // g8.d0
    public final void b(int i13) {
        o oVar = this.f64384a;
        oVar.f64363g = i13;
        oVar.f64357a.b(i13);
    }

    @Override // g8.d0
    public final a d(a7.i0 i0Var) {
        s7.q a13;
        s7.q qVar;
        a7.i0 i0Var2 = i0Var;
        i0Var2.f1073b.getClass();
        String scheme = i0Var2.f1073b.f969a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(i0Var2.f1073b.f970b, "application/x-image-uri")) {
            long j13 = i0Var2.f1073b.f976h;
            int i13 = d7.n0.f53866a;
            throw null;
        }
        a7.d0 d0Var = i0Var2.f1073b;
        int O = d7.n0.O(d0Var.f969a, d0Var.f970b);
        if (i0Var2.f1073b.f976h != -9223372036854775807L) {
            q8.v vVar = this.f64384a.f64357a;
            if (vVar instanceof q8.q) {
                q8.q qVar2 = (q8.q) vVar;
                synchronized (qVar2) {
                    qVar2.f102992e = 1;
                }
            }
        }
        try {
            d0 a14 = this.f64384a.a(O);
            a7.b0 a15 = i0Var2.f1074c.a();
            a7.c0 c0Var = i0Var2.f1074c;
            if (c0Var.f959a == -9223372036854775807L) {
                a15.f953a = this.f64388e;
            }
            if (c0Var.f962d == -3.4028235E38f) {
                a15.f956d = this.f64391h;
            }
            if (c0Var.f963e == -3.4028235E38f) {
                a15.f957e = this.f64392i;
            }
            if (c0Var.f960b == -9223372036854775807L) {
                a15.f954b = this.f64389f;
            }
            if (c0Var.f961c == -9223372036854775807L) {
                a15.f955c = this.f64390g;
            }
            a7.c0 c0Var2 = new a7.c0(a15);
            if (!c0Var2.equals(i0Var2.f1074c)) {
                a7.v a16 = i0Var.a();
                a16.f1228l = c0Var2.a();
                i0Var2 = a16.a();
            }
            a d2 = a14.d(i0Var2);
            pk.c1 c1Var = i0Var2.f1073b.f974f;
            if (!c1Var.isEmpty()) {
                a[] aVarArr = new a[c1Var.size() + 1];
                aVarArr[0] = d2;
                for (int i14 = 0; i14 < c1Var.size(); i14++) {
                    if (this.f64393j) {
                        a7.q qVar3 = new a7.q();
                        qVar3.f1181n = a7.o0.r(((a7.h0) c1Var.get(i14)).f1055b);
                        qVar3.f1171d = ((a7.h0) c1Var.get(i14)).f1056c;
                        qVar3.f1172e = ((a7.h0) c1Var.get(i14)).f1057d;
                        qVar3.f1173f = ((a7.h0) c1Var.get(i14)).f1058e;
                        qVar3.f1169b = ((a7.h0) c1Var.get(i14)).f1059f;
                        qVar3.f1168a = ((a7.h0) c1Var.get(i14)).f1060g;
                        final androidx.media3.common.b bVar = new androidx.media3.common.b(qVar3);
                        q8.v vVar2 = new q8.v() { // from class: g8.m
                            @Override // q8.v
                            public final q8.s[] f() {
                                q8.s[] sVarArr = new q8.s[1];
                                q qVar4 = q.this;
                                l9.j jVar = qVar4.f64386c;
                                androidx.media3.common.b bVar2 = bVar;
                                sVarArr[0] = jVar.r(bVar2) ? new l9.g(qVar4.f64386c.p(bVar2), null) : new p(bVar2);
                                return sVarArr;
                            }
                        };
                        g7.e eVar = this.f64385b;
                        a8.v vVar3 = new a8.v(vVar2, 1);
                        Object obj = new Object();
                        a10.e eVar2 = new a10.e();
                        if (this.f64386c.r(bVar)) {
                            a7.q a17 = bVar.a();
                            a17.f1181n = a7.o0.r("application/x-media3-cues");
                            a17.f1177j = bVar.f18765o;
                            a17.f1167J = this.f64386c.h(bVar);
                            bVar = new androidx.media3.common.b(a17);
                        }
                        androidx.media3.common.b bVar2 = bVar;
                        a10.e eVar3 = this.f64387d;
                        a10.e eVar4 = eVar3 != null ? eVar3 : eVar2;
                        int i15 = i14 + 1;
                        a7.i0 b13 = a7.i0.b(((a7.h0) c1Var.get(i14)).f1054a.toString());
                        b13.f1073b.getClass();
                        b13.f1073b.getClass();
                        a7.a0 a0Var = b13.f1073b.f971c;
                        if (a0Var == null) {
                            qVar = s7.q.f111330a;
                        } else {
                            synchronized (obj) {
                                try {
                                    a13 = !a0Var.equals(null) ? s7.i.a(a0Var) : null;
                                    a13.getClass();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            qVar = a13;
                        }
                        aVarArr[i15] = new v0(b13, eVar, vVar3, qVar, eVar4, 1048576, 0, bVar2);
                    } else {
                        g7.e eVar5 = this.f64385b;
                        eVar5.getClass();
                        a10.e eVar6 = new a10.e();
                        a10.e eVar7 = this.f64387d;
                        aVarArr[i14 + 1] = new j1((a7.h0) c1Var.get(i14), eVar5, eVar7 != null ? eVar7 : eVar6, true, null);
                    }
                }
                d2 = new m0(aVarArr);
            }
            a7.y yVar = i0Var2.f1076e;
            if (yVar.f1235a != 0 || yVar.f1236b != Long.MIN_VALUE || yVar.f1238d) {
                d dVar = new d(d2);
                a7.y yVar2 = i0Var2.f1076e;
                long j14 = yVar2.f1235a;
                bf.b.i(j14 >= 0);
                bf.b.t(!dVar.f64228g);
                dVar.f64223b = j14;
                long j15 = yVar2.f1236b;
                bf.b.t(!dVar.f64228g);
                dVar.f64224c = j15;
                boolean z13 = !yVar2.f1239e;
                bf.b.t(!dVar.f64228g);
                dVar.f64225d = z13;
                boolean z14 = yVar2.f1237c;
                bf.b.t(!dVar.f64228g);
                dVar.f64226e = z14;
                boolean z15 = yVar2.f1238d;
                bf.b.t(!dVar.f64228g);
                dVar.f64227f = z15;
                dVar.f64228g = true;
                d2 = new f(dVar);
            }
            i0Var2.f1073b.getClass();
            i0Var2.f1073b.getClass();
            return d2;
        } catch (ClassNotFoundException e13) {
            throw new IllegalStateException(e13);
        }
    }

    @Override // g8.d0
    public final d0 e(s7.i iVar) {
        bf.b.o(iVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        o oVar = this.f64384a;
        oVar.f64365i = iVar;
        Iterator it = oVar.f64359c.values().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e(iVar);
        }
        return this;
    }

    @Override // g8.d0
    public final void f(boolean z13) {
        this.f64393j = z13;
        o oVar = this.f64384a;
        oVar.f64361e = z13;
        oVar.f64357a.d(z13);
        Iterator it = oVar.f64359c.values().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).f(z13);
        }
    }

    @Override // g8.d0
    public final d0 g(a10.e eVar) {
        bf.b.o(eVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f64387d = eVar;
        o oVar = this.f64384a;
        oVar.f64366j = eVar;
        Iterator it = oVar.f64359c.values().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).g(eVar);
        }
        return this;
    }

    @Override // g8.d0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void c(l8.f fVar) {
        fVar.getClass();
        o oVar = this.f64384a;
        oVar.f64364h = fVar;
        Iterator it = oVar.f64359c.values().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).c(fVar);
        }
    }

    public q(g7.e eVar, q8.q qVar) {
        this.f64385b = eVar;
        bk.f fVar = new bk.f();
        this.f64386c = fVar;
        o oVar = new o(qVar, fVar);
        this.f64384a = oVar;
        if (eVar != oVar.f64360d) {
            oVar.f64360d = eVar;
            oVar.f64358b.clear();
            oVar.f64359c.clear();
        }
        this.f64388e = -9223372036854775807L;
        this.f64389f = -9223372036854775807L;
        this.f64390g = -9223372036854775807L;
        this.f64391h = -3.4028235E38f;
        this.f64392i = -3.4028235E38f;
        this.f64393j = true;
    }
}
