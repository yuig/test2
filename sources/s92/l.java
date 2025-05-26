package s92;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final j Companion;
    public static final l FIRST_START = new l("FIRST_START", 0);
    public static final l COLD_START = new l("COLD_START", 1);
    public static final l WARM_START = new l("WARM_START", 2);
    public static final l USER_NAVIGATION = new l("USER_NAVIGATION", 3);
    public static final l STORY_PIN_NAVIGATION = new l("STORY_PIN_NAVIGATION", 4);
    public static final l AUTOPLAYING_USER_NAVIGATION = new l("AUTOPLAYING_USER_NAVIGATION", 5);
    public static final l FIRST_PAGE_LOAD = new l("FIRST_PAGE_LOAD", 6);
    public static final l FIRST_PAGE_LOAD_VISIBLE_ONLY = new l("FIRST_PAGE_LOAD_VISIBLE_ONLY", 7);

    private static final /* synthetic */ l[] $values() {
        return new l[]{FIRST_START, COLD_START, WARM_START, USER_NAVIGATION, STORY_PIN_NAVIGATION, AUTOPLAYING_USER_NAVIGATION, FIRST_PAGE_LOAD, FIRST_PAGE_LOAD_VISIBLE_ONLY};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new j();
    }

    private l(String str, int i13) {
    }

    public static final l findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 1:
                return FIRST_START;
            case 2:
                return COLD_START;
            case 3:
                return WARM_START;
            case 4:
                return USER_NAVIGATION;
            case 5:
                return STORY_PIN_NAVIGATION;
            case 6:
                return AUTOPLAYING_USER_NAVIGATION;
            case 7:
                return FIRST_PAGE_LOAD;
            case 8:
                return FIRST_PAGE_LOAD_VISIBLE_ONLY;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (k.f112111a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
