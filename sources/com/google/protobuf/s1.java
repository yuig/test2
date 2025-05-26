package com.google.protobuf;

import a.cb;
import com.google.protobuf.InvalidProtocolBufferException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.quikkly.android.utils.BitmapUtils;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class s1 implements d2 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f33976o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f33977p = q2.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f33978a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f33979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33981d;

    /* renamed from: e, reason: collision with root package name */
    public final o1 f33982e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33983f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33984g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f33985h;

    /* renamed from: i, reason: collision with root package name */
    public final int f33986i;

    /* renamed from: j, reason: collision with root package name */
    public final int f33987j;

    /* renamed from: k, reason: collision with root package name */
    public final u1 f33988k;

    /* renamed from: l, reason: collision with root package name */
    public final c1 f33989l;

    /* renamed from: m, reason: collision with root package name */
    public final i2 f33990m;

    /* renamed from: n, reason: collision with root package name */
    public final j1 f33991n;

    public s1(int[] iArr, Object[] objArr, int i13, int i14, o1 o1Var, boolean z13, int[] iArr2, int i15, int i16, u1 u1Var, c1 c1Var, i2 i2Var, z zVar, j1 j1Var) {
        this.f33978a = iArr;
        this.f33979b = objArr;
        this.f33980c = i13;
        this.f33981d = i14;
        this.f33983f = o1Var instanceof n0;
        this.f33984g = z13;
        this.f33985h = iArr2;
        this.f33986i = i15;
        this.f33987j = i16;
        this.f33988k = u1Var;
        this.f33989l = c1Var;
        this.f33990m = i2Var;
        this.f33982e = o1Var;
        this.f33991n = j1Var;
    }

    public static s1 E(l1 l1Var, u1 u1Var, c1 c1Var, i2 i2Var, z zVar, j1 j1Var) {
        if (l1Var instanceof b2) {
            return F((b2) l1Var, u1Var, c1Var, i2Var, zVar, j1Var);
        }
        ep.b.A(l1Var);
        throw null;
    }

    public static s1 F(b2 b2Var, u1 u1Var, c1 c1Var, i2 i2Var, z zVar, j1 j1Var) {
        int i13;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        char charAt9;
        int i27;
        char charAt10;
        int i28;
        char charAt11;
        int i29;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int[] iArr2;
        boolean z13;
        int i38;
        int i39;
        int i43;
        int i44;
        int i45;
        Field S;
        int i46;
        char charAt12;
        int i47;
        int i48;
        int i49;
        Field S2;
        Field S3;
        int i53;
        char charAt13;
        int i54;
        char charAt14;
        int i55;
        char charAt15;
        int i56;
        char charAt16;
        boolean z14 = b2Var.d() == y1.PROTO3;
        String c13 = b2Var.c();
        int length = c13.length();
        int i57 = 55296;
        if (c13.charAt(0) >= 55296) {
            int i58 = 1;
            while (true) {
                i13 = i58 + 1;
                if (c13.charAt(i58) < 55296) {
                    break;
                }
                i58 = i13;
            }
        } else {
            i13 = 1;
        }
        int i59 = i13 + 1;
        int charAt17 = c13.charAt(i13);
        if (charAt17 >= 55296) {
            int i63 = charAt17 & 8191;
            int i64 = 13;
            while (true) {
                i56 = i59 + 1;
                charAt16 = c13.charAt(i59);
                if (charAt16 < 55296) {
                    break;
                }
                i63 |= (charAt16 & 8191) << i64;
                i64 += 13;
                i59 = i56;
            }
            charAt17 = i63 | (charAt16 << i64);
            i59 = i56;
        }
        if (charAt17 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i17 = 0;
            i16 = 0;
            i14 = 0;
            iArr = f33976o;
            i15 = 0;
        } else {
            int i65 = i59 + 1;
            int charAt18 = c13.charAt(i59);
            if (charAt18 >= 55296) {
                int i66 = charAt18 & 8191;
                int i67 = 13;
                while (true) {
                    i28 = i65 + 1;
                    charAt11 = c13.charAt(i65);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i66 |= (charAt11 & 8191) << i67;
                    i67 += 13;
                    i65 = i28;
                }
                charAt18 = i66 | (charAt11 << i67);
                i65 = i28;
            }
            int i68 = i65 + 1;
            int charAt19 = c13.charAt(i65);
            if (charAt19 >= 55296) {
                int i69 = charAt19 & 8191;
                int i73 = 13;
                while (true) {
                    i27 = i68 + 1;
                    charAt10 = c13.charAt(i68);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i69 |= (charAt10 & 8191) << i73;
                    i73 += 13;
                    i68 = i27;
                }
                charAt19 = i69 | (charAt10 << i73);
                i68 = i27;
            }
            int i74 = i68 + 1;
            charAt = c13.charAt(i68);
            if (charAt >= 55296) {
                int i75 = charAt & 8191;
                int i76 = 13;
                while (true) {
                    i26 = i74 + 1;
                    charAt9 = c13.charAt(i74);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i75 |= (charAt9 & 8191) << i76;
                    i76 += 13;
                    i74 = i26;
                }
                charAt = i75 | (charAt9 << i76);
                i74 = i26;
            }
            int i77 = i74 + 1;
            charAt2 = c13.charAt(i74);
            if (charAt2 >= 55296) {
                int i78 = charAt2 & 8191;
                int i79 = 13;
                while (true) {
                    i25 = i77 + 1;
                    charAt8 = c13.charAt(i77);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i78 |= (charAt8 & 8191) << i79;
                    i79 += 13;
                    i77 = i25;
                }
                charAt2 = i78 | (charAt8 << i79);
                i77 = i25;
            }
            int i83 = i77 + 1;
            charAt3 = c13.charAt(i77);
            if (charAt3 >= 55296) {
                int i84 = charAt3 & 8191;
                int i85 = 13;
                while (true) {
                    i24 = i83 + 1;
                    charAt7 = c13.charAt(i83);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i84 |= (charAt7 & 8191) << i85;
                    i85 += 13;
                    i83 = i24;
                }
                charAt3 = i84 | (charAt7 << i85);
                i83 = i24;
            }
            int i86 = i83 + 1;
            int charAt20 = c13.charAt(i83);
            if (charAt20 >= 55296) {
                int i87 = charAt20 & 8191;
                int i88 = 13;
                while (true) {
                    i23 = i86 + 1;
                    charAt6 = c13.charAt(i86);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i87 |= (charAt6 & 8191) << i88;
                    i88 += 13;
                    i86 = i23;
                }
                charAt20 = i87 | (charAt6 << i88);
                i86 = i23;
            }
            int i89 = i86 + 1;
            int charAt21 = c13.charAt(i86);
            if (charAt21 >= 55296) {
                int i93 = charAt21 & 8191;
                int i94 = 13;
                while (true) {
                    i19 = i89 + 1;
                    charAt5 = c13.charAt(i89);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i93 |= (charAt5 & 8191) << i94;
                    i94 += 13;
                    i89 = i19;
                }
                charAt21 = i93 | (charAt5 << i94);
                i89 = i19;
            }
            int i95 = i89 + 1;
            int charAt22 = c13.charAt(i89);
            if (charAt22 >= 55296) {
                int i96 = charAt22 & 8191;
                int i97 = 13;
                while (true) {
                    i18 = i95 + 1;
                    charAt4 = c13.charAt(i95);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i96 |= (charAt4 & 8191) << i97;
                    i97 += 13;
                    i95 = i18;
                }
                charAt22 = i96 | (charAt4 << i97);
                i95 = i18;
            }
            iArr = new int[charAt22 + charAt20 + charAt21];
            i14 = (charAt18 * 2) + charAt19;
            i15 = charAt18;
            i59 = i95;
            int i98 = charAt22;
            i16 = charAt20;
            i17 = i98;
        }
        Object[] b13 = b2Var.b();
        Class<?> cls = b2Var.a().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 * 2];
        int i99 = i16 + i17;
        int i100 = i17;
        int i101 = i99;
        int i102 = 0;
        int i103 = 0;
        while (i59 < length) {
            int i104 = i59 + 1;
            int charAt23 = c13.charAt(i59);
            if (charAt23 >= i57) {
                int i105 = charAt23 & 8191;
                int i106 = i104;
                int i107 = 13;
                while (true) {
                    i55 = i106 + 1;
                    charAt15 = c13.charAt(i106);
                    i29 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i105 |= (charAt15 & 8191) << i107;
                    i107 += 13;
                    i106 = i55;
                    length = i29;
                }
                charAt23 = i105 | (charAt15 << i107);
                i33 = i55;
            } else {
                i29 = length;
                i33 = i104;
            }
            int i108 = i33 + 1;
            int charAt24 = c13.charAt(i33);
            if (charAt24 >= 55296) {
                int i109 = charAt24 & 8191;
                int i110 = i108;
                int i111 = 13;
                while (true) {
                    i54 = i110 + 1;
                    charAt14 = c13.charAt(i110);
                    i34 = i99;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i109 |= (charAt14 & 8191) << i111;
                    i111 += 13;
                    i110 = i54;
                    i99 = i34;
                }
                charAt24 = i109 | (charAt14 << i111);
                i35 = i54;
            } else {
                i34 = i99;
                i35 = i108;
            }
            int i112 = charAt24 & 255;
            int i113 = i17;
            if ((charAt24 & 1024) != 0) {
                iArr[i103] = i102;
                i103++;
            }
            Unsafe unsafe = f33977p;
            int i114 = charAt2;
            if (i112 >= 51) {
                int i115 = i35 + 1;
                int charAt25 = c13.charAt(i35);
                if (charAt25 >= 55296) {
                    int i116 = charAt25 & 8191;
                    int i117 = i115;
                    int i118 = 13;
                    while (true) {
                        i53 = i117 + 1;
                        charAt13 = c13.charAt(i117);
                        i37 = charAt;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i116 |= (charAt13 & 8191) << i118;
                        i118 += 13;
                        i117 = i53;
                        charAt = i37;
                    }
                    charAt25 = i116 | (charAt13 << i118);
                    i48 = i53;
                } else {
                    i37 = charAt;
                    i48 = i115;
                }
                int i119 = i112 - 51;
                int i120 = i48;
                if (i119 == 9 || i119 == 17) {
                    i36 = charAt23;
                    i49 = 2;
                    objArr[cb.c(i102, 3, 2, 1)] = b13[i14];
                    i14++;
                } else if (i119 != 12 || z14) {
                    i36 = charAt23;
                    i49 = 2;
                } else {
                    i36 = charAt23;
                    i49 = 2;
                    objArr[cb.c(i102, 3, 2, 1)] = b13[i14];
                    i14++;
                }
                int i121 = charAt25 * i49;
                Object obj = b13[i121];
                if (obj instanceof Field) {
                    S2 = (Field) obj;
                } else {
                    S2 = S(cls, (String) obj);
                    b13[i121] = S2;
                }
                i45 = (int) unsafe.objectFieldOffset(S2);
                int i122 = i121 + 1;
                Object obj2 = b13[i122];
                if (obj2 instanceof Field) {
                    S3 = (Field) obj2;
                } else {
                    S3 = S(cls, (String) obj2);
                    b13[i122] = S3;
                }
                i38 = (int) unsafe.objectFieldOffset(S3);
                iArr2 = iArr3;
                z13 = z14;
                i44 = i14;
                i39 = i120;
                i43 = 0;
            } else {
                i36 = charAt23;
                i37 = charAt;
                int i123 = i14 + 1;
                Field S4 = S(cls, (String) b13[i14]);
                if (i112 == 9 || i112 == 17) {
                    iArr2 = iArr3;
                    z13 = z14;
                    objArr[cb.c(i102, 3, 2, 1)] = S4.getType();
                } else {
                    if (i112 == 27 || i112 == 49) {
                        iArr2 = iArr3;
                        z13 = z14;
                        i47 = i14 + 2;
                        objArr[cb.c(i102, 3, 2, 1)] = b13[i123];
                    } else {
                        if (i112 == 12 || i112 == 30 || i112 == 44) {
                            if (!z14) {
                                iArr2 = iArr3;
                                z13 = z14;
                                i47 = i14 + 2;
                                objArr[cb.c(i102, 3, 2, 1)] = b13[i123];
                            }
                        } else if (i112 == 50) {
                            int i124 = i100 + 1;
                            iArr[i100] = i102;
                            int i125 = (i102 / 3) * 2;
                            int i126 = i14 + 2;
                            objArr[i125] = b13[i123];
                            if ((charAt24 & 2048) != 0) {
                                i123 = i14 + 3;
                                objArr[i125 + 1] = b13[i126];
                                iArr2 = iArr3;
                                i100 = i124;
                            } else {
                                iArr2 = iArr3;
                                i100 = i124;
                                i123 = i126;
                            }
                            z13 = z14;
                        }
                        iArr2 = iArr3;
                        z13 = z14;
                    }
                    i123 = i47;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(S4);
                if ((charAt24 & 4096) != 4096 || i112 > 17) {
                    i38 = 1048575;
                    i39 = i35;
                    i43 = 0;
                } else {
                    int i127 = i35 + 1;
                    int charAt26 = c13.charAt(i35);
                    if (charAt26 >= 55296) {
                        int i128 = charAt26 & 8191;
                        int i129 = 13;
                        while (true) {
                            i46 = i127 + 1;
                            charAt12 = c13.charAt(i127);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i128 |= (charAt12 & 8191) << i129;
                            i129 += 13;
                            i127 = i46;
                        }
                        charAt26 = i128 | (charAt12 << i129);
                        i127 = i46;
                    }
                    int i130 = (charAt26 / 32) + (i15 * 2);
                    Object obj3 = b13[i130];
                    if (obj3 instanceof Field) {
                        S = (Field) obj3;
                    } else {
                        S = S(cls, (String) obj3);
                        b13[i130] = S;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(S);
                    i43 = charAt26 % 32;
                    i39 = i127;
                    i38 = objectFieldOffset2;
                }
                if (i112 >= 18 && i112 <= 49) {
                    iArr[i101] = objectFieldOffset;
                    i101++;
                }
                i44 = i123;
                i45 = objectFieldOffset;
            }
            int i131 = i102 + 1;
            iArr2[i102] = i36;
            int i132 = i102 + 2;
            String str = c13;
            iArr2[i131] = ((charAt24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 536870912 : 0) | ((charAt24 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 268435456 : 0) | (i112 << 20) | i45;
            i102 += 3;
            iArr2[i132] = (i43 << 20) | i38;
            i14 = i44;
            i59 = i39;
            iArr3 = iArr2;
            i17 = i113;
            c13 = str;
            length = i29;
            i99 = i34;
            z14 = z13;
            charAt2 = i114;
            charAt = i37;
            i57 = 55296;
        }
        return new s1(iArr3, objArr, charAt, charAt2, b2Var.a(), z14, iArr, i17, i99, u1Var, c1Var, i2Var, zVar, j1Var);
    }

    public static long G(int i13) {
        return i13 & 1048575;
    }

    public static int H(long j13, Object obj) {
        return ((Integer) q2.f33962c.j(j13, obj)).intValue();
    }

    public static long I(long j13, Object obj) {
        return ((Long) q2.f33962c.j(j13, obj)).longValue();
    }

    public static Field S(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder o13 = cb.o("Field ", str, " for ");
            o13.append(cls.getName());
            o13.append(" not found. Known fields are ");
            o13.append(Arrays.toString(declaredFields));
            throw new RuntimeException(o13.toString());
        }
    }

    public static int Y(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    public static void c0(int i13, Object obj, rd.j jVar) {
        if (!(obj instanceof String)) {
            jVar.r(i13, (l) obj);
        } else {
            ((u) jVar.f107506b).V(i13, (String) obj);
        }
    }

    public static void l(Object obj) {
        if (!v(obj)) {
            throw new IllegalArgumentException(a.a.i("Mutating immutable message: ", obj));
        }
    }

    public static int m(byte[] bArr, int i13, int i14, z2 z2Var, Class cls, l7.v vVar) {
        switch (r1.f33972a[z2Var.ordinal()]) {
            case 1:
                int K = g2.K(bArr, i13, vVar);
                vVar.f81886c = Boolean.valueOf(vVar.f81885b != 0);
                return K;
            case 2:
                return g2.f(bArr, i13, vVar);
            case 3:
                vVar.f81886c = Double.valueOf(g2.h(i13, bArr));
                return i13 + 8;
            case 4:
            case 5:
                vVar.f81886c = Integer.valueOf(g2.j(i13, bArr));
                return i13 + 4;
            case 6:
            case 7:
                vVar.f81886c = Long.valueOf(g2.l(i13, bArr));
                return i13 + 8;
            case 8:
                vVar.f81886c = Float.valueOf(g2.n(i13, bArr));
                return i13 + 4;
            case 9:
            case 10:
            case 11:
                int I = g2.I(bArr, i13, vVar);
                vVar.f81886c = Integer.valueOf(vVar.f81884a);
                return I;
            case 12:
            case 13:
                int K2 = g2.K(bArr, i13, vVar);
                vVar.f81886c = Long.valueOf(vVar.f81885b);
                return K2;
            case 14:
                d2 a13 = z1.f34015c.a(cls);
                Object e13 = a13.e();
                int P = g2.P(e13, a13, bArr, i13, i14, vVar);
                a13.b(e13);
                vVar.f81886c = e13;
                return P;
            case 15:
                int I2 = g2.I(bArr, i13, vVar);
                vVar.f81886c = Integer.valueOf(p.b(vVar.f81884a));
                return I2;
            case 16:
                int K3 = g2.K(bArr, i13, vVar);
                vVar.f81886c = Long.valueOf(p.c(vVar.f81885b));
                return K3;
            case 17:
                return g2.F(bArr, i13, vVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static j2 r(Object obj) {
        n0 n0Var = (n0) obj;
        j2 j2Var = n0Var.unknownFields;
        if (j2Var != j2.f33911f) {
            return j2Var;
        }
        j2 j2Var2 = new j2();
        n0Var.unknownFields = j2Var2;
        return j2Var2;
    }

    public static boolean v(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof n0) {
            return ((n0) obj).isMutable();
        }
        return true;
    }

    public static List x(long j13, Object obj) {
        return (List) q2.f33962c.j(j13, obj);
    }

    public final void A(int i13, Object obj, Object obj2) {
        if (u(i13, obj2)) {
            long Z = Z(i13) & 1048575;
            Unsafe unsafe = f33977p;
            Object object = unsafe.getObject(obj2, Z);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f33978a[i13] + " is present but null: " + obj2);
            }
            d2 q13 = q(i13);
            if (!u(i13, obj)) {
                if (v(object)) {
                    Object e13 = q13.e();
                    q13.a(e13, object);
                    unsafe.putObject(obj, Z, e13);
                } else {
                    unsafe.putObject(obj, Z, object);
                }
                T(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, Z);
            if (!v(object2)) {
                Object e14 = q13.e();
                q13.a(e14, object2);
                unsafe.putObject(obj, Z, e14);
                object2 = e14;
            }
            q13.a(object2, object);
        }
    }

    public final void B(int i13, Object obj, Object obj2) {
        int[] iArr = this.f33978a;
        int i14 = iArr[i13];
        if (w(i14, obj2, i13)) {
            long Z = Z(i13) & 1048575;
            Unsafe unsafe = f33977p;
            Object object = unsafe.getObject(obj2, Z);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + obj2);
            }
            d2 q13 = q(i13);
            if (!w(i14, obj, i13)) {
                if (v(object)) {
                    Object e13 = q13.e();
                    q13.a(e13, object);
                    unsafe.putObject(obj, Z, e13);
                } else {
                    unsafe.putObject(obj, Z, object);
                }
                U(i14, obj, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, Z);
            if (!v(object2)) {
                Object e14 = q13.e();
                q13.a(e14, object2);
                unsafe.putObject(obj, Z, e14);
                object2 = e14;
            }
            q13.a(object2, object);
        }
    }

    public final Object C(int i13, Object obj) {
        d2 q13 = q(i13);
        long Z = Z(i13) & 1048575;
        if (!u(i13, obj)) {
            return q13.e();
        }
        Object object = f33977p.getObject(obj, Z);
        if (v(object)) {
            return object;
        }
        Object e13 = q13.e();
        if (object != null) {
            q13.a(e13, object);
        }
        return e13;
    }

    public final Object D(int i13, Object obj, int i14) {
        d2 q13 = q(i14);
        if (!w(i13, obj, i14)) {
            return q13.e();
        }
        Object object = f33977p.getObject(obj, Z(i14) & 1048575);
        if (v(object)) {
            return object;
        }
        Object e13 = q13.e();
        if (object != null) {
            q13.a(e13, object);
        }
        return e13;
    }

    public final int J(Object obj, byte[] bArr, int i13, int i14, int i15, long j13, l7.v vVar) {
        Object p13 = p(i15);
        Unsafe unsafe = f33977p;
        Object object = unsafe.getObject(obj, j13);
        this.f33991n.getClass();
        if (j1.d(object)) {
            i1 f13 = j1.f();
            j1.e(f13, object);
            unsafe.putObject(obj, j13, f13);
            object = f13;
        }
        com.google.firebase.messaging.q a13 = j1.a(p13);
        i1 b13 = j1.b(object);
        int I = g2.I(bArr, i13, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0 || i16 > i14 - I) {
            throw InvalidProtocolBufferException.g();
        }
        int i17 = i16 + I;
        Object obj2 = a13.f33804b;
        Object obj3 = a13.f33806d;
        while (I < i17) {
            int i18 = I + 1;
            int i19 = bArr[I];
            if (i19 < 0) {
                i18 = g2.H(i19, bArr, i18, vVar);
                i19 = vVar.f81884a;
            }
            int i23 = i18;
            int i24 = i19 >>> 3;
            int i25 = i19 & 7;
            if (i24 != 1) {
                if (i24 == 2 && i25 == ((z2) a13.f33805c).getWireType()) {
                    I = m(bArr, i23, i14, (z2) a13.f33805c, a13.f33806d.getClass(), vVar);
                    obj3 = vVar.f81886c;
                }
                I = g2.Q(i19, bArr, i23, i14, vVar);
            } else if (i25 == ((z2) a13.f33803a).getWireType()) {
                I = m(bArr, i23, i14, (z2) a13.f33803a, null, vVar);
                obj2 = vVar.f81886c;
            } else {
                I = g2.Q(i19, bArr, i23, i14, vVar);
            }
        }
        if (I != i17) {
            throw InvalidProtocolBufferException.f();
        }
        b13.put(obj2, obj3);
        return i17;
    }

    public final int K(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, int i23, l7.v vVar) {
        long j14 = this.f33978a[i23 + 2] & 1048575;
        Unsafe unsafe = f33977p;
        switch (i19) {
            case 51:
                if (i17 == 1) {
                    unsafe.putObject(obj, j13, Double.valueOf(g2.h(i13, bArr)));
                    int i24 = i13 + 8;
                    unsafe.putInt(obj, j14, i16);
                    return i24;
                }
                break;
            case 52:
                if (i17 == 5) {
                    unsafe.putObject(obj, j13, Float.valueOf(g2.n(i13, bArr)));
                    int i25 = i13 + 4;
                    unsafe.putInt(obj, j14, i16);
                    return i25;
                }
                break;
            case 53:
            case 54:
                if (i17 == 0) {
                    int K = g2.K(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Long.valueOf(vVar.f81885b));
                    unsafe.putInt(obj, j14, i16);
                    return K;
                }
                break;
            case 55:
            case 62:
                if (i17 == 0) {
                    int I = g2.I(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Integer.valueOf(vVar.f81884a));
                    unsafe.putInt(obj, j14, i16);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i17 == 1) {
                    unsafe.putObject(obj, j13, Long.valueOf(g2.l(i13, bArr)));
                    int i26 = i13 + 8;
                    unsafe.putInt(obj, j14, i16);
                    return i26;
                }
                break;
            case 57:
            case 64:
                if (i17 == 5) {
                    unsafe.putObject(obj, j13, Integer.valueOf(g2.j(i13, bArr)));
                    int i27 = i13 + 4;
                    unsafe.putInt(obj, j14, i16);
                    return i27;
                }
                break;
            case 58:
                if (i17 == 0) {
                    int K2 = g2.K(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Boolean.valueOf(vVar.f81885b != 0));
                    unsafe.putInt(obj, j14, i16);
                    return K2;
                }
                break;
            case 59:
                if (i17 == 2) {
                    int I2 = g2.I(bArr, i13, vVar);
                    int i28 = vVar.f81884a;
                    if (i28 == 0) {
                        unsafe.putObject(obj, j13, "");
                    } else {
                        if ((i18 & 536870912) != 0 && !t2.e(bArr, I2, I2 + i28)) {
                            throw InvalidProtocolBufferException.b();
                        }
                        unsafe.putObject(obj, j13, new String(bArr, I2, i28, w0.f34008a));
                        I2 += i28;
                    }
                    unsafe.putInt(obj, j14, i16);
                    return I2;
                }
                break;
            case 60:
                if (i17 == 2) {
                    Object D = D(i16, obj, i23);
                    int P = g2.P(D, q(i23), bArr, i13, i14, vVar);
                    X(i16, obj, D, i23);
                    return P;
                }
                break;
            case 61:
                if (i17 == 2) {
                    int f13 = g2.f(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, vVar.f81886c);
                    unsafe.putInt(obj, j14, i16);
                    return f13;
                }
                break;
            case 63:
                if (i17 == 0) {
                    int I3 = g2.I(bArr, i13, vVar);
                    int i29 = vVar.f81884a;
                    o(i23);
                    unsafe.putObject(obj, j13, Integer.valueOf(i29));
                    unsafe.putInt(obj, j14, i16);
                    return I3;
                }
                break;
            case 66:
                if (i17 == 0) {
                    int I4 = g2.I(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Integer.valueOf(p.b(vVar.f81884a)));
                    unsafe.putInt(obj, j14, i16);
                    return I4;
                }
                break;
            case 67:
                if (i17 == 0) {
                    int K3 = g2.K(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Long.valueOf(p.c(vVar.f81885b)));
                    unsafe.putInt(obj, j14, i16);
                    return K3;
                }
                break;
            case 68:
                if (i17 == 3) {
                    Object D2 = D(i16, obj, i23);
                    int O = g2.O(D2, q(i23), bArr, i13, i14, (i15 & (-8)) | 4, vVar);
                    X(i16, obj, D2, i23);
                    return O;
                }
                break;
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x031a, code lost:
    
        if (r0 != r33) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031c, code lost:
    
        r15 = r31;
        r13 = r32;
        r3 = r19;
        r11 = r34;
        r10 = r36;
        r12 = r14;
        r1 = r16;
        r5 = r18;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0333, code lost:
    
        r7 = r19;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0366, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0385, code lost:
    
        if (r0 != r15) goto L109;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00a7. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, l7.v r36) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s1.L(java.lang.Object, byte[], int, int, int, l7.v):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0097. Please report as an issue. */
    public final void M(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        int i15;
        int V;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int K;
        int i24;
        int i25;
        int i26;
        int i27;
        s1 s1Var = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i28 = i14;
        l7.v vVar2 = vVar;
        l(obj);
        int i29 = 0;
        int i33 = i13;
        int i34 = 0;
        int i35 = 0;
        int i36 = -1;
        int i37 = 1048575;
        while (true) {
            Unsafe unsafe = f33977p;
            if (i33 >= i28) {
                int i38 = i35;
                int i39 = i37;
                if (i39 != 1048575) {
                    unsafe.putInt(obj, i39, i38);
                }
                if (i33 != i14) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i43 = i33 + 1;
            byte b13 = bArr2[i33];
            if (b13 < 0) {
                int H = g2.H(b13, bArr2, i43, vVar2);
                i15 = vVar2.f81884a;
                i43 = H;
            } else {
                i15 = b13;
            }
            int i44 = i15 >>> 3;
            int i45 = i15 & 7;
            int i46 = s1Var.f33981d;
            int i47 = s1Var.f33980c;
            if (i44 > i36) {
                int i48 = i34 / 3;
                if (i44 >= i47 && i44 <= i46) {
                    V = s1Var.V(i44, i48);
                }
                V = -1;
            } else {
                if (i44 >= i47 && i44 <= i46) {
                    V = s1Var.V(i44, i29);
                }
                V = -1;
            }
            int i49 = V;
            if (i49 == -1) {
                i16 = i43;
                i17 = i44;
                i18 = i29;
                i19 = i18;
            } else {
                int[] iArr = s1Var.f33978a;
                int i53 = iArr[i49 + 1];
                int Y = Y(i53);
                long j13 = i53 & 1048575;
                i17 = i44;
                if (Y <= 17) {
                    int i54 = iArr[i49 + 2];
                    int i55 = 1 << (i54 >>> 20);
                    int i56 = i54 & 1048575;
                    if (i56 != i37) {
                        if (i37 != 1048575) {
                            unsafe.putInt(obj2, i37, i35);
                            i24 = i56;
                        } else {
                            i24 = i56;
                        }
                        if (i24 != 1048575) {
                            i35 = unsafe.getInt(obj2, i24);
                        }
                        i37 = i24;
                    }
                    switch (Y) {
                        case 0:
                            i23 = i43;
                            if (i45 != 1) {
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                q2.r(obj2, j13, g2.h(i23, bArr2));
                                i33 = i23 + 8;
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 1:
                            i23 = i43;
                            if (i45 != 5) {
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                q2.s(obj2, j13, g2.n(i23, bArr2));
                                i33 = i23 + 4;
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 2:
                        case 3:
                            i23 = i43;
                            if (i45 != 0) {
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                K = g2.K(bArr2, i23, vVar2);
                                unsafe.putLong(obj, j13, vVar2.f81885b);
                                i35 |= i55;
                                i34 = i49;
                                i33 = K;
                                i36 = i17;
                                i29 = 0;
                                i28 = i14;
                                break;
                            }
                        case 4:
                        case 11:
                            i23 = i43;
                            if (i45 != 0) {
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i33 = g2.I(bArr2, i23, vVar2);
                                unsafe.putInt(obj2, j13, vVar2.f81884a);
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 5:
                        case 14:
                            if (i45 != 1) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i23 = i43;
                                unsafe.putLong(obj, j13, g2.l(i43, bArr2));
                                i33 = i23 + 8;
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 6:
                        case 13:
                            if (i45 != 5) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                unsafe.putInt(obj2, j13, g2.j(i43, bArr2));
                                i33 = i43 + 4;
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 7:
                            if (i45 != 0) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i33 = g2.K(bArr2, i43, vVar2);
                                q2.n(j13, obj2, vVar2.f81885b != 0);
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 8:
                            if (i45 != 2) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i33 = (i53 & 536870912) == 0 ? g2.C(bArr2, i43, vVar2) : g2.F(bArr2, i43, vVar2);
                                unsafe.putObject(obj2, j13, vVar2.f81886c);
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 9:
                            if (i45 != 2) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                Object C = s1Var.C(i49, obj2);
                                i33 = g2.P(C, s1Var.q(i49), bArr, i43, i14, vVar);
                                s1Var.W(i49, obj2, C);
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 10:
                            if (i45 != 2) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i33 = g2.f(bArr2, i43, vVar2);
                                unsafe.putObject(obj2, j13, vVar2.f81886c);
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 12:
                            if (i45 != 0) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i33 = g2.I(bArr2, i43, vVar2);
                                unsafe.putInt(obj2, j13, vVar2.f81884a);
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 15:
                            if (i45 != 0) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                i33 = g2.I(bArr2, i43, vVar2);
                                unsafe.putInt(obj2, j13, p.b(vVar2.f81884a));
                                i35 |= i55;
                                i28 = i14;
                                i34 = i49;
                                i36 = i17;
                                i29 = 0;
                                break;
                            }
                        case 16:
                            if (i45 != 0) {
                                i23 = i43;
                                i19 = i49;
                                i16 = i23;
                                i18 = 0;
                                break;
                            } else {
                                K = g2.K(bArr2, i43, vVar2);
                                unsafe.putLong(obj, j13, p.c(vVar2.f81885b));
                                i35 |= i55;
                                i34 = i49;
                                i33 = K;
                                i36 = i17;
                                i29 = 0;
                                i28 = i14;
                                break;
                            }
                        default:
                            i23 = i43;
                            i19 = i49;
                            i16 = i23;
                            i18 = 0;
                            break;
                    }
                } else {
                    int i57 = i43;
                    if (Y == 27) {
                        if (i45 == 2) {
                            c cVar = (c) ((v0) unsafe.getObject(obj2, j13));
                            boolean c13 = cVar.c();
                            v0 v0Var = cVar;
                            if (!c13) {
                                int size = cVar.size();
                                v0 g13 = cVar.g(size == 0 ? 10 : size * 2);
                                unsafe.putObject(obj2, j13, g13);
                                v0Var = g13;
                            }
                            i33 = g2.q(s1Var.q(i49), i15, bArr, i57, i14, v0Var, vVar);
                            i28 = i14;
                            i35 = i35;
                            i34 = i49;
                            i36 = i17;
                            i29 = 0;
                        } else {
                            i25 = i57;
                            i26 = i35;
                            i27 = i37;
                            i19 = i49;
                            i18 = 0;
                        }
                    } else if (Y <= 49) {
                        i26 = i35;
                        i27 = i37;
                        i18 = 0;
                        i19 = i49;
                        i33 = N(obj, bArr, i57, i14, i15, i45, i49, i53, Y, j13, vVar);
                        if (i33 != i57) {
                            s1Var = this;
                            bArr2 = bArr;
                            i28 = i14;
                            vVar2 = vVar;
                            i37 = i27;
                            i29 = i18;
                            i36 = i17;
                            i34 = i19;
                            i35 = i26;
                            obj2 = obj;
                        } else {
                            i16 = i33;
                            i37 = i27;
                            i35 = i26;
                        }
                    } else {
                        i25 = i57;
                        i26 = i35;
                        i27 = i37;
                        i18 = 0;
                        i19 = i49;
                        if (Y != 50) {
                            i33 = K(obj, bArr, i25, i14, i15, i17, i45, i53, Y, j13, i19, vVar);
                            if (i33 != i25) {
                                s1Var = this;
                                bArr2 = bArr;
                                i28 = i14;
                                vVar2 = vVar;
                                i37 = i27;
                                i29 = i18;
                                i36 = i17;
                                i34 = i19;
                                i35 = i26;
                                obj2 = obj;
                            } else {
                                i16 = i33;
                                i37 = i27;
                                i35 = i26;
                            }
                        } else if (i45 == 2) {
                            i33 = J(obj, bArr, i25, i14, i19, j13, vVar);
                            if (i33 != i25) {
                                s1Var = this;
                                bArr2 = bArr;
                                i28 = i14;
                                vVar2 = vVar;
                                i37 = i27;
                                i29 = i18;
                                i36 = i17;
                                i34 = i19;
                                i35 = i26;
                                obj2 = obj;
                            } else {
                                i16 = i33;
                                i37 = i27;
                                i35 = i26;
                            }
                        }
                    }
                    i16 = i25;
                    i37 = i27;
                    i35 = i26;
                }
            }
            i33 = g2.G(i15, bArr, i16, i14, r(obj), vVar);
            s1Var = this;
            obj2 = obj;
            bArr2 = bArr;
            i28 = i14;
            vVar2 = vVar;
            i29 = i18;
            i36 = i17;
            i34 = i19;
        }
    }

    public final int N(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, long j13, int i18, long j14, l7.v vVar) {
        int J2;
        Unsafe unsafe = f33977p;
        c cVar = (c) ((v0) unsafe.getObject(obj, j14));
        boolean c13 = cVar.c();
        v0 v0Var = cVar;
        if (!c13) {
            int size = cVar.size();
            v0 g13 = cVar.g(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j14, g13);
            v0Var = g13;
        }
        switch (i18) {
            case 18:
            case 35:
                if (i16 == 2) {
                    return g2.s(bArr, i13, v0Var, vVar);
                }
                if (i16 == 1) {
                    return g2.i(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 19:
            case 36:
                if (i16 == 2) {
                    return g2.v(bArr, i13, v0Var, vVar);
                }
                if (i16 == 5) {
                    return g2.o(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i16 == 2) {
                    return g2.z(bArr, i13, v0Var, vVar);
                }
                if (i16 == 0) {
                    return g2.L(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i16 == 2) {
                    return g2.y(bArr, i13, v0Var, vVar);
                }
                if (i16 == 0) {
                    return g2.J(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i16 == 2) {
                    return g2.u(bArr, i13, v0Var, vVar);
                }
                if (i16 == 1) {
                    return g2.m(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i16 == 2) {
                    return g2.t(bArr, i13, v0Var, vVar);
                }
                if (i16 == 5) {
                    return g2.k(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 25:
            case 42:
                if (i16 == 2) {
                    return g2.r(bArr, i13, v0Var, vVar);
                }
                if (i16 == 0) {
                    return g2.e(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 26:
                if (i16 == 2) {
                    return (j13 & 536870912) == 0 ? g2.D(i15, bArr, i13, i14, v0Var, vVar) : g2.E(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 27:
                if (i16 == 2) {
                    return g2.q(q(i17), i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 28:
                if (i16 == 2) {
                    return g2.g(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 30:
            case 44:
                if (i16 == 2) {
                    J2 = g2.y(bArr, i13, v0Var, vVar);
                } else if (i16 == 0) {
                    J2 = g2.J(i15, bArr, i13, i14, v0Var, vVar);
                }
                o(i17);
                Class cls = e2.f33876a;
                return J2;
            case 33:
            case 47:
                if (i16 == 2) {
                    return g2.w(bArr, i13, v0Var, vVar);
                }
                if (i16 == 0) {
                    return g2.A(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 34:
            case 48:
                if (i16 == 2) {
                    return g2.x(bArr, i13, v0Var, vVar);
                }
                if (i16 == 0) {
                    return g2.B(i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
            case 49:
                if (i16 == 3) {
                    return g2.p(q(i17), i15, bArr, i13, i14, v0Var, vVar);
                }
                break;
        }
        return i13;
    }

    public final void O(Object obj, long j13, c2 c2Var, d2 d2Var, y yVar) {
        ((r) c2Var).v(this.f33989l.c(j13, obj), d2Var, yVar);
    }

    public final void P(Object obj, int i13, c2 c2Var, d2 d2Var, y yVar) {
        ((r) c2Var).C(this.f33989l.c(i13 & 1048575, obj), d2Var, yVar);
    }

    public final void Q(Object obj, int i13, c2 c2Var) {
        if ((536870912 & i13) != 0) {
            q2.v(i13 & 1048575, obj, ((r) c2Var).P());
        } else if (this.f33983f) {
            q2.v(i13 & 1048575, obj, ((r) c2Var).L());
        } else {
            q2.v(i13 & 1048575, obj, ((r) c2Var).j());
        }
    }

    public final void R(Object obj, int i13, c2 c2Var) {
        boolean z13 = (536870912 & i13) != 0;
        c1 c1Var = this.f33989l;
        if (z13) {
            ((r) c2Var).O(c1Var.c(i13 & 1048575, obj));
        } else {
            ((r) c2Var).M(c1Var.c(i13 & 1048575, obj));
        }
    }

    public final void T(int i13, Object obj) {
        int i14 = this.f33978a[i13 + 2];
        long j13 = 1048575 & i14;
        if (j13 == 1048575) {
            return;
        }
        q2.t((1 << (i14 >>> 20)) | q2.f33962c.h(j13, obj), j13, obj);
    }

    public final void U(int i13, Object obj, int i14) {
        q2.t(i13, this.f33978a[i14 + 2] & 1048575, obj);
    }

    public final int V(int i13, int i14) {
        int[] iArr = this.f33978a;
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

    public final void W(int i13, Object obj, Object obj2) {
        f33977p.putObject(obj, Z(i13) & 1048575, obj2);
        T(i13, obj);
    }

    public final void X(int i13, Object obj, Object obj2, int i14) {
        f33977p.putObject(obj, Z(i14) & 1048575, obj2);
        U(i13, obj, i14);
    }

    public final int Z(int i13) {
        return this.f33978a[i13 + 1];
    }

    @Override // com.google.protobuf.d2
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f33978a;
            if (i13 >= iArr.length) {
                e2.B(this.f33990m, obj, obj2);
                return;
            }
            int Z = Z(i13);
            long j13 = 1048575 & Z;
            int i14 = iArr[i13];
            switch (Y(Z)) {
                case 0:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.r(obj, j13, q2.f33962c.f(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 1:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.s(obj, j13, q2.f33962c.g(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 2:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.u(j13, obj, q2.f33962c.i(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 3:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.u(j13, obj, q2.f33962c.i(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 4:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.t(q2.f33962c.h(j13, obj2), j13, obj);
                        T(i13, obj);
                        break;
                    }
                case 5:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.u(j13, obj, q2.f33962c.i(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 6:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.t(q2.f33962c.h(j13, obj2), j13, obj);
                        T(i13, obj);
                        break;
                    }
                case 7:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.n(j13, obj, q2.f33962c.d(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 8:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.v(j13, obj, q2.f33962c.j(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 9:
                    A(i13, obj, obj2);
                    break;
                case 10:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.v(j13, obj, q2.f33962c.j(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 11:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.t(q2.f33962c.h(j13, obj2), j13, obj);
                        T(i13, obj);
                        break;
                    }
                case 12:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.t(q2.f33962c.h(j13, obj2), j13, obj);
                        T(i13, obj);
                        break;
                    }
                case 13:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.t(q2.f33962c.h(j13, obj2), j13, obj);
                        T(i13, obj);
                        break;
                    }
                case 14:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.u(j13, obj, q2.f33962c.i(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 15:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.t(q2.f33962c.h(j13, obj2), j13, obj);
                        T(i13, obj);
                        break;
                    }
                case 16:
                    if (!u(i13, obj2)) {
                        break;
                    } else {
                        q2.u(j13, obj, q2.f33962c.i(j13, obj2));
                        T(i13, obj);
                        break;
                    }
                case 17:
                    A(i13, obj, obj2);
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
                    this.f33989l.b(j13, obj, obj2);
                    break;
                case 50:
                    Class cls = e2.f33876a;
                    p2 p2Var = q2.f33962c;
                    Object j14 = p2Var.j(j13, obj);
                    Object j15 = p2Var.j(j13, obj2);
                    this.f33991n.getClass();
                    q2.v(j13, obj, j1.e(j14, j15));
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
                        q2.v(j13, obj, q2.f33962c.j(j13, obj2));
                        U(i14, obj, i13);
                        break;
                    }
                case 60:
                    B(i13, obj, obj2);
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
                        q2.v(j13, obj, q2.f33962c.j(j13, obj2));
                        U(i14, obj, i13);
                        break;
                    }
                case 68:
                    B(i13, obj, obj2);
                    break;
            }
            i13 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a0(Object obj, rd.j jVar) {
        int i13;
        boolean z13;
        int[] iArr = this.f33978a;
        int length = iArr.length;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            int Z = Z(i16);
            int i18 = iArr[i16];
            int Y = Y(Z);
            Unsafe unsafe = f33977p;
            if (Y <= 17) {
                int i19 = iArr[i16 + 2];
                int i23 = i19 & i14;
                if (i23 != i15) {
                    i17 = unsafe.getInt(obj, i23);
                    i15 = i23;
                }
                i13 = 1 << (i19 >>> 20);
            } else {
                i13 = 0;
            }
            int i24 = i13;
            long j13 = Z & i14;
            switch (Y) {
                case 0:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.s(i18, q2.f33962c.f(j13, obj));
                        break;
                    }
                case 1:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.x(i18, q2.f33962c.g(j13, obj));
                        break;
                    }
                case 2:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.A(i18, unsafe.getLong(obj, j13));
                        break;
                    }
                case 3:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.H(i18, unsafe.getLong(obj, j13));
                        break;
                    }
                case 4:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.z(i18, unsafe.getInt(obj, j13));
                        break;
                    }
                case 5:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.w(i18, unsafe.getLong(obj, j13));
                        break;
                    }
                case 6:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.v(i18, unsafe.getInt(obj, j13));
                        break;
                    }
                case 7:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.q(i18, q2.f33962c.d(j13, obj));
                        break;
                    }
                case 8:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        c0(i18, unsafe.getObject(obj, j13), jVar);
                        break;
                    }
                case 9:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.B(i18, q(i16), unsafe.getObject(obj, j13));
                        break;
                    }
                case 10:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.r(i18, (l) unsafe.getObject(obj, j13));
                        break;
                    }
                case 11:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.G(i18, unsafe.getInt(obj, j13));
                        break;
                    }
                case 12:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.t(i18, unsafe.getInt(obj, j13));
                        break;
                    }
                case 13:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.C(i18, unsafe.getInt(obj, j13));
                        break;
                    }
                case 14:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.D(i18, unsafe.getLong(obj, j13));
                        break;
                    }
                case 15:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.E(i18, unsafe.getInt(obj, j13));
                        break;
                    }
                case 16:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.F(i18, unsafe.getLong(obj, j13));
                        break;
                    }
                case 17:
                    if ((i17 & i24) == 0) {
                        break;
                    } else {
                        jVar.y(i18, q(i16), unsafe.getObject(obj, j13));
                        break;
                    }
                case 18:
                    e2.H(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 19:
                    e2.L(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 20:
                    e2.O(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 21:
                    e2.W(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 22:
                    e2.N(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 23:
                    e2.K(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 24:
                    e2.J(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 25:
                    e2.F(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 26:
                    e2.U(iArr[i16], (List) unsafe.getObject(obj, j13), jVar);
                    break;
                case 27:
                    e2.P(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, q(i16));
                    break;
                case 28:
                    e2.G(iArr[i16], (List) unsafe.getObject(obj, j13), jVar);
                    break;
                case 29:
                    z13 = false;
                    e2.V(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 30:
                    z13 = false;
                    e2.I(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 31:
                    z13 = false;
                    e2.Q(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 32:
                    z13 = false;
                    e2.R(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 33:
                    z13 = false;
                    e2.S(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 34:
                    z13 = false;
                    e2.T(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, false);
                    break;
                case 35:
                    e2.H(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 36:
                    e2.L(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 37:
                    e2.O(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 38:
                    e2.W(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 39:
                    e2.N(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 40:
                    e2.K(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 41:
                    e2.J(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 42:
                    e2.F(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 43:
                    e2.V(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 44:
                    e2.I(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 45:
                    e2.Q(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 46:
                    e2.R(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 47:
                    e2.S(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 48:
                    e2.T(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, true);
                    break;
                case 49:
                    e2.M(iArr[i16], (List) unsafe.getObject(obj, j13), jVar, q(i16));
                    break;
                case 50:
                    b0(jVar, i18, unsafe.getObject(obj, j13), i16);
                    break;
                case 51:
                    if (w(i18, obj, i16)) {
                        jVar.s(i18, ((Double) q2.f33962c.j(j13, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (w(i18, obj, i16)) {
                        jVar.x(i18, ((Float) q2.f33962c.j(j13, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (w(i18, obj, i16)) {
                        jVar.A(i18, I(j13, obj));
                    }
                    break;
                case 54:
                    if (w(i18, obj, i16)) {
                        jVar.H(i18, I(j13, obj));
                    }
                    break;
                case 55:
                    if (w(i18, obj, i16)) {
                        jVar.z(i18, H(j13, obj));
                    }
                    break;
                case 56:
                    if (w(i18, obj, i16)) {
                        jVar.w(i18, I(j13, obj));
                    }
                    break;
                case 57:
                    if (w(i18, obj, i16)) {
                        jVar.v(i18, H(j13, obj));
                    }
                    break;
                case 58:
                    if (w(i18, obj, i16)) {
                        jVar.q(i18, ((Boolean) q2.f33962c.j(j13, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (w(i18, obj, i16)) {
                        c0(i18, unsafe.getObject(obj, j13), jVar);
                    }
                    break;
                case 60:
                    if (w(i18, obj, i16)) {
                        jVar.B(i18, q(i16), unsafe.getObject(obj, j13));
                    }
                    break;
                case 61:
                    if (w(i18, obj, i16)) {
                        jVar.r(i18, (l) unsafe.getObject(obj, j13));
                    }
                    break;
                case 62:
                    if (w(i18, obj, i16)) {
                        jVar.G(i18, H(j13, obj));
                    }
                    break;
                case 63:
                    if (w(i18, obj, i16)) {
                        jVar.t(i18, H(j13, obj));
                    }
                    break;
                case 64:
                    if (w(i18, obj, i16)) {
                        jVar.C(i18, H(j13, obj));
                    }
                    break;
                case 65:
                    if (w(i18, obj, i16)) {
                        jVar.D(i18, I(j13, obj));
                    }
                    break;
                case 66:
                    if (w(i18, obj, i16)) {
                        jVar.E(i18, H(j13, obj));
                    }
                    break;
                case 67:
                    if (w(i18, obj, i16)) {
                        jVar.F(i18, I(j13, obj));
                    }
                    break;
                case 68:
                    if (w(i18, obj, i16)) {
                        jVar.y(i18, q(i16), unsafe.getObject(obj, j13));
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        ((k2) this.f33990m).getClass();
        ((n0) obj).unknownFields.g(jVar);
    }

    @Override // com.google.protobuf.d2
    public final void b(Object obj) {
        if (v(obj)) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                n0Var.clearMemoizedSerializedSize();
                n0Var.clearMemoizedHashCode();
                n0Var.markImmutable();
            }
            int[] iArr = this.f33978a;
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int Z = Z(i13);
                long j13 = 1048575 & Z;
                int Y = Y(Z);
                Unsafe unsafe = f33977p;
                if (Y != 9) {
                    if (Y != 60 && Y != 68) {
                        switch (Y) {
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
                                this.f33989l.a(j13, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j13);
                                if (object != null) {
                                    this.f33991n.getClass();
                                    j1.g(object);
                                    unsafe.putObject(obj, j13, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (w(iArr[i13], obj, i13)) {
                        q(i13).b(unsafe.getObject(obj, j13));
                    }
                }
                if (u(i13, obj)) {
                    q(i13).b(unsafe.getObject(obj, j13));
                }
            }
            this.f33990m.b(obj);
        }
    }

    public final void b0(rd.j jVar, int i13, Object obj, int i14) {
        if (obj != null) {
            Object p13 = p(i14);
            this.f33991n.getClass();
            com.google.firebase.messaging.q qVar = ((h1) p13).f33902a;
            u uVar = (u) jVar.f107506b;
            uVar.getClass();
            for (Map.Entry entry : ((i1) obj).entrySet()) {
                uVar.X(i13, 2);
                uVar.Z(h1.b(qVar, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                c0.f(uVar, (z2) qVar.f33803a, 1, key);
                c0.f(uVar, (z2) qVar.f33805c, 2, value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011c A[SYNTHETIC] */
    @Override // com.google.protobuf.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s1.c(java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.d2
    public final int d(Object obj) {
        return this.f33984g ? t(obj) : s(obj);
    }

    @Override // com.google.protobuf.d2
    public final Object e() {
        this.f33988k.getClass();
        return ((n0) this.f33982e).newMutableInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.protobuf.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s1.f(java.lang.Object):int");
    }

    @Override // com.google.protobuf.d2
    public final boolean g(Object obj, Object obj2) {
        boolean E;
        int[] iArr = this.f33978a;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int Z = Z(i13);
            long j13 = Z & 1048575;
            switch (Y(Z)) {
                case 0:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var = q2.f33962c;
                        if (Double.doubleToLongBits(p2Var.f(j13, obj)) == Double.doubleToLongBits(p2Var.f(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var2 = q2.f33962c;
                        if (Float.floatToIntBits(p2Var2.g(j13, obj)) == Float.floatToIntBits(p2Var2.g(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var3 = q2.f33962c;
                        if (p2Var3.i(j13, obj) == p2Var3.i(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var4 = q2.f33962c;
                        if (p2Var4.i(j13, obj) == p2Var4.i(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var5 = q2.f33962c;
                        if (p2Var5.h(j13, obj) == p2Var5.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var6 = q2.f33962c;
                        if (p2Var6.i(j13, obj) == p2Var6.i(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var7 = q2.f33962c;
                        if (p2Var7.h(j13, obj) == p2Var7.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var8 = q2.f33962c;
                        if (p2Var8.d(j13, obj) == p2Var8.d(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var9 = q2.f33962c;
                        if (e2.E(p2Var9.j(j13, obj), p2Var9.j(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var10 = q2.f33962c;
                        if (e2.E(p2Var10.j(j13, obj), p2Var10.j(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var11 = q2.f33962c;
                        if (e2.E(p2Var11.j(j13, obj), p2Var11.j(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var12 = q2.f33962c;
                        if (p2Var12.h(j13, obj) == p2Var12.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var13 = q2.f33962c;
                        if (p2Var13.h(j13, obj) == p2Var13.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var14 = q2.f33962c;
                        if (p2Var14.h(j13, obj) == p2Var14.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var15 = q2.f33962c;
                        if (p2Var15.i(j13, obj) == p2Var15.i(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var16 = q2.f33962c;
                        if (p2Var16.h(j13, obj) == p2Var16.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var17 = q2.f33962c;
                        if (p2Var17.i(j13, obj) == p2Var17.i(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (k(i13, obj, obj2)) {
                        p2 p2Var18 = q2.f33962c;
                        if (e2.E(p2Var18.j(j13, obj), p2Var18.j(j13, obj2))) {
                            continue;
                        }
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
                    p2 p2Var19 = q2.f33962c;
                    E = e2.E(p2Var19.j(j13, obj), p2Var19.j(j13, obj2));
                    break;
                case 50:
                    p2 p2Var20 = q2.f33962c;
                    E = e2.E(p2Var20.j(j13, obj), p2Var20.j(j13, obj2));
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
                    long j14 = iArr[i13 + 2] & 1048575;
                    p2 p2Var21 = q2.f33962c;
                    if (p2Var21.h(j14, obj) == p2Var21.h(j14, obj2) && e2.E(p2Var21.j(j13, obj), p2Var21.j(j13, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!E) {
                return false;
            }
        }
        k2 k2Var = (k2) this.f33990m;
        k2Var.getClass();
        j2 j2Var = ((n0) obj).unknownFields;
        k2Var.getClass();
        return j2Var.equals(((n0) obj2).unknownFields);
    }

    @Override // com.google.protobuf.d2
    public final void h(Object obj, rd.j jVar) {
        jVar.getClass();
        b3 b3Var = b3.ASCENDING;
        b3 b3Var2 = b3.DESCENDING;
        int[] iArr = this.f33978a;
        i2 i2Var = this.f33990m;
        if (b3Var == b3Var2) {
            ((k2) i2Var).getClass();
            ((n0) obj).unknownFields.g(jVar);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int Z = Z(length);
                int i13 = iArr[length];
                switch (Y(Z)) {
                    case 0:
                        if (u(length, obj)) {
                            jVar.s(i13, q2.f33962c.f(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (u(length, obj)) {
                            jVar.x(i13, q2.f33962c.g(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (u(length, obj)) {
                            jVar.A(i13, q2.f33962c.i(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (u(length, obj)) {
                            jVar.H(i13, q2.f33962c.i(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (u(length, obj)) {
                            jVar.z(i13, q2.f33962c.h(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (u(length, obj)) {
                            jVar.w(i13, q2.f33962c.i(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (u(length, obj)) {
                            jVar.v(i13, q2.f33962c.h(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (u(length, obj)) {
                            jVar.q(i13, q2.f33962c.d(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (u(length, obj)) {
                            c0(i13, q2.f33962c.j(Z & 1048575, obj), jVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (u(length, obj)) {
                            jVar.B(i13, q(length), q2.f33962c.j(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (u(length, obj)) {
                            jVar.r(i13, (l) q2.f33962c.j(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (u(length, obj)) {
                            jVar.G(i13, q2.f33962c.h(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (u(length, obj)) {
                            jVar.t(i13, q2.f33962c.h(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (u(length, obj)) {
                            jVar.C(i13, q2.f33962c.h(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (u(length, obj)) {
                            jVar.D(i13, q2.f33962c.i(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (u(length, obj)) {
                            jVar.E(i13, q2.f33962c.h(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (u(length, obj)) {
                            jVar.F(i13, q2.f33962c.i(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (u(length, obj)) {
                            jVar.y(i13, q(length), q2.f33962c.j(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        e2.H(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 19:
                        e2.L(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 20:
                        e2.O(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 21:
                        e2.W(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 22:
                        e2.N(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 23:
                        e2.K(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 24:
                        e2.J(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 25:
                        e2.F(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 26:
                        e2.U(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar);
                        break;
                    case 27:
                        e2.P(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, q(length));
                        break;
                    case 28:
                        e2.G(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar);
                        break;
                    case 29:
                        e2.V(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 30:
                        e2.I(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 31:
                        e2.Q(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 32:
                        e2.R(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 33:
                        e2.S(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 34:
                        e2.T(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, false);
                        break;
                    case 35:
                        e2.H(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 36:
                        e2.L(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 37:
                        e2.O(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 38:
                        e2.W(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 39:
                        e2.N(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 40:
                        e2.K(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 41:
                        e2.J(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 42:
                        e2.F(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 43:
                        e2.V(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 44:
                        e2.I(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 45:
                        e2.Q(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 46:
                        e2.R(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 47:
                        e2.S(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 48:
                        e2.T(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, true);
                        break;
                    case 49:
                        e2.M(iArr[length], (List) q2.f33962c.j(Z & 1048575, obj), jVar, q(length));
                        break;
                    case 50:
                        b0(jVar, i13, q2.f33962c.j(Z & 1048575, obj), length);
                        break;
                    case 51:
                        if (w(i13, obj, length)) {
                            jVar.s(i13, ((Double) q2.f33962c.j(Z & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (w(i13, obj, length)) {
                            jVar.x(i13, ((Float) q2.f33962c.j(Z & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (w(i13, obj, length)) {
                            jVar.A(i13, I(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (w(i13, obj, length)) {
                            jVar.H(i13, I(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (w(i13, obj, length)) {
                            jVar.z(i13, H(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (w(i13, obj, length)) {
                            jVar.w(i13, I(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (w(i13, obj, length)) {
                            jVar.v(i13, H(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (w(i13, obj, length)) {
                            jVar.q(i13, ((Boolean) q2.f33962c.j(Z & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (w(i13, obj, length)) {
                            c0(i13, q2.f33962c.j(Z & 1048575, obj), jVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (w(i13, obj, length)) {
                            jVar.B(i13, q(length), q2.f33962c.j(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (w(i13, obj, length)) {
                            jVar.r(i13, (l) q2.f33962c.j(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (w(i13, obj, length)) {
                            jVar.G(i13, H(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (w(i13, obj, length)) {
                            jVar.t(i13, H(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (w(i13, obj, length)) {
                            jVar.C(i13, H(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (w(i13, obj, length)) {
                            jVar.D(i13, I(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (w(i13, obj, length)) {
                            jVar.E(i13, H(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (w(i13, obj, length)) {
                            jVar.F(i13, I(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (w(i13, obj, length)) {
                            jVar.y(i13, q(length), q2.f33962c.j(Z & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        if (!this.f33984g) {
            a0(obj, jVar);
            return;
        }
        int length2 = iArr.length;
        for (int i14 = 0; i14 < length2; i14 += 3) {
            int Z2 = Z(i14);
            int i15 = iArr[i14];
            switch (Y(Z2)) {
                case 0:
                    if (u(i14, obj)) {
                        jVar.s(i15, q2.f33962c.f(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (u(i14, obj)) {
                        jVar.x(i15, q2.f33962c.g(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (u(i14, obj)) {
                        jVar.A(i15, q2.f33962c.i(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (u(i14, obj)) {
                        jVar.H(i15, q2.f33962c.i(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (u(i14, obj)) {
                        jVar.z(i15, q2.f33962c.h(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (u(i14, obj)) {
                        jVar.w(i15, q2.f33962c.i(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (u(i14, obj)) {
                        jVar.v(i15, q2.f33962c.h(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (u(i14, obj)) {
                        jVar.q(i15, q2.f33962c.d(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (u(i14, obj)) {
                        c0(i15, q2.f33962c.j(Z2 & 1048575, obj), jVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (u(i14, obj)) {
                        jVar.B(i15, q(i14), q2.f33962c.j(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (u(i14, obj)) {
                        jVar.r(i15, (l) q2.f33962c.j(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (u(i14, obj)) {
                        jVar.G(i15, q2.f33962c.h(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (u(i14, obj)) {
                        jVar.t(i15, q2.f33962c.h(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (u(i14, obj)) {
                        jVar.C(i15, q2.f33962c.h(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (u(i14, obj)) {
                        jVar.D(i15, q2.f33962c.i(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (u(i14, obj)) {
                        jVar.E(i15, q2.f33962c.h(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (u(i14, obj)) {
                        jVar.F(i15, q2.f33962c.i(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (u(i14, obj)) {
                        jVar.y(i15, q(i14), q2.f33962c.j(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    e2.H(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 19:
                    e2.L(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 20:
                    e2.O(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 21:
                    e2.W(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 22:
                    e2.N(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 23:
                    e2.K(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 24:
                    e2.J(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 25:
                    e2.F(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 26:
                    e2.U(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar);
                    break;
                case 27:
                    e2.P(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, q(i14));
                    break;
                case 28:
                    e2.G(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar);
                    break;
                case 29:
                    e2.V(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 30:
                    e2.I(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 31:
                    e2.Q(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 32:
                    e2.R(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 33:
                    e2.S(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 34:
                    e2.T(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, false);
                    break;
                case 35:
                    e2.H(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 36:
                    e2.L(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 37:
                    e2.O(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 38:
                    e2.W(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 39:
                    e2.N(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 40:
                    e2.K(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 41:
                    e2.J(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 42:
                    e2.F(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 43:
                    e2.V(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 44:
                    e2.I(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 45:
                    e2.Q(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 46:
                    e2.R(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 47:
                    e2.S(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 48:
                    e2.T(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, true);
                    break;
                case 49:
                    e2.M(iArr[i14], (List) q2.f33962c.j(Z2 & 1048575, obj), jVar, q(i14));
                    break;
                case 50:
                    b0(jVar, i15, q2.f33962c.j(Z2 & 1048575, obj), i14);
                    break;
                case 51:
                    if (w(i15, obj, i14)) {
                        jVar.s(i15, ((Double) q2.f33962c.j(Z2 & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(i15, obj, i14)) {
                        jVar.x(i15, ((Float) q2.f33962c.j(Z2 & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(i15, obj, i14)) {
                        jVar.A(i15, I(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(i15, obj, i14)) {
                        jVar.H(i15, I(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(i15, obj, i14)) {
                        jVar.z(i15, H(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(i15, obj, i14)) {
                        jVar.w(i15, I(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(i15, obj, i14)) {
                        jVar.v(i15, H(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(i15, obj, i14)) {
                        jVar.q(i15, ((Boolean) q2.f33962c.j(Z2 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(i15, obj, i14)) {
                        c0(i15, q2.f33962c.j(Z2 & 1048575, obj), jVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (w(i15, obj, i14)) {
                        jVar.B(i15, q(i14), q2.f33962c.j(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(i15, obj, i14)) {
                        jVar.r(i15, (l) q2.f33962c.j(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(i15, obj, i14)) {
                        jVar.G(i15, H(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(i15, obj, i14)) {
                        jVar.t(i15, H(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(i15, obj, i14)) {
                        jVar.C(i15, H(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(i15, obj, i14)) {
                        jVar.D(i15, I(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(i15, obj, i14)) {
                        jVar.E(i15, H(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(i15, obj, i14)) {
                        jVar.F(i15, I(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(i15, obj, i14)) {
                        jVar.y(i15, q(i14), q2.f33962c.j(Z2 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((k2) i2Var).getClass();
        ((n0) obj).unknownFields.g(jVar);
    }

    @Override // com.google.protobuf.d2
    public final void i(Object obj, c2 c2Var, y yVar) {
        yVar.getClass();
        l(obj);
        y(this.f33990m, obj, c2Var, yVar);
    }

    @Override // com.google.protobuf.d2
    public final void j(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        if (this.f33984g) {
            M(obj, bArr, i13, i14, vVar);
        } else {
            L(obj, bArr, i13, i14, 0, vVar);
        }
    }

    public final boolean k(int i13, Object obj, Object obj2) {
        return u(i13, obj) == u(i13, obj2);
    }

    public final void n(Object obj, int i13, Object obj2) {
        int i14 = this.f33978a[i13];
        if (q2.f33962c.j(Z(i13) & 1048575, obj) == null) {
            return;
        }
        o(i13);
    }

    public final void o(int i13) {
        ep.b.A(this.f33979b[cb.c(i13, 3, 2, 1)]);
    }

    public final Object p(int i13) {
        return this.f33979b[(i13 / 3) * 2];
    }

    public final d2 q(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f33979b;
        d2 d2Var = (d2) objArr[i14];
        if (d2Var != null) {
            return d2Var;
        }
        d2 a13 = z1.f34015c.a((Class) objArr[i14 + 1]);
        objArr[i14] = a13;
        return a13;
    }

    public final int s(Object obj) {
        int i13;
        int m13;
        int k13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = this.f33978a;
            if (i14 >= iArr.length) {
                ((k2) this.f33990m).getClass();
                return ((n0) obj).unknownFields.c() + i15;
            }
            int Z = Z(i14);
            int i18 = iArr[i14];
            int Y = Y(Z);
            Unsafe unsafe = f33977p;
            if (Y <= 17) {
                int i19 = iArr[i14 + 2];
                int i23 = i19 & 1048575;
                i13 = 1 << (i19 >>> 20);
                if (i23 != i17) {
                    i16 = unsafe.getInt(obj, i23);
                    i17 = i23;
                }
            } else {
                i13 = 0;
            }
            long j13 = Z & 1048575;
            switch (Y) {
                case 0:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.m(i18);
                        i15 += m13;
                        break;
                    }
                case 1:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.q(i18);
                        i15 += m13;
                        break;
                    }
                case 2:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.u(i18, unsafe.getLong(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 3:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.E(i18, unsafe.getLong(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 4:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.s(i18, unsafe.getInt(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 5:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.p(i18);
                        i15 += m13;
                        break;
                    }
                case 6:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.o(i18);
                        i15 += m13;
                        break;
                    }
                case 7:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.j(i18);
                        i15 += m13;
                        break;
                    }
                case 8:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j13);
                        k13 = object instanceof l ? u.k(i18, (l) object) : u.z(i18, (String) object);
                        i15 = k13 + i15;
                        break;
                    }
                case 9:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = e2.o(i18, q(i14), unsafe.getObject(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 10:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.k(i18, (l) unsafe.getObject(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 11:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.C(i18, unsafe.getInt(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 12:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.n(i18, unsafe.getInt(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 13:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.v(i18);
                        i15 += m13;
                        break;
                    }
                case 14:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.w(i18);
                        i15 += m13;
                        break;
                    }
                case 15:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.x(i18, unsafe.getInt(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 16:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.y(i18, unsafe.getLong(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 17:
                    if ((i13 & i16) == 0) {
                        break;
                    } else {
                        m13 = u.r(i18, (o1) unsafe.getObject(obj, j13), q(i14));
                        i15 += m13;
                        break;
                    }
                case 18:
                    m13 = e2.h(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 19:
                    m13 = e2.f(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 20:
                    m13 = e2.m(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 21:
                    m13 = e2.x(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 22:
                    m13 = e2.k(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 23:
                    m13 = e2.h(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 24:
                    m13 = e2.f(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 25:
                    m13 = e2.a(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 26:
                    m13 = e2.u(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 27:
                    m13 = e2.p(i18, (List) unsafe.getObject(obj, j13), q(i14));
                    i15 += m13;
                    break;
                case 28:
                    m13 = e2.c(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 29:
                    m13 = e2.v(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 30:
                    m13 = e2.d(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 31:
                    m13 = e2.f(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 32:
                    m13 = e2.h(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 33:
                    m13 = e2.q(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 34:
                    m13 = e2.s(i18, (List) unsafe.getObject(obj, j13));
                    i15 += m13;
                    break;
                case 35:
                    int i24 = e2.i((List) unsafe.getObject(obj, j13));
                    if (i24 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(i24, u.B(i18), i24, i15);
                        break;
                    }
                case 36:
                    int g13 = e2.g((List) unsafe.getObject(obj, j13));
                    if (g13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(g13, u.B(i18), g13, i15);
                        break;
                    }
                case 37:
                    int n13 = e2.n((List) unsafe.getObject(obj, j13));
                    if (n13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(n13, u.B(i18), n13, i15);
                        break;
                    }
                case 38:
                    int y13 = e2.y((List) unsafe.getObject(obj, j13));
                    if (y13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(y13, u.B(i18), y13, i15);
                        break;
                    }
                case 39:
                    int l13 = e2.l((List) unsafe.getObject(obj, j13));
                    if (l13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(l13, u.B(i18), l13, i15);
                        break;
                    }
                case 40:
                    int i25 = e2.i((List) unsafe.getObject(obj, j13));
                    if (i25 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(i25, u.B(i18), i25, i15);
                        break;
                    }
                case 41:
                    int g14 = e2.g((List) unsafe.getObject(obj, j13));
                    if (g14 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(g14, u.B(i18), g14, i15);
                        break;
                    }
                case 42:
                    int b13 = e2.b((List) unsafe.getObject(obj, j13));
                    if (b13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(b13, u.B(i18), b13, i15);
                        break;
                    }
                case 43:
                    int w13 = e2.w((List) unsafe.getObject(obj, j13));
                    if (w13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(w13, u.B(i18), w13, i15);
                        break;
                    }
                case 44:
                    int e13 = e2.e((List) unsafe.getObject(obj, j13));
                    if (e13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(e13, u.B(i18), e13, i15);
                        break;
                    }
                case 45:
                    int g15 = e2.g((List) unsafe.getObject(obj, j13));
                    if (g15 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(g15, u.B(i18), g15, i15);
                        break;
                    }
                case 46:
                    int i26 = e2.i((List) unsafe.getObject(obj, j13));
                    if (i26 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(i26, u.B(i18), i26, i15);
                        break;
                    }
                case 47:
                    int r13 = e2.r((List) unsafe.getObject(obj, j13));
                    if (r13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(r13, u.B(i18), r13, i15);
                        break;
                    }
                case 48:
                    int t13 = e2.t((List) unsafe.getObject(obj, j13));
                    if (t13 <= 0) {
                        break;
                    } else {
                        i15 = cb.C(t13, u.B(i18), t13, i15);
                        break;
                    }
                case 49:
                    m13 = e2.j(i18, (List) unsafe.getObject(obj, j13), q(i14));
                    i15 += m13;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j13);
                    Object p13 = p(i14);
                    this.f33991n.getClass();
                    m13 = j1.c(i18, object2, p13);
                    i15 += m13;
                    break;
                case 51:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.m(i18);
                        i15 += m13;
                        break;
                    }
                case 52:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.q(i18);
                        i15 += m13;
                        break;
                    }
                case 53:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.u(i18, I(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 54:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.E(i18, I(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 55:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.s(i18, H(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 56:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.p(i18);
                        i15 += m13;
                        break;
                    }
                case 57:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.o(i18);
                        i15 += m13;
                        break;
                    }
                case 58:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.j(i18);
                        i15 += m13;
                        break;
                    }
                case 59:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(obj, j13);
                        k13 = object3 instanceof l ? u.k(i18, (l) object3) : u.z(i18, (String) object3);
                        i15 = k13 + i15;
                        break;
                    }
                case 60:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = e2.o(i18, q(i14), unsafe.getObject(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 61:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.k(i18, (l) unsafe.getObject(obj, j13));
                        i15 += m13;
                        break;
                    }
                case 62:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.C(i18, H(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 63:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.n(i18, H(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 64:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.v(i18);
                        i15 += m13;
                        break;
                    }
                case 65:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.w(i18);
                        i15 += m13;
                        break;
                    }
                case 66:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.x(i18, H(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 67:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.y(i18, I(j13, obj));
                        i15 += m13;
                        break;
                    }
                case 68:
                    if (!w(i18, obj, i14)) {
                        break;
                    } else {
                        m13 = u.r(i18, (o1) unsafe.getObject(obj, j13), q(i14));
                        i15 += m13;
                        break;
                    }
            }
            i14 += 3;
        }
    }

    public final int t(Object obj) {
        int m13;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f33978a;
            if (i13 >= iArr.length) {
                ((k2) this.f33990m).getClass();
                return ((n0) obj).unknownFields.c() + i14;
            }
            int Z = Z(i13);
            int Y = Y(Z);
            int i15 = iArr[i13];
            long j13 = Z & 1048575;
            if (Y >= f0.DOUBLE_LIST_PACKED.id() && Y <= f0.SINT64_LIST_PACKED.id()) {
                int i16 = iArr[i13 + 2];
            }
            Unsafe unsafe = f33977p;
            switch (Y) {
                case 0:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.m(i15);
                        break;
                    }
                case 1:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.q(i15);
                        break;
                    }
                case 2:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.u(i15, q2.k(j13, obj));
                        break;
                    }
                case 3:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.E(i15, q2.k(j13, obj));
                        break;
                    }
                case 4:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.s(i15, q2.j(j13, obj));
                        break;
                    }
                case 5:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.p(i15);
                        break;
                    }
                case 6:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.o(i15);
                        break;
                    }
                case 7:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.j(i15);
                        break;
                    }
                case 8:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        Object l13 = q2.l(j13, obj);
                        if (!(l13 instanceof l)) {
                            m13 = u.z(i15, (String) l13);
                            break;
                        } else {
                            m13 = u.k(i15, (l) l13);
                            break;
                        }
                    }
                case 9:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = e2.o(i15, q(i13), q2.l(j13, obj));
                        break;
                    }
                case 10:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.k(i15, (l) q2.l(j13, obj));
                        break;
                    }
                case 11:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.C(i15, q2.j(j13, obj));
                        break;
                    }
                case 12:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.n(i15, q2.j(j13, obj));
                        break;
                    }
                case 13:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.v(i15);
                        break;
                    }
                case 14:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.w(i15);
                        break;
                    }
                case 15:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.x(i15, q2.j(j13, obj));
                        break;
                    }
                case 16:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.y(i15, q2.k(j13, obj));
                        break;
                    }
                case 17:
                    if (!u(i13, obj)) {
                        break;
                    } else {
                        m13 = u.r(i15, (o1) q2.l(j13, obj), q(i13));
                        break;
                    }
                case 18:
                    m13 = e2.h(i15, x(j13, obj));
                    break;
                case 19:
                    m13 = e2.f(i15, x(j13, obj));
                    break;
                case 20:
                    m13 = e2.m(i15, x(j13, obj));
                    break;
                case 21:
                    m13 = e2.x(i15, x(j13, obj));
                    break;
                case 22:
                    m13 = e2.k(i15, x(j13, obj));
                    break;
                case 23:
                    m13 = e2.h(i15, x(j13, obj));
                    break;
                case 24:
                    m13 = e2.f(i15, x(j13, obj));
                    break;
                case 25:
                    m13 = e2.a(i15, x(j13, obj));
                    break;
                case 26:
                    m13 = e2.u(i15, x(j13, obj));
                    break;
                case 27:
                    m13 = e2.p(i15, x(j13, obj), q(i13));
                    break;
                case 28:
                    m13 = e2.c(i15, x(j13, obj));
                    break;
                case 29:
                    m13 = e2.v(i15, x(j13, obj));
                    break;
                case 30:
                    m13 = e2.d(i15, x(j13, obj));
                    break;
                case 31:
                    m13 = e2.f(i15, x(j13, obj));
                    break;
                case 32:
                    m13 = e2.h(i15, x(j13, obj));
                    break;
                case 33:
                    m13 = e2.q(i15, x(j13, obj));
                    break;
                case 34:
                    m13 = e2.s(i15, x(j13, obj));
                    break;
                case 35:
                    int i17 = e2.i((List) unsafe.getObject(obj, j13));
                    if (i17 > 0) {
                        i14 = cb.C(i17, u.B(i15), i17, i14);
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    int g13 = e2.g((List) unsafe.getObject(obj, j13));
                    if (g13 > 0) {
                        i14 = cb.C(g13, u.B(i15), g13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    int n13 = e2.n((List) unsafe.getObject(obj, j13));
                    if (n13 > 0) {
                        i14 = cb.C(n13, u.B(i15), n13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    int y13 = e2.y((List) unsafe.getObject(obj, j13));
                    if (y13 > 0) {
                        i14 = cb.C(y13, u.B(i15), y13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    int l14 = e2.l((List) unsafe.getObject(obj, j13));
                    if (l14 > 0) {
                        i14 = cb.C(l14, u.B(i15), l14, i14);
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    int i18 = e2.i((List) unsafe.getObject(obj, j13));
                    if (i18 > 0) {
                        i14 = cb.C(i18, u.B(i15), i18, i14);
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    int g14 = e2.g((List) unsafe.getObject(obj, j13));
                    if (g14 > 0) {
                        i14 = cb.C(g14, u.B(i15), g14, i14);
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int b13 = e2.b((List) unsafe.getObject(obj, j13));
                    if (b13 > 0) {
                        i14 = cb.C(b13, u.B(i15), b13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    int w13 = e2.w((List) unsafe.getObject(obj, j13));
                    if (w13 > 0) {
                        i14 = cb.C(w13, u.B(i15), w13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    int e13 = e2.e((List) unsafe.getObject(obj, j13));
                    if (e13 > 0) {
                        i14 = cb.C(e13, u.B(i15), e13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    int g15 = e2.g((List) unsafe.getObject(obj, j13));
                    if (g15 > 0) {
                        i14 = cb.C(g15, u.B(i15), g15, i14);
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    int i19 = e2.i((List) unsafe.getObject(obj, j13));
                    if (i19 > 0) {
                        i14 = cb.C(i19, u.B(i15), i19, i14);
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    int r13 = e2.r((List) unsafe.getObject(obj, j13));
                    if (r13 > 0) {
                        i14 = cb.C(r13, u.B(i15), r13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    int t13 = e2.t((List) unsafe.getObject(obj, j13));
                    if (t13 > 0) {
                        i14 = cb.C(t13, u.B(i15), t13, i14);
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    m13 = e2.j(i15, x(j13, obj), q(i13));
                    break;
                case 50:
                    Object l15 = q2.l(j13, obj);
                    Object p13 = p(i13);
                    this.f33991n.getClass();
                    m13 = j1.c(i15, l15, p13);
                    break;
                case 51:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.m(i15);
                        break;
                    }
                case 52:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.q(i15);
                        break;
                    }
                case 53:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.u(i15, I(j13, obj));
                        break;
                    }
                case 54:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.E(i15, I(j13, obj));
                        break;
                    }
                case 55:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.s(i15, H(j13, obj));
                        break;
                    }
                case 56:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.p(i15);
                        break;
                    }
                case 57:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.o(i15);
                        break;
                    }
                case 58:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.j(i15);
                        break;
                    }
                case 59:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        Object l16 = q2.l(j13, obj);
                        if (!(l16 instanceof l)) {
                            m13 = u.z(i15, (String) l16);
                            break;
                        } else {
                            m13 = u.k(i15, (l) l16);
                            break;
                        }
                    }
                case 60:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = e2.o(i15, q(i13), q2.l(j13, obj));
                        break;
                    }
                case 61:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.k(i15, (l) q2.l(j13, obj));
                        break;
                    }
                case 62:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.C(i15, H(j13, obj));
                        break;
                    }
                case 63:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.n(i15, H(j13, obj));
                        break;
                    }
                case 64:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.v(i15);
                        break;
                    }
                case 65:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.w(i15);
                        break;
                    }
                case 66:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.x(i15, H(j13, obj));
                        break;
                    }
                case 67:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.y(i15, I(j13, obj));
                        break;
                    }
                case 68:
                    if (!w(i15, obj, i13)) {
                        break;
                    } else {
                        m13 = u.r(i15, (o1) q2.l(j13, obj), q(i13));
                        break;
                    }
            }
            i14 = m13 + i14;
            i13 += 3;
        }
    }

    public final boolean u(int i13, Object obj) {
        int i14 = this.f33978a[i13 + 2];
        long j13 = i14 & 1048575;
        if (j13 != 1048575) {
            return ((1 << (i14 >>> 20)) & q2.f33962c.h(j13, obj)) != 0;
        }
        int Z = Z(i13);
        long j14 = Z & 1048575;
        switch (Y(Z)) {
            case 0:
                return Double.doubleToRawLongBits(q2.f33962c.f(j14, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(q2.f33962c.g(j14, obj)) != 0;
            case 2:
                return q2.f33962c.i(j14, obj) != 0;
            case 3:
                return q2.f33962c.i(j14, obj) != 0;
            case 4:
                return q2.f33962c.h(j14, obj) != 0;
            case 5:
                return q2.f33962c.i(j14, obj) != 0;
            case 6:
                return q2.f33962c.h(j14, obj) != 0;
            case 7:
                return q2.f33962c.d(j14, obj);
            case 8:
                Object j15 = q2.f33962c.j(j14, obj);
                if (j15 instanceof String) {
                    return !((String) j15).isEmpty();
                }
                if (j15 instanceof l) {
                    return !l.f33922b.equals(j15);
                }
                throw new IllegalArgumentException();
            case 9:
                return q2.f33962c.j(j14, obj) != null;
            case 10:
                return !l.f33922b.equals(q2.f33962c.j(j14, obj));
            case 11:
                return q2.f33962c.h(j14, obj) != 0;
            case 12:
                return q2.f33962c.h(j14, obj) != 0;
            case 13:
                return q2.f33962c.h(j14, obj) != 0;
            case 14:
                return q2.f33962c.i(j14, obj) != 0;
            case 15:
                return q2.f33962c.h(j14, obj) != 0;
            case 16:
                return q2.f33962c.i(j14, obj) != 0;
            case 17:
                return q2.f33962c.j(j14, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean w(int i13, Object obj, int i14) {
        return q2.f33962c.h((long) (this.f33978a[i14 + 2] & 1048575), obj) == i13;
    }

    public final void y(i2 i2Var, Object obj, c2 c2Var, y yVar) {
        int[] iArr = this.f33985h;
        int i13 = this.f33987j;
        int i14 = this.f33986i;
        j2 j2Var = null;
        while (true) {
            try {
                r rVar = (r) c2Var;
                int b13 = rVar.b();
                int V = (b13 < this.f33980c || b13 > this.f33981d) ? -1 : V(b13, 0);
                if (V >= 0) {
                    int Z = Z(V);
                    try {
                        int Y = Y(Z);
                        p pVar = rVar.f33968a;
                        c1 c1Var = this.f33989l;
                        switch (Y) {
                            case 0:
                                q2.r(obj, G(Z), rVar.l());
                                T(V, obj);
                                break;
                            case 1:
                                q2.s(obj, G(Z), rVar.t());
                                T(V, obj);
                                break;
                            case 2:
                                q2.u(G(Z), obj, rVar.y());
                                T(V, obj);
                                break;
                            case 3:
                                q2.u(G(Z), obj, rVar.S());
                                T(V, obj);
                                break;
                            case 4:
                                q2.t(rVar.w(), G(Z), obj);
                                T(V, obj);
                                break;
                            case 5:
                                q2.u(G(Z), obj, rVar.r());
                                T(V, obj);
                                break;
                            case 6:
                                q2.t(rVar.p(), G(Z), obj);
                                T(V, obj);
                                break;
                            case 7:
                                q2.n(G(Z), obj, rVar.h());
                                T(V, obj);
                                break;
                            case 8:
                                Q(obj, Z, rVar);
                                T(V, obj);
                                break;
                            case 9:
                                Object obj2 = (o1) C(V, obj);
                                rVar.f(obj2, q(V), yVar);
                                W(V, obj, obj2);
                                break;
                            case 10:
                                q2.v(G(Z), obj, rVar.j());
                                T(V, obj);
                                break;
                            case 11:
                                q2.t(rVar.Q(), G(Z), obj);
                                T(V, obj);
                                break;
                            case 12:
                                rVar.V(0);
                                int n13 = pVar.n();
                                o(V);
                                q2.t(n13, G(Z), obj);
                                T(V, obj);
                                break;
                            case 13:
                                q2.t(rVar.D(), G(Z), obj);
                                T(V, obj);
                                break;
                            case 14:
                                q2.u(G(Z), obj, rVar.F());
                                T(V, obj);
                                break;
                            case 15:
                                q2.t(rVar.H(), G(Z), obj);
                                T(V, obj);
                                break;
                            case 16:
                                q2.u(G(Z), obj, rVar.J());
                                T(V, obj);
                                break;
                            case 17:
                                Object obj3 = (o1) C(V, obj);
                                rVar.d(obj3, q(V), yVar);
                                W(V, obj, obj3);
                                break;
                            case 18:
                                rVar.m(c1Var.c(G(Z), obj));
                                break;
                            case 19:
                                rVar.u(c1Var.c(G(Z), obj));
                                break;
                            case 20:
                                rVar.z(c1Var.c(G(Z), obj));
                                break;
                            case 21:
                                rVar.T(c1Var.c(G(Z), obj));
                                break;
                            case 22:
                                rVar.x(c1Var.c(G(Z), obj));
                                break;
                            case 23:
                                rVar.s(c1Var.c(G(Z), obj));
                                break;
                            case 24:
                                rVar.q(c1Var.c(G(Z), obj));
                                break;
                            case 25:
                                rVar.i(c1Var.c(G(Z), obj));
                                break;
                            case 26:
                                R(obj, Z, rVar);
                                break;
                            case 27:
                                P(obj, Z, rVar, q(V), yVar);
                                break;
                            case 28:
                                rVar.k(c1Var.c(G(Z), obj));
                                break;
                            case 29:
                                rVar.R(c1Var.c(G(Z), obj));
                                break;
                            case 30:
                                List c13 = c1Var.c(G(Z), obj);
                                rVar.n(c13);
                                o(V);
                                e2.z(obj, b13, c13, j2Var, i2Var);
                                break;
                            case 31:
                                rVar.E(c1Var.c(G(Z), obj));
                                break;
                            case 32:
                                rVar.G(c1Var.c(G(Z), obj));
                                break;
                            case 33:
                                rVar.I(c1Var.c(G(Z), obj));
                                break;
                            case 34:
                                rVar.K(c1Var.c(G(Z), obj));
                                break;
                            case 35:
                                rVar.m(c1Var.c(G(Z), obj));
                                break;
                            case 36:
                                rVar.u(c1Var.c(G(Z), obj));
                                break;
                            case 37:
                                rVar.z(c1Var.c(G(Z), obj));
                                break;
                            case 38:
                                rVar.T(c1Var.c(G(Z), obj));
                                break;
                            case 39:
                                rVar.x(c1Var.c(G(Z), obj));
                                break;
                            case 40:
                                rVar.s(c1Var.c(G(Z), obj));
                                break;
                            case 41:
                                rVar.q(c1Var.c(G(Z), obj));
                                break;
                            case 42:
                                rVar.i(c1Var.c(G(Z), obj));
                                break;
                            case 43:
                                rVar.R(c1Var.c(G(Z), obj));
                                break;
                            case 44:
                                List c14 = c1Var.c(G(Z), obj);
                                rVar.n(c14);
                                o(V);
                                e2.z(obj, b13, c14, j2Var, i2Var);
                                break;
                            case 45:
                                rVar.E(c1Var.c(G(Z), obj));
                                break;
                            case 46:
                                rVar.G(c1Var.c(G(Z), obj));
                                break;
                            case 47:
                                rVar.I(c1Var.c(G(Z), obj));
                                break;
                            case 48:
                                rVar.K(c1Var.c(G(Z), obj));
                                break;
                            case 49:
                                O(obj, G(Z), rVar, q(V), yVar);
                                break;
                            case 50:
                                z(obj, V, p(V), yVar, rVar);
                                break;
                            case 51:
                                q2.v(G(Z), obj, Double.valueOf(rVar.l()));
                                U(b13, obj, V);
                                break;
                            case 52:
                                q2.v(G(Z), obj, Float.valueOf(rVar.t()));
                                U(b13, obj, V);
                                break;
                            case 53:
                                q2.v(G(Z), obj, Long.valueOf(rVar.y()));
                                U(b13, obj, V);
                                break;
                            case 54:
                                q2.v(G(Z), obj, Long.valueOf(rVar.S()));
                                U(b13, obj, V);
                                break;
                            case 55:
                                q2.v(G(Z), obj, Integer.valueOf(rVar.w()));
                                U(b13, obj, V);
                                break;
                            case 56:
                                q2.v(G(Z), obj, Long.valueOf(rVar.r()));
                                U(b13, obj, V);
                                break;
                            case 57:
                                q2.v(G(Z), obj, Integer.valueOf(rVar.p()));
                                U(b13, obj, V);
                                break;
                            case 58:
                                q2.v(G(Z), obj, Boolean.valueOf(rVar.h()));
                                U(b13, obj, V);
                                break;
                            case 59:
                                Q(obj, Z, rVar);
                                U(b13, obj, V);
                                break;
                            case 60:
                                Object obj4 = (o1) D(b13, obj, V);
                                rVar.f(obj4, q(V), yVar);
                                X(b13, obj, obj4, V);
                                break;
                            case 61:
                                q2.v(G(Z), obj, rVar.j());
                                U(b13, obj, V);
                                break;
                            case 62:
                                q2.v(G(Z), obj, Integer.valueOf(rVar.Q()));
                                U(b13, obj, V);
                                break;
                            case 63:
                                rVar.V(0);
                                int n14 = pVar.n();
                                o(V);
                                q2.v(G(Z), obj, Integer.valueOf(n14));
                                U(b13, obj, V);
                                break;
                            case 64:
                                q2.v(G(Z), obj, Integer.valueOf(rVar.D()));
                                U(b13, obj, V);
                                break;
                            case 65:
                                q2.v(G(Z), obj, Long.valueOf(rVar.F()));
                                U(b13, obj, V);
                                break;
                            case 66:
                                q2.v(G(Z), obj, Integer.valueOf(rVar.H()));
                                U(b13, obj, V);
                                break;
                            case 67:
                                q2.v(G(Z), obj, Long.valueOf(rVar.J()));
                                U(b13, obj, V);
                                break;
                            case 68:
                                Object obj5 = (o1) D(b13, obj, V);
                                rVar.d(obj5, q(V), yVar);
                                X(b13, obj, obj5, V);
                                break;
                            default:
                                if (j2Var == null) {
                                    j2Var = i2Var.a(obj);
                                }
                                if (!i2Var.c(j2Var, rVar)) {
                                    while (i14 < i13) {
                                        n(obj, iArr[i14], j2Var);
                                        i14++;
                                    }
                                    if (j2Var != null) {
                                        ((n0) obj).unknownFields = j2Var;
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        i2Var.getClass();
                        if (j2Var == null) {
                            j2Var = i2Var.a(obj);
                        }
                        if (!i2Var.c(j2Var, rVar)) {
                            while (i14 < i13) {
                                n(obj, iArr[i14], j2Var);
                                i14++;
                            }
                            if (j2Var != null) {
                                ((n0) obj).unknownFields = j2Var;
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (b13 == Integer.MAX_VALUE) {
                        if (j2Var != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    i2Var.getClass();
                    if (j2Var == null) {
                        j2Var = i2Var.a(obj);
                    }
                    if (!i2Var.c(j2Var, rVar)) {
                        while (i14 < i13) {
                            n(obj, iArr[i14], j2Var);
                            i14++;
                        }
                        if (j2Var != null) {
                            ((n0) obj).unknownFields = j2Var;
                            return;
                        }
                        return;
                    }
                }
            } finally {
                while (i14 < i13) {
                    n(obj, iArr[i14], j2Var);
                    i14++;
                }
                if (j2Var != null) {
                    ((k2) i2Var).getClass();
                    ((n0) obj).unknownFields = j2Var;
                }
            }
        }
    }

    public final void z(Object obj, int i13, Object obj2, y yVar, c2 c2Var) {
        long Z = Z(i13) & 1048575;
        Object j13 = q2.f33962c.j(Z, obj);
        j1 j1Var = this.f33991n;
        if (j13 == null) {
            j1Var.getClass();
            j13 = i1.f33908b.b();
            q2.v(Z, obj, j13);
        } else {
            j1Var.getClass();
            if (j1.d(j13)) {
                i1 b13 = i1.f33908b.b();
                j1.e(b13, j13);
                q2.v(Z, obj, b13);
                j13 = b13;
            }
        }
        j1Var.getClass();
        ((r) c2Var).A((i1) j13, ((h1) obj2).f33902a, yVar);
    }
}
