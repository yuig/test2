package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f18089e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f18090f;

    /* renamed from: g, reason: collision with root package name */
    public int f18091g;

    /* renamed from: h, reason: collision with root package name */
    public int f18092h;

    /* renamed from: i, reason: collision with root package name */
    public int f18093i;

    /* renamed from: j, reason: collision with root package name */
    public int f18094j;

    /* renamed from: k, reason: collision with root package name */
    public int f18095k;

    /* renamed from: l, reason: collision with root package name */
    public int f18096l = Integer.MAX_VALUE;

    public l(FileInputStream fileInputStream) {
        Charset charset = j0.f18080a;
        this.f18089e = fileInputStream;
        this.f18090f = new byte[4096];
        this.f18091g = 0;
        this.f18093i = 0;
        this.f18095k = 0;
    }

    public final ArrayList A(int i13) {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int min = Math.min(i13, 4096);
            byte[] bArr = new byte[min];
            int i14 = 0;
            while (i14 < min) {
                int read = this.f18089e.read(bArr, i14, min - i14);
                if (read == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f18095k += read;
                i14 += read;
            }
            i13 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i13 = this.f18093i;
        if (this.f18091g - i13 < 4) {
            H(4);
            i13 = this.f18093i;
        }
        this.f18093i = i13 + 4;
        byte[] bArr = this.f18090f;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long C() {
        int i13 = this.f18093i;
        if (this.f18091g - i13 < 8) {
            H(8);
            i13 = this.f18093i;
        }
        this.f18093i = i13 + 8;
        byte[] bArr = this.f18090f;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int D() {
        int i13;
        int i14 = this.f18093i;
        int i15 = this.f18091g;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f18090f;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f18093i = i16;
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
                        } else {
                            i19 = i14 + 5;
                            byte b14 = bArr[i24];
                            int i26 = (i25 ^ (b14 << 28)) ^ 266354560;
                            if (b14 < 0) {
                                i24 = i14 + 6;
                                if (bArr[i19] < 0) {
                                    i19 = i14 + 7;
                                    if (bArr[i24] < 0) {
                                        i24 = i14 + 8;
                                        if (bArr[i19] < 0) {
                                            i19 = i14 + 9;
                                            if (bArr[i24] < 0) {
                                                int i27 = i14 + 10;
                                                if (bArr[i19] >= 0) {
                                                    i17 = i27;
                                                    i13 = i26;
                                                }
                                            }
                                        }
                                    }
                                }
                                i13 = i26;
                            }
                            i13 = i26;
                        }
                        i17 = i24;
                    }
                    i17 = i19;
                }
                this.f18093i = i17;
                return i13;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j13;
        long j14;
        long j15;
        long j16;
        int i13 = this.f18093i;
        int i14 = this.f18091g;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f18090f;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f18093i = i15;
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
                            j16 = (-2080896) ^ i24;
                        } else {
                            long j17 = i24;
                            i16 = i13 + 5;
                            long j18 = j17 ^ (bArr[i23] << 28);
                            if (j18 >= 0) {
                                j15 = 266354560;
                            } else {
                                i23 = i13 + 6;
                                long j19 = j18 ^ (bArr[i16] << 35);
                                if (j19 < 0) {
                                    j14 = -34093383808L;
                                } else {
                                    i16 = i13 + 7;
                                    j18 = j19 ^ (bArr[i23] << 42);
                                    if (j18 >= 0) {
                                        j15 = 4363953127296L;
                                    } else {
                                        i23 = i13 + 8;
                                        j19 = j18 ^ (bArr[i16] << 49);
                                        if (j19 < 0) {
                                            j14 = -558586000294016L;
                                        } else {
                                            i16 = i13 + 9;
                                            long j23 = (j19 ^ (bArr[i23] << 56)) ^ 71499008037633920L;
                                            if (j23 < 0) {
                                                int i25 = i13 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i16 = i25;
                                                }
                                            }
                                            j13 = j23;
                                        }
                                    }
                                }
                                j16 = j14 ^ j19;
                            }
                            j13 = j15 ^ j18;
                        }
                        i16 = i23;
                        j13 = j16;
                    }
                }
                this.f18093i = i16;
                return j13;
            }
        }
        return F();
    }

    public final long F() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f18093i == this.f18091g) {
                H(1);
            }
            int i14 = this.f18093i;
            this.f18093i = i14 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((this.f18090f[i14] & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void G() {
        int i13 = this.f18091g + this.f18092h;
        this.f18091g = i13;
        int i14 = this.f18095k + i13;
        int i15 = this.f18096l;
        if (i14 <= i15) {
            this.f18092h = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f18092h = i16;
        this.f18091g = i13 - i16;
    }

    public final void H(int i13) {
        if (J(i13)) {
            return;
        }
        if (i13 <= (this.f18105c - this.f18095k) - this.f18093i) {
            throw InvalidProtocolBufferException.h();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void I(int i13) {
        int i14 = this.f18091g;
        int i15 = this.f18093i;
        if (i13 <= i14 - i15 && i13 >= 0) {
            this.f18093i = i15 + i13;
            return;
        }
        InputStream inputStream = this.f18089e;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i16 = this.f18095k;
        int i17 = i16 + i15;
        int i18 = i17 + i13;
        int i19 = this.f18096l;
        if (i18 > i19) {
            I((i19 - i16) - i15);
            throw InvalidProtocolBufferException.h();
        }
        this.f18095k = i17;
        int i23 = i14 - i15;
        this.f18091g = 0;
        this.f18093i = 0;
        while (i23 < i13) {
            long j13 = i13 - i23;
            try {
                long skip = inputStream.skip(j13);
                if (skip < 0 || skip > j13) {
                    throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                }
                if (skip == 0) {
                    break;
                } else {
                    i23 += (int) skip;
                }
            } finally {
                this.f18095k += i23;
                G();
            }
        }
        if (i23 >= i13) {
            return;
        }
        int i24 = this.f18091g;
        int i25 = i24 - this.f18093i;
        this.f18093i = i24;
        H(1);
        while (true) {
            int i26 = i13 - i25;
            int i27 = this.f18091g;
            if (i26 <= i27) {
                this.f18093i = i26;
                return;
            } else {
                i25 += i27;
                this.f18093i = i27;
                H(1);
            }
        }
    }

    public final boolean J(int i13) {
        int i14 = this.f18093i;
        int i15 = i14 + i13;
        int i16 = this.f18091g;
        if (i15 <= i16) {
            throw new IllegalStateException(a.a.e("refillBuffer() called when ", i13, " bytes were already available in buffer"));
        }
        int i17 = this.f18095k;
        int i18 = this.f18105c;
        if (i13 > (i18 - i17) - i14 || i17 + i14 + i13 > this.f18096l) {
            return false;
        }
        byte[] bArr = this.f18090f;
        if (i14 > 0) {
            if (i16 > i14) {
                System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
            }
            this.f18095k += i14;
            this.f18091g -= i14;
            this.f18093i = 0;
        }
        int i19 = this.f18091g;
        int min = Math.min(bArr.length - i19, (i18 - this.f18095k) - i19);
        InputStream inputStream = this.f18089e;
        int read = inputStream.read(bArr, i19, min);
        if (read == 0 || read < -1 || read > bArr.length) {
            throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
        }
        if (read <= 0) {
            return false;
        }
        this.f18091g += read;
        G();
        if (this.f18091g >= i13) {
            return true;
        }
        return J(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void a(int i13) {
        if (this.f18094j != i13) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int b() {
        return this.f18095k + this.f18093i;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean c() {
        return this.f18093i == this.f18091g && !J(1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void d(int i13) {
        this.f18096l = i13;
        G();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int e(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i14 = this.f18095k + this.f18093i + i13;
        int i15 = this.f18096l;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.h();
        }
        this.f18096l = i14;
        G();
        return i15;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean f() {
        return E() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final j g() {
        int D = D();
        int i13 = this.f18091g;
        int i14 = this.f18093i;
        int i15 = i13 - i14;
        byte[] bArr = this.f18090f;
        if (D <= i15 && D > 0) {
            j d2 = i.d(bArr, i14, D);
            this.f18093i += D;
            return d2;
        }
        if (D == 0) {
            return i.f18075b;
        }
        byte[] z13 = z(D);
        if (z13 != null) {
            return i.d(z13, 0, z13.length);
        }
        int i16 = this.f18093i;
        int i17 = this.f18091g;
        int i18 = i17 - i16;
        this.f18095k += i17;
        this.f18093i = 0;
        this.f18091g = 0;
        ArrayList A = A(D - i18);
        byte[] bArr2 = new byte[D];
        System.arraycopy(bArr, i16, bArr2, 0, i18);
        Iterator it = A.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i18, bArr3.length);
            i18 += bArr3.length;
        }
        j jVar = i.f18075b;
        return new j(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int i() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int j() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long k() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int m() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int o() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long p() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int q() {
        int D = D();
        return (-(D & 1)) ^ (D >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long r() {
        long E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String s() {
        int D = D();
        byte[] bArr = this.f18090f;
        if (D > 0) {
            int i13 = this.f18091g;
            int i14 = this.f18093i;
            if (D <= i13 - i14) {
                String str = new String(bArr, i14, D, j0.f18080a);
                this.f18093i += D;
                return str;
            }
        }
        if (D == 0) {
            return "";
        }
        if (D > this.f18091g) {
            return new String(y(D), j0.f18080a);
        }
        H(D);
        String str2 = new String(bArr, this.f18093i, D, j0.f18080a);
        this.f18093i += D;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String t() {
        int D = D();
        int i13 = this.f18093i;
        int i14 = this.f18091g;
        int i15 = i14 - i13;
        byte[] bArr = this.f18090f;
        if (D <= i15 && D > 0) {
            this.f18093i = i13 + D;
        } else {
            if (D == 0) {
                return "";
            }
            i13 = 0;
            if (D <= i14) {
                H(D);
                this.f18093i = D;
            } else {
                bArr = y(D);
            }
        }
        return k2.f18088a.g(bArr, i13, D);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int u() {
        if (c()) {
            this.f18094j = 0;
            return 0;
        }
        int D = D();
        this.f18094j = D;
        if ((D >>> 3) != 0) {
            return D;
        }
        throw InvalidProtocolBufferException.b();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int v() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long w() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean x(int i13) {
        int u13;
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            int i16 = this.f18091g - this.f18093i;
            byte[] bArr = this.f18090f;
            if (i16 >= 10) {
                while (i15 < 10) {
                    int i17 = this.f18093i;
                    this.f18093i = i17 + 1;
                    if (bArr[i17] < 0) {
                        i15++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i15 < 10) {
                if (this.f18093i == this.f18091g) {
                    H(1);
                }
                int i18 = this.f18093i;
                this.f18093i = i18 + 1;
                if (bArr[i18] < 0) {
                    i15++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }
        if (i14 == 1) {
            I(8);
            return true;
        }
        if (i14 == 2) {
            I(D());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            I(4);
            return true;
        }
        do {
            u13 = u();
            if (u13 == 0) {
                break;
            }
        } while (x(u13));
        a(((i13 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] y(int i13) {
        byte[] z13 = z(i13);
        if (z13 != null) {
            return z13;
        }
        int i14 = this.f18093i;
        int i15 = this.f18091g;
        int i16 = i15 - i14;
        this.f18095k += i15;
        this.f18093i = 0;
        this.f18091g = 0;
        ArrayList A = A(i13 - i16);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f18090f, i14, bArr, 0, i16);
        Iterator it = A.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i16, bArr2.length);
            i16 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i13) {
        if (i13 == 0) {
            return j0.f18081b;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i14 = this.f18095k;
        int i15 = this.f18093i;
        int i16 = i14 + i15 + i13;
        if (i16 - this.f18105c > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.f18096l;
        if (i16 > i17) {
            I((i17 - i14) - i15);
            throw InvalidProtocolBufferException.h();
        }
        int i18 = this.f18091g - i15;
        int i19 = i13 - i18;
        InputStream inputStream = this.f18089e;
        if (i19 >= 4096 && i19 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f18090f, this.f18093i, bArr, 0, i18);
        this.f18095k += this.f18091g;
        this.f18093i = 0;
        this.f18091g = 0;
        while (i18 < i13) {
            int read = inputStream.read(bArr, i18, i13 - i18);
            if (read == -1) {
                throw InvalidProtocolBufferException.h();
            }
            this.f18095k += read;
            i18 += read;
        }
        return bArr;
    }
}
