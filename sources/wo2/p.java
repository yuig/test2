package wo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class p implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f130720a;

    public p(e0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f130720a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f130720a.close();
    }

    @Override // wo2.e0
    public long read(j sink, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f130720a.read(sink, j13);
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return this.f130720a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f130720a + ')';
    }
}
