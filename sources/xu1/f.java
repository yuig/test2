package xu1;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f135957a;

    public f() {
        this(e.f135956a.f135957a.get());
    }

    public final void a(boolean z13) {
        this.f135957a.compareAndSet(!z13, z13);
    }

    public f(boolean z13) {
        this.f135957a = new AtomicBoolean(z13);
    }
}
