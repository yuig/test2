package go;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import wo2.j;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final j f65816a;

    public a(j b13) {
        Intrinsics.checkNotNullParameter(b13, "b");
        this.f65816a = b13;
    }

    public final void a(byte[] buffer, int i13) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f65816a.W(buffer, 0, i13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f65816a.getClass();
    }
}
