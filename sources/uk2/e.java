package uk2;

import java.util.concurrent.atomic.AtomicBoolean;
import uj2.v;

/* loaded from: classes2.dex */
public final class e extends AtomicBoolean implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final v f122408a;

    /* renamed from: b, reason: collision with root package name */
    public final f f122409b;

    public e(v vVar, f fVar) {
        this.f122408a = vVar;
        this.f122409b = fVar;
    }

    @Override // xj2.c
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f122409b.R(this);
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get();
    }
}
