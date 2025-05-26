package ac2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class e0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 CloseupToGridPlayerReuse;
    public static final e0 GridToCloseupPlayerReuse;
    public static final e0 Other;

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{GridToCloseupPlayerReuse, CloseupToGridPlayerReuse, Other};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        GridToCloseupPlayerReuse = new c0("GridToCloseupPlayerReuse", 0, defaultConstructorMarker);
        CloseupToGridPlayerReuse = new b0("CloseupToGridPlayerReuse", 1, defaultConstructorMarker);
        Other = new d0("Other", 2, defaultConstructorMarker);
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ e0(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
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

    public abstract boolean isReasonPlayerReuse();

    private e0(String str, int i13) {
    }
}
