package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @NotNull
    public static final p Companion;

    @NotNull
    public static final String FADE_ALIAS = "fade";

    @NotNull
    private final String type;
    public static final q INVERT = new q("INVERT", 0, "invert");
    public static final q CHROME = new q("CHROME", 1, "chrome");
    public static final q FADE = new q("FADE", 2, "washed");
    public static final q INSTANT = new q("INSTANT", 3, "instant");
    public static final q MONO = new q("MONO", 4, "mono");
    public static final q NOIR = new q("NOIR", 5, "noir");
    public static final q PROCESS = new q("PROCESS", 6, "process");
    public static final q TONAL = new q("TONAL", 7, "tonal");
    public static final q TRANSFER = new q("TRANSFER", 8, "transfer");
    public static final q TONE = new q("TONE", 9, "tone");
    public static final q LINEAR = new q("LINEAR", 10, "linear");
    public static final q SEPIA = new q("SEPIA", 11, "sepia");
    public static final q NONE = new q("NONE", 12, "none");

    private static final /* synthetic */ q[] $values() {
        return new q[]{INVERT, CHROME, FADE, INSTANT, MONO, NOIR, PROCESS, TONAL, TRANSFER, TONE, LINEAR, SEPIA, NONE};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p();
    }

    private q(String str, int i13, String str2) {
        this.type = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
