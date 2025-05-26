package com.pinterest.api.model;

import com.google.android.gms.ads.AdError;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pc0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ pc0[] $VALUES;

    @NotNull
    private final String value;
    public static final pc0 REGISTER_TYPE_VIDEO = new pc0("REGISTER_TYPE_VIDEO", 0, "video");
    public static final pc0 REGISTER_TYPE_COVER_VIDEO = new pc0("REGISTER_TYPE_COVER_VIDEO", 1, "user-profile-cover-video");
    public static final pc0 REGISTER_TYPE_STORY_PIN_VIDEO = new pc0("REGISTER_TYPE_STORY_PIN_VIDEO", 2, "video-story-pin");
    public static final pc0 REGISTER_TYPE_CLASSES_TEASER_VIDEO = new pc0("REGISTER_TYPE_CLASSES_TEASER_VIDEO", 3, "classes-teaser-videos");
    public static final pc0 REGISTER_TYPE_UNDEFINED = new pc0("REGISTER_TYPE_UNDEFINED", 4, AdError.UNDEFINED_DOMAIN);
    public static final pc0 REGISTER_TYPE_NOOP_VIDEO_PIPELINE = new pc0("REGISTER_TYPE_NOOP_VIDEO_PIPELINE", 5, "noop-upload");

    private static final /* synthetic */ pc0[] $values() {
        return new pc0[]{REGISTER_TYPE_VIDEO, REGISTER_TYPE_COVER_VIDEO, REGISTER_TYPE_STORY_PIN_VIDEO, REGISTER_TYPE_CLASSES_TEASER_VIDEO, REGISTER_TYPE_UNDEFINED, REGISTER_TYPE_NOOP_VIDEO_PIPELINE};
    }

    static {
        pc0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private pc0(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static pc0 valueOf(String str) {
        return (pc0) Enum.valueOf(pc0.class, str);
    }

    public static pc0[] values() {
        return (pc0[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
