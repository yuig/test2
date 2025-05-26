package ep0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LIVE_CAMERA = new b("LIVE_CAMERA", 0);
    public static final b WAITING_LOCK = new b("WAITING_LOCK", 1);
    public static final b WAITING_PRECAPTURE = new b("WAITING_PRECAPTURE", 2);
    public static final b WAITING_NON_PRECAPTURE = new b("WAITING_NON_PRECAPTURE", 3);
    public static final b PICTURE_TAKEN = new b("PICTURE_TAKEN", 4);

    private static final /* synthetic */ b[] $values() {
        return new b[]{LIVE_CAMERA, WAITING_LOCK, WAITING_PRECAPTURE, WAITING_NON_PRECAPTURE, PICTURE_TAKEN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
