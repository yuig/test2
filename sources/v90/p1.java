package v90;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p1[] $VALUES;

    @NotNull
    public static final o1 Companion;

    /* renamed from: id, reason: collision with root package name */
    private final int f124953id;

    @NotNull
    private final x62.n mode;
    public static final p1 Add = new p1("Add", 0, x62.n.BRUSH, t90.f.f116788b.f116819c);
    public static final p1 Erase = new p1("Erase", 1, x62.n.ERASER, t90.f.f116789c.f116819c);

    private static final /* synthetic */ p1[] $values() {
        return new p1[]{Add, Erase};
    }

    static {
        p1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new o1();
    }

    private p1(String str, int i13, x62.n nVar, int i14) {
        this.mode = nVar;
        this.f124953id = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f124953id;
    }

    @NotNull
    public final x62.n getMode() {
        return this.mode;
    }
}
