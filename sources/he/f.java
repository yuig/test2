package he;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class f extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f68943c;

    /* renamed from: a, reason: collision with root package name */
    public InputStream f68944a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f68945b;

    static {
        char[] cArr = n.f68959a;
        f68943c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f68944a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f68944a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i13) {
        this.f68944a.mark(i13);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f68944a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f68944a.read();
        } catch (IOException e13) {
            this.f68945b = e13;
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f68944a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j13) {
        try {
            return this.f68944a.skip(j13);
        } catch (IOException e13) {
            this.f68945b = e13;
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f68944a.read(bArr);
        } catch (IOException e13) {
            this.f68945b = e13;
            throw e13;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        try {
            return this.f68944a.read(bArr, i13, i14);
        } catch (IOException e13) {
            this.f68945b = e13;
            throw e13;
        }
    }
}
