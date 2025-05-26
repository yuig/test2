package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;

    @NotNull
    public static final b0 Companion;
    public static final d0 PRIMARY = new d0("PRIMARY", 0);
    public static final d0 SECONDARY = new d0("SECONDARY", 1);
    public static final d0 TERTIARY = new d0("TERTIARY", 2);
    public static final d0 SHOPPING = new d0("SHOPPING", 3);
    public static final d0 ALWAYS_LIGHT = new d0("ALWAYS_LIGHT", 4);
    public static final d0 ALWAYS_DARK = new d0("ALWAYS_DARK", 5);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{PRIMARY, SECONDARY, TERTIARY, SHOPPING, ALWAYS_LIGHT, ALWAYS_DARK};
    }

    static {
        d0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new b0();
    }

    private d0(String str, int i13) {
    }

    public static final d0 findByValue(int i13) {
        Companion.getClass();
        return b0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (c0.f71476a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
