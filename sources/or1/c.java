package or1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final String logValue;
    public static final c ADD_ACCOUNT = new c("ADD_ACCOUNT", 0, "new_account_add");
    public static final c SWITCH_ACCOUNT = new c("SWITCH_ACCOUNT", 1, "switch_account");
    public static final c DELETE_ACCOUNT = new c("DELETE_ACCOUNT", 2, "account_deleted");
    public static final c DELETE_GROUP = new c("DELETE_GROUP", 3, "group_deleted");

    private static final /* synthetic */ c[] $values() {
        return new c[]{ADD_ACCOUNT, SWITCH_ACCOUNT, DELETE_ACCOUNT, DELETE_GROUP};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, String str2) {
        this.logValue = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final String getLogValue() {
        return this.logValue;
    }
}
