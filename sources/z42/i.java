package z42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final i UNKNOWN = new i("UNKNOWN", 0);
    public static final i SINGLE_IMAGE = new i("SINGLE_IMAGE", 1);
    public static final i SINGLE_VIDEO = new i("SINGLE_VIDEO", 2);
    public static final i MULTI_IMAGE = new i("MULTI_IMAGE", 3);
    public static final i MULTI_VIDEO = new i("MULTI_VIDEO", 4);
    public static final i MIXED = new i("MIXED", 5);
    public static final i SHUFFLES = new i("SHUFFLES", 6);

    private static final /* synthetic */ i[] $values() {
        return new i[]{UNKNOWN, SINGLE_IMAGE, SINGLE_VIDEO, MULTI_IMAGE, MULTI_VIDEO, MIXED, SHUFFLES};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new g();
    }

    private i(String str, int i13) {
        super(str, i13);
    }

    public static final i findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return UNKNOWN;
            case 1:
                return SINGLE_IMAGE;
            case 2:
                return SINGLE_VIDEO;
            case 3:
                return MULTI_IMAGE;
            case 4:
                return MULTI_VIDEO;
            case 5:
                return MIXED;
            case 6:
                return SHUFFLES;
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
        switch (h.f140850a[ordinal()]) {
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
