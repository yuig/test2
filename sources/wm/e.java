package wm;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f130226e = new e(f.f130231b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f130227a;

    /* renamed from: b, reason: collision with root package name */
    public final f f130228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130229c;

    /* renamed from: d, reason: collision with root package name */
    public final int f130230d;

    public e(f fVar, int i13, int i14, int i15) {
        this.f130228b = fVar;
        this.f130227a = i13;
        this.f130229c = i14;
        this.f130230d = i15;
    }

    public final e a(int i13) {
        f fVar = this.f130228b;
        int i14 = this.f130227a;
        int i15 = this.f130230d;
        if (i14 == 4 || i14 == 2) {
            int[] iArr = c.f130220c[i14];
            i14 = 0;
            int i16 = iArr[0];
            int i17 = 65535 & i16;
            int i18 = i16 >> 16;
            fVar.getClass();
            i15 += i18;
            fVar = new d(fVar, i17, i18);
        }
        int i19 = this.f130229c;
        int i23 = (i19 == 0 || i19 == 31) ? 18 : i19 == 62 ? 9 : 8;
        int i24 = i19 + 1;
        e eVar = new e(fVar, i14, i24, i15 + i23);
        return i24 == 2078 ? eVar.b(i13 + 1) : eVar;
    }

    public final e b(int i13) {
        int i14 = this.f130229c;
        if (i14 == 0) {
            return this;
        }
        f fVar = this.f130228b;
        fVar.getClass();
        return new e(new a(fVar, i13 - i14, i14), this.f130227a, 0, this.f130230d);
    }

    public final boolean c(e eVar) {
        int i13;
        int i14 = this.f130230d + (c.f130220c[this.f130227a][eVar.f130227a] >> 16);
        int i15 = eVar.f130229c;
        if (i15 > 0 && ((i13 = this.f130229c) == 0 || i13 > i15)) {
            i14 += 10;
        }
        return i14 <= eVar.f130230d;
    }

    public final e d(int i13, int i14) {
        int i15 = this.f130230d;
        f fVar = this.f130228b;
        int i16 = this.f130227a;
        if (i13 != i16) {
            int i17 = c.f130220c[i16][i13];
            int i18 = 65535 & i17;
            int i19 = i17 >> 16;
            fVar.getClass();
            i15 += i19;
            fVar = new d(fVar, i18, i19);
        }
        int i23 = i13 == 2 ? 4 : 5;
        fVar.getClass();
        return new e(new d(fVar, i14, i23), i13, 0, i15 + i23);
    }

    public final e e(int i13, int i14) {
        int i15 = this.f130227a;
        int i16 = i15 == 2 ? 4 : 5;
        int i17 = c.f130222e[i15][i13];
        f fVar = this.f130228b;
        fVar.getClass();
        return new e(new d(new d(fVar, i17, i16), i14, 5), i15, 0, this.f130230d + i16 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", c.f130219b[this.f130227a], Integer.valueOf(this.f130230d), Integer.valueOf(this.f130229c));
    }
}
