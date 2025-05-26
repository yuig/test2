package com.pinterest.api.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uj0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ uj0[] $VALUES;

    @NotNull
    private final String value;
    public static final uj0 REGISTERED = new uj0("REGISTERED", 0, "registered");
    public static final uj0 PROCESSING = new uj0("PROCESSING", 1, "processing");
    public static final uj0 SUCCEEDED = new uj0("SUCCEEDED", 2, "succeeded");
    public static final uj0 FAILED = new uj0("FAILED", 3, "failed");

    private static final /* synthetic */ uj0[] $values() {
        return new uj0[]{REGISTERED, PROCESSING, SUCCEEDED, FAILED};
    }

    static {
        uj0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private uj0(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static uj0 valueOf(String str) {
        return (uj0) Enum.valueOf(uj0.class, str);
    }

    public static uj0[] values() {
        return (uj0[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
