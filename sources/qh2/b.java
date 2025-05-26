package qh2;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

/* loaded from: classes4.dex */
public final class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f103924a;

    /* renamed from: b, reason: collision with root package name */
    public ByteArrayOutputStream f103925b;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        ((FilterOutputStream) this).out.write(bArr, i13, i14);
        this.f103924a += i14;
        if (bArr != null) {
            this.f103925b.write(bArr, i13, i14);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i13) {
        ((FilterOutputStream) this).out.write(i13);
        this.f103924a++;
        this.f103925b.write(i13);
    }
}
