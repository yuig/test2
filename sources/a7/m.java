package a7;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f1143a;

    /* renamed from: b, reason: collision with root package name */
    public int f1144b;

    /* renamed from: c, reason: collision with root package name */
    public int f1145c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f1146d;

    public m(byte[] bArr, int i13, int i14) {
        this.f1146d = bArr;
        this.f1144b = i13;
        this.f1143a = i14;
        this.f1145c = 0;
        a();
    }

    public final void a() {
        int i13;
        int i14 = this.f1144b;
        bf.b.t(i14 >= 0 && (i14 < (i13 = this.f1143a) || (i14 == i13 && this.f1145c == 0)));
    }

    public final void b() {
        int i13 = this.f1145c;
        if (i13 > 0) {
            l(8 - i13);
        }
    }

    public final boolean c(int i13) {
        int i14 = this.f1144b;
        int i15 = i13 / 8;
        int i16 = i14 + i15;
        int i17 = (this.f1145c + i13) - (i15 * 8);
        if (i17 > 7) {
            i16++;
            i17 -= 8;
        }
        while (true) {
            i14++;
            if (i14 > i16 || i16 >= this.f1143a) {
                break;
            }
            if (j(i14)) {
                i16++;
                i14 += 2;
            }
        }
        int i18 = this.f1143a;
        if (i16 >= i18) {
            return i16 == i18 && i17 == 0;
        }
        return true;
    }

    public final boolean d() {
        int i13 = this.f1144b;
        int i14 = this.f1145c;
        int i15 = 0;
        while (this.f1144b < this.f1143a && !e()) {
            i15++;
        }
        boolean z13 = this.f1144b == this.f1143a;
        this.f1144b = i13;
        this.f1145c = i14;
        return !z13 && c((i15 * 2) + 1);
    }

    public final boolean e() {
        boolean z13 = (this.f1146d[this.f1144b] & (RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN >> this.f1145c)) != 0;
        k();
        return z13;
    }

    public final int f(int i13) {
        int i14;
        this.f1145c += i13;
        int i15 = 0;
        while (true) {
            i14 = this.f1145c;
            if (i14 <= 8) {
                break;
            }
            int i16 = i14 - 8;
            this.f1145c = i16;
            byte[] bArr = this.f1146d;
            int i17 = this.f1144b;
            i15 |= (bArr[i17] & 255) << i16;
            if (j(i17 + 1)) {
                r4 = 2;
            }
            this.f1144b = i17 + r4;
        }
        byte[] bArr2 = this.f1146d;
        int i18 = this.f1144b;
        int i19 = ((-1) >>> (32 - i13)) & (i15 | ((bArr2[i18] & 255) >> (8 - i14)));
        if (i14 == 8) {
            this.f1145c = 0;
            this.f1144b = i18 + (j(i18 + 1) ? 2 : 1);
        }
        a();
        return i19;
    }

    public final int g() {
        int i13 = 0;
        while (!e()) {
            i13++;
        }
        return ((1 << i13) - 1) + (i13 > 0 ? f(i13) : 0);
    }

    public final int h() {
        int g13 = g();
        return ((g13 + 1) / 2) * (g13 % 2 == 0 ? -1 : 1);
    }

    public final int i() {
        return g();
    }

    public final boolean j(int i13) {
        if (2 <= i13 && i13 < this.f1143a) {
            byte[] bArr = this.f1146d;
            if (bArr[i13] == 3 && bArr[i13 - 2] == 0 && bArr[i13 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        int i13 = this.f1145c + 1;
        this.f1145c = i13;
        if (i13 == 8) {
            this.f1145c = 0;
            int i14 = this.f1144b;
            this.f1144b = i14 + (j(i14 + 1) ? 2 : 1);
        }
        a();
    }

    public final void l(int i13) {
        int i14 = this.f1144b;
        int i15 = i13 / 8;
        int i16 = i14 + i15;
        this.f1144b = i16;
        int i17 = (i13 - (i15 * 8)) + this.f1145c;
        this.f1145c = i17;
        if (i17 > 7) {
            this.f1144b = i16 + 1;
            this.f1145c = i17 - 8;
        }
        while (true) {
            i14++;
            if (i14 > this.f1144b) {
                a();
                return;
            } else if (j(i14)) {
                this.f1144b++;
                i14 += 2;
            }
        }
    }

    public m() {
        this.f1143a = 0;
    }
}
