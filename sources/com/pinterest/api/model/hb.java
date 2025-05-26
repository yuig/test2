package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hb {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ hb[] $VALUES;

    @NotNull
    private final h32.f1 eventType;
    public static final hb BULK_SELECT_ALL_PIN_DELETE = new hb("BULK_SELECT_ALL_PIN_DELETE", 0, h32.f1.BULK_SELECT_ALL_PIN_DELETE);
    public static final hb BULK_SELECT_ALL_PIN_MOVE = new hb("BULK_SELECT_ALL_PIN_MOVE", 1, h32.f1.BULK_SELECT_ALL_PIN_MOVE);
    public static final hb BULK_PIN_DELETE = new hb("BULK_PIN_DELETE", 2, h32.f1.BULK_PIN_DELETE);
    public static final hb BULK_PIN_MOVE = new hb("BULK_PIN_MOVE", 3, h32.f1.BULK_PIN_MOVE);
    public static final hb BOARD_DELETE = new hb("BOARD_DELETE", 4, h32.f1.BOARD_DELETE);
    public static final hb BOARD_SECTION_DELETE = new hb("BOARD_SECTION_DELETE", 5, h32.f1.BOARD_SECTION_DELETE);
    public static final hb BOARD_SECTION_REMOVE_PINS = new hb("BOARD_SECTION_REMOVE_PINS", 6, h32.f1.BOARD_SECTION_REMOVE_PINS);
    public static final hb BOARD_MERGE = new hb("BOARD_MERGE", 7, h32.f1.BOARD_MERGE);
    public static final hb BOARD_SECTION_MERGE = new hb("BOARD_SECTION_MERGE", 8, h32.f1.BOARD_SECTION_MERGE);
    public static final hb BOARD_SECTION_CREATE = new hb("BOARD_SECTION_CREATE", 9, h32.f1.BOARD_SECTION_CREATE);
    public static final hb BOARD_HEADER_IMAGE_CREATE = new hb("BOARD_HEADER_IMAGE_CREATE", 10, h32.f1.IMAGE_UPLOAD_ATTEMPTED);

    private static final /* synthetic */ hb[] $values() {
        return new hb[]{BULK_SELECT_ALL_PIN_DELETE, BULK_SELECT_ALL_PIN_MOVE, BULK_PIN_DELETE, BULK_PIN_MOVE, BOARD_DELETE, BOARD_SECTION_DELETE, BOARD_SECTION_REMOVE_PINS, BOARD_MERGE, BOARD_SECTION_MERGE, BOARD_SECTION_CREATE, BOARD_HEADER_IMAGE_CREATE};
    }

    static {
        hb[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private hb(String str, int i13, h32.f1 f1Var) {
        this.eventType = f1Var;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static hb valueOf(String str) {
        return (hb) Enum.valueOf(hb.class, str);
    }

    public static hb[] values() {
        return (hb[]) $VALUES.clone();
    }

    @NotNull
    public final h32.f1 getEventType() {
        return this.eventType;
    }
}
