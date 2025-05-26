package gk2;

/* loaded from: classes4.dex */
public final class p extends l {
    @Override // uj2.g
    public final void c(Object obj) {
        long j13;
        if (this.f65491b.isDisposed()) {
            return;
        }
        if (obj == null) {
            e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.f65490a.c(obj);
        do {
            j13 = get();
            if (j13 == 0) {
                return;
            }
        } while (!compareAndSet(j13, j13 - 1));
    }
}
