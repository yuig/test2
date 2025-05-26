package n61;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.hf0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a0;
import om1.l;
import so.c3;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln61/b;", "Lyk1/k;", "Lm61/a;", "<init>", "()V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends e implements m61.a {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f89323q0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public c3 f89324j0;

    /* renamed from: k0, reason: collision with root package name */
    public d f89325k0;

    /* renamed from: l0, reason: collision with root package name */
    public final a0 f89326l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f89327m0;

    /* renamed from: n0, reason: collision with root package name */
    public LinearLayout f89328n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltIconButtonFloating f89329o0;

    /* renamed from: p0, reason: collision with root package name */
    public final d4 f89330p0;

    public b() {
        a0 a0Var = new a0();
        this.f89326l0 = a0Var;
        this.E = l42.d.fragment_gold_standard_audio_intro;
        setPinalytics(a0Var);
        this.f89330p0 = d4.UNKNOWN_VIEW;
    }

    @Override // yk1.k
    public final m V7() {
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("extra_safety_audio_treatment") : null;
        hf0 hf0Var = i03 instanceof hf0 ? (hf0) i03 : null;
        if (hf0Var == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        c3 c3Var = this.f89324j0;
        if (c3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return c3Var.a(requireContext, hf0Var, this.f89326l0);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getB0() {
        return this.f89330p0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(l42.b.gold_standard_audio_intro_action_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f89327m0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(l42.b.gold_standard_audio_intro_linear_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f89328n0 = (LinearLayout) findViewById2;
        View findViewById3 = v13.findViewById(l42.b.gold_standard_audio_intro_fab);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f89329o0 = (GestaltIconButtonFloating) findViewById3;
        d dVar = this.f89325k0;
        if (dVar != null) {
            dVar.q3();
        }
        final int i13 = 0;
        ((GestaltIconButton) v13.findViewById(l42.b.gold_standard_audio_intro_back_button)).u(new gm1.a(this) { // from class: n61.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f89322b;

            {
                this.f89322b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                FragmentActivity E4;
                int i14 = i13;
                b this$0 = this.f89322b;
                switch (i14) {
                    case 0:
                        int i15 = b.f89323q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (E4 = this$0.E4()) != null) {
                            E4.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        int i16 = b.f89323q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d dVar2 = this$0.f89325k0;
                        if (dVar2 != null) {
                            dVar2.p3();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltIconButtonFloating gestaltIconButtonFloating = this.f89329o0;
        if (gestaltIconButtonFloating == null) {
            Intrinsics.r("fab");
            throw null;
        }
        final int i14 = 1;
        gestaltIconButtonFloating.c(new gm1.a(this) { // from class: n61.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f89322b;

            {
                this.f89322b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                FragmentActivity E4;
                int i142 = i14;
                b this$0 = this.f89322b;
                switch (i142) {
                    case 0:
                        int i15 = b.f89323q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (E4 = this$0.E4()) != null) {
                            E4.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        int i16 = b.f89323q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        d dVar2 = this$0.f89325k0;
                        if (dVar2 != null) {
                            dVar2.p3();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
