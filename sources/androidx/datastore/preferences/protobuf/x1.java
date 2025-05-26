package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: f */
    public static final x1 f18165f = new x1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f18166a;

    /* renamed from: b */
    public int[] f18167b;

    /* renamed from: c */
    public Object[] f18168c;

    /* renamed from: d */
    public int f18169d = -1;

    /* renamed from: e */
    public boolean f18170e;

    public x1(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f18166a = i13;
        this.f18167b = iArr;
        this.f18168c = objArr;
        this.f18170e = z13;
    }

    public static x1 b() {
        return new x1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int G;
        int i13 = this.f18169d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f18166a; i15++) {
            int i16 = this.f18167b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 == 0) {
                G = q.G(i17, ((Long) this.f18168c[i15]).longValue());
            } else if (i18 == 1) {
                ((Long) this.f18168c[i15]).getClass();
                G = q.o(i17);
            } else if (i18 == 2) {
                G = q.i(i17, (i) this.f18168c[i15]);
            } else if (i18 == 3) {
                i14 = ((x1) this.f18168c[i15]).a() + (q.D(i17) * 2) + i14;
            } else {
                if (i18 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                ((Integer) this.f18168c[i15]).getClass();
                G = q.n(i17);
            }
            i14 = G + i14;
        }
        this.f18169d = i14;
        return i14;
    }

    public final void c(int i13, Object obj) {
        if (!this.f18170e) {
            throw new UnsupportedOperationException();
        }
        int i14 = this.f18166a;
        int[] iArr = this.f18167b;
        if (i14 == iArr.length) {
            int i15 = i14 + (i14 < 4 ? 8 : i14 >> 1);
            this.f18167b = Arrays.copyOf(iArr, i15);
            this.f18168c = Arrays.copyOf(this.f18168c, i15);
        }
        int[] iArr2 = this.f18167b;
        int i16 = this.f18166a;
        iArr2[i16] = i13;
        this.f18168c[i16] = obj;
        this.f18166a = i16 + 1;
    }

    public final void d(h1.b bVar) {
        if (this.f18166a == 0) {
            return;
        }
        bVar.getClass();
        s2 s2Var = s2.ASCENDING;
        for (int i13 = 0; i13 < this.f18166a; i13++) {
            int i14 = this.f18167b[i13];
            Object obj = this.f18168c[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                bVar.w(i15, ((Long) obj).longValue());
            } else if (i16 == 1) {
                bVar.s(i15, ((Long) obj).longValue());
            } else if (i16 == 2) {
                bVar.o(i15, (i) obj);
            } else if (i16 == 3) {
                s2 s2Var2 = s2.ASCENDING;
                ((q) bVar.f66449b).i0(i15, 3);
                ((x1) obj).d(bVar);
                ((q) bVar.f66449b).i0(i15, 4);
            } else {
                if (i16 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.d());
                }
                bVar.r(i15, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        int i13 = this.f18166a;
        if (i13 == x1Var.f18166a) {
            int[] iArr = this.f18167b;
            int[] iArr2 = x1Var.f18167b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    Object[] objArr = this.f18168c;
                    Object[] objArr2 = x1Var.f18168c;
                    int i15 = this.f18166a;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (objArr[i16].equals(objArr2[i16])) {
                        }
                    }
                    return true;
                }
                if (iArr[i14] != iArr2[i14]) {
                    break;
                }
                i14++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f18166a;
        int i14 = (527 + i13) * 31;
        int[] iArr = this.f18167b;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i14 + i16) * 31;
        Object[] objArr = this.f18168c;
        int i19 = this.f18166a;
        for (int i23 = 0; i23 < i19; i23++) {
            i15 = (i15 * 31) + objArr[i23].hashCode();
        }
        return i18 + i15;
    }
}
