package z42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c UNKNOWN = new c("UNKNOWN", 0);
    public static final c SAVED_TAB_PLUS_BUTTON = new c("SAVED_TAB_PLUS_BUTTON", 1);
    public static final c PINS_TAB_PLUS_BUTTON = new c("PINS_TAB_PLUS_BUTTON", 2);
    public static final c BOARDS_TAB_PLUS_BUTTON = new c("BOARDS_TAB_PLUS_BUTTON", 3);
    public static final c BOARD_PICKER = new c("BOARD_PICKER", 4);
    public static final c PIN_BUILDER = new c("PIN_BUILDER", 5);
    public static final c ORGANIZE_PINS = new c("ORGANIZE_PINS", 6);
    public static final c SHARE_EXTENSION = new c("SHARE_EXTENSION", 7);
    public static final c AUTO_ORGANIZE_PINS = new c("AUTO_ORGANIZE_PINS", 8);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNKNOWN, SAVED_TAB_PLUS_BUTTON, PINS_TAB_PLUS_BUTTON, BOARDS_TAB_PLUS_BUTTON, BOARD_PICKER, PIN_BUILDER, ORGANIZE_PINS, SHARE_EXTENSION, AUTO_ORGANIZE_PINS};
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
        switch (i13) {
            case 0:
                return UNKNOWN;
            case 1:
                return SAVED_TAB_PLUS_BUTTON;
            case 2:
                return PINS_TAB_PLUS_BUTTON;
            case 3:
                return BOARDS_TAB_PLUS_BUTTON;
            case 4:
                return BOARD_PICKER;
            case 5:
                return PIN_BUILDER;
            case 6:
                return ORGANIZE_PINS;
            case 7:
                return SHARE_EXTENSION;
            case 8:
                return AUTO_ORGANIZE_PINS;
            default:
                return null;
        }
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
        switch (b.f140848a[ordinal()]) {
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
