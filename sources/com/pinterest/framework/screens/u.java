package com.pinterest.framework.screens;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u SWITCH_TAB_ON_SCREEN_MANAGER_POP = new u("SWITCH_TAB_ON_SCREEN_MANAGER_POP", 0);
    public static final u TAB_CLICK = new u("TAB_CLICK", 1);
    public static final u GO_TO_HOME_FEED_UPSELL = new u("GO_TO_HOME_FEED_UPSELL", 2);
    public static final u WARM_START_AUTO_SWITCH_TO_HOME_TAB = new u("WARM_START_AUTO_SWITCH_TO_HOME_TAB", 3);
    public static final u NAVIGATION = new u("NAVIGATION", 4);

    private static final /* synthetic */ u[] $values() {
        return new u[]{SWITCH_TAB_ON_SCREEN_MANAGER_POP, TAB_CLICK, GO_TO_HOME_FEED_UPSELL, WARM_START_AUTO_SWITCH_TO_HOME_TAB, NAVIGATION};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
