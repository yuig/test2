package wm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private final rm1.i value;
    public static final p SM = new p("SM", 0, rm1.i.SM);
    public static final p MD = new p("MD", 1, rm1.i.MD);

    private static final /* synthetic */ p[] $values() {
        return new p[]{SM, MD};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private p(String str, int i13, rm1.i iVar) {
        this.value = iVar;
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

    @NotNull
    public final rm1.i getValue() {
        return this.value;
    }
}
