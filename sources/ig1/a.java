package ig1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String type;
    public static final a PAGE_NOT_PRE_UPLOADED = new a("PAGE_NOT_PRE_UPLOADED", 0, "page_not_pre_uploaded");
    public static final a COMPOSE_DATA_MANAGER_INIT_FAIL = new a("COMPOSE_DATA_MANAGER_INIT_FAIL", 1, "compose_data_manager_init_fail");

    private static final /* synthetic */ a[] $values() {
        return new a[]{PAGE_NOT_PRE_UPLOADED, COMPOSE_DATA_MANAGER_INIT_FAIL};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.type = str2;
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
    public final String getType() {
        return this.type;
    }
}
