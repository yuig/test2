package z42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final p Companion;
    public static final r SINGLE_IMAGE = new r("SINGLE_IMAGE", 0);
    public static final r CAROUSEL = new r("CAROUSEL", 1);
    public static final r VIDEO = new r("VIDEO", 2);
    public static final r STORYBOARD = new r("STORYBOARD", 3);
    public static final r STORY_PIN = new r("STORY_PIN", 4);
    public static final r COLLAGE_PIN = new r("COLLAGE_PIN", 5);
    public static final r LENS_IMAGE = new r("LENS_IMAGE", 6);
    public static final r VIRTUAL_TRY_ON_IMAGE = new r("VIRTUAL_TRY_ON_IMAGE", 7);
    public static final r PLACE = new r("PLACE", 8);
    public static final r UNIFIED_BUILDER = new r("UNIFIED_BUILDER", 9);

    private static final /* synthetic */ r[] $values() {
        return new r[]{SINGLE_IMAGE, CAROUSEL, VIDEO, STORYBOARD, STORY_PIN, COLLAGE_PIN, LENS_IMAGE, VIRTUAL_TRY_ON_IMAGE, PLACE, UNIFIED_BUILDER};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new p();
    }

    private r(String str, int i13) {
        super(str, i13);
    }

    public static final r findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 1:
                return SINGLE_IMAGE;
            case 2:
                return CAROUSEL;
            case 3:
                return VIDEO;
            case 4:
                return STORYBOARD;
            case 5:
                return STORY_PIN;
            case 6:
                return COLLAGE_PIN;
            case 7:
                return LENS_IMAGE;
            case 8:
                return VIRTUAL_TRY_ON_IMAGE;
            case 9:
                return PLACE;
            case 10:
                return UNIFIED_BUILDER;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (q.f140853a[ordinal()]) {
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
