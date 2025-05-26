package yl;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f139273a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        int i15;
        if (i13 < 0 || i13 > bArr.length || i14 < 0 || (i15 = i13 + i14) > bArr.length || i15 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f139273a += i14;
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.f139273a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f139273a += bArr.length;
    }
}
