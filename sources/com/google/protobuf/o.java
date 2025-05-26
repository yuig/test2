package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class o extends p {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f33942e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33943f;

    /* renamed from: g, reason: collision with root package name */
    public long f33944g;

    /* renamed from: h, reason: collision with root package name */
    public long f33945h;

    /* renamed from: i, reason: collision with root package name */
    public final long f33946i;

    /* renamed from: j, reason: collision with root package name */
    public int f33947j;

    /* renamed from: k, reason: collision with root package name */
    public int f33948k;

    /* renamed from: l, reason: collision with root package name */
    public int f33949l = Integer.MAX_VALUE;

    public o(ByteBuffer byteBuffer, boolean z13) {
        this.f33942e = byteBuffer;
        long i13 = q2.f33962c.i(q2.f33966g, byteBuffer);
        this.f33943f = i13;
        this.f33944g = byteBuffer.limit() + i13;
        long position = i13 + byteBuffer.position();
        this.f33945h = position;
        this.f33946i = position;
    }

    public static boolean E() {
        return q2.f33963d;
    }

    @Override // com.google.protobuf.p
    public final int A() {
        if (e()) {
            this.f33948k = 0;
            return 0;
        }
        int H = H();
        this.f33948k = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // com.google.protobuf.p
    public final int B() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final long C() {
        return I();
    }

    @Override // com.google.protobuf.p
    public final boolean D(int i13) {
        int A;
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 == 0) {
            if (((int) (this.f33944g - this.f33945h)) >= 10) {
                while (i15 < 10) {
                    long j13 = this.f33945h;
                    this.f33945h = j13 + 1;
                    if (q2.f33962c.e(j13) < 0) {
                        i15++;
                    }
                }
                throw InvalidProtocolBufferException.d();
            }
            while (i15 < 10) {
                long j14 = this.f33945h;
                if (j14 == this.f33944g) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f33945h = j14 + 1;
                if (q2.f33962c.e(j14) < 0) {
                    i15++;
                }
            }
            throw InvalidProtocolBufferException.d();
            return true;
        }
        if (i14 == 1) {
            L(8);
            return true;
        }
        if (i14 == 2) {
            L(H());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            L(4);
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

    public final int F() {
        long j13 = this.f33945h;
        if (this.f33944g - j13 < 4) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33945h = 4 + j13;
        p2 p2Var = q2.f33962c;
        return ((p2Var.e(j13 + 3) & 255) << 24) | (p2Var.e(j13) & 255) | ((p2Var.e(1 + j13) & 255) << 8) | ((p2Var.e(2 + j13) & 255) << 16);
    }

    public final long G() {
        long j13 = this.f33945h;
        if (this.f33944g - j13 < 8) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33945h = 8 + j13;
        p2 p2Var = q2.f33962c;
        return ((p2Var.e(j13 + 7) & 255) << 56) | (p2Var.e(j13) & 255) | ((p2Var.e(1 + j13) & 255) << 8) | ((p2Var.e(2 + j13) & 255) << 16) | ((p2Var.e(3 + j13) & 255) << 24) | ((p2Var.e(4 + j13) & 255) << 32) | ((p2Var.e(5 + j13) & 255) << 40) | ((p2Var.e(6 + j13) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H() {
        /*
            r12 = this;
            long r0 = r12.f33945h
            long r2 = r12.f33944g
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.p2 r4 = com.google.protobuf.q2.f33962c
            byte r5 = r4.e(r0)
            if (r5 < 0) goto L18
            r12.f33945h = r2
            return r5
        L18:
            long r6 = r12.f33944g
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.J()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f33945h = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o.H():int");
    }

    public final long I() {
        long j13;
        long j14;
        long j15;
        int i13;
        long j16 = this.f33945h;
        if (this.f33944g != j16) {
            long j17 = 1 + j16;
            p2 p2Var = q2.f33962c;
            byte e13 = p2Var.e(j16);
            if (e13 >= 0) {
                this.f33945h = j17;
                return e13;
            }
            if (this.f33944g - j17 >= 9) {
                long j18 = 2 + j16;
                int e14 = (p2Var.e(j17) << 7) ^ e13;
                if (e14 >= 0) {
                    long j19 = 3 + j16;
                    int e15 = e14 ^ (p2Var.e(j18) << 14);
                    if (e15 >= 0) {
                        j13 = e15 ^ 16256;
                    } else {
                        j18 = j16 + 4;
                        int e16 = e15 ^ (p2Var.e(j19) << 21);
                        if (e16 < 0) {
                            i13 = (-2080896) ^ e16;
                        } else {
                            j19 = 5 + j16;
                            long e17 = e16 ^ (p2Var.e(j18) << 28);
                            if (e17 < 0) {
                                long j23 = 6 + j16;
                                long e18 = e17 ^ (p2Var.e(j19) << 35);
                                if (e18 < 0) {
                                    j14 = -34093383808L;
                                } else {
                                    j19 = 7 + j16;
                                    e17 = e18 ^ (p2Var.e(j23) << 42);
                                    if (e17 >= 0) {
                                        j15 = 4363953127296L;
                                    } else {
                                        j23 = 8 + j16;
                                        e18 = e17 ^ (p2Var.e(j19) << 49);
                                        if (e18 >= 0) {
                                            long j24 = j16 + 9;
                                            long e19 = (e18 ^ (p2Var.e(j23) << 56)) ^ 71499008037633920L;
                                            if (e19 < 0) {
                                                long j25 = j16 + 10;
                                                if (p2Var.e(j24) >= 0) {
                                                    j18 = j25;
                                                    j13 = e19;
                                                }
                                            } else {
                                                j13 = e19;
                                                j18 = j24;
                                            }
                                            this.f33945h = j18;
                                            return j13;
                                        }
                                        j14 = -558586000294016L;
                                    }
                                }
                                j13 = j14 ^ e18;
                                j18 = j23;
                                this.f33945h = j18;
                                return j13;
                            }
                            j15 = 266354560;
                            j13 = j15 ^ e17;
                        }
                    }
                    j18 = j19;
                    this.f33945h = j18;
                    return j13;
                }
                i13 = e14 ^ (-128);
                j13 = i13;
                this.f33945h = j18;
                return j13;
            }
        }
        return J();
    }

    public final long J() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            long j14 = this.f33945h;
            if (j14 == this.f33944g) {
                throw InvalidProtocolBufferException.g();
            }
            this.f33945h = 1 + j14;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((q2.f33962c.e(j14) & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void K() {
        long j13 = this.f33944g + this.f33947j;
        this.f33944g = j13;
        int i13 = (int) (j13 - this.f33946i);
        int i14 = this.f33949l;
        if (i13 <= i14) {
            this.f33947j = 0;
            return;
        }
        int i15 = i13 - i14;
        this.f33947j = i15;
        this.f33944g = j13 - i15;
    }

    public final void L(int i13) {
        if (i13 >= 0) {
            long j13 = this.f33944g;
            long j14 = this.f33945h;
            if (i13 <= ((int) (j13 - j14))) {
                this.f33945h = j14 + i13;
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
        if (this.f33948k != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.p
    public final int d() {
        return (int) (this.f33945h - this.f33946i);
    }

    @Override // com.google.protobuf.p
    public final boolean e() {
        return this.f33945h == this.f33944g;
    }

    @Override // com.google.protobuf.p
    public final void i(int i13) {
        this.f33949l = i13;
        K();
    }

    @Override // com.google.protobuf.p
    public final int j(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int d2 = d() + i13;
        int i14 = this.f33949l;
        if (d2 > i14) {
            throw InvalidProtocolBufferException.g();
        }
        this.f33949l = d2;
        K();
        return i14;
    }

    @Override // com.google.protobuf.p
    public final boolean k() {
        return I() != 0;
    }

    @Override // com.google.protobuf.p
    public final j l() {
        int H = H();
        if (H > 0) {
            long j13 = this.f33944g;
            long j14 = this.f33945h;
            if (H <= ((int) (j13 - j14))) {
                byte[] bArr = new byte[H];
                long j15 = H;
                q2.f33962c.c(j14, bArr, j15);
                this.f33945h += j15;
                j jVar = l.f33922b;
                return new j(bArr);
            }
        }
        if (H == 0) {
            return l.f33922b;
        }
        if (H < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // com.google.protobuf.p
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // com.google.protobuf.p
    public final int n() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final int o() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final long p() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.protobuf.p
    public final int r() {
        return H();
    }

    @Override // com.google.protobuf.p
    public final long s() {
        return I();
    }

    @Override // com.google.protobuf.p
    public final int u() {
        return F();
    }

    @Override // com.google.protobuf.p
    public final long v() {
        return G();
    }

    @Override // com.google.protobuf.p
    public final int w() {
        return p.b(H());
    }

    @Override // com.google.protobuf.p
    public final long x() {
        return p.c(I());
    }

    @Override // com.google.protobuf.p
    public final String y() {
        int H = H();
        if (H > 0) {
            long j13 = this.f33944g;
            long j14 = this.f33945h;
            if (H <= ((int) (j13 - j14))) {
                byte[] bArr = new byte[H];
                long j15 = H;
                q2.f33962c.c(j14, bArr, j15);
                String str = new String(bArr, w0.f34008a);
                this.f33945h += j15;
                return str;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override // com.google.protobuf.p
    public final String z() {
        int H = H();
        if (H > 0) {
            long j13 = this.f33944g;
            long j14 = this.f33945h;
            if (H <= ((int) (j13 - j14))) {
                int i13 = (int) (j14 - this.f33943f);
                r2 r2Var = t2.f33999a;
                r2Var.getClass();
                ByteBuffer byteBuffer = this.f33942e;
                String J0 = byteBuffer.hasArray() ? r2Var.J0(byteBuffer.array(), byteBuffer.arrayOffset() + i13, H) : byteBuffer.isDirect() ? d7.b.z(i13, H, byteBuffer) : d7.b.z(i13, H, byteBuffer);
                this.f33945h += H;
                return J0;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H <= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }
}
