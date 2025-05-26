package c91;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    private final String text;
    public static final g COLOR = new g("COLOR", 0, "color");
    public static final g PRICE = new g("PRICE", 1, "price");
    public static final g BRAND = new g("BRAND", 2, "brand");

    private static final /* synthetic */ g[] $values() {
        return new g[]{COLOR, PRICE, BRAND};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13, String str2) {
        this.text = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    @NotNull
    public final String getText() {
        return this.text;
    }
}
