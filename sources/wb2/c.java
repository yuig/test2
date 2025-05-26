package wb2;

import h32.f1;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final f1 eventType;
    public static final c UP = new c("UP", 0, f1.SWIPE_UP);
    public static final c DOWN = new c("DOWN", 1, f1.SWIPE_DOWN);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UP, DOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, f1 f1Var) {
        this.eventType = f1Var;
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
    public final f1 getEventType() {
        return this.eventType;
    }
}
