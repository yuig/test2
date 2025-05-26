package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class go extends io {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f5637d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f5638e;

    /* renamed from: f, reason: collision with root package name */
    public int f5639f;

    /* renamed from: g, reason: collision with root package name */
    public int f5640g;

    /* renamed from: i, reason: collision with root package name */
    public int f5642i;

    /* renamed from: k, reason: collision with root package name */
    public long f5644k;

    /* renamed from: l, reason: collision with root package name */
    public long f5645l;

    /* renamed from: m, reason: collision with root package name */
    public long f5646m;

    /* renamed from: h, reason: collision with root package name */
    public int f5641h = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f5643j = 0;

    public go(ArrayList arrayList, int i13) {
        this.f5639f = i13;
        this.f5637d = arrayList.iterator();
        if (i13 != 0) {
            A();
            return;
        }
        this.f5638e = hw0.f6128c;
        this.f5644k = 0L;
        this.f5645l = 0L;
        this.f5646m = 0L;
    }

    public final void A() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f5637d.next();
        this.f5638e = byteBuffer;
        this.f5643j += (int) (this.f5644k - this.f5645l);
        long position = byteBuffer.position();
        this.f5644k = position;
        this.f5645l = position;
        this.f5646m = this.f5638e.limit();
        long f13 = mw2.f8408c.f(this.f5638e, mw2.f8412g);
        this.f5644k += f13;
        this.f5645l += f13;
        this.f5646m += f13;
    }

    @Override // ads_mobile_sdk.io
    public final void a(int i13) {
        if (this.f5642i != i13) {
            throw new e21("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // ads_mobile_sdk.io
    public final boolean b() {
        return (((long) this.f5643j) + this.f5644k) - this.f5645l == ((long) this.f5639f);
    }

    @Override // ads_mobile_sdk.io
    public final void c(int i13) {
        this.f5641h = i13;
        int i14 = this.f5639f + this.f5640g;
        this.f5639f = i14;
        if (i14 <= i13) {
            this.f5640g = 0;
            return;
        }
        int i15 = i14 - i13;
        this.f5640g = i15;
        this.f5639f = i14 - i15;
    }

    @Override // ads_mobile_sdk.io
    public final int d(int i13) {
        if (i13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int a13 = a() + i13;
        int i14 = this.f5641h;
        if (a13 > i14) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5641h = a13;
        int i15 = this.f5639f + this.f5640g;
        this.f5639f = i15;
        if (i15 > a13) {
            int i16 = i15 - a13;
            this.f5640g = i16;
            this.f5639f = i15 - i16;
        } else {
            this.f5640g = 0;
        }
        return i14;
    }

    @Override // ads_mobile_sdk.io
    public final double e() {
        return Double.longBitsToDouble(x());
    }

    @Override // ads_mobile_sdk.io
    public final int f() {
        return y();
    }

    @Override // ads_mobile_sdk.io
    public final int g() {
        return w();
    }

    @Override // ads_mobile_sdk.io
    public final long h() {
        return x();
    }

    @Override // ads_mobile_sdk.io
    public final float i() {
        return Float.intBitsToFloat(w());
    }

    @Override // ads_mobile_sdk.io
    public final int j() {
        return y();
    }

    @Override // ads_mobile_sdk.io
    public final long k() {
        return z();
    }

    @Override // ads_mobile_sdk.io
    public final int l() {
        return w();
    }

    @Override // ads_mobile_sdk.io
    public final long m() {
        return x();
    }

    @Override // ads_mobile_sdk.io
    public final int n() {
        return io.b(y());
    }

    @Override // ads_mobile_sdk.io
    public final long o() {
        return io.a(z());
    }

    @Override // ads_mobile_sdk.io
    public final String p() {
        int y13 = y();
        if (y13 > 0) {
            long j13 = y13;
            long j14 = this.f5646m;
            long j15 = this.f5644k;
            if (j13 <= j14 - j15) {
                byte[] bArr = new byte[y13];
                mw2.f8408c.a(j15, bArr, 0L, j13);
                String str = new String(bArr, hw0.f6126a);
                this.f5644k += j13;
                return str;
            }
        }
        if (y13 > 0 && y13 <= ((int) (((this.f5639f - this.f5643j) - this.f5644k) + this.f5645l))) {
            byte[] bArr2 = new byte[y13];
            a(bArr2, y13);
            return new String(bArr2, hw0.f6126a);
        }
        if (y13 == 0) {
            return "";
        }
        if (y13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    @Override // ads_mobile_sdk.io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String q() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.go.q():java.lang.String");
    }

    @Override // ads_mobile_sdk.io
    public final int r() {
        if (b()) {
            this.f5642i = 0;
            return 0;
        }
        int y13 = y();
        this.f5642i = y13;
        if ((y13 >>> 3) != 0) {
            return y13;
        }
        throw new e21("Protocol message contained an invalid tag (zero).");
    }

    @Override // ads_mobile_sdk.io
    public final int s() {
        return y();
    }

    @Override // ads_mobile_sdk.io
    public final long t() {
        return z();
    }

    public final byte v() {
        if (this.f5646m - this.f5644k == 0) {
            if (!this.f5637d.hasNext()) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            A();
        }
        long j13 = this.f5644k;
        this.f5644k = 1 + j13;
        return mw2.f8408c.a(j13);
    }

    public final int w() {
        long j13 = this.f5646m;
        long j14 = this.f5644k;
        if (j13 - j14 < 4) {
            return (v() & 255) | ((v() & 255) << 8) | ((v() & 255) << 16) | ((v() & 255) << 24);
        }
        this.f5644k = 4 + j14;
        lw2 lw2Var = mw2.f8408c;
        return ((lw2Var.a(j14 + 3) & 255) << 24) | (lw2Var.a(j14) & 255) | ((lw2Var.a(1 + j14) & 255) << 8) | ((lw2Var.a(2 + j14) & 255) << 16);
    }

    public final long x() {
        long j13 = this.f5646m;
        long j14 = this.f5644k;
        if (j13 - j14 < 8) {
            return ((v() & 255) << 56) | (v() & 255) | ((v() & 255) << 8) | ((v() & 255) << 16) | ((v() & 255) << 24) | ((v() & 255) << 32) | ((v() & 255) << 40) | ((v() & 255) << 48);
        }
        this.f5644k = 8 + j14;
        lw2 lw2Var = mw2.f8408c;
        return ((lw2Var.a(j14 + 7) & 255) << 56) | (lw2Var.a(j14) & 255) | ((lw2Var.a(j14 + 1) & 255) << 8) | ((lw2Var.a(2 + j14) & 255) << 16) | ((lw2Var.a(3 + j14) & 255) << 24) | ((lw2Var.a(4 + j14) & 255) << 32) | ((lw2Var.a(5 + j14) & 255) << 40) | ((lw2Var.a(6 + j14) & 255) << 48);
    }

    public final int y() {
        int i13;
        long j13 = this.f5644k;
        if (this.f5646m != j13) {
            long j14 = j13 + 1;
            lw2 lw2Var = mw2.f8408c;
            byte a13 = lw2Var.a(j13);
            if (a13 >= 0) {
                this.f5644k++;
                return a13;
            }
            if (this.f5646m - this.f5644k >= 10) {
                long j15 = 2 + j13;
                int a14 = (lw2Var.a(j14) << 7) ^ a13;
                if (a14 < 0) {
                    i13 = a14 ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int a15 = (lw2Var.a(j15) << 14) ^ a14;
                    if (a15 >= 0) {
                        i13 = a15 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int a16 = a15 ^ (lw2Var.a(j16) << 21);
                        if (a16 < 0) {
                            i13 = (-2080896) ^ a16;
                            j15 = j17;
                        } else {
                            j16 = 5 + j13;
                            byte a17 = lw2Var.a(j17);
                            int i14 = (a16 ^ (a17 << 28)) ^ 266354560;
                            if (a17 < 0) {
                                long j18 = 6 + j13;
                                if (lw2Var.a(j16) < 0) {
                                    j16 = 7 + j13;
                                    if (lw2Var.a(j18) < 0) {
                                        j18 = 8 + j13;
                                        if (lw2Var.a(j16) < 0) {
                                            j16 = 9 + j13;
                                            if (lw2Var.a(j18) < 0) {
                                                long j19 = j13 + 10;
                                                if (lw2Var.a(j16) >= 0) {
                                                    j16 = j19;
                                                }
                                            }
                                        }
                                    }
                                }
                                j16 = j18;
                            }
                            i13 = i14;
                        }
                    }
                    j15 = j16;
                }
                this.f5644k = j15;
                return i13;
            }
        }
        long j23 = 0;
        for (int i15 = 0; i15 < 64; i15 += 7) {
            j23 |= (r3 & Byte.MAX_VALUE) << i15;
            if ((v() & 128) == 0) {
                return (int) j23;
            }
        }
        throw new e21("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (r3.a(r13) < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.go.z():long");
    }

    @Override // ads_mobile_sdk.io
    public final boolean e(int i13) {
        int i14 = i13 & 7;
        if (i14 == 0) {
            for (int i15 = 0; i15 < 10; i15++) {
                if (v() >= 0) {
                    return true;
                }
            }
            throw new e21("CodedInputStream encountered a malformed varint.");
        }
        if (i14 == 1) {
            f(8);
            return true;
        }
        if (i14 == 2) {
            f(y());
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
        int i16 = e21.f4580b;
        throw new d21();
    }

    public final void f(int i13) {
        if (i13 < 0 || i13 > ((this.f5639f - this.f5643j) - this.f5644k) + this.f5645l) {
            if (i13 >= 0) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        while (i13 > 0) {
            if (this.f5646m - this.f5644k == 0) {
                if (!this.f5637d.hasNext()) {
                    throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                A();
            }
            int min = Math.min(i13, (int) (this.f5646m - this.f5644k));
            i13 -= min;
            this.f5644k += min;
        }
    }

    @Override // ads_mobile_sdk.io
    public final int a() {
        return (int) ((this.f5643j + this.f5644k) - this.f5645l);
    }

    public final void a(byte[] bArr, int i13) {
        if (i13 < 0 || i13 > ((int) (((this.f5639f - this.f5643j) - this.f5644k) + this.f5645l))) {
            if (i13 > 0) {
                throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 != 0) {
                throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            return;
        }
        int i14 = i13;
        while (i14 > 0) {
            if (this.f5646m - this.f5644k == 0) {
                if (this.f5637d.hasNext()) {
                    A();
                } else {
                    throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            int min = Math.min(i14, (int) (this.f5646m - this.f5644k));
            long j13 = min;
            mw2.f8408c.a(this.f5644k, bArr, i13 - i14, j13);
            i14 -= min;
            this.f5644k += j13;
        }
    }

    @Override // ads_mobile_sdk.io
    public final boolean c() {
        return z() != 0;
    }

    @Override // ads_mobile_sdk.io
    public final gl d() {
        int y13 = y();
        if (y13 > 0) {
            long j13 = y13;
            long j14 = this.f5646m;
            long j15 = this.f5644k;
            if (j13 <= j14 - j15) {
                byte[] bArr = new byte[y13];
                mw2.f8408c.a(j15, bArr, 0L, j13);
                this.f5644k += j13;
                gl glVar = il.f6431b;
                return new gl(bArr);
            }
        }
        if (y13 > 0 && y13 <= ((int) (((this.f5639f - this.f5643j) - this.f5644k) + this.f5645l))) {
            byte[] bArr2 = new byte[y13];
            a(bArr2, y13);
            gl glVar2 = il.f6431b;
            return new gl(bArr2);
        }
        if (y13 == 0) {
            return il.f6431b;
        }
        if (y13 < 0) {
            throw new e21("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
