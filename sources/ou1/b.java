package ou1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String value;
    public static final b UNKNOWN = new b("UNKNOWN", 0, "");
    public static final b BOARD_PICKER = new b("BOARD_PICKER", 1, "board_picker");
    public static final b NAVBAR_PLUS_BUTTON = new b("NAVBAR_PLUS_BUTTON", 2, "nav_bar");
    public static final b PROFILE_PLUS_BUTTON = new b("PROFILE_PLUS_BUTTON", 3, "profile");
    public static final b AUTO_ORGANIZE = new b("AUTO_ORGANIZE", 4, "create_pin_cluster_page");
    public static final b UNORGANIZED_PIN = new b("UNORGANIZED_PIN", 5, "organize_pins");
    public static final b MOVE_PINS = new b("MOVE_PINS", 6, "move_pins");

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNKNOWN, BOARD_PICKER, NAVBAR_PLUS_BUTTON, PROFILE_PLUS_BUTTON, AUTO_ORGANIZE, UNORGANIZED_PIN, MOVE_PINS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
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
