package ni1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u2[] $VALUES;

    @NotNull
    private final h32.f1 eventType;
    public static final u2 PIN_REP_EVENT_QUEUE_INTERRUPTED = new u2("PIN_REP_EVENT_QUEUE_INTERRUPTED", 0, h32.f1.PIN_REP_EVENT_QUEUE_INTERRUPTED);
    public static final u2 PIN_REP_EVENT_QUEUE_NULL = new u2("PIN_REP_EVENT_QUEUE_NULL", 1, h32.f1.PIN_REP_EVENT_QUEUE_NULL);
    public static final u2 PIN_REP_EVENT_QUEUE_FULL = new u2("PIN_REP_EVENT_QUEUE_FULL", 2, h32.f1.PIN_REP_EVENT_QUEUE_FULL);

    private static final /* synthetic */ u2[] $values() {
        return new u2[]{PIN_REP_EVENT_QUEUE_INTERRUPTED, PIN_REP_EVENT_QUEUE_NULL, PIN_REP_EVENT_QUEUE_FULL};
    }

    static {
        u2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private u2(String str, int i13, h32.f1 f1Var) {
        this.eventType = f1Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }

    @NotNull
    public final h32.f1 getEventType() {
        return this.eventType;
    }
}
