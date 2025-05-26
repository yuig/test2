package is0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LOW_QUALITY = new b("LOW_QUALITY", 0);
    public static final b NOT_FOR_ME = new b("NOT_FOR_ME", 1);
    public static final b OFFENSIVE_SPAM = new b("OFFENSIVE_SPAM", 2);
    public static final b AD_LOW_QUALITY = new b("AD_LOW_QUALITY", 3);
    public static final b AD_NOT_RELEVANT_TO_ME = new b("AD_NOT_RELEVANT_TO_ME", 4);
    public static final b AD_I_SEE_IT_TOO_OFTEN = new b("AD_I_SEE_IT_TOO_OFTEN", 5);

    private static final /* synthetic */ b[] $values() {
        return new b[]{LOW_QUALITY, NOT_FOR_ME, OFFENSIVE_SPAM, AD_LOW_QUALITY, AD_NOT_RELEVANT_TO_ME, AD_I_SEE_IT_TOO_OFTEN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
