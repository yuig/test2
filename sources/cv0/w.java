package cv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class w extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z13, boolean z14, Integer num, Integer num2, @NotNull Function1<? super Boolean, Unit> onSelectionChanged, Integer num3, Function0<Unit> function0) {
        super(x0.allow_comments, num, num2, num3, function0, z13, z14, onSelectionChanged, 0, null, 768, null);
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
    }

    public /* synthetic */ w(boolean z13, boolean z14, Integer num, Integer num2, Function1 function1, Integer num3, Function0 function0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : num2, (i13 & 16) != 0 ? u.f53296l : function1, (i13 & 32) == 0 ? num3 : null, (i13 & 64) != 0 ? b.f53263m : function0);
    }
}
