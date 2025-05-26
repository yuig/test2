package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class m extends n {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f33648e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f33649f;

    /* renamed from: g, reason: collision with root package name */
    public int f33650g;

    /* renamed from: h, reason: collision with root package name */
    public int f33651h;

    /* renamed from: i, reason: collision with root package name */
    public int f33652i;

    /* renamed from: j, reason: collision with root package name */
    public int f33653j;

    /* renamed from: k, reason: collision with root package name */
    public int f33654k;

    /* renamed from: l, reason: collision with root package name */
    public int f33655l = Integer.MAX_VALUE;

    public m(InputStream inputStream) {
        l0.a(inputStream, "input");
        this.f33648e = inputStream;
        this.f33649f = new byte[4096];
        this.f33650g = 0;
        this.f33652i = 0;
        this.f33654k = 0;
    }

    public final byte[] A(int i13) {
        byte[] B = B(i13);
        if (B != null) {
            return B;
        }
        int i14 = this.f33652i;
        int i15 = this.f33650g;
        int i16 = i15 - i14;
        this.f33654k += i15;
        this.f33652i = 0;
        this.f33650g = 0;
        ArrayList C = C(i13 - i16);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f33649f, i14, bArr, 0, i16);
        Iterator it = C.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i16, bArr2.length);
            i16 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] B(int i13) {
        if (i13 == 0) {
            return l0.f33647b;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i14 = this.f33654k;
        int i15 = this.f33652i;
        int i16 = i14 + i15 + i13;
        if (i16 - this.f33661c > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.f33655l;
        if (i16 > i17) {
            K((i17 - i14) - i15);
            throw InvalidProtocolBufferException.g();
        }
        int i18 = this.f33650g - i15;
        int i19 = i13 - i18;
        InputStream inputStream = this.f33648e;
        if (i19 >= 4096) {
            try {
                if (i19 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e13) {
                e13.f33591a = true;
                throw e13;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f33649f, this.f33652i, bArr, 0, i18);
        this.f33654k += this.f33650g;
        this.f33652i = 0;
        this.f33650g = 0;
        while (i18 < i13) {
            try {
                int read = inputStream.read(bArr, i18, i13 - i18);
                if (read == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f33654k += read;
                i18 += read;
            } catch (InvalidProtocolBufferException e14) {
                e14.f33591a = true;
                throw e14;
            }
        }
        return bArr;
    }

    public final ArrayList C(int i13) {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int min = Math.min(i13, 4096);
            byte[] bArr = new byte[min];
            int i14 = 0;
            while (i14 < min) {
                int read = this.f33648e.read(bArr, i14, min - i14);
                if (read == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f33654k += read;
                i14 += read;
            }
            i13 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int D() {
        int i13 = this.f33652i;
        if (this.f33650g - i13 < 4) {
            J(4);
            i13 = this.f33652i;
        }
        this.f33652i = i13 + 4;
        byte[] bArr = this.f33649f;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long E() {
        int i13 = this.f33652i;
        if (this.f33650g - i13 < 8) {
            J(8);
            i13 = this.f33652i;
        }
        this.f33652i = i13 + 8;
        byte[] bArr = this.f33649f;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int F() {
        int i13;
        int i14 = this.f33652i;
        int i15 = this.f33650g;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f33649f;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f33652i = i16;
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
                this.f33652i = i17;
                return i13;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j13;
        long j14;
        long j15;
        long j16;
        int i13 = this.f33652i;
        int i14 = this.f33650g;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f33649f;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f33652i = i15;
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
                this.f33652i = i16;
                return j13;
            }
        }
        return H();
    }

    public final long H() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f33652i == this.f33650g) {
                J(1);
            }
            int i14 = this.f33652i;
            this.f33652i = i14 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((this.f33649f[i14] & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void I() {
        int i13 = this.f33650g + this.f33651h;
        this.f33650g = i13;
        int i14 = this.f33654k + i13;
        int i15 = this.f33655l;
        if (i14 <= i15) {
            this.f33651h = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f33651h = i16;
        this.f33650g = i13 - i16;
    }

    public final void J(int i13) {
        if (L(i13)) {
            return;
        }
        if (i13 <= (this.f33661c - this.f33654k) - this.f33652i) {
            throw InvalidProtocolBufferException.g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void K(int i13) {
        int i14 = this.f33650g;
        int i15 = this.f33652i;
        if (i13 <= i14 - i15 && i13 >= 0) {
            this.f33652i = i15 + i13;
            return;
        }
        InputStream inputStream = this.f33648e;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i16 = this.f33654k;
        int i17 = i16 + i15;
        int i18 = i17 + i13;
        int i19 = this.f33655l;
        if (i18 > i19) {
            K((i19 - i16) - i15);
            throw InvalidProtocolBufferException.g();
        }
        this.f33654k = i17;
        int i23 = i14 - i15;
        this.f33650g = 0;
        this.f33652i = 0;
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
                    e13.f33591a = true;
                    throw e13;
                }
            } catch (Throwable th3) {
                this.f33654k += i23;
                I();
                throw th3;
            }
        }
        this.f33654k += i23;
        I();
        if (i23 >= i13) {
            return;
        }
        int i24 = this.f33650g;
        int i25 = i24 - this.f33652i;
        this.f33652i = i24;
        J(1);
        while (true) {
            int i26 = i13 - i25;
            int i27 = this.f33650g;
            if (i26 <= i27) {
                this.f33652i = i26;
                return;
            } else {
                i25 += i27;
                this.f33652i = i27;
                J(1);
            }
        }
    }

    public final boolean L(int i13) {
        int i14 = this.f33652i;
        int i15 = i14 + i13;
        int i16 = this.f33650g;
        if (i15 <= i16) {
            throw new IllegalStateException(a.a.e("refillBuffer() called when ", i13, " bytes were already available in buffer"));
        }
        int i17 = this.f33654k;
        int i18 = this.f33661c;
        if (i13 > (i18 - i17) - i14 || i17 + i14 + i13 > this.f33655l) {
            return false;
        }
        byte[] bArr = this.f33649f;
        if (i14 > 0) {
            if (i16 > i14) {
                System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
            }
            this.f33654k += i14;
            this.f33650g -= i14;
            this.f33652i = 0;
        }
        int i19 = this.f33650g;
        int min = Math.min(bArr.length - i19, (i18 - this.f33654k) - i19);
        InputStream inputStream = this.f33648e;
        try {
            int read = inputStream.read(bArr, i19, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f33650g += read;
            I();
            if (this.f33650g >= i13) {
                return true;
            }
            return L(i13);
        } catch (InvalidProtocolBufferException e13) {
            e13.f33591a = true;
            throw e13;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final void a(int i13) {
        if (this.f33653j != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int d() {
        return this.f33654k + this.f33652i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final boolean e() {
        return this.f33652i == this.f33650g && !L(1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final void g(int i13) {
        this.f33655l = i13;
        I();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int h(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i14 = this.f33654k + this.f33652i + i13;
        int i15 = this.f33655l;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33655l = i14;
        I();
        return i15;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final boolean i() {
        return G() != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final j j() {
        int F = F();
        int i13 = this.f33650g;
        int i14 = this.f33652i;
        int i15 = i13 - i14;
        byte[] bArr = this.f33649f;
        if (F <= i15 && F > 0) {
            j d2 = k.d(bArr, i14, F);
            this.f33652i += F;
            return d2;
        }
        if (F == 0) {
            return k.f33636b;
        }
        byte[] B = B(F);
        if (B != null) {
            return k.d(B, 0, B.length);
        }
        int i16 = this.f33652i;
        int i17 = this.f33650g;
        int i18 = i17 - i16;
        this.f33654k += i17;
        this.f33652i = 0;
        this.f33650g = 0;
        ArrayList C = C(F - i18);
        byte[] bArr2 = new byte[F];
        System.arraycopy(bArr, i16, bArr2, 0, i18);
        Iterator it = C.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i18, bArr3.length);
            i18 += bArr3.length;
        }
        j jVar = k.f33636b;
        return new j(bArr2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final double k() {
        return Double.longBitsToDouble(E());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int l() {
        return F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int m() {
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long n() {
        return E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final float o() {
        return Float.intBitsToFloat(D());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int p() {
        return F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long q() {
        return G();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int r() {
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long s() {
        return E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int t() {
        return n.b(F());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long u() {
        return n.c(G());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final String v() {
        int F = F();
        byte[] bArr = this.f33649f;
        if (F > 0) {
            int i13 = this.f33650g;
            int i14 = this.f33652i;
            if (F <= i13 - i14) {
                String str = new String(bArr, i14, F, l0.f33646a);
                this.f33652i += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F > this.f33650g) {
            return new String(A(F), l0.f33646a);
        }
        J(F);
        String str2 = new String(bArr, this.f33652i, F, l0.f33646a);
        this.f33652i += F;
        return str2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final String w() {
        int F = F();
        int i13 = this.f33652i;
        int i14 = this.f33650g;
        int i15 = i14 - i13;
        byte[] bArr = this.f33649f;
        if (F <= i15 && F > 0) {
            this.f33652i = i13 + F;
        } else {
            if (F == 0) {
                return "";
            }
            i13 = 0;
            if (F <= i14) {
                J(F);
                this.f33652i = F;
            } else {
                bArr = A(F);
            }
        }
        return g2.f33630a.P(bArr, i13, F);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int x() {
        if (e()) {
            this.f33653j = 0;
            return 0;
        }
        int F = F();
        this.f33653j = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int y() {
        return F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long z() {
        return G();
    }
}
