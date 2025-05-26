package lm0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f83860id = name();
    private final int index = ordinal();
    public static final e0 OrganizeBoundary = new e0("OrganizeBoundary", 0);
    public static final e0 BoardSections = new e0("BoardSections", 1);
    public static final e0 BoardPins = new e0("BoardPins", 2);
    public static final e0 EmptyState = new e0("EmptyState", 3);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{OrganizeBoundary, BoardSections, BoardPins, EmptyState};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private e0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.f83860id;
    }

    public final int getIndex() {
        return this.index;
    }
}
