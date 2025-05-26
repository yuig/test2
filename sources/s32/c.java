package s32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c OTHER = new c("OTHER", 0);
    public static final c HOME_DECOR = new c("HOME_DECOR", 1);
    public static final c FASHION = new c("FASHION", 2);
    public static final c FOOD_AND_DRINKS = new c("FOOD_AND_DRINKS", 3);
    public static final c QUOTES = new c("QUOTES", 4);
    public static final c WEDDING = new c("WEDDING", 5);
    public static final c HAIR_BEAUTY = new c("HAIR_BEAUTY", 6);
    public static final c DIY_CRAFTS = new c("DIY_CRAFTS", 7);
    public static final c TATTOOS = new c("TATTOOS", 8);
    public static final c HAIR = new c("HAIR", 9);
    public static final c NAIL = new c("NAIL", 10);
    public static final c MAKEUP = new c("MAKEUP", 11);

    private static final /* synthetic */ c[] $values() {
        return new c[]{OTHER, HOME_DECOR, FASHION, FOOD_AND_DRINKS, QUOTES, WEDDING, HAIR_BEAUTY, DIY_CRAFTS, TATTOOS, HAIR, NAIL, MAKEUP};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        return a.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f111058a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
