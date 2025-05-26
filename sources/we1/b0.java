package we1;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f129282i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z32.q1 f129283j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z32.q1 f129284k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, z32.q1 q1Var, z32.q1 q1Var2) {
        super(1);
        this.f129282i = h0Var;
        this.f129283j = q1Var;
        this.f129284k = q1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int W;
        ConstraintLayout.LayoutParams clearAndUpdateLayoutParams = (ConstraintLayout.LayoutParams) obj;
        Intrinsics.checkNotNullParameter(clearAndUpdateLayoutParams, "$this$clearAndUpdateLayoutParams");
        clearAndUpdateLayoutParams.E = 0.0f;
        h0 h0Var = this.f129282i;
        clearAndUpdateLayoutParams.f17671i = h0Var.f129384k.O2().f108655i;
        clearAndUpdateLayoutParams.f17690s = h0Var.f129384k.O2().f108655i;
        clearAndUpdateLayoutParams.f17693v = h0Var.f129382i.getId();
        int W2 = bs1.c.W(h0Var, m60.r0.margin_three_eighth);
        int W3 = bs1.c.W(h0Var, m60.r0.collaboration_offset);
        if (this.f129283j == z32.q1.BOTTOM_LEFT_OUTSIDE) {
            if (this.f129284k == z32.q1.BOTTOM_RIGHT_OUTSIDE) {
                W = bs1.c.W(h0Var, m60.r0.margin_one_and_a_half);
                int i13 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin;
                clearAndUpdateLayoutParams.setMarginStart(W2);
                ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin = W3;
                clearAndUpdateLayoutParams.setMarginEnd(W);
                ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin = i13;
                return Unit.f80348a;
            }
        }
        W = bs1.c.W(h0Var, m60.r0.margin_three_eighth);
        int i132 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin;
        clearAndUpdateLayoutParams.setMarginStart(W2);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin = W3;
        clearAndUpdateLayoutParams.setMarginEnd(W);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin = i132;
        return Unit.f80348a;
    }
}
