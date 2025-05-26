package com.pinterest.api.model;

import java.util.HashMap;
import java.util.Set;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yp0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ yp0[] $VALUES;

    @NotNull
    public static final xp0 Companion;
    public static final yp0 DIY_HOME;
    public static final yp0 RECIPE;

    @NotNull
    private static final HashMap<Integer, Set<Integer>> templateCategories;
    private final int type;

    private static final /* synthetic */ yp0[] $values() {
        return new yp0[]{RECIPE, DIY_HOME};
    }

    static {
        yp0 yp0Var = new yp0("RECIPE", 0, 1);
        RECIPE = yp0Var;
        yp0 yp0Var2 = new yp0("DIY_HOME", 1, 2);
        DIY_HOME = yp0Var2;
        yp0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new xp0(null);
        templateCategories = kotlin.collections.z0.f(new Pair(Integer.valueOf(yp0Var.type), kotlin.collections.h1.f(Integer.valueOf(rk0.COOK_TIME.getCategory()), Integer.valueOf(rk0.SERVING_SIZE.getCategory()))), new Pair(Integer.valueOf(yp0Var2.type), kotlin.collections.g1.b(Integer.valueOf(rk0.DIFFICULTY.getCategory()))));
    }

    private yp0(String str, int i13, int i14) {
        this.type = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static yp0 valueOf(String str) {
        return (yp0) Enum.valueOf(yp0.class, str);
    }

    public static yp0[] values() {
        return (yp0[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
