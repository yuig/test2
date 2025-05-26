package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i13, String str, @NotNull Function0<Unit> onClickCallback) {
        super(null, i13, null, null, null, str, onClickCallback, 29, null);
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
    }
}
