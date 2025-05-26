package xm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i13) {
        String str = (i13 == 1 || i13 == 3 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 12 || i13 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 3 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 12 || i13 == 14) ? 2 : 3];
        if (i13 == 1 || i13 == 3 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 12 || i13 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i13 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i13 == 3) {
            objArr[1] = "encode8to7";
        } else if (i13 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i13 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i13 == 10) {
            objArr[1] = "dropMarker";
        } else if (i13 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i13 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i13) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 1 && i13 != 3 && i13 != 6 && i13 != 8 && i13 != 10 && i13 != 12 && i13 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static byte[] b(String[] strArr) {
        int i13 = 0;
        for (String str : strArr) {
            i13 += str.length();
        }
        byte[] bArr = new byte[i13];
        int i14 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i15 = 0;
            while (i15 < length) {
                bArr[i14] = (byte) str2.charAt(i15);
                i15++;
                i14++;
            }
        }
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i13 + 1;
            int i17 = i14 + 1;
            bArr2[i15] = (byte) (((bArr[i13] & 255) >>> i14) + ((bArr[i16] & ((1 << i17) - 1)) << (7 - i14)));
            if (i14 == 6) {
                i13 += 2;
                i14 = 0;
            } else {
                i13 = i16;
                i14 = i17;
            }
        }
        return bArr2;
    }

    public static byte[] d(String[] strArr) {
        if (strArr == null) {
            a(7);
            throw null;
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] strings = (String[]) strArr.clone();
                strings[0] = strings[0].substring(1);
                Intrinsics.checkNotNullParameter(strings, "strings");
                int i13 = 0;
                for (String str : strings) {
                    i13 += str.length();
                }
                byte[] bArr = new byte[i13];
                int i14 = 0;
                for (String str2 : strings) {
                    int length = str2.length();
                    int i15 = 0;
                    while (i15 < length) {
                        bArr[i14] = (byte) str2.charAt(i15);
                        i15++;
                        i14++;
                    }
                }
                return bArr;
            }
            if (charAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        byte[] b13 = b(strArr);
        int length2 = b13.length;
        for (int i16 = 0; i16 < length2; i16++) {
            b13[i16] = (byte) ((b13[i16] + Byte.MAX_VALUE) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
        }
        return c(b13);
    }
}
