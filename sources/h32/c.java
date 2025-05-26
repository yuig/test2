package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c OTHER = new c("OTHER", 0);
    public static final c REPIN = new c("REPIN", 1);
    public static final c BOARD_CREATE = new c("BOARD_CREATE", 2);
    public static final c TRIED_IT_CLOSEUP = new c("TRIED_IT_CLOSEUP", 3);
    public static final c TRIED_IT_HOMEFEED = new c("TRIED_IT_HOMEFEED", 4);
    public static final c HOLIDAY_SEARCH = new c("HOLIDAY_SEARCH", 5);
    public static final c NEGATIVE_FEEDBACK_REPORT_LINK = new c("NEGATIVE_FEEDBACK_REPORT_LINK", 6);
    public static final c NULL_DISMISS = new c("NULL_DISMISS", 7);
    public static final c COMMENT_NOTIF = new c("COMMENT_NOTIF", 8);

    private static final /* synthetic */ c[] $values() {
        return new c[]{OTHER, REPIN, BOARD_CREATE, TRIED_IT_CLOSEUP, TRIED_IT_HOMEFEED, HOLIDAY_SEARCH, NEGATIVE_FEEDBACK_REPORT_LINK, NULL_DISMISS, COMMENT_NOTIF};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        return a.a(i13);
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
        switch (b.f66835a[ordinal()]) {
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
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
