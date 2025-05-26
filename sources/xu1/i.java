package xu1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final h Companion;

    @NotNull
    private static final i[] values;

    @NotNull
    private final String using;
    public static final i NONE = new i("NONE", 0, "");
    public static final i WIFI = new i("WIFI", 1, "wifi");
    public static final i MOBILE = new i("MOBILE", 2, "mobile");
    public static final i BOTH = new i("BOTH", 3, "wifi");

    private static final /* synthetic */ i[] $values() {
        return new i[]{NONE, WIFI, MOBILE, BOTH};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new h();
        values = values();
    }

    private i(String str, int i13, String str2) {
        this.using = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final boolean getHasMobile() {
        return ordinal() > 1;
    }

    public final int getInt() {
        return ordinal();
    }

    @NotNull
    public final String getUsing() {
        return this.using;
    }

    public final boolean isOnAnyNetwork() {
        return ordinal() > 0;
    }
}
