package r72;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;

    @NotNull
    public static final v1 Companion;
    public static final w1 UNKNOWN = new w1("UNKNOWN", 0);
    public static final w1 CAMERA = new w1("CAMERA", 1);
    public static final w1 GOOGLE_CREATIVE_COMMONS = new w1("GOOGLE_CREATIVE_COMMONS", 2);
    public static final w1 UNSPLASH = new w1("UNSPLASH", 3);
    public static final w1 DRAWING = new w1("DRAWING", 4);

    private static final /* synthetic */ w1[] $values() {
        return new w1[]{UNKNOWN, CAMERA, GOOGLE_CREATIVE_COMMONS, UNSPLASH, DRAWING};
    }

    static {
        w1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new v1();
    }

    private w1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }
}
