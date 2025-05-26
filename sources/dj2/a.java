package dj2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public interface a extends Closeable {
    zi2.c b(ArrayList arrayList);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().b(TimeUnit.SECONDS);
    }

    zi2.c shutdown();
}
