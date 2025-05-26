package u32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final i SAVED = new i("SAVED", 0);
    public static final i CREATED = new i("CREATED", 1);
    public static final i SHOP = new i("SHOP", 2);
    public static final i TRIED = new i("TRIED", 3);
    public static final i BOARDS = new i("BOARDS", 4);
    public static final i PINS = new i("PINS", 5);
    public static final i COLLAGES = new i("COLLAGES", 6);

    private static final /* synthetic */ i[] $values() {
        return new i[]{SAVED, CREATED, SHOP, TRIED, BOARDS, PINS, COLLAGES};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new g();
    }

    private i(String str, int i13) {
    }

    public static final i findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return SAVED;
            case 1:
                return CREATED;
            case 2:
                return SHOP;
            case 3:
                return TRIED;
            case 4:
                return BOARDS;
            case 5:
                return PINS;
            case 6:
                return COLLAGES;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (h.f120162a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
