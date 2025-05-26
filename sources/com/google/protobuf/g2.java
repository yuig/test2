package com.google.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public abstract class g2 {

    /* renamed from: a */
    public static final com.bugsnag.android.repackaged.dslplatform.json.h f33897a = new com.bugsnag.android.repackaged.dslplatform.json.h(2);

    /* renamed from: b */
    public static final com.google.crypto.tink.shaded.protobuf.t1 f33898b = new com.google.crypto.tink.shaded.protobuf.t1(1);

    public static int A(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        o0 o0Var = (o0) v0Var;
        int I = I(bArr, i14, vVar);
        o0Var.d(p.b(vVar.f81884a));
        while (I < i15) {
            int I2 = I(bArr, I, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            I = I(bArr, I2, vVar);
            o0Var.d(p.b(vVar.f81884a));
        }
        return I;
    }

    public static int B(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        d1 d1Var = (d1) v0Var;
        int K = K(bArr, i14, vVar);
        d1Var.d(p.c(vVar.f81885b));
        while (K < i15) {
            int I = I(bArr, K, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            K = K(bArr, I, vVar);
            d1Var.d(p.c(vVar.f81885b));
        }
        return K;
    }

    public static int C(byte[] bArr, int i13, l7.v vVar) {
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i14 == 0) {
            vVar.f81886c = "";
            return I;
        }
        vVar.f81886c = new String(bArr, I, i14, w0.f34008a);
        return I + i14;
    }

    public static int D(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        int I = I(bArr, i14, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i16 == 0) {
            v0Var.add("");
        } else {
            v0Var.add(new String(bArr, I, i16, w0.f34008a));
            I += i16;
        }
        while (I < i15) {
            int I2 = I(bArr, I, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            I = I(bArr, I2, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i17 == 0) {
                v0Var.add("");
            } else {
                v0Var.add(new String(bArr, I, i17, w0.f34008a));
                I += i17;
            }
        }
        return I;
    }

    public static int E(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        int I = I(bArr, i14, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i16 == 0) {
            v0Var.add("");
        } else {
            int i17 = I + i16;
            if (t2.f33999a.L0(I, i17, bArr) != 0) {
                throw InvalidProtocolBufferException.b();
            }
            v0Var.add(new String(bArr, I, i16, w0.f34008a));
            I = i17;
        }
        while (I < i15) {
            int I2 = I(bArr, I, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            I = I(bArr, I2, vVar);
            int i18 = vVar.f81884a;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i18 == 0) {
                v0Var.add("");
            } else {
                int i19 = I + i18;
                if (t2.f33999a.L0(I, i19, bArr) != 0) {
                    throw InvalidProtocolBufferException.b();
                }
                v0Var.add(new String(bArr, I, i18, w0.f34008a));
                I = i19;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i13, l7.v vVar) {
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i14 == 0) {
            vVar.f81886c = "";
            return I;
        }
        vVar.f81886c = t2.f33999a.J0(bArr, I, i14);
        return I + i14;
    }

    public static int G(int i13, byte[] bArr, int i14, int i15, j2 j2Var, l7.v vVar) {
        if ((i13 >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int K = K(bArr, i14, vVar);
            j2Var.f(i13, Long.valueOf(vVar.f81885b));
            return K;
        }
        if (i16 == 1) {
            j2Var.f(i13, Long.valueOf(l(i14, bArr)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int I = I(bArr, i14, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i17 > bArr.length - I) {
                throw InvalidProtocolBufferException.g();
            }
            if (i17 == 0) {
                j2Var.f(i13, l.f33922b);
            } else {
                j2Var.f(i13, l.d(bArr, I, i17));
            }
            return I + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            j2Var.f(i13, Integer.valueOf(j(i14, bArr)));
            return i14 + 4;
        }
        j2 j2Var2 = new j2();
        int i18 = (i13 & (-8)) | 4;
        int i19 = 0;
        while (true) {
            if (i14 >= i15) {
                break;
            }
            int I2 = I(bArr, i14, vVar);
            int i23 = vVar.f81884a;
            if (i23 == i18) {
                i19 = i23;
                i14 = I2;
                break;
            }
            i19 = i23;
            i14 = G(i23, bArr, I2, i15, j2Var2, vVar);
        }
        if (i14 > i15 || i19 != i18) {
            throw InvalidProtocolBufferException.f();
        }
        j2Var.f(i13, j2Var2);
        return i14;
    }

    public static int H(int i13, byte[] bArr, int i14, l7.v vVar) {
        int i15 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = i14 + 1;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            vVar.f81884a = i15 | (b13 << 7);
            return i16;
        }
        int i17 = i15 | ((b13 & Byte.MAX_VALUE) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i16];
        if (b14 >= 0) {
            vVar.f81884a = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & Byte.MAX_VALUE) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            vVar.f81884a = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & Byte.MAX_VALUE) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            vVar.f81884a = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                vVar.f81884a = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    public static int I(byte[] bArr, int i13, l7.v vVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return H(b13, bArr, i14, vVar);
        }
        vVar.f81884a = b13;
        return i14;
    }

    public static int J(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        o0 o0Var = (o0) v0Var;
        int I = I(bArr, i14, vVar);
        o0Var.d(vVar.f81884a);
        while (I < i15) {
            int I2 = I(bArr, I, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            I = I(bArr, I2, vVar);
            o0Var.d(vVar.f81884a);
        }
        return I;
    }

    public static int K(byte[] bArr, int i13, l7.v vVar) {
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        if (j13 >= 0) {
            vVar.f81885b = j13;
            return i14;
        }
        int i15 = i13 + 2;
        byte b13 = bArr[i14];
        long j14 = (j13 & 127) | ((b13 & Byte.MAX_VALUE) << 7);
        int i16 = 7;
        while (b13 < 0) {
            int i17 = i15 + 1;
            i16 += 7;
            j14 |= (r10 & Byte.MAX_VALUE) << i16;
            b13 = bArr[i15];
            i15 = i17;
        }
        vVar.f81885b = j14;
        return i15;
    }

    public static int L(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        d1 d1Var = (d1) v0Var;
        int K = K(bArr, i14, vVar);
        d1Var.d(vVar.f81885b);
        while (K < i15) {
            int I = I(bArr, K, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            K = K(bArr, I, vVar);
            d1Var.d(vVar.f81885b);
        }
        return K;
    }

    public static String M(l lVar) {
        StringBuilder sb3 = new StringBuilder(lVar.size());
        for (int i13 = 0; i13 < lVar.size(); i13++) {
            byte b13 = lVar.b(i13);
            if (b13 == 34) {
                sb3.append("\\\"");
            } else if (b13 == 39) {
                sb3.append("\\'");
            } else if (b13 != 92) {
                switch (b13) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (b13 < 32 || b13 > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((b13 >>> 6) & 3) + 48));
                            sb3.append((char) (((b13 >>> 3) & 7) + 48));
                            sb3.append((char) ((b13 & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) b13);
                            break;
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }

    public static boolean N(byte b13) {
        return b13 > -65;
    }

    public static int O(Object obj, d2 d2Var, byte[] bArr, int i13, int i14, int i15, l7.v vVar) {
        int L = ((s1) d2Var).L(obj, bArr, i13, i14, i15, vVar);
        vVar.f81886c = obj;
        return L;
    }

    public static int P(Object obj, d2 d2Var, byte[] bArr, int i13, int i14, l7.v vVar) {
        int i15 = i13 + 1;
        int i16 = bArr[i13];
        if (i16 < 0) {
            i15 = H(i16, bArr, i15, vVar);
            i16 = vVar.f81884a;
        }
        int i17 = i15;
        if (i16 < 0 || i16 > i14 - i17) {
            throw InvalidProtocolBufferException.g();
        }
        int i18 = i16 + i17;
        d2Var.j(obj, bArr, i17, i18, vVar);
        vVar.f81886c = obj;
        return i18;
    }

    public static int Q(int i13, byte[] bArr, int i14, int i15, l7.v vVar) {
        if ((i13 >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            return K(bArr, i14, vVar);
        }
        if (i16 == 1) {
            return i14 + 8;
        }
        if (i16 == 2) {
            return I(bArr, i14, vVar) + vVar.f81884a;
        }
        if (i16 != 3) {
            if (i16 == 5) {
                return i14 + 4;
            }
            throw InvalidProtocolBufferException.a();
        }
        int i17 = (i13 & (-8)) | 4;
        int i18 = 0;
        while (i14 < i15) {
            i14 = I(bArr, i14, vVar);
            i18 = vVar.f81884a;
            if (i18 == i17) {
                break;
            }
            i14 = Q(i18, bArr, i14, i15, vVar);
        }
        if (i14 > i15 || i18 != i17) {
            throw InvalidProtocolBufferException.f();
        }
        return i14;
    }

    public static void a(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) {
        if (!N(b14)) {
            if ((((b14 + 112) + (b13 << 28)) >> 30) == 0 && !N(b15) && !N(b16)) {
                int i14 = ((b13 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
                cArr[i13] = (char) ((i14 >>> 10) + 55232);
                cArr[i13 + 1] = (char) ((i14 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public static boolean b(byte b13) {
        return b13 >= 0;
    }

    public static void c(byte b13, byte b14, char[] cArr, int i13) {
        if (b13 < -62 || N(b14)) {
            throw InvalidProtocolBufferException.b();
        }
        cArr[i13] = (char) (((b13 & 31) << 6) | (b14 & 63));
    }

    public static void d(byte b13, byte b14, byte b15, char[] cArr, int i13) {
        if (N(b14) || ((b13 == -32 && b14 < -96) || ((b13 == -19 && b14 >= -96) || N(b15)))) {
            throw InvalidProtocolBufferException.b();
        }
        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
    }

    public static int e(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        e eVar = (e) v0Var;
        int K = K(bArr, i14, vVar);
        eVar.d(vVar.f81885b != 0);
        while (K < i15) {
            int I = I(bArr, K, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            K = K(bArr, I, vVar);
            eVar.d(vVar.f81885b != 0);
        }
        return K;
    }

    public static int f(byte[] bArr, int i13, l7.v vVar) {
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i14 > bArr.length - I) {
            throw InvalidProtocolBufferException.g();
        }
        if (i14 == 0) {
            vVar.f81886c = l.f33922b;
            return I;
        }
        vVar.f81886c = l.d(bArr, I, i14);
        return I + i14;
    }

    public static int g(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        int I = I(bArr, i14, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i16 > bArr.length - I) {
            throw InvalidProtocolBufferException.g();
        }
        if (i16 == 0) {
            v0Var.add(l.f33922b);
        } else {
            v0Var.add(l.d(bArr, I, i16));
            I += i16;
        }
        while (I < i15) {
            int I2 = I(bArr, I, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            I = I(bArr, I2, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i17 > bArr.length - I) {
                throw InvalidProtocolBufferException.g();
            }
            if (i17 == 0) {
                v0Var.add(l.f33922b);
            } else {
                v0Var.add(l.d(bArr, I, i17));
                I += i17;
            }
        }
        return I;
    }

    public static double h(int i13, byte[] bArr) {
        return Double.longBitsToDouble(l(i13, bArr));
    }

    public static int i(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        v vVar2 = (v) v0Var;
        vVar2.d(h(i14, bArr));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int I = I(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            vVar2.d(Double.longBitsToDouble(l(I, bArr)));
            i16 = I + 8;
        }
        return i16;
    }

    public static int j(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public static int k(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        o0 o0Var = (o0) v0Var;
        o0Var.d(j(i14, bArr));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int I = I(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            o0Var.d(j(I, bArr));
            i16 = I + 4;
        }
        return i16;
    }

    public static long l(int i13, byte[] bArr) {
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public static int m(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        d1 d1Var = (d1) v0Var;
        d1Var.d(l(i14, bArr));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int I = I(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            d1Var.d(l(I, bArr));
            i16 = I + 8;
        }
        return i16;
    }

    public static float n(int i13, byte[] bArr) {
        return Float.intBitsToFloat(j(i13, bArr));
    }

    public static int o(int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        g0 g0Var = (g0) v0Var;
        g0Var.d(n(i14, bArr));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int I = I(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            g0Var.d(Float.intBitsToFloat(j(I, bArr)));
            i16 = I + 4;
        }
        return i16;
    }

    public static int p(d2 d2Var, int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        int i16 = (i13 & (-8)) | 4;
        Object e13 = d2Var.e();
        int O = O(e13, d2Var, bArr, i14, i15, i16, vVar);
        d2Var.b(e13);
        vVar.f81886c = e13;
        v0Var.add(e13);
        while (O < i15) {
            int I = I(bArr, O, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            Object e14 = d2Var.e();
            int O2 = O(e14, d2Var, bArr, I, i15, i16, vVar);
            d2Var.b(e14);
            vVar.f81886c = e14;
            v0Var.add(e14);
            O = O2;
        }
        return O;
    }

    public static int q(d2 d2Var, int i13, byte[] bArr, int i14, int i15, v0 v0Var, l7.v vVar) {
        Object e13 = d2Var.e();
        int P = P(e13, d2Var, bArr, i14, i15, vVar);
        d2Var.b(e13);
        vVar.f81886c = e13;
        v0Var.add(e13);
        while (P < i15) {
            int I = I(bArr, P, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            Object e14 = d2Var.e();
            int P2 = P(e14, d2Var, bArr, I, i15, vVar);
            d2Var.b(e14);
            vVar.f81886c = e14;
            v0Var.add(e14);
            P = P2;
        }
        return P;
    }

    public static int r(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        e eVar = (e) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            I = K(bArr, I, vVar);
            eVar.d(vVar.f81885b != 0);
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int s(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        v vVar2 = (v) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            vVar2.d(Double.longBitsToDouble(l(I, bArr)));
            I += 8;
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int t(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        o0 o0Var = (o0) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            o0Var.d(j(I, bArr));
            I += 4;
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int u(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        d1 d1Var = (d1) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            d1Var.d(l(I, bArr));
            I += 8;
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int v(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        g0 g0Var = (g0) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            g0Var.d(Float.intBitsToFloat(j(I, bArr)));
            I += 4;
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int w(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        o0 o0Var = (o0) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            I = I(bArr, I, vVar);
            o0Var.d(p.b(vVar.f81884a));
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int x(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        d1 d1Var = (d1) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            I = K(bArr, I, vVar);
            d1Var.d(p.c(vVar.f81885b));
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int y(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        o0 o0Var = (o0) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            I = I(bArr, I, vVar);
            o0Var.d(vVar.f81884a);
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int z(byte[] bArr, int i13, v0 v0Var, l7.v vVar) {
        d1 d1Var = (d1) v0Var;
        int I = I(bArr, i13, vVar);
        int i14 = vVar.f81884a + I;
        while (I < i14) {
            I = K(bArr, I, vVar);
            d1Var.d(vVar.f81885b);
        }
        if (I == i14) {
            return I;
        }
        throw InvalidProtocolBufferException.g();
    }
}
