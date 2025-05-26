package com.google.android.gms.internal.recaptcha;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import net.quikkly.android.utils.BitmapUtils;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class t0 implements a1 {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f31789i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final Unsafe f31790j = j1.g();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f31791a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f31792b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f31793c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31794d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31795e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f31796f;

    /* renamed from: g, reason: collision with root package name */
    public final e1 f31797g;

    /* renamed from: h, reason: collision with root package name */
    public final o0 f31798h;

    public t0(int[] iArr, Object[] objArr, r0 r0Var, int[] iArr2, int i13, int i14, h0 h0Var, e1 e1Var, w wVar, o0 o0Var) {
        this.f31791a = iArr;
        this.f31792b = objArr;
        boolean z13 = r0Var instanceof b0;
        this.f31793c = iArr2;
        this.f31794d = i13;
        this.f31795e = i14;
        this.f31796f = h0Var;
        this.f31797g = e1Var;
        this.f31798h = o0Var;
    }

    public static t0 d(q0 q0Var, h0 h0Var, e1 e1Var, w wVar, o0 o0Var) {
        int i13;
        int charAt;
        int charAt2;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        int i25;
        int i26;
        char charAt7;
        int i27;
        char charAt8;
        int i28;
        int i29;
        int i33;
        y0 y0Var;
        int i34;
        int i35;
        boolean z13;
        boolean z14;
        int i36;
        int i37;
        int i38;
        int i39;
        int i43;
        Field e13;
        int i44;
        char charAt9;
        int i45;
        int i46;
        Field e14;
        Field e15;
        int i47;
        char charAt10;
        int i48;
        char charAt11;
        int i49;
        char charAt12;
        int i53;
        char charAt13;
        if (!(q0Var instanceof y0)) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(q0Var);
            throw null;
        }
        y0 y0Var2 = (y0) q0Var;
        boolean z15 = y0Var2.a() == 2;
        String c13 = y0Var2.c();
        int length = c13.length();
        char c14 = 55296;
        if (c13.charAt(0) >= 55296) {
            int i54 = 1;
            while (true) {
                i13 = i54 + 1;
                if (c13.charAt(i54) < 55296) {
                    break;
                }
                i54 = i13;
            }
        } else {
            i13 = 1;
        }
        int i55 = i13 + 1;
        int charAt14 = c13.charAt(i13);
        if (charAt14 >= 55296) {
            int i56 = charAt14 & 8191;
            int i57 = 13;
            while (true) {
                i53 = i55 + 1;
                charAt13 = c13.charAt(i55);
                if (charAt13 < 55296) {
                    break;
                }
                i56 |= (charAt13 & 8191) << i57;
                i57 += 13;
                i55 = i53;
            }
            charAt14 = i56 | (charAt13 << i57);
            i55 = i53;
        }
        if (charAt14 == 0) {
            charAt = 0;
            charAt2 = 0;
            i15 = 0;
            i16 = 0;
            iArr = f31789i;
            i14 = 0;
        } else {
            int i58 = i55 + 1;
            int charAt15 = c13.charAt(i55);
            if (charAt15 >= 55296) {
                int i59 = charAt15 & 8191;
                int i63 = 13;
                while (true) {
                    i27 = i58 + 1;
                    charAt8 = c13.charAt(i58);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i59 |= (charAt8 & 8191) << i63;
                    i63 += 13;
                    i58 = i27;
                }
                charAt15 = i59 | (charAt8 << i63);
                i58 = i27;
            }
            int i64 = i58 + 1;
            int charAt16 = c13.charAt(i58);
            if (charAt16 >= 55296) {
                int i65 = charAt16 & 8191;
                int i66 = 13;
                while (true) {
                    i26 = i64 + 1;
                    charAt7 = c13.charAt(i64);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i65 |= (charAt7 & 8191) << i66;
                    i66 += 13;
                    i64 = i26;
                }
                charAt16 = i65 | (charAt7 << i66);
                i64 = i26;
            }
            int i67 = i64 + 1;
            if (c13.charAt(i64) >= 55296) {
                while (true) {
                    i25 = i67 + 1;
                    if (c13.charAt(i67) < 55296) {
                        break;
                    }
                    i67 = i25;
                }
                i67 = i25;
            }
            int i68 = i67 + 1;
            if (c13.charAt(i67) >= 55296) {
                while (true) {
                    i24 = i68 + 1;
                    if (c13.charAt(i68) < 55296) {
                        break;
                    }
                    i68 = i24;
                }
                i68 = i24;
            }
            int i69 = i68 + 1;
            charAt = c13.charAt(i68);
            if (charAt >= 55296) {
                int i73 = charAt & 8191;
                int i74 = 13;
                while (true) {
                    i23 = i69 + 1;
                    charAt6 = c13.charAt(i69);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i73 |= (charAt6 & 8191) << i74;
                    i74 += 13;
                    i69 = i23;
                }
                charAt = i73 | (charAt6 << i74);
                i69 = i23;
            }
            int i75 = i69 + 1;
            charAt2 = c13.charAt(i69);
            if (charAt2 >= 55296) {
                int i76 = charAt2 & 8191;
                int i77 = 13;
                while (true) {
                    i19 = i75 + 1;
                    charAt5 = c13.charAt(i75);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i76 |= (charAt5 & 8191) << i77;
                    i77 += 13;
                    i75 = i19;
                }
                charAt2 = i76 | (charAt5 << i77);
                i75 = i19;
            }
            int i78 = i75 + 1;
            int charAt17 = c13.charAt(i75);
            if (charAt17 >= 55296) {
                int i79 = charAt17 & 8191;
                int i83 = 13;
                while (true) {
                    i18 = i78 + 1;
                    charAt4 = c13.charAt(i78);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i79 |= (charAt4 & 8191) << i83;
                    i83 += 13;
                    i78 = i18;
                }
                charAt17 = i79 | (charAt4 << i83);
                i78 = i18;
            }
            int i84 = i78 + 1;
            int charAt18 = c13.charAt(i78);
            if (charAt18 >= 55296) {
                int i85 = charAt18 & 8191;
                int i86 = 13;
                while (true) {
                    i17 = i84 + 1;
                    charAt3 = c13.charAt(i84);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i85 |= (charAt3 & 8191) << i86;
                    i86 += 13;
                    i84 = i17;
                }
                charAt18 = i85 | (charAt3 << i86);
                i84 = i17;
            }
            int i87 = (charAt15 << 1) + charAt16;
            i14 = charAt15;
            i55 = i84;
            iArr = new int[charAt18 + charAt2 + charAt17];
            i15 = i87;
            i16 = charAt18;
        }
        Object[] d2 = y0Var2.d();
        Class<?> cls = y0Var2.b().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt << 1];
        int i88 = i16 + charAt2;
        int i89 = i16;
        int i93 = i88;
        int i94 = 0;
        int i95 = 0;
        while (i55 < length) {
            int i96 = i55 + 1;
            int charAt19 = c13.charAt(i55);
            if (charAt19 >= c14) {
                int i97 = charAt19 & 8191;
                int i98 = i96;
                int i99 = 13;
                while (true) {
                    i49 = i98 + 1;
                    charAt12 = c13.charAt(i98);
                    if (charAt12 < c14) {
                        break;
                    }
                    i97 |= (charAt12 & 8191) << i99;
                    i99 += 13;
                    i98 = i49;
                }
                charAt19 = i97 | (charAt12 << i99);
                i28 = i49;
            } else {
                i28 = i96;
            }
            int i100 = i28 + 1;
            int charAt20 = c13.charAt(i28);
            if (charAt20 >= c14) {
                int i101 = charAt20 & 8191;
                int i102 = i100;
                int i103 = 13;
                while (true) {
                    i48 = i102 + 1;
                    charAt11 = c13.charAt(i102);
                    i29 = length;
                    if (charAt11 < 55296) {
                        break;
                    }
                    i101 |= (charAt11 & 8191) << i103;
                    i103 += 13;
                    i102 = i48;
                    length = i29;
                }
                charAt20 = i101 | (charAt11 << i103);
                i33 = i48;
            } else {
                i29 = length;
                i33 = i100;
            }
            int i104 = charAt20 & 255;
            int i105 = i16;
            if ((charAt20 & 1024) != 0) {
                iArr[i94] = i95;
                i94++;
            }
            Unsafe unsafe = f31790j;
            int i106 = i94;
            if (i104 >= 51) {
                int i107 = i33 + 1;
                int charAt21 = c13.charAt(i33);
                if (charAt21 >= 55296) {
                    int i108 = charAt21 & 8191;
                    int i109 = i107;
                    int i110 = 13;
                    while (true) {
                        i47 = i109 + 1;
                        charAt10 = c13.charAt(i109);
                        y0Var = y0Var2;
                        if (charAt10 < 55296) {
                            break;
                        }
                        i108 |= (charAt10 & 8191) << i110;
                        i110 += 13;
                        i109 = i47;
                        y0Var2 = y0Var;
                    }
                    charAt21 = i108 | (charAt10 << i110);
                    i46 = i47;
                } else {
                    y0Var = y0Var2;
                    i46 = i107;
                }
                int i111 = i104 - 51;
                int i112 = i46;
                if (i111 == 9 || i111 == 17) {
                    objArr[((i95 / 3) << 1) + 1] = d2[i15];
                    i15++;
                } else if (i111 == 12 && !z15) {
                    objArr[((i95 / 3) << 1) + 1] = d2[i15];
                    i15++;
                }
                int i113 = charAt21 << 1;
                Object obj = d2[i113];
                if (obj instanceof Field) {
                    e14 = (Field) obj;
                } else {
                    e14 = e(cls, (String) obj);
                    d2[i113] = e14;
                }
                int i114 = i15;
                i43 = (int) unsafe.objectFieldOffset(e14);
                int i115 = i113 + 1;
                Object obj2 = d2[i115];
                if (obj2 instanceof Field) {
                    e15 = (Field) obj2;
                } else {
                    e15 = e(cls, (String) obj2);
                    d2[i115] = e15;
                }
                i36 = (int) unsafe.objectFieldOffset(e15);
                i15 = i114;
                z14 = true;
                z13 = z15;
                i39 = 0;
                i34 = charAt19;
                i55 = i112;
            } else {
                y0Var = y0Var2;
                int i116 = i15 + 1;
                Field e16 = e(cls, (String) d2[i15]);
                i34 = charAt19;
                if (i104 == 9 || i104 == 17) {
                    objArr[((i95 / 3) << 1) + 1] = e16.getType();
                } else {
                    if (i104 == 27 || i104 == 49) {
                        i45 = i15 + 2;
                        objArr[((i95 / 3) << 1) + 1] = d2[i116];
                    } else if (i104 == 12 || i104 == 30 || i104 == 44) {
                        if (!z15) {
                            i45 = i15 + 2;
                            objArr[((i95 / 3) << 1) + 1] = d2[i116];
                        }
                    } else if (i104 == 50) {
                        int i117 = i89 + 1;
                        iArr[i89] = i95;
                        int i118 = (i95 / 3) << 1;
                        int i119 = i15 + 2;
                        objArr[i118] = d2[i116];
                        if ((charAt20 & 2048) != 0) {
                            i116 = i15 + 3;
                            objArr[i118 + 1] = d2[i119];
                            i89 = i117;
                        } else {
                            i89 = i117;
                            i116 = i119;
                        }
                    }
                    i116 = i45;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(e16);
                if ((charAt20 & 4096) != 4096 || i104 > 17) {
                    i35 = i116;
                    z13 = z15;
                    z14 = true;
                    i36 = 1048575;
                    i37 = i33;
                    i38 = 0;
                } else {
                    i37 = i33 + 1;
                    int charAt22 = c13.charAt(i33);
                    if (charAt22 >= 55296) {
                        int i120 = charAt22 & 8191;
                        int i121 = 13;
                        while (true) {
                            i44 = i37 + 1;
                            charAt9 = c13.charAt(i37);
                            if (charAt9 < 55296) {
                                break;
                            }
                            i120 |= (charAt9 & 8191) << i121;
                            i121 += 13;
                            i37 = i44;
                        }
                        charAt22 = i120 | (charAt9 << i121);
                        i37 = i44;
                    }
                    z14 = true;
                    int i122 = (charAt22 / 32) + (i14 << 1);
                    Object obj3 = d2[i122];
                    i35 = i116;
                    if (obj3 instanceof Field) {
                        e13 = (Field) obj3;
                    } else {
                        e13 = e(cls, (String) obj3);
                        d2[i122] = e13;
                    }
                    z13 = z15;
                    i36 = (int) unsafe.objectFieldOffset(e13);
                    i38 = charAt22 % 32;
                }
                if (i104 >= 18 && i104 <= 49) {
                    iArr[i93] = objectFieldOffset;
                    i93++;
                }
                i39 = i38;
                i43 = objectFieldOffset;
                i55 = i37;
                i15 = i35;
            }
            int i123 = i95 + 1;
            iArr2[i95] = i34;
            int i124 = i95 + 2;
            String str = c13;
            iArr2[i123] = ((charAt20 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 536870912 : 0) | ((charAt20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 268435456 : 0) | (i104 << 20) | i43;
            i95 += 3;
            iArr2[i124] = i36 | (i39 << 20);
            i16 = i105;
            c13 = str;
            length = i29;
            z15 = z13;
            i94 = i106;
            y0Var2 = y0Var;
            c14 = 55296;
        }
        return new t0(iArr2, objArr, y0Var2.b(), iArr, i16, i88, h0Var, e1Var, wVar, o0Var);
    }

    public static Field e(Class cls, String str) {
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
            StringBuilder sb3 = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb3.append("Field ");
            sb3.append(str);
            sb3.append(" for ");
            sb3.append(name);
            throw new RuntimeException(a.a.p(sb3, " not found. Known fields are ", arrays));
        }
    }

    public static int m(long j13, Object obj) {
        return ((Integer) j1.k(obj, j13)).intValue();
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final boolean a(Object obj, Object obj2) {
        boolean c13;
        int[] iArr = this.f31791a;
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int l13 = l(i13);
            long j13 = l13 & 1048575;
            switch ((l13 & 267386880) >>> 20) {
                case 0:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var = j1.f31760d;
                        if (Double.doubleToLongBits(h1Var.i(j13, obj)) == Double.doubleToLongBits(h1Var.i(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var2 = j1.f31760d;
                        if (Float.floatToIntBits(h1Var2.h(j13, obj)) == Float.floatToIntBits(h1Var2.h(j13, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var3 = j1.f31760d;
                        if (h1Var3.k(j13, obj) == h1Var3.k(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var4 = j1.f31760d;
                        if (h1Var4.k(j13, obj) == h1Var4.k(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var5 = j1.f31760d;
                        if (h1Var5.j(j13, obj) == h1Var5.j(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var6 = j1.f31760d;
                        if (h1Var6.k(j13, obj) == h1Var6.k(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var7 = j1.f31760d;
                        if (h1Var7.j(j13, obj) == h1Var7.j(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var8 = j1.f31760d;
                        if (h1Var8.g(j13, obj) == h1Var8.g(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (k(i13, obj, obj2) && b1.c(j1.k(obj, j13), j1.k(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (k(i13, obj, obj2) && b1.c(j1.k(obj, j13), j1.k(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (k(i13, obj, obj2) && b1.c(j1.k(obj, j13), j1.k(obj2, j13))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var9 = j1.f31760d;
                        if (h1Var9.j(j13, obj) == h1Var9.j(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var10 = j1.f31760d;
                        if (h1Var10.j(j13, obj) == h1Var10.j(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var11 = j1.f31760d;
                        if (h1Var11.j(j13, obj) == h1Var11.j(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var12 = j1.f31760d;
                        if (h1Var12.k(j13, obj) == h1Var12.k(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var13 = j1.f31760d;
                        if (h1Var13.j(j13, obj) == h1Var13.j(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (k(i13, obj, obj2)) {
                        h1 h1Var14 = j1.f31760d;
                        if (h1Var14.k(j13, obj) == h1Var14.k(j13, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (k(i13, obj, obj2) && b1.c(j1.k(obj, j13), j1.k(obj2, j13))) {
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
                    c13 = b1.c(j1.k(obj, j13), j1.k(obj2, j13));
                    break;
                case 50:
                    c13 = b1.c(j1.k(obj, j13), j1.k(obj2, j13));
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
                    h1 h1Var15 = j1.f31760d;
                    if (h1Var15.j(j14, obj) == h1Var15.j(j14, obj2) && b1.c(j1.k(obj, j13), j1.k(obj2, j13))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!c13) {
                return false;
            }
        }
        this.f31797g.getClass();
        return ((b0) obj).zzb.equals(((b0) obj2).zzb);
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final void b(Object obj, Object obj2) {
        obj2.getClass();
        int i13 = 0;
        while (true) {
            int[] iArr = this.f31791a;
            if (i13 >= iArr.length) {
                b1.b(this.f31797g, obj, obj2);
                return;
            }
            int l13 = l(i13);
            long j13 = l13 & 1048575;
            int i14 = iArr[i13];
            switch ((l13 & 267386880) >>> 20) {
                case 0:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var = j1.f31760d;
                        h1Var.e(obj, j13, h1Var.i(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 1:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var2 = j1.f31760d;
                        h1Var2.f(obj, j13, h1Var2.h(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 2:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var3 = j1.f31760d;
                        h1Var3.c(j13, obj, h1Var3.k(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 3:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var4 = j1.f31760d;
                        h1Var4.c(j13, obj, h1Var4.k(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 4:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.c(j1.f31760d.j(j13, obj2), j13, obj);
                        i(i13, obj);
                        break;
                    }
                case 5:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var5 = j1.f31760d;
                        h1Var5.c(j13, obj, h1Var5.k(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 6:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.c(j1.f31760d.j(j13, obj2), j13, obj);
                        i(i13, obj);
                        break;
                    }
                case 7:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var6 = j1.f31760d;
                        h1Var6.d(j13, obj, h1Var6.g(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 8:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.d(j13, obj, j1.k(obj2, j13));
                        i(i13, obj);
                        break;
                    }
                case 9:
                    f(obj, obj2, i13);
                    break;
                case 10:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.d(j13, obj, j1.k(obj2, j13));
                        i(i13, obj);
                        break;
                    }
                case 11:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.c(j1.f31760d.j(j13, obj2), j13, obj);
                        i(i13, obj);
                        break;
                    }
                case 12:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.c(j1.f31760d.j(j13, obj2), j13, obj);
                        i(i13, obj);
                        break;
                    }
                case 13:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.c(j1.f31760d.j(j13, obj2), j13, obj);
                        i(i13, obj);
                        break;
                    }
                case 14:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var7 = j1.f31760d;
                        h1Var7.c(j13, obj, h1Var7.k(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 15:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        j1.c(j1.f31760d.j(j13, obj2), j13, obj);
                        i(i13, obj);
                        break;
                    }
                case 16:
                    if (!g(i13, obj2)) {
                        break;
                    } else {
                        h1 h1Var8 = j1.f31760d;
                        h1Var8.c(j13, obj, h1Var8.k(j13, obj2));
                        i(i13, obj);
                        break;
                    }
                case 17:
                    f(obj, obj2, i13);
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
                    this.f31796f.a(j13, obj, obj2);
                    break;
                case 50:
                    Class cls = b1.f31735a;
                    Object k13 = j1.k(obj, j13);
                    Object k14 = j1.k(obj2, j13);
                    this.f31798h.getClass();
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(k13);
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(k14);
                    throw null;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!h(i14, obj2, i13)) {
                        break;
                    } else {
                        j1.d(j13, obj, j1.k(obj2, j13));
                        j1.c(i14, iArr[i13 + 2] & 1048575, obj);
                        break;
                    }
                case 60:
                    j(i13, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!h(i14, obj2, i13)) {
                        break;
                    } else {
                        j1.d(j13, obj, j1.k(obj2, j13));
                        j1.c(i14, iArr[i13 + 2] & 1048575, obj);
                        break;
                    }
                case 68:
                    j(i13, obj, obj2);
                    break;
            }
            i13 += 3;
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.a1
    public final void c(b0 b0Var) {
        int i13 = this.f31794d;
        while (true) {
            int[] iArr = this.f31793c;
            int i14 = this.f31795e;
            if (i13 >= i14) {
                int length = iArr.length;
                while (i14 < length) {
                    this.f31796f.b(iArr[i14], b0Var);
                    i14++;
                }
                this.f31797g.getClass();
                b0Var.zzb.getClass();
                return;
            }
            Object k13 = j1.k(b0Var, l(iArr[i13]) & 1048575);
            if (k13 != null) {
                this.f31798h.getClass();
                a.c.t(k13);
                throw null;
            }
            i13++;
        }
    }

    public final void f(Object obj, Object obj2, int i13) {
        b0 b0Var;
        long l13 = l(i13) & 1048575;
        if (g(i13, obj2)) {
            Object k13 = j1.k(obj, l13);
            Object k14 = j1.k(obj2, l13);
            if (k13 == null || k14 == null) {
                if (k14 != null) {
                    j1.d(l13, obj, k14);
                    i(i13, obj);
                    return;
                }
                return;
            }
            Charset charset = d0.f31745a;
            b0 b0Var2 = (b0) ((r0) k13);
            z zVar = (z) b0Var2.b(5);
            zVar.b(b0Var2);
            z a13 = zVar.a((r0) k14);
            if (a13.f31813c) {
                b0Var = a13.f31812b;
            } else {
                b0 b0Var3 = a13.f31812b;
                z0.f31814c.b(b0Var3).c(b0Var3);
                a13.f31813c = true;
                b0Var = a13.f31812b;
            }
            j1.d(l13, obj, b0Var);
            i(i13, obj);
        }
    }

    public final boolean g(int i13, Object obj) {
        int i14 = this.f31791a[i13 + 2];
        long j13 = i14 & 1048575;
        if (j13 != 1048575) {
            return ((1 << (i14 >>> 20)) & j1.f31760d.j(j13, obj)) != 0;
        }
        int l13 = l(i13);
        long j14 = l13 & 1048575;
        switch ((l13 & 267386880) >>> 20) {
            case 0:
                return j1.f31760d.i(j14, obj) != 0.0d;
            case 1:
                return j1.f31760d.h(j14, obj) != 0.0f;
            case 2:
                return j1.f31760d.k(j14, obj) != 0;
            case 3:
                return j1.f31760d.k(j14, obj) != 0;
            case 4:
                return j1.f31760d.j(j14, obj) != 0;
            case 5:
                return j1.f31760d.k(j14, obj) != 0;
            case 6:
                return j1.f31760d.j(j14, obj) != 0;
            case 7:
                return j1.f31760d.g(j14, obj);
            case 8:
                Object k13 = j1.k(obj, j14);
                if (k13 instanceof String) {
                    return !((String) k13).isEmpty();
                }
                if (k13 instanceof u) {
                    return !u.f31799b.equals(k13);
                }
                throw new IllegalArgumentException();
            case 9:
                return j1.k(obj, j14) != null;
            case 10:
                return !u.f31799b.equals(j1.k(obj, j14));
            case 11:
                return j1.f31760d.j(j14, obj) != 0;
            case 12:
                return j1.f31760d.j(j14, obj) != 0;
            case 13:
                return j1.f31760d.j(j14, obj) != 0;
            case 14:
                return j1.f31760d.k(j14, obj) != 0;
            case 15:
                return j1.f31760d.j(j14, obj) != 0;
            case 16:
                return j1.f31760d.k(j14, obj) != 0;
            case 17:
                return j1.k(obj, j14) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean h(int i13, Object obj, int i14) {
        return j1.f31760d.j((long) (this.f31791a[i14 + 2] & 1048575), obj) == i13;
    }

    public final void i(int i13, Object obj) {
        int i14 = this.f31791a[i13 + 2];
        long j13 = 1048575 & i14;
        if (j13 == 1048575) {
            return;
        }
        j1.c((1 << (i14 >>> 20)) | j1.f31760d.j(j13, obj), j13, obj);
    }

    public final void j(int i13, Object obj, Object obj2) {
        b0 b0Var;
        int l13 = l(i13);
        int i14 = this.f31791a[i13];
        long j13 = l13 & 1048575;
        if (h(i14, obj2, i13)) {
            Object k13 = j1.k(obj, j13);
            Object k14 = j1.k(obj2, j13);
            if (k13 == null || k14 == null) {
                if (k14 != null) {
                    j1.d(j13, obj, k14);
                    j1.c(i14, r1[i13 + 2] & 1048575, obj);
                    return;
                }
                return;
            }
            Charset charset = d0.f31745a;
            b0 b0Var2 = (b0) ((r0) k13);
            z zVar = (z) b0Var2.b(5);
            zVar.b(b0Var2);
            z a13 = zVar.a((r0) k14);
            if (a13.f31813c) {
                b0Var = a13.f31812b;
            } else {
                b0 b0Var3 = a13.f31812b;
                z0.f31814c.b(b0Var3).c(b0Var3);
                a13.f31813c = true;
                b0Var = a13.f31812b;
            }
            j1.d(j13, obj, b0Var);
            j1.c(i14, r1[i13 + 2] & 1048575, obj);
        }
    }

    public final boolean k(int i13, Object obj, Object obj2) {
        return g(i13, obj) == g(i13, obj2);
    }

    public final int l(int i13) {
        return this.f31791a[i13 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x021c, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.android.gms.internal.recaptcha.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.t0.zza(java.lang.Object):int");
    }
}
