package nt;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92240i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b2 f92241j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(b2 b2Var, int i13) {
        super(0);
        this.f92240i = i13;
        this.f92241j = b2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f92240i) {
            case 0:
                m194invoke();
                break;
            case 1:
                m194invoke();
                break;
            case 2:
                m194invoke();
                break;
            case 3:
                m194invoke();
                break;
            default:
                m194invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m194invoke() {
        int i13 = 0;
        int i14 = this.f92240i;
        b2 b2Var = this.f92241j;
        switch (i14) {
            case 0:
                LinearLayout linearLayout = b2Var.f53208j;
                int i15 = b2.E;
                b2Var.I0(linearLayout);
                break;
            case 1:
                LinearLayout linearLayout2 = b2Var.f53208j;
                y1 y1Var = new y1(b2Var, i13);
                int i16 = b2.E;
                linearLayout2.post(new ja.y(b2Var, linearLayout2, y1Var, 10));
                break;
            case 2:
                b2Var.getViewTreeObserver().addOnGlobalLayoutListener(new a2(i13, b2Var, b2Var.f91991x));
                b2Var.f91989v.a(w.f92216a);
                break;
            case 3:
                b2Var.getViewTreeObserver().addOnGlobalLayoutListener(new a2(i13, b2Var, b2Var.f91992y));
                break;
            default:
                b2Var.Z(1.0f);
                b2Var.D(3);
                break;
        }
    }
}
