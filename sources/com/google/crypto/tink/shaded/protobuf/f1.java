package com.google.crypto.tink.shaded.protobuf;

import a.cb;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import net.quikkly.android.utils.BitmapUtils;
import oi.u6;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class f1 implements q1 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f33612n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f33613o = d2.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f33614a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f33615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33617d;

    /* renamed from: e, reason: collision with root package name */
    public final b f33618e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33619f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f33620g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33621h;

    /* renamed from: i, reason: collision with root package name */
    public final int f33622i;

    /* renamed from: j, reason: collision with root package name */
    public final h1 f33623j;

    /* renamed from: k, reason: collision with root package name */
    public final r0 f33624k;

    /* renamed from: l, reason: collision with root package name */
    public final v1 f33625l;

    /* renamed from: m, reason: collision with root package name */
    public final y0 f33626m;

    public f1(int[] iArr, Object[] objArr, int i13, int i14, b bVar, int[] iArr2, int i15, int i16, h1 h1Var, r0 r0Var, v1 v1Var, v vVar, y0 y0Var) {
        this.f33614a = iArr;
        this.f33615b = objArr;
        this.f33616c = i13;
        this.f33617d = i14;
        this.f33619f = bVar instanceof f0;
        this.f33620g = iArr2;
        this.f33621h = i15;
        this.f33622i = i16;
        this.f33623j = h1Var;
        this.f33624k = r0Var;
        this.f33625l = v1Var;
        this.f33618e = bVar;
        this.f33626m = y0Var;
    }

    public static f1 B(a1 a1Var, h1 h1Var, r0 r0Var, v1 v1Var, v vVar, y0 y0Var) {
        if (a1Var instanceof o1) {
            return C((o1) a1Var, h1Var, r0Var, v1Var, vVar, y0Var);
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(a1Var);
        throw null;
    }

    public static f1 C(o1 o1Var, h1 h1Var, r0 r0Var, v1 v1Var, v vVar, y0 y0Var) {
        int i13;
        int charAt;
        int charAt2;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char charAt3;
        int i23;
        char charAt4;
        int i24;
        char charAt5;
        int i25;
        char charAt6;
        int i26;
        char charAt7;
        int i27;
        char charAt8;
        int i28;
        char charAt9;
        int i29;
        char charAt10;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int[] iArr2;
        int[] iArr3;
        int i39;
        int i43;
        int i44;
        int i45;
        int i46;
        Field O;
        char charAt11;
        int i47;
        int i48;
        int i49;
        Field O2;
        Field O3;
        int i53;
        char charAt12;
        int i54;
        char charAt13;
        int i55;
        char charAt14;
        int i56;
        char charAt15;
        String c13 = o1Var.c();
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
        int charAt16 = c13.charAt(i13);
        if (charAt16 >= 55296) {
            int i63 = charAt16 & 8191;
            int i64 = 13;
            while (true) {
                i56 = i59 + 1;
                charAt15 = c13.charAt(i59);
                if (charAt15 < 55296) {
                    break;
                }
                i63 |= (charAt15 & 8191) << i64;
                i64 += 13;
                i59 = i56;
            }
            charAt16 = i63 | (charAt15 << i64);
            i59 = i56;
        }
        if (charAt16 == 0) {
            i16 = 0;
            charAt = 0;
            charAt2 = 0;
            i15 = 0;
            i18 = 0;
            i17 = 0;
            iArr = f33612n;
            i14 = 0;
        } else {
            int i65 = i59 + 1;
            int charAt17 = c13.charAt(i59);
            if (charAt17 >= 55296) {
                int i66 = charAt17 & 8191;
                int i67 = 13;
                while (true) {
                    i29 = i65 + 1;
                    charAt10 = c13.charAt(i65);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i66 |= (charAt10 & 8191) << i67;
                    i67 += 13;
                    i65 = i29;
                }
                charAt17 = i66 | (charAt10 << i67);
                i65 = i29;
            }
            int i68 = i65 + 1;
            int charAt18 = c13.charAt(i65);
            if (charAt18 >= 55296) {
                int i69 = charAt18 & 8191;
                int i73 = 13;
                while (true) {
                    i28 = i68 + 1;
                    charAt9 = c13.charAt(i68);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i69 |= (charAt9 & 8191) << i73;
                    i73 += 13;
                    i68 = i28;
                }
                charAt18 = i69 | (charAt9 << i73);
                i68 = i28;
            }
            int i74 = i68 + 1;
            int charAt19 = c13.charAt(i68);
            if (charAt19 >= 55296) {
                int i75 = charAt19 & 8191;
                int i76 = 13;
                while (true) {
                    i27 = i74 + 1;
                    charAt8 = c13.charAt(i74);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i75 |= (charAt8 & 8191) << i76;
                    i76 += 13;
                    i74 = i27;
                }
                charAt19 = i75 | (charAt8 << i76);
                i74 = i27;
            }
            int i77 = i74 + 1;
            int charAt20 = c13.charAt(i74);
            if (charAt20 >= 55296) {
                int i78 = charAt20 & 8191;
                int i79 = 13;
                while (true) {
                    i26 = i77 + 1;
                    charAt7 = c13.charAt(i77);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i78 |= (charAt7 & 8191) << i79;
                    i79 += 13;
                    i77 = i26;
                }
                charAt20 = i78 | (charAt7 << i79);
                i77 = i26;
            }
            int i83 = i77 + 1;
            charAt = c13.charAt(i77);
            if (charAt >= 55296) {
                int i84 = charAt & 8191;
                int i85 = 13;
                while (true) {
                    i25 = i83 + 1;
                    charAt6 = c13.charAt(i83);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i84 |= (charAt6 & 8191) << i85;
                    i85 += 13;
                    i83 = i25;
                }
                charAt = i84 | (charAt6 << i85);
                i83 = i25;
            }
            int i86 = i83 + 1;
            charAt2 = c13.charAt(i83);
            if (charAt2 >= 55296) {
                int i87 = charAt2 & 8191;
                int i88 = 13;
                while (true) {
                    i24 = i86 + 1;
                    charAt5 = c13.charAt(i86);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i87 |= (charAt5 & 8191) << i88;
                    i88 += 13;
                    i86 = i24;
                }
                charAt2 = i87 | (charAt5 << i88);
                i86 = i24;
            }
            int i89 = i86 + 1;
            int charAt21 = c13.charAt(i86);
            if (charAt21 >= 55296) {
                int i93 = charAt21 & 8191;
                int i94 = 13;
                while (true) {
                    i23 = i89 + 1;
                    charAt4 = c13.charAt(i89);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i93 |= (charAt4 & 8191) << i94;
                    i94 += 13;
                    i89 = i23;
                }
                charAt21 = i93 | (charAt4 << i94);
                i89 = i23;
            }
            int i95 = i89 + 1;
            int charAt22 = c13.charAt(i89);
            if (charAt22 >= 55296) {
                int i96 = charAt22 & 8191;
                int i97 = 13;
                while (true) {
                    i19 = i95 + 1;
                    charAt3 = c13.charAt(i95);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i96 |= (charAt3 & 8191) << i97;
                    i97 += 13;
                    i95 = i19;
                }
                charAt22 = i96 | (charAt3 << i97);
                i95 = i19;
            }
            int i98 = (charAt17 * 2) + charAt18;
            i14 = charAt17;
            i59 = i95;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i15 = charAt19;
            i16 = i98;
            i17 = charAt22;
            i18 = charAt20;
        }
        Object[] b13 = o1Var.b();
        Class<?> cls = o1Var.a().getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i99 = i17 + charAt2;
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
                    charAt14 = c13.charAt(i106);
                    i33 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i105 |= (charAt14 & 8191) << i107;
                    i107 += 13;
                    i106 = i55;
                    length = i33;
                }
                charAt23 = i105 | (charAt14 << i107);
                i34 = i55;
            } else {
                i33 = length;
                i34 = i104;
            }
            int i108 = i34 + 1;
            int charAt24 = c13.charAt(i34);
            if (charAt24 >= 55296) {
                int i109 = charAt24 & 8191;
                int i110 = i108;
                int i111 = 13;
                while (true) {
                    i54 = i110 + 1;
                    charAt13 = c13.charAt(i110);
                    i35 = i17;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i109 |= (charAt13 & 8191) << i111;
                    i111 += 13;
                    i110 = i54;
                    i17 = i35;
                }
                charAt24 = i109 | (charAt13 << i111);
                i36 = i54;
            } else {
                i35 = i17;
                i36 = i108;
            }
            int i112 = charAt24 & 255;
            int i113 = i18;
            if ((charAt24 & 1024) != 0) {
                iArr[i103] = i102;
                i103++;
            }
            Unsafe unsafe = f33613o;
            int i114 = i103;
            if (i112 >= 51) {
                int i115 = i36 + 1;
                int charAt25 = c13.charAt(i36);
                if (charAt25 >= 55296) {
                    int i116 = charAt25 & 8191;
                    int i117 = i115;
                    int i118 = 13;
                    while (true) {
                        i53 = i117 + 1;
                        charAt12 = c13.charAt(i117);
                        i38 = i15;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i116 |= (charAt12 & 8191) << i118;
                        i118 += 13;
                        i117 = i53;
                        i15 = i38;
                    }
                    charAt25 = i116 | (charAt12 << i118);
                    i48 = i53;
                } else {
                    i38 = i15;
                    i48 = i115;
                }
                int i119 = i112 - 51;
                int i120 = i48;
                if (i119 == 9 || i119 == 17) {
                    i37 = charAt23;
                    i49 = 2;
                    objArr[cb.c(i102, 3, 2, 1)] = b13[i16];
                    i16++;
                } else if (i119 != 12 || (!o1Var.d().equals(l1.PROTO2) && (charAt24 & 2048) == 0)) {
                    i37 = charAt23;
                    i49 = 2;
                } else {
                    i37 = charAt23;
                    i49 = 2;
                    objArr[cb.c(i102, 3, 2, 1)] = b13[i16];
                    i16++;
                }
                int i121 = charAt25 * i49;
                Object obj = b13[i121];
                if (obj instanceof Field) {
                    O2 = (Field) obj;
                } else {
                    O2 = O(cls, (String) obj);
                    b13[i121] = O2;
                }
                i46 = (int) unsafe.objectFieldOffset(O2);
                int i122 = i121 + 1;
                Object obj2 = b13[i122];
                if (obj2 instanceof Field) {
                    O3 = (Field) obj2;
                } else {
                    O3 = O(cls, (String) obj2);
                    b13[i122] = O3;
                }
                iArr2 = iArr4;
                i45 = i16;
                iArr3 = iArr;
                i43 = i120;
                i39 = (int) unsafe.objectFieldOffset(O3);
                i44 = 0;
            } else {
                i37 = charAt23;
                i38 = i15;
                int i123 = i16 + 1;
                Field O4 = O(cls, (String) b13[i16]);
                if (i112 == 9 || i112 == 17) {
                    iArr2 = iArr4;
                    iArr3 = iArr;
                    objArr[cb.c(i102, 3, 2, 1)] = O4.getType();
                } else {
                    if (i112 == 27 || i112 == 49) {
                        iArr2 = iArr4;
                        iArr3 = iArr;
                        i47 = i16 + 2;
                        objArr[cb.c(i102, 3, 2, 1)] = b13[i123];
                    } else {
                        if (i112 == 12 || i112 == 30 || i112 == 44) {
                            iArr2 = iArr4;
                            if (o1Var.d() == l1.PROTO2 || (charAt24 & 2048) != 0) {
                                iArr3 = iArr;
                                i47 = i16 + 2;
                                objArr[cb.c(i102, 3, 2, 1)] = b13[i123];
                            }
                        } else if (i112 == 50) {
                            int i124 = i100 + 1;
                            iArr[i100] = i102;
                            int i125 = (i102 / 3) * 2;
                            int i126 = i16 + 2;
                            objArr[i125] = b13[i123];
                            if ((charAt24 & 2048) != 0) {
                                i123 = i16 + 3;
                                objArr[i125 + 1] = b13[i126];
                                iArr2 = iArr4;
                                i100 = i124;
                            } else {
                                i100 = i124;
                                iArr3 = iArr;
                                i123 = i126;
                                iArr2 = iArr4;
                            }
                        } else {
                            iArr2 = iArr4;
                        }
                        iArr3 = iArr;
                    }
                    i123 = i47;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(O4);
                if ((charAt24 & 4096) == 0 || i112 > 17) {
                    i39 = 1048575;
                    i43 = i36;
                    i44 = 0;
                } else {
                    int i127 = i36 + 1;
                    int charAt26 = c13.charAt(i36);
                    if (charAt26 >= 55296) {
                        int i128 = charAt26 & 8191;
                        int i129 = 13;
                        while (true) {
                            i43 = i127 + 1;
                            charAt11 = c13.charAt(i127);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i128 |= (charAt11 & 8191) << i129;
                            i129 += 13;
                            i127 = i43;
                        }
                        charAt26 = i128 | (charAt11 << i129);
                    } else {
                        i43 = i127;
                    }
                    int i130 = (charAt26 / 32) + (i14 * 2);
                    Object obj3 = b13[i130];
                    if (obj3 instanceof Field) {
                        O = (Field) obj3;
                    } else {
                        O = O(cls, (String) obj3);
                        b13[i130] = O;
                    }
                    i39 = (int) unsafe.objectFieldOffset(O);
                    i44 = charAt26 % 32;
                }
                if (i112 >= 18 && i112 <= 49) {
                    iArr3[i101] = objectFieldOffset;
                    i101++;
                }
                i45 = i123;
                i46 = objectFieldOffset;
            }
            int i131 = i102 + 1;
            iArr2[i102] = i37;
            int i132 = i102 + 2;
            iArr2[i131] = ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 536870912 : 0) | ((charAt24 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 268435456 : 0) | (i112 << 20) | i46;
            i102 += 3;
            iArr2[i132] = (i44 << 20) | i39;
            i16 = i45;
            iArr = iArr3;
            i18 = i113;
            i59 = i43;
            length = i33;
            i17 = i35;
            iArr4 = iArr2;
            i103 = i114;
            i15 = i38;
            i57 = 55296;
        }
        int i133 = i18;
        b a13 = o1Var.a();
        o1Var.d();
        return new f1(iArr4, objArr, i15, i133, a13, iArr, i17, i99, h1Var, r0Var, v1Var, vVar, y0Var);
    }

    public static long D(int i13) {
        return i13 & 1048575;
    }

    public static int E(long j13, Object obj) {
        return ((Integer) d2.f33602c.i(j13, obj)).intValue();
    }

    public static long F(long j13, Object obj) {
        return ((Long) d2.f33602c.i(j13, obj)).longValue();
    }

    public static Field O(Class cls, String str) {
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

    public static int U(int i13) {
        return (i13 & 267386880) >>> 20;
    }

    public static void X(int i13, Object obj, u6 u6Var) {
        if (!(obj instanceof String)) {
            u6Var.p(i13, (k) obj);
        } else {
            ((r) u6Var.f95225b).B0(i13, (String) obj);
        }
    }

    public static void l(Object obj) {
        if (!t(obj)) {
            throw new IllegalArgumentException(a.a.i("Mutating immutable message: ", obj));
        }
    }

    public static w1 q(Object obj) {
        f0 f0Var = (f0) obj;
        w1 w1Var = f0Var.unknownFields;
        if (w1Var != w1.f33704f) {
            return w1Var;
        }
        w1 c13 = w1.c();
        f0Var.unknownFields = c13;
        return c13;
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof f0) {
            return ((f0) obj).q();
        }
        return true;
    }

    public final Object A(int i13, Object obj, int i14) {
        q1 p13 = p(i14);
        if (!u(i13, obj, i14)) {
            return p13.e();
        }
        Object object = f33613o.getObject(obj, V(i14) & 1048575);
        if (t(object)) {
            return object;
        }
        Object e13 = p13.e();
        if (object != null) {
            p13.a(e13, object);
        }
        return e13;
    }

    public final void G(Object obj, int i13, long j13) {
        Object o13 = o(i13);
        Unsafe unsafe = f33613o;
        Object object = unsafe.getObject(obj, j13);
        this.f33626m.getClass();
        if (y0.c(object)) {
            x0 e13 = y0.e();
            y0.d(e13, object);
            unsafe.putObject(obj, j13, e13);
        }
        y0.a(o13);
        throw null;
    }

    public final int H(Object obj, byte[] bArr, int i13, int i14, int i15, l7.v vVar) {
        Unsafe unsafe;
        int i16;
        Object obj2;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        byte[] bArr2;
        int i36;
        int i37;
        char c13;
        int i38;
        int i39;
        byte[] bArr3;
        int G;
        int i43;
        byte[] bArr4;
        int i44;
        int i45;
        byte[] bArr5;
        int i46;
        int i47;
        int i48;
        int i49;
        f1 f1Var = this;
        Object obj3 = obj;
        byte[] bArr6 = bArr;
        int i53 = i14;
        int i54 = i15;
        l7.v vVar2 = vVar;
        l(obj);
        int i55 = i13;
        int i56 = -1;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        int i63 = 1048575;
        while (true) {
            Unsafe unsafe2 = f33613o;
            if (i55 < i53) {
                int i64 = i55 + 1;
                byte b13 = bArr6[i55];
                if (b13 < 0) {
                    i18 = u1.D(b13, bArr6, i64, vVar2);
                    i17 = vVar2.f81884a;
                } else {
                    i17 = b13;
                    i18 = i64;
                }
                int i65 = i17 >>> 3;
                int i66 = i17 & 7;
                int i67 = f1Var.f33617d;
                int i68 = i18;
                int i69 = f1Var.f33616c;
                int i73 = i17;
                if (i65 > i56) {
                    i24 = (i65 < i69 || i65 > i67) ? -1 : f1Var.R(i65, i57 / 3);
                    i25 = -1;
                    i19 = 0;
                } else {
                    if (i65 < i69 || i65 > i67) {
                        i19 = 0;
                        i23 = -1;
                    } else {
                        i19 = 0;
                        i23 = f1Var.R(i65, 0);
                    }
                    i24 = i23;
                    i25 = -1;
                }
                if (i24 == i25) {
                    i26 = i19;
                    i27 = i59;
                    i28 = i65;
                    unsafe = unsafe2;
                    i16 = i54;
                    obj2 = obj3;
                    i29 = i68;
                    i33 = i73;
                } else {
                    int[] iArr = f1Var.f33614a;
                    int i74 = iArr[i24 + 1];
                    int U = U(i74);
                    long j13 = i74 & 1048575;
                    if (U <= 17) {
                        int i75 = iArr[i24 + 2];
                        int i76 = 1 << (i75 >>> 20);
                        int i77 = i75 & 1048575;
                        if (i77 != i63) {
                            if (i63 != 1048575) {
                                unsafe2.putInt(obj3, i63, i59);
                            }
                            i35 = i77;
                            i34 = i77 == 1048575 ? 0 : unsafe2.getInt(obj3, i77);
                        } else {
                            i34 = i59;
                            i35 = i63;
                        }
                        switch (U) {
                            case 0:
                                bArr2 = bArr;
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                i38 = i73;
                                if (i66 == 1) {
                                    d2.o(obj3, j13, u1.d(i37, bArr2));
                                    i39 = i37 + 8;
                                    i59 = i34 | i76;
                                    vVar2 = vVar;
                                    bArr6 = bArr2;
                                    i55 = i39;
                                    i58 = i38;
                                    i56 = i65;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                i38 = i73;
                                if (i66 == 5) {
                                    d2.p(obj3, j13, u1.j(i37, bArr2));
                                    i39 = i37 + 4;
                                    i59 = i34 | i76;
                                    bArr6 = bArr2;
                                    i55 = i39;
                                    i58 = i38;
                                    i56 = i65;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                i38 = i73;
                                if (i66 == 0) {
                                    G = u1.G(bArr3, i37, vVar2);
                                    i43 = i38;
                                    bArr4 = bArr3;
                                    unsafe2.putLong(obj, j13, vVar2.f81885b);
                                    i59 = i34 | i76;
                                    i55 = G;
                                    i56 = i65;
                                    bArr6 = bArr4;
                                    i58 = i43;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                i38 = i73;
                                if (i66 == 0) {
                                    i55 = u1.E(bArr3, i37, vVar2);
                                    unsafe2.putInt(obj3, j13, vVar2.f81884a);
                                    i46 = i34 | i76;
                                    i58 = i38;
                                    bArr6 = bArr3;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    i59 = i46;
                                    i56 = i65;
                                    break;
                                } else {
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 5:
                            case 14:
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                if (i66 == 1) {
                                    bArr4 = bArr;
                                    i43 = i73;
                                    unsafe2.putLong(obj, j13, u1.h(i37, bArr));
                                    i55 = i37 + 8;
                                    i59 = i34 | i76;
                                    i56 = i65;
                                    bArr6 = bArr4;
                                    i58 = i43;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i38 = i73;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 6:
                            case 13:
                                i36 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 5) {
                                    unsafe2.putInt(obj3, j13, u1.f(i37, bArr5));
                                    i55 = i37 + 4;
                                    i46 = i34 | i76;
                                    bArr6 = bArr5;
                                    i58 = i45;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    i59 = i46;
                                    i56 = i65;
                                    break;
                                } else {
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 7:
                                i44 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 0) {
                                    i55 = u1.G(bArr5, i37, vVar2);
                                    d2.k(j13, obj3, vVar2.f81885b != 0);
                                    int i78 = i34 | i76;
                                    i54 = i15;
                                    bArr6 = bArr5;
                                    i58 = i45;
                                    i63 = i35;
                                    i53 = i14;
                                    i59 = i78;
                                    i57 = i44;
                                    i56 = i65;
                                    break;
                                } else {
                                    i36 = i44;
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 8:
                                i44 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 2) {
                                    i55 = (i74 & 536870912) != 0 ? u1.B(bArr5, i37, vVar2) : u1.y(bArr5, i37, vVar2);
                                    unsafe2.putObject(obj3, j13, vVar2.f81886c);
                                    int i782 = i34 | i76;
                                    i54 = i15;
                                    bArr6 = bArr5;
                                    i58 = i45;
                                    i63 = i35;
                                    i53 = i14;
                                    i59 = i782;
                                    i57 = i44;
                                    i56 = i65;
                                    break;
                                } else {
                                    i36 = i44;
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 9:
                                i44 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 2) {
                                    Object z13 = f1Var.z(i44, obj3);
                                    i36 = i44;
                                    i43 = i45;
                                    i55 = u1.N(z13, f1Var.p(i44), bArr, i37, i14, vVar);
                                    f1Var.S(i36, obj3, z13);
                                    i59 = i34 | i76;
                                    bArr6 = bArr5;
                                    i56 = i65;
                                    i58 = i43;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i36 = i44;
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 10:
                                i44 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 2) {
                                    i55 = u1.b(bArr5, i37, vVar2);
                                    unsafe2.putObject(obj3, j13, vVar2.f81886c);
                                    int i7822 = i34 | i76;
                                    i54 = i15;
                                    bArr6 = bArr5;
                                    i58 = i45;
                                    i63 = i35;
                                    i53 = i14;
                                    i59 = i7822;
                                    i57 = i44;
                                    i56 = i65;
                                    break;
                                } else {
                                    i36 = i44;
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 12:
                                i36 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 0) {
                                    int E = u1.E(bArr5, i37, vVar2);
                                    int i79 = vVar2.f81884a;
                                    j0 n13 = f1Var.n(i36);
                                    if ((i74 & Integer.MIN_VALUE) != 0 && n13 != null && !n13.a(i79)) {
                                        q(obj).d(i45, Long.valueOf(i79));
                                        i55 = E;
                                        i58 = i45;
                                        i56 = i65;
                                        i57 = i36;
                                        i59 = i34;
                                        i63 = i35;
                                        i53 = i14;
                                        i54 = i15;
                                        bArr6 = bArr5;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj3, j13, i79);
                                        int i83 = i34 | i76;
                                        bArr6 = bArr5;
                                        i58 = i45;
                                        i57 = i36;
                                        i63 = i35;
                                        i53 = i14;
                                        i54 = i15;
                                        i59 = i83;
                                        i55 = E;
                                        i56 = i65;
                                        break;
                                    }
                                } else {
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 15:
                                i36 = i24;
                                i37 = i68;
                                i45 = i73;
                                c13 = 65535;
                                bArr5 = bArr;
                                if (i66 == 0) {
                                    i55 = u1.E(bArr5, i37, vVar2);
                                    unsafe2.putInt(obj3, j13, n.b(vVar2.f81884a));
                                    i46 = i34 | i76;
                                    bArr6 = bArr5;
                                    i58 = i45;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    i59 = i46;
                                    i56 = i65;
                                    break;
                                } else {
                                    i38 = i45;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 16:
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                i38 = i73;
                                if (i66 == 0) {
                                    bArr4 = bArr;
                                    G = u1.G(bArr4, i37, vVar2);
                                    i43 = i38;
                                    unsafe2.putLong(obj, j13, n.c(vVar2.f81885b));
                                    i59 = i34 | i76;
                                    i55 = G;
                                    i56 = i65;
                                    bArr6 = bArr4;
                                    i58 = i43;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            case 17:
                                if (i66 == 3) {
                                    Object z14 = f1Var.z(i24, obj3);
                                    i36 = i24;
                                    i43 = i73;
                                    i55 = u1.M(z14, f1Var.p(i24), bArr, i68, i14, (i65 << 3) | 4, vVar);
                                    f1Var.S(i36, obj3, z14);
                                    i59 = i34 | i76;
                                    bArr6 = bArr;
                                    i56 = i65;
                                    i58 = i43;
                                    i57 = i36;
                                    i63 = i35;
                                    i53 = i14;
                                    i54 = i15;
                                    break;
                                } else {
                                    i37 = i68;
                                    c13 = 65535;
                                    i36 = i24;
                                    i38 = i73;
                                    i33 = i38;
                                    i29 = i37;
                                    unsafe = unsafe2;
                                    i26 = i36;
                                    i27 = i34;
                                    i63 = i35;
                                    obj2 = obj3;
                                    i28 = i65;
                                    i16 = i15;
                                    break;
                                }
                            default:
                                i36 = i24;
                                i37 = i68;
                                c13 = 65535;
                                i38 = i73;
                                i33 = i38;
                                i29 = i37;
                                unsafe = unsafe2;
                                i26 = i36;
                                i27 = i34;
                                i63 = i35;
                                obj2 = obj3;
                                i28 = i65;
                                i16 = i15;
                                break;
                        }
                    } else {
                        int i84 = i24;
                        if (U != 27) {
                            i27 = i59;
                            i47 = i63;
                            if (U <= 49) {
                                i28 = i65;
                                unsafe = unsafe2;
                                i26 = i84;
                                i55 = J(obj, bArr, i68, i14, i73, i65, i66, i84, i74, U, j13, vVar);
                                if (i55 != i68) {
                                    f1Var = this;
                                    obj3 = obj;
                                    bArr6 = bArr;
                                    i58 = i73;
                                    i53 = i14;
                                    i54 = i15;
                                    vVar2 = vVar;
                                    i59 = i27;
                                    i56 = i28;
                                    i63 = i47;
                                    i57 = i26;
                                } else {
                                    obj2 = obj;
                                    i33 = i73;
                                    i16 = i15;
                                    i29 = i55;
                                }
                            } else {
                                i48 = i73;
                                unsafe = unsafe2;
                                i49 = i68;
                                i26 = i84;
                                i28 = i65;
                                if (U == 50) {
                                    if (i66 == 2) {
                                        G(obj, i26, j13);
                                        throw null;
                                    }
                                    i33 = i48;
                                    i16 = i15;
                                    i29 = i49;
                                    i63 = i47;
                                    obj2 = obj;
                                } else {
                                    obj2 = obj;
                                    i55 = I(obj, bArr, i49, i14, i48, i28, i66, i74, U, j13, i26, vVar);
                                    if (i55 != i49) {
                                        bArr6 = bArr;
                                        i58 = i48;
                                        i53 = i14;
                                        i54 = i15;
                                        vVar2 = vVar;
                                        obj3 = obj2;
                                        i59 = i27;
                                        i56 = i28;
                                        i57 = i26;
                                        i63 = i47;
                                        f1Var = this;
                                    } else {
                                        i33 = i48;
                                        i16 = i15;
                                        i29 = i55;
                                        i26 = i26;
                                    }
                                }
                            }
                            i63 = i47;
                        } else if (i66 == 2) {
                            c cVar = (c) ((k0) unsafe2.getObject(obj3, j13));
                            boolean c14 = cVar.c();
                            k0 k0Var = cVar;
                            if (!c14) {
                                int size = cVar.size();
                                k0 g13 = cVar.g(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j13, g13);
                                k0Var = g13;
                            }
                            i55 = u1.m(f1Var.p(i84), i73, bArr, i68, i14, k0Var, vVar);
                            bArr6 = bArr;
                            i54 = i15;
                            i56 = i65;
                            i58 = i73;
                            i57 = i84;
                            i59 = i59;
                            i63 = i63;
                            i53 = i14;
                            vVar2 = vVar;
                        } else {
                            i27 = i59;
                            i47 = i63;
                            i48 = i73;
                            unsafe = unsafe2;
                            i49 = i68;
                            i26 = i84;
                            i28 = i65;
                            i33 = i48;
                            i16 = i15;
                            i29 = i49;
                            i63 = i47;
                            obj2 = obj;
                        }
                    }
                }
                if (i33 != i16 || i16 == 0) {
                    i55 = u1.C(i33, bArr, i29, i14, q(obj), vVar);
                    bArr6 = bArr;
                    i53 = i14;
                    vVar2 = vVar;
                    i54 = i16;
                    i58 = i33;
                    obj3 = obj2;
                    i59 = i27;
                    i56 = i28;
                    i57 = i26;
                    f1Var = this;
                } else {
                    i55 = i29;
                    i58 = i33;
                    i59 = i27;
                }
            } else {
                unsafe = unsafe2;
                i16 = i54;
                obj2 = obj3;
            }
        }
        if (i63 != 1048575) {
            unsafe.putInt(obj2, i63, i59);
        }
        for (int i85 = this.f33621h; i85 < this.f33622i; i85++) {
            m(obj2, this.f33620g[i85], null);
        }
        if (i16 == 0) {
            if (i55 != i14) {
                throw InvalidProtocolBufferException.f();
            }
        } else if (i55 > i14 || i58 != i16) {
            throw InvalidProtocolBufferException.f();
        }
        return i55;
    }

    public final int I(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, int i23, l7.v vVar) {
        long j14 = this.f33614a[i23 + 2] & 1048575;
        Unsafe unsafe = f33613o;
        switch (i19) {
            case 51:
                if (i17 == 1) {
                    unsafe.putObject(obj, j13, Double.valueOf(u1.d(i13, bArr)));
                    int i24 = i13 + 8;
                    unsafe.putInt(obj, j14, i16);
                    return i24;
                }
                break;
            case 52:
                if (i17 == 5) {
                    unsafe.putObject(obj, j13, Float.valueOf(u1.j(i13, bArr)));
                    int i25 = i13 + 4;
                    unsafe.putInt(obj, j14, i16);
                    return i25;
                }
                break;
            case 53:
            case 54:
                if (i17 == 0) {
                    int G = u1.G(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Long.valueOf(vVar.f81885b));
                    unsafe.putInt(obj, j14, i16);
                    return G;
                }
                break;
            case 55:
            case 62:
                if (i17 == 0) {
                    int E = u1.E(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Integer.valueOf(vVar.f81884a));
                    unsafe.putInt(obj, j14, i16);
                    return E;
                }
                break;
            case 56:
            case 65:
                if (i17 == 1) {
                    unsafe.putObject(obj, j13, Long.valueOf(u1.h(i13, bArr)));
                    int i26 = i13 + 8;
                    unsafe.putInt(obj, j14, i16);
                    return i26;
                }
                break;
            case 57:
            case 64:
                if (i17 == 5) {
                    unsafe.putObject(obj, j13, Integer.valueOf(u1.f(i13, bArr)));
                    int i27 = i13 + 4;
                    unsafe.putInt(obj, j14, i16);
                    return i27;
                }
                break;
            case 58:
                if (i17 == 0) {
                    int G2 = u1.G(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Boolean.valueOf(vVar.f81885b != 0));
                    unsafe.putInt(obj, j14, i16);
                    return G2;
                }
                break;
            case 59:
                if (i17 == 2) {
                    int E2 = u1.E(bArr, i13, vVar);
                    int i28 = vVar.f81884a;
                    if (i28 == 0) {
                        unsafe.putObject(obj, j13, "");
                    } else {
                        if ((i18 & 536870912) != 0 && !g2.g(bArr, E2, E2 + i28)) {
                            throw InvalidProtocolBufferException.b();
                        }
                        unsafe.putObject(obj, j13, new String(bArr, E2, i28, l0.f33646a));
                        E2 += i28;
                    }
                    unsafe.putInt(obj, j14, i16);
                    return E2;
                }
                break;
            case 60:
                if (i17 == 2) {
                    Object A = A(i16, obj, i23);
                    int N = u1.N(A, p(i23), bArr, i13, i14, vVar);
                    T(i16, obj, A, i23);
                    return N;
                }
                break;
            case 61:
                if (i17 == 2) {
                    int b13 = u1.b(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, vVar.f81886c);
                    unsafe.putInt(obj, j14, i16);
                    return b13;
                }
                break;
            case 63:
                if (i17 == 0) {
                    int E3 = u1.E(bArr, i13, vVar);
                    int i29 = vVar.f81884a;
                    j0 n13 = n(i23);
                    if (n13 == null || n13.a(i29)) {
                        unsafe.putObject(obj, j13, Integer.valueOf(i29));
                        unsafe.putInt(obj, j14, i16);
                    } else {
                        q(obj).d(i15, Long.valueOf(i29));
                    }
                    return E3;
                }
                break;
            case 66:
                if (i17 == 0) {
                    int E4 = u1.E(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Integer.valueOf(n.b(vVar.f81884a)));
                    unsafe.putInt(obj, j14, i16);
                    return E4;
                }
                break;
            case 67:
                if (i17 == 0) {
                    int G3 = u1.G(bArr, i13, vVar);
                    unsafe.putObject(obj, j13, Long.valueOf(n.c(vVar.f81885b)));
                    unsafe.putInt(obj, j14, i16);
                    return G3;
                }
                break;
            case 68:
                if (i17 == 3) {
                    Object A2 = A(i16, obj, i23);
                    int M = u1.M(A2, p(i23), bArr, i13, i14, (i15 & (-8)) | 4, vVar);
                    T(i16, obj, A2, i23);
                    return M;
                }
                break;
        }
        return i13;
    }

    public final int J(Object obj, byte[] bArr, int i13, int i14, int i15, int i16, int i17, int i18, long j13, int i19, long j14, l7.v vVar) {
        int F;
        Unsafe unsafe = f33613o;
        c cVar = (c) ((k0) unsafe.getObject(obj, j14));
        boolean c13 = cVar.c();
        k0 k0Var = cVar;
        if (!c13) {
            int size = cVar.size();
            k0 g13 = cVar.g(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j14, g13);
            k0Var = g13;
        }
        switch (i19) {
            case 18:
            case 35:
                if (i17 == 2) {
                    return u1.o(bArr, i13, k0Var, vVar);
                }
                if (i17 == 1) {
                    return u1.e(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 19:
            case 36:
                if (i17 == 2) {
                    return u1.r(bArr, i13, k0Var, vVar);
                }
                if (i17 == 5) {
                    return u1.k(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i17 == 2) {
                    return u1.v(bArr, i13, k0Var, vVar);
                }
                if (i17 == 0) {
                    return u1.H(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i17 == 2) {
                    return u1.u(bArr, i13, k0Var, vVar);
                }
                if (i17 == 0) {
                    return u1.F(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i17 == 2) {
                    return u1.q(bArr, i13, k0Var, vVar);
                }
                if (i17 == 1) {
                    return u1.i(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i17 == 2) {
                    return u1.p(bArr, i13, k0Var, vVar);
                }
                if (i17 == 5) {
                    return u1.g(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 25:
            case 42:
                if (i17 == 2) {
                    return u1.n(bArr, i13, k0Var, vVar);
                }
                if (i17 == 0) {
                    return u1.a(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 26:
                if (i17 == 2) {
                    return (j13 & 536870912) == 0 ? u1.z(i15, bArr, i13, i14, k0Var, vVar) : u1.A(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 27:
                if (i17 == 2) {
                    return u1.m(p(i18), i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 28:
                if (i17 == 2) {
                    return u1.c(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 30:
            case 44:
                if (i17 == 2) {
                    F = u1.u(bArr, i13, k0Var, vVar);
                } else if (i17 == 0) {
                    F = u1.F(i15, bArr, i13, i14, k0Var, vVar);
                }
                r1.z(obj, i16, k0Var, n(i18), null, this.f33625l);
                return F;
            case 33:
            case 47:
                if (i17 == 2) {
                    return u1.s(bArr, i13, k0Var, vVar);
                }
                if (i17 == 0) {
                    return u1.w(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 34:
            case 48:
                if (i17 == 2) {
                    return u1.t(bArr, i13, k0Var, vVar);
                }
                if (i17 == 0) {
                    return u1.x(i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
            case 49:
                if (i17 == 3) {
                    return u1.l(p(i18), i15, bArr, i13, i14, k0Var, vVar);
                }
                break;
        }
        return i13;
    }

    public final void K(Object obj, long j13, p1 p1Var, q1 q1Var, u uVar) {
        int x13;
        List c13 = this.f33624k.c(j13, obj);
        o oVar = (o) p1Var;
        int i13 = oVar.f33668b;
        if ((i13 & 7) != 3) {
            int i14 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            Object e13 = q1Var.e();
            oVar.c(e13, q1Var, uVar);
            q1Var.b(e13);
            c13.add(e13);
            n nVar = oVar.f33667a;
            if (nVar.e() || oVar.f33670d != 0) {
                return;
            } else {
                x13 = nVar.x();
            }
        } while (x13 == i13);
        oVar.f33670d = x13;
    }

    public final void L(Object obj, int i13, p1 p1Var, q1 q1Var, u uVar) {
        int x13;
        List c13 = this.f33624k.c(i13 & 1048575, obj);
        o oVar = (o) p1Var;
        int i14 = oVar.f33668b;
        if ((i14 & 7) != 2) {
            int i15 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            Object e13 = q1Var.e();
            oVar.d(e13, q1Var, uVar);
            q1Var.b(e13);
            c13.add(e13);
            n nVar = oVar.f33667a;
            if (nVar.e() || oVar.f33670d != 0) {
                return;
            } else {
                x13 = nVar.x();
            }
        } while (x13 == i14);
        oVar.f33670d = x13;
    }

    public final void M(Object obj, int i13, p1 p1Var) {
        if ((536870912 & i13) != 0) {
            o oVar = (o) p1Var;
            oVar.w(2);
            d2.s(i13 & 1048575, obj, oVar.f33667a.w());
        } else {
            if (!this.f33619f) {
                d2.s(i13 & 1048575, obj, ((o) p1Var).f());
                return;
            }
            o oVar2 = (o) p1Var;
            oVar2.w(2);
            d2.s(i13 & 1048575, obj, oVar2.f33667a.v());
        }
    }

    public final void N(Object obj, int i13, p1 p1Var) {
        boolean z13 = (536870912 & i13) != 0;
        r0 r0Var = this.f33624k;
        if (z13) {
            ((o) p1Var).s(r0Var.c(i13 & 1048575, obj), true);
        } else {
            ((o) p1Var).s(r0Var.c(i13 & 1048575, obj), false);
        }
    }

    public final void P(int i13, Object obj) {
        int i14 = this.f33614a[i13 + 2];
        long j13 = 1048575 & i14;
        if (j13 == 1048575) {
            return;
        }
        d2.q((1 << (i14 >>> 20)) | d2.f33602c.g(j13, obj), j13, obj);
    }

    public final void Q(int i13, Object obj, int i14) {
        d2.q(i13, this.f33614a[i14 + 2] & 1048575, obj);
    }

    public final int R(int i13, int i14) {
        int[] iArr = this.f33614a;
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

    public final void S(int i13, Object obj, Object obj2) {
        f33613o.putObject(obj, V(i13) & 1048575, obj2);
        P(i13, obj);
    }

    public final void T(int i13, Object obj, Object obj2, int i14) {
        f33613o.putObject(obj, V(i14) & 1048575, obj2);
        Q(i13, obj, i14);
    }

    public final int V(int i13) {
        return this.f33614a[i13 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void W(Object obj, u6 u6Var) {
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        boolean z13;
        boolean z14;
        int[] iArr2 = this.f33614a;
        int length = iArr2.length;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i19 < length) {
            int V = V(i19);
            int i23 = iArr2[i19];
            int U = U(V);
            Unsafe unsafe = f33613o;
            if (U <= 17) {
                int i24 = iArr2[i19 + 2];
                int i25 = i24 & 1048575;
                if (i25 != i17) {
                    i18 = i25 == 1048575 ? 0 : unsafe.getInt(obj, i25);
                    i17 = i25;
                }
                i13 = i17;
                i14 = i18;
                i15 = 1 << (i24 >>> 20);
            } else {
                i13 = i17;
                i14 = i18;
                i15 = 0;
            }
            long j13 = V & 1048575;
            switch (U) {
                case 0:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.q(i23, d2.f33602c.e(j13, obj));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 1:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.u(i23, d2.f33602c.f(j13, obj));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 2:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.y(i23, unsafe.getLong(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 3:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.F(i23, unsafe.getLong(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 4:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.x(i23, unsafe.getInt(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 5:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.t(i23, unsafe.getLong(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 6:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.s(i23, unsafe.getInt(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 7:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.o(i23, d2.f33602c.c(j13, obj));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 8:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        X(i23, unsafe.getObject(obj, j13), u6Var);
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 9:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.z(i23, p(i19), unsafe.getObject(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 10:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.p(i23, (k) unsafe.getObject(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 11:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.E(i23, unsafe.getInt(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 12:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.r(i23, unsafe.getInt(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 13:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.A(i23, unsafe.getInt(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 14:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.B(i23, unsafe.getLong(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 15:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.C(i23, unsafe.getInt(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 16:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.D(i23, unsafe.getLong(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 17:
                    iArr = iArr2;
                    i16 = length;
                    if (s(obj, i19, i13, i14, i15)) {
                        u6Var.v(i23, p(i19), unsafe.getObject(obj, j13));
                    }
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 18:
                    z13 = false;
                    r1.F(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 19:
                    z13 = false;
                    r1.J(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 20:
                    z13 = false;
                    r1.M(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 21:
                    z13 = false;
                    r1.U(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 22:
                    z13 = false;
                    r1.L(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 23:
                    z13 = false;
                    r1.I(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 24:
                    z13 = false;
                    r1.H(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 25:
                    z13 = false;
                    r1.D(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 26:
                    r1.S(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 27:
                    r1.N(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, p(i19));
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 28:
                    r1.E(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 29:
                    z14 = false;
                    r1.T(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 30:
                    z14 = false;
                    r1.G(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 31:
                    z14 = false;
                    r1.O(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 32:
                    z14 = false;
                    r1.P(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 33:
                    z14 = false;
                    r1.Q(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 34:
                    z14 = false;
                    r1.R(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, false);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 35:
                    r1.F(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 36:
                    r1.J(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 37:
                    r1.M(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 38:
                    r1.U(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 39:
                    r1.L(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 40:
                    r1.I(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 41:
                    r1.H(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 42:
                    r1.D(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 43:
                    r1.T(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 44:
                    r1.G(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 45:
                    r1.O(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 46:
                    r1.P(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 47:
                    r1.Q(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 48:
                    r1.R(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, true);
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 49:
                    r1.K(iArr2[i19], (List) unsafe.getObject(obj, j13), u6Var, p(i19));
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 50:
                    if (unsafe.getObject(obj, j13) != null) {
                        Object o13 = o(i19);
                        this.f33626m.getClass();
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(o13);
                        throw null;
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 51:
                    if (u(i23, obj, i19)) {
                        u6Var.q(i23, ((Double) d2.f33602c.i(j13, obj)).doubleValue());
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 52:
                    if (u(i23, obj, i19)) {
                        u6Var.u(i23, ((Float) d2.f33602c.i(j13, obj)).floatValue());
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 53:
                    if (u(i23, obj, i19)) {
                        u6Var.y(i23, F(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 54:
                    if (u(i23, obj, i19)) {
                        u6Var.F(i23, F(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 55:
                    if (u(i23, obj, i19)) {
                        u6Var.x(i23, E(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 56:
                    if (u(i23, obj, i19)) {
                        u6Var.t(i23, F(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 57:
                    if (u(i23, obj, i19)) {
                        u6Var.s(i23, E(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 58:
                    if (u(i23, obj, i19)) {
                        u6Var.o(i23, ((Boolean) d2.f33602c.i(j13, obj)).booleanValue());
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 59:
                    if (u(i23, obj, i19)) {
                        X(i23, unsafe.getObject(obj, j13), u6Var);
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 60:
                    if (u(i23, obj, i19)) {
                        u6Var.z(i23, p(i19), unsafe.getObject(obj, j13));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 61:
                    if (u(i23, obj, i19)) {
                        u6Var.p(i23, (k) unsafe.getObject(obj, j13));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 62:
                    if (u(i23, obj, i19)) {
                        u6Var.E(i23, E(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 63:
                    if (u(i23, obj, i19)) {
                        u6Var.r(i23, E(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 64:
                    if (u(i23, obj, i19)) {
                        u6Var.A(i23, E(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 65:
                    if (u(i23, obj, i19)) {
                        u6Var.B(i23, F(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 66:
                    if (u(i23, obj, i19)) {
                        u6Var.C(i23, E(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 67:
                    if (u(i23, obj, i19)) {
                        u6Var.D(i23, F(j13, obj));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                case 68:
                    if (u(i23, obj, i19)) {
                        u6Var.v(i23, p(i19), unsafe.getObject(obj, j13));
                    }
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
                default:
                    iArr = iArr2;
                    i16 = length;
                    i19 += 3;
                    i17 = i13;
                    iArr2 = iArr;
                    i18 = i14;
                    length = i16;
            }
        }
        ((x1) this.f33625l).getClass();
        ((f0) obj).unknownFields.e(u6Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f33614a;
            if (i13 >= iArr.length) {
                r1.A(this.f33625l, obj, obj2);
                return;
            }
            int V = V(i13);
            long j13 = 1048575 & V;
            int i14 = iArr[i13];
            switch (U(V)) {
                case 0:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.o(obj, j13, d2.f33602c.e(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 1:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.p(obj, j13, d2.f33602c.f(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 2:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.r(j13, obj, d2.f33602c.h(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 3:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.r(j13, obj, d2.f33602c.h(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 4:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.q(d2.f33602c.g(j13, obj2), j13, obj);
                        P(i13, obj);
                        break;
                    }
                case 5:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.r(j13, obj, d2.f33602c.h(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 6:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.q(d2.f33602c.g(j13, obj2), j13, obj);
                        P(i13, obj);
                        break;
                    }
                case 7:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.k(j13, obj, d2.f33602c.c(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 8:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.s(j13, obj, d2.f33602c.i(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 9:
                    x(i13, obj, obj2);
                    break;
                case 10:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.s(j13, obj, d2.f33602c.i(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 11:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.q(d2.f33602c.g(j13, obj2), j13, obj);
                        P(i13, obj);
                        break;
                    }
                case 12:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.q(d2.f33602c.g(j13, obj2), j13, obj);
                        P(i13, obj);
                        break;
                    }
                case 13:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.q(d2.f33602c.g(j13, obj2), j13, obj);
                        P(i13, obj);
                        break;
                    }
                case 14:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.r(j13, obj, d2.f33602c.h(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 15:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.q(d2.f33602c.g(j13, obj2), j13, obj);
                        P(i13, obj);
                        break;
                    }
                case 16:
                    if (!r(i13, obj2)) {
                        break;
                    } else {
                        d2.r(j13, obj, d2.f33602c.h(j13, obj2));
                        P(i13, obj);
                        break;
                    }
                case 17:
                    x(i13, obj, obj2);
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
                    this.f33624k.b(j13, obj, obj2);
                    break;
                case 50:
                    Class cls = r1.f33688a;
                    c2 c2Var = d2.f33602c;
                    Object i15 = c2Var.i(j13, obj);
                    Object i16 = c2Var.i(j13, obj2);
                    this.f33626m.getClass();
                    d2.s(j13, obj, y0.d(i15, i16));
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
                    if (!u(i14, obj2, i13)) {
                        break;
                    } else {
                        d2.s(j13, obj, d2.f33602c.i(j13, obj2));
                        Q(i14, obj, i13);
                        break;
                    }
                case 60:
                    y(i13, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!u(i14, obj2, i13)) {
                        break;
                    } else {
                        d2.s(j13, obj, d2.f33602c.i(j13, obj2));
                        Q(i14, obj, i13);
                        break;
                    }
                case 68:
                    y(i13, obj, obj2);
                    break;
            }
            i13 += 3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                f0Var.i();
                f0Var.h();
                f0Var.r();
            }
            int[] iArr = this.f33614a;
            int length = iArr.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int V = V(i13);
                long j13 = 1048575 & V;
                int U = U(V);
                Unsafe unsafe = f33613o;
                if (U != 9) {
                    if (U != 60 && U != 68) {
                        switch (U) {
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
                                this.f33624k.a(j13, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j13);
                                if (object != null) {
                                    this.f33626m.getClass();
                                    y0.f(object);
                                    unsafe.putObject(obj, j13, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (u(iArr[i13], obj, i13)) {
                        p(i13).b(unsafe.getObject(obj, j13));
                    }
                }
                if (r(i13, obj)) {
                    p(i13).b(unsafe.getObject(obj, j13));
                }
            }
            this.f33625l.b(obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final boolean c(Object obj) {
        int i13;
        int i14;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f33621h) {
            int i18 = this.f33620g[i17];
            int[] iArr = this.f33614a;
            int i19 = iArr[i18];
            int V = V(i18);
            int i23 = iArr[i18 + 2];
            int i24 = i23 & 1048575;
            int i25 = 1 << (i23 >>> 20);
            if (i24 != i15) {
                if (i24 != 1048575) {
                    i16 = f33613o.getInt(obj, i24);
                }
                i14 = i16;
                i13 = i24;
            } else {
                i13 = i15;
                i14 = i16;
            }
            if ((268435456 & V) != 0 && !s(obj, i18, i13, i14, i25)) {
                return false;
            }
            int U = U(V);
            if (U != 9 && U != 17) {
                if (U != 27) {
                    if (U == 60 || U == 68) {
                        if (u(i19, obj, i18)) {
                            if (!p(i18).c(d2.f33602c.i(V & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (U != 49) {
                        if (U != 50) {
                            continue;
                        } else {
                            Object i26 = d2.f33602c.i(V & 1048575, obj);
                            this.f33626m.getClass();
                            if (!((x0) i26).isEmpty()) {
                                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(o(i18));
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) d2.f33602c.i(V & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    q1 p13 = p(i18);
                    for (int i27 = 0; i27 < list.size(); i27++) {
                        if (!p13.c(list.get(i27))) {
                            return false;
                        }
                    }
                }
            } else if (s(obj, i18, i13, i14, i25)) {
                if (!p(i18).c(d2.f33602c.i(V & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i17++;
            i15 = i13;
            i16 = i14;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final int d(Object obj) {
        int i13;
        int i14;
        int i15;
        int T;
        int R;
        int i16;
        int j03;
        int l03;
        int i17 = 1048575;
        int i18 = 1048575;
        int i19 = 0;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int[] iArr = this.f33614a;
            if (i23 >= iArr.length) {
                ((x1) this.f33625l).getClass();
                return ((f0) obj).unknownFields.b() + i24;
            }
            int V = V(i23);
            int U = U(V);
            int i25 = iArr[i23];
            int i26 = iArr[i23 + 2];
            int i27 = i26 & i17;
            Unsafe unsafe = f33613o;
            if (U <= 17) {
                if (i27 != i18) {
                    i19 = i27 == i17 ? 0 : unsafe.getInt(obj, i27);
                    i18 = i27;
                }
                i13 = i18;
                i14 = i19;
                i15 = 1 << (i26 >>> 20);
            } else {
                i13 = i18;
                i14 = i19;
                i15 = 0;
            }
            long j13 = V & i17;
            if (U >= z.DOUBLE_LIST_PACKED.id()) {
                z.SINT64_LIST_PACKED.id();
            }
            switch (U) {
                case 0:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.T(i25);
                        i24 += T;
                        break;
                    }
                case 1:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.X(i25);
                        i24 += T;
                        break;
                    }
                case 2:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.b0(i25, unsafe.getLong(obj, j13));
                        i24 += T;
                        break;
                    }
                case 3:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.m0(i25, unsafe.getLong(obj, j13));
                        i24 += T;
                        break;
                    }
                case 4:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.Z(i25, unsafe.getInt(obj, j13));
                        i24 += T;
                        break;
                    }
                case 5:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.W(i25);
                        i24 += T;
                        break;
                    }
                case 6:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.V(i25);
                        i24 += T;
                        break;
                    }
                case 7:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.Q(i25);
                        i24 += T;
                        break;
                    }
                case 8:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j13);
                        R = object instanceof k ? r.R(i25, (k) object) : r.h0(i25, (String) object);
                        i24 = R + i24;
                        break;
                    }
                case 9:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r1.o(i25, p(i23), unsafe.getObject(obj, j13));
                        i24 += T;
                        break;
                    }
                case 10:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.R(i25, (k) unsafe.getObject(obj, j13));
                        i24 += T;
                        break;
                    }
                case 11:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.k0(i25, unsafe.getInt(obj, j13));
                        i24 += T;
                        break;
                    }
                case 12:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.U(i25, unsafe.getInt(obj, j13));
                        i24 += T;
                        break;
                    }
                case 13:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.d0(i25);
                        i24 += T;
                        break;
                    }
                case 14:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.e0(i25);
                        i24 += T;
                        break;
                    }
                case 15:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.f0(i25, unsafe.getInt(obj, j13));
                        i24 += T;
                        break;
                    }
                case 16:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.g0(i25, unsafe.getLong(obj, j13));
                        i24 += T;
                        break;
                    }
                case 17:
                    if (!s(obj, i23, i13, i14, i15)) {
                        break;
                    } else {
                        T = r.Y(i25, (b) unsafe.getObject(obj, j13), p(i23));
                        i24 += T;
                        break;
                    }
                case 18:
                    T = r1.h(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 19:
                    T = r1.f(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 20:
                    T = r1.m(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 21:
                    T = r1.x(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 22:
                    T = r1.k(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 23:
                    T = r1.h(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 24:
                    T = r1.f(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 25:
                    T = r1.a(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 26:
                    T = r1.u(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 27:
                    T = r1.p(i25, (List) unsafe.getObject(obj, j13), p(i23));
                    i24 += T;
                    break;
                case 28:
                    T = r1.c(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 29:
                    T = r1.v(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 30:
                    T = r1.d(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 31:
                    T = r1.f(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 32:
                    T = r1.h(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 33:
                    T = r1.q(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 34:
                    T = r1.s(i25, (List) unsafe.getObject(obj, j13));
                    i24 += T;
                    break;
                case 35:
                    i16 = r1.i((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 36:
                    i16 = r1.g((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 37:
                    i16 = r1.n((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 38:
                    i16 = r1.y((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 39:
                    i16 = r1.l((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 40:
                    i16 = r1.i((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 41:
                    i16 = r1.g((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 42:
                    i16 = r1.b((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 43:
                    i16 = r1.w((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 44:
                    i16 = r1.e((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 45:
                    i16 = r1.g((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 46:
                    i16 = r1.i((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 47:
                    i16 = r1.r((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 48:
                    i16 = r1.t((List) unsafe.getObject(obj, j13));
                    if (i16 <= 0) {
                        break;
                    } else {
                        j03 = r.j0(i25);
                        l03 = r.l0(i16);
                        i24 += l03 + j03 + i16;
                        break;
                    }
                case 49:
                    T = r1.j(i25, (List) unsafe.getObject(obj, j13), p(i23));
                    i24 += T;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j13);
                    Object o13 = o(i23);
                    this.f33626m.getClass();
                    y0.b(object2, o13);
                    break;
                case 51:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.T(i25);
                        i24 += T;
                        break;
                    }
                case 52:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.X(i25);
                        i24 += T;
                        break;
                    }
                case 53:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.b0(i25, F(j13, obj));
                        i24 += T;
                        break;
                    }
                case 54:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.m0(i25, F(j13, obj));
                        i24 += T;
                        break;
                    }
                case 55:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.Z(i25, E(j13, obj));
                        i24 += T;
                        break;
                    }
                case 56:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.W(i25);
                        i24 += T;
                        break;
                    }
                case 57:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.V(i25);
                        i24 += T;
                        break;
                    }
                case 58:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.Q(i25);
                        i24 += T;
                        break;
                    }
                case 59:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(obj, j13);
                        R = object3 instanceof k ? r.R(i25, (k) object3) : r.h0(i25, (String) object3);
                        i24 = R + i24;
                        break;
                    }
                case 60:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r1.o(i25, p(i23), unsafe.getObject(obj, j13));
                        i24 += T;
                        break;
                    }
                case 61:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.R(i25, (k) unsafe.getObject(obj, j13));
                        i24 += T;
                        break;
                    }
                case 62:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.k0(i25, E(j13, obj));
                        i24 += T;
                        break;
                    }
                case 63:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.U(i25, E(j13, obj));
                        i24 += T;
                        break;
                    }
                case 64:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.d0(i25);
                        i24 += T;
                        break;
                    }
                case 65:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.e0(i25);
                        i24 += T;
                        break;
                    }
                case 66:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.f0(i25, E(j13, obj));
                        i24 += T;
                        break;
                    }
                case 67:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.g0(i25, F(j13, obj));
                        i24 += T;
                        break;
                    }
                case 68:
                    if (!u(i25, obj, i23)) {
                        break;
                    } else {
                        T = r.Y(i25, (b) unsafe.getObject(obj, j13), p(i23));
                        i24 += T;
                        break;
                    }
            }
            i23 += 3;
            i18 = i13;
            i19 = i14;
            i17 = 1048575;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final Object e() {
        this.f33623j.getClass();
        return ((f0) this.f33618e).t();
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
    @Override // com.google.crypto.tink.shaded.protobuf.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f1.f(java.lang.Object):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final boolean g(Object obj, Object obj2) {
        boolean B;
        int[] iArr = this.f33614a;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int V = V(i13);
            long j13 = V & 1048575;
            switch (U(V)) {
                case 0:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var = d2.f33602c;
                        if (Double.doubleToLongBits(c2Var.e(j13, obj)) == Double.doubleToLongBits(c2Var.e(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var2 = d2.f33602c;
                        if (Float.floatToIntBits(c2Var2.f(j13, obj)) == Float.floatToIntBits(c2Var2.f(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var3 = d2.f33602c;
                        if (c2Var3.h(j13, obj) == c2Var3.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var4 = d2.f33602c;
                        if (c2Var4.h(j13, obj) == c2Var4.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var5 = d2.f33602c;
                        if (c2Var5.g(j13, obj) == c2Var5.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var6 = d2.f33602c;
                        if (c2Var6.h(j13, obj) == c2Var6.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var7 = d2.f33602c;
                        if (c2Var7.g(j13, obj) == c2Var7.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var8 = d2.f33602c;
                        if (c2Var8.c(j13, obj) == c2Var8.c(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var9 = d2.f33602c;
                        if (r1.B(c2Var9.i(j13, obj), c2Var9.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var10 = d2.f33602c;
                        if (r1.B(c2Var10.i(j13, obj), c2Var10.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var11 = d2.f33602c;
                        if (r1.B(c2Var11.i(j13, obj), c2Var11.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var12 = d2.f33602c;
                        if (c2Var12.g(j13, obj) == c2Var12.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var13 = d2.f33602c;
                        if (c2Var13.g(j13, obj) == c2Var13.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var14 = d2.f33602c;
                        if (c2Var14.g(j13, obj) == c2Var14.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var15 = d2.f33602c;
                        if (c2Var15.h(j13, obj) == c2Var15.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var16 = d2.f33602c;
                        if (c2Var16.g(j13, obj) == c2Var16.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var17 = d2.f33602c;
                        if (c2Var17.h(j13, obj) == c2Var17.h(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (k(i13, obj, obj2)) {
                        c2 c2Var18 = d2.f33602c;
                        if (r1.B(c2Var18.i(j13, obj), c2Var18.i(j13, obj2))) {
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
                    c2 c2Var19 = d2.f33602c;
                    B = r1.B(c2Var19.i(j13, obj), c2Var19.i(j13, obj2));
                    break;
                case 50:
                    c2 c2Var20 = d2.f33602c;
                    B = r1.B(c2Var20.i(j13, obj), c2Var20.i(j13, obj2));
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
                    c2 c2Var21 = d2.f33602c;
                    if (c2Var21.g(j14, obj) == c2Var21.g(j14, obj2) && r1.B(c2Var21.i(j13, obj), c2Var21.i(j13, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!B) {
                return false;
            }
        }
        x1 x1Var = (x1) this.f33625l;
        x1Var.getClass();
        w1 w1Var = ((f0) obj).unknownFields;
        x1Var.getClass();
        return w1Var.equals(((f0) obj2).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void h(Object obj, p1 p1Var, u uVar) {
        uVar.getClass();
        l(obj);
        v(this.f33625l, obj, p1Var, uVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void i(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        H(obj, bArr, i13, i14, 0, vVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void j(Object obj, u6 u6Var) {
        u6Var.getClass();
        if (h2.ASCENDING != h2.DESCENDING) {
            W(obj, u6Var);
            return;
        }
        ((x1) this.f33625l).getClass();
        ((f0) obj).unknownFields.e(u6Var);
        int[] iArr = this.f33614a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int V = V(length);
            int i13 = iArr[length];
            switch (U(V)) {
                case 0:
                    if (r(length, obj)) {
                        u6Var.q(i13, d2.f33602c.e(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(length, obj)) {
                        u6Var.u(i13, d2.f33602c.f(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(length, obj)) {
                        u6Var.y(i13, d2.f33602c.h(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(length, obj)) {
                        u6Var.F(i13, d2.f33602c.h(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(length, obj)) {
                        u6Var.x(i13, d2.f33602c.g(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(length, obj)) {
                        u6Var.t(i13, d2.f33602c.h(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(length, obj)) {
                        u6Var.s(i13, d2.f33602c.g(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(length, obj)) {
                        u6Var.o(i13, d2.f33602c.c(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(length, obj)) {
                        X(i13, d2.f33602c.i(V & 1048575, obj), u6Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (r(length, obj)) {
                        u6Var.z(i13, p(length), d2.f33602c.i(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(length, obj)) {
                        u6Var.p(i13, (k) d2.f33602c.i(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(length, obj)) {
                        u6Var.E(i13, d2.f33602c.g(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(length, obj)) {
                        u6Var.r(i13, d2.f33602c.g(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(length, obj)) {
                        u6Var.A(i13, d2.f33602c.g(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(length, obj)) {
                        u6Var.B(i13, d2.f33602c.h(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(length, obj)) {
                        u6Var.C(i13, d2.f33602c.g(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(length, obj)) {
                        u6Var.D(i13, d2.f33602c.h(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(length, obj)) {
                        u6Var.v(i13, p(length), d2.f33602c.i(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    r1.F(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 19:
                    r1.J(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 20:
                    r1.M(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 21:
                    r1.U(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 22:
                    r1.L(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 23:
                    r1.I(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 24:
                    r1.H(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 25:
                    r1.D(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 26:
                    r1.S(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var);
                    break;
                case 27:
                    r1.N(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, p(length));
                    break;
                case 28:
                    r1.E(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var);
                    break;
                case 29:
                    r1.T(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 30:
                    r1.G(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 31:
                    r1.O(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 32:
                    r1.P(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 33:
                    r1.Q(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 34:
                    r1.R(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, false);
                    break;
                case 35:
                    r1.F(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 36:
                    r1.J(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 37:
                    r1.M(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 38:
                    r1.U(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 39:
                    r1.L(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 40:
                    r1.I(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 41:
                    r1.H(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 42:
                    r1.D(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 43:
                    r1.T(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 44:
                    r1.G(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 45:
                    r1.O(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 46:
                    r1.P(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 47:
                    r1.Q(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 48:
                    r1.R(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, true);
                    break;
                case 49:
                    r1.K(iArr[length], (List) d2.f33602c.i(V & 1048575, obj), u6Var, p(length));
                    break;
                case 50:
                    if (d2.f33602c.i(V & 1048575, obj) != null) {
                        Object o13 = o(length);
                        this.f33626m.getClass();
                        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(o13);
                        throw null;
                    }
                    break;
                case 51:
                    if (u(i13, obj, length)) {
                        u6Var.q(i13, ((Double) d2.f33602c.i(V & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i13, obj, length)) {
                        u6Var.u(i13, ((Float) d2.f33602c.i(V & 1048575, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i13, obj, length)) {
                        u6Var.y(i13, F(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i13, obj, length)) {
                        u6Var.F(i13, F(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i13, obj, length)) {
                        u6Var.x(i13, E(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i13, obj, length)) {
                        u6Var.t(i13, F(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i13, obj, length)) {
                        u6Var.s(i13, E(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i13, obj, length)) {
                        u6Var.o(i13, ((Boolean) d2.f33602c.i(V & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i13, obj, length)) {
                        X(i13, d2.f33602c.i(V & 1048575, obj), u6Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i13, obj, length)) {
                        u6Var.z(i13, p(length), d2.f33602c.i(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i13, obj, length)) {
                        u6Var.p(i13, (k) d2.f33602c.i(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i13, obj, length)) {
                        u6Var.E(i13, E(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i13, obj, length)) {
                        u6Var.r(i13, E(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i13, obj, length)) {
                        u6Var.A(i13, E(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i13, obj, length)) {
                        u6Var.B(i13, F(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i13, obj, length)) {
                        u6Var.C(i13, E(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i13, obj, length)) {
                        u6Var.D(i13, F(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i13, obj, length)) {
                        u6Var.v(i13, p(length), d2.f33602c.i(V & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    public final boolean k(int i13, Object obj, Object obj2) {
        return r(i13, obj) == r(i13, obj2);
    }

    public final void m(Object obj, int i13, Object obj2) {
        int i14 = this.f33614a[i13];
        Object i15 = d2.f33602c.i(V(i13) & 1048575, obj);
        if (i15 == null || n(i13) == null) {
            return;
        }
        this.f33626m.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(o(i13));
        throw null;
    }

    public final j0 n(int i13) {
        return (j0) this.f33615b[cb.c(i13, 3, 2, 1)];
    }

    public final Object o(int i13) {
        return this.f33615b[(i13 / 3) * 2];
    }

    public final q1 p(int i13) {
        int i14 = (i13 / 3) * 2;
        Object[] objArr = this.f33615b;
        q1 q1Var = (q1) objArr[i14];
        if (q1Var != null) {
            return q1Var;
        }
        q1 b13 = m1.f33656c.b((Class) objArr[i14 + 1]);
        objArr[i14] = b13;
        return b13;
    }

    public final boolean r(int i13, Object obj) {
        int i14 = this.f33614a[i13 + 2];
        long j13 = i14 & 1048575;
        if (j13 != 1048575) {
            return ((1 << (i14 >>> 20)) & d2.f33602c.g(j13, obj)) != 0;
        }
        int V = V(i13);
        long j14 = V & 1048575;
        switch (U(V)) {
            case 0:
                return Double.doubleToRawLongBits(d2.f33602c.e(j14, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(d2.f33602c.f(j14, obj)) != 0;
            case 2:
                return d2.f33602c.h(j14, obj) != 0;
            case 3:
                return d2.f33602c.h(j14, obj) != 0;
            case 4:
                return d2.f33602c.g(j14, obj) != 0;
            case 5:
                return d2.f33602c.h(j14, obj) != 0;
            case 6:
                return d2.f33602c.g(j14, obj) != 0;
            case 7:
                return d2.f33602c.c(j14, obj);
            case 8:
                Object i15 = d2.f33602c.i(j14, obj);
                if (i15 instanceof String) {
                    return !((String) i15).isEmpty();
                }
                if (i15 instanceof k) {
                    return !k.f33636b.equals(i15);
                }
                throw new IllegalArgumentException();
            case 9:
                return d2.f33602c.i(j14, obj) != null;
            case 10:
                return !k.f33636b.equals(d2.f33602c.i(j14, obj));
            case 11:
                return d2.f33602c.g(j14, obj) != 0;
            case 12:
                return d2.f33602c.g(j14, obj) != 0;
            case 13:
                return d2.f33602c.g(j14, obj) != 0;
            case 14:
                return d2.f33602c.h(j14, obj) != 0;
            case 15:
                return d2.f33602c.g(j14, obj) != 0;
            case 16:
                return d2.f33602c.h(j14, obj) != 0;
            case 17:
                return d2.f33602c.i(j14, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(Object obj, int i13, int i14, int i15, int i16) {
        return i14 == 1048575 ? r(i13, obj) : (i15 & i16) != 0;
    }

    public final boolean u(int i13, Object obj, int i14) {
        return d2.f33602c.g((long) (this.f33614a[i14 + 2] & 1048575), obj) == i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0620 A[Catch: all -> 0x0025, TryCatch #3 {all -> 0x0025, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0020, B:272:0x004a, B:274:0x004f, B:275:0x0053, B:10:0x006e, B:12:0x0072, B:212:0x0080, B:213:0x008a, B:226:0x00a4, B:228:0x00bb, B:230:0x00d2, B:232:0x00e9, B:234:0x0100, B:236:0x0117, B:238:0x0125, B:241:0x012c, B:242:0x0131, B:244:0x0141, B:246:0x0159, B:248:0x0169, B:250:0x017f, B:252:0x0187, B:254:0x019f, B:256:0x01b7, B:258:0x01cf, B:260:0x01e7, B:262:0x01ff, B:264:0x0217, B:266:0x022f, B:42:0x0247, B:44:0x0250, B:24:0x061b, B:26:0x0620, B:27:0x0625, B:16:0x0257, B:19:0x0269, B:50:0x0271, B:53:0x0281, B:56:0x0291, B:59:0x02a1, B:62:0x02b1, B:65:0x02ce, B:68:0x02de, B:71:0x02ee, B:74:0x02fe, B:77:0x030e, B:80:0x031e, B:83:0x032e, B:86:0x033e, B:89:0x034e, B:92:0x035e, B:95:0x036e, B:98:0x037e, B:101:0x038e, B:104:0x039e, B:107:0x03bb, B:110:0x03cb, B:113:0x03db, B:116:0x03ef, B:119:0x03f7, B:122:0x0407, B:125:0x0417, B:128:0x0427, B:131:0x0437, B:134:0x0447, B:137:0x0457, B:140:0x0467, B:145:0x047a, B:150:0x048f, B:153:0x04a6, B:156:0x04bd, B:159:0x04d4, B:162:0x04eb, B:164:0x04fc, B:171:0x0503, B:168:0x0509, B:175:0x0515, B:178:0x052c, B:181:0x053f, B:184:0x0558, B:187:0x0563, B:190:0x057a, B:193:0x0591, B:196:0x05a8, B:199:0x05bf, B:202:0x05d6, B:205:0x05ed, B:208:0x0604), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x062b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.crypto.tink.shaded.protobuf.v1 r18, java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.p1 r20, com.google.crypto.tink.shaded.protobuf.u r21) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.f1.v(com.google.crypto.tink.shaded.protobuf.v1, java.lang.Object, com.google.crypto.tink.shaded.protobuf.p1, com.google.crypto.tink.shaded.protobuf.u):void");
    }

    public final void w(Object obj, int i13, Object obj2) {
        long V = V(i13) & 1048575;
        Object i14 = d2.f33602c.i(V, obj);
        y0 y0Var = this.f33626m;
        if (i14 != null) {
            y0Var.getClass();
            if (y0.c(i14)) {
                x0 c13 = x0.f33712b.c();
                y0.d(c13, i14);
                d2.s(V, obj, c13);
                i14 = c13;
            }
        } else {
            y0Var.getClass();
            i14 = x0.f33712b.c();
            d2.s(V, obj, i14);
        }
        y0Var.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        throw null;
    }

    public final void x(int i13, Object obj, Object obj2) {
        if (r(i13, obj2)) {
            long V = V(i13) & 1048575;
            Unsafe unsafe = f33613o;
            Object object = unsafe.getObject(obj2, V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f33614a[i13] + " is present but null: " + obj2);
            }
            q1 p13 = p(i13);
            if (!r(i13, obj)) {
                if (t(object)) {
                    Object e13 = p13.e();
                    p13.a(e13, object);
                    unsafe.putObject(obj, V, e13);
                } else {
                    unsafe.putObject(obj, V, object);
                }
                P(i13, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, V);
            if (!t(object2)) {
                Object e14 = p13.e();
                p13.a(e14, object2);
                unsafe.putObject(obj, V, e14);
                object2 = e14;
            }
            p13.a(object2, object);
        }
    }

    public final void y(int i13, Object obj, Object obj2) {
        int[] iArr = this.f33614a;
        int i14 = iArr[i13];
        if (u(i14, obj2, i13)) {
            long V = V(i13) & 1048575;
            Unsafe unsafe = f33613o;
            Object object = unsafe.getObject(obj2, V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i13] + " is present but null: " + obj2);
            }
            q1 p13 = p(i13);
            if (!u(i14, obj, i13)) {
                if (t(object)) {
                    Object e13 = p13.e();
                    p13.a(e13, object);
                    unsafe.putObject(obj, V, e13);
                } else {
                    unsafe.putObject(obj, V, object);
                }
                Q(i14, obj, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, V);
            if (!t(object2)) {
                Object e14 = p13.e();
                p13.a(e14, object2);
                unsafe.putObject(obj, V, e14);
                object2 = e14;
            }
            p13.a(object2, object);
        }
    }

    public final Object z(int i13, Object obj) {
        q1 p13 = p(i13);
        long V = V(i13) & 1048575;
        if (!r(i13, obj)) {
            return p13.e();
        }
        Object object = f33613o.getObject(obj, V);
        if (t(object)) {
            return object;
        }
        Object e13 = p13.e();
        if (object != null) {
            p13.a(e13, object);
        }
        return e13;
    }
}
