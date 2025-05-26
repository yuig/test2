package nm1;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 NORMAL = new h0("NORMAL", 0);
    public static final h0 TRANSPARENT = new h0("TRANSPARENT", 1);

    private static final /* synthetic */ h0[] $values() {
        return new h0[]{NORMAL, TRANSPARENT};
    }

    static {
        h0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private h0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    public final int getBackgroundColor$headerBar_release() {
        int i13 = g0.f91429a[ordinal()];
        if (i13 == 1) {
            return eo1.a.sema_color_background_default;
        }
        if (i13 == 2) {
            return eo1.a.sema_color_background_transparent;
        }
        throw new NoWhenBranchMatchedException();
    }
}
