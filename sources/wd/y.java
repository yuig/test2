package wd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f129215a;

    /* renamed from: b, reason: collision with root package name */
    public int f129216b;

    /* renamed from: c, reason: collision with root package name */
    public int f129217c;

    /* renamed from: d, reason: collision with root package name */
    public int f129218d;

    /* renamed from: e, reason: collision with root package name */
    public int f129219e;

    /* renamed from: f, reason: collision with root package name */
    public final qd.i f129220f;

    public y(InputStream inputStream, qd.i iVar) {
        super(inputStream);
        this.f129218d = -1;
        this.f129220f = iVar;
        this.f129215a = (byte[]) iVar.c(65536, byte[].class);
    }

    public static void d() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i13 = this.f129218d;
        if (i13 != -1) {
            int i14 = this.f129219e - i13;
            int i15 = this.f129217c;
            if (i14 < i15) {
                if (i13 == 0 && i15 > bArr.length && this.f129216b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i15) {
                        i15 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f129220f.c(i15, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f129215a = bArr2;
                    this.f129220f.h(bArr);
                    bArr = bArr2;
                } else if (i13 > 0) {
                    System.arraycopy(bArr, i13, bArr, 0, bArr.length - i13);
                }
                int i16 = this.f129219e - this.f129218d;
                this.f129219e = i16;
                this.f129218d = 0;
                this.f129216b = 0;
                int read = inputStream.read(bArr, i16, bArr.length - i16);
                int i17 = this.f129219e;
                if (read > 0) {
                    i17 += read;
                }
                this.f129216b = i17;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f129218d = -1;
            this.f129219e = 0;
            this.f129216b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f129215a == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.f129216b - this.f129219e) + inputStream.available();
    }

    public final synchronized void c() {
        if (this.f129215a != null) {
            this.f129220f.h(this.f129215a);
            this.f129215a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f129215a != null) {
            this.f129220f.h(this.f129215a);
            this.f129215a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        this.f129217c = Math.max(this.f129217c, i13);
        this.f129218d = this.f129219e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f129215a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        }
        if (this.f129219e >= this.f129216b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f129215a && (bArr = this.f129215a) == null) {
            d();
            throw null;
        }
        int i13 = this.f129216b;
        int i14 = this.f129219e;
        if (i13 - i14 <= 0) {
            return -1;
        }
        this.f129219e = i14 + 1;
        return bArr[i14] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f129215a == null) {
            throw new IOException("Stream is closed");
        }
        int i13 = this.f129218d;
        if (-1 == i13) {
            throw new x("Mark has been invalidated, pos: " + this.f129219e + " markLimit: " + this.f129217c);
        }
        this.f129219e = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j13) {
        if (j13 < 1) {
            return 0L;
        }
        byte[] bArr = this.f129215a;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i13 = this.f129216b;
        int i14 = this.f129219e;
        if (i13 - i14 >= j13) {
            this.f129219e = (int) (i14 + j13);
            return j13;
        }
        long j14 = i13 - i14;
        this.f129219e = i13;
        if (this.f129218d == -1 || j13 > this.f129217c) {
            long skip = inputStream.skip(j13 - j14);
            if (skip > 0) {
                this.f129218d = -1;
            }
            return j14 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j14;
        }
        int i15 = this.f129216b;
        int i16 = this.f129219e;
        if (i15 - i16 >= j13 - j14) {
            this.f129219e = (int) ((i16 + j13) - j14);
            return j13;
        }
        long j15 = (j14 + i15) - i16;
        this.f129219e = i15;
        return j15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i13, int i14) {
        int i15;
        int i16;
        byte[] bArr2 = this.f129215a;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i14 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i17 = this.f129219e;
            int i18 = this.f129216b;
            if (i17 < i18) {
                int i19 = i18 - i17;
                if (i19 >= i14) {
                    i19 = i14;
                }
                System.arraycopy(bArr2, i17, bArr, i13, i19);
                this.f129219e += i19;
                if (i19 == i14 || inputStream.available() == 0) {
                    return i19;
                }
                i13 += i19;
                i15 = i14 - i19;
            } else {
                i15 = i14;
            }
            while (true) {
                if (this.f129218d == -1 && i15 >= bArr2.length) {
                    i16 = inputStream.read(bArr, i13, i15);
                    if (i16 == -1) {
                        return i15 != i14 ? i14 - i15 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i15 != i14 ? i14 - i15 : -1;
                    }
                    if (bArr2 != this.f129215a && (bArr2 = this.f129215a) == null) {
                        d();
                        throw null;
                    }
                    int i23 = this.f129216b;
                    int i24 = this.f129219e;
                    i16 = i23 - i24;
                    if (i16 >= i15) {
                        i16 = i15;
                    }
                    System.arraycopy(bArr2, i24, bArr, i13, i16);
                    this.f129219e += i16;
                }
                i15 -= i16;
                if (i15 == 0) {
                    return i14;
                }
                if (inputStream.available() == 0) {
                    return i14 - i15;
                }
                i13 += i16;
            }
        } else {
            d();
            throw null;
        }
    }
}
