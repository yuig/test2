package z32;

import kotlin.NoWhenBranchMatchedException;
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
    public static final f TEXT_ONLY = new f("TEXT_ONLY", 1);
    public static final f MODULE_IN_FEED = new f("MODULE_IN_FEED", 2);
    public static final f PINTEREST_PICKS = new f("PINTEREST_PICKS", 3);
    public static final f GULP = new f("GULP", 4);
    public static final f NO_HEADER = new f("NO_HEADER", 5);

    private static final /* synthetic */ f[] $values() {
        return new f[]{DEFAULT, TEXT_ONLY, MODULE_IN_FEED, PINTEREST_PICKS, GULP, NO_HEADER};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        return d.a(i13);
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
        switch (e.f140813a[ordinal()]) {
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
