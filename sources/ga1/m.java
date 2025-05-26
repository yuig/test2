package ga1;

import android.widget.FrameLayout;
import com.pinterest.api.model.vs;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f64631r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f64632s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f64632s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f64632s, cVar);
        mVar.f64631r = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        wy0 wy0Var;
        vs p33;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f64631r;
        boolean z13 = aVar2.f64613b;
        p pVar = this.f64632s;
        GestaltSpinner gestaltSpinner = pVar.f64641f0;
        if (gestaltSpinner == null) {
            Intrinsics.r("spinner");
            throw null;
        }
        int i13 = 17;
        s0.w(gestaltSpinner, new u81.h(z13, i13));
        FrameLayout frameLayout = pVar.f64640e0;
        if (frameLayout == null) {
            Intrinsics.r("spinnerContainer");
            throw null;
        }
        frameLayout.setVisibility(z13 ? 0 : 8);
        Navigation navigation = pVar.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE") : null;
        e82.w wVar = e82.w.INSTAGRAM;
        if (!Intrinsics.d(v03, wVar.getApiParam())) {
            wVar = e82.w.NONE;
        }
        if (j.f64625a[wVar.ordinal()] == 1 && (wy0Var = aVar2.f64614c) != null && (p33 = wy0Var.p3()) != null) {
            GestaltText gestaltText = pVar.f64642g0;
            if (gestaltText == null) {
                Intrinsics.r("connectedTo");
                throw null;
            }
            gestaltText.i(new y71.b(i13, pVar, p33));
        }
        k0 k0Var = aVar2.f64615d;
        if (k0Var != null) {
            GestaltButton gestaltButton = pVar.f64643h0;
            if (gestaltButton == null) {
                Intrinsics.r("actionButton");
                throw null;
            }
            gestaltButton.d(new uv.b(k0Var, 6));
        }
        return Unit.f80348a;
    }
}
