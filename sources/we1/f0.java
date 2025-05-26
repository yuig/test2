package we1;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f129345i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var) {
        super(1);
        this.f129345i = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintLayout.LayoutParams clearAndUpdateLayoutParams = (ConstraintLayout.LayoutParams) obj;
        Intrinsics.checkNotNullParameter(clearAndUpdateLayoutParams, "$this$clearAndUpdateLayoutParams");
        h0 h0Var = this.f129345i;
        clearAndUpdateLayoutParams.f17677l = h0Var.f129382i.getId();
        clearAndUpdateLayoutParams.f17693v = h0Var.f129382i.getId();
        int W = bs1.c.W(h0Var, m60.r0.margin_half);
        int W2 = bs1.c.W(h0Var, m60.r0.margin_quarter);
        int marginStart = clearAndUpdateLayoutParams.getMarginStart();
        int i13 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin;
        clearAndUpdateLayoutParams.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin = i13;
        clearAndUpdateLayoutParams.setMarginEnd(W2);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin = W;
        return Unit.f80348a;
    }
}
