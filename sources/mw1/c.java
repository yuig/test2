package mw1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ORGANIC = new c("ORGANIC", 0, com.pinterest.partnerAnalytics.g.content_type_split_organic_label, com.pinterest.partnerAnalytics.b.purple);
    public static final c PAID = new c("PAID", 1, com.pinterest.partnerAnalytics.g.content_type_split_paid_label, com.pinterest.partnerAnalytics.b.green);
    private final int color;
    private final int description;

    private static final /* synthetic */ c[] $values() {
        return new c[]{ORGANIC, PAID};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14, int i15) {
        this.description = i14;
        this.color = i15;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getColor() {
        return this.color;
    }

    public final int getDescription() {
        return this.description;
    }
}
