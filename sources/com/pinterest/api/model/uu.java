package com.pinterest.api.model;

import com.google.android.gms.ads.AdError;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uu {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ uu[] $VALUES;

    @NotNull
    private final String value;
    public static final uu VIDEO = new uu("VIDEO", 0, "video");
    public static final uu IMAGE = new uu("IMAGE", 1, "image");
    public static final uu MULTI = new uu("MULTI", 2, "multi");
    public static final uu UNDEFINED = new uu("UNDEFINED", 3, AdError.UNDEFINED_DOMAIN);

    private static final /* synthetic */ uu[] $values() {
        return new uu[]{VIDEO, IMAGE, MULTI, UNDEFINED};
    }

    static {
        uu[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private uu(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static uu valueOf(String str) {
        return (uu) Enum.valueOf(uu.class, str);
    }

    public static uu[] values() {
        return (uu[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
