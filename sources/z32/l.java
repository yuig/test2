package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final j Companion;
    public static final l NONE = new l("NONE", 0);
    public static final l FOOTER = new l("FOOTER", 1);
    public static final l HEADER = new l("HEADER", 2);
    public static final l END_OVERLAY = new l("END_OVERLAY", 3);
    public static final l HEADER_AND_END_OVERFLOW = new l("HEADER_AND_END_OVERFLOW", 4);
    public static final l END_ITEM = new l("END_ITEM", 5);

    private static final /* synthetic */ l[] $values() {
        return new l[]{NONE, FOOTER, HEADER, END_OVERLAY, HEADER_AND_END_OVERFLOW, END_ITEM};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new j();
    }

    private l(String str, int i13) {
    }

    public static final l findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return FOOTER;
        }
        if (i13 == 2) {
            return HEADER;
        }
        if (i13 == 3) {
            return END_OVERLAY;
        }
        if (i13 == 4) {
            return HEADER_AND_END_OVERFLOW;
        }
        if (i13 != 5) {
            return null;
        }
        return END_ITEM;
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
        switch (k.f140821a[ordinal()]) {
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
