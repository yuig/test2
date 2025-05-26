package mw1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    private final int color;
    private final int description;
    public static final n PROFILE = new n("PROFILE", 0, com.pinterest.partnerAnalytics.g.content_type_split_your_pins_label, com.pinterest.partnerAnalytics.b.orange);
    public static final n NON_PROFILE = new n("NON_PROFILE", 1, com.pinterest.partnerAnalytics.g.content_type_split_other_pins_label, com.pinterest.partnerAnalytics.b.green);

    private static final /* synthetic */ n[] $values() {
        return new n[]{PROFILE, NON_PROFILE};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13, int i14, int i15) {
        this.description = i14;
        this.color = i15;
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

    public final int getColor() {
        return this.color;
    }

    public final int getDescription() {
        return this.description;
    }
}
