package nj2;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public interface q extends Closeable {
    boolean F();

    void T(vi2.b bVar, i iVar);

    void X(g gVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().b(TimeUnit.SECONDS);
    }

    boolean e2();

    default zi2.c p() {
        return zi2.c.f142036e;
    }

    default zi2.c shutdown() {
        return p();
    }
}
