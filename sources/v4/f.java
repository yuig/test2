package v4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d7.g0;
import d7.h0;
import d7.i0;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f123981a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123982b;

    /* renamed from: c, reason: collision with root package name */
    public Object f123983c;

    /* renamed from: d, reason: collision with root package name */
    public Object f123984d;

    /* renamed from: e, reason: collision with root package name */
    public Object f123985e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractCollection f123986f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractCollection f123987g;

    /* renamed from: h, reason: collision with root package name */
    public Object f123988h;

    /* renamed from: i, reason: collision with root package name */
    public Object f123989i;

    public f(Looper looper, d7.e eVar, d7.s sVar) {
        this(new CopyOnWriteArraySet(), looper, eVar, sVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f123989i) {
            try {
                if (this.f123981a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f123986f).add(new d7.t(obj));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b(h hVar, int i13, int i14, ArrayList arrayList, o oVar) {
        u uVar = hVar.f123993d;
        if (uVar.f124020c == null) {
            u4.i iVar = (u4.i) this.f123983c;
            if (uVar == iVar.f120202d || uVar == iVar.f120204e) {
                return;
            }
            if (oVar == null) {
                oVar = new o(uVar);
                arrayList.add(oVar);
            }
            uVar.f124020c = oVar;
            oVar.a(uVar);
            h hVar2 = uVar.f124025h;
            Iterator it = hVar2.f124000k.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar instanceof h) {
                    b((h) eVar, i13, 0, arrayList, oVar);
                }
            }
            h hVar3 = uVar.f124026i;
            Iterator it2 = hVar3.f124000k.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 instanceof h) {
                    b((h) eVar2, i13, 1, arrayList, oVar);
                }
            }
            if (i13 == 1 && (uVar instanceof q)) {
                Iterator it3 = ((q) uVar).f124009k.f124000k.iterator();
                while (it3.hasNext()) {
                    e eVar3 = (e) it3.next();
                    if (eVar3 instanceof h) {
                        b((h) eVar3, i13, 2, arrayList, oVar);
                    }
                }
            }
            Iterator it4 = hVar2.f124001l.iterator();
            while (it4.hasNext()) {
                b((h) it4.next(), i13, 0, arrayList, oVar);
            }
            Iterator it5 = hVar3.f124001l.iterator();
            while (it5.hasNext()) {
                b((h) it5.next(), i13, 1, arrayList, oVar);
            }
            if (i13 == 1 && (uVar instanceof q)) {
                Iterator it6 = ((q) uVar).f124009k.f124001l.iterator();
                while (it6.hasNext()) {
                    b((h) it6.next(), i13, 2, arrayList, oVar);
                }
            }
        }
    }

    public final void c(u4.i iVar) {
        int i13;
        u4.g gVar;
        u4.g gVar2;
        u4.g gVar3;
        Iterator it = iVar.f120284v0.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            u4.g[] gVarArr = hVar.U;
            u4.g gVar4 = gVarArr[0];
            u4.g gVar5 = gVarArr[1];
            if (hVar.f120213i0 == 8) {
                hVar.f120196a = true;
            } else {
                float f13 = hVar.f120239w;
                if (f13 < 1.0f && gVar4 == u4.g.MATCH_CONSTRAINT) {
                    hVar.f120230r = 2;
                }
                float f14 = hVar.f120242z;
                if (f14 < 1.0f && gVar5 == u4.g.MATCH_CONSTRAINT) {
                    hVar.f120232s = 2;
                }
                if (hVar.Y > 0.0f) {
                    u4.g gVar6 = u4.g.MATCH_CONSTRAINT;
                    if (gVar4 == gVar6 && (gVar5 == u4.g.WRAP_CONTENT || gVar5 == u4.g.FIXED)) {
                        hVar.f120230r = 3;
                    } else if (gVar5 == gVar6 && (gVar4 == u4.g.WRAP_CONTENT || gVar4 == u4.g.FIXED)) {
                        hVar.f120232s = 3;
                    } else if (gVar4 == gVar6 && gVar5 == gVar6) {
                        if (hVar.f120230r == 0) {
                            hVar.f120230r = 3;
                        }
                        if (hVar.f120232s == 0) {
                            hVar.f120232s = 3;
                        }
                    }
                }
                u4.g gVar7 = u4.g.MATCH_CONSTRAINT;
                u4.e eVar = hVar.L;
                u4.e eVar2 = hVar.f120195J;
                if (gVar4 == gVar7 && hVar.f120230r == 1 && (eVar2.f120189f == null || eVar.f120189f == null)) {
                    gVar4 = u4.g.WRAP_CONTENT;
                }
                u4.e eVar3 = hVar.M;
                u4.e eVar4 = hVar.K;
                if (gVar5 == gVar7 && hVar.f120232s == 1 && (eVar4.f120189f == null || eVar3.f120189f == null)) {
                    gVar5 = u4.g.WRAP_CONTENT;
                }
                u4.g gVar8 = gVar5;
                n nVar = hVar.f120202d;
                nVar.f124021d = gVar4;
                int i14 = hVar.f120230r;
                nVar.f124018a = i14;
                q qVar = hVar.f120204e;
                qVar.f124021d = gVar8;
                int i15 = hVar.f120232s;
                qVar.f124018a = i15;
                u4.g gVar9 = u4.g.MATCH_PARENT;
                if ((gVar4 == gVar9 || gVar4 == u4.g.FIXED || gVar4 == u4.g.WRAP_CONTENT) && (gVar8 == gVar9 || gVar8 == u4.g.FIXED || gVar8 == u4.g.WRAP_CONTENT)) {
                    int y13 = hVar.y();
                    if (gVar4 == gVar9) {
                        y13 = (iVar.y() - eVar2.f120190g) - eVar.f120190g;
                        gVar4 = u4.g.FIXED;
                    }
                    int o13 = hVar.o();
                    if (gVar8 == gVar9) {
                        int o14 = (iVar.o() - eVar4.f120190g) - eVar3.f120190g;
                        gVar8 = u4.g.FIXED;
                        i13 = o14;
                    } else {
                        i13 = o13;
                    }
                    h(hVar, gVar4, y13, gVar8, i13);
                    hVar.f120202d.f124022e.d(hVar.y());
                    hVar.f120204e.f124022e.d(hVar.o());
                    hVar.f120196a = true;
                } else {
                    u4.e[] eVarArr = hVar.R;
                    if (gVar4 != gVar7 || (gVar8 != (gVar3 = u4.g.WRAP_CONTENT) && gVar8 != u4.g.FIXED)) {
                        gVar = gVar8;
                    } else if (i14 == 3) {
                        if (gVar8 == gVar3) {
                            h(hVar, gVar3, 0, gVar3, 0);
                        }
                        int o15 = hVar.o();
                        int i16 = (int) ((o15 * hVar.Y) + 0.5f);
                        u4.g gVar10 = u4.g.FIXED;
                        h(hVar, gVar10, i16, gVar10, o15);
                        hVar.f120202d.f124022e.d(hVar.y());
                        hVar.f120204e.f124022e.d(hVar.o());
                        hVar.f120196a = true;
                    } else if (i14 == 1) {
                        h(hVar, gVar3, 0, gVar8, 0);
                        hVar.f120202d.f124022e.f124002m = hVar.y();
                    } else {
                        gVar = gVar8;
                        if (i14 == 2) {
                            u4.g gVar11 = iVar.U[0];
                            u4.g gVar12 = u4.g.FIXED;
                            if (gVar11 == gVar12 || gVar11 == gVar9) {
                                h(hVar, gVar12, (int) ((f13 * iVar.y()) + 0.5f), gVar, hVar.o());
                                hVar.f120202d.f124022e.d(hVar.y());
                                hVar.f120204e.f124022e.d(hVar.o());
                                hVar.f120196a = true;
                            }
                        } else if (eVarArr[0].f120189f == null || eVarArr[1].f120189f == null) {
                            h(hVar, gVar3, 0, gVar, 0);
                            hVar.f120202d.f124022e.d(hVar.y());
                            hVar.f120204e.f124022e.d(hVar.o());
                            hVar.f120196a = true;
                        }
                    }
                    if (gVar == gVar7 && (gVar4 == (gVar2 = u4.g.WRAP_CONTENT) || gVar4 == u4.g.FIXED)) {
                        if (i15 == 3) {
                            if (gVar4 == gVar2) {
                                h(hVar, gVar2, 0, gVar2, 0);
                            }
                            int y14 = hVar.y();
                            float f15 = hVar.Y;
                            if (hVar.Z == -1) {
                                f15 = 1.0f / f15;
                            }
                            u4.g gVar13 = u4.g.FIXED;
                            h(hVar, gVar13, y14, gVar13, (int) ((y14 * f15) + 0.5f));
                            hVar.f120202d.f124022e.d(hVar.y());
                            hVar.f120204e.f124022e.d(hVar.o());
                            hVar.f120196a = true;
                        } else if (i15 == 1) {
                            h(hVar, gVar4, 0, gVar2, 0);
                            hVar.f120204e.f124022e.f124002m = hVar.o();
                        } else if (i15 == 2) {
                            u4.g gVar14 = iVar.U[1];
                            u4.g gVar15 = u4.g.FIXED;
                            if (gVar14 == gVar15 || gVar14 == gVar9) {
                                h(hVar, gVar4, hVar.y(), gVar15, (int) ((f14 * iVar.o()) + 0.5f));
                                hVar.f120202d.f124022e.d(hVar.y());
                                hVar.f120204e.f124022e.d(hVar.o());
                                hVar.f120196a = true;
                            }
                        } else if (eVarArr[2].f120189f == null || eVarArr[3].f120189f == null) {
                            h(hVar, gVar2, 0, gVar, 0);
                            hVar.f120202d.f124022e.d(hVar.y());
                            hVar.f120204e.f124022e.d(hVar.o());
                            hVar.f120196a = true;
                        }
                    }
                    if (gVar4 == gVar7 && gVar == gVar7) {
                        if (i14 == 1 || i15 == 1) {
                            u4.g gVar16 = u4.g.WRAP_CONTENT;
                            h(hVar, gVar16, 0, gVar16, 0);
                            hVar.f120202d.f124022e.f124002m = hVar.y();
                            hVar.f120204e.f124022e.f124002m = hVar.o();
                        } else if (i15 == 2 && i14 == 2) {
                            u4.g[] gVarArr2 = iVar.U;
                            u4.g gVar17 = gVarArr2[0];
                            u4.g gVar18 = u4.g.FIXED;
                            if (gVar17 == gVar18 && gVarArr2[1] == gVar18) {
                                h(hVar, gVar18, (int) ((f13 * iVar.y()) + 0.5f), gVar18, (int) ((f14 * iVar.o()) + 0.5f));
                                hVar.f120202d.f124022e.d(hVar.y());
                                hVar.f120204e.f124022e.d(hVar.o());
                                hVar.f120196a = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f123985e;
        arrayList.clear();
        u4.i iVar = (u4.i) this.f123984d;
        iVar.f120202d.f();
        iVar.f120204e.f();
        arrayList.add(iVar.f120202d);
        arrayList.add(iVar.f120204e);
        Iterator it = iVar.f120284v0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            if (hVar instanceof u4.m) {
                arrayList.add(new k(hVar));
            } else {
                if (hVar.F()) {
                    if (hVar.f120198b == null) {
                        hVar.f120198b = new d(0, hVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hVar.f120198b);
                } else {
                    arrayList.add(hVar.f120202d);
                }
                if (hVar.H()) {
                    if (hVar.f120200c == null) {
                        hVar.f120200c = new d(1, hVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(hVar.f120200c);
                } else {
                    arrayList.add(hVar.f120204e);
                }
                if (hVar instanceof u4.o) {
                    arrayList.add(new l(hVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            u uVar = (u) it3.next();
            if (uVar.f124019b != iVar) {
                uVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f123987g;
        arrayList2.clear();
        u4.i iVar2 = (u4.i) this.f123983c;
        f(iVar2.f120202d, 0, arrayList2);
        f(iVar2.f120204e, 1, arrayList2);
        this.f123981a = false;
    }

    public final int e(u4.i iVar, int i13) {
        ArrayList arrayList = (ArrayList) this.f123987g;
        int size = arrayList.size();
        long j13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            j13 = Math.max(j13, ((o) arrayList.get(i14)).b(iVar, i13));
        }
        return (int) j13;
    }

    public final void f(u uVar, int i13, ArrayList arrayList) {
        h hVar;
        Iterator it = uVar.f124025h.f124000k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hVar = uVar.f124026i;
            if (!hasNext) {
                break;
            }
            e eVar = (e) it.next();
            if (eVar instanceof h) {
                b((h) eVar, i13, 0, arrayList, null);
            } else if (eVar instanceof u) {
                b(((u) eVar).f124025h, i13, 0, arrayList, null);
            }
        }
        Iterator it2 = hVar.f124000k.iterator();
        while (it2.hasNext()) {
            e eVar2 = (e) it2.next();
            if (eVar2 instanceof h) {
                b((h) eVar2, i13, 1, arrayList, null);
            } else if (eVar2 instanceof u) {
                b(((u) eVar2).f124026i, i13, 1, arrayList, null);
            }
        }
        if (i13 == 1) {
            Iterator it3 = ((q) uVar).f124009k.f124000k.iterator();
            while (it3.hasNext()) {
                e eVar3 = (e) it3.next();
                if (eVar3 instanceof h) {
                    b((h) eVar3, i13, 2, arrayList, null);
                }
            }
        }
    }

    public final void g() {
        n();
        if (((ArrayDeque) this.f123988h).isEmpty()) {
            return;
        }
        i0 i0Var = (i0) ((d7.o) this.f123984d);
        if (!i0Var.f53829a.hasMessages(1)) {
            i0Var.getClass();
            h0 c13 = i0.c();
            c13.f53827a = i0Var.f53829a.obtainMessage(1);
            i0Var.getClass();
            Message message = c13.f53827a;
            message.getClass();
            i0Var.f53829a.sendMessageAtFrontOfQueue(message);
            c13.a();
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f123987g;
        boolean z13 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f123988h);
        ((ArrayDeque) this.f123988h).clear();
        if (z13) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void h(u4.h hVar, u4.g gVar, int i13, u4.g gVar2, int i14) {
        b bVar = (b) this.f123989i;
        bVar.f123969a = gVar;
        bVar.f123970b = gVar2;
        bVar.f123971c = i13;
        bVar.f123972d = i14;
        ((androidx.constraintlayout.widget.f) ((c) this.f123988h)).b(hVar, bVar);
        hVar.b0(bVar.f123973e);
        hVar.W(bVar.f123974f);
        hVar.E = bVar.f123976h;
        hVar.R(bVar.f123975g);
    }

    public final void i() {
        a aVar;
        Iterator it = ((u4.i) this.f123983c).f120284v0.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            if (!hVar.f120196a) {
                u4.g[] gVarArr = hVar.U;
                boolean z13 = false;
                u4.g gVar = gVarArr[0];
                u4.g gVar2 = gVarArr[1];
                int i13 = hVar.f120230r;
                int i14 = hVar.f120232s;
                u4.g gVar3 = u4.g.WRAP_CONTENT;
                boolean z14 = gVar == gVar3 || (gVar == u4.g.MATCH_CONSTRAINT && i13 == 1);
                if (gVar2 == gVar3 || (gVar2 == u4.g.MATCH_CONSTRAINT && i14 == 1)) {
                    z13 = true;
                }
                i iVar = hVar.f120202d.f124022e;
                boolean z15 = iVar.f123999j;
                i iVar2 = hVar.f120204e.f124022e;
                boolean z16 = iVar2.f123999j;
                if (z15 && z16) {
                    u4.g gVar4 = u4.g.FIXED;
                    h(hVar, gVar4, iVar.f123996g, gVar4, iVar2.f123996g);
                    hVar.f120196a = true;
                } else if (z15 && z13) {
                    h(hVar, u4.g.FIXED, iVar.f123996g, gVar3, iVar2.f123996g);
                    if (gVar2 == u4.g.MATCH_CONSTRAINT) {
                        hVar.f120204e.f124022e.f124002m = hVar.o();
                    } else {
                        hVar.f120204e.f124022e.d(hVar.o());
                        hVar.f120196a = true;
                    }
                } else if (z16 && z14) {
                    h(hVar, gVar3, iVar.f123996g, u4.g.FIXED, iVar2.f123996g);
                    if (gVar == u4.g.MATCH_CONSTRAINT) {
                        hVar.f120202d.f124022e.f124002m = hVar.y();
                    } else {
                        hVar.f120202d.f124022e.d(hVar.y());
                        hVar.f120196a = true;
                    }
                }
                if (hVar.f120196a && (aVar = hVar.f120204e.f124010l) != null) {
                    aVar.d(hVar.f120201c0);
                }
            }
        }
    }

    public final void j(int i13, d7.r rVar) {
        n();
        ((ArrayDeque) this.f123988h).add(new d7.q(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f123986f), i13, rVar));
    }

    public final void k() {
        n();
        synchronized (this.f123989i) {
            this.f123981a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f123986f).iterator();
        while (it.hasNext()) {
            d7.t tVar = (d7.t) it.next();
            d7.s sVar = (d7.s) this.f123985e;
            tVar.f53888d = true;
            if (tVar.f53887c) {
                tVar.f53887c = false;
                sVar.c(tVar.f53885a, tVar.f53886b.e());
            }
        }
        ((CopyOnWriteArraySet) this.f123986f).clear();
    }

    public final void l(Object obj) {
        n();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f123986f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            d7.t tVar = (d7.t) it.next();
            if (tVar.f53885a.equals(obj)) {
                d7.s sVar = (d7.s) this.f123985e;
                tVar.f53888d = true;
                if (tVar.f53887c) {
                    tVar.f53887c = false;
                    sVar.c(tVar.f53885a, tVar.f53886b.e());
                }
                copyOnWriteArraySet.remove(tVar);
            }
        }
    }

    public final void m(int i13, d7.r rVar) {
        j(i13, rVar);
        g();
    }

    public final void n() {
        if (this.f123982b) {
            bf.b.t(Thread.currentThread() == ((i0) ((d7.o) this.f123984d)).f53829a.getLooper().getThread());
        }
    }

    public f(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, d7.e eVar, d7.s sVar, boolean z13) {
        this.f123983c = eVar;
        this.f123986f = copyOnWriteArraySet;
        this.f123985e = sVar;
        this.f123989i = new Object();
        this.f123987g = new ArrayDeque();
        this.f123988h = new ArrayDeque();
        this.f123984d = ((g0) eVar).a(looper, new Handler.Callback() { // from class: d7.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                v4.f fVar = v4.f.this;
                Iterator it = ((CopyOnWriteArraySet) fVar.f123986f).iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    s sVar2 = (s) fVar.f123985e;
                    if (!tVar.f53888d && tVar.f53887c) {
                        a7.p e13 = tVar.f53886b.e();
                        tVar.f53886b = new a7.o(0);
                        tVar.f53887c = false;
                        sVar2.c(tVar.f53885a, e13);
                    }
                    if (((i0) ((o) fVar.f123984d)).f53829a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f123982b = z13;
    }
}
