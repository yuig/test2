package wr;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String value;
    public static final b TEST = new b("TEST", 0, "test");
    public static final b GMA = new b("GMA", 1, "gma");
    public static final b TARGET_ACCOUNT_LINKING = new b("TARGET_ACCOUNT_LINKING", 2, "target_account_linking");
    public static final b COLLAGE_ADS = new b("COLLAGE_ADS", 3, "collage_ads");
    public static final b PREMIERE_SPOTLIGHT_SLOT_INDEX = new b("PREMIERE_SPOTLIGHT_SLOT_INDEX", 4, "premiere_spotlight_slot_index");
    public static final b OMSDK = new b("OMSDK", 5, "omsdk");
    public static final b PIN_VALIDATION = new b("PIN_VALIDATION", 6, "pin_validation");
    public static final b CARTING = new b("CARTING", 7, "carting");
    public static final b HANDSHAKE = new b("HANDSHAKE", 8, "handshake");
    public static final b STL_V3 = new b("STL_V3", 9, "stl_v3");

    private static final /* synthetic */ b[] $values() {
        return new b[]{TEST, GMA, TARGET_ACCOUNT_LINKING, COLLAGE_ADS, PREMIERE_SPOTLIGHT_SLOT_INDEX, OMSDK, PIN_VALIDATION, CARTING, HANDSHAKE, STL_V3};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
