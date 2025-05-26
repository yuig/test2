package o32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c AGGREGATED_COMMENT = new c("AGGREGATED_COMMENT", 0);
    public static final c USER_DID_IT_DATA = new c("USER_DID_IT_DATA", 1);

    private static final /* synthetic */ c[] $values() {
        return new c[]{AGGREGATED_COMMENT, USER_DID_IT_DATA};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return AGGREGATED_COMMENT;
        }
        if (i13 != 2) {
            return null;
        }
        return USER_DID_IT_DATA;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = b.f92869a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
