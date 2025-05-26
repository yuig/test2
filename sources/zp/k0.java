package zp;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.activity.library.modal.PinEditModalViewProviderImpl;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.kg0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final aq.j f142439a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f142440b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f142441c;

    /* renamed from: d, reason: collision with root package name */
    public final PinEditModalViewProviderImpl f142442d;

    /* renamed from: e, reason: collision with root package name */
    public final n22.a f142443e;

    /* renamed from: f, reason: collision with root package name */
    public final bh.b f142444f;

    /* renamed from: g, reason: collision with root package name */
    public c f142445g;

    public k0(i0 pinEditType, m60.w eventManager, PinEditModalViewProviderImpl pinEditModalViewProvider, n22.a scheduledPinService, bh.b editablePinWrapperProvider) {
        Intrinsics.checkNotNullParameter(pinEditType, "pinEditType");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinEditModalViewProvider, "pinEditModalViewProvider");
        Intrinsics.checkNotNullParameter(scheduledPinService, "scheduledPinService");
        Intrinsics.checkNotNullParameter(editablePinWrapperProvider, "editablePinWrapperProvider");
        this.f142439a = null;
        this.f142440b = pinEditType;
        this.f142441c = eventManager;
        this.f142442d = pinEditModalViewProvider;
        this.f142443e = scheduledPinService;
        this.f142444f = editablePinWrapperProvider;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        kg0 d2;
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context, true);
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        aq.j jVar = this.f142439a;
        j0Var.f80434a = jVar;
        if (jVar == null && bundle != null) {
            h0 h0Var = i0.Companion;
            String string = bundle.getString("com.pinterest.EXTRA_PIN_ID");
            h0Var.getClass();
            bh.b editablePinWrapperProvider = this.f142444f;
            Intrinsics.checkNotNullParameter(editablePinWrapperProvider, "editablePinWrapperProvider");
            n22.a scheduledPinService = this.f142443e;
            Intrinsics.checkNotNullParameter(scheduledPinService, "scheduledPinService");
            i0 i0Var = this.f142440b;
            aq.m mVar = null;
            if (i0Var != null && g0.f142407a[i0Var.ordinal()] == 1 && (d2 = ew.d(string)) != null) {
                mVar = editablePinWrapperProvider.h(d2);
            }
            j0Var.f80434a = mVar;
        }
        Object obj = j0Var.f80434a;
        if (obj != null) {
            c create = this.f142442d.create(context, (aq.j) obj, bundle);
            this.f142445g = create;
            Intrinsics.f(create);
            nVar.x(create);
            nVar.p(context.getResources().getString(m60.x0.edit_pin));
            nVar.L(m60.x0.button_publish);
            nVar.X(m60.x0.save_pin);
            j0 action = new j0(0, this, j0Var);
            Intrinsics.checkNotNullParameter(action, "action");
            nVar.Y(true);
            nVar.A = action;
            bs1.c.R1(nVar.f75426r, true);
            nVar.D(new db.m(this, 8));
            nVar.Y(false);
            nVar.T(false);
            nVar.d0(true);
            nVar.a0();
        }
        return nVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.b, jc0.a0
    public final String getSavedInstanceStateKey() {
        String name = k0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        c cVar = this.f142445g;
        if (cVar == null) {
            return;
        }
        hf0.b.k(cVar.Z());
        c cVar2 = this.f142445g;
        Intrinsics.f(cVar2);
        hf0.b.k(cVar2.X());
    }

    @Override // jc0.a0
    public final void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        c cVar = this.f142445g;
        Intrinsics.f(cVar);
        cVar.a0(bundle);
    }
}
