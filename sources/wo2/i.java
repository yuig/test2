package wo2;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f130704a;

    public i(j jVar) {
        this.f130704a = jVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f130704a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i13, int i14) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f130704a.W(data, i13, i14);
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.f130704a.a0(i13);
    }
}
