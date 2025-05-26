package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: e */
    public final byte[] f33639e;

    /* renamed from: f */
    public int f33640f;

    /* renamed from: g */
    public int f33641g;

    /* renamed from: h */
    public int f33642h;

    /* renamed from: i */
    public final int f33643i;

    /* renamed from: j */
    public int f33644j;

    /* renamed from: k */
    public int f33645k = Integer.MAX_VALUE;

    public l(byte[] bArr, int i13, int i14, boolean z13) {
        this.f33639e = bArr;
        this.f33640f = i14 + i13;
        this.f33642h = i13;
        this.f33643i = i13;
    }

    public final int A() {
        int i13 = this.f33642h;
        if (this.f33640f - i13 < 4) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33642h = i13 + 4;
        byte[] bArr = this.f33639e;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long B() {
        int i13 = this.f33642h;
        if (this.f33640f - i13 < 8) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33642h = i13 + 8;
        byte[] bArr = this.f33639e;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int C() {
        int i13;
        int i14 = this.f33642h;
        int i15 = this.f33640f;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f33639e;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f33642h = i16;
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
                this.f33642h = i17;
                return i13;
            }
        }
        return (int) E();
    }

    public final long D() {
        long j13;
        long j14;
        long j15;
        long j16;
        int i13 = this.f33642h;
        int i14 = this.f33640f;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f33639e;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f33642h = i15;
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
                this.f33642h = i16;
                return j13;
            }
        }
        return E();
    }

    public final long E() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            int i14 = this.f33642h;
            if (i14 == this.f33640f) {
                throw InvalidProtocolBufferException.g();
            }
            this.f33642h = i14 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((this.f33639e[i14] & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void F() {
        int i13 = this.f33640f + this.f33641g;
        this.f33640f = i13;
        int i14 = i13 - this.f33643i;
        int i15 = this.f33645k;
        if (i14 <= i15) {
            this.f33641g = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f33641g = i16;
        this.f33640f = i13 - i16;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final void a(int i13) {
        if (this.f33644j != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int d() {
        return this.f33642h - this.f33643i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final boolean e() {
        return this.f33642h == this.f33640f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final void g(int i13) {
        this.f33645k = i13;
        F();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int h(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int d2 = d() + i13;
        if (d2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i14 = this.f33645k;
        if (d2 > i14) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33645k = d2;
        F();
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final boolean i() {
        return D() != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final j j() {
        byte[] bArr;
        int C = C();
        byte[] bArr2 = this.f33639e;
        if (C > 0) {
            int i13 = this.f33640f;
            int i14 = this.f33642h;
            if (C <= i13 - i14) {
                j d2 = k.d(bArr2, i14, C);
                this.f33642h += C;
                return d2;
            }
        }
        if (C == 0) {
            return k.f33636b;
        }
        if (C > 0) {
            int i15 = this.f33640f;
            int i16 = this.f33642h;
            if (C <= i15 - i16) {
                int i17 = C + i16;
                this.f33642h = i17;
                bArr = Arrays.copyOfRange(bArr2, i16, i17);
                j jVar = k.f33636b;
                return new j(bArr);
            }
        }
        if (C > 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (C != 0) {
            throw InvalidProtocolBufferException.e();
        }
        bArr = l0.f33647b;
        j jVar2 = k.f33636b;
        return new j(bArr);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final double k() {
        return Double.longBitsToDouble(B());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int l() {
        return C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int m() {
        return A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long n() {
        return B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final float o() {
        return Float.intBitsToFloat(A());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int p() {
        return C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long q() {
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int r() {
        return A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long s() {
        return B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int t() {
        return n.b(C());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long u() {
        return n.c(D());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final String v() {
        int C = C();
        if (C > 0) {
            int i13 = this.f33640f;
            int i14 = this.f33642h;
            if (C <= i13 - i14) {
                String str = new String(this.f33639e, i14, C, l0.f33646a);
                this.f33642h += C;
                return str;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final String w() {
        int C = C();
        if (C > 0) {
            int i13 = this.f33640f;
            int i14 = this.f33642h;
            if (C <= i13 - i14) {
                String b13 = g2.b(this.f33639e, i14, C);
                this.f33642h += C;
                return b13;
            }
        }
        if (C == 0) {
            return "";
        }
        if (C <= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int x() {
        if (e()) {
            this.f33644j = 0;
            return 0;
        }
        int C = C();
        this.f33644j = C;
        if (u1.J(C) != 0) {
            return this.f33644j;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final int y() {
        return C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n
    public final long z() {
        return D();
    }
}
