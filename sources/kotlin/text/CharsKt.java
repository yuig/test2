package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CharsKt extends a {
    private CharsKt() {
    }

    public static boolean c(char c13) {
        return Character.isWhitespace(c13) || Character.isSpaceChar(c13);
    }

    public static String d(char c13, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c13);
        Intrinsics.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String valueOf2 = String.valueOf(c13);
            Intrinsics.g(valueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            return !Intrinsics.d(upperCase, upperCase2) ? upperCase : String.valueOf(Character.toTitleCase(c13));
        }
        if (c13 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String substring = upperCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Intrinsics.g(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
