package q32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c ANIMALS = new c("ANIMALS", 0);
    public static final c ARCHITECTURE = new c("ARCHITECTURE", 1);
    public static final c ART = new c("ART", 2);
    public static final c BEAUTY = new c("BEAUTY", 3);
    public static final c CHILDRENS_FASHION = new c("CHILDRENS_FASHION", 4);
    public static final c DESIGN = new c("DESIGN", 5);
    public static final c DIY_AND_CRAFTS = new c("DIY_AND_CRAFTS", 6);
    public static final c EDUCATION = new c("EDUCATION", 7);
    public static final c ELECTRONICS = new c("ELECTRONICS", 8);
    public static final c ENTERTAINMENT = new c("ENTERTAINMENT", 9);
    public static final c EVENT_PLANNING = new c("EVENT_PLANNING", 10);
    public static final c FINANCE = new c("FINANCE", 11);
    public static final c FOOD_AND_DRINKS = new c("FOOD_AND_DRINKS", 12);
    public static final c HEALTH = new c("HEALTH", 13);
    public static final c HOME_DECOR = new c("HOME_DECOR", 14);
    public static final c GARDENING = new c("GARDENING", 15);
    public static final c MENS_FASHION = new c("MENS_FASHION", 16);
    public static final c PARENTING = new c("PARENTING", 17);
    public static final c QUOTES = new c("QUOTES", 18);
    public static final c SPORT = new c("SPORT", 19);
    public static final c TRAVEL = new c("TRAVEL", 20);
    public static final c VEHICLES = new c("VEHICLES", 21);
    public static final c WEDDING = new c("WEDDING", 22);
    public static final c WOMENS_FASHION = new c("WOMENS_FASHION", 23);

    private static final /* synthetic */ c[] $values() {
        return new c[]{ANIMALS, ARCHITECTURE, ART, BEAUTY, CHILDRENS_FASHION, DESIGN, DIY_AND_CRAFTS, EDUCATION, ELECTRONICS, ENTERTAINMENT, EVENT_PLANNING, FINANCE, FOOD_AND_DRINKS, HEALTH, HOME_DECOR, GARDENING, MENS_FASHION, PARENTING, QUOTES, SPORT, TRAVEL, VEHICLES, WEDDING, WOMENS_FASHION};
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
        switch (b.f102304a[ordinal()]) {
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
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
