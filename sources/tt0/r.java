package tt0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r UNDECIDED = new r("UNDECIDED", 0);
    public static final r NONE = new r("NONE", 1);
    public static final r CAMERA = new r("CAMERA", 2);
    public static final r ACTIVE_RECORDING = new r("ACTIVE_RECORDING", 3);
    public static final r COUNTDOWN = new r("COUNTDOWN", 4);
    public static final r PHOTO = new r("PHOTO", 5);

    private static final /* synthetic */ r[] $values() {
        return new r[]{UNDECIDED, NONE, CAMERA, ACTIVE_RECORDING, COUNTDOWN, PHOTO};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private r(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
