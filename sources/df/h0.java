package df;

import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f54759a;

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f54760b;

    public h0(q0 input, BufferedOutputStream output) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        this.f54759a = input;
        this.f54760b = output;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f54759a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f54760b;
        try {
            this.f54759a.close();
        } finally {
            outputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int read = this.f54759a.read(buffer);
        if (read > 0) {
            this.f54760b.write(buffer, 0, read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final long skip(long j13) {
        int read;
        byte[] bArr = new byte[1024];
        long j14 = 0;
        while (j14 < j13 && (read = read(bArr, 0, (int) Math.min(j13 - j14, 1024))) >= 0) {
            j14 += read;
        }
        return j14;
    }

    @Override // java.io.InputStream
    public final int read(byte[] buffer, int i13, int i14) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int read = this.f54759a.read(buffer, i13, i14);
        if (read > 0) {
            this.f54760b.write(buffer, i13, read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f54759a.read();
        if (read >= 0) {
            this.f54760b.write(read);
        }
        return read;
    }
}
