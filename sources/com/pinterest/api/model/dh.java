package com.pinterest.api.model;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/pinterest/api/model/dh;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "com/pinterest/api/model/ch", "DISPLAY_MODE_BASIC", "DISPLAY_MODE_TEXT", "DISPLAY_MODE_ROW_WITH_COUNT", "DISPLAY_MODE_GRID", "DISPLAY_MODE_MINI_GRID", "DISPLAY_MODE_CAROUSEL", "DISPLAY_MODE_LIST", "DISPLAY_MODE_TWO_ROW_WITH_COUNT", "DISPLAY_MODE_NO_ICON_TEXT", "DISPLAY_MODE_NO_ICON_ROW_WITH_COUNT", "DISPLAY_MODE_PIN_ROW", "DISPLAY_MODE_PIN_GRID", "DISPLAY_MODE_BOARD_GRID", "DISPLAY_MODE_USER_GRID", "DISPLAY_MODE_SEARCH_GRID", "DISPLAY_MODE_INTEREST_GRID", "DISPLAY_MODE_MIXED_GRID", "DISPLAY_MODE_MINI_BOARD_GRID_WITH_ICON", "DISPLAY_MODE_TOP_PICK_PIN", "DISPLAY_MODE_TOP_PICK_BOARD", "DISPLAY_MODE_TOP_PICK_SEARCH", "DISPLAY_MODE_GRID_WITH_COMPACT_BOARDS", "DISPLAY_MODE_HIGHLIGHT_NOTIFICATION", "DISPLAY_MODE_EMPTY_ITEM", "DISPLAY_MODE_SECTION_TITLE", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class dh extends Enum<dh> {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ dh[] $VALUES;

    @NotNull
    public static final ch Companion;
    private final int value;

    @om.b("0")
    public static final dh DISPLAY_MODE_BASIC = new dh("DISPLAY_MODE_BASIC", 0, 0);

    @om.b(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE)
    public static final dh DISPLAY_MODE_TEXT = new dh("DISPLAY_MODE_TEXT", 1, 1);

    @om.b("2")
    public static final dh DISPLAY_MODE_ROW_WITH_COUNT = new dh("DISPLAY_MODE_ROW_WITH_COUNT", 2, 2);

    @om.b("3")
    public static final dh DISPLAY_MODE_GRID = new dh("DISPLAY_MODE_GRID", 3, 3);

    @om.b("4")
    public static final dh DISPLAY_MODE_MINI_GRID = new dh("DISPLAY_MODE_MINI_GRID", 4, 4);

    @om.b("5")
    public static final dh DISPLAY_MODE_CAROUSEL = new dh("DISPLAY_MODE_CAROUSEL", 5, 5);

    @om.b("6")
    public static final dh DISPLAY_MODE_LIST = new dh("DISPLAY_MODE_LIST", 6, 6);

    @om.b("7")
    public static final dh DISPLAY_MODE_TWO_ROW_WITH_COUNT = new dh("DISPLAY_MODE_TWO_ROW_WITH_COUNT", 7, 7);

    @om.b("8")
    public static final dh DISPLAY_MODE_NO_ICON_TEXT = new dh("DISPLAY_MODE_NO_ICON_TEXT", 8, 8);

    @om.b("9")
    public static final dh DISPLAY_MODE_NO_ICON_ROW_WITH_COUNT = new dh("DISPLAY_MODE_NO_ICON_ROW_WITH_COUNT", 9, 9);

    @om.b("10")
    public static final dh DISPLAY_MODE_PIN_ROW = new dh("DISPLAY_MODE_PIN_ROW", 10, 10);

    @om.b("11")
    public static final dh DISPLAY_MODE_PIN_GRID = new dh("DISPLAY_MODE_PIN_GRID", 11, 11);

    @om.b("12")
    public static final dh DISPLAY_MODE_BOARD_GRID = new dh("DISPLAY_MODE_BOARD_GRID", 12, 12);

    @om.b("13")
    public static final dh DISPLAY_MODE_USER_GRID = new dh("DISPLAY_MODE_USER_GRID", 13, 13);

    @om.b("14")
    public static final dh DISPLAY_MODE_SEARCH_GRID = new dh("DISPLAY_MODE_SEARCH_GRID", 14, 14);

    @om.b("15")
    public static final dh DISPLAY_MODE_INTEREST_GRID = new dh("DISPLAY_MODE_INTEREST_GRID", 15, 15);

    @om.b("16")
    public static final dh DISPLAY_MODE_MIXED_GRID = new dh("DISPLAY_MODE_MIXED_GRID", 16, 16);

    @om.b("18")
    public static final dh DISPLAY_MODE_MINI_BOARD_GRID_WITH_ICON = new dh("DISPLAY_MODE_MINI_BOARD_GRID_WITH_ICON", 17, 18);

    @om.b("19")
    public static final dh DISPLAY_MODE_TOP_PICK_PIN = new dh("DISPLAY_MODE_TOP_PICK_PIN", 18, 19);

    @om.b("20")
    public static final dh DISPLAY_MODE_TOP_PICK_BOARD = new dh("DISPLAY_MODE_TOP_PICK_BOARD", 19, 20);

    @om.b("21")
    public static final dh DISPLAY_MODE_TOP_PICK_SEARCH = new dh("DISPLAY_MODE_TOP_PICK_SEARCH", 20, 21);

    @om.b("22")
    public static final dh DISPLAY_MODE_GRID_WITH_COMPACT_BOARDS = new dh("DISPLAY_MODE_GRID_WITH_COMPACT_BOARDS", 21, 22);

    @om.b("23")
    public static final dh DISPLAY_MODE_HIGHLIGHT_NOTIFICATION = new dh("DISPLAY_MODE_HIGHLIGHT_NOTIFICATION", 22, 23);
    public static final dh DISPLAY_MODE_EMPTY_ITEM = new dh("DISPLAY_MODE_EMPTY_ITEM", 23, 98);
    public static final dh DISPLAY_MODE_SECTION_TITLE = new dh("DISPLAY_MODE_SECTION_TITLE", 24, 99);

    private static final /* synthetic */ dh[] $values() {
        return new dh[]{DISPLAY_MODE_BASIC, DISPLAY_MODE_TEXT, DISPLAY_MODE_ROW_WITH_COUNT, DISPLAY_MODE_GRID, DISPLAY_MODE_MINI_GRID, DISPLAY_MODE_CAROUSEL, DISPLAY_MODE_LIST, DISPLAY_MODE_TWO_ROW_WITH_COUNT, DISPLAY_MODE_NO_ICON_TEXT, DISPLAY_MODE_NO_ICON_ROW_WITH_COUNT, DISPLAY_MODE_PIN_ROW, DISPLAY_MODE_PIN_GRID, DISPLAY_MODE_BOARD_GRID, DISPLAY_MODE_USER_GRID, DISPLAY_MODE_SEARCH_GRID, DISPLAY_MODE_INTEREST_GRID, DISPLAY_MODE_MIXED_GRID, DISPLAY_MODE_MINI_BOARD_GRID_WITH_ICON, DISPLAY_MODE_TOP_PICK_PIN, DISPLAY_MODE_TOP_PICK_BOARD, DISPLAY_MODE_TOP_PICK_SEARCH, DISPLAY_MODE_GRID_WITH_COMPACT_BOARDS, DISPLAY_MODE_HIGHLIGHT_NOTIFICATION, DISPLAY_MODE_EMPTY_ITEM, DISPLAY_MODE_SECTION_TITLE};
    }

    static {
        dh[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new ch(null);
    }

    private dh(String str, int i13, int i14) {
        super(str, i13);
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static dh valueOf(String str) {
        return (dh) Enum.valueOf(dh.class, str);
    }

    public static dh[] values() {
        return (dh[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
