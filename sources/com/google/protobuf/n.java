package com.google.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n extends p {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f33934e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f33935f;

    /* renamed from: g, reason: collision with root package name */
    public int f33936g;

    /* renamed from: h, reason: collision with root package name */
    public int f33937h;

    /* renamed from: i, reason: collision with root package name */
    public int f33938i;

    /* renamed from: j, reason: collision with root package name */
    public int f33939j;

    /* renamed from: k, reason: collision with root package name */
    public int f33940k;

    /* renamed from: l, reason: collision with root package name */
    public int f33941l = Integer.MAX_VALUE;

    public n(InputStream inputStream) {
        w0.a(inputStream, "input");
        this.f33934e = inputStream;
        this.f33935f = new byte[4096];
        this.f33936g = 0;
        this.f33938i = 0;
        this.f33940k = 0;
    }

    @Override // com.google.protobuf.p
    public final int A() {
        if (e()) {
            this.f33939j = 0;
            return 0;
        }
        int J2 = J();
        this.f33939j = J2;
        if ((J2 >>> 3) != 0) {
            return J2;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // com.google.protobuf.p
    public final int B() {
        return J();
    }

    @Override // com.google.protobuf.p
    public final long C() {
        return K();
    }

    @Override // com.google.protobuf.p
    public final boolean D(int i13) {
        int A;
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            int i16 = this.f33936g - this.f33938i;
            byte[] bArr = this.f33935f;
            if (i16 >= 10) {
                while (i15 < 10) {
                    int i17 = this.f33938i;
                    this.f33938i = i17 + 1;
                    if (bArr[i17] < 0) {
                        i15++;
                    }
                }
                throw InvalidProtocolBufferException.d();
            }
            while (i15 < 10) {
                if (this.f33938i == this.f33936g) {
                    N(1);
                }
                int i18 = this.f33938i;
                this.f33938i = i18 + 1;
                if (bArr[i18] < 0) {
                    i15++;
                }
            }
            throw InvalidProtocolBufferException.d();
            return true;
        }
        if (i14 == 1) {
            O(8);
            return true;
        }
        if (i14 == 2) {
            O(J());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            O(4);
            return true;
        }
        do {
            A = A();
            if (A == 0) {
                break;
            }
        } while (D(A));
        a(((i13 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] E(int i13) {
        byte[] F = F(i13);
        if (F != null) {
            return F;
        }
        int i14 = this.f33938i;
        int i15 = this.f33936g;
        int i16 = i15 - i14;
        this.f33940k += i15;
        this.f33938i = 0;
        this.f33936g = 0;
        ArrayList G = G(i13 - i16);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f33935f, i14, bArr, 0, i16);
        Iterator it = G.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i16, bArr2.length);
            i16 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i13) {
        if (i13 == 0) {
            return w0.f34009b;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i14 = this.f33940k;
        int i15 = this.f33938i;
        int i16 = i14 + i15 + i13;
        if (i16 - this.f33955c > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.f33941l;
        if (i16 > i17) {
            O((i17 - i14) - i15);
            throw InvalidProtocolBufferException.g();
        }
        int i18 = this.f33936g - i15;
        int i19 = i13 - i18;
        InputStream inputStream = this.f33934e;
        if (i19 >= 4096) {
            try {
                if (i19 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e13) {
                e13.f33849a = true;
                throw e13;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f33935f, this.f33938i, bArr, 0, i18);
        this.f33940k += this.f33936g;
        this.f33938i = 0;
        this.f33936g = 0;
        while (i18 < i13) {
            try {
                int read = inputStream.read(bArr, i18, i13 - i18);
                if (read == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f33940k += read;
                i18 += read;
            } catch (InvalidProtocolBufferException e14) {
                e14.f33849a = true;
                throw e14;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i13) {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int min = Math.min(i13, 4096);
            byte[] bArr = new byte[min];
            int i14 = 0;
            while (i14 < min) {
                int read = this.f33934e.read(bArr, i14, min - i14);
                if (read == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f33940k += read;
                i14 += read;
            }
            i13 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() {
        int i13 = this.f33938i;
        if (this.f33936g - i13 < 4) {
            N(4);
            i13 = this.f33938i;
        }
        this.f33938i = i13 + 4;
        byte[] bArr = this.f33935f;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long I() {
        int i13 = this.f33938i;
        if (this.f33936g - i13 < 8) {
            N(8);
            i13 = this.f33938i;
        }
        this.f33938i = i13 + 8;
        byte[] bArr = this.f33935f;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int J() {
        int i13;
        int i14 = this.f33938i;
        int i15 = this.f33936g;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f33935f;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f33938i = i16;
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
                this.f33938i = i17;
                return i13;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j13;
        long j14;
        long j15;
        long j16;
        int i13 = this.f33938i;
        int i14 = this.f33936g;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f33935f;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f33938i = i15;
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
                this.f33938i = i16;
                return j13;
            }
        }
        return L();
    }

    public final long L() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f33938i == this.f33936g) {
                N(1);
            }
            int i14 = this.f33938i;
            this.f33938i = i14 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((this.f33935f[i14] & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void M() {
        int i13 = this.f33936g + this.f33937h;
        this.f33936g = i13;
        int i14 = this.f33940k + i13;
        int i15 = this.f33941l;
        if (i14 <= i15) {
            this.f33937h = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f33937h = i16;
        this.f33936g = i13 - i16;
    }

    public final void N(int i13) {
        if (P(i13)) {
            return;
        }
        if (i13 <= (this.f33955c - this.f33940k) - this.f33938i) {
            throw InvalidProtocolBufferException.g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i13) {
        int i14 = this.f33936g;
        int i15 = this.f33938i;
        if (i13 <= i14 - i15 && i13 >= 0) {
            this.f33938i = i15 + i13;
            return;
        }
        InputStream inputStream = this.f33934e;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i16 = this.f33940k;
        int i17 = i16 + i15;
        int i18 = i17 + i13;
        int i19 = this.f33941l;
        if (i18 > i19) {
            O((i19 - i16) - i15);
            throw InvalidProtocolBufferException.g();
        }
        this.f33940k = i17;
        int i23 = i14 - i15;
        this.f33936g = 0;
        this.f33938i = 0;
        while (i23 < i13) {
            long j13 = i13 - i23;
            try {
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
                } catch (InvalidProtocolBufferException e13) {
                    e13.f33849a = true;
                    throw e13;
                }
            } catch (Throwable th3) {
                this.f33940k += i23;
                M();
                throw th3;
            }
        }
        this.f33940k += i23;
        M();
        if (i23 >= i13) {
            return;
        }
        int i24 = this.f33936g;
        int i25 = i24 - this.f33938i;
        this.f33938i = i24;
        N(1);
        while (true) {
            int i26 = i13 - i25;
            int i27 = this.f33936g;
            if (i26 <= i27) {
                this.f33938i = i26;
                return;
            } else {
                i25 += i27;
                this.f33938i = i27;
                N(1);
            }
        }
    }

    public final boolean P(int i13) {
        int i14 = this.f33938i;
        int i15 = i14 + i13;
        int i16 = this.f33936g;
        if (i15 <= i16) {
            throw new IllegalStateException(a.a.e("refillBuffer() called when ", i13, " bytes were already available in buffer"));
        }
        int i17 = this.f33940k;
        int i18 = this.f33955c;
        if (i13 > (i18 - i17) - i14 || i17 + i14 + i13 > this.f33941l) {
            return false;
        }
        byte[] bArr = this.f33935f;
        if (i14 > 0) {
            if (i16 > i14) {
                System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
            }
            this.f33940k += i14;
            this.f33936g -= i14;
            this.f33938i = 0;
        }
        int i19 = this.f33936g;
        int min = Math.min(bArr.length - i19, (i18 - this.f33940k) - i19);
        InputStream inputStream = this.f33934e;
        try {
            int read = inputStream.read(bArr, i19, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f33936g += read;
            M();
            if (this.f33936g >= i13) {
                return true;
            }
            return P(i13);
        } catch (InvalidProtocolBufferException e13) {
            e13.f33849a = true;
            throw e13;
        }
    }

    @Override // com.google.protobuf.p
    public final void a(int i13) {
        if (this.f33939j != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.p
    public final int d() {
        return this.f33940k + this.f33938i;
    }

    @Override // com.google.protobuf.p
    public final boolean e() {
        return this.f33938i == this.f33936g && !P(1);
    }

    @Override // com.google.protobuf.p
    public final void i(int i13) {
        this.f33941l = i13;
        M();
    }

    @Override // com.google.protobuf.p
    public final int j(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i14 = this.f33940k + this.f33938i + i13;
        int i15 = this.f33941l;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33941l = i14;
        M();
        return i15;
    }

    @Override // com.google.protobuf.p
    public final boolean k() {
        return K() != 0;
    }

    @Override // com.google.protobuf.p
    public final j l() {
        int J2 = J();
        int i13 = this.f33936g;
        int i14 = this.f33938i;
        int i15 = i13 - i14;
        byte[] bArr = this.f33935f;
        if (J2 <= i15 && J2 > 0) {
            j d2 = l.d(bArr, i14, J2);
            this.f33938i += J2;
            return d2;
        }
        if (J2 == 0) {
            return l.f33922b;
        }
        byte[] F = F(J2);
        if (F != null) {
            return l.d(F, 0, F.length);
        }
        int i16 = this.f33938i;
        int i17 = this.f33936g;
        int i18 = i17 - i16;
        this.f33940k += i17;
        this.f33938i = 0;
        this.f33936g = 0;
        ArrayList G = G(J2 - i18);
        byte[] bArr2 = new byte[J2];
        System.arraycopy(bArr, i16, bArr2, 0, i18);
        Iterator it = G.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i18, bArr3.length);
            i18 += bArr3.length;
        }
        j jVar = l.f33922b;
        return new j(bArr2);
    }

    @Override // com.google.protobuf.p
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // com.google.protobuf.p
    public final int n() {
        return J();
    }

    @Override // com.google.protobuf.p
    public final int o() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final long p() {
        return I();
    }

    @Override // com.google.protobuf.p
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.protobuf.p
    public final int r() {
        return J();
    }

    @Override // com.google.protobuf.p
    public final long s() {
        return K();
    }

    @Override // com.google.protobuf.p
    public final int u() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final long v() {
        return I();
    }

    @Override // com.google.protobuf.p
    public final int w() {
        return p.b(J());
    }

    @Override // com.google.protobuf.p
    public final long x() {
        return p.c(K());
    }

    @Override // com.google.protobuf.p
    public final String y() {
        int J2 = J();
        byte[] bArr = this.f33935f;
        if (J2 > 0) {
            int i13 = this.f33936g;
            int i14 = this.f33938i;
            if (J2 <= i13 - i14) {
                String str = new String(bArr, i14, J2, w0.f34008a);
                this.f33938i += J2;
                return str;
            }
        }
        if (J2 == 0) {
            return "";
        }
        if (J2 > this.f33936g) {
            return new String(E(J2), w0.f34008a);
        }
        N(J2);
        String str2 = new String(bArr, this.f33938i, J2, w0.f34008a);
        this.f33938i += J2;
        return str2;
    }

    @Override // com.google.protobuf.p
    public final String z() {
        int J2 = J();
        int i13 = this.f33938i;
        int i14 = this.f33936g;
        int i15 = i14 - i13;
        byte[] bArr = this.f33935f;
        if (J2 <= i15 && J2 > 0) {
            this.f33938i = i13 + J2;
        } else {
            if (J2 == 0) {
                return "";
            }
            i13 = 0;
            if (J2 <= i14) {
                N(J2);
                this.f33938i = J2;
            } else {
                bArr = E(J2);
            }
        }
        return t2.f33999a.J0(bArr, i13, J2);
    }
}
