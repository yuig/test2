package q42;

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
    public static final c NONE = new c("NONE", 0);
    public static final c SHOP_BAG = new c("SHOP_BAG", 1);
    public static final c SHOP_TAB = new c("SHOP_TAB", 2);
    public static final c FILTER = new c("FILTER", 3);
    public static final c EYES = new c("EYES", 4);
    public static final c LIPS = new c("LIPS", 5);
    public static final c PROFILE = new c("PROFILE", 6);
    public static final c DROPDOWN = new c("DROPDOWN", 7);
    public static final c ANGLED_PIN = new c("ANGLED_PIN", 8);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NONE, SHOP_BAG, SHOP_TAB, FILTER, EYES, LIPS, PROFILE, DROPDOWN, ANGLED_PIN};
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
        switch (b.f102394a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
