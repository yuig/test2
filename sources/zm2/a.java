package zm2;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;

/* loaded from: classes2.dex */
public final class a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f142180a;

    public a(int i13, ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f142180a = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f142180a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f142180a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f142180a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long skip = super.skip(Math.min(j13, this.f142180a));
        if (skip >= 0) {
            this.f142180a = (int) (this.f142180a - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f142180a;
        if (i15 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i13, Math.min(i14, i15));
        if (read >= 0) {
            this.f142180a -= read;
        }
        return read;
    }
}
