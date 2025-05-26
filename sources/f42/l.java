package f42;

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
    public static final l NONE = new l("NONE", 0);
    public static final l PRODUCT = new l("PRODUCT", 1);
    public static final l FULL_LOOK = new l("FULL_LOOK", 2);
    public static final l PARTIAL_LOOK = new l("PARTIAL_LOOK", 3);
    public static final l LENS_PHOTO = new l("LENS_PHOTO", 4);

    private static final /* synthetic */ l[] $values() {
        return new l[]{NONE, PRODUCT, FULL_LOOK, PARTIAL_LOOK, LENS_PHOTO};
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
        return j.a(i13);
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
        int i13 = k.f61076a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
