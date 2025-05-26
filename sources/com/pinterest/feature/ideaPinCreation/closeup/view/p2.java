package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p2[] $VALUES;
    public static final p2 BACKGROUND;
    public static final p2 CANVAS;
    public static final p2 DRAWING;
    public static final p2 MEDIA;
    public static final p2 STICKER;
    public static final p2 TEXT;
    private final Integer colorRes;
    private final Integer iconRes;
    private final int idRes;
    private final Integer textRes;

    private static final /* synthetic */ p2[] $values() {
        return new p2[]{BACKGROUND, CANVAS, TEXT, MEDIA, STICKER, DRAWING};
    }

    static {
        String str = "BACKGROUND";
        int i13 = 0;
        BACKGROUND = new p2(str, i13, null, Integer.valueOf(aq1.h.story_pin_background_color), aq1.d.idea_pin_action_button_background, null, 8, null);
        Integer num = null;
        String str2 = "CANVAS";
        int i14 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CANVAS = new p2(str2, 1, Integer.valueOf(aq1.c.ic_aspect_ratio_nonpds), Integer.valueOf(aq1.h.idea_pin_canvas_size), m60.t0.idea_pin_action_button_canvas, num, i14, defaultConstructorMarker);
        Integer num2 = null;
        String str3 = "TEXT";
        int i15 = 8;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        TEXT = new p2(str3, 2, Integer.valueOf(aq1.c.ic_text_nonpds), Integer.valueOf(aq1.h.story_pin_text), aq1.d.idea_pin_action_button_text, num2, i15, defaultConstructorMarker2);
        String str4 = "MEDIA";
        MEDIA = new p2(str4, 3, Integer.valueOf(sm1.b.ic_image_gestalt), Integer.valueOf(aq1.h.idea_pin_media), aq1.d.idea_pin_action_button_media, num, i14, defaultConstructorMarker);
        String str5 = "STICKER";
        STICKER = new p2(str5, 4, Integer.valueOf(aq1.c.ic_sticker_nonpds), Integer.valueOf(aq1.h.idea_pin_stickers), aq1.d.idea_pin_action_button_sticker, num2, i15, defaultConstructorMarker2);
        String str6 = "DRAWING";
        DRAWING = new p2(str6, 5, Integer.valueOf(ga2.c.ic_draw), Integer.valueOf(aq1.h.idea_pin_draw), aq1.d.idea_pin_action_button_drawing, num, i14, defaultConstructorMarker);
        p2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private p2(String str, int i13, Integer num, Integer num2, int i14, Integer num3) {
        this.iconRes = num;
        this.textRes = num2;
        this.idRes = i14;
        this.colorRes = num3;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) $VALUES.clone();
    }

    public final Integer getColorRes() {
        return this.colorRes;
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final int getIdRes() {
        return this.idRes;
    }

    public final Integer getTextRes() {
        return this.textRes;
    }

    public /* synthetic */ p2(String str, int i13, Integer num, Integer num2, int i14, Integer num3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, num, num2, i14, (i15 & 8) != 0 ? Integer.valueOf(eo1.b.color_white_0) : num3);
    }
}
