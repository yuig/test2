package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c EXPANDED = new c("EXPANDED", 0);
    public static final c COLLAPSED = new c("COLLAPSED", 1);
    public static final c PREVIEW_EXPANDED = new c("PREVIEW_EXPANDED", 2);
    public static final c PREVIEW_COLLAPSED = new c("PREVIEW_COLLAPSED", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{EXPANDED, COLLAPSED, PREVIEW_EXPANDED, PREVIEW_COLLAPSED};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return EXPANDED;
        }
        if (i13 == 1) {
            return COLLAPSED;
        }
        if (i13 == 2) {
            return PREVIEW_EXPANDED;
        }
        if (i13 != 3) {
            return null;
        }
        return PREVIEW_COLLAPSED;
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
        int i13 = b.f140808a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        if (i13 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
