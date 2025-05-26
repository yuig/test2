package we1;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f129682i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h0 h0Var) {
        super(1);
        this.f129682i = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintLayout.LayoutParams clearAndUpdateLayoutParams = (ConstraintLayout.LayoutParams) obj;
        Intrinsics.checkNotNullParameter(clearAndUpdateLayoutParams, "$this$clearAndUpdateLayoutParams");
        clearAndUpdateLayoutParams.f17691t = 0;
        h0 h0Var = this.f129682i;
        clearAndUpdateLayoutParams.f17673j = h0Var.f129382i.getId();
        int W = bs1.c.W(h0Var, m60.r0.margin_half);
        int W2 = bs1.c.W(h0Var, m60.r0.margin_half);
        int marginEnd = clearAndUpdateLayoutParams.getMarginEnd();
        int i13 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin;
        clearAndUpdateLayoutParams.setMarginStart(W);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin = W2;
        clearAndUpdateLayoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin = i13;
        return Unit.f80348a;
    }
}
