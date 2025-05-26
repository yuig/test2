package sv0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o UPLOADED = new o("UPLOADED", 0);
    public static final o PRE_UPLOADED = new o("PRE_UPLOADED", 1);
    public static final o FAILED = new o("FAILED", 2);
    public static final o VERIFIED_UPLOAD = new o("VERIFIED_UPLOAD", 3);
    public static final o VERIFIED_UPLOAD_FAIL = new o("VERIFIED_UPLOAD_FAIL", 4);
    public static final o CANCELLED = new o("CANCELLED", 5);
    public static final o PAUSED = new o("PAUSED", 6);
    public static final o UNKNOWN = new o("UNKNOWN", 7);

    private static final /* synthetic */ o[] $values() {
        return new o[]{UPLOADED, PRE_UPLOADED, FAILED, VERIFIED_UPLOAD, VERIFIED_UPLOAD_FAIL, CANCELLED, PAUSED, UNKNOWN};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private o(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
