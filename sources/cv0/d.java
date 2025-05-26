package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i13, String str, boolean z13, @NotNull Function0<Unit> onClickCallback) {
        super(null, i13, null, null, z13 ? rm1.q.LOCK : null, str, onClickCallback, 13, null);
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
    }
}
