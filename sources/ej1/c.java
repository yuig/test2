package ej1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ID_CATALOG_CAROUSEL_DUMMY_LBL = new c("ID_CATALOG_CAROUSEL_DUMMY_LBL", 0);
    public static final c ID_PRODUCT_PRICE = new c("ID_PRODUCT_PRICE", 1);
    public static final c ID_PRODUCT_TITLE = new c("ID_PRODUCT_TITLE", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{ID_CATALOG_CAROUSEL_DUMMY_LBL, ID_PRODUCT_PRICE, ID_PRODUCT_TITLE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13) {
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
}
