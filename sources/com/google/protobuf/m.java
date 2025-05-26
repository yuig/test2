package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: e */
    public final byte[] f33927e;

    /* renamed from: f */
    public int f33928f;

    /* renamed from: g */
    public int f33929g;

    /* renamed from: h */
    public int f33930h;

    /* renamed from: i */
    public final int f33931i;

    /* renamed from: j */
    public int f33932j;

    /* renamed from: k */
    public int f33933k = Integer.MAX_VALUE;

    public m(byte[] bArr, int i13, int i14, boolean z13) {
        this.f33927e = bArr;
        this.f33928f = i14 + i13;
        this.f33930h = i13;
        this.f33931i = i13;
    }

    @Override // com.google.protobuf.p
    public final int A() {
        if (e()) {
            this.f33932j = 0;
            return 0;
        }
        int G = G();
        this.f33932j = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // com.google.protobuf.p
    public final int B() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final long C() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final boolean D(int i13) {
        int A;
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            int i16 = this.f33928f - this.f33930h;
            byte[] bArr = this.f33927e;
            if (i16 >= 10) {
                while (i15 < 10) {
                    int i17 = this.f33930h;
                    this.f33930h = i17 + 1;
                    if (bArr[i17] < 0) {
                        i15++;
                    }
                }
                throw InvalidProtocolBufferException.d();
            }
            while (i15 < 10) {
                int i18 = this.f33930h;
                if (i18 == this.f33928f) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f33930h = i18 + 1;
                if (bArr[i18] < 0) {
                    i15++;
                }
            }
            throw InvalidProtocolBufferException.d();
            return true;
        }
        if (i14 == 1) {
            K(8);
            return true;
        }
        if (i14 == 2) {
            K(G());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            K(4);
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

    public final int E() {
        int i13 = this.f33930h;
        if (this.f33928f - i13 < 4) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33930h = i13 + 4;
        byte[] bArr = this.f33927e;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long F() {
        int i13 = this.f33930h;
        if (this.f33928f - i13 < 8) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33930h = i13 + 8;
        byte[] bArr = this.f33927e;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int G() {
        int i13;
        int i14 = this.f33930h;
        int i15 = this.f33928f;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f33927e;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f33930h = i16;
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
                this.f33930h = i17;
                return i13;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j13;
        long j14;
        long j15;
        long j16;
        int i13 = this.f33930h;
        int i14 = this.f33928f;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f33927e;
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                this.f33930h = i15;
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
                this.f33930h = i16;
                return j13;
            }
        }
        return I();
    }

    public final long I() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            int i14 = this.f33930h;
            if (i14 == this.f33928f) {
                throw InvalidProtocolBufferException.g();
            }
            this.f33930h = i14 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((this.f33927e[i14] & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void J() {
        int i13 = this.f33928f + this.f33929g;
        this.f33928f = i13;
        int i14 = i13 - this.f33931i;
        int i15 = this.f33933k;
        if (i14 <= i15) {
            this.f33929g = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f33929g = i16;
        this.f33928f = i13 - i16;
    }

    public final void K(int i13) {
        if (i13 >= 0) {
            int i14 = this.f33928f;
            int i15 = this.f33930h;
            if (i13 <= i14 - i15) {
                this.f33930h = i15 + i13;
                return;
            }
        }
        if (i13 >= 0) {
            throw InvalidProtocolBufferException.g();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.p
    public final void a(int i13) {
        if (this.f33932j != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.p
    public final int d() {
        return this.f33930h - this.f33931i;
    }

    @Override // com.google.protobuf.p
    public final boolean e() {
        return this.f33930h == this.f33928f;
    }

    @Override // com.google.protobuf.p
    public final void i(int i13) {
        this.f33933k = i13;
        J();
    }

    @Override // com.google.protobuf.p
    public final int j(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int d2 = d() + i13;
        if (d2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i14 = this.f33933k;
        if (d2 > i14) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33933k = d2;
        J();
        return i14;
    }

    @Override // com.google.protobuf.p
    public final boolean k() {
        return H() != 0;
    }

    @Override // com.google.protobuf.p
    public final j l() {
        byte[] bArr;
        int G = G();
        byte[] bArr2 = this.f33927e;
        if (G > 0) {
            int i13 = this.f33928f;
            int i14 = this.f33930h;
            if (G <= i13 - i14) {
                j d2 = l.d(bArr2, i14, G);
                this.f33930h += G;
                return d2;
            }
        }
        if (G == 0) {
            return l.f33922b;
        }
        if (G > 0) {
            int i15 = this.f33928f;
            int i16 = this.f33930h;
            if (G <= i15 - i16) {
                int i17 = G + i16;
                this.f33930h = i17;
                bArr = Arrays.copyOfRange(bArr2, i16, i17);
                j jVar = l.f33922b;
                return new j(bArr);
            }
        }
        if (G > 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (G != 0) {
            throw InvalidProtocolBufferException.e();
        }
        bArr = w0.f34009b;
        j jVar2 = l.f33922b;
        return new j(bArr);
    }

    @Override // com.google.protobuf.p
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // com.google.protobuf.p
    public final int n() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final int o() {
        return E();
    }

    @Override // com.google.protobuf.p
    public final long p() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.protobuf.p
    public final int r() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final long s() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final int u() {
        return E();
    }

    @Override // com.google.protobuf.p
    public final long v() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final int w() {
        return p.b(G());
    }

    @Override // com.google.protobuf.p
    public final long x() {
        return p.c(H());
    }

    @Override // com.google.protobuf.p
    public final String y() {
        int G = G();
        if (G > 0) {
            int i13 = this.f33928f;
            int i14 = this.f33930h;
            if (G <= i13 - i14) {
                String str = new String(this.f33927e, i14, G, w0.f34008a);
                this.f33930h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // com.google.protobuf.p
    public final String z() {
        int G = G();
        if (G > 0) {
            int i13 = this.f33928f;
            int i14 = this.f33930h;
            if (G <= i13 - i14) {
                String J0 = t2.f33999a.J0(this.f33927e, i14, G);
                this.f33930h += G;
                return J0;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }
}
