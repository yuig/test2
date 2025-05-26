package he;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f68933a;

    /* renamed from: b, reason: collision with root package name */
    public int f68934b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f68933a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f68933a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i13) {
        this.f68934b = this.f68933a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f68933a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i13 = this.f68934b;
        if (i13 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f68933a.position(i13);
    }

    @Override // java.io.InputStream
    public final long skip(long j13) {
        ByteBuffer byteBuffer = this.f68933a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j13, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        ByteBuffer byteBuffer = this.f68933a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i14, byteBuffer.remaining());
        byteBuffer.get(bArr, i13, min);
        return min;
    }
}
