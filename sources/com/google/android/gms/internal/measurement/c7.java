package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class c7 implements n7 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f31327m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Unsafe f31328n = x7.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f31329a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f31330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31332d;

    /* renamed from: e, reason: collision with root package name */
    public final a7 f31333e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f31334f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31335g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31336h;

    /* renamed from: i, reason: collision with root package name */
    public final g7 f31337i;

    /* renamed from: j, reason: collision with root package name */
    public final o6 f31338j;

    /* renamed from: k, reason: collision with root package name */
    public final t7 f31339k;

    /* renamed from: l, reason: collision with root package name */
    public final x6 f31340l;

    public c7(int[] iArr, Object[] objArr, int i13, int i14, a7 a7Var, int[] iArr2, int i15, int i16, g7 g7Var, o6 o6Var, t7 t7Var, t5 t5Var, x6 x6Var) {
        this.f31329a = iArr;
        this.f31330b = objArr;
        this.f31331c = i13;
        this.f31332d = i14;
        boolean z13 = a7Var instanceof a6;
        this.f31334f = iArr2;
        this.f31335g = i15;
        this.f31336h = i16;
        this.f31337i = g7Var;
        this.f31338j = o6Var;
        this.f31339k = t7Var;
        this.f31333e = a7Var;
        this.f31340l = x6Var;
    }

    public static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof a6) {
            return ((a6) obj).q();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.c7 i(com.google.android.gms.internal.measurement.y6 r33, com.google.android.gms.internal.measurement.g7 r34, com.google.android.gms.internal.measurement.o6 r35, com.google.android.gms.internal.measurement.t7 r36, com.google.android.gms.internal.measurement.t5 r37, com.google.android.gms.internal.measurement.x6 r38) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c7.i(com.google.android.gms.internal.measurement.y6, com.google.android.gms.internal.measurement.g7, com.google.android.gms.internal.measurement.o6, com.google.android.gms.internal.measurement.t7, com.google.android.gms.internal.measurement.t5, com.google.android.gms.internal.measurement.x6):com.google.android.gms.internal.measurement.c7");
    }

    public static Field l(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder w13 = a.a.w("Field ", str, " for ", name, " not found. Known fields are ");
            w13.append(arrays);
            throw new RuntimeException(w13.toString());
        }
    }

    public static void m(int i13, Object obj, bb.p pVar) {
        if (!(obj instanceof String)) {
            pVar.o(i13, (o5) obj);
            return;
        }
        q5 q5Var = (q5) pVar.f22464b;
        q5Var.s(i13, 2);
        q5Var.g((String) obj);
    }

    public static int u(Object obj, long j13) {
        return ((Integer) x7.r(j13, obj)).intValue();
    }

    public static long y(Object obj, long j13) {
        return ((Long) x7.r(j13, obj)).longValue();
    }

    public final n7 A(int i13) {
        int i14 = (i13 / 3) << 1;
        Object[] objArr = this.f31330b;
        n7 n7Var = (n7) objArr[i14];
        if (n7Var != null) {
            return n7Var;
        }
        n7 a13 = j7.f31480c.a((Class) objArr[i14 + 1]);
        objArr[i14] = a13;
        return a13;
    }

    public final Object B(int i13) {
        return this.f31330b[(i13 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void a(Object obj, Object obj2) {
        if (!C(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f31329a;
            if (i13 >= iArr.length) {
                o7.h(this.f31339k, obj, obj2);
                return;
            }
            int t13 = t(i13);
            long j13 = t13 & 1048575;
            int i14 = iArr[i13];
            switch ((t13 & 267386880) >>> 20) {
                case 0:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.e(obj, j13, x7.a(obj2, j13));
                        r(i13, obj);
                        break;
                    }
                case 1:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.f(obj, j13, x7.h(obj2, j13));
                        r(i13, obj);
                        break;
                    }
                case 2:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        v7 v7Var = x7.f31701c;
                        v7Var.b(j13, obj, v7Var.f(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 3:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        v7 v7Var2 = x7.f31701c;
                        v7Var2.b(j13, obj, v7Var2.f(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 4:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.c(x7.f31701c.e(j13, obj2), j13, obj);
                        r(i13, obj);
                        break;
                    }
                case 5:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        v7 v7Var3 = x7.f31701c;
                        v7Var3.b(j13, obj, v7Var3.f(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 6:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.c(x7.f31701c.e(j13, obj2), j13, obj);
                        r(i13, obj);
                        break;
                    }
                case 7:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.n(obj, j13, x7.s(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 8:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.d(j13, obj, x7.r(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 9:
                    p(obj, obj2, i13);
                    break;
                case 10:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.d(j13, obj, x7.r(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 11:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.c(x7.f31701c.e(j13, obj2), j13, obj);
                        r(i13, obj);
                        break;
                    }
                case 12:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.c(x7.f31701c.e(j13, obj2), j13, obj);
                        r(i13, obj);
                        break;
                    }
                case 13:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.c(x7.f31701c.e(j13, obj2), j13, obj);
                        r(i13, obj);
                        break;
                    }
                case 14:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        v7 v7Var4 = x7.f31701c;
                        v7Var4.b(j13, obj, v7Var4.f(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 15:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        x7.c(x7.f31701c.e(j13, obj2), j13, obj);
                        r(i13, obj);
                        break;
                    }
                case 16:
                    if (!v(i13, obj2)) {
                        break;
                    } else {
                        v7 v7Var5 = x7.f31701c;
                        v7Var5.b(j13, obj, v7Var5.f(j13, obj2));
                        r(i13, obj);
                        break;
                    }
                case 17:
                    p(obj, obj2, i13);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f31338j.a(j13, obj, obj2);
                    break;
                case 50:
                    Class cls = o7.f31571a;
                    Object r13 = x7.r(j13, obj);
                    Object r14 = x7.r(j13, obj2);
                    this.f31340l.getClass();
                    x7.d(j13, obj, x6.a(r13, r14));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!w(i14, obj2, i13)) {
                        break;
                    } else {
                        x7.d(j13, obj, x7.r(j13, obj2));
                        x7.c(i14, iArr[i13 + 2] & 1048575, obj);
                        break;
                    }
                case 60:
                    s(i13, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!w(i14, obj2, i13)) {
                        break;
                    } else {
                        x7.d(j13, obj, x7.r(j13, obj2));
                        x7.c(i14, iArr[i13 + 2] & 1048575, obj);
                        break;
                    }
                case 68:
                    s(i13, obj, obj2);
                    break;
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean b(Object obj, Object obj2) {
        boolean j13;
        int[] iArr = this.f31329a;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int t13 = t(i13);
            long j14 = t13 & 1048575;
            switch ((t13 & 267386880) >>> 20) {
                case 0:
                    if (x(i13, obj, obj2) && Double.doubleToLongBits(x7.a(obj, j14)) == Double.doubleToLongBits(x7.a(obj2, j14))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (x(i13, obj, obj2) && Float.floatToIntBits(x7.h(obj, j14)) == Float.floatToIntBits(x7.h(obj2, j14))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var = x7.f31701c;
                        if (v7Var.f(j14, obj) == v7Var.f(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var2 = x7.f31701c;
                        if (v7Var2.f(j14, obj) == v7Var2.f(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var3 = x7.f31701c;
                        if (v7Var3.e(j14, obj) == v7Var3.e(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var4 = x7.f31701c;
                        if (v7Var4.f(j14, obj) == v7Var4.f(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var5 = x7.f31701c;
                        if (v7Var5.e(j14, obj) == v7Var5.e(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (x(i13, obj, obj2) && x7.s(j14, obj) == x7.s(j14, obj2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (x(i13, obj, obj2) && o7.j(x7.r(j14, obj), x7.r(j14, obj2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (x(i13, obj, obj2) && o7.j(x7.r(j14, obj), x7.r(j14, obj2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (x(i13, obj, obj2) && o7.j(x7.r(j14, obj), x7.r(j14, obj2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var6 = x7.f31701c;
                        if (v7Var6.e(j14, obj) == v7Var6.e(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var7 = x7.f31701c;
                        if (v7Var7.e(j14, obj) == v7Var7.e(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var8 = x7.f31701c;
                        if (v7Var8.e(j14, obj) == v7Var8.e(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var9 = x7.f31701c;
                        if (v7Var9.f(j14, obj) == v7Var9.f(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var10 = x7.f31701c;
                        if (v7Var10.e(j14, obj) == v7Var10.e(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (x(i13, obj, obj2)) {
                        v7 v7Var11 = x7.f31701c;
                        if (v7Var11.f(j14, obj) == v7Var11.f(j14, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (x(i13, obj, obj2) && o7.j(x7.r(j14, obj), x7.r(j14, obj2))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    j13 = o7.j(x7.r(j14, obj), x7.r(j14, obj2));
                    break;
                case 50:
                    j13 = o7.j(x7.r(j14, obj), x7.r(j14, obj2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j15 = iArr[i13 + 2] & 1048575;
                    v7 v7Var12 = x7.f31701c;
                    if (v7Var12.e(j15, obj) == v7Var12.e(j15, obj2) && o7.j(x7.r(j14, obj), x7.r(j14, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!j13) {
                return false;
            }
        }
        this.f31339k.getClass();
        return ((a6) obj).zzb.equals(((a6) obj2).zzb);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean c(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f31335g) {
            int i18 = this.f31334f[i17];
            int[] iArr = this.f31329a;
            int i19 = iArr[i18];
            int t13 = t(i18);
            int i23 = iArr[i18 + 2];
            int i24 = i23 & 1048575;
            int i25 = 1 << (i23 >>> 20);
            if (i24 != i15) {
                if (i24 != 1048575) {
                    i16 = f31328n.getInt(obj, i24);
                }
                i14 = i16;
                i13 = i24;
            } else {
                i13 = i15;
                i14 = i16;
            }
            if ((268435456 & t13) != 0 && !q(obj, i18, i13, i14, i25)) {
                return false;
            }
            int i26 = (267386880 & t13) >>> 20;
            if (i26 != 9 && i26 != 17) {
                if (i26 != 27) {
                    if (i26 == 60 || i26 == 68) {
                        if (w(i19, obj, i18) && !A(i18).c(x7.r(t13 & 1048575, obj))) {
                            return false;
                        }
                    } else if (i26 != 49) {
                        if (i26 != 50) {
                            continue;
                        } else {
                            Object r13 = x7.r(t13 & 1048575, obj);
                            this.f31340l.getClass();
                            if (!x6.f(r13).isEmpty()) {
                                x6.b(B(i18));
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) x7.r(t13 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    n7 A = A(i18);
                    for (int i27 = 0; i27 < list.size(); i27++) {
                        if (!A.c(list.get(i27))) {
                            return false;
                        }
                    }
                }
            } else if (q(obj, i18, i13, i14, i25) && !A(i18).c(x7.r(t13 & 1048575, obj))) {
                return false;
            }
            i17++;
            i15 = i13;
            i16 = i14;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void d(Object obj) {
        if (C(obj)) {
            if (obj instanceof a6) {
                a6 a6Var = (a6) obj;
                a6Var.n(Integer.MAX_VALUE);
                a6Var.zza = 0;
                a6Var.p();
            }
            int[] iArr = this.f31329a;
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int t13 = t(i13);
                long j13 = 1048575 & t13;
                int i14 = (t13 & 267386880) >>> 20;
                Unsafe unsafe = f31328n;
                if (i14 != 9) {
                    if (i14 != 60 && i14 != 68) {
                        switch (i14) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f31338j.b(j13, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j13);
                                if (object != null) {
                                    this.f31340l.getClass();
                                    x6.e(object);
                                    unsafe.putObject(obj, j13, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (w(iArr[i13], obj, i13)) {
                        A(i13).d(unsafe.getObject(obj, j13));
                    }
                }
                if (v(i13, obj)) {
                    A(i13).d(unsafe.getObject(obj, j13));
                }
            }
            this.f31339k.getClass();
            t7.c(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void e(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        h(obj, bArr, i13, i14, 0, vVar);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void f(Object obj, bb.p pVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13;
        Object obj2;
        boolean z14;
        c7 c7Var;
        int i17;
        int i18;
        x6 x6Var;
        int[] iArr;
        int i19;
        boolean z15;
        boolean z16;
        boolean z17;
        int i23;
        c7 c7Var2 = this;
        int h10 = pVar.h();
        x6 x6Var2 = c7Var2.f31340l;
        int i24 = 267386880;
        t7 t7Var = c7Var2.f31339k;
        int[] iArr2 = c7Var2.f31329a;
        int i25 = 1048575;
        if (h10 == 2) {
            t7Var.getClass();
            ((a6) obj).zzb.e(pVar);
            for (int length = iArr2.length - 3; length >= 0; length -= 3) {
                int t13 = c7Var2.t(length);
                int i26 = iArr2[length];
                switch ((t13 & 267386880) >>> 20) {
                    case 0:
                        if (c7Var2.v(length, obj)) {
                            pVar.k(i26, x7.a(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (c7Var2.v(length, obj)) {
                            pVar.l(i26, x7.h(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (c7Var2.v(length, obj)) {
                            pVar.v(i26, x7.o(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (c7Var2.v(length, obj)) {
                            pVar.C(i26, x7.o(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (c7Var2.v(length, obj)) {
                            pVar.x(i26, x7.k(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (c7Var2.v(length, obj)) {
                            pVar.n(i26, x7.o(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (c7Var2.v(length, obj)) {
                            pVar.u(i26, x7.k(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (c7Var2.v(length, obj)) {
                            pVar.q(i26, x7.s(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (c7Var2.v(length, obj)) {
                            m(i26, x7.r(t13 & 1048575, obj), pVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (c7Var2.v(length, obj)) {
                            pVar.w(i26, c7Var2.A(length), x7.r(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (c7Var2.v(length, obj)) {
                            pVar.o(i26, (o5) x7.r(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (c7Var2.v(length, obj)) {
                            pVar.D(i26, x7.k(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (c7Var2.v(length, obj)) {
                            pVar.m(i26, x7.k(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (c7Var2.v(length, obj)) {
                            pVar.z(i26, x7.k(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (c7Var2.v(length, obj)) {
                            pVar.y(i26, x7.o(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (c7Var2.v(length, obj)) {
                            pVar.B(i26, x7.k(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (c7Var2.v(length, obj)) {
                            pVar.A(i26, x7.o(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (c7Var2.v(length, obj)) {
                            pVar.p(i26, c7Var2.A(length), x7.r(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        o7.q(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 19:
                        o7.D(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 20:
                        o7.J(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 21:
                        o7.T(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 22:
                        o7.G(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 23:
                        o7.A(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 24:
                        o7.x(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 25:
                        o7.g(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 26:
                        o7.o(i26, (List) x7.r(t13 & 1048575, obj), pVar);
                        break;
                    case 27:
                        o7.p(i26, (List) x7.r(t13 & 1048575, obj), pVar, c7Var2.A(length));
                        break;
                    case 28:
                        o7.e(i26, (List) x7.r(t13 & 1048575, obj), pVar);
                        break;
                    case 29:
                        o7.S(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 30:
                        o7.u(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 31:
                        o7.M(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 32:
                        o7.P(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 33:
                        o7.Q(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 34:
                        o7.R(i26, (List) x7.r(t13 & 1048575, obj), pVar, false);
                        break;
                    case 35:
                        o7.q(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 36:
                        o7.D(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 37:
                        o7.J(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 38:
                        o7.T(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 39:
                        o7.G(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 40:
                        o7.A(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 41:
                        o7.x(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 42:
                        o7.g(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 43:
                        o7.S(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 44:
                        o7.u(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 45:
                        o7.M(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 46:
                        o7.P(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 47:
                        o7.Q(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 48:
                        o7.R(i26, (List) x7.r(t13 & 1048575, obj), pVar, true);
                        break;
                    case 49:
                        o7.f(i26, (List) x7.r(t13 & 1048575, obj), pVar, c7Var2.A(length));
                        break;
                    case 50:
                        if (x7.r(t13 & 1048575, obj) != null) {
                            Object B = c7Var2.B(length);
                            x6Var2.getClass();
                            x6.b(B);
                            throw null;
                        }
                        break;
                    case 51:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.k(i26, ((Double) x7.r(t13 & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.l(i26, ((Float) x7.r(t13 & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.v(i26, y(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.C(i26, y(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.x(i26, u(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.n(i26, y(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.u(i26, u(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.q(i26, ((Boolean) x7.r(t13 & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (c7Var2.w(i26, obj, length)) {
                            m(i26, x7.r(t13 & 1048575, obj), pVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.w(i26, c7Var2.A(length), x7.r(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.o(i26, (o5) x7.r(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.D(i26, u(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.m(i26, u(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.z(i26, u(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.y(i26, y(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.B(i26, u(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.A(i26, y(obj, t13 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (c7Var2.w(i26, obj, length)) {
                            pVar.p(i26, c7Var2.A(length), x7.r(t13 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        int length2 = iArr2.length;
        int i27 = 1048575;
        int i28 = 0;
        int i29 = 0;
        while (i29 < length2) {
            int t14 = c7Var2.t(i29);
            int i33 = iArr2[i29];
            int i34 = (t14 & i24) >>> 20;
            Unsafe unsafe = f31328n;
            if (i34 <= 17) {
                int i35 = iArr2[i29 + 2];
                int i36 = i28;
                int i37 = i35 & i25;
                if (i37 != i27) {
                    i23 = i37 == i25 ? 0 : unsafe.getInt(obj, i37);
                    i27 = i37;
                } else {
                    i23 = i36;
                }
                i16 = 1 << (i35 >>> 20);
                i14 = i27;
                i13 = i23;
                i15 = 1048575;
            } else {
                i13 = i28;
                i14 = i27;
                i15 = i25;
                i16 = 0;
            }
            long j13 = t14 & i15;
            switch (i34) {
                case 0:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.k(i33, x7.a(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 1:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.l(i33, x7.h(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 2:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.v(i33, unsafe.getLong(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 3:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.C(i33, unsafe.getLong(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 4:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.x(i33, unsafe.getInt(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 5:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.n(i33, unsafe.getLong(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 6:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.u(i33, unsafe.getInt(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 7:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.q(i33, x7.s(j13, obj));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 8:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        m(i33, unsafe.getObject(obj, j13), pVar);
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 9:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.w(i33, c7Var.A(i19), unsafe.getObject(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 10:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.o(i33, (o5) unsafe.getObject(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 11:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.D(i33, unsafe.getInt(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 12:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.m(i33, unsafe.getInt(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 13:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.z(i33, unsafe.getInt(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 14:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.y(i33, unsafe.getLong(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 15:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.B(i33, unsafe.getInt(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 16:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    if (q(obj, i19, i14, i13, i16)) {
                        pVar.A(i33, unsafe.getLong(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 17:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    i17 = length2;
                    i18 = 1048575;
                    if (q(obj, i29, i14, i13, i16)) {
                        pVar.p(i33, c7Var.A(i19), unsafe.getObject(obj, j13));
                    }
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 18:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.q(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 19:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.D(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 20:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.J(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 21:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.T(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 22:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.G(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 23:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.A(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 24:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.x(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 25:
                    z15 = true;
                    obj2 = null;
                    c7Var = this;
                    z16 = false;
                    o7.g(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 26:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.o(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 27:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.p(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, c7Var.A(i29));
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 28:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.e(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 29:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.S(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 30:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.u(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 31:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.M(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 32:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.P(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 33:
                    z15 = true;
                    z16 = false;
                    obj2 = null;
                    c7Var = this;
                    o7.Q(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 34:
                    z15 = true;
                    obj2 = null;
                    c7Var = this;
                    z16 = false;
                    o7.R(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, false);
                    i17 = length2;
                    z13 = z15;
                    i18 = i15;
                    x6Var = x6Var2;
                    z14 = z16;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 35:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.q(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 36:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.D(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 37:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.J(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 38:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.T(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 39:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.G(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 40:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.A(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 41:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.x(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 42:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.g(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 43:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.S(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 44:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.u(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 45:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.M(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 46:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.P(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 47:
                    z17 = true;
                    obj2 = null;
                    c7Var = this;
                    o7.Q(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 48:
                    obj2 = null;
                    c7Var = this;
                    z17 = true;
                    o7.R(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, true);
                    i17 = length2;
                    z13 = z17;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 49:
                    obj2 = null;
                    c7Var = this;
                    o7.f(iArr2[i29], (List) unsafe.getObject(obj, j13), pVar, c7Var.A(i29));
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 50:
                    c7Var = this;
                    if (unsafe.getObject(obj, j13) != null) {
                        Object B2 = c7Var.B(i29);
                        x6Var2.getClass();
                        x6.b(B2);
                        throw null;
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 51:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.k(i33, ((Double) x7.r(j13, obj)).doubleValue());
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 52:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.l(i33, ((Float) x7.r(j13, obj)).floatValue());
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 53:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.v(i33, y(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 54:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.C(i33, y(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 55:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.x(i33, u(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 56:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.n(i33, y(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 57:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.u(i33, u(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 58:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.q(i33, ((Boolean) x7.r(j13, obj)).booleanValue());
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 59:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        m(i33, unsafe.getObject(obj, j13), pVar);
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 60:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.w(i33, c7Var.A(i29), unsafe.getObject(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 61:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.o(i33, (o5) unsafe.getObject(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 62:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.D(i33, u(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 63:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.m(i33, u(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 64:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.z(i33, u(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 65:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.y(i33, y(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 66:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.B(i33, u(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 67:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.A(i33, y(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                case 68:
                    c7Var = this;
                    if (c7Var.w(i33, obj, i29)) {
                        pVar.p(i33, c7Var.A(i29), unsafe.getObject(obj, j13));
                    }
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
                default:
                    z13 = true;
                    obj2 = null;
                    z14 = false;
                    c7Var = this;
                    i17 = length2;
                    i18 = i15;
                    x6Var = x6Var2;
                    iArr = iArr2;
                    i19 = i29;
                    i29 = i19 + 3;
                    i27 = i14;
                    c7Var2 = c7Var;
                    i28 = i13;
                    i25 = i18;
                    x6Var2 = x6Var;
                    iArr2 = iArr;
                    length2 = i17;
                    i24 = 267386880;
            }
        }
        t7Var.getClass();
        ((a6) obj).zzb.e(pVar);
    }

    public final int g(int i13, int i14) {
        int[] iArr = this.f31329a;
        int length = (iArr.length / 3) - 1;
        while (i14 <= length) {
            int i15 = (length + i14) >>> 1;
            int i16 = i15 * 3;
            int i17 = iArr[i16];
            if (i13 == i17) {
                return i16;
            }
            if (i13 < i17) {
                length = i15 - 1;
            } else {
                i14 = i15 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0cb0, code lost:
    
        if (r14 == 1048575) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0cb2, code lost:
    
        r12.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0cb6, code lost:
    
        r3 = r34.f31335g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0cbc, code lost:
    
        if (r3 >= r34.f31336h) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0cbe, code lost:
    
        r4 = r34.f31334f[r3];
        r5 = r19[r4];
        r5 = com.google.android.gms.internal.measurement.x7.r(t(r4) & 1048575, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0cce, code lost:
    
        if (r5 != null) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0cd5, code lost:
    
        if (z(r4) != null) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0cda, code lost:
    
        r22.getClass();
        r5 = (com.google.android.gms.internal.measurement.w6) r5;
        com.google.android.gms.internal.measurement.x6.b(B(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ce6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0cd7, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0ce7, code lost:
    
        if (r0 != 0) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0ceb, code lost:
    
        if (r8 != r38) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0cf2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzji.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0cf9, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0cf5, code lost:
    
        if (r8 > r38) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0cf7, code lost:
    
        if (r11 != r0) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0cfe, code lost:
    
        throw com.google.android.gms.internal.measurement.zzji.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x095b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0c94 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0c5d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, l7.v r40) {
        /*
            Method dump skipped, instructions count: 3492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c7.h(java.lang.Object, byte[], int, int, int, l7.v):int");
    }

    public final Object j(int i13, Object obj) {
        n7 A = A(i13);
        long t13 = t(i13) & 1048575;
        if (!v(i13, obj)) {
            return A.zza();
        }
        Object object = f31328n.getObject(obj, t13);
        if (C(object)) {
            return object;
        }
        a6 zza = A.zza();
        if (object != null) {
            A.a(zza, object);
        }
        return zza;
    }

    public final Object k(int i13, Object obj, int i14) {
        n7 A = A(i14);
        if (!w(i13, obj, i14)) {
            return A.zza();
        }
        Object object = f31328n.getObject(obj, t(i14) & 1048575);
        if (C(object)) {
            return object;
        }
        a6 zza = A.zza();
        if (object != null) {
            A.a(zza, object);
        }
        return zza;
    }

    public final void n(int i13, Object obj, Object obj2, int i14) {
        f31328n.putObject(obj, t(i14) & 1048575, obj2);
        x7.c(i13, this.f31329a[i14 + 2] & 1048575, obj);
    }

    public final void o(Object obj, int i13, Object obj2) {
        f31328n.putObject(obj, t(i13) & 1048575, obj2);
        r(i13, obj);
    }

    public final void p(Object obj, Object obj2, int i13) {
        if (v(i13, obj2)) {
            long t13 = t(i13) & 1048575;
            Unsafe unsafe = f31328n;
            Object object = unsafe.getObject(obj2, t13);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f31329a[i13] + " is present but null: " + String.valueOf(obj2));
            }
            n7 A = A(i13);
            if (!v(i13, obj)) {
                if (C(object)) {
                    a6 zza = A.zza();
                    A.a(zza, object);
                    unsafe.putObject(obj, t13, zza);
                } else {
                    unsafe.putObject(obj, t13, object);
                }
                r(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, t13);
            if (!C(object2)) {
                a6 zza2 = A.zza();
                A.a(zza2, object2);
                unsafe.putObject(obj, t13, zza2);
                object2 = zza2;
            }
            A.a(object2, object);
        }
    }

    public final boolean q(Object obj, int i13, int i14, int i15, int i16) {
        return i14 == 1048575 ? v(i13, obj) : (i15 & i16) != 0;
    }

    public final void r(int i13, Object obj) {
        int i14 = this.f31329a[i13 + 2];
        long j13 = 1048575 & i14;
        if (j13 == 1048575) {
            return;
        }
        x7.c((1 << (i14 >>> 20)) | x7.f31701c.e(j13, obj), j13, obj);
    }

    public final void s(int i13, Object obj, Object obj2) {
        int[] iArr = this.f31329a;
        int i14 = iArr[i13];
        if (w(i14, obj2, i13)) {
            long t13 = t(i13) & 1048575;
            Unsafe unsafe = f31328n;
            Object object = unsafe.getObject(obj2, t13);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + String.valueOf(obj2));
            }
            n7 A = A(i13);
            if (!w(i14, obj, i13)) {
                if (C(object)) {
                    a6 zza = A.zza();
                    A.a(zza, object);
                    unsafe.putObject(obj, t13, zza);
                } else {
                    unsafe.putObject(obj, t13, object);
                }
                x7.c(i14, iArr[i13 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, t13);
            if (!C(object2)) {
                a6 zza2 = A.zza();
                A.a(zza2, object2);
                unsafe.putObject(obj, t13, zza2);
                object2 = zza2;
            }
            A.a(object2, object);
        }
    }

    public final int t(int i13) {
        return this.f31329a[i13 + 1];
    }

    public final boolean v(int i13, Object obj) {
        int i14 = this.f31329a[i13 + 2];
        long j13 = i14 & 1048575;
        if (j13 != 1048575) {
            return ((1 << (i14 >>> 20)) & x7.f31701c.e(j13, obj)) != 0;
        }
        int t13 = t(i13);
        long j14 = t13 & 1048575;
        switch ((t13 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(x7.a(obj, j14)) != 0;
            case 1:
                return Float.floatToRawIntBits(x7.h(obj, j14)) != 0;
            case 2:
                return x7.f31701c.f(j14, obj) != 0;
            case 3:
                return x7.f31701c.f(j14, obj) != 0;
            case 4:
                return x7.f31701c.e(j14, obj) != 0;
            case 5:
                return x7.f31701c.f(j14, obj) != 0;
            case 6:
                return x7.f31701c.e(j14, obj) != 0;
            case 7:
                return x7.s(j14, obj);
            case 8:
                Object r13 = x7.r(j14, obj);
                if (r13 instanceof String) {
                    return !((String) r13).isEmpty();
                }
                if (r13 instanceof o5) {
                    return !o5.f31566b.equals(r13);
                }
                throw new IllegalArgumentException();
            case 9:
                return x7.r(j14, obj) != null;
            case 10:
                return !o5.f31566b.equals(x7.r(j14, obj));
            case 11:
                return x7.f31701c.e(j14, obj) != 0;
            case 12:
                return x7.f31701c.e(j14, obj) != 0;
            case 13:
                return x7.f31701c.e(j14, obj) != 0;
            case 14:
                return x7.f31701c.f(j14, obj) != 0;
            case 15:
                return x7.f31701c.e(j14, obj) != 0;
            case 16:
                return x7.f31701c.f(j14, obj) != 0;
            case 17:
                return x7.r(j14, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean w(int i13, Object obj, int i14) {
        return x7.f31701c.e((long) (this.f31329a[i14 + 2] & 1048575), obj) == i13;
    }

    public final boolean x(int i13, Object obj, Object obj2) {
        return v(i13, obj) == v(i13, obj2);
    }

    public final h6 z(int i13) {
        return (h6) this.f31330b[((i13 / 3) << 1) + 1];
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final int zza(Object obj) {
        int i13;
        int i14;
        int i15;
        int b13;
        int w13;
        int E;
        int G;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        while (true) {
            int[] iArr = this.f31329a;
            if (i19 >= iArr.length) {
                this.f31339k.getClass();
                return t7.a(t7.b(obj)) + i23;
            }
            int t13 = t(i19);
            int i24 = (267386880 & t13) >>> 20;
            int i25 = iArr[i19];
            int i26 = iArr[i19 + 2];
            int i27 = i26 & i16;
            Unsafe unsafe = f31328n;
            if (i24 <= 17) {
                if (i27 != i17) {
                    i18 = i27 == i16 ? 0 : unsafe.getInt(obj, i27);
                    i17 = i27;
                }
                i13 = i17;
                i14 = i18;
                i15 = 1 << (i26 >>> 20);
            } else {
                i13 = i17;
                i14 = i18;
                i15 = 0;
            }
            long j13 = t13 & i16;
            if (i24 >= u5.zza.zza()) {
                u5.zzb.zza();
            }
            switch (i24) {
                case 0:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.b(i25);
                        i23 += b13;
                        break;
                    }
                case 1:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.h(i25);
                        i23 += b13;
                        break;
                    }
                case 2:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.u(i25, unsafe.getLong(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 3:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.B(i25, unsafe.getLong(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 4:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.A(i25, unsafe.getInt(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 5:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.p(i25);
                        i23 += b13;
                        break;
                    }
                case 6:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.z(i25);
                        i23 += b13;
                        break;
                    }
                case 7:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.j(i25);
                        i23 += b13;
                        break;
                    }
                case 8:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j13);
                        b13 = object instanceof o5 ? q5.q(i25, (o5) object) : q5.l(i25, (String) object);
                        i23 += b13;
                        break;
                    }
                case 9:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = o7.a(i25, A(i19), unsafe.getObject(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 10:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.q(i25, (o5) unsafe.getObject(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 11:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.H(i25, unsafe.getInt(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 12:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.w(i25, unsafe.getInt(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 13:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.D(i25);
                        i23 += b13;
                        break;
                    }
                case 14:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.v(i25);
                        i23 += b13;
                        break;
                    }
                case 15:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.F(i25, unsafe.getInt(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 16:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.y(i25, unsafe.getLong(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 17:
                    if (!q(obj, i19, i13, i14, i15)) {
                        break;
                    } else {
                        b13 = q5.k(i25, (a7) unsafe.getObject(obj, j13), A(i19));
                        i23 += b13;
                        break;
                    }
                case 18:
                    b13 = o7.v(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 19:
                    b13 = o7.s(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 20:
                    b13 = o7.B(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 21:
                    b13 = o7.N(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 22:
                    b13 = o7.y(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 23:
                    b13 = o7.v(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 24:
                    b13 = o7.s(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 25:
                    b13 = o7.b(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 26:
                    b13 = o7.r(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 27:
                    b13 = o7.m(i25, (List) unsafe.getObject(obj, j13), A(i19));
                    i23 += b13;
                    break;
                case 28:
                    b13 = o7.k(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 29:
                    b13 = o7.K(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 30:
                    b13 = o7.l(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 31:
                    b13 = o7.s(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 32:
                    b13 = o7.v(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 33:
                    b13 = o7.E(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 34:
                    b13 = o7.H(i25, (List) unsafe.getObject(obj, j13));
                    i23 += b13;
                    break;
                case 35:
                    w13 = o7.w((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 36:
                    w13 = o7.t((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 37:
                    w13 = o7.C((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 38:
                    w13 = o7.O((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 39:
                    w13 = o7.z((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 40:
                    w13 = o7.w((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 41:
                    w13 = o7.t((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 42:
                    w13 = o7.d((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 43:
                    w13 = o7.L((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 44:
                    w13 = o7.n((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 45:
                    w13 = o7.t((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 46:
                    w13 = o7.w((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 47:
                    w13 = o7.F((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 48:
                    w13 = o7.I((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        E = q5.E(i25);
                        G = q5.G(w13);
                        i23 += G + E + w13;
                        break;
                    }
                case 49:
                    b13 = o7.c(i25, (List) unsafe.getObject(obj, j13), A(i19));
                    i23 += b13;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j13);
                    Object B = B(i19);
                    this.f31340l.getClass();
                    x6.c(object2, B);
                    break;
                case 51:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.b(i25);
                        i23 += b13;
                        break;
                    }
                case 52:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.h(i25);
                        i23 += b13;
                        break;
                    }
                case 53:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.u(i25, y(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 54:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.B(i25, y(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 55:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.A(i25, u(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 56:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.p(i25);
                        i23 += b13;
                        break;
                    }
                case 57:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.z(i25);
                        i23 += b13;
                        break;
                    }
                case 58:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.j(i25);
                        i23 += b13;
                        break;
                    }
                case 59:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(obj, j13);
                        b13 = object3 instanceof o5 ? q5.q(i25, (o5) object3) : q5.l(i25, (String) object3);
                        i23 += b13;
                        break;
                    }
                case 60:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = o7.a(i25, A(i19), unsafe.getObject(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 61:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.q(i25, (o5) unsafe.getObject(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 62:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.H(i25, u(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 63:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.w(i25, u(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 64:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.D(i25);
                        i23 += b13;
                        break;
                    }
                case 65:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.v(i25);
                        i23 += b13;
                        break;
                    }
                case 66:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.F(i25, u(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 67:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.y(i25, y(obj, j13));
                        i23 += b13;
                        break;
                    }
                case 68:
                    if (!w(i25, obj, i19)) {
                        break;
                    } else {
                        b13 = q5.k(i25, (a7) unsafe.getObject(obj, j13), A(i19));
                        i23 += b13;
                        break;
                    }
            }
            i19 += 3;
            i17 = i13;
            i18 = i14;
            i16 = 1048575;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fb, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.android.gms.internal.measurement.n7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c7.zzb(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final a6 zza() {
        this.f31337i.getClass();
        return (a6) ((a6) this.f31333e).g(4);
    }
}
