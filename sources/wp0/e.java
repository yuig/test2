package wp0;

import h32.f1;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e UserRemoved;
    public static final e UserSearchBegan;
    public static final e UserSearchDismissed;
    public static final e UserSelected;

    @NotNull
    private final f1 eventType;

    @NotNull
    private final f32.c tagType;

    private static final /* synthetic */ e[] $values() {
        return new e[]{UserSelected, UserRemoved, UserSearchBegan, UserSearchDismissed};
    }

    static {
        f1 f1Var = f1.MENTION_SELECT;
        f32.c cVar = f32.c.USER;
        UserSelected = new e("UserSelected", 0, f1Var, cVar);
        UserRemoved = new e("UserRemoved", 1, f1.MENTION_REMOVE, cVar);
        UserSearchBegan = new e("UserSearchBegan", 2, f1.MENTION_SEARCH_BEGIN, cVar);
        UserSearchDismissed = new e("UserSearchDismissed", 3, f1.MENTION_SEARCH_CANCEL, cVar);
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, f1 f1Var, f32.c cVar) {
        this.eventType = f1Var;
        this.tagType = cVar;
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

    @NotNull
    public final f1 getEventType() {
        return this.eventType;
    }

    @NotNull
    public final f32.c getTagType() {
        return this.tagType;
    }
}
