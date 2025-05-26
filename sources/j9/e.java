package j9;

import a7.o0;
import android.util.Pair;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.n0;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f74965a;

    static {
        int i13 = n0.f53866a;
        f74965a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static boolean a(long[] jArr, long j13, long j14, long j15) {
        int length = jArr.length - 1;
        return jArr[0] <= j14 && j14 < jArr[n0.i(4, 0, length)] && jArr[n0.i(jArr.length - 4, 0, length)] < j15 && j15 <= j13;
    }

    public static c b(int i13, d0 d0Var) {
        d0Var.K(i13 + 12);
        d0Var.L(1);
        c(d0Var);
        d0Var.L(2);
        int y13 = d0Var.y();
        if ((y13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            d0Var.L(2);
        }
        if ((y13 & 64) != 0) {
            d0Var.L(d0Var.y());
        }
        if ((y13 & 32) != 0) {
            d0Var.L(2);
        }
        d0Var.L(1);
        c(d0Var);
        String g13 = o0.g(d0Var.y());
        if ("audio/mpeg".equals(g13) || "audio/vnd.dts".equals(g13) || "audio/vnd.dts.hd".equals(g13)) {
            return new c(g13, null, -1L, -1L);
        }
        d0Var.L(4);
        long A = d0Var.A();
        long A2 = d0Var.A();
        d0Var.L(1);
        int c13 = c(d0Var);
        byte[] bArr = new byte[c13];
        d0Var.i(bArr, 0, c13);
        return new c(g13, bArr, A2 > 0 ? A2 : -1L, A > 0 ? A : -1L);
    }

    public static int c(d0 d0Var) {
        int y13 = d0Var.y();
        int i13 = y13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        while ((y13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            y13 = d0Var.y();
            i13 = (i13 << 7) | (y13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        }
        return i13;
    }

    public static int d(int i13) {
        return (i13 >> 24) & 255;
    }

    public static e7.g e(d0 d0Var) {
        long s13;
        long s14;
        d0Var.K(8);
        if (d(d0Var.k()) == 0) {
            s13 = d0Var.A();
            s14 = d0Var.A();
        } else {
            s13 = d0Var.s();
            s14 = d0Var.s();
        }
        return new e7.g(s13, s14, d0Var.A());
    }

    public static Pair f(int i13, int i14, d0 d0Var) {
        Integer num;
        q qVar;
        Pair create;
        int i15;
        int i16;
        byte[] bArr;
        int i17 = d0Var.f53807b;
        while (i17 - i13 < i14) {
            d0Var.K(i17);
            int k13 = d0Var.k();
            tb.f.A("childAtomSize must be positive", k13 > 0);
            if (d0Var.k() == 1936289382) {
                int i18 = i17 + 8;
                int i19 = 0;
                int i23 = -1;
                String str = null;
                Integer num2 = null;
                while (i18 - i17 < k13) {
                    d0Var.K(i18);
                    int k14 = d0Var.k();
                    int k15 = d0Var.k();
                    if (k15 == 1718775137) {
                        num2 = Integer.valueOf(d0Var.k());
                    } else if (k15 == 1935894637) {
                        d0Var.L(4);
                        str = d0Var.w(4, StandardCharsets.UTF_8);
                    } else if (k15 == 1935894633) {
                        i23 = i18;
                        i19 = k14;
                    }
                    i18 += k14;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    tb.f.A("frma atom is mandatory", num2 != null);
                    tb.f.A("schi atom is mandatory", i23 != -1);
                    int i24 = i23 + 8;
                    while (true) {
                        if (i24 - i23 >= i19) {
                            num = num2;
                            qVar = null;
                            break;
                        }
                        d0Var.K(i24);
                        int k16 = d0Var.k();
                        if (d0Var.k() == 1952804451) {
                            int d2 = d(d0Var.k());
                            d0Var.L(1);
                            if (d2 == 0) {
                                d0Var.L(1);
                                i15 = 0;
                                i16 = 0;
                            } else {
                                int y13 = d0Var.y();
                                int i25 = (y13 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM) >> 4;
                                i15 = y13 & 15;
                                i16 = i25;
                            }
                            boolean z13 = d0Var.y() == 1;
                            int y14 = d0Var.y();
                            byte[] bArr2 = new byte[16];
                            d0Var.i(bArr2, 0, 16);
                            if (z13 && y14 == 0) {
                                int y15 = d0Var.y();
                                byte[] bArr3 = new byte[y15];
                                d0Var.i(bArr3, 0, y15);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            qVar = new q(z13, str, y14, bArr2, i16, i15, bArr);
                        } else {
                            i24 += k16;
                        }
                    }
                    tb.f.A("tenc atom is mandatory", qVar != null);
                    int i26 = n0.f53866a;
                    create = Pair.create(num, qVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i17 += k13;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:433:0x0774, code lost:
    
        if (r14 == 2) goto L403;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x09a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0cb7  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0cca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d7.j0 g(d7.d0 r47, int r48, int r49, java.lang.String r50, androidx.media3.common.DrmInitData r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 3396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.e.g(d7.d0, int, int, java.lang.String, androidx.media3.common.DrmInitData, boolean):d7.j0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x00d9, code lost:
    
        if (r4 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00db, code lost:
    
        r4 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0616 A[ADDED_TO_REGION, LOOP:15: B:256:0x0616->B:259:0x0621, LOOP_START, PHI: r19
      0x0616: PHI (r19v10 int) = (r19v6 int), (r19v11 int) binds: [B:255:0x0614, B:259:0x0621] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x09ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList h(e7.c r50, q8.z r51, long r52, androidx.media3.common.DrmInitData r54, boolean r55, boolean r56, ok.t r57) {
        /*
            Method dump skipped, instructions count: 2488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.e.h(e7.c, q8.z, long, androidx.media3.common.DrmInitData, boolean, boolean, ok.t):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x05d4, code lost:
    
        if (r4.g(1) > 0) goto L260;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0632  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(d7.d0 r42, int r43, int r44, int r45, int r46, java.lang.String r47, int r48, androidx.media3.common.DrmInitData r49, d7.j0 r50, int r51) {
        /*
            Method dump skipped, instructions count: 2567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.e.i(d7.d0, int, int, int, int, java.lang.String, int, androidx.media3.common.DrmInitData, d7.j0, int):void");
    }
}
