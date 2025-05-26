package g42;

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
    public static final c SPOTLIGHT_DOT = new c("SPOTLIGHT_DOT", 0);
    public static final c BACKEND_SCREEN_OBJECT = new c("BACKEND_SCREEN_OBJECT", 1);
    public static final c FRONTEND_SCREEN_OBJECT = new c("FRONTEND_SCREEN_OBJECT", 2);
    public static final c STELA_DOT = new c("STELA_DOT", 3);
    public static final c DEFAULT_CROP = new c("DEFAULT_CROP", 4);
    public static final c CUSTOM_CROP = new c("CUSTOM_CROP", 5);
    public static final c SINGLE_PROMINENT_STELA_DOT = new c("SINGLE_PROMINENT_STELA_DOT", 6);
    public static final c SHOPPING_MODULE_CLOSEUP = new c("SHOPPING_MODULE_CLOSEUP", 7);
    public static final c CUTOUT = new c("CUTOUT", 8);
    public static final c P2Z = new c("P2Z", 9);

    private static final /* synthetic */ c[] $values() {
        return new c[]{SPOTLIGHT_DOT, BACKEND_SCREEN_OBJECT, FRONTEND_SCREEN_OBJECT, STELA_DOT, DEFAULT_CROP, CUSTOM_CROP, SINGLE_PROMINENT_STELA_DOT, SHOPPING_MODULE_CLOSEUP, CUTOUT, P2Z};
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
        switch (i13) {
            case 1:
                return SPOTLIGHT_DOT;
            case 2:
                return BACKEND_SCREEN_OBJECT;
            case 3:
                return FRONTEND_SCREEN_OBJECT;
            case 4:
                return STELA_DOT;
            case 5:
                return DEFAULT_CROP;
            case 6:
                return CUSTOM_CROP;
            case 7:
                return SINGLE_PROMINENT_STELA_DOT;
            case 8:
                return SHOPPING_MODULE_CLOSEUP;
            case 9:
                return CUTOUT;
            case 10:
                return P2Z;
            default:
                return null;
        }
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
        switch (b.f63536a[ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
