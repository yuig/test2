package ads_mobile_sdk;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kp.n;

/* loaded from: classes2.dex */
public final class ho extends io {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f6028d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6029e;

    /* renamed from: f, reason: collision with root package name */
    public int f6030f;

    /* renamed from: g, reason: collision with root package name */
    public int f6031g;

    /* renamed from: h, reason: collision with root package name */
    public int f6032h;

    /* renamed from: i, reason: collision with root package name */
    public int f6033i;

    /* renamed from: j, reason: collision with root package name */
    public int f6034j;

    /* renamed from: k, reason: collision with root package name */
    public int f6035k = Integer.MAX_VALUE;

    public ho(InputStream inputStream) {
        hw0.a(inputStream, "input");
        this.f6028d = inputStream;
        this.f6029e = new byte[4096];
        this.f6030f = 0;
        this.f6032h = 0;
        this.f6034j = 0;
    }

    @Override // ads_mobile_sdk.io
    public final void a(int i13) {
        if (this.f6033i != i13) {
            throw new e21("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // ads_mobile_sdk.io
    public final boolean b() {
        return this.f6032h == this.f6030f && !l(1);
    }

    @Override // ads_mobile_sdk.io
    public final void c(int i13) {
        this.f6035k = i13;
        z();
    }

    @Override // ads_mobile_sdk.io
    public final int d(int i13) {
        if (i13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f6034j + this.f6032h + i13;
        if (i14 < 0) {
            throw new e21("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i15 = this.f6035k;
        if (i14 > i15) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f6035k = i14;
        z();
        return i15;
    }

    @Override // ads_mobile_sdk.io
    public final double e() {
        return Double.longBitsToDouble(w());
    }

    @Override // ads_mobile_sdk.io
    public final int f() {
        return x();
    }

    @Override // ads_mobile_sdk.io
    public final int g() {
        return v();
    }

    @Override // ads_mobile_sdk.io
    public final long h() {
        return w();
    }

    @Override // ads_mobile_sdk.io
    public final float i() {
        return Float.intBitsToFloat(v());
    }

    @Override // ads_mobile_sdk.io
    public final int j() {
        return x();
    }

    @Override // ads_mobile_sdk.io
    public final long k() {
        return y();
    }

    @Override // ads_mobile_sdk.io
    public final int l() {
        return v();
    }

    @Override // ads_mobile_sdk.io
    public final long m() {
        return w();
    }

    @Override // ads_mobile_sdk.io
    public final int n() {
        return io.b(x());
    }

    @Override // ads_mobile_sdk.io
    public final long o() {
        return io.a(y());
    }

    @Override // ads_mobile_sdk.io
    public final String p() {
        int x13 = x();
        if (x13 > 0) {
            int i13 = this.f6030f;
            int i14 = this.f6032h;
            if (x13 <= i13 - i14) {
                String str = new String(this.f6029e, i14, x13, hw0.f6126a);
                this.f6032h += x13;
                return str;
            }
        }
        if (x13 == 0) {
            return "";
        }
        if (x13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (x13 > this.f6030f) {
            return new String(f(x13), hw0.f6126a);
        }
        i(x13);
        String str2 = new String(this.f6029e, this.f6032h, x13, hw0.f6126a);
        this.f6032h += x13;
        return str2;
    }

    @Override // ads_mobile_sdk.io
    public final String q() {
        byte[] f13;
        int x13 = x();
        int i13 = this.f6032h;
        int i14 = this.f6030f;
        if (x13 <= i14 - i13 && x13 > 0) {
            f13 = this.f6029e;
            this.f6032h = i13 + x13;
        } else {
            if (x13 == 0) {
                return "";
            }
            if (x13 < 0) {
                throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i13 = 0;
            if (x13 <= i14) {
                i(x13);
                f13 = this.f6029e;
                this.f6032h = x13;
            } else {
                f13 = f(x13);
            }
        }
        return rx2.f10845a.c(f13, i13, x13);
    }

    @Override // ads_mobile_sdk.io
    public final int r() {
        if (b()) {
            this.f6033i = 0;
            return 0;
        }
        int x13 = x();
        this.f6033i = x13;
        if ((x13 >>> 3) != 0) {
            return x13;
        }
        throw new e21("Protocol message contained an invalid tag (zero).");
    }

    @Override // ads_mobile_sdk.io
    public final int s() {
        return x();
    }

    @Override // ads_mobile_sdk.io
    public final long t() {
        return y();
    }

    public final int v() {
        int i13 = this.f6032h;
        if (this.f6030f - i13 < 4) {
            i(4);
            i13 = this.f6032h;
        }
        byte[] bArr = this.f6029e;
        this.f6032h = i13 + 4;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long w() {
        int i13 = this.f6032h;
        if (this.f6030f - i13 < 8) {
            i(8);
            i13 = this.f6032h;
        }
        byte[] bArr = this.f6029e;
        this.f6032h = i13 + 8;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int x() {
        int i13;
        int i14 = this.f6032h;
        int i15 = this.f6030f;
        if (i15 != i14) {
            byte[] bArr = this.f6029e;
            int i16 = i14 + 1;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f6032h = i16;
                return b13;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                int i18 = (bArr[i16] << 7) ^ b13;
                if (i18 < 0) {
                    i13 = i18 ^ (-128);
                } else {
                    int i19 = i14 + 3;
                    int i23 = (bArr[i17] << 14) ^ i18;
                    if (i23 >= 0) {
                        i13 = i23 ^ 16256;
                    } else {
                        int i24 = i14 + 4;
                        int i25 = i23 ^ (bArr[i19] << 21);
                        if (i25 < 0) {
                            i13 = (-2080896) ^ i25;
                            i17 = i24;
                        } else {
                            i19 = i14 + 5;
                            byte b14 = bArr[i24];
                            int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
                            if (b14 < 0) {
                                int i27 = i14 + 6;
                                if (bArr[i19] < 0) {
                                    i19 = i14 + 7;
                                    if (bArr[i27] < 0) {
                                        i27 = i14 + 8;
                                        if (bArr[i19] < 0) {
                                            i19 = i14 + 9;
                                            if (bArr[i27] < 0) {
                                                int i28 = i14 + 10;
                                                if (bArr[i19] >= 0) {
                                                    i19 = i28;
                                                }
                                            }
                                        }
                                    }
                                }
                                i19 = i27;
                            }
                            i13 = i26;
                        }
                    }
                    i17 = i19;
                }
                this.f6032h = i17;
                return i13;
            }
        }
        long j13 = 0;
        for (int i29 = 0; i29 < 64; i29 += 7) {
            if (this.f6032h == this.f6030f) {
                i(1);
            }
            byte[] bArr2 = this.f6029e;
            int i33 = this.f6032h;
            this.f6032h = i33 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i29;
            if ((bArr2[i33] & 128) == 0) {
                return (int) j13;
            }
        }
        throw new e21("CodedInputStream encountered a malformed varint.");
    }

    public final long y() {
        long j13;
        long j14;
        long j15;
        int i13 = this.f6032h;
        int i14 = this.f6030f;
        long j16 = 0;
        if (i14 != i13) {
            byte[] bArr = this.f6029e;
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f6032h = i15;
                return b13;
            }
            if (i14 - i15 >= 9) {
                int i16 = i13 + 2;
                int i17 = (bArr[i15] << 7) ^ b13;
                if (i17 < 0) {
                    j13 = i17 ^ (-128);
                } else {
                    int i18 = i13 + 3;
                    int i19 = (bArr[i16] << 14) ^ i17;
                    if (i19 >= 0) {
                        j13 = i19 ^ 16256;
                        i16 = i18;
                    } else {
                        int i23 = i13 + 4;
                        int i24 = i19 ^ (bArr[i18] << 21);
                        if (i24 < 0) {
                            j13 = (-2080896) ^ i24;
                            i16 = i23;
                        } else {
                            long j17 = i24;
                            i16 = i13 + 5;
                            long j18 = j17 ^ (bArr[i23] << 28);
                            if (j18 >= 0) {
                                j15 = 266354560;
                            } else {
                                int i25 = i13 + 6;
                                long j19 = j18 ^ (bArr[i16] << 35);
                                if (j19 < 0) {
                                    j14 = -34093383808L;
                                } else {
                                    i16 = i13 + 7;
                                    j18 = j19 ^ (bArr[i25] << 42);
                                    if (j18 >= 0) {
                                        j15 = 4363953127296L;
                                    } else {
                                        i25 = i13 + 8;
                                        j19 = j18 ^ (bArr[i16] << 49);
                                        if (j19 < 0) {
                                            j14 = -558586000294016L;
                                        } else {
                                            i16 = i13 + 9;
                                            long j23 = (j19 ^ (bArr[i25] << 56)) ^ 71499008037633920L;
                                            if (j23 < 0) {
                                                int i26 = i13 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i16 = i26;
                                                }
                                            }
                                            j13 = j23;
                                        }
                                    }
                                }
                                j13 = j19 ^ j14;
                                i16 = i25;
                            }
                            j13 = j15 ^ j18;
                        }
                    }
                }
                this.f6032h = i16;
                return j13;
            }
        }
        for (int i27 = 0; i27 < 64; i27 += 7) {
            if (this.f6032h == this.f6030f) {
                i(1);
            }
            byte[] bArr2 = this.f6029e;
            int i28 = this.f6032h;
            this.f6032h = i28 + 1;
            j16 |= (r1 & Byte.MAX_VALUE) << i27;
            if ((bArr2[i28] & 128) == 0) {
                return j16;
            }
        }
        throw new e21("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i13 = this.f6030f + this.f6031g;
        this.f6030f = i13;
        int i14 = this.f6034j + i13;
        int i15 = this.f6035k;
        if (i14 <= i15) {
            this.f6031g = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f6031g = i16;
        this.f6030f = i13 - i16;
    }

    @Override // ads_mobile_sdk.io
    public final boolean e(int i13) {
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            if (this.f6030f - this.f6032h >= 10) {
                while (i15 < 10) {
                    byte[] bArr = this.f6029e;
                    int i16 = this.f6032h;
                    this.f6032h = i16 + 1;
                    if (bArr[i16] < 0) {
                        i15++;
                    }
                }
                throw new e21("CodedInputStream encountered a malformed varint.");
            }
            while (i15 < 10) {
                if (this.f6032h == this.f6030f) {
                    i(1);
                }
                byte[] bArr2 = this.f6029e;
                int i17 = this.f6032h;
                this.f6032h = i17 + 1;
                if (bArr2[i17] < 0) {
                    i15++;
                }
            }
            throw new e21("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i14 == 1) {
            j(8);
            return true;
        }
        if (i14 == 2) {
            j(x());
            return true;
        }
        if (i14 == 3) {
            u();
            a(((i13 >>> 3) << 3) | 4);
            return true;
        }
        if (i14 == 4) {
            if (this.f6508b == 0) {
                a(0);
            }
            return false;
        }
        if (i14 == 5) {
            j(4);
            return true;
        }
        int i18 = e21.f4580b;
        throw new d21();
    }

    public final byte[] f(int i13) {
        byte[] g13 = g(i13);
        if (g13 != null) {
            return g13;
        }
        int i14 = this.f6032h;
        int i15 = this.f6030f;
        int i16 = i15 - i14;
        this.f6034j += i15;
        this.f6032h = 0;
        this.f6030f = 0;
        ArrayList h10 = h(i13 - i16);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f6029e, i14, bArr, 0, i16);
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i16, bArr2.length);
            i16 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] g(int i13) {
        if (i13 == 0) {
            return hw0.f6127b;
        }
        if (i13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f6034j;
        int i15 = this.f6032h;
        int i16 = i14 + i15 + i13;
        if (i16 - Integer.MAX_VALUE > 0) {
            throw new e21("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i17 = this.f6035k;
        if (i16 > i17) {
            j((i17 - i14) - i15);
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i18 = this.f6030f - i15;
        int i19 = i13 - i18;
        if (i19 >= 4096) {
            try {
                if (i19 > this.f6028d.available()) {
                    return null;
                }
            } catch (e21 e13) {
                e13.f4581a = true;
                throw e13;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f6029e, this.f6032h, bArr, 0, i18);
        this.f6034j += this.f6030f;
        this.f6032h = 0;
        this.f6030f = 0;
        while (i18 < i13) {
            try {
                int read = this.f6028d.read(bArr, i18, i13 - i18);
                if (read == -1) {
                    throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f6034j += read;
                i18 += read;
            } catch (e21 e14) {
                e14.f4581a = true;
                throw e14;
            }
        }
        return bArr;
    }

    public final ArrayList h(int i13) {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int min = Math.min(i13, 4096);
            byte[] bArr = new byte[min];
            int i14 = 0;
            while (i14 < min) {
                int read = this.f6028d.read(bArr, i14, min - i14);
                if (read == -1) {
                    throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f6034j += read;
                i14 += read;
            }
            i13 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void i(int i13) {
        if (l(i13)) {
            return;
        }
        if (i13 <= (Integer.MAX_VALUE - this.f6034j) - this.f6032h) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new e21("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void j(int i13) {
        int i14 = this.f6030f;
        int i15 = this.f6032h;
        if (i13 > i14 - i15 || i13 < 0) {
            k(i13);
        } else {
            this.f6032h = i15 + i13;
        }
    }

    public final void k(int i13) {
        if (i13 < 0) {
            throw e21.b();
        }
        int i14 = this.f6034j;
        int i15 = this.f6032h;
        int i16 = i14 + i15;
        int i17 = i16 + i13;
        int i18 = this.f6035k;
        if (i17 > i18) {
            j((i18 - i14) - i15);
            throw e21.d();
        }
        this.f6034j = i16;
        int i19 = this.f6030f - i15;
        this.f6030f = 0;
        this.f6032h = 0;
        while (i19 < i13) {
            try {
                long j13 = i13 - i19;
                try {
                    long skip = this.f6028d.skip(j13);
                    if (skip < 0 || skip > j13) {
                        throw new IllegalStateException(String.valueOf(this.f6028d.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i19 += (int) skip;
                    }
                } catch (e21 e13) {
                    e13.f4581a = true;
                    throw e13;
                }
            } catch (Throwable th3) {
                this.f6034j += i19;
                z();
                throw th3;
            }
        }
        this.f6034j += i19;
        z();
        if (i19 >= i13) {
            return;
        }
        int i23 = this.f6030f;
        int i24 = i23 - this.f6032h;
        this.f6032h = i23;
        i(1);
        while (true) {
            int i25 = i13 - i24;
            int i26 = this.f6030f;
            if (i25 <= i26) {
                this.f6032h = i25;
                return;
            } else {
                i24 += i26;
                this.f6032h = i26;
                i(1);
            }
        }
    }

    public final boolean l(int i13) {
        int i14 = this.f6032h;
        int i15 = i14 + i13;
        int i16 = this.f6030f;
        if (i15 <= i16) {
            throw new IllegalStateException(a.a.e("refillBuffer() called when ", i13, " bytes were already available in buffer"));
        }
        int i17 = this.f6034j;
        if (i13 > (Integer.MAX_VALUE - i17) - i14 || i17 + i14 + i13 > this.f6035k) {
            return false;
        }
        if (i14 > 0) {
            if (i16 > i14) {
                byte[] bArr = this.f6029e;
                System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
            }
            this.f6034j += i14;
            this.f6030f -= i14;
            this.f6032h = 0;
        }
        InputStream inputStream = this.f6028d;
        byte[] bArr2 = this.f6029e;
        int i18 = this.f6030f;
        try {
            int read = inputStream.read(bArr2, i18, Math.min(bArr2.length - i18, (Integer.MAX_VALUE - this.f6034j) - i18));
            if (read == 0 || read < -1 || read > this.f6029e.length) {
                throw new IllegalStateException(String.valueOf(this.f6028d.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f6030f += read;
            z();
            if (this.f6030f >= i13) {
                return true;
            }
            return l(i13);
        } catch (e21 e13) {
            e13.f4581a = true;
            throw e13;
        }
    }

    @Override // ads_mobile_sdk.io
    public final boolean c() {
        return y() != 0;
    }

    @Override // ads_mobile_sdk.io
    public final int a() {
        return this.f6034j + this.f6032h;
    }

    @Override // ads_mobile_sdk.io
    public final gl d() {
        int x13 = x();
        int i13 = this.f6030f;
        int i14 = this.f6032h;
        if (x13 <= i13 - i14 && x13 > 0) {
            byte[] bArr = this.f6029e;
            gl glVar = il.f6431b;
            il.a(i14, i14 + x13, bArr.length);
            gl glVar2 = new gl(((n) il.f6432c).I(bArr, i14, x13));
            this.f6032h += x13;
            return glVar2;
        }
        if (x13 == 0) {
            return il.f6431b;
        }
        if (x13 >= 0) {
            byte[] g13 = g(x13);
            if (g13 != null) {
                return il.a(g13);
            }
            int i15 = this.f6032h;
            int i16 = this.f6030f;
            int i17 = i16 - i15;
            this.f6034j += i16;
            this.f6032h = 0;
            this.f6030f = 0;
            ArrayList h10 = h(x13 - i17);
            byte[] bArr2 = new byte[x13];
            System.arraycopy(this.f6029e, i15, bArr2, 0, i17);
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i17, bArr3.length);
                i17 += bArr3.length;
            }
            gl glVar3 = il.f6431b;
            return new gl(bArr2);
        }
        throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
