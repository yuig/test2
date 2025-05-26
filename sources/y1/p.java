package y1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136594a;

    /* renamed from: b, reason: collision with root package name */
    public int f136595b;

    /* renamed from: c, reason: collision with root package name */
    public char[] f136596c;

    /* renamed from: d, reason: collision with root package name */
    public int f136597d;

    /* renamed from: e, reason: collision with root package name */
    public int f136598e;

    public p(char[] cArr, int i13, int i14, int i15) {
        this.f136594a = i15;
        if (i15 != 1) {
            this.f136595b = cArr.length;
            this.f136596c = cArr;
            this.f136597d = i13;
            this.f136598e = i14;
            return;
        }
        this.f136595b = cArr.length;
        this.f136596c = cArr;
        this.f136597d = i13;
        this.f136598e = i14;
    }

    public final void a(StringBuilder sb3) {
        switch (this.f136594a) {
            case 0:
                sb3.append(this.f136596c, 0, this.f136597d);
                Intrinsics.checkNotNullExpressionValue(sb3, "this.append(value, start…x, endIndex - startIndex)");
                char[] cArr = this.f136596c;
                int i13 = this.f136598e;
                sb3.append(cArr, i13, this.f136595b - i13);
                Intrinsics.checkNotNullExpressionValue(sb3, "this.append(value, start…x, endIndex - startIndex)");
                break;
            default:
                sb3.append(this.f136596c, 0, this.f136597d);
                Intrinsics.checkNotNullExpressionValue(sb3, "this.append(value, start…x, endIndex - startIndex)");
                char[] cArr2 = this.f136596c;
                int i14 = this.f136598e;
                sb3.append(cArr2, i14, this.f136595b - i14);
                Intrinsics.checkNotNullExpressionValue(sb3, "this.append(value, start…x, endIndex - startIndex)");
                break;
        }
    }

    public final void b(int i13, int i14) {
        switch (this.f136594a) {
            case 0:
                int i15 = this.f136597d;
                if (i13 < i15 && i14 <= i15) {
                    int i16 = i15 - i14;
                    char[] cArr = this.f136596c;
                    kotlin.collections.z.i(cArr, cArr, this.f136598e - i16, i14, i15);
                    this.f136597d = i13;
                    this.f136598e -= i16;
                    break;
                } else if (i13 < i15 && i14 >= i15) {
                    this.f136598e = c() + i14;
                    this.f136597d = i13;
                    break;
                } else {
                    int c13 = c() + i13;
                    int c14 = c() + i14;
                    int i17 = this.f136598e;
                    char[] cArr2 = this.f136596c;
                    kotlin.collections.z.i(cArr2, cArr2, this.f136597d, i17, c13);
                    this.f136597d += c13 - i17;
                    this.f136598e = c14;
                    break;
                }
            default:
                int i18 = this.f136597d;
                if (i13 < i18 && i14 <= i18) {
                    int i19 = i18 - i14;
                    char[] cArr3 = this.f136596c;
                    kotlin.collections.z.i(cArr3, cArr3, this.f136598e - i19, i14, i18);
                    this.f136597d = i13;
                    this.f136598e -= i19;
                    break;
                } else if (i13 < i18 && i14 >= i18) {
                    this.f136598e = c() + i14;
                    this.f136597d = i13;
                    break;
                } else {
                    int c15 = c() + i13;
                    int c16 = c() + i14;
                    int i23 = this.f136598e;
                    char[] cArr4 = this.f136596c;
                    kotlin.collections.z.i(cArr4, cArr4, this.f136597d, i23, c15);
                    this.f136597d += c15 - i23;
                    this.f136598e = c16;
                    break;
                }
        }
    }

    public final int c() {
        switch (this.f136594a) {
        }
        return this.f136598e - this.f136597d;
    }

    public final char d(int i13) {
        switch (this.f136594a) {
            case 0:
                int i14 = this.f136597d;
                return i13 < i14 ? this.f136596c[i13] : this.f136596c[(i13 - i14) + this.f136598e];
            default:
                int i15 = this.f136597d;
                return i13 < i15 ? this.f136596c[i13] : this.f136596c[(i13 - i15) + this.f136598e];
        }
    }

    public final int e() {
        switch (this.f136594a) {
        }
        return this.f136595b - c();
    }

    public final void f(int i13) {
        switch (this.f136594a) {
            case 0:
                if (i13 > c()) {
                    int c13 = i13 - c();
                    int i14 = this.f136595b;
                    do {
                        i14 *= 2;
                    } while (i14 - this.f136595b < c13);
                    char[] cArr = new char[i14];
                    kotlin.collections.z.i(this.f136596c, cArr, 0, 0, this.f136597d);
                    int i15 = this.f136595b;
                    int i16 = this.f136598e;
                    int i17 = i15 - i16;
                    int i18 = i14 - i17;
                    kotlin.collections.z.i(this.f136596c, cArr, i18, i16, i17 + i16);
                    this.f136596c = cArr;
                    this.f136595b = i14;
                    this.f136598e = i18;
                    break;
                }
                break;
            default:
                if (i13 > c()) {
                    int c14 = i13 - c();
                    int i19 = this.f136595b;
                    do {
                        i19 *= 2;
                    } while (i19 - this.f136595b < c14);
                    char[] cArr2 = new char[i19];
                    kotlin.collections.z.i(this.f136596c, cArr2, 0, 0, this.f136597d);
                    int i23 = this.f136595b;
                    int i24 = this.f136598e;
                    int i25 = i23 - i24;
                    int i26 = i19 - i25;
                    kotlin.collections.z.i(this.f136596c, cArr2, i26, i24, i25 + i24);
                    this.f136596c = cArr2;
                    this.f136595b = i19;
                    this.f136598e = i26;
                    break;
                }
                break;
        }
    }

    public final String toString() {
        return "";
    }
}
