package nc2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i HEVC = new i("HEVC", 0);
    public static final i AVC = new i("AVC", 1);
    public static final i UNKNOWN = new i("UNKNOWN", 2);

    private static final /* synthetic */ i[] $values() {
        return new i[]{HEVC, AVC, UNKNOWN};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13) {
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
}
