package ka0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    private final int titleResId;

    @NotNull
    private final xa0.l type;
    public static final u ALL_COLLAGES = new u("ALL_COLLAGES", 0, b0.collages_retrieval_all_collages_tab, xa0.l.ALL);
    public static final u IN_PROGRESS = new u("IN_PROGRESS", 1, b0.collages_retrieval_in_progress_tab, xa0.l.DRAFTS);
    public static final u CREATED = new u("CREATED", 2, b0.collages_retrieval_created_tab, xa0.l.PUBLISHED);

    private static final /* synthetic */ u[] $values() {
        return new u[]{ALL_COLLAGES, IN_PROGRESS, CREATED};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13, int i14, xa0.l lVar) {
        this.titleResId = i14;
        this.type = lVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    @NotNull
    public final xa0.l getType() {
        return this.type;
    }
}
