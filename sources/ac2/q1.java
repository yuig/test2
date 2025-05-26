package ac2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 VIDEO_HOME_FEED = new q1("VIDEO_HOME_FEED", 0);
    public static final q1 VIDEO_CLOSE_UP = new q1("VIDEO_CLOSE_UP", 1);
    public static final q1 UNIFIED_VIDEO_CLOSE_UP = new q1("UNIFIED_VIDEO_CLOSE_UP", 2);
    public static final q1 VIDEO_DRAFT = new q1("VIDEO_DRAFT", 3);

    private static final /* synthetic */ q1[] $values() {
        return new q1[]{VIDEO_HOME_FEED, VIDEO_CLOSE_UP, UNIFIED_VIDEO_CLOSE_UP, VIDEO_DRAFT};
    }

    static {
        q1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private q1(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }
}
