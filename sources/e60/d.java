package e60;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l;
import cp.t;
import h32.a4;
import h32.d4;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nr0.m;
import nx.d0;
import qa2.n;
import so.oa;
import x02.i2;
import yk1.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le60/d;", "Lv42/c;", "Le60/j;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "autoOrganize_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends a implements j {

    /* renamed from: m1, reason: collision with root package name */
    public static final /* synthetic */ int f57486m1 = 0;
    public i2 Y0;
    public uk1.e Z0;

    /* renamed from: a1, reason: collision with root package name */
    public v f57487a1;

    /* renamed from: b1, reason: collision with root package name */
    public m f57488b1;

    /* renamed from: c1, reason: collision with root package name */
    public iv1.b f57489c1;

    /* renamed from: d1, reason: collision with root package name */
    public GestaltButton f57490d1;

    /* renamed from: e1, reason: collision with root package name */
    public GestaltButtonGroup f57491e1;

    /* renamed from: f1, reason: collision with root package name */
    public i f57492f1;

    /* renamed from: j1, reason: collision with root package name */
    public GestaltText f57496j1;

    /* renamed from: k1, reason: collision with root package name */
    public FrameLayout f57497k1;

    /* renamed from: g1, reason: collision with root package name */
    public String f57493g1 = "";

    /* renamed from: h1, reason: collision with root package name */
    public final xk2.v f57494h1 = xk2.m.b(new c(this, 1));

    /* renamed from: i1, reason: collision with root package name */
    public final xk2.v f57495i1 = xk2.m.b(new c(this, 0));

    /* renamed from: l1, reason: collision with root package name */
    public a4 f57498l1 = a4.AUTO_ORGANIZE_REFINE_BOARD;

    @Override // yk1.k
    public final yk1.m V7() {
        List N = com.bumptech.glide.d.N(this, "cluster_pin_types", q0.f80391a);
        ArrayList arrayList = new ArrayList();
        Iterator it = N.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            d42.c.Companion.getClass();
            d42.c a13 = d42.a.a(intValue);
            if (a13 != null) {
                arrayList.add(a13);
            }
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        n W8 = W8();
        W8.f103320a.f128788o0 = arrayList.contains(d42.c.DOWNLOADED) || ((f60.b) this.f57495i1.getValue()) == f60.b.AFTER_DOWNLOAD;
        wa2.i iVar = W8.f103320a;
        iVar.f128799u = true;
        iVar.A = false;
        bVar.d(W8);
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
        wk1.c a14 = bVar.a();
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CLUSTER_ID", "-1");
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_NAME", "");
        int O = com.bumptech.glide.d.O(this, "moved_pin_count", -1);
        String Z3 = com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "");
        String Z4 = com.bumptech.glide.d.Z(this, "repin_id", "");
        this.f57493g1 = Z4;
        if (Z4.length() > 0) {
            a4 a4Var = a4.NRT_AUTO_ORGANIZE_REFINE_BOARD;
            Intrinsics.checkNotNullParameter(a4Var, "<set-?>");
            this.f57498l1 = a4Var;
        }
        v vVar = this.f57487a1;
        if (vVar == null) {
            Intrinsics.r("resources");
            throw null;
        }
        m mVar = this.f57488b1;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        d4 f128483k0 = getF128483k0();
        String str = (String) this.f57494h1.getValue();
        i2 i2Var2 = this.Y0;
        if (i2Var2 != null) {
            return new i(a14, vVar, mVar, Z, Z2, f128483k0, arrayList, O, Z3, str, i2Var2, this.f57493g1, com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_SOURCE", ""));
        }
        Intrinsics.r("pinRepository");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        if (this.f57493g1.length() > 0) {
            iv1.b bVar = this.f57489c1;
            if (bVar == null) {
                Intrinsics.r("nrtAutoOrgHelper");
                throw null;
            }
            bVar.d();
            f7().d(new iv1.c());
        }
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF135603f1() {
        return this.f57498l1;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF128483k0() {
        return d4.valueOf(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_AUTO_ORGANIZE_VIEW_TYPE", "FEED"));
    }

    @Override // v42.c
    /* renamed from: j9, reason: from getter */
    public final GestaltText getF111139h1() {
        return this.f57496j1;
    }

    @Override // v42.c
    /* renamed from: k9, reason: from getter */
    public final FrameLayout getF111140i1() {
        return this.f57497k1;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(oz1.c.organize_profile_pins_fragment, oz1.b.p_recycler_view);
        eVar.f979c = oz1.b.empty_state_container;
        eVar.b(oz1.b.loading_layout);
        return eVar;
    }

    public final boolean n9() {
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        return com.bumptech.glide.d.o0(f13 != null ? Boolean.valueOf(dl2.b.q1(f13)) : null) && !((f60.b) this.f57495i1.getValue()).isNRT();
    }

    public final void o9(boolean z13) {
        if (n9()) {
            GestaltButtonGroup gestaltButtonGroup = this.f57491e1;
            if (gestaltButtonGroup != null) {
                gestaltButtonGroup.a(new t(z13, 10));
                return;
            } else {
                Intrinsics.r("bottomButtons");
                throw null;
            }
        }
        GestaltButton gestaltButton = this.f57490d1;
        if (gestaltButton != null) {
            gestaltButton.d(new t(z13, 11));
        } else {
            Intrinsics.r("nextButton");
            throw null;
        }
    }

    @Override // v42.c, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f57496j1 = (GestaltText) view.findViewById(oz1.b.num_selected_pin_indicator);
        this.f57497k1 = (FrameLayout) view.findViewById(oz1.b.num_selected_pin_indicator_container);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(oz1.b.organize_profile_pins_bottom_buttons_container);
        View findViewById = frameLayout.findViewById(oz1.b.organize_profile_pins_bottom_buttons);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f57491e1 = (GestaltButtonGroup) findViewById;
        View findViewById2 = view.findViewById(oz1.b.next_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f57490d1 = (GestaltButton) findViewById2;
        final int i13 = 0;
        if (n9()) {
            GestaltButton gestaltButton = this.f57490d1;
            if (gestaltButton == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            bs1.c.X0(gestaltButton);
            bs1.c.U1(frameLayout);
            GestaltButtonGroup gestaltButtonGroup = this.f57491e1;
            if (gestaltButtonGroup == null) {
                Intrinsics.r("bottomButtons");
                throw null;
            }
            gestaltButtonGroup.b(new gm1.a(this) { // from class: e60.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f57483b;

                {
                    this.f57483b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    i iVar;
                    int i14 = i13;
                    d this$0 = this.f57483b;
                    switch (i14) {
                        case 0:
                            int i15 = d.f57486m1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            GestaltButtonGroup gestaltButtonGroup2 = this$0.f57491e1;
                            if (gestaltButtonGroup2 == null) {
                                Intrinsics.r("bottomButtons");
                                throw null;
                            }
                            if (r.Z0(it, gestaltButtonGroup2)) {
                                i iVar2 = this$0.f57492f1;
                                if (iVar2 != null) {
                                    iVar2.F3();
                                    return;
                                }
                                return;
                            }
                            GestaltButtonGroup gestaltButtonGroup3 = this$0.f57491e1;
                            if (gestaltButtonGroup3 == null) {
                                Intrinsics.r("bottomButtons");
                                throw null;
                            }
                            if (r.a1(it, gestaltButtonGroup3) && (iVar = this$0.f57492f1) != null && iVar.isBound()) {
                                d0 pinalytics = iVar.getPinalytics();
                                u0 u0Var = u0.MOVE_PINS_BUTTON;
                                HashMap hashMap = new HashMap();
                                String str = iVar.f57510l;
                                if (str != null) {
                                    hashMap.put("navigation_source", str);
                                }
                                Unit unit = Unit.f80348a;
                                pinalytics.Z(u0Var, hashMap);
                                NavigationImpl z33 = iVar.z3((ScreenLocation) l.f51050a.getValue());
                                z33.Y1("com.pinterest.EXTRA_FULL_SCREEN", true);
                                z33.Y1("com.pinterest.EXTRA_IS_MOVING_PINS_FROM_CLUSTER", true);
                                int size = iVar.f57509k - iVar.f57516r.size();
                                if (size < 0) {
                                    size = 0;
                                }
                                z33.z(size, "moved_pin_count");
                                z33.z(a4.AUTO_ORGANIZE.getValue(), "com.pinterest.EXTRA_BOARD_PICKER_SURFACE_ORIGIN");
                                ((nl1.d) ((j) iVar.getView())).M1(z33);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = d.f57486m1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            i iVar3 = this$0.f57492f1;
                            if (iVar3 != null) {
                                iVar3.F3();
                                return;
                            }
                            return;
                        default:
                            int i17 = d.f57486m1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.s7().X(u0.BACK_BUTTON);
                                this$0.P7();
                                return;
                            }
                            return;
                    }
                }
            });
        } else {
            bs1.c.X0(frameLayout);
            GestaltButton gestaltButton2 = this.f57490d1;
            if (gestaltButton2 == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            bs1.c.U1(gestaltButton2);
            GestaltButton gestaltButton3 = this.f57490d1;
            if (gestaltButton3 == null) {
                Intrinsics.r("nextButton");
                throw null;
            }
            final int i14 = 1;
            gestaltButton3.e(new gm1.a(this) { // from class: e60.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f57483b;

                {
                    this.f57483b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    i iVar;
                    int i142 = i14;
                    d this$0 = this.f57483b;
                    switch (i142) {
                        case 0:
                            int i15 = d.f57486m1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            GestaltButtonGroup gestaltButtonGroup2 = this$0.f57491e1;
                            if (gestaltButtonGroup2 == null) {
                                Intrinsics.r("bottomButtons");
                                throw null;
                            }
                            if (r.Z0(it, gestaltButtonGroup2)) {
                                i iVar2 = this$0.f57492f1;
                                if (iVar2 != null) {
                                    iVar2.F3();
                                    return;
                                }
                                return;
                            }
                            GestaltButtonGroup gestaltButtonGroup3 = this$0.f57491e1;
                            if (gestaltButtonGroup3 == null) {
                                Intrinsics.r("bottomButtons");
                                throw null;
                            }
                            if (r.a1(it, gestaltButtonGroup3) && (iVar = this$0.f57492f1) != null && iVar.isBound()) {
                                d0 pinalytics = iVar.getPinalytics();
                                u0 u0Var = u0.MOVE_PINS_BUTTON;
                                HashMap hashMap = new HashMap();
                                String str = iVar.f57510l;
                                if (str != null) {
                                    hashMap.put("navigation_source", str);
                                }
                                Unit unit = Unit.f80348a;
                                pinalytics.Z(u0Var, hashMap);
                                NavigationImpl z33 = iVar.z3((ScreenLocation) l.f51050a.getValue());
                                z33.Y1("com.pinterest.EXTRA_FULL_SCREEN", true);
                                z33.Y1("com.pinterest.EXTRA_IS_MOVING_PINS_FROM_CLUSTER", true);
                                int size = iVar.f57509k - iVar.f57516r.size();
                                if (size < 0) {
                                    size = 0;
                                }
                                z33.z(size, "moved_pin_count");
                                z33.z(a4.AUTO_ORGANIZE.getValue(), "com.pinterest.EXTRA_BOARD_PICKER_SURFACE_ORIGIN");
                                ((nl1.d) ((j) iVar.getView())).M1(z33);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = d.f57486m1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            i iVar3 = this$0.f57492f1;
                            if (iVar3 != null) {
                                iVar3.F3();
                                return;
                            }
                            return;
                        default:
                            int i17 = d.f57486m1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.s7().X(u0.BACK_BUTTON);
                                this$0.P7();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        o9(false);
        final int i15 = 2;
        ((GestaltIconButton) view.findViewById(oz1.b.back_button)).u(new gm1.a(this) { // from class: e60.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f57483b;

            {
                this.f57483b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                i iVar;
                int i142 = i15;
                d this$0 = this.f57483b;
                switch (i142) {
                    case 0:
                        int i152 = d.f57486m1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltButtonGroup gestaltButtonGroup2 = this$0.f57491e1;
                        if (gestaltButtonGroup2 == null) {
                            Intrinsics.r("bottomButtons");
                            throw null;
                        }
                        if (r.Z0(it, gestaltButtonGroup2)) {
                            i iVar2 = this$0.f57492f1;
                            if (iVar2 != null) {
                                iVar2.F3();
                                return;
                            }
                            return;
                        }
                        GestaltButtonGroup gestaltButtonGroup3 = this$0.f57491e1;
                        if (gestaltButtonGroup3 == null) {
                            Intrinsics.r("bottomButtons");
                            throw null;
                        }
                        if (r.a1(it, gestaltButtonGroup3) && (iVar = this$0.f57492f1) != null && iVar.isBound()) {
                            d0 pinalytics = iVar.getPinalytics();
                            u0 u0Var = u0.MOVE_PINS_BUTTON;
                            HashMap hashMap = new HashMap();
                            String str = iVar.f57510l;
                            if (str != null) {
                                hashMap.put("navigation_source", str);
                            }
                            Unit unit = Unit.f80348a;
                            pinalytics.Z(u0Var, hashMap);
                            NavigationImpl z33 = iVar.z3((ScreenLocation) l.f51050a.getValue());
                            z33.Y1("com.pinterest.EXTRA_FULL_SCREEN", true);
                            z33.Y1("com.pinterest.EXTRA_IS_MOVING_PINS_FROM_CLUSTER", true);
                            int size = iVar.f57509k - iVar.f57516r.size();
                            if (size < 0) {
                                size = 0;
                            }
                            z33.z(size, "moved_pin_count");
                            z33.z(a4.AUTO_ORGANIZE.getValue(), "com.pinterest.EXTRA_BOARD_PICKER_SURFACE_ORIGIN");
                            ((nl1.d) ((j) iVar.getView())).M1(z33);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = d.f57486m1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        i iVar3 = this$0.f57492f1;
                        if (iVar3 != null) {
                            iVar3.F3();
                            return;
                        }
                        return;
                    default:
                        int i17 = d.f57486m1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.s7().X(u0.BACK_BUTTON);
                            this$0.P7();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
