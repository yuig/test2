package zp;

import android.content.Context;
import android.os.Bundle;
import android.widget.ScrollView;
import com.pinterest.activity.library.modal.PinEditModalViewProviderImpl;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gw;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.gestalt.button.view.GestaltButton;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes3.dex */
public final class e0 extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public f30 f142396a;

    /* renamed from: b, reason: collision with root package name */
    public c f142397b;

    public e0(f30 f30Var) {
        this.f142396a = f30Var;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = 1;
        jc0.n nVar = new jc0.n(context, true);
        Context context2 = kb0.a.f79058b;
        oa oaVar = (oa) ((f0) j1.b0(f0.class, m60.f0.W()));
        PinEditModalViewProviderImpl pinEditModalViewProviderImpl = (PinEditModalViewProviderImpl) oaVar.f113868q0.get();
        l10.b.a();
        m60.w wVar = (m60.w) oaVar.f113885r0.get();
        if (this.f142396a == null && bundle != null) {
            this.f142396a = gw.d(bundle.getString("com.pinterest.EXTRA_PIN_ID"));
        }
        f30 f30Var = this.f142396a;
        if (f30Var != null) {
            c view = pinEditModalViewProviderImpl.create(context, f30Var, bundle);
            this.f142397b = view;
            Intrinsics.checkNotNullParameter(view, "view");
            ScrollView scrollView = nVar.f75427s;
            scrollView.setVisibility(0);
            scrollView.addView(view);
            nVar.p(context.getResources().getString(m60.x0.edit_pin));
            GestaltButton gestaltButton = nVar.f44752d;
            if (gestaltButton != null) {
                gestaltButton.d(new xo.j(14));
                gestaltButton.e(new bp.j(i13, this, wVar));
            }
        }
        return nVar;
    }

    @Override // jc0.a0
    public final int getLayoutHeight() {
        return -1;
    }

    @Override // jc0.b, jc0.a0
    public final String getSavedInstanceStateKey() {
        return e0.class.getName();
    }

    @Override // jc0.a0
    public final void onAboutToDismiss() {
        c cVar = this.f142397b;
        if (cVar == null) {
            return;
        }
        hf0.b.k(cVar.Z());
        hf0.b.k(this.f142397b.X());
    }

    @Override // jc0.a0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c cVar = this.f142397b;
        if (cVar != null) {
            cVar.a0(bundle);
        }
    }
}
