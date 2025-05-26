package s41;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import h32.u0;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nr0.m;
import om1.l;
import so.oa;
import x02.i2;
import yk1.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls41/f;", "Lv42/c;", "Ls41/c;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends a implements c {

    /* renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f111131l1 = 0;
    public i2 Y0;
    public uk1.e Z0;

    /* renamed from: a1, reason: collision with root package name */
    public k f111132a1;

    /* renamed from: b1, reason: collision with root package name */
    public v f111133b1;

    /* renamed from: c1, reason: collision with root package name */
    public f0 f111134c1;

    /* renamed from: d1, reason: collision with root package name */
    public m f111135d1;

    /* renamed from: f1, reason: collision with root package name */
    public b f111137f1;

    /* renamed from: g1, reason: collision with root package name */
    public GestaltButton f111138g1;

    /* renamed from: h1, reason: collision with root package name */
    public GestaltText f111139h1;

    /* renamed from: i1, reason: collision with root package name */
    public FrameLayout f111140i1;

    /* renamed from: e1, reason: collision with root package name */
    public String f111136e1 = "";

    /* renamed from: j1, reason: collision with root package name */
    public final d4 f111141j1 = d4.ORGANIZE_BOARDLESS_PINS;

    /* renamed from: k1, reason: collision with root package name */
    public final a4 f111142k1 = a4.PROFILE_SELECT_BOARDLESS_PINS;

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Intrinsics.f(navigation);
        String g23 = navigation.g2("com.pinterest.EXTRA_USER_ID", "");
        Intrinsics.checkNotNullExpressionValue(g23, "getStringParcelable(...)");
        this.f111136e1 = g23;
        navigation.v0("com.pinterest.EXTRA_BOARD_ID");
        f0 f0Var = this.f111134c1;
        if (f0Var != null) {
            f0Var.S(j1.d1(this.f111136e1), "Missing or invalid user id was passed as navigation param. Please provide a non-empty user id!", new Object[0]);
        } else {
            Intrinsics.r("devUtils");
            throw null;
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.Z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.Y0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        String str = this.f111136e1;
        k kVar = this.f111132a1;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        v vVar = this.f111133b1;
        if (vVar == null) {
            Intrinsics.r("viewResources");
            throw null;
        }
        m mVar = this.f111135d1;
        if (mVar != null) {
            return new t41.b(str, kVar, vVar, a13, mVar, getActiveUserManager(), f7());
        }
        Intrinsics.r("dynamicGridViewBinderDelegateFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.f111142k1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.f111141j1;
    }

    @Override // v42.c
    /* renamed from: j9, reason: from getter */
    public final GestaltText getF57496j1() {
        return this.f111139h1;
    }

    @Override // v42.c
    /* renamed from: k9, reason: from getter */
    public final FrameLayout getF57497k1() {
        return this.f111140i1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(oz1.c.organize_profile_pins_fragment, nz1.c.p_recycler_view);
        eVar.f979c = oz1.b.empty_state_container;
        eVar.b(oz1.b.loading_layout);
        return eVar;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.f111139h1 = (GestaltText) onCreateView.findViewById(oz1.b.num_selected_pin_indicator);
        this.f111140i1 = (FrameLayout) onCreateView.findViewById(oz1.b.num_selected_pin_indicator_container);
        final int i13 = 0;
        this.f111138g1 = ((GestaltButton) onCreateView.findViewById(oz1.b.next_button)).e(new gm1.a(this) { // from class: s41.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f111129b;

            {
                this.f111129b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                f this$0 = this.f111129b;
                switch (i14) {
                    case 0:
                        int i15 = f.f111131l1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b bVar = this$0.f111137f1;
                        if (bVar != null) {
                            ((t41.b) bVar).D3();
                            break;
                        }
                        break;
                    default:
                        int i16 = f.f111131l1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.s7().X(u0.CANCEL_BUTTON);
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        ((GestaltIconButton) onCreateView.findViewById(oz1.b.back_button)).t(e.f111130i).u(new gm1.a(this) { // from class: s41.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f111129b;

            {
                this.f111129b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                f this$0 = this.f111129b;
                switch (i142) {
                    case 0:
                        int i15 = f.f111131l1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        b bVar = this$0.f111137f1;
                        if (bVar != null) {
                            ((t41.b) bVar).D3();
                            break;
                        }
                        break;
                    default:
                        int i16 = f.f111131l1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.s7().X(u0.CANCEL_BUTTON);
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById = onCreateView.findViewById(oz1.b.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return onCreateView;
    }
}
