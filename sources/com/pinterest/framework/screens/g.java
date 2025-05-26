package com.pinterest.framework.screens;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final f Companion;

    @NotNull
    private static final xk2.k valueArray$delegate;
    public static final g DEFAULT = new g("DEFAULT", 0);
    public static final g MODAL = new g("MODAL", 1);
    public static final g SYSTEM = new g("SYSTEM", 2);
    public static final g EDUCATION = new g("EDUCATION", 3);
    public static final g EMBED = new g("EMBED", 4);
    public static final g UNDERLYING_STILL = new g("UNDERLYING_STILL", 5);

    private static final /* synthetic */ g[] $values() {
        return new g[]{DEFAULT, MODAL, SYSTEM, EDUCATION, EMBED, UNDERLYING_STILL};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new f();
        valueArray$delegate = xk2.m.b(e.f49213i);
    }

    private g(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
