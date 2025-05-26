package ads_mobile_sdk;

import java.util.Arrays;
import kp.n;

/* loaded from: classes2.dex */
public final class fo extends io {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5218d;

    /* renamed from: e, reason: collision with root package name */
    public int f5219e;

    /* renamed from: f, reason: collision with root package name */
    public int f5220f;

    /* renamed from: g, reason: collision with root package name */
    public int f5221g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5222h;

    /* renamed from: i, reason: collision with root package name */
    public int f5223i;

    /* renamed from: j, reason: collision with root package name */
    public int f5224j = Integer.MAX_VALUE;

    public fo(byte[] bArr, int i13, int i14, boolean z13) {
        this.f5218d = bArr;
        this.f5219e = i14 + i13;
        this.f5221g = i13;
        this.f5222h = i13;
    }

    @Override // ads_mobile_sdk.io
    public final void a(int i13) {
        if (this.f5223i != i13) {
            throw new e21("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // ads_mobile_sdk.io
    public final boolean b() {
        return this.f5221g == this.f5219e;
    }

    @Override // ads_mobile_sdk.io
    public final void c(int i13) {
        this.f5224j = i13;
        int i14 = this.f5219e + this.f5220f;
        this.f5219e = i14;
        int i15 = i14 - this.f5222h;
        if (i15 <= i13) {
            this.f5220f = 0;
            return;
        }
        int i16 = i15 - i13;
        this.f5220f = i16;
        this.f5219e = i14 - i16;
    }

    @Override // ads_mobile_sdk.io
    public final int d(int i13) {
        if (i13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f5221g;
        int i15 = this.f5222h;
        int i16 = (i14 - i15) + i13;
        if (i16 < 0) {
            throw new e21("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i17 = this.f5224j;
        if (i16 > i17) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5224j = i16;
        int i18 = this.f5219e + this.f5220f;
        this.f5219e = i18;
        int i19 = i18 - i15;
        if (i19 > i16) {
            int i23 = i19 - i16;
            this.f5220f = i23;
            this.f5219e = i18 - i23;
        } else {
            this.f5220f = 0;
        }
        return i17;
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
            int i13 = this.f5219e;
            int i14 = this.f5221g;
            if (x13 <= i13 - i14) {
                String str = new String(this.f5218d, i14, x13, hw0.f6126a);
                this.f5221g += x13;
                return str;
            }
        }
        if (x13 == 0) {
            return "";
        }
        if (x13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // ads_mobile_sdk.io
    public final String q() {
        int x13 = x();
        if (x13 > 0) {
            int i13 = this.f5219e;
            int i14 = this.f5221g;
            if (x13 <= i13 - i14) {
                String c13 = rx2.f10845a.c(this.f5218d, i14, x13);
                this.f5221g += x13;
                return c13;
            }
        }
        if (x13 == 0) {
            return "";
        }
        if (x13 <= 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // ads_mobile_sdk.io
    public final int r() {
        if (b()) {
            this.f5223i = 0;
            return 0;
        }
        int x13 = x();
        this.f5223i = x13;
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
        int i13 = this.f5221g;
        if (this.f5219e - i13 < 4) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f5218d;
        this.f5221g = i13 + 4;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long w() {
        int i13 = this.f5221g;
        if (this.f5219e - i13 < 8) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f5218d;
        this.f5221g = i13 + 8;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int x() {
        int i13;
        int i14 = this.f5221g;
        int i15 = this.f5219e;
        if (i15 != i14) {
            byte[] bArr = this.f5218d;
            int i16 = i14 + 1;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f5221g = i16;
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
                this.f5221g = i17;
                return i13;
            }
        }
        long j13 = 0;
        for (int i29 = 0; i29 < 64; i29 += 7) {
            int i33 = this.f5221g;
            if (i33 == this.f5219e) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f5218d;
            this.f5221g = i33 + 1;
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
        int i13 = this.f5221g;
        int i14 = this.f5219e;
        long j16 = 0;
        if (i14 != i13) {
            byte[] bArr = this.f5218d;
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f5221g = i15;
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
                this.f5221g = i16;
                return j13;
            }
        }
        for (int i27 = 0; i27 < 64; i27 += 7) {
            int i28 = this.f5221g;
            if (i28 == this.f5219e) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f5218d;
            this.f5221g = i28 + 1;
            j16 |= (r1 & Byte.MAX_VALUE) << i27;
            if ((bArr2[i28] & 128) == 0) {
                return j16;
            }
        }
        throw new e21("CodedInputStream encountered a malformed varint.");
    }

    @Override // ads_mobile_sdk.io
    public final boolean e(int i13) {
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            if (this.f5219e - this.f5221g >= 10) {
                while (i15 < 10) {
                    byte[] bArr = this.f5218d;
                    int i16 = this.f5221g;
                    this.f5221g = i16 + 1;
                    if (bArr[i16] < 0) {
                        i15++;
                    }
                }
                throw new e21("CodedInputStream encountered a malformed varint.");
            }
            while (i15 < 10) {
                int i17 = this.f5221g;
                if (i17 == this.f5219e) {
                    throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f5218d;
                this.f5221g = i17 + 1;
                if (bArr2[i17] < 0) {
                    i15++;
                }
            }
            throw new e21("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i14 == 1) {
            f(8);
            return true;
        }
        if (i14 == 2) {
            f(x());
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
            f(4);
            return true;
        }
        int i18 = e21.f4580b;
        throw new d21();
    }

    public final void f(int i13) {
        if (i13 >= 0) {
            int i14 = this.f5219e;
            int i15 = this.f5221g;
            if (i13 <= i14 - i15) {
                this.f5221g = i15 + i13;
                return;
            }
        }
        if (i13 >= 0) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // ads_mobile_sdk.io
    public final int a() {
        return this.f5221g - this.f5222h;
    }

    @Override // ads_mobile_sdk.io
    public final boolean c() {
        return y() != 0;
    }

    @Override // ads_mobile_sdk.io
    public final gl d() {
        byte[] bArr;
        int x13 = x();
        if (x13 > 0) {
            int i13 = this.f5219e;
            int i14 = this.f5221g;
            if (x13 <= i13 - i14) {
                byte[] bArr2 = this.f5218d;
                gl glVar = il.f6431b;
                il.a(i14, i14 + x13, bArr2.length);
                gl glVar2 = new gl(((n) il.f6432c).I(bArr2, i14, x13));
                this.f5221g += x13;
                return glVar2;
            }
        }
        if (x13 == 0) {
            return il.f6431b;
        }
        if (x13 > 0) {
            int i15 = this.f5219e;
            int i16 = this.f5221g;
            if (x13 <= i15 - i16) {
                int i17 = x13 + i16;
                this.f5221g = i17;
                bArr = Arrays.copyOfRange(this.f5218d, i16, i17);
                gl glVar3 = il.f6431b;
                return new gl(bArr);
            }
        }
        if (x13 > 0) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (x13 == 0) {
            bArr = hw0.f6127b;
            gl glVar32 = il.f6431b;
            return new gl(bArr);
        }
        throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
