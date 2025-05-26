package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class e0 extends d0 {
    public static Character A(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static char B(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt.I(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String C(int i13, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested character count ", i13, " is less than zero.").toString());
        }
        int length = str.length();
        if (i13 > length) {
            i13 = length;
        }
        String substring = str.substring(0, i13);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String D(int i13, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested character count ", i13, " is less than zero.").toString());
        }
        int length = str.length();
        if (i13 > length) {
            i13 = length;
        }
        String substring = str.substring(length - i13);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String y(int i13, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested character count ", i13, " is less than zero.").toString());
        }
        int length = str.length();
        if (i13 > length) {
            i13 = length;
        }
        String substring = str.substring(i13);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String z(int i13, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested character count ", i13, " is less than zero.").toString());
        }
        int length = str.length() - i13;
        if (length < 0) {
            length = 0;
        }
        return C(length, str);
    }
}
