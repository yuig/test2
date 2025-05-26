package kotlin.text;

import a.cb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"kotlin/text/r", "kotlin/text/t", "kotlin/text/u", "kotlin/text/v", "kotlin/text/w", "kotlin/text/x", "kotlin/text/y", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/z", "kotlin/text/StringsKt__StringsKt", "kotlin/text/d0", "kotlin/text/e0"}, d2 = {}, k = 4, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StringsKt extends e0 {
    private StringsKt() {
    }

    public static boolean E(CharSequence charSequence, CharSequence other, boolean z13) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (L(charSequence, (String) other, 0, z13, 2) < 0) {
                return false;
            }
        } else if (StringsKt__StringsKt.q(charSequence, other, 0, charSequence.length(), z13, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean F(CharSequence charSequence, char c13) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return K(charSequence, c13, 0, false, 2) >= 0;
    }

    public static boolean G(CharSequence charSequence, char c13) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && a.b(charSequence.charAt(I(charSequence)), c13, false);
    }

    public static boolean H(CharSequence charSequence, String suffix) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return charSequence instanceof String ? z.h((String) charSequence, suffix, false) : StringsKt__StringsKt.t(charSequence.length() - suffix.length(), 0, suffix.length(), charSequence, suffix, false);
    }

    public static int I(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int J(int i13, CharSequence charSequence, String string, boolean z13) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z13 || !(charSequence instanceof String)) ? StringsKt__StringsKt.q(charSequence, string, i13, charSequence.length(), z13, false) : ((String) charSequence).indexOf(string, i13);
    }

    public static int K(CharSequence charSequence, char c13, int i13, boolean z13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z13 || !(charSequence instanceof String)) ? StringsKt__StringsKt.r(i13, charSequence, z13, new char[]{c13}) : ((String) charSequence).indexOf(c13, i13);
    }

    public static /* synthetic */ int L(CharSequence charSequence, String str, int i13, boolean z13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return J(i13, charSequence, str, z13);
    }

    public static int M(CharSequence charSequence, char c13, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = I(charSequence);
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c13, i13);
        }
        char[] chars = {c13};
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.c0.Q(chars), i13);
        }
        int I = I(charSequence);
        if (i13 > I) {
            i13 = I;
        }
        while (-1 < i13) {
            if (a.b(chars[0], charSequence.charAt(i13), false)) {
                return i13;
            }
            i13--;
        }
        return -1;
    }

    public static int N(CharSequence charSequence, String string, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = I(charSequence);
        }
        int i15 = i13;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.q(charSequence, string, i15, 0, false, true) : ((String) charSequence).lastIndexOf(string, i15);
    }

    public static List O(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String[] delimiters = {"\r\n", "\n", "\r"};
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return yn2.c0.t(yn2.c0.p(StringsKt__StringsKt.s(charSequence, delimiters, false, 0), new c0(charSequence)));
    }

    public static String P(String str, int i13) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Desired length ", i13, " is less than zero."));
        }
        if (i13 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb3 = new StringBuilder(i13);
            sb3.append((CharSequence) str);
            ql2.k it = new IntRange(1, i13 - str.length(), 1).iterator();
            while (it.f104109c) {
                it.b();
                sb3.append(' ');
            }
            charSequence = sb3;
        }
        return charSequence.toString();
    }

    public static String Q(String str, int i13) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Desired length ", i13, " is less than zero."));
        }
        if (i13 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb3 = new StringBuilder(i13);
            ql2.k it = new IntRange(1, i13 - str.length(), 1).iterator();
            while (it.f104109c) {
                it.b();
                sb3.append('0');
            }
            sb3.append((CharSequence) str);
            charSequence = sb3;
        }
        return charSequence.toString();
    }

    public static String R(CharSequence prefix, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!StringsKt__StringsKt.w(str, prefix)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String S(String suffix, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!H(str, suffix)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String T(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "delimiter");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("\"", "prefix");
        Intrinsics.checkNotNullParameter("\"", "suffix");
        if (str.length() < "\"".length() + "\"".length() || !StringsKt__StringsKt.w(str, "\"") || !H(str, "\"")) {
            return str;
        }
        String substring = str.substring("\"".length(), str.length() - "\"".length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static StringBuilder U(String str, int i13, int i14, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(cb.j("End index (", i14, ") is less than start index (", i13, ")."));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) str, 0, i13);
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        sb3.append(replacement);
        sb3.append((CharSequence) str, i14, str.length());
        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
        return sb3;
    }

    public static List V(CharSequence charSequence, char[] delimiters) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return StringsKt__StringsKt.v(0, charSequence, String.valueOf(delimiters[0]), false);
        }
        StringsKt__StringsKt.u(0);
        kotlin.collections.a0 g13 = yn2.c0.g(new c(charSequence, 0, 0, new a0(delimiters, false)));
        ArrayList arrayList = new ArrayList(g0.q(g13, 10));
        Iterator it = g13.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.x(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static boolean X(CharSequence charSequence, char c13) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && a.b(charSequence.charAt(0), c13, false);
    }

    public static String Y(String str, IntRange range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String substring = str.substring(range.f80453a, range.f80454b + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String Z(char c13, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int K = K(str, c13, 0, false, 6);
        if (K == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(K + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String a0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int L = L(str, delimiter, 0, false, 6);
        if (L == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(delimiter.length() + L, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String b0(char c13, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int M = M(str, c13, 0, 6);
        if (M == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(M + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String c0(String missingDelimiterValue, String delimiter) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int N = N(missingDelimiterValue, delimiter, 0, 6);
        if (N == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(delimiter.length() + N, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String d0(char c13, String str, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int K = K(str, c13, 0, false, 6);
        if (K == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, K);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String e0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int L = L(str, delimiter, 0, false, 6);
        if (L == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, L);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String f0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int N = N(str, delimiter, 0, 6);
        if (N == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, N);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static Boolean g0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Long h0(String str) {
        boolean z13;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        long j13 = -9223372036854775807L;
        if (Intrinsics.i(charAt, 48) < 0) {
            z13 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j13 = Long.MIN_VALUE;
                i13 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z13 = false;
                i13 = 1;
            }
        } else {
            z13 = false;
        }
        long j14 = -256204778801521550L;
        long j15 = 0;
        long j16 = -256204778801521550L;
        while (i13 < length) {
            int digit = Character.digit((int) str.charAt(i13), 10);
            if (digit < 0) {
                return null;
            }
            if (j15 < j16) {
                if (j16 != j14) {
                    return null;
                }
                j16 = j13 / 10;
                if (j15 < j16) {
                    return null;
                }
            }
            long j17 = j15 * 10;
            long j18 = digit;
            if (j17 < j13 + j18) {
                return null;
            }
            j15 = j17 - j18;
            i13++;
            j14 = -256204778801521550L;
        }
        return z13 ? Long.valueOf(j15) : Long.valueOf(-j15);
    }

    public static CharSequence i0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i13 = 0;
        boolean z13 = false;
        while (i13 <= length) {
            boolean c13 = CharsKt.c(charSequence.charAt(!z13 ? i13 : length));
            if (z13) {
                if (!c13) {
                    break;
                }
                length--;
            } else if (c13) {
                i13++;
            } else {
                z13 = true;
            }
        }
        return charSequence.subSequence(i13, length + 1);
    }

    public static CharSequence j0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i13 = length - 1;
                if (!CharsKt.c(str.charAt(length))) {
                    return str.subSequence(0, length + 1);
                }
                if (i13 < 0) {
                    break;
                }
                length = i13;
            }
        }
        return "";
    }
}
