package x81;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i EXCEPTION_OCCURRED = new i("EXCEPTION_OCCURRED", 0, "exception occurred");
    public static final i FACE_TRACKER_MISSING = new i("FACE_TRACKER_MISSING", 1, "face tracker missing");
    public static final i SUCCESSFUL = new i("SUCCESSFUL", 2, "successful");

    @NotNull
    private final String status;

    private static final /* synthetic */ i[] $values() {
        return new i[]{EXCEPTION_OCCURRED, FACE_TRACKER_MISSING, SUCCESSFUL};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private i(String str, int i13, String str2) {
        this.status = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
