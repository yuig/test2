package nj2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f90994a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f90995b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f90996c;

    /* renamed from: d, reason: collision with root package name */
    public final List f90997d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f90998e = new AtomicBoolean(false);

    public d(ArrayList arrayList) {
        this.f90997d = arrayList;
        this.f90994a = new ArrayList(arrayList.size());
        this.f90996c = new ArrayList(arrayList.size());
        this.f90995b = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.F()) {
                this.f90994a.add(qVar);
            }
            if (qVar instanceof d) {
                d dVar = (d) qVar;
                if (!dVar.f90995b.isEmpty()) {
                    this.f90995b.add(dVar);
                }
            }
            if (qVar.e2()) {
                this.f90996c.add(qVar);
            }
        }
    }

    @Override // nj2.q
    public final boolean F() {
        return !this.f90994a.isEmpty();
    }

    @Override // nj2.q
    public final void T(vi2.b bVar, i iVar) {
        Iterator it = this.f90994a.iterator();
        while (it.hasNext()) {
            ((q) it.next()).T(bVar, iVar);
        }
    }

    @Override // nj2.q
    public final void X(g gVar) {
        Iterator it = this.f90996c.iterator();
        while (it.hasNext()) {
            ((q) it.next()).X(gVar);
        }
    }

    public final void a() {
        Iterator it = this.f90995b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
    }

    @Override // nj2.q
    public final boolean e2() {
        return !this.f90996c.isEmpty();
    }

    @Override // nj2.q
    public final zi2.c p() {
        List list = this.f90997d;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q) it.next()).p());
        }
        return zi2.c.c(arrayList);
    }

    @Override // nj2.q
    public final zi2.c shutdown() {
        if (this.f90998e.getAndSet(true)) {
            return zi2.c.f142036e;
        }
        List list = this.f90997d;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q) it.next()).shutdown());
        }
        return zi2.c.c(arrayList);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MultiSpanProcessor{spanProcessorsStart=");
        sb3.append(this.f90994a);
        sb3.append(", spanProcessorsEnding=");
        sb3.append(this.f90995b);
        sb3.append(", spanProcessorsEnd=");
        sb3.append(this.f90996c);
        sb3.append(", spanProcessorsAll=");
        return d7.g.k(sb3, this.f90997d, '}');
    }
}
