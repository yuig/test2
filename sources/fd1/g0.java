package fd1;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import so.g5;
import so.oa;
import so.r8;
import so.s8;

/* loaded from: classes5.dex */
public final class g0 extends yk1.l implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final SendableObject f61916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61917b;

    /* renamed from: c, reason: collision with root package name */
    public final dl1.s f61918c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f61919d;

    /* renamed from: e, reason: collision with root package name */
    public nx.j0 f61920e;

    /* renamed from: f, reason: collision with root package name */
    public g5 f61921f;

    public g0(SendableObject sendableObject, int i13, dl1.s model) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f61916a = sendableObject;
        this.f61917b = i13;
        this.f61918c = model;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context);
        this.f61920e = ((nx.m) nVar.C()).a(this);
        nx.j0 j0Var = this.f61920e;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        i0 i0Var = new i0(context, j0Var, this.f61917b, this.f61918c);
        this.f61919d = i0Var;
        nVar.x(i0Var);
        s8 s8Var = (s8) ((f0) me.o.a(bs1.c.k0(context), f0.class));
        Intrinsics.checkNotNullParameter(s8Var.y5(), "<set-?>");
        g5 g5Var = (g5) s8Var.Bd.get();
        Intrinsics.checkNotNullParameter(g5Var, "<set-?>");
        this.f61921f = g5Var;
        nVar.T(false);
        ((GestaltButton) nVar.findViewById(b62.b.not_now_cta)).e(new la1.k(3, this, i0Var));
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        g5 g5Var = this.f61921f;
        if (g5Var == null) {
            Intrinsics.r("sendMessageModalPresenterFactory");
            throw null;
        }
        nx.j0 j0Var = this.f61920e;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        r8 r8Var = g5Var.f113430a;
        ed1.f fVar = new ed1.f(j0Var, this.f61916a, (m60.w) r8Var.f114090a.f113885r0.get(), oa.H1(r8Var.f114090a), 1);
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        return fVar;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(getViewType(), a4.SEND_SHARE_MAIN, null, null, null, null);
    }

    @Override // yk1.l
    public final yk1.n getView() {
        i0 i0Var = this.f61919d;
        if (i0Var != null) {
            return i0Var;
        }
        Intrinsics.r("sendMessageView");
        throw null;
    }

    @Override // jc0.a0
    public final d4 getViewType() {
        SendableObject sendableObject = this.f61916a;
        return (sendableObject.g() && sendableObject.h()) ? d4.MODAL_SEND : d4.SEND_SHARE;
    }
}
