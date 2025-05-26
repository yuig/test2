package xm1;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g WORKFLOW_STATUS_WARNING = new g("WORKFLOW_STATUS_WARNING", 0);
    public static final g WORKFLOW_STATUS_PROBLEM = new g("WORKFLOW_STATUS_PROBLEM", 1);

    private static final /* synthetic */ g[] $values() {
        return new g[]{WORKFLOW_STATUS_WARNING, WORKFLOW_STATUS_PROBLEM};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private g(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getColor() {
        int i13 = f.f135373a[ordinal()];
        if (i13 == 1) {
            return eo1.a.comp_modalalert_color_icon_warning;
        }
        if (i13 == 2) {
            return eo1.a.comp_modalalert_color_icon_error;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final rm1.q getIcon() {
        int i13 = f.f135373a[ordinal()];
        if (i13 == 1) {
            return rm1.q.WORKFLOW_STATUS_WARNING;
        }
        if (i13 == 2) {
            return rm1.q.WORKFLOW_STATUS_PROBLEM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
