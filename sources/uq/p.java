package uq;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p Body = new p("Body", 0);
    public static final p Avatar = new p("Avatar", 1);
    public static final p Username = new p("Username", 2);
    public static final p Image = new p("Image", 3);
    public static final p Like = new p("Like", 4);
    public static final p Unlike = new p("Unlike", 5);
    public static final p Reply = new p("Reply", 6);

    private static final /* synthetic */ p[] $values() {
        return new p[]{Body, Avatar, Username, Image, Like, Unlike, Reply};
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
