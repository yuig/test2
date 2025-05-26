package uz1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d SINGLE_IMAGE_NOTIFICATION = new d("SINGLE_IMAGE_NOTIFICATION", 0);
    public static final d FOUR_PINS_GRID_NOTIFICATION = new d("FOUR_PINS_GRID_NOTIFICATION", 1);
    public static final d SIX_PINS_GRID_NOTIFICATION = new d("SIX_PINS_GRID_NOTIFICATION", 2);
    public static final d MINI_BOARD_GRID_NOTIFICATION = new d("MINI_BOARD_GRID_NOTIFICATION", 3);
    public static final d MINI_BOARD_GRID_WITH_AVATAR_NOTIFICATION = new d("MINI_BOARD_GRID_WITH_AVATAR_NOTIFICATION", 4);
    public static final d MINI_INTEREST_GRID_NOTIFICATION = new d("MINI_INTEREST_GRID_NOTIFICATION", 5);
    public static final d DEFAULT_NOTIFICATION = new d("DEFAULT_NOTIFICATION", 6);

    private static final /* synthetic */ d[] $values() {
        return new d[]{SINGLE_IMAGE_NOTIFICATION, FOUR_PINS_GRID_NOTIFICATION, SIX_PINS_GRID_NOTIFICATION, MINI_BOARD_GRID_NOTIFICATION, MINI_BOARD_GRID_WITH_AVATAR_NOTIFICATION, MINI_INTEREST_GRID_NOTIFICATION, DEFAULT_NOTIFICATION};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
