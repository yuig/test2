package ve;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum d {
    MTML_INTEGRITY_DETECT,
    MTML_APP_EVENT_PREDICTION;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        d[] valuesCustom = values();
        return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String toKey() {
        int i13 = c.f125661a[ordinal()];
        if (i13 == 1) {
            return "integrity_detect";
        }
        if (i13 == 2) {
            return "app_event_pred";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String toUseCase() {
        int i13 = c.f125661a[ordinal()];
        if (i13 == 1) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (i13 == 2) {
            return "MTML_APP_EVENT_PRED";
        }
        throw new NoWhenBranchMatchedException();
    }
}
