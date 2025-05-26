package v22;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c UNDEFINED = new c("UNDEFINED", 0);
    public static final c IAB = new c("IAB", 1);
    public static final c NBF = new c("NBF", 2);
    public static final c IAB_TRIGGER = new c("IAB_TRIGGER", 3);
    public static final c NBF_TRIGGER = new c("NBF_TRIGGER", 4);
    public static final c APP_STORE_TRIGGER = new c("APP_STORE_TRIGGER", 5);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNDEFINED, IAB, NBF, IAB_TRIGGER, NBF_TRIGGER, APP_STORE_TRIGGER};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return UNDEFINED;
        }
        if (i13 == 1) {
            return IAB;
        }
        if (i13 == 2) {
            return NBF;
        }
        if (i13 == 3) {
            return IAB_TRIGGER;
        }
        if (i13 == 4) {
            return NBF_TRIGGER;
        }
        if (i13 != 5) {
            return null;
        }
        return APP_STORE_TRIGGER;
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

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f123908a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
