package we1;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f129354i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var) {
        super(1);
        this.f129354i = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintLayout.LayoutParams clearAndUpdateLayoutParams = (ConstraintLayout.LayoutParams) obj;
        Intrinsics.checkNotNullParameter(clearAndUpdateLayoutParams, "$this$clearAndUpdateLayoutParams");
        h0 h0Var = this.f129354i;
        clearAndUpdateLayoutParams.f17673j = h0Var.f129382i.getId();
        clearAndUpdateLayoutParams.f17693v = h0Var.f129382i.getId();
        return Unit.f80348a;
    }
}
