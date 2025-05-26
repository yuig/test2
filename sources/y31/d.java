package y31;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d INSTAGRAM = new d("INSTAGRAM", 0);
    public static final d WEBSITE = new d("WEBSITE", 1);
    public static final d WEBSITE_VERIFIED = new d("WEBSITE_VERIFIED", 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{INSTAGRAM, WEBSITE, WEBSITE_VERIFIED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
