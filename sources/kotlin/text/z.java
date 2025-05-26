package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public class z extends StringsKt__StringNumberConversionsKt {
    public static String g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb3.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb3.append(upperCase);
        }
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        sb3.append(substring2);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static boolean h(String str, String suffix, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z13 ? str.endsWith(suffix) : k(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean i(String str, String str2, boolean z13) {
        return str == null ? str2 == null : !z13 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean j(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Iterable intRange = new IntRange(0, charSequence.length() - 1, 1);
        if ((intRange instanceof Collection) && ((Collection) intRange).isEmpty()) {
            return true;
        }
        Iterator it = intRange.iterator();
        while (((ql2.k) it).f104109c) {
            if (!CharsKt.c(charSequence.charAt(((u0) it).b()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int i13, int i14, int i15, String str, String other, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z13 ? str.regionMatches(i13, other, i14, i15) : str.regionMatches(z13, i13, other, i14, i15);
    }

    public static String l(int i13, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i13 + '.').toString());
        }
        if (i13 == 0) {
            return "";
        }
        if (i13 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                cArr[i14] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb3 = new StringBuilder(str.length() * i13);
        ql2.k it = new IntRange(1, i13, 1).iterator();
        while (it.f104109c) {
            it.b();
            sb3.append((CharSequence) str);
        }
        String sb4 = sb3.toString();
        Intrinsics.f(sb4);
        return sb4;
    }

    public static String m(String str, char c13, char c14) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = str.replace(c13, c14);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(...)");
        return replace;
    }

    public static String n(String str, String oldValue, String newValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int J2 = StringsKt.J(0, str, oldValue, false);
        if (J2 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i13 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb3 = new StringBuilder(length2);
        int i14 = 0;
        do {
            sb3.append((CharSequence) str, i14, J2);
            sb3.append(newValue);
            i14 = J2 + length;
            if (J2 >= str.length()) {
                break;
            }
            J2 = StringsKt.J(J2 + i13, str, oldValue, false);
        } while (J2 > 0);
        sb3.append((CharSequence) str, i14, str.length());
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static boolean o(String str, int i13, String prefix, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z13 ? str.startsWith(prefix, i13) : k(i13, 0, prefix.length(), str, prefix, z13);
    }

    public static boolean p(String str, String prefix, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z13 ? str.startsWith(prefix) : k(0, 0, prefix.length(), str, prefix, z13);
    }
}
