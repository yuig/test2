package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final p Companion;
    public static final r ADD_BOARD_DATE = new r("ADD_BOARD_DATE", 0);
    public static final r ARCHIVE_BOARD = new r("ARCHIVE_BOARD", 1);
    public static final r GROUP_YOUR_PINS = new r("GROUP_YOUR_PINS", 2);
    public static final r ADD_COLLABORATOR = new r("ADD_COLLABORATOR", 3);
    public static final r DISMISS_UPSELL = new r("DISMISS_UPSELL", 4);
    public static final r EDIT_BOARD_DATE = new r("EDIT_BOARD_DATE", 5);
    public static final r TURN_ON_NOTIFS = new r("TURN_ON_NOTIFS", 6);
    public static final r MANAGE_NOTIFS = new r("MANAGE_NOTIFS", 7);
    public static final r COMPLETE_UPSELL = new r("COMPLETE_UPSELL", 8);
    public static final r CREATE_NOTE_WITH_FAVORITES = new r("CREATE_NOTE_WITH_FAVORITES", 9);

    private static final /* synthetic */ r[] $values() {
        return new r[]{ADD_BOARD_DATE, ARCHIVE_BOARD, GROUP_YOUR_PINS, ADD_COLLABORATOR, DISMISS_UPSELL, EDIT_BOARD_DATE, TURN_ON_NOTIFS, MANAGE_NOTIFS, COMPLETE_UPSELL, CREATE_NOTE_WITH_FAVORITES};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p();
    }

    private r(String str, int i13) {
    }

    public static final r findByValue(int i13) {
        Companion.getClass();
        return p.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (q.f71490a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
