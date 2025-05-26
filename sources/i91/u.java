package i91;

import android.content.Context;
import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u CLOSE_UP = new u("CLOSE_UP", 0);
    public static final u SEARCH_FEED = new u("SEARCH_FEED", 1);
    public static final u IDEA_PIN = new u("IDEA_PIN", 2);

    private static final /* synthetic */ u[] $values() {
        return new u[]{CLOSE_UP, SEARCH_FEED, IDEA_PIN};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final float getPreferredIconRatioForAnimation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDimension(a62.b.send_share_app_icon_size) / context.getResources().getDimension(a62.b.one_tap_share_large_size);
    }

    public final int getPreferredSize(@NotNull Context context) {
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int i14 = t.f71903a[ordinal()];
        if (i14 == 1) {
            i13 = a62.b.one_tap_share_large_size;
        } else if (i14 == 2) {
            i13 = a62.b.one_tap_share_medium_size;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = a62.b.one_tap_share_small_size;
        }
        return (int) resources.getDimension(i13);
    }
}
