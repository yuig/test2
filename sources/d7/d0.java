package d7;

import a.l9;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import pk.o1;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f53803d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f53804e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f53805f = o1.p(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f53806a;

    /* renamed from: b, reason: collision with root package name */
    public int f53807b;

    /* renamed from: c, reason: collision with root package name */
    public int f53808c;

    public d0() {
        this.f53806a = n0.f53868c;
    }

    public final long A() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 3;
        long j13 = ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
        this.f53807b = i13 + 4;
        return (bArr[i14] & 255) | j13;
    }

    public final int B() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 2;
        int i15 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
        this.f53807b = i13 + 3;
        return (bArr[i14] & 255) | i15;
    }

    public final int C() {
        int k13 = k();
        if (k13 >= 0) {
            return k13;
        }
        throw new IllegalStateException(a.a.d("Top bit not zero: ", k13));
    }

    public final long D() {
        long s13 = s();
        if (s13 >= 0) {
            return s13;
        }
        throw new IllegalStateException(a.a.g("Top bit not zero: ", s13));
    }

    public final int E() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 1;
        int i15 = (bArr[i13] & 255) << 8;
        this.f53807b = i13 + 2;
        return (bArr[i14] & 255) | i15;
    }

    public final long F() {
        int i13;
        int i14;
        long j13 = this.f53806a[this.f53807b];
        int i15 = 7;
        while (true) {
            if (i15 < 0) {
                break;
            }
            if (((1 << i15) & j13) != 0) {
                i15--;
            } else if (i15 < 6) {
                j13 &= r6 - 1;
                i14 = 7 - i15;
            } else if (i15 == 7) {
                i14 = 1;
            }
        }
        i14 = 0;
        if (i14 == 0) {
            throw new NumberFormatException(a.a.g("Invalid UTF-8 sequence first byte: ", j13));
        }
        for (i13 = 1; i13 < i14; i13++) {
            if ((this.f53806a[this.f53807b + i13] & 192) != 128) {
                throw new NumberFormatException(a.a.g("Invalid UTF-8 sequence continuation byte: ", j13));
            }
            j13 = (j13 << 6) | (r3 & 63);
        }
        this.f53807b += i14;
        return j13;
    }

    public final Charset G() {
        if (a() >= 3) {
            byte[] bArr = this.f53806a;
            int i13 = this.f53807b;
            if (bArr[i13] == -17 && bArr[i13 + 1] == -69 && bArr[i13 + 2] == -65) {
                this.f53807b = i13 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f53806a;
        int i14 = this.f53807b;
        byte b13 = bArr2[i14];
        if (b13 == -2 && bArr2[i14 + 1] == -1) {
            this.f53807b = i14 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b13 != -1 || bArr2[i14 + 1] != -2) {
            return null;
        }
        this.f53807b = i14 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void H(int i13) {
        byte[] bArr = this.f53806a;
        if (bArr.length < i13) {
            bArr = new byte[i13];
        }
        I(i13, bArr);
    }

    public final void I(int i13, byte[] bArr) {
        this.f53806a = bArr;
        this.f53808c = i13;
        this.f53807b = 0;
    }

    public final void J(int i13) {
        bf.b.i(i13 >= 0 && i13 <= this.f53806a.length);
        this.f53808c = i13;
    }

    public final void K(int i13) {
        bf.b.i(i13 >= 0 && i13 <= this.f53808c);
        this.f53807b = i13;
    }

    public final void L(int i13) {
        K(this.f53807b + i13);
    }

    public final int a() {
        return this.f53808c - this.f53807b;
    }

    public final void b(int i13) {
        byte[] bArr = this.f53806a;
        if (i13 > bArr.length) {
            this.f53806a = Arrays.copyOf(bArr, i13);
        }
    }

    public final byte[] c() {
        return this.f53806a;
    }

    public final int d() {
        return this.f53807b;
    }

    public final int e() {
        return this.f53808c;
    }

    public final char f(Charset charset) {
        bf.b.h("Unsupported charset: " + charset, f53805f.contains(charset));
        return (char) (g(charset) >> 16);
    }

    public final int g(Charset charset) {
        byte b13;
        byte b14 = 0;
        int i13 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b13 = this.f53806a[this.f53807b];
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f53806a;
                int i14 = this.f53807b;
                b14 = bArr[i14];
                b13 = bArr[i14 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f53806a;
                int i15 = this.f53807b;
                b14 = bArr2[i15 + 1];
                b13 = bArr2[i15];
            }
            i13 = 2;
        }
        return ((b13 & 255) << 16) | (b14 << 24) | (i13 & 255);
    }

    public final int h() {
        return this.f53806a[this.f53807b] & 255;
    }

    public final void i(byte[] bArr, int i13, int i14) {
        System.arraycopy(this.f53806a, this.f53807b, bArr, i13, i14);
        this.f53807b += i14;
    }

    public final char j(Charset charset, char[] cArr) {
        int g13 = g(charset);
        if (g13 == 0) {
            return (char) 0;
        }
        char c13 = (char) (g13 >> 16);
        if (!l9.g(c13, cArr)) {
            return (char) 0;
        }
        this.f53807b += g13 & 65535;
        return c13;
    }

    public final int k() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13] & 255) << 24);
        int i15 = i13 + 3;
        int i16 = i14 | ((bArr[i13 + 2] & 255) << 8);
        this.f53807b = i13 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public final String l(Charset charset) {
        int i13;
        bf.b.h("Unsupported charset: " + charset, f53805f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            G();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i13 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i13 = 2;
        }
        int i14 = this.f53807b;
        while (true) {
            int i15 = this.f53808c;
            if (i14 >= i15 - (i13 - 1)) {
                i14 = i15;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && n0.T(this.f53806a[i14])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f53806a;
                if (bArr[i14] == 0 && n0.T(bArr[i14 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f53806a;
                if (bArr2[i14 + 1] == 0 && n0.T(bArr2[i14])) {
                    break;
                }
            }
            i14 += i13;
        }
        String w13 = w(i14 - this.f53807b, charset);
        if (this.f53807b != this.f53808c && j(charset, f53803d) == '\r') {
            j(charset, f53804e);
        }
        return w13;
    }

    public final int m() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = ((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255);
        int i15 = i13 + 3;
        int i16 = i14 | ((bArr[i13 + 2] & 255) << 16);
        this.f53807b = i13 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long n() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 7;
        long j13 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
        this.f53807b = i13 + 8;
        return ((bArr[i14] & 255) << 56) | j13;
    }

    public final short o() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 1;
        int i15 = bArr[i13] & 255;
        this.f53807b = i13 + 2;
        return (short) (((bArr[i14] & 255) << 8) | i15);
    }

    public final long p() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 3;
        long j13 = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        this.f53807b = i13 + 4;
        return ((bArr[i14] & 255) << 24) | j13;
    }

    public final int q() {
        int m13 = m();
        if (m13 >= 0) {
            return m13;
        }
        throw new IllegalStateException(a.a.d("Top bit not zero: ", m13));
    }

    public final int r() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 1;
        int i15 = bArr[i13] & 255;
        this.f53807b = i13 + 2;
        return ((bArr[i14] & 255) << 8) | i15;
    }

    public final long s() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 7;
        long j13 = ((bArr[i13] & 255) << 56) | ((bArr[i13 + 1] & 255) << 48) | ((bArr[i13 + 2] & 255) << 40) | ((bArr[i13 + 3] & 255) << 32) | ((bArr[i13 + 4] & 255) << 24) | ((bArr[i13 + 5] & 255) << 16) | ((bArr[i13 + 6] & 255) << 8);
        this.f53807b = i13 + 8;
        return (bArr[i14] & 255) | j13;
    }

    public final String t() {
        if (a() == 0) {
            return null;
        }
        int i13 = this.f53807b;
        while (i13 < this.f53808c && this.f53806a[i13] != 0) {
            i13++;
        }
        byte[] bArr = this.f53806a;
        int i14 = this.f53807b;
        int i15 = n0.f53866a;
        String str = new String(bArr, i14, i13 - i14, StandardCharsets.UTF_8);
        this.f53807b = i13;
        if (i13 < this.f53808c) {
            this.f53807b = i13 + 1;
        }
        return str;
    }

    public final String u(int i13) {
        if (i13 == 0) {
            return "";
        }
        int i14 = this.f53807b;
        int i15 = (i14 + i13) - 1;
        int i16 = (i15 >= this.f53808c || this.f53806a[i15] != 0) ? i13 : i13 - 1;
        byte[] bArr = this.f53806a;
        int i17 = n0.f53866a;
        String str = new String(bArr, i14, i16, StandardCharsets.UTF_8);
        this.f53807b += i13;
        return str;
    }

    public final short v() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = i13 + 1;
        int i15 = (bArr[i13] & 255) << 8;
        this.f53807b = i13 + 2;
        return (short) ((bArr[i14] & 255) | i15);
    }

    public final String w(int i13, Charset charset) {
        String str = new String(this.f53806a, this.f53807b, i13, charset);
        this.f53807b += i13;
        return str;
    }

    public final int x() {
        return (y() << 21) | (y() << 14) | (y() << 7) | y();
    }

    public final int y() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        this.f53807b = i13 + 1;
        return bArr[i13] & 255;
    }

    public final int z() {
        byte[] bArr = this.f53806a;
        int i13 = this.f53807b;
        int i14 = (bArr[i13 + 1] & 255) | ((bArr[i13] & 255) << 8);
        this.f53807b = i13 + 4;
        return i14;
    }

    public d0(int i13) {
        this.f53806a = new byte[i13];
        this.f53808c = i13;
    }

    public d0(byte[] bArr) {
        this.f53806a = bArr;
        this.f53808c = bArr.length;
    }

    public d0(byte[] bArr, int i13) {
        this.f53806a = bArr;
        this.f53808c = i13;
    }
}
