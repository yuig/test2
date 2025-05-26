package bj2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f22988a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f22989b = new AtomicBoolean(false);

    public e(ArrayList arrayList) {
        this.f22988a = arrayList;
    }

    @Override // bj2.c
    public final void U0(vi2.b bVar, l lVar) {
        Iterator it = this.f22988a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).U0(bVar, lVar);
        }
    }

    @Override // bj2.c
    public final zi2.c p() {
        List list = this.f22988a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).p());
        }
        return zi2.c.c(arrayList);
    }

    @Override // bj2.c
    public final zi2.c shutdown() {
        if (this.f22989b.getAndSet(true)) {
            return zi2.c.f142036e;
        }
        List list = this.f22988a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).shutdown());
        }
        return zi2.c.c(arrayList);
    }
}
