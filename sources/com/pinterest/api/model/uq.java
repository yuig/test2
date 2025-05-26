package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uq {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ uq[] $VALUES;
    public static final uq TEXT = new uq("TEXT", 0);
    public static final uq MENTION = new uq("MENTION", 1);
    public static final uq PRODUCT_TAG = new uq("PRODUCT_TAG", 2);
    public static final uq VTO_PRODUCT_TAG = new uq("VTO_PRODUCT_TAG", 3);
    public static final uq STICKER = new uq("STICKER", 4);
    public static final uq BOARD_STICKER = new uq("BOARD_STICKER", 5);
    public static final uq IMAGE_STICKER = new uq("IMAGE_STICKER", 6);

    private static final /* synthetic */ uq[] $values() {
        return new uq[]{TEXT, MENTION, PRODUCT_TAG, VTO_PRODUCT_TAG, STICKER, BOARD_STICKER, IMAGE_STICKER};
    }

    static {
        uq[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private uq(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static uq valueOf(String str) {
        return (uq) Enum.valueOf(uq.class, str);
    }

    public static uq[] values() {
        return (uq[]) $VALUES.clone();
    }
}
