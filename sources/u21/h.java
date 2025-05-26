package u21;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.m1;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu21/h;", "Lnl1/d;", "<init>", "()V", "bp1/h", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f120090g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f120091c0;

    /* renamed from: d0, reason: collision with root package name */
    public List f120092d0;

    /* renamed from: e0, reason: collision with root package name */
    public String f120093e0;

    /* renamed from: f0, reason: collision with root package name */
    public final d4 f120094f0;

    public h() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(15, new kl0.w(this, 15)));
        this.f120091c0 = a1.s(this, k0.f80436a.b(d0.class), new ml0.v(a13, 15), new kl0.x(null, a13, 16), new kl0.y(this, a13, 16));
        this.f120092d0 = q0.f80391a;
        this.f120093e0 = "";
        this.f120094f0 = d4.PIN_OR_SPIN_REWARD;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ((l82.c) ((d0) this.f120091c0.getValue()).c()).a(c.f120075a);
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.f120094f0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = ob2.d.fragment_pin_or_spin_reward_fragment;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        String string = requireContext().getString(db0.f.reward_page_header_title_default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f120093e0 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_PIN_OR_SPIN_TITLE", string);
        this.f120092d0 = com.bumptech.glide.d.Y(this, "com.pinterest.EXTRA_PIN_OR_SPIN_IMAGE_URL_LIST", q0.f80391a);
        d0 d0Var = (d0) this.f120091c0.getValue();
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_OR_SPIN") : null;
        if (v03 == null) {
            v03 = "";
        }
        d0Var.h(v03, this.f120093e0, this.f120092d0);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ComposeView composeView = (ComposeView) onCreateView.findViewById(ob2.c.collage_view);
        g gVar = new g(this, 1);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(gVar, true, -1147133644));
        return onCreateView;
    }
}
