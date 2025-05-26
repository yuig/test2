package zm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public int f142210c;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f142212e;

    /* renamed from: f, reason: collision with root package name */
    public int f142213f;

    /* renamed from: i, reason: collision with root package name */
    public int f142216i;

    /* renamed from: h, reason: collision with root package name */
    public int f142215h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f142208a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f142209b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f142211d = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f142214g = 0;

    public h(InputStream inputStream) {
        this.f142212e = inputStream;
    }

    public final int a() {
        int i13 = this.f142215h;
        if (i13 == Integer.MAX_VALUE) {
            return -1;
        }
        return i13 - (this.f142214g + this.f142211d);
    }

    public final void b(int i13) {
        this.f142215h = i13;
        p();
    }

    public final int c(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i14 = this.f142214g + this.f142211d + i13;
        int i15 = this.f142215h;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.g();
        }
        this.f142215h = i14;
        p();
        return i15;
    }

    public final z d() {
        int j13 = j();
        int i13 = this.f142209b;
        int i14 = this.f142211d;
        if (j13 > i13 - i14 || j13 <= 0) {
            return j13 == 0 ? g.f142207a : new z(g(j13));
        }
        byte[] bArr = new byte[j13];
        System.arraycopy(this.f142208a, i14, bArr, 0, j13);
        z zVar = new z(bArr);
        this.f142211d += j13;
        return zVar;
    }

    public final int e() {
        return j();
    }

    public final c f(d dVar, k kVar) {
        int j13 = j();
        if (this.f142216i >= 64) {
            throw InvalidProtocolBufferException.e();
        }
        int c13 = c(j13);
        this.f142216i++;
        t a13 = dVar.a(this, kVar);
        if (this.f142213f != 0) {
            throw InvalidProtocolBufferException.a();
        }
        this.f142216i--;
        b(c13);
        return a13;
    }

    public final byte[] g(int i13) {
        if (i13 <= 0) {
            if (i13 == 0) {
                return w.f142256a;
            }
            throw InvalidProtocolBufferException.d();
        }
        int i14 = this.f142214g;
        int i15 = this.f142211d;
        int i16 = i14 + i15 + i13;
        int i17 = this.f142215h;
        if (i16 > i17) {
            s((i17 - i14) - i15);
            throw InvalidProtocolBufferException.g();
        }
        byte[] bArr = this.f142208a;
        if (i13 < 4096) {
            byte[] bArr2 = new byte[i13];
            int i18 = this.f142209b - i15;
            System.arraycopy(bArr, i15, bArr2, 0, i18);
            int i19 = this.f142209b;
            this.f142211d = i19;
            int i23 = i13 - i18;
            if (i19 - i19 < i23) {
                q(i23);
            }
            System.arraycopy(bArr, 0, bArr2, i18, i23);
            this.f142211d = i23;
            return bArr2;
        }
        int i24 = this.f142209b;
        this.f142214g = i14 + i24;
        this.f142211d = 0;
        this.f142209b = 0;
        int i25 = i24 - i15;
        int i26 = i13 - i25;
        ArrayList arrayList = new ArrayList();
        while (i26 > 0) {
            int min = Math.min(i26, 4096);
            byte[] bArr3 = new byte[min];
            int i27 = 0;
            while (i27 < min) {
                InputStream inputStream = this.f142212e;
                int read = inputStream == null ? -1 : inputStream.read(bArr3, i27, min - i27);
                if (read == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f142214g += read;
                i27 += read;
            }
            i26 -= min;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i13];
        System.arraycopy(bArr, i15, bArr4, 0, i25);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, i25, bArr5.length);
            i25 += bArr5.length;
        }
        return bArr4;
    }

    public final int h() {
        int i13 = this.f142211d;
        if (this.f142209b - i13 < 4) {
            q(4);
            i13 = this.f142211d;
        }
        this.f142211d = i13 + 4;
        byte[] bArr = this.f142208a;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public final long i() {
        int i13 = this.f142211d;
        if (this.f142209b - i13 < 8) {
            q(8);
            i13 = this.f142211d;
        }
        this.f142211d = i13 + 8;
        byte[] bArr = this.f142208a;
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public final int j() {
        int i13;
        int i14 = this.f142211d;
        int i15 = this.f142209b;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f142208a;
            byte b13 = bArr[i14];
            if (b13 >= 0) {
                this.f142211d = i16;
                return b13;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                int i18 = (bArr[i16] << 7) ^ b13;
                long j13 = i18;
                if (j13 < 0) {
                    i13 = (int) ((-128) ^ j13);
                } else {
                    int i19 = i14 + 3;
                    int i23 = (bArr[i17] << 14) ^ i18;
                    long j14 = i23;
                    if (j14 >= 0) {
                        i13 = (int) (16256 ^ j14);
                    } else {
                        int i24 = i14 + 4;
                        long j15 = i23 ^ (bArr[i19] << 21);
                        if (j15 < 0) {
                            i13 = (int) ((-2080896) ^ j15);
                        } else {
                            i19 = i14 + 5;
                            int i25 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i24] < 0) {
                                i24 = i14 + 6;
                                if (bArr[i19] < 0) {
                                    i19 = i14 + 7;
                                    if (bArr[i24] < 0) {
                                        i24 = i14 + 8;
                                        if (bArr[i19] < 0) {
                                            i19 = i14 + 9;
                                            if (bArr[i24] < 0) {
                                                int i26 = i14 + 10;
                                                if (bArr[i19] >= 0) {
                                                    i17 = i26;
                                                    i13 = i25;
                                                }
                                            }
                                        }
                                    }
                                }
                                i13 = i25;
                            }
                            i13 = i25;
                        }
                        i17 = i24;
                    }
                    i17 = i19;
                }
                this.f142211d = i17;
                return i13;
            }
        }
        return (int) l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zm2.h.k():long");
    }

    public final long l() {
        long j13 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f142211d == this.f142209b) {
                q(1);
            }
            int i14 = this.f142211d;
            this.f142211d = i14 + 1;
            j13 |= (r3 & Byte.MAX_VALUE) << i13;
            if ((this.f142208a[i14] & 128) == 0) {
                return j13;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final int m() {
        int j13 = j();
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public final String n() {
        int j13 = j();
        int i13 = this.f142209b;
        int i14 = this.f142211d;
        if (j13 > i13 - i14 || j13 <= 0) {
            return j13 == 0 ? "" : new String(g(j13), "UTF-8");
        }
        String str = new String(this.f142208a, i14, j13, "UTF-8");
        this.f142211d += j13;
        return str;
    }

    public final int o() {
        if (this.f142211d == this.f142209b && !t(1)) {
            this.f142213f = 0;
            return 0;
        }
        int j13 = j();
        this.f142213f = j13;
        if ((j13 >>> 3) != 0) {
            return j13;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void p() {
        int i13 = this.f142209b + this.f142210c;
        this.f142209b = i13;
        int i14 = this.f142214g + i13;
        int i15 = this.f142215h;
        if (i14 <= i15) {
            this.f142210c = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f142210c = i16;
        this.f142209b = i13 - i16;
    }

    public final void q(int i13) {
        if (!t(i13)) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final boolean r(int i13, i iVar) {
        int o13;
        int i14 = i13 & 7;
        if (i14 == 0) {
            long k13 = k();
            iVar.P(i13);
            iVar.Q(k13);
            return true;
        }
        if (i14 == 1) {
            long i15 = i();
            iVar.P(i13);
            iVar.O(i15);
            return true;
        }
        if (i14 == 2) {
            z d2 = d();
            iVar.P(i13);
            iVar.x(d2);
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int h10 = h();
            iVar.P(i13);
            iVar.N(h10);
            return true;
        }
        iVar.P(i13);
        do {
            o13 = o();
            if (o13 == 0) {
                break;
            }
        } while (r(o13, iVar));
        int i16 = ((i13 >>> 3) << 3) | 4;
        if (this.f142213f != i16) {
            throw InvalidProtocolBufferException.a();
        }
        iVar.P(i16);
        return true;
    }

    public final void s(int i13) {
        int i14 = this.f142209b;
        int i15 = this.f142211d;
        if (i13 <= i14 - i15 && i13 >= 0) {
            this.f142211d = i15 + i13;
            return;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i16 = this.f142214g;
        int i17 = i16 + i15 + i13;
        int i18 = this.f142215h;
        if (i17 > i18) {
            s((i18 - i16) - i15);
            throw InvalidProtocolBufferException.g();
        }
        int i19 = i14 - i15;
        this.f142211d = i14;
        q(1);
        while (true) {
            int i23 = i13 - i19;
            int i24 = this.f142209b;
            if (i23 <= i24) {
                this.f142211d = i23;
                return;
            } else {
                i19 += i24;
                this.f142211d = i24;
                q(1);
            }
        }
    }

    public final boolean t(int i13) {
        InputStream inputStream;
        int i14 = this.f142211d;
        int i15 = i14 + i13;
        int i16 = this.f142209b;
        if (i15 <= i16) {
            StringBuilder sb3 = new StringBuilder(77);
            sb3.append("refillBuffer() called when ");
            sb3.append(i13);
            sb3.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb3.toString());
        }
        if (this.f142214g + i14 + i13 <= this.f142215h && (inputStream = this.f142212e) != null) {
            byte[] bArr = this.f142208a;
            if (i14 > 0) {
                if (i16 > i14) {
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f142214g += i14;
                this.f142209b -= i14;
                this.f142211d = 0;
            }
            int i17 = this.f142209b;
            int read = inputStream.read(bArr, i17, bArr.length - i17);
            if (read == 0 || read < -1 || read > bArr.length) {
                StringBuilder sb4 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
                sb4.append("InputStream#read(byte[]) returned invalid result: ");
                sb4.append(read);
                sb4.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb4.toString());
            }
            if (read > 0) {
                this.f142209b += read;
                if ((this.f142214g + i13) - 67108864 > 0) {
                    throw InvalidProtocolBufferException.f();
                }
                p();
                if (this.f142209b >= i13) {
                    return true;
                }
                return t(i13);
            }
        }
        return false;
    }
}
