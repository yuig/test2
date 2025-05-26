package wm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t HEADER_ONLY = new t("HEADER_ONLY", 0);
    public static final t HEADER_SUBHEADER = new t("HEADER_SUBHEADER", 1);
    public static final t NOTIFICATION = new t("NOTIFICATION", 2);

    private static final /* synthetic */ t[] $values() {
        return new t[]{HEADER_ONLY, HEADER_SUBHEADER, NOTIFICATION};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private t(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
