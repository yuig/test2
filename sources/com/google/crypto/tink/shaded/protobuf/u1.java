package com.google.crypto.tink.shaded.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.bugsnag.android.repackaged.dslplatform.json.h f33698a = new com.bugsnag.android.repackaged.dslplatform.json.h(1);

    public static int A(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        int E = E(bArr, i14, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i16 == 0) {
            k0Var.add("");
        } else {
            int i17 = E + i16;
            if (g2.f33630a.R(E, i17, bArr) != 0) {
                throw InvalidProtocolBufferException.b();
            }
            k0Var.add(new String(bArr, E, i16, l0.f33646a));
            E = i17;
        }
        while (E < i15) {
            int E2 = E(bArr, E, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            E = E(bArr, E2, vVar);
            int i18 = vVar.f81884a;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i18 == 0) {
                k0Var.add("");
            } else {
                int i19 = E + i18;
                if (g2.f33630a.R(E, i19, bArr) != 0) {
                    throw InvalidProtocolBufferException.b();
                }
                k0Var.add(new String(bArr, E, i18, l0.f33646a));
                E = i19;
            }
        }
        return E;
    }

    public static int B(byte[] bArr, int i13, l7.v vVar) {
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i14 == 0) {
            vVar.f81886c = "";
            return E;
        }
        vVar.f81886c = g2.f33630a.P(bArr, E, i14);
        return E + i14;
    }

    public static int C(int i13, byte[] bArr, int i14, int i15, w1 w1Var, l7.v vVar) {
        if ((i13 >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i16 = i13 & 7;
        if (i16 == 0) {
            int G = G(bArr, i14, vVar);
            w1Var.d(i13, Long.valueOf(vVar.f81885b));
            return G;
        }
        if (i16 == 1) {
            w1Var.d(i13, Long.valueOf(h(i14, bArr)));
            return i14 + 8;
        }
        if (i16 == 2) {
            int E = E(bArr, i14, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i17 > bArr.length - E) {
                throw InvalidProtocolBufferException.g();
            }
            if (i17 == 0) {
                w1Var.d(i13, k.f33636b);
            } else {
                w1Var.d(i13, k.d(bArr, E, i17));
            }
            return E + i17;
        }
        if (i16 != 3) {
            if (i16 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            w1Var.d(i13, Integer.valueOf(f(i14, bArr)));
            return i14 + 4;
        }
        w1 c13 = w1.c();
        int i18 = (i13 & (-8)) | 4;
        int i19 = 0;
        while (true) {
            if (i14 >= i15) {
                break;
            }
            int E2 = E(bArr, i14, vVar);
            int i23 = vVar.f81884a;
            if (i23 == i18) {
                i19 = i23;
                i14 = E2;
                break;
            }
            i19 = i23;
            i14 = C(i23, bArr, E2, i15, c13, vVar);
        }
        if (i14 > i15 || i19 != i18) {
            throw InvalidProtocolBufferException.f();
        }
        w1Var.d(i13, c13);
        return i14;
    }

    public static int D(int i13, byte[] bArr, int i14, l7.v vVar) {
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

    public static int E(byte[] bArr, int i13, l7.v vVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return D(b13, bArr, i14, vVar);
        }
        vVar.f81884a = b13;
        return i14;
    }

    public static int F(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        g0 g0Var = (g0) k0Var;
        int E = E(bArr, i14, vVar);
        g0Var.d(vVar.f81884a);
        while (E < i15) {
            int E2 = E(bArr, E, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            E = E(bArr, E2, vVar);
            g0Var.d(vVar.f81884a);
        }
        return E;
    }

    public static int G(byte[] bArr, int i13, l7.v vVar) {
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

    public static int H(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        s0 s0Var = (s0) k0Var;
        int G = G(bArr, i14, vVar);
        s0Var.d(vVar.f81885b);
        while (G < i15) {
            int E = E(bArr, G, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            G = G(bArr, E, vVar);
            s0Var.d(vVar.f81885b);
        }
        return G;
    }

    public static String I(k kVar) {
        StringBuilder sb3 = new StringBuilder(kVar.size());
        for (int i13 = 0; i13 < kVar.size(); i13++) {
            byte b13 = kVar.b(i13);
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

    public static int J(int i13) {
        return i13 >>> 3;
    }

    public static int K(int i13) {
        return i13 & 7;
    }

    public static boolean L(byte b13) {
        return b13 > -65;
    }

    public static int M(Object obj, q1 q1Var, byte[] bArr, int i13, int i14, int i15, l7.v vVar) {
        int H = ((f1) q1Var).H(obj, bArr, i13, i14, i15, vVar);
        vVar.f81886c = obj;
        return H;
    }

    public static int N(Object obj, q1 q1Var, byte[] bArr, int i13, int i14, l7.v vVar) {
        int i15 = i13 + 1;
        int i16 = bArr[i13];
        if (i16 < 0) {
            i15 = D(i16, bArr, i15, vVar);
            i16 = vVar.f81884a;
        }
        int i17 = i15;
        if (i16 < 0 || i16 > i14 - i17) {
            throw InvalidProtocolBufferException.g();
        }
        int i18 = i16 + i17;
        q1Var.i(obj, bArr, i17, i18, vVar);
        vVar.f81886c = obj;
        return i18;
    }

    public static int a(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        e eVar = (e) k0Var;
        int G = G(bArr, i14, vVar);
        eVar.d(vVar.f81885b != 0);
        while (G < i15) {
            int E = E(bArr, G, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            G = G(bArr, E, vVar);
            eVar.d(vVar.f81885b != 0);
        }
        return G;
    }

    public static int b(byte[] bArr, int i13, l7.v vVar) {
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i14 > bArr.length - E) {
            throw InvalidProtocolBufferException.g();
        }
        if (i14 == 0) {
            vVar.f81886c = k.f33636b;
            return E;
        }
        vVar.f81886c = k.d(bArr, E, i14);
        return E + i14;
    }

    public static int c(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        int E = E(bArr, i14, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i16 > bArr.length - E) {
            throw InvalidProtocolBufferException.g();
        }
        if (i16 == 0) {
            k0Var.add(k.f33636b);
        } else {
            k0Var.add(k.d(bArr, E, i16));
            E += i16;
        }
        while (E < i15) {
            int E2 = E(bArr, E, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            E = E(bArr, E2, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i17 > bArr.length - E) {
                throw InvalidProtocolBufferException.g();
            }
            if (i17 == 0) {
                k0Var.add(k.f33636b);
            } else {
                k0Var.add(k.d(bArr, E, i17));
                E += i17;
            }
        }
        return E;
    }

    public static double d(int i13, byte[] bArr) {
        return Double.longBitsToDouble(h(i13, bArr));
    }

    public static int e(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        s sVar = (s) k0Var;
        sVar.d(d(i14, bArr));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int E = E(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            sVar.d(Double.longBitsToDouble(h(E, bArr)));
            i16 = E + 8;
        }
        return i16;
    }

    public static int f(int i13, byte[] bArr) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    public static int g(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        g0 g0Var = (g0) k0Var;
        g0Var.d(f(i14, bArr));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int E = E(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            g0Var.d(f(E, bArr));
            i16 = E + 4;
        }
        return i16;
    }

    public static long h(int i13, byte[] bArr) {
        return ((bArr[i13 + 7] & 255) << 56) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 4] & 255) << 32) | ((bArr[i13 + 5] & 255) << 40) | ((bArr[i13 + 6] & 255) << 48);
    }

    public static int i(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        s0 s0Var = (s0) k0Var;
        s0Var.d(h(i14, bArr));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int E = E(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            s0Var.d(h(E, bArr));
            i16 = E + 8;
        }
        return i16;
    }

    public static float j(int i13, byte[] bArr) {
        return Float.intBitsToFloat(f(i13, bArr));
    }

    public static int k(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        a0 a0Var = (a0) k0Var;
        a0Var.d(j(i14, bArr));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int E = E(bArr, i16, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            a0Var.d(Float.intBitsToFloat(f(E, bArr)));
            i16 = E + 4;
        }
        return i16;
    }

    public static int l(q1 q1Var, int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        int i16 = (i13 & (-8)) | 4;
        Object e13 = q1Var.e();
        int M = M(e13, q1Var, bArr, i14, i15, i16, vVar);
        q1Var.b(e13);
        vVar.f81886c = e13;
        k0Var.add(e13);
        while (M < i15) {
            int E = E(bArr, M, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            Object e14 = q1Var.e();
            int M2 = M(e14, q1Var, bArr, E, i15, i16, vVar);
            q1Var.b(e14);
            vVar.f81886c = e14;
            k0Var.add(e14);
            M = M2;
        }
        return M;
    }

    public static int m(q1 q1Var, int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        Object e13 = q1Var.e();
        int N = N(e13, q1Var, bArr, i14, i15, vVar);
        q1Var.b(e13);
        vVar.f81886c = e13;
        k0Var.add(e13);
        while (N < i15) {
            int E = E(bArr, N, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            Object e14 = q1Var.e();
            int N2 = N(e14, q1Var, bArr, E, i15, vVar);
            q1Var.b(e14);
            vVar.f81886c = e14;
            k0Var.add(e14);
            N = N2;
        }
        return N;
    }

    public static int n(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        e eVar = (e) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            E = G(bArr, E, vVar);
            eVar.d(vVar.f81885b != 0);
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int o(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        s sVar = (s) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            sVar.d(Double.longBitsToDouble(h(E, bArr)));
            E += 8;
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int p(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        g0 g0Var = (g0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            g0Var.d(f(E, bArr));
            E += 4;
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int q(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        s0 s0Var = (s0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            s0Var.d(h(E, bArr));
            E += 8;
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int r(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        a0 a0Var = (a0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            a0Var.d(Float.intBitsToFloat(f(E, bArr)));
            E += 4;
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int s(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        g0 g0Var = (g0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            E = E(bArr, E, vVar);
            g0Var.d(n.b(vVar.f81884a));
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int t(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        s0 s0Var = (s0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            E = G(bArr, E, vVar);
            s0Var.d(n.c(vVar.f81885b));
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int u(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        g0 g0Var = (g0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            E = E(bArr, E, vVar);
            g0Var.d(vVar.f81884a);
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int v(byte[] bArr, int i13, k0 k0Var, l7.v vVar) {
        s0 s0Var = (s0) k0Var;
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a + E;
        while (E < i14) {
            E = G(bArr, E, vVar);
            s0Var.d(vVar.f81885b);
        }
        if (E == i14) {
            return E;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int w(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        g0 g0Var = (g0) k0Var;
        int E = E(bArr, i14, vVar);
        g0Var.d(n.b(vVar.f81884a));
        while (E < i15) {
            int E2 = E(bArr, E, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            E = E(bArr, E2, vVar);
            g0Var.d(n.b(vVar.f81884a));
        }
        return E;
    }

    public static int x(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        s0 s0Var = (s0) k0Var;
        int G = G(bArr, i14, vVar);
        s0Var.d(n.c(vVar.f81885b));
        while (G < i15) {
            int E = E(bArr, G, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            G = G(bArr, E, vVar);
            s0Var.d(n.c(vVar.f81885b));
        }
        return G;
    }

    public static int y(byte[] bArr, int i13, l7.v vVar) {
        int E = E(bArr, i13, vVar);
        int i14 = vVar.f81884a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i14 == 0) {
            vVar.f81886c = "";
            return E;
        }
        vVar.f81886c = new String(bArr, E, i14, l0.f33646a);
        return E + i14;
    }

    public static int z(int i13, byte[] bArr, int i14, int i15, k0 k0Var, l7.v vVar) {
        int E = E(bArr, i14, vVar);
        int i16 = vVar.f81884a;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i16 == 0) {
            k0Var.add("");
        } else {
            k0Var.add(new String(bArr, E, i16, l0.f33646a));
            E += i16;
        }
        while (E < i15) {
            int E2 = E(bArr, E, vVar);
            if (i13 != vVar.f81884a) {
                break;
            }
            E = E(bArr, E2, vVar);
            int i17 = vVar.f81884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i17 == 0) {
                k0Var.add("");
            } else {
                k0Var.add(new String(bArr, E, i17, l0.f33646a));
                E += i17;
            }
        }
        return E;
    }

    public abstract void O(byte[] bArr, int i13, int i14);
}
