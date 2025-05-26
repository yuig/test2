package su0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import com.pinterest.feature.ideaPinCreation.closeup.view.g1;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.duration.view.IdeaPinDurationDragger;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingTimeScale;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import h32.d4;
import java.util.LinkedHashSet;
import kh2.c3;
import kh2.j1;
import kh2.k3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pk.a0;
import pu0.x;
import so.c8;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsu0/i;", "Lfu0/d;", "Lpu0/i;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends a implements pu0.i {
    public static final /* synthetic */ int M0 = 0;
    public c8 B0;
    public ag1.h C0;
    public IdeaPinDurationDragger E0;
    public GestaltText F0;
    public Flow G0;
    public GestaltButton H0;
    public GestaltButton I0;
    public final d4 K0;
    public final a4 L0;
    public final v D0 = xk2.m.b(new f(this, 0));
    public final xk2.k J0 = xk2.m.a(xk2.n.NONE, new f(this, 1));

    public i() {
        this.E = aq1.f.fragment_idea_pin_overlay_duration;
        this.K0 = d4.STORY_PIN_PAGE_TEXT_DURATION_TOOL;
        this.L0 = a4.STORY_PIN_CREATE;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        c8 c8Var = this.B0;
        if (c8Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        v vVar = this.D0;
        String str = (String) vVar.getValue();
        uk1.e eVar = this.f62967e0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.a aVar = (uk1.a) eVar;
        ag1.h hVar = this.C0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        Navigation navigation2 = this.I;
        return c8Var.a(str, new du0.b(aVar.f122378a, hVar, this.K0, v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false), new pu0.k((String) vVar.getValue()));
    }

    public final void d8(j1 state, String blockId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        NavigationImpl L = Navigation.L(IdeaPinCreationLocation.OVERLAY_TRANSITION_SELECTION, "", ml1.b.MODAL_TRANSITION.getValue());
        L.Y1("IntentExtra.KEY_ENTER_TRANSITION_SELECTION", state instanceof t);
        L.m0("com.pinterest.EXTRA_IDEA_PIN_OVERLAY_BLOCK_ID", blockId);
        M1(L);
    }

    public final void e8(pu0.j jVar) {
        rm1.q qVar;
        switch (e.f115192a[jVar.d().ordinal()]) {
            case 1:
                qVar = rm1.q.OVERLAY_TEXT_OUTLINE;
                break;
            case 2:
            case 6:
                qVar = null;
                break;
            case 3:
                qVar = rm1.q.TAG;
                break;
            case 4:
                qVar = rm1.q.STICKER;
                break;
            case 5:
                qVar = rm1.q.LIPS;
                break;
            case 7:
                qVar = rm1.q.STICKER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        KeyEvent.Callback X = Y7().X(jVar.c());
        g1 g1Var = X instanceof g1 ? (g1) X : null;
        String L0 = g1Var != null ? g1Var.L0() : null;
        if (L0 == null) {
            L0 = "";
        }
        IdeaPinDurationDragger ideaPinDurationDragger = this.E0;
        if (ideaPinDurationDragger != null) {
            ideaPinDurationDragger.j(qVar, L0);
        } else {
            Intrinsics.r("draggerView");
            throw null;
        }
    }

    public final void f8(pu0.j jVar) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String z13 = f0.h.z(resources, jVar.e(), false, 12);
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String z14 = f0.h.z(resources2, jVar.a(), false, 12);
        int i13 = e.f115192a[jVar.d().ordinal()] == 1 ? aq1.h.idea_pin_text_duration_text : aq1.h.idea_pin_sticker_duration_text;
        GestaltText gestaltText = this.F0;
        if (gestaltText == null) {
            Intrinsics.r("durationTv");
            throw null;
        }
        Object[] objArr = {z13, z14};
        Context context = kb0.a.f79058b;
        String string = f0.X().getResources().getString(i13, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "string(...)");
        a0.p(gestaltText, string);
    }

    public final void g8(final c3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z13 = state instanceof pu0.f;
        LinkedHashSet linkedHashSet = this.f62982t0;
        if (z13) {
            pu0.j y03 = ((pu0.f) state).y0();
            linkedHashSet.add(y03.c());
            IdeaPinEditablePageLite.a0(Y7());
            Y7().P0(y03.e());
            f8(y03);
            e8(y03);
            float e13 = (y03.e() * 1.0f) / y03.b();
            IdeaPinDurationDragger ideaPinDurationDragger = this.E0;
            if (ideaPinDurationDragger != null) {
                ideaPinDurationDragger.h(e13);
                return;
            } else {
                Intrinsics.r("draggerView");
                throw null;
            }
        }
        if (state instanceof pu0.c) {
            pu0.j y04 = ((pu0.c) state).y0();
            linkedHashSet.add(y04.c());
            IdeaPinEditablePageLite.a0(Y7());
            Y7().P0(y04.a());
            f8(y04);
            e8(y04);
            float a13 = (y04.a() * 1.0f) / y04.b();
            IdeaPinDurationDragger ideaPinDurationDragger2 = this.E0;
            if (ideaPinDurationDragger2 != null) {
                ideaPinDurationDragger2.i(a13);
                return;
            } else {
                Intrinsics.r("draggerView");
                throw null;
            }
        }
        if (!(state instanceof pu0.d)) {
            if (state instanceof pu0.e) {
                IdeaPinVideoTrimmingTimeScale ideaPinVideoTrimmingTimeScale = this.f62974l0;
                if (ideaPinVideoTrimmingTimeScale != null) {
                    k3.Z1(ideaPinVideoTrimmingTimeScale, 4, bs1.c.X(this, eo1.c.space_200));
                }
                Flow flow = this.G0;
                if (flow == null) {
                    Intrinsics.r("transitionContainer");
                    throw null;
                }
                bs1.c.U1(flow);
                GestaltButton gestaltButton = this.H0;
                if (gestaltButton == null) {
                    Intrinsics.r("transitionEnterButton");
                    throw null;
                }
                final int i13 = 0;
                gestaltButton.e(new gm1.a(this) { // from class: su0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f115190b;

                    {
                        this.f115190b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c event) {
                        int i14 = i13;
                        c3 state2 = state;
                        i this$0 = this.f115190b;
                        switch (i14) {
                            case 0:
                                int i15 = i.M0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(state2, "$state");
                                Intrinsics.checkNotNullParameter(event, "event");
                                if (event instanceof xl1.a) {
                                    IdeaPinEditablePageLite.a0(this$0.Y7());
                                    ((pu0.e) state2).f101385a.invoke(pu0.v.f101427a);
                                    break;
                                }
                                break;
                            default:
                                int i16 = i.M0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(state2, "$state");
                                Intrinsics.checkNotNullParameter(event, "event");
                                if (event instanceof xl1.a) {
                                    IdeaPinEditablePageLite.a0(this$0.Y7());
                                    ((pu0.e) state2).f101385a.invoke(x.f101429a);
                                    break;
                                }
                                break;
                        }
                    }
                });
                GestaltButton gestaltButton2 = this.I0;
                if (gestaltButton2 == null) {
                    Intrinsics.r("transitionExitButton");
                    throw null;
                }
                final int i14 = 1;
                gestaltButton2.e(new gm1.a(this) { // from class: su0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f115190b;

                    {
                        this.f115190b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c event) {
                        int i142 = i14;
                        c3 state2 = state;
                        i this$0 = this.f115190b;
                        switch (i142) {
                            case 0:
                                int i15 = i.M0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(state2, "$state");
                                Intrinsics.checkNotNullParameter(event, "event");
                                if (event instanceof xl1.a) {
                                    IdeaPinEditablePageLite.a0(this$0.Y7());
                                    ((pu0.e) state2).f101385a.invoke(pu0.v.f101427a);
                                    break;
                                }
                                break;
                            default:
                                int i16 = i.M0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(state2, "$state");
                                Intrinsics.checkNotNullParameter(event, "event");
                                if (event instanceof xl1.a) {
                                    IdeaPinEditablePageLite.a0(this$0.Y7());
                                    ((pu0.e) state2).f101385a.invoke(x.f101429a);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        pu0.d dVar = (pu0.d) state;
        pu0.j y05 = dVar.y0();
        linkedHashSet.remove(y05.c());
        Y7().H0(y05.c(), y05.e(), y05.a());
        f8(dVar.y0());
        e8(dVar.y0());
        float min = (Math.min(500L, y05.a()) * 1.0f) / y05.b();
        IdeaPinDurationDragger ideaPinDurationDragger3 = this.E0;
        if (ideaPinDurationDragger3 == null) {
            Intrinsics.r("draggerView");
            throw null;
        }
        ideaPinDurationDragger3.f(min, 100.0f);
        float e14 = (y05.e() * 1.0f) / y05.b();
        IdeaPinDurationDragger ideaPinDurationDragger4 = this.E0;
        if (ideaPinDurationDragger4 == null) {
            Intrinsics.r("draggerView");
            throw null;
        }
        ideaPinDurationDragger4.h(e14);
        float a14 = (y05.a() * 1.0f) / y05.b();
        IdeaPinDurationDragger ideaPinDurationDragger5 = this.E0;
        if (ideaPinDurationDragger5 == null) {
            Intrinsics.r("draggerView");
            throw null;
        }
        ideaPinDurationDragger5.i(a14);
        Y7().o2();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.L0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.K0;
    }

    public final void h8(pu0.k config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Y7().K0(config);
        GestaltButton gestaltButton = this.H0;
        if (gestaltButton == null) {
            Intrinsics.r("transitionEnterButton");
            throw null;
        }
        gestaltButton.d(new h(config, 0));
        GestaltButton gestaltButton2 = this.I0;
        if (gestaltButton2 == null) {
            Intrinsics.r("transitionExitButton");
            throw null;
        }
        gestaltButton2.d(new h(config, 1));
        a.c.y(f7());
    }

    @Override // fu0.d, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.duration_dragger);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.E0 = (IdeaPinDurationDragger) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.duration_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.F0 = (GestaltText) findViewById2;
        View view = this.f62973k0;
        if (view != null) {
            view.setOnTouchListener((View.OnTouchListener) this.J0.getValue());
        }
        View findViewById3 = onCreateView.findViewById(aq1.d.transition_flow_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.G0 = (Flow) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.transition_enter);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.H0 = (GestaltButton) findViewById4;
        View findViewById5 = onCreateView.findViewById(aq1.d.transition_exit);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.I0 = (GestaltButton) findViewById5;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        GestaltButton gestaltButton = this.f62968f0;
        if (gestaltButton == null) {
            Intrinsics.r("cancelButton");
            throw null;
        }
        gestaltButton.d(g.f115195j);
        super.onPause();
    }

    @Override // fu0.d, nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        GestaltButton gestaltButton = this.f62968f0;
        if (gestaltButton == null) {
            Intrinsics.r("cancelButton");
            throw null;
        }
        gestaltButton.d(g.f115196k);
        super.onResume();
    }
}
