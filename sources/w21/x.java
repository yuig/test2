package w21;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw21/x;", "Lnl1/d;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class x extends d {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f127855e0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final androidx.lifecycle.m1 f127856c0;

    /* renamed from: d0, reason: collision with root package name */
    public b0 f127857d0;

    public x() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(17, new kl0.w(this, 17)));
        this.f127856c0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(y1.class), new ml0.v(a13, 17), new kl0.x(null, a13, 18), new kl0.y(this, a13, 18));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ((l82.c) ((y1) this.f127856c0.getValue()).c()).a(p.f127763a);
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getH0() {
        return d4.PIN_OR_SPIN_SELECTION;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String d2 = d5.a.d(requireContext(), db0.f.pin_selection_error_message);
        Intrinsics.checkNotNullExpressionValue(d2, "getString(...)");
        String d13 = d5.a.d(requireContext(), db0.f.pin_selection_not_existent_message);
        Intrinsics.checkNotNullExpressionValue(d13, "getString(...)");
        Navigation navigation = this.I;
        androidx.lifecycle.m1 m1Var = this.f127856c0;
        if (navigation == null || navigation.S("com.pinterest.EXTRA_PIN_OR_SPIN_IS_FIRST_TIME_LOAD", true)) {
            y1 y1Var = (y1) m1Var.getValue();
            Navigation navigation2 = this.I;
            String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_PIN_OR_SPIN") : null;
            y1Var.h(v03 != null ? v03 : "", d2, d13, true);
        } else {
            b0 b0Var = this.f127857d0;
            if (b0Var == null) {
                Intrinsics.r("pinOrSpinSelectionRepository");
                throw null;
            }
            ArrayList a13 = b0Var.a();
            y1 y1Var2 = (y1) m1Var.getValue();
            Navigation navigation3 = this.I;
            String v04 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_PIN_OR_SPIN") : null;
            y1Var2.h(v04 != null ? v04 : "", d2, d13, a13.isEmpty());
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(6, requireContext, (AttributeSet) null);
        w wVar = new w(this, 2);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(wVar, true, 395165389));
        return composeView;
    }
}
