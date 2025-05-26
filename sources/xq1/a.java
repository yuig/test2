package xq1;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String value;
    public static final a YES = new a("YES", 0, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
    public static final a NO = new a("NO", 1, "2");
    public static final a NOT_SURE = new a("NOT_SURE", 2, "3");

    private static final /* synthetic */ a[] $values() {
        return new a[]{YES, NO, NOT_SURE};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
