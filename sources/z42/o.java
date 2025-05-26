package z42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final m Companion;
    public static final o DIRECT_TO_INBOX = new o("DIRECT_TO_INBOX", 0);
    public static final o SEND_REQUEST = new o("SEND_REQUEST", 1);
    public static final o BLOCKED = new o("BLOCKED", 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{DIRECT_TO_INBOX, SEND_REQUEST, BLOCKED};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new m();
    }

    private o(String str, int i13) {
    }

    public static final o findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return DIRECT_TO_INBOX;
        }
        if (i13 == 1) {
            return SEND_REQUEST;
        }
        if (i13 != 2) {
            return null;
        }
        return BLOCKED;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = n.f140852a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
