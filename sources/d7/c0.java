package d7;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53792a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f53793b;

    /* renamed from: c, reason: collision with root package name */
    public int f53794c;

    /* renamed from: d, reason: collision with root package name */
    public int f53795d;

    /* renamed from: e, reason: collision with root package name */
    public int f53796e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(byte[] bArr, int i13, int i14) {
        this(bArr, bArr.length);
        this.f53792a = i13;
        if (i13 != 1) {
        } else {
            this.f53793b = bArr;
            this.f53794c = bArr.length;
        }
    }

    public final void a() {
        int i13;
        int i14;
        boolean z13 = false;
        switch (this.f53792a) {
            case 0:
                int i15 = this.f53794c;
                if (i15 >= 0 && (i15 < (i13 = this.f53796e) || (i15 == i13 && this.f53795d == 0))) {
                    z13 = true;
                }
                bf.b.t(z13);
                break;
            default:
                int i16 = this.f53795d;
                if (i16 >= 0 && (i16 < (i14 = this.f53794c) || (i16 == i14 && this.f53796e == 0))) {
                    z13 = true;
                }
                bf.b.t(z13);
                break;
        }
    }

    public final int b() {
        return ((this.f53796e - this.f53794c) * 8) - this.f53795d;
    }

    public final void c() {
        if (this.f53795d == 0) {
            return;
        }
        this.f53795d = 0;
        this.f53794c++;
        a();
    }

    public final int d() {
        bf.b.t(this.f53795d == 0);
        return this.f53794c;
    }

    public final int e() {
        switch (this.f53792a) {
            case 0:
                return (this.f53794c * 8) + this.f53795d;
            default:
                return (this.f53795d * 8) + this.f53796e;
        }
    }

    public final boolean f() {
        boolean z13;
        switch (this.f53792a) {
            case 0:
                z13 = (this.f53793b[this.f53794c] & (RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN >> this.f53795d)) != 0;
                n();
                break;
            default:
                z13 = (((this.f53793b[this.f53795d] & 255) >> this.f53796e) & 1) == 1;
                o(1);
                break;
        }
        return z13;
    }

    public final int g(int i13) {
        switch (this.f53792a) {
            case 0:
                if (i13 == 0) {
                    return 0;
                }
                this.f53795d += i13;
                int i14 = 0;
                while (true) {
                    int i15 = this.f53795d;
                    if (i15 <= 8) {
                        byte[] bArr = this.f53793b;
                        int i16 = this.f53794c;
                        int i17 = ((-1) >>> (32 - i13)) & (((255 & bArr[i16]) >> (8 - i15)) | i14);
                        if (i15 == 8) {
                            this.f53795d = 0;
                            this.f53794c = i16 + 1;
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.f53795d = i18;
                    byte[] bArr2 = this.f53793b;
                    int i19 = this.f53794c;
                    this.f53794c = i19 + 1;
                    i14 |= (bArr2[i19] & 255) << i18;
                }
            default:
                int i23 = this.f53795d;
                int min = Math.min(i13, 8 - this.f53796e);
                int i24 = i23 + 1;
                int i25 = ((this.f53793b[i23] & 255) >> this.f53796e) & (255 >> (8 - min));
                while (min < i13) {
                    i25 |= (this.f53793b[i24] & 255) << min;
                    min += 8;
                    i24++;
                }
                int i26 = i25 & ((-1) >>> (32 - i13));
                o(i13);
                return i26;
        }
    }

    public final void h(byte[] bArr, int i13) {
        int i14 = i13 >> 3;
        for (int i15 = 0; i15 < i14; i15++) {
            byte[] bArr2 = this.f53793b;
            int i16 = this.f53794c;
            int i17 = i16 + 1;
            this.f53794c = i17;
            byte b13 = bArr2[i16];
            int i18 = this.f53795d;
            byte b14 = (byte) (b13 << i18);
            bArr[i15] = b14;
            bArr[i15] = (byte) (((255 & bArr2[i17]) >> (8 - i18)) | b14);
        }
        int i19 = i13 & 7;
        if (i19 == 0) {
            return;
        }
        byte b15 = (byte) (bArr[i14] & (255 >> i19));
        bArr[i14] = b15;
        int i23 = this.f53795d;
        if (i23 + i19 > 8) {
            byte[] bArr3 = this.f53793b;
            int i24 = this.f53794c;
            this.f53794c = i24 + 1;
            bArr[i14] = (byte) (b15 | ((bArr3[i24] & 255) << i23));
            this.f53795d = i23 - 8;
        }
        int i25 = this.f53795d + i19;
        this.f53795d = i25;
        byte[] bArr4 = this.f53793b;
        int i26 = this.f53794c;
        bArr[i14] = (byte) (((byte) (((255 & bArr4[i26]) >> (8 - i25)) << (8 - i19))) | bArr[i14]);
        if (i25 == 8) {
            this.f53795d = 0;
            this.f53794c = i26 + 1;
        }
        a();
    }

    public final long i(int i13) {
        if (i13 <= 32) {
            int g13 = g(i13);
            int i14 = n0.f53866a;
            return 4294967295L & g13;
        }
        int g14 = g(i13 - 32);
        int g15 = g(32);
        int i15 = n0.f53866a;
        return (4294967295L & g15) | ((g14 & 4294967295L) << 32);
    }

    public final void j(byte[] bArr, int i13) {
        bf.b.t(this.f53795d == 0);
        System.arraycopy(this.f53793b, this.f53794c, bArr, 0, i13);
        this.f53794c += i13;
        a();
    }

    public final void k(int i13, byte[] bArr) {
        this.f53793b = bArr;
        this.f53794c = 0;
        this.f53795d = 0;
        this.f53796e = i13;
    }

    public final void l(d0 d0Var) {
        k(d0Var.f53808c, d0Var.f53806a);
        m(d0Var.f53807b * 8);
    }

    public final void m(int i13) {
        int i14 = i13 / 8;
        this.f53794c = i14;
        this.f53795d = i13 - (i14 * 8);
        a();
    }

    public final void n() {
        int i13 = this.f53795d + 1;
        this.f53795d = i13;
        if (i13 == 8) {
            this.f53795d = 0;
            this.f53794c++;
        }
        a();
    }

    public final void o(int i13) {
        switch (this.f53792a) {
            case 0:
                int i14 = i13 / 8;
                int i15 = this.f53794c + i14;
                this.f53794c = i15;
                int i16 = (i13 - (i14 * 8)) + this.f53795d;
                this.f53795d = i16;
                if (i16 > 7) {
                    this.f53794c = i15 + 1;
                    this.f53795d = i16 - 8;
                }
                a();
                break;
            default:
                int i17 = i13 / 8;
                int i18 = this.f53795d + i17;
                this.f53795d = i18;
                int i19 = (i13 - (i17 * 8)) + this.f53796e;
                this.f53796e = i19;
                if (i19 > 7) {
                    this.f53795d = i18 + 1;
                    this.f53796e = i19 - 8;
                }
                a();
                break;
        }
    }

    public final void p(int i13) {
        bf.b.t(this.f53795d == 0);
        this.f53794c += i13;
        a();
    }

    public c0() {
        this.f53792a = 0;
        this.f53793b = n0.f53868c;
    }

    public c0(byte[] bArr, int i13) {
        this.f53792a = 0;
        this.f53793b = bArr;
        this.f53796e = i13;
    }

    public c0(int i13, int i14) {
        this.f53792a = 2;
        this.f53794c = i13;
        this.f53795d = i14;
        this.f53793b = new byte[(i14 * 2) - 1];
        this.f53796e = 0;
    }
}
