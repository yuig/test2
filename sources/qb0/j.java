package qb0;

import android.icu.text.CompactDecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d1;
import kotlin.collections.g1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.p;
import kotlin.text.z;
import uj2.b0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f103407a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f103408b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f103409c;

    static {
        g1.b("ar");
        f103408b = g1.b("de");
        f103409c = z0.f(new Pair(new Locale("es", "ES"), g.f103405i));
    }

    public static final String a(String text) {
        kotlin.text.j b13;
        String str;
        Intrinsics.checkNotNullParameter(text, "text");
        Regex regex = new Regex("\\d+(.\\d)*[kmb]", p.IGNORE_CASE);
        if (!Intrinsics.d(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage()) || !regex.a(text) || (b13 = regex.b(0, text)) == null || (str = (String) ((d1) b13.b()).get(0)) == null) {
            return text;
        }
        String str2 = StringsKt.E(str, "k", false) ? "thousand" : StringsKt.E(str, "m", false) ? "million" : StringsKt.E(str, "b", false) ? "billion" : "";
        if (str2.length() <= 0) {
            return text;
        }
        String substring = str.substring(0, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return z.n(text, str, substring + " " + str2);
    }

    public static final String b(int i13) {
        Locale locale = Locale.getDefault();
        Intrinsics.f(locale);
        String format = CompactDecimalFormat.getInstance(f103408b.contains(locale.getLanguage()) ? Locale.ENGLISH : locale, f103409c.containsKey(locale) ? CompactDecimalFormat.CompactStyle.LONG : CompactDecimalFormat.CompactStyle.SHORT).format(Math.floor(i13));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String lowerCase = format.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static void c(int i13, ha2.j onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullExpressionValue(b0.j(Integer.valueOf(i13)).r(tk2.e.f118016b).k(new lb0.c(1, new h(1, f103407a, j.class, "getFormattedNumber", "getFormattedNumber(I)Ljava/lang/String;", 0))).l(wj2.c.a()).o(new k90.i(6, onSuccess), new k90.i(7, i.f103406i)), "subscribe(...)");
    }
}
