package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i13, String str, @NotNull Function0<Unit> onClickCallback) {
        super(Integer.valueOf(t0.idea_pin_scheduling_container), i13, null, null, null, str, onClickCallback, 28, null);
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
    }
}
