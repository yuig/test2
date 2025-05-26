package we1;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f129305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z32.q1 f129306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z32.q1 f129307k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, z32.q1 q1Var, z32.q1 q1Var2) {
        super(1);
        this.f129305i = h0Var;
        this.f129306j = q1Var;
        this.f129307k = q1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        ConstraintLayout.LayoutParams clearAndUpdateLayoutParams = (ConstraintLayout.LayoutParams) obj;
        Intrinsics.checkNotNullParameter(clearAndUpdateLayoutParams, "$this$clearAndUpdateLayoutParams");
        clearAndUpdateLayoutParams.E = 0.0f;
        h0 h0Var = this.f129305i;
        clearAndUpdateLayoutParams.f17673j = h0Var.f129385l.getId();
        clearAndUpdateLayoutParams.f17691t = h0Var.f129385l.getId();
        clearAndUpdateLayoutParams.f17693v = h0Var.f129382i.getId();
        if (this.f129306j == z32.q1.BOTTOM_LEFT_INSIDE) {
            if (this.f129307k == z32.q1.BOTTOM_RIGHT_INSIDE) {
                i13 = bs1.c.W(h0Var, m60.r0.margin_one_and_a_half);
                int marginStart = clearAndUpdateLayoutParams.getMarginStart();
                int i14 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin;
                int i15 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin;
                clearAndUpdateLayoutParams.setMarginStart(marginStart);
                ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin = i14;
                clearAndUpdateLayoutParams.setMarginEnd(i13);
                ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin = i15;
                return Unit.f80348a;
            }
        }
        i13 = 0;
        int marginStart2 = clearAndUpdateLayoutParams.getMarginStart();
        int i142 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin;
        int i152 = ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin;
        clearAndUpdateLayoutParams.setMarginStart(marginStart2);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).topMargin = i142;
        clearAndUpdateLayoutParams.setMarginEnd(i13);
        ((ViewGroup.MarginLayoutParams) clearAndUpdateLayoutParams).bottomMargin = i152;
        return Unit.f80348a;
    }
}
