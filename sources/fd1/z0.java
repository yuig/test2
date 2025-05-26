package fd1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 DEFAULT = new z0("DEFAULT", 0);
    public static final z0 CONTACT_LIST_ONLY = new z0("CONTACT_LIST_ONLY", 1);
    public static final z0 APP_LIST_ONLY_FOR_CONTEXTUAL_MENU = new z0("APP_LIST_ONLY_FOR_CONTEXTUAL_MENU", 2);
    public static final z0 APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL = new z0("APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL", 3);

    private static final /* synthetic */ z0[] $values() {
        return new z0[]{DEFAULT, CONTACT_LIST_ONLY, APP_LIST_ONLY_FOR_CONTEXTUAL_MENU, APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL};
    }

    static {
        z0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private z0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }

    public final h32.g0 getContextLoggingComponentType() {
        return (h32.g0) a1.f61858a.get(this);
    }
}
