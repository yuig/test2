package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f114795a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f114796b;

    static {
        String[] strArr = new String[93];
        for (int i13 = 0; i13 < 32; i13++) {
            strArr[i13] = "\\u" + b(i13 >> 12) + b(i13 >> 8) + b(i13 >> 4) + b(i13);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f114795a = strArr;
        byte[] bArr = new byte[93];
        for (int i14 = 0; i14 < 32; i14++) {
            bArr[i14] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f114796b = bArr;
    }

    public static final void a(String value, StringBuilder sb3) {
        Intrinsics.checkNotNullParameter(sb3, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb3.append('\"');
        int length = value.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char charAt = value.charAt(i14);
            String[] strArr = f114795a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb3.append((CharSequence) value, i13, i14);
                sb3.append(strArr[charAt]);
                i13 = i14 + 1;
            }
        }
        if (i13 != 0) {
            sb3.append((CharSequence) value, i13, value.length());
        } else {
            sb3.append(value);
        }
        sb3.append('\"');
    }

    public static final char b(int i13) {
        int i14 = i13 & 15;
        return (char) (i14 < 10 ? i14 + 48 : i14 + 87);
    }
}
