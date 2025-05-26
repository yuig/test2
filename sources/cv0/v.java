package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class v extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z13, @NotNull Function1<? super Boolean, Unit> onSelectionChanged, int i13) {
        super(aq1.h.idea_pin_metadata_paid_partnership_label_title, null, null, null, null, z13, false, onSelectionChanged, i13, null, 606, null);
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
    }

    public /* synthetic */ v(boolean z13, Function1 function1, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, (i14 & 2) != 0 ? u.f53295k : function1, i13);
    }
}
