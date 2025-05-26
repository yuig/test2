package wo2;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface c0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    i0 timeout();

    void write(j jVar, long j13);
}
