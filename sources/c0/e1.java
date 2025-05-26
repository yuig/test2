package c0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class e1 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24232d;

    public e1(n0 n0Var) {
        super(n0Var);
        this.f24232d = new AtomicBoolean(false);
    }

    @Override // c0.b0, java.lang.AutoCloseable
    public final void close() {
        if (this.f24232d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
