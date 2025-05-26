package ads_mobile_sdk;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yv2 {

    /* renamed from: f, reason: collision with root package name */
    public static final yv2 f14423f = new yv2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f14424a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14425b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f14426c;

    /* renamed from: d, reason: collision with root package name */
    public int f14427d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14428e;

    public yv2(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f14424a = i13;
        this.f14425b = iArr;
        this.f14426c = objArr;
        this.f14428e = z13;
    }

    public static yv2 b() {
        return new yv2(0, new int[8], new Object[8], true);
    }

    public final void a(int i13) {
        int[] iArr = this.f14425b;
        if (i13 > iArr.length) {
            int i14 = this.f14424a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f14425b = Arrays.copyOf(iArr, i13);
            this.f14426c = Arrays.copyOf(this.f14426c, i13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yv2)) {
            return false;
        }
        yv2 yv2Var = (yv2) obj;
        int i13 = this.f14424a;
        if (i13 == yv2Var.f14424a) {
            int[] iArr = this.f14425b;
            int[] iArr2 = yv2Var.f14425b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    Object[] objArr = this.f14426c;
                    Object[] objArr2 = yv2Var.f14426c;
                    int i15 = this.f14424a;
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
        int i13 = this.f14424a;
        int i14 = (i13 + 527) * 31;
        int[] iArr = this.f14425b;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i14 + i16) * 31;
        Object[] objArr = this.f14426c;
        int i19 = this.f14424a;
        for (int i23 = 0; i23 < i19; i23++) {
            i15 = (i15 * 31) + objArr[i23].hashCode();
        }
        return i18 + i15;
    }

    public final int a() {
        int h10;
        int i13 = this.f14427d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f14424a; i15++) {
            int i16 = this.f14425b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 == 0) {
                h10 = oo.h(i17) + oo.a(((Long) this.f14426c[i15]).longValue());
            } else if (i18 == 1) {
                ((Long) this.f14426c[i15]).getClass();
                h10 = oo.h(i17) + 8;
            } else if (i18 == 2) {
                h10 = oo.a((il) this.f14426c[i15]) + oo.h(i17);
            } else if (i18 == 3) {
                i14 = ((yv2) this.f14426c[i15]).a() + (oo.h(i17) * 2) + i14;
            } else if (i18 == 5) {
                ((Integer) this.f14426c[i15]).getClass();
                h10 = oo.h(i17) + 4;
            } else {
                int i19 = e21.f4580b;
                throw new IllegalStateException(new d21());
            }
            i14 = h10 + i14;
        }
        this.f14427d = i14;
        return i14;
    }

    public static yv2 a(yv2 yv2Var, yv2 yv2Var2) {
        int i13 = yv2Var.f14424a + yv2Var2.f14424a;
        int[] copyOf = Arrays.copyOf(yv2Var.f14425b, i13);
        System.arraycopy(yv2Var2.f14425b, 0, copyOf, yv2Var.f14424a, yv2Var2.f14424a);
        Object[] copyOf2 = Arrays.copyOf(yv2Var.f14426c, i13);
        System.arraycopy(yv2Var2.f14426c, 0, copyOf2, yv2Var.f14424a, yv2Var2.f14424a);
        return new yv2(i13, copyOf, copyOf2, true);
    }

    public final void a(int i13, StringBuilder sb3) {
        for (int i14 = 0; i14 < this.f14424a; i14++) {
            xa1.a(sb3, i13, String.valueOf(this.f14425b[i14] >>> 3), this.f14426c[i14]);
        }
    }

    public final void a(int i13, Object obj) {
        if (this.f14428e) {
            a(this.f14424a + 1);
            int[] iArr = this.f14425b;
            int i14 = this.f14424a;
            iArr[i14] = i13;
            this.f14426c[i14] = obj;
            this.f14424a = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(po poVar) {
        if (this.f14424a == 0) {
            return;
        }
        poVar.getClass();
        for (int i13 = 0; i13 < this.f14424a; i13++) {
            int i14 = this.f14425b[i13];
            Object obj = this.f14426c[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                poVar.f9758a.e(i15, ((Long) obj).longValue());
            } else if (i16 == 1) {
                poVar.f9758a.d(i15, ((Long) obj).longValue());
            } else if (i16 == 2) {
                poVar.f9758a.b(i15, (il) obj);
            } else if (i16 == 3) {
                poVar.f9758a.g(i15, 3);
                ((yv2) obj).a(poVar);
                poVar.f9758a.g(i15, 4);
            } else if (i16 == 5) {
                poVar.f9758a.e(i15, ((Integer) obj).intValue());
            } else {
                int i17 = e21.f4580b;
                throw new RuntimeException(new d21());
            }
        }
    }
}
