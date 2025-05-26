package qm0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f104346id = name();
    private final int index = ordinal();
    public static final u0 BoardHeader = new u0("BoardHeader", 0);
    public static final u0 SavedContentPreview = new u0("SavedContentPreview", 1);
    public static final u0 MoreIdeasHeader = new u0("MoreIdeasHeader", 2);
    public static final u0 MoreIdeas = new u0("MoreIdeas", 3);

    private static final /* synthetic */ u0[] $values() {
        return new u0[]{BoardHeader, SavedContentPreview, MoreIdeasHeader, MoreIdeas};
    }

    static {
        u0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private u0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.f104346id;
    }

    public final int getIndex() {
        return this.index;
    }
}
