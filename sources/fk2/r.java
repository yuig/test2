package fk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class r extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62467a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.f[] f62468b;

    public r(uj2.f[] fVarArr, int i13) {
        this.f62467a = i13;
        this.f62468b = fVarArr;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        int i13 = 0;
        switch (this.f62467a) {
            case 0:
                xj2.b bVar = new xj2.b();
                d dVar2 = new d(dVar, new AtomicBoolean(), bVar, this.f62468b.length + 1);
                dVar.b(bVar);
                uj2.f[] fVarArr = this.f62468b;
                int length = fVarArr.length;
                while (i13 < length) {
                    uj2.f fVar = fVarArr[i13];
                    if (bVar.f135163b) {
                        break;
                    } else if (fVar == null) {
                        bVar.dispose();
                        dVar2.onError(new NullPointerException("A completable source is null"));
                        break;
                    } else {
                        ((uj2.b) fVar).j(dVar2);
                        i13++;
                    }
                }
                dVar2.a();
                break;
            default:
                xj2.b bVar2 = new xj2.b();
                AtomicInteger atomicInteger = new AtomicInteger(this.f62468b.length + 1);
                pk2.c cVar = new pk2.c();
                dVar.b(bVar2);
                uj2.f[] fVarArr2 = this.f62468b;
                int length2 = fVarArr2.length;
                while (i13 < length2) {
                    uj2.f fVar2 = fVarArr2[i13];
                    if (bVar2.f135163b) {
                        break;
                    } else {
                        if (fVar2 == null) {
                            pk2.h.a(cVar, new NullPointerException("A completable source is null"));
                            atomicInteger.decrementAndGet();
                        } else {
                            ((uj2.b) fVar2).j(new s(dVar, bVar2, cVar, atomicInteger));
                        }
                        i13++;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable b13 = pk2.h.b(cVar);
                    if (b13 != null) {
                        dVar.onError(b13);
                        break;
                    } else {
                        dVar.a();
                        break;
                    }
                }
                break;
        }
    }
}
