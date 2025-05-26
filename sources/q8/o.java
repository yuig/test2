package q8;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements t {

    /* renamed from: b, reason: collision with root package name */
    public final a7.k f102979b;

    /* renamed from: c, reason: collision with root package name */
    public final long f102980c;

    /* renamed from: d, reason: collision with root package name */
    public long f102981d;

    /* renamed from: f, reason: collision with root package name */
    public int f102983f;

    /* renamed from: g, reason: collision with root package name */
    public int f102984g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f102982e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f102978a = new byte[4096];

    static {
        a7.j0.a("media3.extractor");
    }

    public o(a7.k kVar, long j13, long j14) {
        this.f102979b = kVar;
        this.f102981d = j13;
        this.f102980c = j14;
    }

    @Override // q8.t
    public final boolean c(byte[] bArr, int i13, int i14, boolean z13) {
        if (!q(i14, z13)) {
            return false;
        }
        System.arraycopy(this.f102982e, this.f102983f - i14, bArr, i13, i14);
        return true;
    }

    @Override // q8.t
    public final void g() {
        this.f102983f = 0;
    }

    @Override // q8.t
    public final long getLength() {
        return this.f102980c;
    }

    @Override // q8.t
    public final long h() {
        return this.f102981d;
    }

    @Override // q8.t
    public final boolean i(byte[] bArr, int i13, int i14, boolean z13) {
        int min;
        int i15 = this.f102984g;
        if (i15 == 0) {
            min = 0;
        } else {
            min = Math.min(i15, i14);
            System.arraycopy(this.f102982e, 0, bArr, i13, min);
            v(min);
        }
        int i16 = min;
        while (i16 < i14 && i16 != -1) {
            i16 = u(bArr, i13, i14, i16, z13);
        }
        if (i16 != -1) {
            this.f102981d += i16;
        }
        return i16 != -1;
    }

    @Override // q8.t
    public final long k() {
        return this.f102981d + this.f102983f;
    }

    @Override // q8.t
    public final void m(int i13) {
        q(i13, false);
    }

    @Override // q8.t
    public final int n(int i13) {
        int min = Math.min(this.f102984g, i13);
        v(min);
        if (min == 0) {
            byte[] bArr = this.f102978a;
            min = u(bArr, 0, Math.min(i13, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f102981d += min;
        }
        return min;
    }

    @Override // q8.t
    public final int o(byte[] bArr, int i13, int i14) {
        int min;
        t(i14);
        int i15 = this.f102984g;
        int i16 = this.f102983f;
        int i17 = i15 - i16;
        if (i17 == 0) {
            min = u(this.f102982e, i16, i14, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f102984g += min;
        } else {
            min = Math.min(i14, i17);
        }
        System.arraycopy(this.f102982e, this.f102983f, bArr, i13, min);
        this.f102983f += min;
        return min;
    }

    @Override // q8.t
    public final void p(int i13) {
        int min = Math.min(this.f102984g, i13);
        v(min);
        int i14 = min;
        while (i14 < i13 && i14 != -1) {
            i14 = u(this.f102978a, -i14, Math.min(i13, this.f102978a.length + i14), i14, false);
        }
        if (i14 != -1) {
            this.f102981d += i14;
        }
    }

    @Override // q8.t
    public final boolean q(int i13, boolean z13) {
        t(i13);
        int i14 = this.f102984g - this.f102983f;
        while (i14 < i13) {
            i14 = u(this.f102982e, this.f102983f, i13, i14, z13);
            if (i14 == -1) {
                return false;
            }
            this.f102984g = this.f102983f + i14;
        }
        this.f102983f += i13;
        return true;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f102984g;
        int i16 = 0;
        if (i15 != 0) {
            int min = Math.min(i15, i14);
            System.arraycopy(this.f102982e, 0, bArr, i13, min);
            v(min);
            i16 = min;
        }
        if (i16 == 0) {
            i16 = u(bArr, i13, i14, 0, true);
        }
        if (i16 != -1) {
            this.f102981d += i16;
        }
        return i16;
    }

    @Override // q8.t
    public final void readFully(byte[] bArr, int i13, int i14) {
        i(bArr, i13, i14, false);
    }

    @Override // q8.t
    public final void s(byte[] bArr, int i13, int i14) {
        c(bArr, i13, i14, false);
    }

    public final void t(int i13) {
        int i14 = this.f102983f + i13;
        byte[] bArr = this.f102982e;
        if (i14 > bArr.length) {
            this.f102982e = Arrays.copyOf(this.f102982e, d7.n0.i(bArr.length * 2, 65536 + i14, i14 + 524288));
        }
    }

    public final int u(byte[] bArr, int i13, int i14, int i15, boolean z13) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f102979b.read(bArr, i13 + i15, i14 - i15);
        if (read != -1) {
            return i15 + read;
        }
        if (i15 == 0 && z13) {
            return -1;
        }
        throw new EOFException();
    }

    public final void v(int i13) {
        int i14 = this.f102984g - i13;
        this.f102984g = i14;
        this.f102983f = 0;
        byte[] bArr = this.f102982e;
        byte[] bArr2 = i14 < bArr.length - 524288 ? new byte[65536 + i14] : bArr;
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        this.f102982e = bArr2;
    }
}
