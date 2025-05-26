package xc2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p SINGLE_IMAGE = new p("SINGLE_IMAGE", 0);
    public static final p GALLERY_WALL = new p("GALLERY_WALL", 1);

    private static final /* synthetic */ p[] $values() {
        return new p[]{SINGLE_IMAGE, GALLERY_WALL};
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
