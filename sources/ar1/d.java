package ar1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d EMAIL_STEP = new d("EMAIL_STEP", 0);
    public static final d PASSWORD_STEP = new d("PASSWORD_STEP", 1);
    public static final d NAME_STEP = new d("NAME_STEP", 2);
    public static final d BIRTHDAY_STEP = new d("BIRTHDAY_STEP", 3);
    public static final d KOREA_CONSENT_STEP = new d("KOREA_CONSENT_STEP", 4);

    private static final /* synthetic */ d[] $values() {
        return new d[]{EMAIL_STEP, PASSWORD_STEP, NAME_STEP, BIRTHDAY_STEP, KOREA_CONSENT_STEP};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
