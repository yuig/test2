package we1;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f129709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h0 h0Var) {
        super(1);
        this.f129709i = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintLayout.LayoutParams clearAndUpdateLayoutParams = (ConstraintLayout.LayoutParams) obj;
        Intrinsics.checkNotNullParameter(clearAndUpdateLayoutParams, "$this$clearAndUpdateLayoutParams");
        clearAndUpdateLayoutParams.f17691t = 0;
        clearAndUpdateLayoutParams.f17693v = 0;
        h0 h0Var = this.f129709i;
        clearAndUpdateLayoutParams.f17673j = h0Var.f129382i.getId();
        clearAndUpdateLayoutParams.f17677l = h0Var.f129382i.getId();
        return Unit.f80348a;
    }
}
