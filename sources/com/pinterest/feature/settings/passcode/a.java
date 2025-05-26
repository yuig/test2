package com.pinterest.feature.settings.passcode;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ERROR_ONLY_DIGITS = new a("ERROR_ONLY_DIGITS", 0);
    public static final a ERROR_ENTER_FOUR_DIGITS = new a("ERROR_ENTER_FOUR_DIGITS", 1);
    public static final a ERROR_FOUR_DIGITS_DO_NOT_MATCH = new a("ERROR_FOUR_DIGITS_DO_NOT_MATCH", 2);
    public static final a ERROR_EMAIL_NOT_VALID = new a("ERROR_EMAIL_NOT_VALID", 3);
    public static final a ERROR_EMAILS_DO_NOT_MATCH = new a("ERROR_EMAILS_DO_NOT_MATCH", 4);
    public static final a ERROR_EMAIL_IS_ALREADY_USED = new a("ERROR_EMAIL_IS_ALREADY_USED", 5);

    private static final /* synthetic */ a[] $values() {
        return new a[]{ERROR_ONLY_DIGITS, ERROR_ENTER_FOUR_DIGITS, ERROR_FOUR_DIGITS_DO_NOT_MATCH, ERROR_EMAIL_NOT_VALID, ERROR_EMAILS_DO_NOT_MATCH, ERROR_EMAIL_IS_ALREADY_USED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
