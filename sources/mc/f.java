package mc;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class f extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86894a;

    /* renamed from: b, reason: collision with root package name */
    public int f86895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i13, InputStream inputStream) {
        super(inputStream);
        this.f86894a = 2;
        this.f86895b = i13;
    }

    public final long a(long j13) {
        int i13 = this.f86895b;
        if (i13 == 0) {
            return -1L;
        }
        return (i13 == Integer.MIN_VALUE || j13 <= ((long) i13)) ? j13 : i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f86894a) {
            case 1:
                int i13 = this.f86895b;
                return i13 == Integer.MIN_VALUE ? super.available() : Math.min(i13, super.available());
            case 2:
                return Math.min(super.available(), this.f86895b);
            default:
                return super.available();
        }
    }

    public final void c(long j13) {
        int i13 = this.f86895b;
        if (i13 == Integer.MIN_VALUE || j13 == -1) {
            return;
        }
        this.f86895b = (int) (i13 - j13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        switch (this.f86894a) {
            case 1:
                synchronized (this) {
                    super.mark(i13);
                    this.f86895b = i13;
                }
                return;
            default:
                super.mark(i13);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i13 = -1;
        switch (this.f86894a) {
            case 0:
                int read = super.read();
                if (read != -1) {
                    this.f86895b++;
                }
                return read;
            case 1:
                if (a(1L) == -1) {
                    return -1;
                }
                int read2 = super.read();
                c(1L);
                return read2;
            default:
                if (this.f86895b > 0 && (i13 = super.read()) >= 0) {
                    this.f86895b--;
                }
                return i13;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        switch (this.f86894a) {
            case 1:
                synchronized (this) {
                    super.reset();
                    this.f86895b = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        switch (this.f86894a) {
            case 1:
                long a13 = a(j13);
                if (a13 == -1) {
                    return 0L;
                }
                long skip = super.skip(a13);
                c(skip);
                return skip;
            case 2:
                int skip2 = (int) super.skip(Math.min(j13, this.f86895b));
                if (skip2 >= 0) {
                    this.f86895b -= skip2;
                }
                return skip2;
            default:
                return super.skip(j13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FileInputStream fileInputStream) {
        this(fileInputStream, 0);
        this.f86894a = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InputStream inputStream, int i13) {
        super(inputStream);
        this.f86894a = i13;
        if (i13 != 1) {
            this.f86895b = 0;
        } else {
            super(inputStream);
            this.f86895b = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = -1;
        switch (this.f86894a) {
            case 0:
                int read = super.read(bArr, i13, i14);
                if (read != -1) {
                    this.f86895b += read;
                }
                return read;
            case 1:
                int a13 = (int) a(i14);
                if (a13 == -1) {
                    return -1;
                }
                int read2 = super.read(bArr, i13, a13);
                c(read2);
                return read2;
            default:
                int i16 = this.f86895b;
                if (i16 > 0 && (i15 = super.read(bArr, i13, Math.min(i14, i16))) >= 0) {
                    this.f86895b -= i15;
                }
                return i15;
        }
    }
}
