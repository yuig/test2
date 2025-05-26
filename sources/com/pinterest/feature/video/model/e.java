package com.pinterest.feature.video.model;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BEGIN = new e("BEGIN", 0);
    public static final e UPLOADING = new e("UPLOADING", 1);
    public static final e TRANSCODING = new e("TRANSCODING", 2);
    public static final e PIN_CREATION = new e("PIN_CREATION", 3);
    public static final e IDEA_PIN_PRE_UPLOAD_BEGIN = new e("IDEA_PIN_PRE_UPLOAD_BEGIN", 4);
    public static final e IDEA_PIN_PRE_UPLOAD_UPLOADING = new e("IDEA_PIN_PRE_UPLOAD_UPLOADING", 5);
    public static final e IDEA_PIN_BEGIN = new e("IDEA_PIN_BEGIN", 6);
    public static final e IDEA_PIN_UPLOADING = new e("IDEA_PIN_UPLOADING", 7);
    public static final e IDEA_PIN_CREATION = new e("IDEA_PIN_CREATION", 8);
    public static final e IDEA_PIN_UPLOAD_FAILURE = new e("IDEA_PIN_UPLOAD_FAILURE", 9);
    public static final e SUCCESS = new e("SUCCESS", 10);
    public static final e FAILURE = new e("FAILURE", 11);
    public static final e CANCEL = new e("CANCEL", 12);
    public static final e CUSTOM = new e("CUSTOM", 13);

    private static final /* synthetic */ e[] $values() {
        return new e[]{BEGIN, UPLOADING, TRANSCODING, PIN_CREATION, IDEA_PIN_PRE_UPLOAD_BEGIN, IDEA_PIN_PRE_UPLOAD_UPLOADING, IDEA_PIN_BEGIN, IDEA_PIN_UPLOADING, IDEA_PIN_CREATION, IDEA_PIN_UPLOAD_FAILURE, SUCCESS, FAILURE, CANCEL, CUSTOM};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
