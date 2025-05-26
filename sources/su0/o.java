package su0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import pu0.z;
import so.d8;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu0/o;", "Lyk1/k;", "Lpu0/t;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends b implements pu0.t {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f115207q0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public d8 f115208j0;

    /* renamed from: k0, reason: collision with root package name */
    public final xk2.k f115209k0;

    /* renamed from: l0, reason: collision with root package name */
    public final xk2.k f115210l0;

    /* renamed from: m0, reason: collision with root package name */
    public ru0.j f115211m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f115212n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltButton f115213o0;

    /* renamed from: p0, reason: collision with root package name */
    public final jd0.i f115214p0;

    public o() {
        xk2.n nVar = xk2.n.NONE;
        this.f115209k0 = xk2.m.a(nVar, new n(this, 0));
        this.f115210l0 = xk2.m.a(nVar, new n(this, 1));
        this.f115214p0 = new jd0.i(2);
        this.E = aq1.f.fragment_overlay_transition_selection;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        d8 d8Var = this.f115208j0;
        if (d8Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        String str = (String) this.f115210l0.getValue();
        z zVar = (z) this.f115209k0.getValue();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ru0.j a13 = d8Var.a(str, zVar, requireContext);
        this.f115211m0 = a13;
        return a13;
    }

    public final void b8(pu0.s state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GestaltText gestaltText = this.f115212n0;
        if (gestaltText == null) {
            Intrinsics.r("transitionSelectionTitle");
            throw null;
        }
        a0.o(gestaltText, state.c().getLabel(), new Object[0]);
        this.f115214p0.C(state.b());
        GestaltButton gestaltButton = this.f115213o0;
        if (gestaltButton != null) {
            gestaltButton.d(new au0.f(state, 7));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF140085y0() {
        return d4.STORY_PIN_PAGE_TEXT_DURATION_TOOL;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
        super.onResume();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(aq1.d.overlay_transition_selection_list);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.getContext();
        final int i13 = 1;
        final int i14 = 0;
        recyclerView.R2(new GridLayoutManager(3, 1, false));
        recyclerView.H2(this.f115214p0);
        recyclerView.O2(null);
        Resources resources = recyclerView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        recyclerView.m(new ko0.b(1, resources));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = v13.findViewById(aq1.d.overlay_transition_selection_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f115212n0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(aq1.d.overlay_transition_selection_back);
        ((GestaltIconButton) findViewById3).u(new gm1.a(this) { // from class: su0.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f115204b;

            {
                this.f115204b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                o this$0 = this.f115204b;
                switch (i15) {
                    case 0:
                        int i16 = o.f115207q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            ru0.j jVar = this$0.f115211m0;
                            if (jVar != null) {
                                jVar.t3(pu0.n.f101402a);
                                return;
                            } else {
                                Intrinsics.r("presenter");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = o.f115207q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        ru0.j jVar2 = this$0.f115211m0;
                        if (jVar2 != null) {
                            jVar2.t3(pu0.n.f101403b);
                            return;
                        } else {
                            Intrinsics.r("presenter");
                            throw null;
                        }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        View findViewById4 = v13.findViewById(aq1.d.done_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        gestaltButton.d(g.f115197l);
        gestaltButton.e(new gm1.a(this) { // from class: su0.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f115204b;

            {
                this.f115204b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                o this$0 = this.f115204b;
                switch (i15) {
                    case 0:
                        int i16 = o.f115207q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            ru0.j jVar = this$0.f115211m0;
                            if (jVar != null) {
                                jVar.t3(pu0.n.f101402a);
                                return;
                            } else {
                                Intrinsics.r("presenter");
                                throw null;
                            }
                        }
                        return;
                    default:
                        int i17 = o.f115207q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        ru0.j jVar2 = this$0.f115211m0;
                        if (jVar2 != null) {
                            jVar2.t3(pu0.n.f101403b);
                            return;
                        } else {
                            Intrinsics.r("presenter");
                            throw null;
                        }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f115213o0 = gestaltButton;
        super.onViewCreated(v13, bundle);
    }
}
