package k22;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j NORMAL = new j("NORMAL", 0);
    public static final j USER_PROFILE = new j("USER_PROFILE", 1);
    public static final j EDIT_PROFILE = new j("EDIT_PROFILE", 2);
    public static final j ACCOUNT_SETTINGS = new j("ACCOUNT_SETTINGS", 3);
    public static final j MESSAGE_SETTINGS = new j("MESSAGE_SETTINGS", 4);
    public static final j UNAUTH = new j("UNAUTH", 5);
    public static final j PRODUCT_DETAIL_PAGE_USER = new j("PRODUCT_DETAIL_PAGE_USER", 6);
    public static final j BUSINESSES = new j("BUSINESSES", 7);
    public static final j COMPLETE_PROFILE = new j("COMPLETE_PROFILE", 8);
    public static final j USER_PROFILE_HAS_QUICK_CREATE_BOARD = new j("USER_PROFILE_HAS_QUICK_CREATE_BOARD", 9);
    public static final j ANALYTICS_GRAPH = new j("ANALYTICS_GRAPH", 10);

    private static final /* synthetic */ j[] $values() {
        return new j[]{NORMAL, USER_PROFILE, EDIT_PROFILE, ACCOUNT_SETTINGS, MESSAGE_SETTINGS, UNAUTH, PRODUCT_DETAIL_PAGE_USER, BUSINESSES, COMPLETE_PROFILE, USER_PROFILE_HAS_QUICK_CREATE_BOARD, ANALYTICS_GRAPH};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private j(String str, int i13) {
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
}
