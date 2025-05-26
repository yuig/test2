package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class x extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z13, boolean z14, Integer num, Integer num2, @NotNull Function1<? super Boolean, Unit> onSelectionChanged) {
        super(c52.e.show_shopping_recommendations_title, num, num2, null, null, z13, z14, onSelectionChanged, 0, null, 792, null);
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
    }

    public /* synthetic */ x(boolean z13, boolean z14, Integer num, Integer num2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, z14, num, num2, (i13 & 16) != 0 ? u.f53297m : function1);
    }
}
