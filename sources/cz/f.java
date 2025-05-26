package cz;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    private final String type;
    public static final f EMOJI = new f("EMOJI", 0, "emoji-three-answers");
    public static final f SCALE = new f("SCALE", 1, "scale-five-answers");
    public static final f LIKE = new f("LIKE", 2, "like-two-answers");
    public static final f SINGLE = new f("SINGLE", 3, "single-choice");
    public static final f MULTIPLE = new f("MULTIPLE", 4, "multiple-choice");
    public static final f TEXT = new f("TEXT", 5, "text-box");
    public static final f VERTICAL_SCALE = new f("VERTICAL_SCALE", 6, "vertical-scale-answers");

    private static final /* synthetic */ f[] $values() {
        return new f[]{EMOJI, SCALE, LIKE, SINGLE, MULTIPLE, TEXT, VERTICAL_SCALE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, String str2) {
        this.type = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
