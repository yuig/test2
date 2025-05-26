package wo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements c0 {
    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return i0.f130705e;
    }

    @Override // wo2.c0
    public final void write(j source, long j13) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j13);
    }
}
