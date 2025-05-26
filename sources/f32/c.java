package f32;

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
    public static final c USER = new c("USER", 0);
    public static final c BOARD = new c("BOARD", 1);
    public static final c SECTION = new c("SECTION", 2);
    public static final c COMMUNITY = new c("COMMUNITY", 3);
    public static final c LINK = new c("LINK", 4);
    public static final c PRODUCT = new c("PRODUCT", 5);
    public static final c REPLY_USER = new c("REPLY_USER", 6);
    public static final c FORMAT_BOLD = new c("FORMAT_BOLD", 7);
    public static final c FORMAT_ITALICS = new c("FORMAT_ITALICS", 8);
    public static final c FORMAT_UNDERLINE = new c("FORMAT_UNDERLINE", 9);
    public static final c BOARD_CALENDAR_ENTRY = new c("BOARD_CALENDAR_ENTRY", 10);

    private static final /* synthetic */ c[] $values() {
        return new c[]{USER, BOARD, SECTION, COMMUNITY, LINK, PRODUCT, REPLY_USER, FORMAT_BOLD, FORMAT_ITALICS, FORMAT_UNDERLINE, BOARD_CALENDAR_ENTRY};
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
        switch (b.f61035a[ordinal()]) {
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
            case 11:
                return 11;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
