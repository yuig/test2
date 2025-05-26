package j22;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final k Companion;

    @NotNull
    private static final l[] map;
    private final int tabType;
    public static final l TOP = new l("TOP", 0, 0);
    public static final l YOURS = new l("YOURS", 1, 1);
    public static final l PRODUCT_TAGGING = new l("PRODUCT_TAGGING", 2, 2);
    public static final l PRODUCTS = new l("PRODUCTS", 3, 3);

    private static final /* synthetic */ l[] $values() {
        return new l[]{TOP, YOURS, PRODUCT_TAGGING, PRODUCTS};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new k();
        map = values();
    }

    private l(String str, int i13, int i14) {
        this.tabType = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
