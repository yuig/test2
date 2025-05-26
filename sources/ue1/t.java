package ue1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t implements p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @NotNull
    public static final s Companion;
    public static final t PIN_REP = new t("PIN_REP", 0);
    public static final t IDEA_PIN_REP = new t("IDEA_PIN_REP", 1);
    public static final t SHOPPING_PIN_REP = new t("SHOPPING_PIN_REP", 2);
    public static final t IMAGE_ONLY_REP = new t("IMAGE_ONLY_REP", 3);

    private static final /* synthetic */ t[] $values() {
        return new t[]{PIN_REP, IDEA_PIN_REP, SHOPPING_PIN_REP, IMAGE_ONLY_REP};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new s();
    }

    private t(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
