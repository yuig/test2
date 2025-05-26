package tt0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s RECORDING_STARTED = new s("RECORDING_STARTED", 0);
    public static final s RECORDING_STOPPING = new s("RECORDING_STOPPING", 1);
    public static final s RECORDING_STOPPED = new s("RECORDING_STOPPED", 2);
    public static final s COUNTDOWN = new s("COUNTDOWN", 3);
    public static final s PHOTO = new s("PHOTO", 4);

    private static final /* synthetic */ s[] $values() {
        return new s[]{RECORDING_STARTED, RECORDING_STOPPING, RECORDING_STOPPED, COUNTDOWN, PHOTO};
    }

    static {
        s[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private s(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
