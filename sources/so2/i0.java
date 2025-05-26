package so2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public final char begin;
    public final char end;
    public static final i0 OBJ = new i0("OBJ", 0, '{', '}');
    public static final i0 LIST = new i0("LIST", 1, '[', ']');
    public static final i0 MAP = new i0("MAP", 2, '{', '}');
    public static final i0 POLY_OBJ = new i0("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ i0[] $values() {
        return new i0[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        i0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i0(String str, int i13, char c13, char c14) {
        this.begin = c13;
        this.end = c14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
