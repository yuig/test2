package xo2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import wo2.j;
import wo2.v;
import wo2.z;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f135634a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f135634a = bytes;
    }

    public static final boolean a(z segment, int i13, byte[] bytes, int i14) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i15 = segment.f130754c;
        byte[] bArr = segment.f130752a;
        for (int i16 = 1; i16 < i14; i16++) {
            if (i13 == i15) {
                segment = segment.f130757f;
                Intrinsics.f(segment);
                i13 = segment.f130753b;
                i15 = segment.f130754c;
                bArr = segment.f130752a;
            }
            if (bArr[i13] != bytes[i16]) {
                return false;
            }
            i13++;
        }
        return true;
    }

    public static final String b(j jVar, long j13) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (j13 > 0) {
            long j14 = j13 - 1;
            if (jVar.k(j14) == 13) {
                String L = jVar.L(j14, Charsets.UTF_8);
                jVar.skip(2L);
                return L;
            }
        }
        jVar.getClass();
        String L2 = jVar.L(j13, Charsets.UTF_8);
        jVar.skip(1L);
        return L2;
    }

    public static final int c(j jVar, v options, boolean z13) {
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        z zVar;
        byte[] bArr2;
        int i16;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        z zVar2 = jVar.f130710a;
        if (zVar2 == null) {
            return z13 ? -2 : -1;
        }
        int i17 = zVar2.f130753b;
        int i18 = zVar2.f130754c;
        int[] iArr = options.f130739c;
        byte[] bArr3 = zVar2.f130752a;
        z zVar3 = zVar2;
        int i19 = -1;
        int i23 = 0;
        loop0: while (true) {
            int i24 = i23 + 1;
            int i25 = iArr[i23];
            int i26 = i23 + 2;
            int i27 = iArr[i24];
            if (i27 != -1) {
                i19 = i27;
            }
            if (zVar3 == null) {
                break;
            }
            if (i25 >= 0) {
                int i28 = i17 + 1;
                int i29 = bArr3[i17] & 255;
                int i33 = i26 + i25;
                while (i26 != i33) {
                    if (i29 == iArr[i26]) {
                        i13 = iArr[i26 + i25];
                        if (i28 == i18) {
                            zVar3 = zVar3.f130757f;
                            Intrinsics.f(zVar3);
                            i15 = zVar3.f130753b;
                            i14 = zVar3.f130754c;
                            bArr = zVar3.f130752a;
                            if (zVar3 == zVar2) {
                                zVar3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i14 = i18;
                            i15 = i28;
                        }
                    } else {
                        i26++;
                    }
                }
                return i19;
            }
            int i34 = (i25 * (-1)) + i26;
            while (true) {
                int i35 = i17 + 1;
                int i36 = i26 + 1;
                if ((bArr3[i17] & 255) != iArr[i26]) {
                    return i19;
                }
                boolean z14 = i36 == i34;
                if (i35 == i18) {
                    Intrinsics.f(zVar3);
                    z zVar4 = zVar3.f130757f;
                    Intrinsics.f(zVar4);
                    i16 = zVar4.f130753b;
                    int i37 = zVar4.f130754c;
                    bArr2 = zVar4.f130752a;
                    if (zVar4 != zVar2) {
                        zVar = zVar4;
                        i18 = i37;
                    } else {
                        if (!z14) {
                            break loop0;
                        }
                        i18 = i37;
                        zVar = null;
                    }
                } else {
                    zVar = zVar3;
                    bArr2 = bArr3;
                    i16 = i35;
                }
                if (z14) {
                    i13 = iArr[i36];
                    int i38 = i16;
                    i14 = i18;
                    i15 = i38;
                    byte[] bArr4 = bArr2;
                    zVar3 = zVar;
                    bArr = bArr4;
                    break;
                }
                i17 = i16;
                bArr3 = bArr2;
                zVar3 = zVar;
                i26 = i36;
            }
            if (i13 >= 0) {
                return i13;
            }
            byte[] bArr5 = bArr;
            i23 = -i13;
            i17 = i15;
            i18 = i14;
            bArr3 = bArr5;
        }
        if (z13) {
            return -2;
        }
        return i19;
    }
}
