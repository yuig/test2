package kc1;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79183r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f79184s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f79184s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x xVar = new x(this.f79184s, cVar);
        xVar.f79183r = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((n) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = (n) this.f79183r;
        d0 d0Var = this.f79184s;
        GestaltText gestaltText = d0Var.J0;
        if (gestaltText == null) {
            Intrinsics.r("messageText");
            throw null;
        }
        gestaltText.i(new ic1.c(1, d0Var, nVar));
        m mVar = nVar.f79166a;
        LinearLayout linearLayout = d0Var.I0;
        if (linearLayout == null) {
            Intrinsics.r("selectedPronounsContainer");
            throw null;
        }
        linearLayout.removeAllViews();
        if (mVar instanceof k) {
            LinearLayout linearLayout2 = d0Var.I0;
            if (linearLayout2 == null) {
                Intrinsics.r("selectedPronounsContainer");
                throw null;
            }
            GestaltText gestaltText2 = d0Var.K0;
            if (gestaltText2 == null) {
                Intrinsics.r("selectedPronounsContainerEmptyStateMessage");
                throw null;
            }
            linearLayout2.addView(gestaltText2);
        } else if (mVar instanceof l) {
            for (String str : mVar.b()) {
                LinearLayout linearLayout3 = d0Var.I0;
                if (linearLayout3 == null) {
                    Intrinsics.r("selectedPronounsContainer");
                    throw null;
                }
                Context requireContext = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                linearLayout3.addView(new lc1.o(requireContext, new ic1.y(str), new p91.v(12, d0Var, str)));
            }
        }
        GestaltButton gestaltButton = d0Var.H0;
        if (gestaltButton != null) {
            gestaltButton.d(new w(nVar, 0));
            return Unit.f80348a;
        }
        Intrinsics.r("doneButton");
        throw null;
    }
}
