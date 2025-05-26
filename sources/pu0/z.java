package pu0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z Enter = new z("Enter", 0, aq1.h.idea_pin_overlay_enter_transition_label);
    public static final z Exit = new z("Exit", 1, aq1.h.idea_pin_overlay_exit_transition_label);
    private final int label;

    private static final /* synthetic */ z[] $values() {
        return new z[]{Enter, Exit};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private z(String str, int i13, int i14) {
        this.label = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final int getLabel() {
        return this.label;
    }
}
