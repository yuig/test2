package ui0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.c6;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import i32.y0;
import java.util.List;
import kh2.a1;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import pk.a0;
import rg0.n;
import rg0.s;
import so.z1;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lui0/e;", "Lri0/a;", "", "Lyq0/b0;", "<init>", "()V", "gi2/b", "announcementModal_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends l<Object> implements ri0.a {
    public static final /* synthetic */ int O0 = 0;
    public uk1.e A0;
    public hf0.c B0;
    public s C0;
    public View D0;
    public FrameLayout E0;
    public n J0;

    /* renamed from: z0, reason: collision with root package name */
    public z1 f122260z0;
    public final xk2.k F0 = m.a(xk2.n.NONE, new a(this, 2));
    public final v G0 = m.b(new a(this, 0));
    public final v H0 = m.b(new a(this, 5));
    public final v I0 = m.b(new a(this, 3));
    public final d4 K0 = d4.FEED;
    public final a4 L0 = a4.FEED_WHATS_NEW;
    public final v M0 = m.b(new a(this, 6));
    public final c N0 = new c(this);

    public static final void U8(e eVar, int i13) {
        ca2.e W8 = eVar.W8();
        W8.f27245d = i13;
        boolean q13 = hf0.b.q();
        v vVar = eVar.M0;
        if (q13) {
            ca2.e.w(W8, i13 * 2, (d) vVar.getValue(), null, null, 12);
        } else {
            ca2.e.w(W8, 0, (d) vVar.getValue(), null, null, 13);
        }
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, new a(this, 4));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.c(this.L0, this.K0, null);
        s sVar = this.C0;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        this.J0 = ((dh0.d) sVar).b((y0) this.I0.getValue());
        z1 z1Var = this.f122260z0;
        if (z1Var != null) {
            return z1Var.a(V8(), this.J0, g13);
        }
        Intrinsics.r("announcementModalBottomSheetPresenterFactory");
        throw null;
    }

    public final List V8() {
        return (List) this.G0.getValue();
    }

    public final ca2.e W8() {
        return (ca2.e) this.F0.getValue();
    }

    public final hf0.c X8() {
        hf0.c cVar = this.B0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("deviceInfoProvider");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getP0() {
        return this.L0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getO0() {
        return this.K0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(pz.b.annoucement_modal_bottom_sheet_fragment, pz.a.p_recycler_view);
        eVar.f979c = pz.a.empty_state_container;
        return eVar;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (V8().isEmpty() || (((c6) V8().get(0)).L() == null && ((c6) V8().get(0)).H() == null)) {
            b6().o("Announcement Modal Triggered With Invalid Data", new IllegalStateException("Missing Data"));
            if (viewGroup != null) {
                viewGroup.post(new c2(this, 14));
            }
        } else {
            n nVar = this.J0;
            if (nVar != null) {
                nVar.g();
            }
        }
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(pz.a.announcement_modal_bottom_sheet_background);
        findViewById.setAlpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.D0 = findViewById;
        ca2.e W8 = W8();
        W8.m(onCreateView.findViewById(pz.a.announcement_modal_bottom_sheet));
        X8();
        W8.n(hf0.b.f69002b);
        W8.o(0);
        if ((!V8().isEmpty()) && s0.F0((c6) V8().get(0)) && a1.z(((c6) V8().get(0)).J()) <= 1.0f) {
            FrameLayout frameLayout = (FrameLayout) onCreateView.findViewById(pz.a.announcement_modal_square_overlay_container);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                X8();
                layoutParams.width = hf0.b.f69002b;
                X8();
                layoutParams.height = hf0.b.f69002b;
            }
            View findViewById2 = frameLayout.findViewById(pz.a.announcement_modal_square_overlay_text);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            a0.p((GestaltText) findViewById2, String.valueOf(((c6) V8().get(0)).I()));
            bs1.c.U1(frameLayout);
            this.E0 = frameLayout;
        }
        GestaltIconButton gestaltIconButton = (GestaltIconButton) onCreateView.findViewById(pz.a.announcement_modal_close_icon);
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new yb0.b(this, 16));
            gestaltIconButton.t(new hh0.a(this, 11));
        }
        onCreateView.setOnClickListener(new tq.j(this, 27));
        int dimensionPixelSize = onCreateView.getResources().getDimensionPixelSize(eo1.c.space_100);
        a8(new eb2.k(0, dimensionPixelSize, 0, dimensionPixelSize));
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        n nVar = this.J0;
        if (nVar != null) {
            nVar.c(null, null);
        }
        this.J0 = null;
        W8().l();
        f7().j(this.N0);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
        f7().h(this.N0);
    }
}
