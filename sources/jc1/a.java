package jc1;

import android.os.Bundle;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.u0;
import hc1.i;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class a extends t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        gc1.a view = (gc1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((i) view).f68722l0 = this;
    }

    public final void p3() {
        getPinalytics().X(u0.DONE_BUTTON);
        i iVar = (i) ((gc1.a) getView());
        iVar.getClass();
        Bundle bundle = new Bundle();
        GestaltTextField gestaltTextField = iVar.f68723m0;
        if (gestaltTextField == null) {
            Intrinsics.r("editableText");
            throw null;
        }
        bundle.putString("edit_about_result_key", gestaltTextField.B0());
        iVar.P6("edit_about_result_code", bundle);
        iVar.D5();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        gc1.a view = (gc1.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((i) view).f68722l0 = this;
    }
}
