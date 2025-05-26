package ea1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f58101j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(v0 v0Var, int i13) {
        super(1);
        this.f58100i = i13;
        this.f58101j = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58100i;
        v0 v0Var = this.f58101j;
        switch (i13) {
            case 0:
                om1.l it = (om1.l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                LinearLayout linearLayout = v0Var.f58162v0;
                if (linearLayout == null) {
                    Intrinsics.r("privateBoardMessageContainer");
                    throw null;
                }
                linearLayout.setVisibility(8);
                kh2.j.x2(v0Var.b8(), p.f58099a);
                return Unit.f80348a;
            case 1:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                Context requireContext = v0Var.requireContext();
                int i14 = eo1.b.color_gray_500;
                Object obj2 = d5.a.f53679a;
                wm1.w startItem = new wm1.w(new u50.u(new ColorDrawable(requireContext.getColor(i14))));
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f130311b = startItem;
                return Unit.f80348a;
            default:
                yb0.d dismissReason = (yb0.d) obj;
                Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
                int i15 = s0.f58135a[dismissReason.ordinal()];
                if (i15 == 1 || i15 == 2 || i15 == 3) {
                    int i16 = v0.F0;
                    kh2.j.x2(v0Var.b8(), a0.f58032a);
                }
                return Unit.f80348a;
        }
    }
}
