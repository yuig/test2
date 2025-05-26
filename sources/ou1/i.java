package ou1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CREATOR = new i("CREATOR", 0);

    private static final /* synthetic */ i[] $values() {
        return new i[]{CREATOR};
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
