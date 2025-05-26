package cz;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    private final String type;
    public static final j MODAL = new j("MODAL", 0, "0");
    public static final j INLINE = new j("INLINE", 1, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);

    private static final /* synthetic */ j[] $values() {
        return new j[]{MODAL, INLINE};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13, String str2) {
        this.type = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
