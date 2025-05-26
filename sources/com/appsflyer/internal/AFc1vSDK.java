package com.appsflyer.internal;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t3.s1;

/* loaded from: classes.dex */
public final class AFc1vSDK {
    @NotNull
    public static final String getCurrencyIso4217Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str2 = "";
        for (byte b13 : digest) {
            str2 = a.a.C(str2, s1.d(new Object[]{Byte.valueOf(b13)}, 1, "%02x", ""));
        }
        return str2;
    }

    public static final int getMediationNetwork(@NotNull String str) {
        String f80465a;
        Integer intOrNull;
        String f80465a2;
        Integer intOrNull2;
        String f80465a3;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.j d2 = new Regex("(\\d+).(\\d+).(\\d+).*").d(str);
        if (d2 == null) {
            return -1;
        }
        kotlin.text.i iVar = d2.f80495c;
        MatchGroup c13 = iVar.c(1);
        int i13 = 0;
        int intValue = ((c13 == null || (f80465a3 = c13.getF80465a()) == null || (intOrNull3 = StringsKt.toIntOrNull(f80465a3)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup c14 = iVar.c(2);
        int intValue2 = (((c14 == null || (f80465a2 = c14.getF80465a()) == null || (intOrNull2 = StringsKt.toIntOrNull(f80465a2)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
        MatchGroup c15 = iVar.c(3);
        if (c15 != null && (f80465a = c15.getF80465a()) != null && (intOrNull = StringsKt.toIntOrNull(f80465a)) != null) {
            i13 = intOrNull.intValue();
        }
        return intValue2 + i13;
    }
}
