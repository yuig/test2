package wo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f130719a;

    public o(c0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f130719a = delegate;
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f130719a.close();
    }

    @Override // wo2.c0, java.io.Flushable
    public void flush() {
        this.f130719a.flush();
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return this.f130719a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f130719a + ')';
    }

    @Override // wo2.c0
    public void write(j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f130719a.write(source, j13);
    }
}
