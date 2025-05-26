package ln1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final int dimenAttrRes;
    public static final f SM = new f("SM", 0, eo1.a.comp_spinner_sm_size);
    public static final f LG = new f("LG", 1, eo1.a.comp_spinner_lg_size);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SM, LG};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14) {
        this.dimenAttrRes = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getDimenAttrRes() {
        return this.dimenAttrRes;
    }
}
