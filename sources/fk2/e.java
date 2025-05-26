package fk2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class e extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62428a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f62429b;

    public e(Iterable iterable, int i13) {
        this.f62428a = i13;
        this.f62429b = iterable;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        switch (this.f62428a) {
            case 0:
                try {
                    Iterator it = this.f62429b.iterator();
                    ck2.i.b(it, "The iterator returned is null");
                    d dVar2 = new d(dVar, it);
                    dVar.b((bk2.a) dVar2.f62425d);
                    dVar2.c();
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, dVar);
                    return;
                }
            default:
                xj2.b bVar = new xj2.b();
                dVar.b(bVar);
                try {
                    Iterator it2 = this.f62429b.iterator();
                    ck2.i.b(it2, "The source iterator returned is null");
                    AtomicInteger atomicInteger = new AtomicInteger(1);
                    t tVar = new t(dVar, bVar, atomicInteger);
                    while (!bVar.f135163b) {
                        try {
                            if (!it2.hasNext()) {
                                tVar.a();
                                break;
                            } else if (bVar.f135163b) {
                                break;
                            } else {
                                try {
                                    Object next = it2.next();
                                    ck2.i.b(next, "The iterator returned a null CompletableSource");
                                    uj2.f fVar = (uj2.f) next;
                                    if (bVar.f135163b) {
                                        break;
                                    } else {
                                        atomicInteger.getAndIncrement();
                                        ((uj2.b) fVar).j(tVar);
                                    }
                                } catch (Throwable th4) {
                                    bp1.h.H(th4);
                                    bVar.dispose();
                                    tVar.onError(th4);
                                    return;
                                }
                            }
                        } catch (Throwable th5) {
                            bp1.h.H(th5);
                            bVar.dispose();
                            tVar.onError(th5);
                            return;
                        }
                    }
                    break;
                } catch (Throwable th6) {
                    bp1.h.H(th6);
                    dVar.onError(th6);
                }
        }
    }
}
