package fk2;

import lb.l0;

/* loaded from: classes2.dex */
public final class g extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62438a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62439b;

    public g(Object obj, int i13) {
        this.f62438a = i13;
        this.f62439b = obj;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        h6.r rVar = ck2.i.f27922b;
        int i13 = this.f62438a;
        Object obj = this.f62439b;
        switch (i13) {
            case 0:
                f fVar = new f(dVar, 0);
                dVar.b(fVar);
                try {
                    ((uj2.e) obj).n(fVar);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    fVar.d(th3);
                    return;
                }
            case 1:
                xj2.c eVar = new xj2.e(rVar);
                dVar.b(eVar);
                try {
                    ((ak2.a) obj).run();
                    if (!eVar.isDisposed()) {
                        dVar.a();
                        break;
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    if (eVar.isDisposed()) {
                        l0.R0(th4);
                        return;
                    } else {
                        dVar.onError(th4);
                        return;
                    }
                }
                break;
            case 2:
                ((xp2.a) obj).b(new p(dVar));
                break;
            case 3:
                xj2.c eVar2 = new xj2.e(rVar);
                dVar.b(eVar2);
                try {
                    ((Runnable) obj).run();
                    if (!eVar2.isDisposed()) {
                        dVar.a();
                        break;
                    }
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    if (eVar2.isDisposed()) {
                        l0.R0(th5);
                        return;
                    } else {
                        dVar.onError(th5);
                        return;
                    }
                }
                break;
            default:
                ((uj2.b0) ((uj2.f0) obj)).p(new q(dVar));
                break;
        }
    }
}
