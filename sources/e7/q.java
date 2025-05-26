package e7;

import a7.o0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import pk.c1;
import pk.v2;
import pk.x0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f57591a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f57592b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f57593c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f57594d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i13, int i14, boolean[] zArr) {
        int i15 = i14 - i13;
        bf.b.t(i15 >= 0);
        if (i15 == 0) {
            return i14;
        }
        if (zArr[0]) {
            a(zArr);
            return i13 - 3;
        }
        if (i15 > 1 && zArr[1] && bArr[i13] == 1) {
            a(zArr);
            return i13 - 2;
        }
        if (i15 > 2 && zArr[2] && bArr[i13] == 0 && bArr[i13 + 1] == 1) {
            a(zArr);
            return i13 - 1;
        }
        int i16 = i14 - 1;
        int i17 = i13 + 2;
        while (i17 < i16) {
            byte b13 = bArr[i17];
            if ((b13 & 254) == 0) {
                int i18 = i17 - 2;
                if (bArr[i18] == 0 && bArr[i17 - 1] == 0 && b13 == 1) {
                    a(zArr);
                    return i18;
                }
                i17 -= 2;
            }
            i17 += 3;
        }
        zArr[0] = i15 <= 2 ? !(i15 != 2 ? !(zArr[1] && bArr[i16] == 1) : !(zArr[2] && bArr[i14 + (-2)] == 0 && bArr[i16] == 1)) : bArr[i14 + (-3)] == 0 && bArr[i14 + (-2)] == 0 && bArr[i16] == 1;
        zArr[1] = i15 <= 1 ? zArr[2] && bArr[i16] == 0 : bArr[i14 + (-2)] == 0 && bArr[i16] == 0;
        zArr[2] = bArr[i16] == 0;
        return i14;
    }

    public static String c(List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            byte[] bArr = (byte[]) list.get(i13);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                x0 n13 = c1.n();
                int i14 = 0;
                while (i14 < bArr.length) {
                    int b13 = b(bArr, i14, bArr.length, zArr);
                    if (b13 != bArr.length) {
                        n13.e(Integer.valueOf(b13));
                    }
                    i14 = b13 + 3;
                }
                v2 i15 = n13.i();
                for (int i16 = 0; i16 < i15.size(); i16++) {
                    if (((Integer) i15.get(i16)).intValue() + 3 < length) {
                        a7.m mVar = new a7.m(bArr, ((Integer) i15.get(i16)).intValue() + 3, length);
                        i g13 = g(mVar);
                        if (g13.f57538a == 33 && g13.f57539b == 0) {
                            mVar.l(4);
                            int f13 = mVar.f(3);
                            mVar.k();
                            j h10 = h(mVar, true, f13, null);
                            return d7.f.b(h10.f57541a, h10.f57543c, h10.f57544d, h10.f57546f, h10.f57542b, h10.f57545e);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean d(byte[] bArr, int i13, androidx.media3.common.b bVar) {
        int i14;
        if (Objects.equals(bVar.f18765o, "video/avc")) {
            byte b13 = bArr[4];
            return (((b13 & 96) >> 5) == 0 && ((i14 = b13 & 31) == 1 || i14 == 9 || i14 == 14)) ? false : true;
        }
        if (!Objects.equals(bVar.f18765o, "video/hevc")) {
            return true;
        }
        i g13 = g(new a7.m(bArr, 4, i13 + 4));
        int i15 = g13.f57538a;
        if (i15 == 35) {
            return false;
        }
        return (i15 <= 14 && i15 % 2 == 0 && g13.f57540c == bVar.D - 1) ? false : true;
    }

    public static boolean e(androidx.media3.common.b bVar, byte b13) {
        boolean equals = Objects.equals(bVar.f18765o, "video/avc");
        String str = bVar.f18761k;
        if ((equals || o0.c(str, "video/avc") != null) && (b13 & 31) == 6) {
            return true;
        }
        return (Objects.equals(bVar.f18765o, "video/hevc") || o0.c(str, "video/hevc") != null) && ((b13 & 126) >> 1) == 39;
    }

    public static int f(androidx.media3.common.b bVar) {
        if (Objects.equals(bVar.f18765o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(bVar.f18765o, "video/hevc") || o0.c(bVar.f18761k, "video/hevc") != null) ? 2 : 0;
    }

    public static i g(a7.m mVar) {
        mVar.k();
        int f13 = mVar.f(6);
        int f14 = mVar.f(6);
        int f15 = mVar.f(3) - 1;
        i iVar = new i();
        iVar.f57538a = f13;
        iVar.f57539b = f14;
        iVar.f57540c = f15;
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e7.j h(a7.m r19, boolean r20, int r21, e7.j r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.f(r5)
            boolean r8 = r19.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r19.e()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r18 = r4
            r17 = r8
            r14 = r9
            r15 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f57541a
            boolean r8 = r2.f57542b
            int r9 = r2.f57543c
            int r11 = r2.f57544d
            int[] r4 = r2.f57545e
            r13 = r3
            goto L3b
        L50:
            r18 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r17 = r15
        L57:
            int r16 = r0.f(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r19.e()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r19.e()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.l(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.l(r6)
        L7b:
            e7.j r0 = new e7.j
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.q.h(a7.m, boolean, int, e7.j):e7.j");
    }

    public static a10.e i(byte[] bArr, int i13, int i14) {
        byte b13;
        int i15 = i13 + 2;
        do {
            i14--;
            b13 = bArr[i14];
            if (b13 != 0) {
                break;
            }
        } while (i14 > i15);
        if (b13 != 0 && i14 > i15) {
            a7.m mVar = new a7.m(bArr, i15, i14 + 1);
            while (mVar.c(16)) {
                int f13 = mVar.f(8);
                int i16 = 0;
                while (f13 == 255) {
                    i16 += 255;
                    f13 = mVar.f(8);
                }
                int i17 = i16 + f13;
                int f14 = mVar.f(8);
                int i18 = 0;
                while (f14 == 255) {
                    i18 += 255;
                    f14 = mVar.f(8);
                }
                int i19 = i18 + f14;
                if (i19 == 0 || !mVar.c(i19)) {
                    break;
                }
                if (i17 == 176) {
                    int g13 = mVar.g();
                    boolean e13 = mVar.e();
                    int g14 = e13 ? mVar.g() : 0;
                    int g15 = mVar.g();
                    int i23 = -1;
                    for (int i24 = 0; i24 <= g15; i24++) {
                        i23 = mVar.g();
                        mVar.g();
                        int f15 = mVar.f(6);
                        if (f15 == 63) {
                            return null;
                        }
                        mVar.f(f15 == 0 ? Math.max(0, g13 - 30) : Math.max(0, (f15 + g13) - 31));
                        if (e13) {
                            int f16 = mVar.f(6);
                            if (f16 == 63) {
                                return null;
                            }
                            mVar.f(f16 == 0 ? Math.max(0, g14 - 30) : Math.max(0, (f16 + g14) - 31));
                        }
                        if (mVar.e()) {
                            mVar.l(10);
                        }
                    }
                    return new a10.e(i23);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e7.l j(byte[] r31, int r32, int r33, e7.n r34) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.q.j(byte[], int, int, e7.n):e7.l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:444:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e7.n k(byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.q.k(byte[], int, int):e7.n");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e7.p l(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.q.l(byte[], int, int):e7.p");
    }

    public static void m(a7.m mVar) {
        int g13 = mVar.g() + 1;
        mVar.l(8);
        for (int i13 = 0; i13 < g13; i13++) {
            mVar.g();
            mVar.g();
            mVar.k();
        }
        mVar.l(20);
    }

    public static int n(int i13, byte[] bArr) {
        int i14;
        synchronized (f57593c) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13) {
                while (true) {
                    if (i15 >= i13 - 2) {
                        i15 = i13;
                        break;
                    }
                    try {
                        if (bArr[i15] == 0 && bArr[i15 + 1] == 0 && bArr[i15 + 2] == 3) {
                            break;
                        }
                        i15++;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (i15 < i13) {
                    int[] iArr = f57594d;
                    if (iArr.length <= i16) {
                        f57594d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f57594d[i16] = i15;
                    i15 += 3;
                    i16++;
                }
            }
            i14 = i13 - i16;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                int i23 = f57594d[i19] - i18;
                System.arraycopy(bArr, i18, bArr, i17, i23);
                int i24 = i17 + i23;
                int i25 = i24 + 1;
                bArr[i24] = 0;
                i17 = i24 + 2;
                bArr[i25] = 0;
                i18 += i23 + 3;
            }
            System.arraycopy(bArr, i18, bArr, i17, i14 - i17);
        }
        return i14;
    }
}
