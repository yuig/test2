package a;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u4 {
    public static ads_mobile_sdk.i5 a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String lowerCase = value.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return Intrinsics.d(lowerCase, "app_open_ad") ? ads_mobile_sdk.i5.f6233c : (ads_mobile_sdk.i5) Enum.valueOf(ads_mobile_sdk.i5.class, value);
    }
}
