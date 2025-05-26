package de1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 SEARCH = new r0("SEARCH", 0);
    public static final r0 PIN_CLOSEUP = new r0("PIN_CLOSEUP", 1);
    public static final r0 STRUCTURED_FEED_LANDING_SCREEN = new r0("STRUCTURED_FEED_LANDING_SCREEN", 2);
    public static final r0 STL_LANDING_PAGE = new r0("STL_LANDING_PAGE", 3);
    public static final r0 FLASHLIGHT = new r0("FLASHLIGHT", 4);
    public static final r0 BOARD_SHOP_TOOL = new r0("BOARD_SHOP_TOOL", 5);

    private static final /* synthetic */ r0[] $values() {
        return new r0[]{SEARCH, PIN_CLOSEUP, STRUCTURED_FEED_LANDING_SCREEN, STL_LANDING_PAGE, FLASHLIGHT, BOARD_SHOP_TOOL};
    }

    static {
        r0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private r0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
