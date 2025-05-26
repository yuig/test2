package df;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f54755a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f54756b;

    public g0(FileOutputStream innerStream, j0 callback) {
        Intrinsics.checkNotNullParameter(innerStream, "innerStream");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f54755a = innerStream;
        this.f54756b = callback;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j0 j0Var = this.f54756b;
        try {
            this.f54755a.close();
        } finally {
            j0Var.a();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f54755a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f54755a.write(buffer);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i13, int i14) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f54755a.write(buffer, i13, i14);
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.f54755a.write(i13);
    }
}
