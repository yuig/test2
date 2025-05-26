package ok2;

/* loaded from: classes2.dex */
public abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f95468a;

    /* renamed from: b, reason: collision with root package name */
    public Object f95469b;

    public c(xp2.b bVar) {
        this.f95468a = bVar;
    }

    @Override // dk2.i
    public final void clear() {
        lazySet(32);
        this.f95469b = null;
    }

    public final void e(Object obj) {
        int i13 = get();
        do {
            xp2.b bVar = this.f95468a;
            if (i13 == 8) {
                this.f95469b = obj;
                lazySet(16);
                bVar.c(obj);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
            if ((i13 & (-3)) != 0) {
                return;
            }
            if (i13 == 2) {
                lazySet(3);
                bVar.c(obj);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
            this.f95469b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i13 = get();
            }
        } while (i13 != 4);
        this.f95469b = null;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        e(obj);
    }

    @Override // dk2.i
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f95469b;
        this.f95469b = null;
        return obj;
    }

    @Override // xp2.c
    public final void request(long j13) {
        Object obj;
        if (g.validate(j13)) {
            do {
                int i13 = get();
                if ((i13 & (-2)) != 0) {
                    return;
                }
                if (i13 == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f95469b) == null) {
                        return;
                    }
                    this.f95469b = null;
                    xp2.b bVar = this.f95468a;
                    bVar.c(obj);
                    if (get() != 4) {
                        bVar.a();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        lazySet(8);
        return 2;
    }
}
