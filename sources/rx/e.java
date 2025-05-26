package rx;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    private final String value;
    public static final e FALSE = new e("FALSE", 0, "0");
    public static final e TRUE = new e("TRUE", 1, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
    public static final e ALL = new e("ALL", 2, "2");

    private static final /* synthetic */ e[] $values() {
        return new e[]{FALSE, TRUE, ALL};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
