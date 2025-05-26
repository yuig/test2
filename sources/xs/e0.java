package xs;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 CARTING_INITIAL = new e0("CARTING_INITIAL", 0);
    public static final e0 CARTING_LOADING = new e0("CARTING_LOADING", 1);
    public static final e0 CARTING_SUCCESS = new e0("CARTING_SUCCESS", 2);
    public static final e0 CARTING_ERROR = new e0("CARTING_ERROR", 3);
    public static final e0 CARTING_EMPTY = new e0("CARTING_EMPTY", 4);
    public static final e0 CARTING_BROWSER = new e0("CARTING_BROWSER", 5);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{CARTING_INITIAL, CARTING_LOADING, CARTING_SUCCESS, CARTING_ERROR, CARTING_EMPTY, CARTING_BROWSER};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
}
