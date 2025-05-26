package m81;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p SEARCH = new p("SEARCH", 0);
    public static final p MAKEUP_TRY_ON = new p("MAKEUP_TRY_ON", 1);
    public static final p ROOM_REPAINT = new p("ROOM_REPAINT", 2);

    private static final /* synthetic */ p[] $values() {
        return new p[]{SEARCH, MAKEUP_TRY_ON, ROOM_REPAINT};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
