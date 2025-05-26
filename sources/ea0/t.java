package ea0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.x3;
import kh2.a1;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import so.n5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lea0/t;", "Lo82/v2;", "<init>", "()V", "remix_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t extends d {
    public static final /* synthetic */ int W0 = 0;
    public n5 L0;
    public GestaltIconButton M0;
    public GestaltText N0;
    public FullBleedGestaltSpinner O0;
    public final m1 P0;
    public final xk2.v Q0;
    public final xk2.k R0;
    public zy.a0 S0;
    public final d4 T0;
    public final a4 U0;
    public final h32.g0 V0;

    public t() {
        q1 q1Var = new q1(this, 24);
        xk2.n nVar = xk2.n.NONE;
        int i13 = 1;
        xk2.k a13 = xk2.m.a(nVar, new ca0.b0(i13, q1Var));
        int i14 = 23;
        this.P0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(k0.class), new mq.e0(a13, i14), new mq.f0(null, a13, i14), new mq.g0(this, a13, i14));
        this.Q0 = xk2.m.b(new n(this, i13));
        this.R0 = xk2.m.a(nVar, new n(this, 0));
        this.S0 = new zy.a0();
        this.T0 = d4.FEED;
        this.U0 = a4.FEED_COLLAGE_REMIX_UPSELL;
        this.V0 = h32.g0.COLLAGE_COMPOSER_REMIXES_UPSELL_MODAL;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 14);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new ca0.y(k9().c(), 1);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        c0.d.A2(adapter, v.b(), p.f57987k, (o82.y) this.R0.getValue());
        b3.G(adapter, 4444, new n(this, 2), y.f58009a, new ns.i(3), new a8.v(this, 23), k9(), 32);
    }

    @Override // o82.v2
    public final int a9() {
        return 0;
    }

    @Override // o82.v2
    public final int d9() {
        return 0;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.S0.e();
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final h32.g0 getF69884z0() {
        return this.V0;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.S0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getN0() {
        return this.U0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getM0() {
        return this.T0;
    }

    public final k0 k9() {
        return (k0) this.P0.getValue();
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new ca0.y(k9().c(), 2);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(j.fragment_remix_browse, i.remix_browse_content);
        eVar.b(i.remix_browse_loading_state_container);
        eVar.f979c = i.remix_browse_empty_state_container;
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9().h((h32.i0) this.Q0.getValue(), this.S0.f(), com.bumptech.glide.d.G(this, "RetrievalExtras.COLLAGE_IS_TEMPLATES", false));
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(i.remix_browse_cancel_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        Intrinsics.f(gestaltIconButton);
        g3.y(gestaltIconButton, p.f57986j);
        gestaltIconButton.u(new xo.k(this, 28));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.M0 = gestaltIconButton;
        View findViewById2 = onCreateView.findViewById(i.remix_browse_title);
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.f(gestaltText);
        pp2.a.k(gestaltText, new q(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.N0 = gestaltText;
        View findViewById3 = onCreateView.findViewById(i.remix_browse_progress_overlay);
        FullBleedGestaltSpinner fullBleedGestaltSpinner = (FullBleedGestaltSpinner) findViewById3;
        fullBleedGestaltSpinner.showLoadingSpinner(false);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.O0 = fullBleedGestaltSpinner;
        return onCreateView;
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new s(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.S0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
