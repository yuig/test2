package qq2;

import pq2.i;

/* loaded from: classes2.dex */
public final class b implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final i f104880a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f104881b;

    public b(i iVar) {
        this.f104880a = iVar;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f104881b = true;
        this.f104880a.cancel();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f104881b;
    }
}
