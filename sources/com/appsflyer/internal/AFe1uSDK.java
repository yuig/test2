package com.appsflyer.internal;

import java.security.MessageDigest;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t3.s1;

/* loaded from: classes3.dex */
public final class AFe1uSDK {
    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getMediationNetwork(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.j d2 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").d(str);
        if (d2 != null) {
            kotlin.text.i iVar = d2.f80495c;
            MatchGroup c13 = iVar.c(1);
            Integer intOrNull = (c13 == null || (str4 = c13.f80465a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup c14 = iVar.c(3);
            Integer intOrNull2 = (c14 == null || (str3 = c14.f80465a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup c15 = iVar.c(4);
            Integer intOrNull3 = (c15 == null || (str2 = c15.f80465a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final String getRevenue(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b13 : digest) {
            str3 = a.a.C(str3, s1.d(new Object[]{Byte.valueOf(b13)}, 1, "%02x", ""));
        }
        return str3;
    }

    public static final Pair<Integer, Integer> getRevenue(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.j d2 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").d(str);
        if (d2 != null) {
            kotlin.text.i iVar = d2.f80495c;
            MatchGroup c13 = iVar.c(1);
            Integer intOrNull = (c13 == null || (str7 = c13.f80465a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup c14 = iVar.c(2);
            Integer intOrNull2 = (c14 == null || (str6 = c14.f80465a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup c15 = iVar.c(3);
            Integer intOrNull3 = (c15 == null || (str5 = c15.f80465a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup c16 = iVar.c(4);
            Integer intOrNull4 = (c16 == null || (str4 = c16.f80465a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup c17 = iVar.c(5);
            Integer intOrNull5 = (c17 == null || (str3 = c17.f80465a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup c18 = iVar.c(6);
            Integer intOrNull6 = (c18 == null || (str2 = c18.f80465a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.f(intOrNull);
                int intValue = intOrNull.intValue() * 1000000;
                Intrinsics.f(intOrNull2);
                int intValue2 = (intOrNull2.intValue() * 1000) + intValue;
                Intrinsics.f(intOrNull3);
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                Intrinsics.f(intOrNull4);
                int intValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.f(intOrNull5);
                int intValue4 = (intOrNull5.intValue() * 1000) + intValue3;
                Intrinsics.f(intOrNull6);
                return new Pair<>(valueOf, Integer.valueOf(intOrNull6.intValue() + intValue4));
            }
        }
        return null;
    }

    private static boolean getRevenue(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !c0.y(objArr, null);
    }
}
