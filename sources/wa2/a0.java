package wa2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    private final int value;
    public static final a0 PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN = new a0("PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN", 0, 0);
    public static final a0 PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION = new a0("PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION", 1, 1);
    public static final a0 PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE = new a0("PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE", 2, 2);
    public static final a0 PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION = new a0("PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION", 3, 3);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN, PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION, PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE, PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a0(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
