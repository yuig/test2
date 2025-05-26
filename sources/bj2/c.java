package bj2;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public interface c extends Closeable {
    void U0(vi2.b bVar, l lVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().b(TimeUnit.SECONDS);
    }

    default zi2.c p() {
        return zi2.c.f142036e;
    }

    default zi2.c shutdown() {
        return p();
    }
}
