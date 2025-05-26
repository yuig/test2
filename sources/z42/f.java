package z42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f DEFAULT = new f("DEFAULT", 0);
    public static final f PLACES = new f("PLACES", 1);
    public static final f SCREENSHOT = new f("SCREENSHOT", 2);
    public static final f QUICK_SAVES = new f("QUICK_SAVES", 3);
    public static final f TRAVEL = new f("TRAVEL", 4);
    public static final f CLASS_COMMUNITY = new f("CLASS_COMMUNITY", 5);
    public static final f TAUGHT_CLASSES = new f("TAUGHT_CLASSES", 6);
    public static final f TAKING_CLASSES = new f("TAKING_CLASSES", 7);
    public static final f QUICK_CREATES = new f("QUICK_CREATES", 8);
    public static final f SHUFFLES = new f("SHUFFLES", 9);
    public static final f GENERATED_CONTENT = new f("GENERATED_CONTENT", 10);
    public static final f CUTOUTS = new f("CUTOUTS", 11);
    public static final f COLLAGE_ITEMS = new f("COLLAGE_ITEMS", 12);
    public static final f WISHLIST = new f("WISHLIST", 13);
    public static final f FEATURED_BOARD = new f("FEATURED_BOARD", 14);
    public static final f TPD_SOCIAL = new f("TPD_SOCIAL", 15);
    public static final f AUTOMAGICAL = new f("AUTOMAGICAL", 16);

    private static final /* synthetic */ f[] $values() {
        return new f[]{DEFAULT, PLACES, SCREENSHOT, QUICK_SAVES, TRAVEL, CLASS_COMMUNITY, TAUGHT_CLASSES, TAKING_CLASSES, QUICK_CREATES, SHUFFLES, GENERATED_CONTENT, CUTOUTS, COLLAGE_ITEMS, WISHLIST, FEATURED_BOARD, TPD_SOCIAL, AUTOMAGICAL};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return DEFAULT;
            case 1:
                return PLACES;
            case 2:
                return SCREENSHOT;
            case 3:
                return QUICK_SAVES;
            case 4:
                return TRAVEL;
            case 5:
                return CLASS_COMMUNITY;
            case 6:
                return TAUGHT_CLASSES;
            case 7:
                return TAKING_CLASSES;
            case 8:
                return QUICK_CREATES;
            case 9:
                return SHUFFLES;
            case 10:
                return GENERATED_CONTENT;
            case 11:
                return CUTOUTS;
            case 12:
                return COLLAGE_ITEMS;
            case 13:
                return WISHLIST;
            case 14:
                return FEATURED_BOARD;
            case 15:
                return TPD_SOCIAL;
            case 16:
                return AUTOMAGICAL;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (e.f140849a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
