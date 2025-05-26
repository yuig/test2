package eq0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k RELATED_TAB = new k("RELATED_TAB", 0);
    public static final k POPULAR_TAB = new k("POPULAR_TAB", 1);
    public static final k YOURS_TAB = new k("YOURS_TAB", 2);
    public static final k GIF_TRAY = new k("GIF_TRAY", 3);
    public static final k SEARCH_PIN = new k("SEARCH_PIN", 4);
    public static final k PIN_IT_REPLY = new k("PIN_IT_REPLY", 5);

    private static final /* synthetic */ k[] $values() {
        return new k[]{RELATED_TAB, POPULAR_TAB, YOURS_TAB, GIF_TRAY, SEARCH_PIN, PIN_IT_REPLY};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
