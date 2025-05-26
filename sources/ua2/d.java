package ua2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d PRIME = new d("PRIME", 0, "badge_prime");

    @NotNull
    private final String badgeId;

    private static final /* synthetic */ d[] $values() {
        return new d[]{PRIME};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private d(String str, int i13, String str2) {
        this.badgeId = str2;
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

    @NotNull
    public final String getBadgeId() {
        return this.badgeId;
    }
}
