package pk;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a3 extends h1 {

    /* renamed from: g, reason: collision with root package name */
    public static final a3 f100350g = new a3(0, null, new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f100351d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f100352e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f100353f;

    public a3(int i13, Object obj, Object[] objArr) {
        this.f100351d = obj;
        this.f100352e = objArr;
        this.f100353f = i13;
    }

    public static a3 k(int i13, Object[] objArr, d7.b0 b0Var) {
        if (i13 == 0) {
            return f100350g;
        }
        if (i13 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new a3(1, null, objArr);
        }
        bf.b.q(i13, objArr.length >> 1);
        Object m13 = m(objArr, i13, o1.n(i13), 0);
        if (m13 instanceof Object[]) {
            Object[] objArr2 = (Object[]) m13;
            f1 f1Var = (f1) objArr2[2];
            if (b0Var == null) {
                throw f1Var.a();
            }
            b0Var.f53791e = f1Var;
            Object obj = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            m13 = obj;
            i13 = intValue;
        }
        return new a3(i13, m13, objArr);
    }

    public static Object m(Object[] objArr, int i13, int i14, int i15) {
        f1 f1Var = null;
        if (i13 == 1) {
            Objects.requireNonNull(objArr[i15]);
            Objects.requireNonNull(objArr[i15 ^ 1]);
            return null;
        }
        int i16 = i14 - 1;
        int i17 = 0;
        if (i14 <= 128) {
            byte[] bArr = new byte[i14];
            Arrays.fill(bArr, (byte) -1);
            int i18 = 0;
            while (i17 < i13) {
                int i19 = (i17 * 2) + i15;
                int i23 = (i18 * 2) + i15;
                Object obj = objArr[i19];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj2);
                int X1 = bs1.c.X1(obj.hashCode());
                while (true) {
                    int i24 = X1 & i16;
                    int i25 = bArr[i24] & 255;
                    if (i25 == 255) {
                        bArr[i24] = (byte) i23;
                        if (i18 < i17) {
                            objArr[i23] = obj;
                            objArr[i23 ^ 1] = obj2;
                        }
                        i18++;
                    } else {
                        if (obj.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj3 = objArr[i26];
                            Objects.requireNonNull(obj3);
                            f1Var = new f1(obj, obj2, obj3);
                            objArr[i26] = obj2;
                            break;
                        }
                        X1 = i24 + 1;
                    }
                }
                i17++;
            }
            return i18 == i13 ? bArr : new Object[]{bArr, Integer.valueOf(i18), f1Var};
        }
        if (i14 <= 32768) {
            short[] sArr = new short[i14];
            Arrays.fill(sArr, (short) -1);
            int i27 = 0;
            while (i17 < i13) {
                int i28 = (i17 * 2) + i15;
                int i29 = (i27 * 2) + i15;
                Object obj4 = objArr[i28];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i28 ^ 1];
                Objects.requireNonNull(obj5);
                int X12 = bs1.c.X1(obj4.hashCode());
                while (true) {
                    int i33 = X12 & i16;
                    int i34 = sArr[i33] & 65535;
                    if (i34 == 65535) {
                        sArr[i33] = (short) i29;
                        if (i27 < i17) {
                            objArr[i29] = obj4;
                            objArr[i29 ^ 1] = obj5;
                        }
                        i27++;
                    } else {
                        if (obj4.equals(objArr[i34])) {
                            int i35 = i34 ^ 1;
                            Object obj6 = objArr[i35];
                            Objects.requireNonNull(obj6);
                            f1Var = new f1(obj4, obj5, obj6);
                            objArr[i35] = obj5;
                            break;
                        }
                        X12 = i33 + 1;
                    }
                }
                i17++;
            }
            return i27 == i13 ? sArr : new Object[]{sArr, Integer.valueOf(i27), f1Var};
        }
        int[] iArr = new int[i14];
        Arrays.fill(iArr, -1);
        int i36 = 0;
        while (i17 < i13) {
            int i37 = (i17 * 2) + i15;
            int i38 = (i36 * 2) + i15;
            Object obj7 = objArr[i37];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i37 ^ 1];
            Objects.requireNonNull(obj8);
            int X13 = bs1.c.X1(obj7.hashCode());
            while (true) {
                int i39 = X13 & i16;
                int i43 = iArr[i39];
                if (i43 == -1) {
                    iArr[i39] = i38;
                    if (i36 < i17) {
                        objArr[i38] = obj7;
                        objArr[i38 ^ 1] = obj8;
                    }
                    i36++;
                } else {
                    if (obj7.equals(objArr[i43])) {
                        int i44 = i43 ^ 1;
                        Object obj9 = objArr[i44];
                        Objects.requireNonNull(obj9);
                        f1Var = new f1(obj7, obj8, obj9);
                        objArr[i44] = obj8;
                        break;
                    }
                    X13 = i39 + 1;
                }
            }
            i17++;
        }
        return i36 == i13 ? iArr : new Object[]{iArr, Integer.valueOf(i36), f1Var};
    }

    public static Object n(int i13, int i14, Object obj, Object obj2, Object[] objArr) {
        if (obj2 == null) {
            return null;
        }
        if (i13 == 1) {
            Object obj3 = objArr[i14];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i14 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int X1 = bs1.c.X1(obj2.hashCode());
            while (true) {
                int i15 = X1 & length;
                int i16 = bArr[i15] & 255;
                if (i16 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                X1 = i15 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int X12 = bs1.c.X1(obj2.hashCode());
            while (true) {
                int i17 = X12 & length2;
                int i18 = sArr[i17] & 65535;
                if (i18 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i18])) {
                    return objArr[i18 ^ 1];
                }
                X12 = i17 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int X13 = bs1.c.X1(obj2.hashCode());
            while (true) {
                int i19 = X13 & length3;
                int i23 = iArr[i19];
                if (i23 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i23])) {
                    return objArr[i23 ^ 1];
                }
                X13 = i19 + 1;
            }
        }
    }

    @Override // pk.h1
    public final x2 d() {
        return new x2(this, this.f100352e, 0, this.f100353f);
    }

    @Override // pk.h1
    public final y2 e() {
        return new y2(this, new z2(0, this.f100353f, this.f100352e));
    }

    @Override // pk.h1
    public final v0 f() {
        return new z2(1, this.f100353f, this.f100352e);
    }

    @Override // pk.h1, java.util.Map
    public final Object get(Object obj) {
        Object n13 = n(this.f100353f, 0, this.f100351d, obj, this.f100352e);
        if (n13 == null) {
            return null;
        }
        return n13;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f100353f;
    }

    @Override // pk.h1
    public Object writeReplace() {
        return super.writeReplace();
    }
}
