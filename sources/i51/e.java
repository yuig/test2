package i51;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e implements x31.r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final String nameForLogging;
    private final int value;
    public static final e Group = new e("Group", 0, nz1.c.boards_filter_group, "group");
    public static final e Secret = new e("Secret", 1, nz1.c.boards_filter_secret, "secret");
    public static final e Archived = new e("Archived", 2, nz1.c.boards_filter_archived, "archived");

    private static final /* synthetic */ e[] $values() {
        return new e[]{Group, Secret, Archived};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, int i14, String str2) {
        this.value = i14;
        this.nameForLogging = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
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
