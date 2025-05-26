package w31;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import x31.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e implements r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final String nameForLogging;
    private final int value;
    public static final e Favorites = new e("Favorites", 0, oz1.b.pins_filter_favorites, "FAVORITED");
    public static final e CreatedByYou = new e("CreatedByYou", 1, oz1.b.pins_filter_created_by_you, "CREATED_BY_ME");

    private static final /* synthetic */ e[] $values() {
        return new e[]{Favorites, CreatedByYou};
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
