package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;

    @NotNull
    public static final j1 Companion;
    public static final l1 OTHER = new l1("OTHER", 0);
    public static final l1 REPIN = new l1("REPIN", 1);
    public static final l1 USER_FOLLOW = new l1("USER_FOLLOW", 2);
    public static final l1 SHARE = new l1("SHARE", 3);
    public static final l1 MESSAGE_SENT = new l1("MESSAGE_SENT", 4);
    public static final l1 UNREAD_MESSAGE_OPEN = new l1("UNREAD_MESSAGE_OPEN", 5);

    private static final /* synthetic */ l1[] $values() {
        return new l1[]{OTHER, REPIN, USER_FOLLOW, SHARE, MESSAGE_SENT, UNREAD_MESSAGE_OPEN};
    }

    static {
        l1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new j1();
    }

    private l1(String str, int i13) {
    }

    public static final l1 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return OTHER;
        }
        if (i13 == 1) {
            return REPIN;
        }
        if (i13 == 2) {
            return USER_FOLLOW;
        }
        if (i13 == 3) {
            return SHARE;
        }
        if (i13 == 4) {
            return MESSAGE_SENT;
        }
        if (i13 != 5) {
            return null;
        }
        return UNREAD_MESSAGE_OPEN;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (k1.f67134a[ordinal()]) {
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
