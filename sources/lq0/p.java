package lq0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p NONE = new p("NONE", 0);
    public static final p TEXT = new p("TEXT", 1);
    public static final p PIN = new p("PIN", 2);
    public static final p GIF = new p("GIF", 3);
    public static final p PINNER = new p("PINNER", 4);
    public static final p BOARD = new p("BOARD", 5);

    private static final /* synthetic */ p[] $values() {
        return new p[]{NONE, TEXT, PIN, GIF, PINNER, BOARD};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
