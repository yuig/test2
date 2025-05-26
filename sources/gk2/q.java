package gk2;

import io.reactivex.exceptions.MissingBackpressureException;

/* loaded from: classes4.dex */
public abstract class q extends l {
    @Override // uj2.g
    public final void c(Object obj) {
        if (this.f65491b.isDisposed()) {
        }
        if (obj == null) {
            e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() != 0) {
            this.f65490a.c(obj);
            d7.b.l0(this, 1L);
            return;
        }
        n nVar = (n) this;
        switch (nVar.f65541c) {
            case 0:
                break;
            default:
                nVar.e(new MissingBackpressureException("create: could not emit value due to lack of requests"));
                break;
        }
    }
}
