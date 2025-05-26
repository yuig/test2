package k51;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n SEARCH_BAR = new n("SEARCH_BAR", 0);
    public static final n FILTER_BAR_ICON = new n("FILTER_BAR_ICON", 1);
    public static final n FILTER_BAR_ICON_WITH_LABEL = new n("FILTER_BAR_ICON_WITH_LABEL", 2);

    private static final /* synthetic */ n[] $values() {
        return new n[]{SEARCH_BAR, FILTER_BAR_ICON, FILTER_BAR_ICON_WITH_LABEL};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
