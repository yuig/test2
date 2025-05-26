package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;

    @NotNull
    public static final d2 Companion;
    public static final f2 NONE = new f2("NONE", 0);
    public static final f2 PIN_ICON = new f2("PIN_ICON", 1);
    public static final f2 PLUS_BUTTON_ICON = new f2("PLUS_BUTTON_ICON", 2);

    private static final /* synthetic */ f2[] $values() {
        return new f2[]{NONE, PIN_ICON, PLUS_BUTTON_ICON};
    }

    static {
        f2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new d2();
    }

    private f2(String str, int i13) {
    }

    public static final f2 findByValue(int i13) {
        Companion.getClass();
        return d2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = e2.f140814a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
