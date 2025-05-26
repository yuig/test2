package m60;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f85899a = kotlin.collections.f0.j("pt-br", "pt-pt", "en-gb");

    public static String a() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        String lowerCase = languageTag.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return f85899a.contains(lowerCase) ? lowerCase : b();
    }

    public static String b() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        String lowerCase = languageTag.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!StringsKt.F(lowerCase, '-')) {
            return lowerCase;
        }
        String substring = lowerCase.substring(0, StringsKt.K(lowerCase, '-', 0, false, 6));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
