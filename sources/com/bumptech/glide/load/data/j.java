package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class j extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f29806c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int f29807d = 31;

    /* renamed from: a, reason: collision with root package name */
    public final byte f29808a;

    /* renamed from: b, reason: collision with root package name */
    public int f29809b;

    public j(int i13, InputStream inputStream) {
        super(inputStream);
        if (i13 < -1 || i13 > 8) {
            throw new IllegalArgumentException(a.a.d("Cannot add invalid orientation: ", i13));
        }
        this.f29808a = (byte) i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i13;
        int i14 = this.f29809b;
        int read = (i14 < 2 || i14 > (i13 = f29807d)) ? super.read() : i14 == i13 ? this.f29808a : f29806c[i14 - 2] & 255;
        if (read != -1) {
            this.f29809b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long skip = super.skip(j13);
        if (skip > 0) {
            this.f29809b = (int) (this.f29809b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15;
        int i16 = this.f29809b;
        int i17 = f29807d;
        if (i16 > i17) {
            i15 = super.read(bArr, i13, i14);
        } else if (i16 == i17) {
            bArr[i13] = this.f29808a;
            i15 = 1;
        } else if (i16 < 2) {
            i15 = super.read(bArr, i13, 2 - i16);
        } else {
            int min = Math.min(i17 - i16, i14);
            System.arraycopy(f29806c, this.f29809b - 2, bArr, i13, min);
            i15 = min;
        }
        if (i15 > 0) {
            this.f29809b += i15;
        }
        return i15;
    }
}
