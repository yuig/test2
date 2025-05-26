package nz0;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y2;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import dl1.s;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mj0.j;
import nx.d0;
import om1.l;
import qa2.n;
import so.k1;
import so.oa;
import tj0.b0;
import uj2.q;
import wa2.i;
import x02.i2;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnz0/d;", "Lwk1/k;", "Ldl1/s;", "", "Lnr0/j;", "<init>", "()V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends a<s> {
    public static final /* synthetic */ int Z0 = 0;
    public i2 R0;
    public k1 S0;
    public uk1.e T0;
    public b0 U0;
    public e01.a V0;
    public g01.a W0;
    public final d4 X0 = d4.PEAR_INSIGHT;
    public final a4 Y0;

    public d() {
        this.Y0 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_INSIGHT_ON_OWN_BOARD", false) ? a4.PEAR_INSIGHT_SELF : a4.PEAR_INSIGHT_OTHERS;
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER, new au0.a(this, 20));
        int[] iArr = j.f87276a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        d0 s73 = s7();
        n W8 = W8();
        q p73 = p7();
        b0 b0Var = this.U0;
        if (b0Var != null) {
            j.b(adapter, requireContext, s73, W8, p73, b0Var);
        } else {
            Intrinsics.r("oneTapSavePinVideoGridCellFactory");
            throw null;
        }
    }

    @Override // sq0.e
    public final n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        n T8 = super.T8(pinActionHandler);
        i iVar = T8.f103320a;
        iVar.f128797t = true;
        iVar.f128803w = false;
        return T8;
    }

    @Override // yk1.k
    public final m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        i2 i2Var = this.R0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        uk1.e eVar = this.T0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).f(s7(), ""));
        wk1.c a13 = bVar.a();
        k1 k1Var = this.S0;
        if (k1Var != null) {
            return k1Var.a(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_INSIGHT_ID", ""), com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_ID", ""), com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_INSIGHT_ON_OWN_BOARD", false), a13);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getQ0() {
        return this.Y0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getP0() {
        return this.X0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(iy1.e.fragment_pear_related_pins, iy1.d.p_recycler_view);
        eVar.f979c = iy1.d.empty_state_container;
        eVar.c(iy1.d.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.W0 = new g01.a(requireActivity);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        g01.a aVar = this.W0;
        if (aVar == null) {
            Intrinsics.r("fullBleedHelper");
            throw null;
        }
        aVar.f();
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g01.a aVar = this.W0;
        if (aVar != null) {
            aVar.g();
        } else {
            Intrinsics.r("fullBleedHelper");
            throw null;
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.setPaddingRelative(0, 0, 0, 0);
        }
        int f13 = hf0.b.f();
        View findViewById = v13.findViewById(iy1.d.top_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height += f13;
        findViewById.setLayoutParams(marginLayoutParams);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) v13.findViewById(iy1.d.back_button);
        Intrinsics.f(gestaltIconButton);
        ViewGroup.LayoutParams layoutParams2 = gestaltIconButton.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin += f13;
        gestaltIconButton.setLayoutParams(marginLayoutParams2);
        gestaltIconButton.u(new gm1.a(this) { // from class: nz0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f92718b;

            {
                this.f92718b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i13 = r2;
                d this$0 = this.f92718b;
                switch (i13) {
                    case 0:
                        int i14 = d.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i15 = d.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.f7().d(new of0.a(new mf0.l()));
                            dx0.d dVar = new dx0.d(this$0, 19);
                            int C = bs1.c.C(this$0, eo1.b.color_themed_background_default);
                            RecyclerView g84 = this$0.g8();
                            if (g84 != null) {
                                l2 l2Var = g84.f19242n;
                                LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
                                View D = linearLayoutManager != null ? linearLayoutManager.D(0) : null;
                                if (D == null) {
                                    b2 b2Var = g84.f19240m;
                                    if (b2Var != null) {
                                        y2 c13 = b2Var.c(g84, b2Var.g(0));
                                        Intrinsics.checkNotNullExpressionValue(c13, "createViewHolder(...)");
                                        View view = c13.f19717a;
                                        f fVar = view instanceof f ? (f) view : null;
                                        if (fVar != null) {
                                            b2Var.r(c13, 0);
                                            fVar.measure(View.MeasureSpec.makeMeasureSpec(g84.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            fVar.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            if (fVar.isLaidOut() && !fVar.isLayoutRequested()) {
                                                dVar.invoke(kh2.b0.Q1(fVar, Integer.valueOf(C), 0, 2));
                                                break;
                                            } else {
                                                fVar.addOnLayoutChangeListener(new c(dVar, fVar, C));
                                                break;
                                            }
                                        } else {
                                            dVar.invoke(null);
                                            break;
                                        }
                                    } else {
                                        dVar.invoke(null);
                                        break;
                                    }
                                } else {
                                    dVar.invoke(kh2.b0.Q1(D, Integer.valueOf(C), 0, 2));
                                    break;
                                }
                            } else {
                                dVar.invoke(null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) v13.findViewById(iy1.d.share_button);
        Intrinsics.f(gestaltIconButton2);
        ViewGroup.LayoutParams layoutParams3 = gestaltIconButton2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin += f13;
        gestaltIconButton2.setLayoutParams(marginLayoutParams3);
        final int i13 = 1;
        gestaltIconButton2.u(new gm1.a(this) { // from class: nz0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f92718b;

            {
                this.f92718b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i132 = i13;
                d this$0 = this.f92718b;
                switch (i132) {
                    case 0:
                        int i14 = d.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i15 = d.Z0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.f7().d(new of0.a(new mf0.l()));
                            dx0.d dVar = new dx0.d(this$0, 19);
                            int C = bs1.c.C(this$0, eo1.b.color_themed_background_default);
                            RecyclerView g84 = this$0.g8();
                            if (g84 != null) {
                                l2 l2Var = g84.f19242n;
                                LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
                                View D = linearLayoutManager != null ? linearLayoutManager.D(0) : null;
                                if (D == null) {
                                    b2 b2Var = g84.f19240m;
                                    if (b2Var != null) {
                                        y2 c13 = b2Var.c(g84, b2Var.g(0));
                                        Intrinsics.checkNotNullExpressionValue(c13, "createViewHolder(...)");
                                        View view = c13.f19717a;
                                        f fVar = view instanceof f ? (f) view : null;
                                        if (fVar != null) {
                                            b2Var.r(c13, 0);
                                            fVar.measure(View.MeasureSpec.makeMeasureSpec(g84.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            fVar.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                            if (fVar.isLaidOut() && !fVar.isLayoutRequested()) {
                                                dVar.invoke(kh2.b0.Q1(fVar, Integer.valueOf(C), 0, 2));
                                                break;
                                            } else {
                                                fVar.addOnLayoutChangeListener(new c(dVar, fVar, C));
                                                break;
                                            }
                                        } else {
                                            dVar.invoke(null);
                                            break;
                                        }
                                    } else {
                                        dVar.invoke(null);
                                        break;
                                    }
                                } else {
                                    dVar.invoke(kh2.b0.Q1(D, Integer.valueOf(C), 0, 2));
                                    break;
                                }
                            } else {
                                dVar.invoke(null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            int i14 = f13 * 2;
            pinterestSwipeRefreshLayout.C = true;
            pinterestSwipeRefreshLayout.e();
            pinterestSwipeRefreshLayout.p(pinterestSwipeRefreshLayout.f44877k != null ? f13 - ((se0.q) r2).f112418a.f112406d : 0, i14, f13);
            pinterestSwipeRefreshLayout.k();
        }
    }
}
