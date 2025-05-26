package jn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final String source;
    public static final c BACKGROUND_TAPPED = new c("BACKGROUND_TAPPED", 0, "BACKGROUND_TAPPED");
    public static final c INITIAL_SLIDE_UP = new c("INITIAL_SLIDE_UP", 1, "initial_slide_up");
    public static final c HEADER_TAPPED = new c("HEADER_TAPPED", 2, "header_tapped");
    public static final c USER_DRAGGED = new c("USER_DRAGGED", 3, "user_dragged");
    public static final c DATA_CHANGED = new c("DATA_CHANGED", 4, "data_changed");
    public static final c NAVIGATION = new c("NAVIGATION", 5, "navigation");
    public static final c CLOSE_BUTTON_TAPPED = new c("CLOSE_BUTTON_TAPPED", 6, "close_button_tapped");

    private static final /* synthetic */ c[] $values() {
        return new c[]{BACKGROUND_TAPPED, INITIAL_SLIDE_UP, HEADER_TAPPED, USER_DRAGGED, DATA_CHANGED, NAVIGATION, CLOSE_BUTTON_TAPPED};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, String str2) {
        this.source = str2;
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

    @NotNull
    public final String getSource() {
        return this.source;
    }
}
