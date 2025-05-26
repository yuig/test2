package d9;

import a7.o0;
import d7.c0;
import d7.d0;
import d7.n0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import pk.c1;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public final class i extends dl2.b {

    /* renamed from: f, reason: collision with root package name */
    public static final a.e f54023f = new a.e(18);

    /* renamed from: e, reason: collision with root package name */
    public final g f54024e;

    public i(a.e eVar) {
        this.f54024e = eVar;
    }

    public static a d3(int i13, int i14, d0 d0Var) {
        int v33;
        String concat;
        int y13 = d0Var.y();
        Charset s33 = s3(y13);
        int i15 = i13 - 1;
        byte[] bArr = new byte[i15];
        d0Var.i(bArr, 0, i15);
        if (i14 == 2) {
            String str = "image/" + com.bumptech.glide.c.q1(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            concat = str;
            v33 = 2;
        } else {
            v33 = v3(0, bArr);
            String q13 = com.bumptech.glide.c.q1(new String(bArr, 0, v33, StandardCharsets.ISO_8859_1));
            concat = q13.indexOf(47) == -1 ? "image/".concat(q13) : q13;
        }
        int i16 = bArr[v33 + 1] & 255;
        int i17 = v33 + 2;
        int u33 = u3(bArr, i17, y13);
        String str2 = new String(bArr, i17, u33 - i17, s33);
        int r33 = r3(y13) + u33;
        return new a(i16, concat, str2, i15 <= r33 ? n0.f53868c : Arrays.copyOfRange(bArr, r33, i15));
    }

    public static c e3(d0 d0Var, int i13, int i14, boolean z13, int i15, g gVar) {
        int i16 = d0Var.f53807b;
        int v33 = v3(i16, d0Var.f53806a);
        String str = new String(d0Var.f53806a, i16, v33 - i16, StandardCharsets.ISO_8859_1);
        d0Var.K(v33 + 1);
        int k13 = d0Var.k();
        int k14 = d0Var.k();
        long A = d0Var.A();
        long j13 = A == 4294967295L ? -1L : A;
        long A2 = d0Var.A();
        long j14 = A2 == 4294967295L ? -1L : A2;
        ArrayList arrayList = new ArrayList();
        int i17 = i16 + i13;
        while (d0Var.f53807b < i17) {
            j h33 = h3(i14, d0Var, z13, i15, gVar);
            if (h33 != null) {
                arrayList.add(h33);
            }
        }
        return new c(str, k13, k14, j13, j14, (j[]) arrayList.toArray(new j[0]));
    }

    public static d f3(d0 d0Var, int i13, int i14, boolean z13, int i15, g gVar) {
        int i16 = d0Var.f53807b;
        int v33 = v3(i16, d0Var.f53806a);
        String str = new String(d0Var.f53806a, i16, v33 - i16, StandardCharsets.ISO_8859_1);
        d0Var.K(v33 + 1);
        int y13 = d0Var.y();
        boolean z14 = (y13 & 2) != 0;
        boolean z15 = (y13 & 1) != 0;
        int y14 = d0Var.y();
        String[] strArr = new String[y14];
        for (int i17 = 0; i17 < y14; i17++) {
            int i18 = d0Var.f53807b;
            int v34 = v3(i18, d0Var.f53806a);
            strArr[i17] = new String(d0Var.f53806a, i18, v34 - i18, StandardCharsets.ISO_8859_1);
            d0Var.K(v34 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i19 = i16 + i13;
        while (d0Var.f53807b < i19) {
            j h33 = h3(i14, d0Var, z13, i15, gVar);
            if (h33 != null) {
                arrayList.add(h33);
            }
        }
        return new d(str, z14, z15, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e g3(int i13, d0 d0Var) {
        if (i13 < 4) {
            return null;
        }
        int y13 = d0Var.y();
        Charset s33 = s3(y13);
        byte[] bArr = new byte[3];
        d0Var.i(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i14 = i13 - 4;
        byte[] bArr2 = new byte[i14];
        d0Var.i(bArr2, 0, i14);
        int u33 = u3(bArr2, 0, y13);
        String str2 = new String(bArr2, 0, u33, s33);
        int r33 = r3(y13) + u33;
        return new e(str, str2, l3(bArr2, r33, u3(bArr2, r33, y13), s33));
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01a3, code lost:
    
        if (r12 == 67) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r20 == 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r20 == 2) goto L49;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d9.j h3(int r20, d7.d0 r21, boolean r22, int r23, d9.g r24) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.i.h3(int, d7.d0, boolean, int, d9.g):d9.j");
    }

    public static f i3(int i13, d0 d0Var) {
        int y13 = d0Var.y();
        Charset s33 = s3(y13);
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        d0Var.i(bArr, 0, i14);
        int v33 = v3(0, bArr);
        String r13 = o0.r(new String(bArr, 0, v33, StandardCharsets.ISO_8859_1));
        int i15 = v33 + 1;
        int u33 = u3(bArr, i15, y13);
        String l33 = l3(bArr, i15, u33, s33);
        int r33 = r3(y13) + u33;
        int u34 = u3(bArr, r33, y13);
        String l34 = l3(bArr, r33, u34, s33);
        int r34 = r3(y13) + u34;
        return new f(r13, l33, l34, i14 <= r34 ? n0.f53868c : Arrays.copyOfRange(bArr, r34, i14));
    }

    public static m j3(int i13, d0 d0Var) {
        int E = d0Var.E();
        int B = d0Var.B();
        int B2 = d0Var.B();
        int y13 = d0Var.y();
        int y14 = d0Var.y();
        c0 c0Var = new c0();
        c0Var.l(d0Var);
        int i14 = ((i13 - 10) * 8) / (y13 + y14);
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int g13 = c0Var.g(y13);
            int g14 = c0Var.g(y14);
            iArr[i15] = g13;
            iArr2[i15] = g14;
        }
        return new m(E, B, B2, iArr, iArr2);
    }

    public static n k3(int i13, d0 d0Var) {
        byte[] bArr = new byte[i13];
        d0Var.i(bArr, 0, i13);
        int v33 = v3(0, bArr);
        String str = new String(bArr, 0, v33, StandardCharsets.ISO_8859_1);
        int i14 = v33 + 1;
        return new n(str, i13 <= i14 ? n0.f53868c : Arrays.copyOfRange(bArr, i14, i13));
    }

    public static String l3(byte[] bArr, int i13, int i14, Charset charset) {
        return (i14 <= i13 || i14 > bArr.length) ? "" : new String(bArr, i13, i14 - i13, charset);
    }

    public static o m3(int i13, d0 d0Var, String str) {
        if (i13 < 1) {
            return null;
        }
        int y13 = d0Var.y();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        d0Var.i(bArr, 0, i14);
        return new o(str, null, n3(bArr, y13, 0));
    }

    public static v2 n3(byte[] bArr, int i13, int i14) {
        if (i14 >= bArr.length) {
            return c1.v("");
        }
        x0 n13 = c1.n();
        int u33 = u3(bArr, i14, i13);
        while (i14 < u33) {
            n13.e(new String(bArr, i14, u33 - i14, s3(i13)));
            i14 = r3(i13) + u33;
            u33 = u3(bArr, i14, i13);
        }
        v2 i15 = n13.i();
        return i15.isEmpty() ? c1.v("") : i15;
    }

    public static o o3(int i13, d0 d0Var) {
        if (i13 < 1) {
            return null;
        }
        int y13 = d0Var.y();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        d0Var.i(bArr, 0, i14);
        int u33 = u3(bArr, 0, y13);
        return new o("TXXX", new String(bArr, 0, u33, s3(y13)), n3(bArr, y13, r3(y13) + u33));
    }

    public static p p3(int i13, d0 d0Var, String str) {
        byte[] bArr = new byte[i13];
        d0Var.i(bArr, 0, i13);
        return new p(str, null, new String(bArr, 0, v3(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static p q3(int i13, d0 d0Var) {
        if (i13 < 1) {
            return null;
        }
        int y13 = d0Var.y();
        int i14 = i13 - 1;
        byte[] bArr = new byte[i14];
        d0Var.i(bArr, 0, i14);
        int u33 = u3(bArr, 0, y13);
        String str = new String(bArr, 0, u33, s3(y13));
        int r33 = r3(y13) + u33;
        return new p("WXXX", str, l3(bArr, r33, v3(r33, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r3(int i13) {
        return (i13 == 0 || i13 == 3) ? 1 : 2;
    }

    public static Charset s3(int i13) {
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t3(int i13, int i14, int i15, int i16, int i17) {
        return i13 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
    }

    public static int u3(byte[] bArr, int i13, int i14) {
        int v33 = v3(i13, bArr);
        if (i14 == 0 || i14 == 3) {
            return v33;
        }
        while (v33 < bArr.length - 1) {
            if ((v33 - i13) % 2 == 0 && bArr[v33 + 1] == 0) {
                return v33;
            }
            v33 = v3(v33 + 1, bArr);
        }
        return bArr.length;
    }

    public static int v3(int i13, byte[] bArr) {
        while (i13 < bArr.length) {
            if (bArr[i13] == 0) {
                return i13;
            }
            i13++;
        }
        return bArr.length;
    }

    public static int w3(int i13, d0 d0Var) {
        byte[] bArr = d0Var.f53806a;
        int i14 = d0Var.f53807b;
        int i15 = i14;
        while (true) {
            int i16 = i15 + 1;
            if (i16 >= i14 + i13) {
                return i13;
            }
            if ((bArr[i15] & 255) == 255 && bArr[i16] == 0) {
                System.arraycopy(bArr, i15 + 2, bArr, i16, (i13 - (i15 - i14)) - 2);
                i13--;
            }
            i15 = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean x3(d7.d0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f53807b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.k()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.A()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.E()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.B()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.B()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.K(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.K(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.K(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.K(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.L(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.K(r2)
            return r4
        Lb0:
            r1.K(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.i.x3(d7.d0, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a7.n0 c3(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.i.c3(int, byte[]):a7.n0");
    }

    @Override // dl2.b
    public final a7.n0 e0(y8.a aVar, ByteBuffer byteBuffer) {
        return c3(byteBuffer.limit(), byteBuffer.array());
    }
}
