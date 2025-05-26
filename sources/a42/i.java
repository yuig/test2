package a42;

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
    public static final i VIEWING_IPS = new i("VIEWING_IPS", 0);
    public static final i FEATURE_ISSUE = new i("FEATURE_ISSUE", 1);
    public static final i PUBLISH_ISSUE = new i("PUBLISH_ISSUE", 2);
    public static final i USER_COMPREHENSION = new i("USER_COMPREHENSION", 3);
    public static final i OTHER = new i("OTHER", 4);
    public static final i BROWSER_EXTENSION_ISSUE = new i("BROWSER_EXTENSION_ISSUE", 5);

    private static final /* synthetic */ i[] $values() {
        return new i[]{VIEWING_IPS, FEATURE_ISSUE, PUBLISH_ISSUE, USER_COMPREHENSION, OTHER, BROWSER_EXTENSION_ISSUE};
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
        if (i13 == 0) {
            return VIEWING_IPS;
        }
        if (i13 == 1) {
            return FEATURE_ISSUE;
        }
        if (i13 == 2) {
            return PUBLISH_ISSUE;
        }
        if (i13 == 3) {
            return USER_COMPREHENSION;
        }
        if (i13 == 4) {
            return OTHER;
        }
        if (i13 != 5) {
            return null;
        }
        return BROWSER_EXTENSION_ISSUE;
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
        switch (h.f703a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
