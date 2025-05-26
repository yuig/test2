package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z13, @NotNull Function0<Unit> onClickCallback) {
        super(null, z13 ? aq1.h.idea_pin_metadata_paid_partnership_tag_title_new : aq1.h.idea_pin_metadata_paid_partnership_tag_title, null, null, null, null, onClickCallback, 61, null);
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
    }

    public /* synthetic */ f(boolean z13, Function0 function0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z13, function0);
    }
}
