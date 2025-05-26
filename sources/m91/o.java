package m91;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o EMAIL = new o("EMAIL", 0);
    public static final o GENDER = new o("GENDER", 1);
    public static final o BUSINESS_TYPE = new o("BUSINESS_TYPE", 2);
    public static final o CONTACT_NAME = new o("CONTACT_NAME", 3);

    private static final /* synthetic */ o[] $values() {
        return new o[]{EMAIL, GENDER, BUSINESS_TYPE, CONTACT_NAME};
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
