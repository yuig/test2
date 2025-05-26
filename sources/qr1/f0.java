package qr1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;

    @NotNull
    private final String paramValue;
    public static final f0 PERSONAL = new f0("PERSONAL", 0, "personal");
    public static final f0 BUSINESS = new f0("BUSINESS", 1, "business");

    private static final /* synthetic */ f0[] $values() {
        return new f0[]{PERSONAL, BUSINESS};
    }

    static {
        f0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f0(String str, int i13, String str2) {
        this.paramValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    @NotNull
    public final String getParamValue() {
        return this.paramValue;
    }
}
