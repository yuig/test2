package k41;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b Pin = new b("Pin", 0);
    public static final b Collage = new b("Collage", 1);
    public static final b Section = new b("Section", 2);
    public static final b Board = new b("Board", 3);
    public static final b Collaborator = new b("Collaborator", 4);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Pin, Collage, Section, Board, Collaborator};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
