package he;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f68941a;

    /* renamed from: b, reason: collision with root package name */
    public int f68942b;

    public e(InputStream inputStream, long j13) {
        super(inputStream);
        this.f68941a = j13;
    }

    public final void a(int i13) {
        if (i13 >= 0) {
            this.f68942b += i13;
            return;
        }
        long j13 = this.f68942b;
        long j14 = this.f68941a;
        if (j14 - j13 <= 0) {
            return;
        }
        StringBuilder u13 = a.a.u("Failed to read all expected data, expected: ", j14, ", but read: ");
        u13.append(this.f68942b);
        throw new IOException(u13.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f68941a - this.f68942b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i13, int i14) {
        int read;
        read = super.read(bArr, i13, i14);
        a(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
