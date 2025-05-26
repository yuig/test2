package wo2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f130666a;

    static {
        m mVar = m.f130712d;
        f130666a = m60.f0.h0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f130713a;
        m60.f0.h0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static String a(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] map = f130666a;
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            byte b13 = bArr[i13];
            int i15 = i13 + 2;
            byte b14 = bArr[i13 + 1];
            i13 += 3;
            byte b15 = bArr[i15];
            bArr2[i14] = map[(b13 & 255) >> 2];
            bArr2[i14 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            int i16 = i14 + 3;
            bArr2[i14 + 2] = map[((b14 & 15) << 2) | ((b15 & 255) >> 6)];
            i14 += 4;
            bArr2[i16] = map[b15 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b16 = bArr[i13];
            bArr2[i14] = map[(b16 & 255) >> 2];
            bArr2[i14 + 1] = map[(b16 & 3) << 4];
            bArr2[i14 + 2] = 61;
            bArr2[i14 + 3] = 61;
        } else if (length2 == 2) {
            int i17 = i13 + 1;
            byte b17 = bArr[i13];
            byte b18 = bArr[i17];
            bArr2[i14] = map[(b17 & 255) >> 2];
            bArr2[i14 + 1] = map[((b17 & 3) << 4) | ((b18 & 255) >> 4)];
            bArr2[i14 + 2] = map[(b18 & 15) << 2];
            bArr2[i14 + 3] = 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }
}
