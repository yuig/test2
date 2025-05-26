package a6;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f874a;

    public q(FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f874a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f874a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b13) {
        Intrinsics.checkNotNullParameter(b13, "b");
        this.f874a.write(b13);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i13, int i14) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f874a.write(bytes, i13, i14);
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.f874a.write(i13);
    }
}
