package la0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f implements x31.r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CreatedByYou = new f("CreatedByYou", 0, ka0.z.collages_filter_created_by_you, "PUBLISHED");
    public static final f InProgress = new f("InProgress", 1, ka0.z.collages_filter_in_progress, "DRAFTS");

    @NotNull
    private final String nameForLogging;
    private final int value;

    private static final /* synthetic */ f[] $values() {
        return new f[]{CreatedByYou, InProgress};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f(String str, int i13, int i14, String str2) {
        this.value = i14;
        this.nameForLogging = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @Override // x31.r
    @NotNull
    public String nameForLogging() {
        return this.nameForLogging;
    }

    @Override // x31.r
    public int value() {
        return this.value;
    }
}
