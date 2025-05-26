package a41;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.api.model.b30;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import com.pinterest.ui.actionbar.LegoActionBar;
import ey.j3;
import ey.k3;
import ey.m3;
import ey.w3;
import h32.f1;
import h32.u0;
import i32.y0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.f3;
import lh0.g1;
import lh0.u2;
import lh0.z3;
import m60.t0;
import m60.x0;
import q5.c1;
import t3.s1;
import x02.x2;

/* loaded from: classes5.dex */
public final class d0 extends yk1.t implements l0 {
    public final nk1.l A;
    public final f3 B;
    public wy0 C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final xk2.v f555J;
    public final ArrayList K;
    public final ArrayList L;
    public final p41.b M;
    public p41.b N;
    public u32.i O;
    public xj2.c P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public k0 T;
    public k0 U;
    public boolean V;
    public l41.b W;
    public final a0 X;

    /* renamed from: a, reason: collision with root package name */
    public final String f556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f557b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f558c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f559d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f560e;

    /* renamed from: f, reason: collision with root package name */
    public final r41.i f561f;

    /* renamed from: g, reason: collision with root package name */
    public final r41.g f562g;

    /* renamed from: h, reason: collision with root package name */
    public final r41.b f563h;

    /* renamed from: i, reason: collision with root package name */
    public final String f564i;

    /* renamed from: j, reason: collision with root package name */
    public final x2 f565j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.w f566k;

    /* renamed from: l, reason: collision with root package name */
    public final yk1.v f567l;

    /* renamed from: m, reason: collision with root package name */
    public final j3 f568m;

    /* renamed from: n, reason: collision with root package name */
    public final k3 f569n;

    /* renamed from: o, reason: collision with root package name */
    public final rg0.s f570o;

    /* renamed from: p, reason: collision with root package name */
    public final bq.c f571p;

    /* renamed from: q, reason: collision with root package name */
    public final nx.f0 f572q;

    /* renamed from: r, reason: collision with root package name */
    public final u2 f573r;

    /* renamed from: s, reason: collision with root package name */
    public final k22.m f574s;

    /* renamed from: t, reason: collision with root package name */
    public final x10.d f575t;

    /* renamed from: u, reason: collision with root package name */
    public final i92.k f576u;

    /* renamed from: v, reason: collision with root package name */
    public final gs1.a f577v;

    /* renamed from: w, reason: collision with root package name */
    public final qb0.e f578w;

    /* renamed from: x, reason: collision with root package name */
    public final b60.b f579x;

    /* renamed from: y, reason: collision with root package name */
    public final q41.a f580y;

    /* renamed from: z, reason: collision with root package name */
    public final no1.e f581z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(uk1.d presenterPinalytics, p41.d initialTabSetup, r41.e display, String userId, String originPinId, boolean z13, boolean z14, boolean z15, r41.i viewingMode, r41.g navigationOrigin, r41.b adsOnlyProfileOrigin, String inviteCode, uj2.q networkStateStream, x2 userRepository, m60.w eventManager, yk1.v viewResources, k3 perfLogger, rg0.s experiences, bq.c boardSortingUtils, nx.f0 pinalyticsFactory, u2 experiments, k22.m userService, x10.d settingsApi, i92.k toastUtils, gs1.a clipboardProvider, qb0.e networkUtils, b60.b activeUserManager, q41.a userProfileUtil, no1.e conversationRemoteDataSource, nk1.l userProfileFollowConfirmationProvider, f3 searchLibraryExperiments) {
        super(presenterPinalytics, networkStateStream);
        j3 perfLogUtils = j3.f60510a;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(initialTabSetup, "initialTabSetup");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(originPinId, "originPinId");
        Intrinsics.checkNotNullParameter(viewingMode, "viewingMode");
        Intrinsics.checkNotNullParameter(navigationOrigin, "navigationOrigin");
        Intrinsics.checkNotNullParameter(adsOnlyProfileOrigin, "adsOnlyProfileOrigin");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(perfLogUtils, "perfLogUtils");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(boardSortingUtils, "boardSortingUtils");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(clipboardProvider, "clipboardProvider");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(userProfileUtil, "userProfileUtil");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        Intrinsics.checkNotNullParameter(userProfileFollowConfirmationProvider, "userProfileFollowConfirmationProvider");
        Intrinsics.checkNotNullParameter(searchLibraryExperiments, "searchLibraryExperiments");
        this.f556a = userId;
        this.f557b = originPinId;
        this.f558c = z13;
        this.f559d = z14;
        this.f560e = z15;
        this.f561f = viewingMode;
        this.f562g = navigationOrigin;
        this.f563h = adsOnlyProfileOrigin;
        this.f564i = inviteCode;
        this.f565j = userRepository;
        this.f566k = eventManager;
        this.f567l = viewResources;
        this.f568m = perfLogUtils;
        this.f569n = perfLogger;
        this.f570o = experiences;
        this.f571p = boardSortingUtils;
        this.f572q = pinalyticsFactory;
        this.f573r = experiments;
        this.f574s = userService;
        this.f575t = settingsApi;
        this.f576u = toastUtils;
        this.f577v = clipboardProvider;
        this.f578w = networkUtils;
        this.f579x = activeUserManager;
        this.f580y = userProfileUtil;
        this.f581z = conversationRemoteDataSource;
        this.A = userProfileFollowConfirmationProvider;
        this.B = searchLibraryExperiments;
        wy0 f13 = ((b60.d) activeUserManager).f();
        boolean z16 = false;
        boolean z17 = f13 != null && dl2.b.S1(f13, userId);
        this.D = z17;
        boolean z18 = display == r41.e.Pinner;
        this.E = z18;
        boolean z19 = display == r41.e.Business;
        this.F = z19;
        this.G = z17 && z18;
        this.H = z17 && z19;
        if (!z17 && z19) {
            z16 = true;
        }
        this.I = z16;
        this.f555J = xk2.m.b(new w(this, 10));
        this.K = pe.i.e1(initialTabSetup);
        ArrayList H0 = CollectionsKt.H0(pe.i.r(initialTabSetup));
        this.L = H0;
        p41.b bVar = null;
        u32.i iVar = initialTabSetup.f98853c;
        if (iVar != null) {
            Iterator it = H0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((p41.b) next).f98848e == iVar) {
                    bVar = next;
                    break;
                }
            }
            bVar = bVar;
        }
        this.M = bVar;
        this.N = bVar;
        this.Q = true;
        this.T = k0.Expanded;
        this.X = new a0(this);
    }

    public static final void p3(d0 d0Var, u0 u0Var, String str) {
        d0Var.getClass();
        ((nx.m) d0Var.f572q).a(new ss0.b(2)).N(f1.TAP, u0Var, h32.g0.CONTACT_SHEET, str, false);
    }

    public static z92.c q3(d0 d0Var, wy0 wy0Var) {
        z92.g gVar;
        z92.g gVar2;
        boolean z13 = d0Var.f559d;
        boolean z14 = d0Var.H;
        if (z13) {
            Boolean s22 = wy0Var.s2();
            Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
            nk1.h s13 = kh2.d.s(s22.booleanValue(), c0.d.d2(wy0Var));
            ArrayList arrayList = new ArrayList();
            if (z14) {
                arrayList.add(new z92.d(eo1.b.color_themed_base_red_300, eo1.b.color_white_0, nz1.f.creator_hub_entry_point_button_text, t0.profile_creator_hub_button, new w(d0Var, 2)));
            } else {
                arrayList.add(d0Var.Q3(wy0Var, s13));
                z92.d R3 = d0Var.R3(wy0Var);
                if (R3 != null) {
                    arrayList.add(R3);
                }
            }
            return new z92.b(arrayList);
        }
        z92.a aVar = z92.a.f141417e;
        if (!d0Var.D) {
            Boolean s23 = wy0Var.s2();
            Intrinsics.checkNotNullExpressionValue(s23, "getBlockedByMe(...)");
            nk1.h s14 = kh2.d.s(s23.booleanValue(), c0.d.d2(wy0Var));
            if (!d0Var.f580y.a(wy0Var) || s14 == nk1.h.FOLLOWING) {
                b60.b bVar = d0Var.f579x;
                if (z14 || ai0.a.d(wy0Var, bVar)) {
                    gVar = z92.g.f141440d;
                } else {
                    int i13 = LegoActionBar.f52202h;
                    y onClickAction = new y(d0Var, wy0Var, 5);
                    Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
                    gVar = new z92.g(rm1.q.ANDROID_SHARE, onClickAction, Integer.valueOf(x0.share));
                }
                if (z14 || ai0.a.d(wy0Var, bVar)) {
                    gVar2 = z92.g.f141440d;
                } else {
                    int i14 = LegoActionBar.f52202h;
                    y onClickAction2 = new y(d0Var, wy0Var, 3);
                    Intrinsics.checkNotNullParameter(onClickAction2, "onClickAction");
                    gVar2 = new z92.g(rm1.q.ELLIPSIS, onClickAction2, Integer.valueOf(x0.more_options));
                }
                aVar = new z92.a(gVar, gVar2, d0Var.Q3(wy0Var, s14), d0Var.R3(wy0Var));
            }
        }
        return aVar;
    }

    public static i0 s3(d0 d0Var) {
        k0 k0Var = d0Var.U;
        if (k0Var == null) {
            k0Var = d0Var.f558c ? k0.Collapsed : k0.Expanded;
        }
        return new i0(k0Var, false);
    }

    public final void B3(wy0 user) {
        if (isBound()) {
            r rVar = (r) ((p0) getView());
            rVar.getClass();
            Intrinsics.checkNotNullParameter(user, "user");
            n41.b bVar = (n41.b) rVar.H1.getValue();
            Context requireContext = rVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            bVar.a(requireContext, user);
        }
    }

    public final f0 D3(boolean z13) {
        return U3(rm1.q.ARROW_BACK, Integer.valueOf(x0.back), z13, new w(this, 6));
    }

    @Override // yk1.p
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final void r3(p0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((r) view).f668t1 = this;
        w3();
        this.f566k.h(this.X);
    }

    public final void G3(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        z3(user);
    }

    public final void H3() {
        X3(new i0(k0.Collapsed, true));
    }

    public final void I3(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "createdBoardId");
        if (boardId.length() > 0) {
            r rVar = (r) ((p0) getView());
            rVar.getClass();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            g70.b bVar = (!rVar.m8() || rVar.p8().isPublic()) ? g70.b.PUBLIC_BOARD : g70.b.NONE;
            g70.h hVar = rVar.H0;
            if (hVar != null) {
                g70.h.g(hVar, boardId, bVar, null, 4);
            } else {
                Intrinsics.r("boardNavigator");
                throw null;
            }
        }
    }

    public final void J3() {
        b90 f43;
        if (isBound()) {
            getPinalytics().F(h32.g0.PROFILE_HEADER, u0.OVERFLOW_BUTTON);
            int i13 = 7;
            if (this.H) {
                p0 p0Var = (p0) getView();
                wy0 wy0Var = this.C;
                boolean d2 = Intrinsics.d((wy0Var == null || (f43 = wy0Var.f4()) == null) ? null : f43.f(), "image");
                ha2.a0[] a0VarArr = new ha2.a0[2];
                a0VarArr[0] = m41.a.f85829c;
                a0VarArr[1] = d2 ? m41.a.f85827a : m41.a.f85828b;
                ((r) p0Var).Y4(m41.a.a(kotlin.collections.f0.l(a0VarArr), new x(this, i13)));
                return;
            }
            if (!this.G) {
                wy0 wy0Var2 = this.C;
                if (wy0Var2 != null) {
                    B3(wy0Var2);
                    return;
                }
                return;
            }
            p0 p0Var2 = (p0) getView();
            boolean z13 = this.T == k0.Collapsed;
            ArrayList l13 = kotlin.collections.f0.l(m41.a.f85829c, m41.a.f85832f, m41.a.f85830d);
            if (z13) {
                l13.add(m41.a.f85831e);
            }
            ((r) p0Var2).Y4(m41.a.a(l13, new x(this, i13)));
        }
    }

    public final void K3() {
        if (isBound()) {
            x3();
        }
    }

    public final void L3() {
        wy0 wy0Var;
        if (isBound() && (wy0Var = this.C) != null) {
            new y(this, wy0Var, 5).invoke();
        }
    }

    public final void M3() {
        nx.d0 pinalytics = getPinalytics();
        boolean z13 = this.f558c;
        pinalytics.X(z13 ? u0.YOUR_PROFILE_BUTTON : u0.PROFILE_HEADER_EXPAND_BUTTON);
        if (z13) {
            kg.a.I(this.f566k);
            return;
        }
        X3(new i0(k0.Expanded, true));
        com.pinterest.framework.screens.a Z7 = ((r) ((p0) getView())).Z7();
        com.pinterest.feature.profile.b bVar = Z7 instanceof com.pinterest.feature.profile.b ? (com.pinterest.feature.profile.b) Z7 : null;
        if (bVar != null) {
            bVar.w();
        }
    }

    public final f0 N3(boolean z13) {
        return (this.D || this.H || this.f580y.a(this.C) || this.f559d) ? U3(rm1.q.ELLIPSIS, Integer.valueOf(nz1.f.profile_options), z13, new w(this, 7)) : f0.f588f;
    }

    public final z92.d Q3(wy0 wy0Var, nk1.h hVar) {
        int i13 = v.f691c[hVar.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            int i15 = LegoActionBar.f52202h;
            y onClickAction = new y(this, wy0Var, i14);
            Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
            return new z92.d(eo1.b.color_themed_text_default, eo1.b.color_themed_background_default, x0.following_content, t0.profile_unfollow_btn, onClickAction);
        }
        int i16 = 2;
        if (i13 == 2) {
            int i17 = LegoActionBar.f52202h;
            y onClickAction2 = new y(this, wy0Var, i16);
            Intrinsics.checkNotNullParameter(onClickAction2, "onClickAction");
            return new z92.d(eo1.b.color_themed_base_red_300, eo1.b.color_white_0, x0.follow, t0.profile_follow_btn, onClickAction2);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i18 = LegoActionBar.f52202h;
        y onClickAction3 = new y(this, wy0Var, 0);
        Intrinsics.checkNotNullParameter(onClickAction3, "onClickAction");
        return new z92.d(eo1.b.color_themed_light_gray, eo1.b.color_themed_text_default, x0.unblock, -1, onClickAction3);
    }

    public final z92.d R3(wy0 wy0Var) {
        wy0 f13 = ((b60.d) this.f579x).f();
        if (f13 == null) {
            return null;
        }
        Boolean s43 = f13.s4();
        Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
        if (!s43.booleanValue()) {
            return null;
        }
        Boolean s44 = wy0Var.s4();
        Intrinsics.checkNotNullExpressionValue(s44, "getShouldShowMessaging(...)");
        if (!s44.booleanValue() || wy0Var.s2().booleanValue() || wy0Var.G3().booleanValue()) {
            return null;
        }
        getPinalytics().N(f1.RENDER, u0.PROFILE_MESSAGE_BUTTON, h32.g0.CONVERSATION_MESSAGES, this.f556a, false);
        int i13 = LegoActionBar.f52202h;
        y onClickAction = new y(this, f13, 4);
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        return new z92.d(eo1.b.color_themed_light_gray, eo1.b.color_themed_text_default, x0.pin_msg, -1, onClickAction);
    }

    public final f0 S3(boolean z13) {
        return U3(rm1.q.ANDROID_SHARE, Integer.valueOf(x0.share), z13, new w(this, 9));
    }

    public final boolean T3() {
        return this.E && !this.f561f.isPublic();
    }

    public final f0 U3(rm1.q qVar, Integer num, boolean z13, w wVar) {
        boolean z14 = this.F;
        return new f0(qVar, (z14 && z13) ? om1.f.TRANSPARENT_ALWAYS_LIGHT : om1.f.TRANSPARENT_DARK_GRAY, z14 ? ((yk1.a) this.f567l).f139224a.getDimensionPixelSize(eo1.c.space_200) : 0, num, wVar);
    }

    public final void V3(Boolean bool) {
        getPinalytics().X(u0.ALL_PINS_VISIBILITY_SWITCH);
        qz.f0 f0Var = new qz.f0();
        f0Var.d(bool, "show_all_pins");
        addDisposable(this.f575t.a(f0Var.i()).r(tk2.e.f118017c).l(wj2.c.a()).o(new u(5, new x(this, 9)), new u(6, i.B)));
    }

    public final void W3(k0 k0Var, List list) {
        ViewGroup viewGroup;
        this.U = k0Var;
        if (isBound()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h0 iconState = (h0) it.next();
                final r rVar = (r) ((p0) getView());
                rVar.getClass();
                Intrinsics.checkNotNullParameter(iconState, "iconState");
                int i13 = g.f595b[iconState.f600a.ordinal()];
                final int i14 = 1;
                if (i13 != 1) {
                    final int i15 = 2;
                    if (i13 == 2) {
                        GestaltIconButton gestaltIconButton = rVar.f648c1;
                        viewGroup = gestaltIconButton;
                        if (gestaltIconButton == null) {
                            Intrinsics.r("collapsedStateNavigationIcon");
                            throw null;
                        }
                    } else if (i13 == 3) {
                        GestaltIconButton gestaltIconButton2 = rVar.f650e1;
                        if (gestaltIconButton2 == null) {
                            Intrinsics.r("collapsedStateOptionsIcon");
                            throw null;
                        }
                        gestaltIconButton2.t(i.f613s);
                        final int i16 = 0;
                        gestaltIconButton2.u(new gm1.a() { // from class: a41.e
                            @Override // gm1.a
                            public final void h3(gm1.c it2) {
                                l0 l0Var;
                                l0 l0Var2;
                                l0 l0Var3;
                                int i17 = i16;
                                r this$0 = rVar;
                                switch (i17) {
                                    case 0:
                                        int i18 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var = this$0.f668t1) != null) {
                                            ((d0) l0Var).J3();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        int i19 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var2 = this$0.f668t1) != null) {
                                            ((d0) l0Var2).K3();
                                            break;
                                        }
                                        break;
                                    default:
                                        int i23 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var3 = this$0.f668t1) != null) {
                                            ((d0) l0Var3).L3();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        viewGroup = gestaltIconButton2;
                    } else if (i13 == 4) {
                        GestaltIconButton gestaltIconButton3 = rVar.f650e1;
                        if (gestaltIconButton3 == null) {
                            Intrinsics.r("collapsedStateOptionsIcon");
                            throw null;
                        }
                        gestaltIconButton3.t(i.f614t);
                        gestaltIconButton3.u(new gm1.a() { // from class: a41.e
                            @Override // gm1.a
                            public final void h3(gm1.c it2) {
                                l0 l0Var;
                                l0 l0Var2;
                                l0 l0Var3;
                                int i17 = i14;
                                r this$0 = rVar;
                                switch (i17) {
                                    case 0:
                                        int i18 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var = this$0.f668t1) != null) {
                                            ((d0) l0Var).J3();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        int i19 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var2 = this$0.f668t1) != null) {
                                            ((d0) l0Var2).K3();
                                            break;
                                        }
                                        break;
                                    default:
                                        int i23 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var3 = this$0.f668t1) != null) {
                                            ((d0) l0Var3).L3();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        viewGroup = gestaltIconButton3;
                    } else {
                        if (i13 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        GestaltIconButton gestaltIconButton4 = rVar.f651f1;
                        if (gestaltIconButton4 == null) {
                            Intrinsics.r("collapsedStateShareIcon");
                            throw null;
                        }
                        gestaltIconButton4.t(i.f615u);
                        gestaltIconButton4.u(new gm1.a() { // from class: a41.e
                            @Override // gm1.a
                            public final void h3(gm1.c it2) {
                                l0 l0Var;
                                l0 l0Var2;
                                l0 l0Var3;
                                int i17 = i15;
                                r this$0 = rVar;
                                switch (i17) {
                                    case 0:
                                        int i18 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var = this$0.f668t1) != null) {
                                            ((d0) l0Var).J3();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        int i19 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var2 = this$0.f668t1) != null) {
                                            ((d0) l0Var2).K3();
                                            break;
                                        }
                                        break;
                                    default:
                                        int i23 = r.P1;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        if ((it2 instanceof om1.l) && (l0Var3 = this$0.f668t1) != null) {
                                            ((d0) l0Var3).L3();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        viewGroup = gestaltIconButton4;
                    }
                } else {
                    ViewGroup viewGroup2 = rVar.Z0;
                    viewGroup = viewGroup2;
                    if (viewGroup2 == null) {
                        Intrinsics.r("collapsedStateAvatarContainer");
                        throw null;
                    }
                }
                f fVar = iconState.f602c ? f.FadeIn : f.FadeOut;
                if (iconState.f601b) {
                    if (iconState.f603d) {
                        viewGroup.animate().alpha(fVar.getEndAlpha()).setDuration(300L).setListener(new c1((Object) rVar, (Object) viewGroup, (Serializable) fVar, 4)).start();
                    } else {
                        rVar.E8(viewGroup, fVar);
                    }
                } else if (viewGroup.getVisibility() == 0) {
                    bs1.c.X0(viewGroup);
                }
            }
        }
    }

    public final void X3(i0 headerState) {
        boolean isBound = isBound();
        boolean z13 = headerState.f623b;
        k0 k0Var = headerState.f622a;
        if (isBound) {
            r rVar = (r) ((p0) getView());
            rVar.getClass();
            Intrinsics.checkNotNullParameter(headerState, "headerState");
            if (!z13 && k0Var == k0.Collapsed) {
                rVar.f674w1 = true;
            }
            int i13 = g.f594a[k0Var.ordinal()];
            if (i13 == 1) {
                rVar.z8(true, z13);
            } else if (i13 == 2) {
                rVar.z8(false, z13);
                if (rVar.L1) {
                    ur0.e eVar = rVar.f656k1;
                    if (eVar != null) {
                        rVar.f657l1.post(eVar);
                    }
                    rVar.L1 = false;
                }
            }
        }
        this.T = k0Var;
        W3(k0Var, r3(k0Var == k0.Collapsed, z13));
        Y3(this.T);
    }

    public final void Y3(k0 k0Var) {
        if (!isBound() || k0Var == null) {
            return;
        }
        if (this.V) {
            ((r) ((p0) getView())).I8(k0Var == k0.Collapsed, false);
        } else {
            ((r) ((p0) getView())).I8(false, true);
        }
    }

    public final void Z3() {
        l41.b searchCellViewModel;
        cn1.c cVar;
        cn1.c cVar2;
        boolean z13;
        p41.b bVar = this.N;
        u32.i iVar = bVar != null ? bVar.f98848e : null;
        int i13 = 1;
        boolean z14 = this.D;
        if (z14 && !this.f561f.isPublic()) {
            int i14 = iVar == null ? -1 : v.f689a[iVar.ordinal()];
            int i15 = 4;
            if (i14 == 2 || i14 == 4) {
                ArrayList arrayList = new ArrayList();
                wy0 wy0Var = this.C;
                if (z14 && !(z13 = this.f558c) && c0.d.m0(wy0Var)) {
                    w actionHandler = new w(this, i13);
                    int i16 = t0.profile_boards_tab_filter_icon;
                    rm1.q icon = z13 ? rm1.q.ARROWS_VERTICAL : rm1.q.FILTER;
                    int i17 = nz1.f.accessibility_filter_icon_profile_boards_tab;
                    boolean z15 = !z13 || c0.d.m0(this.C);
                    om1.f style = om1.f.DEFAULT_WHITE;
                    Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(style, "style");
                    arrayList.add(new z92.e(String.valueOf(i16), icon, eo1.b.color_themed_dark_gray, actionHandler, i17, z15, style));
                }
                z actionHandler2 = new z(this, 0);
                int i18 = t0.profile_boards_tab_create_icon;
                int i19 = oz1.e.accessibility_create_icon;
                om1.f style2 = om1.f.DEFAULT_WHITE;
                Intrinsics.checkNotNullParameter(actionHandler2, "actionHandler");
                Intrinsics.checkNotNullParameter(style2, "style");
                arrayList.add(new z92.e(String.valueOf(i18), rm1.q.ADD, eo1.b.color_themed_dark_gray, actionHandler2, i19, true, style2));
                searchCellViewModel = new l41.b(arrayList, new w(this, i15), ((yk1.a) this.f567l).f139224a.getString(x0.search_your_pins), new z(this, 1));
                if (searchCellViewModel != null || Intrinsics.d(this.W, searchCellViewModel)) {
                }
                this.W = searchCellViewModel;
                r rVar = (r) ((p0) getView());
                rVar.getClass();
                Intrinsics.checkNotNullParameter(searchCellViewModel, "searchCellViewModel");
                GestaltTabLayout gestaltTabLayout = rVar.V0;
                if (gestaltTabLayout == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                boolean s83 = ((t) rVar.a8()).u(gestaltTabLayout.m()) instanceof r0 ? rVar.s8() : false;
                GestaltStaticSearchBar gestaltStaticSearchBar = rVar.f652g1;
                if (gestaltStaticSearchBar == null) {
                    Intrinsics.r("searchFieldWithActions");
                    throw null;
                }
                oe.f.n(gestaltStaticSearchBar, new s1.w(s83, searchCellViewModel, rVar, 16));
                List list = searchCellViewModel.f81552a;
                if (!list.isEmpty()) {
                    z92.e eVar = (z92.e) CollectionsKt.U(0, list);
                    if (eVar != null) {
                        rVar.J1 = eVar.f141431d;
                        cVar = new cn1.c(eVar.f141429b, eVar.f141434g, bs1.c.j2(new String[0], eVar.f141432e), dn1.a.END_ACTION_BUTTONS_ONE, 16);
                    } else {
                        cVar = null;
                    }
                    z92.e eVar2 = (z92.e) CollectionsKt.U(1, list);
                    if (eVar2 != null) {
                        rVar.K1 = eVar2.f141431d;
                        cVar2 = new cn1.c(eVar2.f141429b, eVar2.f141434g, bs1.c.j2(new String[0], eVar2.f141432e), dn1.a.END_ACTION_BUTTONS_TWO, 16);
                    } else {
                        cVar2 = null;
                    }
                    GestaltStaticSearchBar gestaltStaticSearchBar2 = rVar.f652g1;
                    if (gestaltStaticSearchBar2 == null) {
                        Intrinsics.r("searchFieldWithActions");
                        throw null;
                    }
                    gestaltStaticSearchBar2.d0(new y11.c(10, cVar, cVar2));
                }
                GestaltStaticSearchBar gestaltStaticSearchBar3 = rVar.f652g1;
                if (gestaltStaticSearchBar3 != null) {
                    gestaltStaticSearchBar3.k0(new lq0.o(22, rVar, searchCellViewModel));
                    return;
                } else {
                    Intrinsics.r("searchFieldWithActions");
                    throw null;
                }
            }
        }
        searchCellViewModel = null;
        if (searchCellViewModel != null) {
        }
    }

    public final void a4(wy0 user) {
        p41.b bVar;
        rm1.d dVar;
        if (isBound()) {
            Y3(this.U);
            o0 u33 = u3(user);
            ArrayList arrayList = this.L;
            arrayList.clear();
            List list = u33.f642a;
            arrayList.addAll(list);
            if (!arrayList.isEmpty() || (bVar = this.M) == null) {
                bVar = (p41.b) CollectionsKt.U(u33.f643b, arrayList);
            }
            this.N = bVar;
            this.O = bVar != null ? bVar.f98848e : null;
            this.V = list.size() == 1;
            r rVar = (r) ((p0) getView());
            rVar.F8(user);
            rVar.B8(q3(this, user));
            Intrinsics.checkNotNullParameter(user, "user");
            GestaltAvatar gestaltAvatar = rVar.f646a1;
            if (gestaltAvatar == null) {
                Intrinsics.r("collapsedStateAvatar");
                throw null;
            }
            kh2.m0.V0(gestaltAvatar, user);
            Intrinsics.checkNotNullParameter(user, "user");
            GestaltText gestaltText = rVar.X0;
            if (gestaltText == null) {
                Intrinsics.r("profileName");
                throw null;
            }
            String Z2 = user.Z2();
            if (Z2 == null) {
                Z2 = "";
            }
            pk.a0.q(gestaltText, new u50.f0(Z2));
            if (rVar.n8()) {
                n10.d k13 = dl2.b.k1(user);
                String Z22 = user.Z2();
                if ((Z22 != null ? Z22 : "").length() <= 0 || !dl2.b.V1(user)) {
                    dVar = null;
                } else {
                    dVar = new rm1.d(new rm1.f(rm1.q.CHECK_CIRCLE_FILL, rm1.i.SM), g.f596c[k13.ordinal()] == 1 ? rm1.c.BRAND : rm1.c.INFO, null, 0, null, 28);
                }
                GestaltText gestaltText2 = rVar.X0;
                if (gestaltText2 == null) {
                    Intrinsics.r("profileName");
                    throw null;
                }
                gestaltText2.i(new ks0.f(dVar, 6));
            }
            rVar.J8(u33);
            wy0 wy0Var = this.C;
            if (com.bumptech.glide.d.o0(wy0Var != null ? wy0Var.i3() : null) && this.D && !this.f561f.isPublic()) {
                Z3();
            }
            GestaltText gestaltText3 = rVar.f653h1;
            if (gestaltText3 == null) {
                Intrinsics.r("privateProfileTitle");
                throw null;
            }
            pk.a0.k0(gestaltText3);
            GestaltText gestaltText4 = rVar.f654i1;
            if (gestaltText4 == null) {
                Intrinsics.r("privateProfileDescription");
                throw null;
            }
            pk.a0.k0(gestaltText4);
            RelativeLayout relativeLayout = rVar.Y0;
            if (relativeLayout != null) {
                bs1.c.U1(relativeLayout);
            } else {
                Intrinsics.r("tabsNameAndAvatarContainer");
                throw null;
            }
        }
    }

    @Override // yk1.b
    public final void onActivate() {
        boolean z13 = this.Q;
        String userUid = this.f556a;
        if (z13) {
            this.Q = false;
        } else if (T3()) {
            Intrinsics.checkNotNullParameter(userUid, "userUid");
            new w3(userUid, this.D).i();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(rg0.o.CONTEXT_PROFILE_USER_ID.getValue(), userUid);
        if (this.f561f.isPublic()) {
            hashMap.put(rg0.o.CONTEXT_PROFILE_IS_OWN_PUBLIC_PROFILE.getValue(), "true");
        }
        addDisposable(nl.b.s(s1.f(((dh0.d) this.f570o).g(y0.ANDROID_USER_PROFILE_TAKEOVER, hashMap, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new x(this, 8), null, null, 6));
    }

    @Override // yk1.b
    public final void onActivityResult(int i13, int i14, Intent intent) {
        String stringExtra;
        String stringExtra2;
        super.onActivityResult(i13, i14, intent);
        if (isBound() && i13 == 900) {
            switch (i14) {
                case 910:
                    if (intent != null && (stringExtra = intent.getStringExtra("com.pinterest.EXTRA_PHOTO_PATH")) != null) {
                        p0 p0Var = (p0) getView();
                        File file = new File(stringExtra);
                        Intrinsics.checkNotNullParameter(file, "file");
                        ((r) p0Var).G8(new h41.c(file, ""));
                        break;
                    }
                    break;
                case 911:
                    if (intent != null && (stringExtra2 = intent.getStringExtra("com.pinterest.EXTRA_VIDEO_PATH")) != null) {
                        p0 p0Var2 = (p0) getView();
                        File file2 = new File(stringExtra2);
                        Intrinsics.checkNotNullParameter(file2, "file");
                        ((r) p0Var2).G8(new h41.d(file2));
                        break;
                    }
                    break;
                case 912:
                    addDisposable(this.f565j.g0().Q(this.f556a).s().o(new a21.a(29, i.f620z), new u(0, i.A)));
                    break;
            }
        }
    }

    @Override // yk1.b
    public final void onDeactivate() {
        p0 p0Var = (p0) getViewIfBound();
        if (p0Var != null) {
            r rVar = (r) p0Var;
            rVar.j8();
            zf0.f.a(rVar.f656k1);
            rVar.f656k1 = null;
        }
    }

    @Override // yk1.p
    public final void onNetworkRegained() {
        if (this.C == null) {
            w3();
        }
    }

    @Override // yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        k0 k0Var;
        u32.i iVar = null;
        if (bundle != null) {
            int i13 = bundle.getInt("SAVED_STATE_KEY_HEADER_VISIBILITY");
            k0.Companion.getClass();
            k0[] values = k0.values();
            int length = values.length;
            for (int i14 = 0; i14 < length; i14++) {
                k0Var = values[i14];
                if (k0Var.ordinal() == i13) {
                    break;
                }
            }
        }
        k0Var = null;
        this.U = k0Var;
        if (bundle != null) {
            int i15 = bundle.getInt("SAVED_STATE_KEY_SELECTED_TAB");
            u32.i.Companion.getClass();
            switch (i15) {
                case 0:
                    iVar = u32.i.SAVED;
                    break;
                case 1:
                    iVar = u32.i.CREATED;
                    break;
                case 2:
                    iVar = u32.i.SHOP;
                    break;
                case 3:
                    iVar = u32.i.TRIED;
                    break;
                case 4:
                    iVar = u32.i.BOARDS;
                    break;
                case 5:
                    iVar = u32.i.PINS;
                    break;
                case 6:
                    iVar = u32.i.COLLAGES;
                    break;
            }
        }
        this.O = iVar;
    }

    @Override // yk1.b
    public final void onSaveInstance(Bundle bundle) {
        k0 k0Var = this.U;
        if (k0Var != null && bundle != null) {
            bundle.putInt("SAVED_STATE_KEY_HEADER_VISIBILITY", k0Var.ordinal());
        }
        u32.i iVar = this.O;
        if (iVar == null || bundle == null) {
            return;
        }
        bundle.putInt("SAVED_STATE_KEY_SELECTED_TAB", iVar.ordinal());
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f566k.j(this.X);
        if (T3()) {
            new m3(this.f556a, this.D).i();
        }
        p0 p0Var = (p0) getViewIfBound();
        if (p0Var != null) {
            r rVar = (r) p0Var;
            rVar.j8();
            zf0.f.a(rVar.f656k1);
            rVar.f656k1 = null;
        }
        super.onUnbind();
    }

    public final List r3(boolean z13, boolean z14) {
        boolean z15 = this.f559d;
        boolean z16 = this.H;
        if (z15) {
            h0[] h0VarArr = new h0[4];
            h0VarArr[0] = new h0(g0.BackIcon, !z16, z13, z14);
            h0VarArr[1] = new h0(g0.AvatarIcon, this.V || z16, z13, z14);
            h0VarArr[2] = new h0(g0.ShareIcon, this.V, z13, z14);
            h0VarArr[3] = new h0(g0.OptionsIcon, true, z13, z14);
            return kotlin.collections.f0.j(h0VarArr);
        }
        boolean z17 = this.f558c;
        boolean z18 = this.D;
        if (z17) {
            ArrayList l13 = kotlin.collections.f0.l(new h0(g0.AvatarIcon, z18, z13, z14));
            u2 u2Var = this.f573r;
            u2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) u2Var.f83487a;
            if (g1Var.o("sg_android_profile_sharing_entry_point_on_retrieval_header", "enabled", z3Var) || g1Var.l("sg_android_profile_sharing_entry_point_on_retrieval_header")) {
                l13.add(new h0(g0.ShareIcon, z18, z13, z14));
            }
            return CollectionsKt.F0(l13);
        }
        if (z18 && this.f561f.isPublic()) {
            return kotlin.collections.e0.b(new h0(g0.BackIcon, true, z13, z14));
        }
        if (this.f580y.a(this.C)) {
            boolean z19 = !z18;
            return kotlin.collections.f0.j(new h0(g0.BackIcon, z19, z13, z14), new h0(g0.SettingsIcon, z18, z13, z14), new h0(g0.OptionsIcon, z19, z13, z14));
        }
        h0[] h0VarArr2 = new h0[3];
        h0VarArr2[0] = new h0(g0.AvatarIcon, z18, z13, z14);
        h0VarArr2[1] = new h0(g0.BackIcon, !z18, z13, z14);
        h0VarArr2[2] = new h0(z16 ? g0.OptionsIcon : g0.SettingsIcon, z18, z13, z14);
        return kotlin.collections.f0.j(h0VarArr2);
    }

    public final m0 t3(boolean z13) {
        n0 n0Var;
        b30 F;
        e0 e0Var;
        int i13 = 0;
        boolean z14 = this.f559d;
        boolean z15 = this.H;
        if (z14) {
            return new m0(z15 ? U3(rm1.q.GRAPH_BAR, Integer.valueOf(nz1.f.analytics), z13, new w(this, i13)) : D3(z13), S3(z13), N3(z13), e0.f584d, z13);
        }
        if (this.f558c) {
            return m0.f631f;
        }
        if (this.f580y.a(this.C)) {
            return new m0(D3(z13), f0.f588f, N3(z13), e0.f584d, z13);
        }
        r41.i iVar = this.f561f;
        boolean z16 = this.D;
        f0 D3 = !z16 ? D3(z13) : iVar.isPublic() ? D3(z13) : z15 ? U3(rm1.q.GRAPH_BAR, Integer.valueOf(nz1.f.analytics), z13, new w(this, i13)) : f0.f588f;
        f0 S3 = (!z16 || iVar.isPublic()) ? f0.f588f : S3(z13);
        f0 S32 = (z16 && iVar.isPublic()) ? S3(z13) : z16 ? !z15 ? z16 ? U3(rm1.q.COG, Integer.valueOf(nz1.f.settings), z13, new w(this, 8)) : f0.f588f : N3(z13) : f0.f588f;
        if (this.I) {
            wy0 wy0Var = this.C;
            if (wy0Var == null) {
                n0Var = n0.NONE;
            } else {
                v10 Y3 = wy0Var.Y3();
                String E = Y3 != null ? Y3.E() : null;
                v10 Y32 = wy0Var.Y3();
                String f13 = (Y32 == null || (F = Y32.F()) == null) ? null : F.f();
                v10 Y33 = wy0Var.Y3();
                String C = Y33 != null ? Y33.C() : null;
                if ((C != null && !kotlin.text.z.j(C)) || (E != null && !kotlin.text.z.j(E) && f13 != null && !kotlin.text.z.j(f13))) {
                    i13 = 1;
                }
                v10 Y34 = wy0Var.Y3();
                n0Var = i13 != 0 ? n0.CONTACT_INFO : com.bumptech.glide.d.o0(Y34 != null ? Y34.H() : null) ? n0.DIRECT_MESSAGING : n0.NONE;
            }
        } else {
            n0Var = n0.NONE;
        }
        int i14 = v.f690b[n0Var.ordinal()];
        int i15 = 3;
        if (i14 == 1) {
            String b23 = bs1.c.b2(x0.contact);
            Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
            e0Var = new e0(yl1.i.b(), b23, new w(this, i15));
        } else if (i14 == 2) {
            oo1.j jVar = oo1.j.f96854a;
            if (oo1.j.k()) {
                String b24 = bs1.c.b2(x0.send_message);
                Intrinsics.checkNotNullExpressionValue(b24, "string(...)");
                e0Var = new e0(yl1.i.b(), b24, new w(this, 5));
            } else {
                e0Var = e0.f584d;
            }
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            e0Var = e0.f584d;
        }
        return new m0(D3, S3, S32, e0Var, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00c0, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0107, code lost:
    
        if (r9 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x016f, code lost:
    
        if (r9 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a41.o0 u3(com.pinterest.api.model.wy0 r12) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a41.d0.u3(com.pinterest.api.model.wy0):a41.o0");
    }

    public final bq.b v3() {
        if (this.D) {
            bq.b b13 = this.f571p.b();
            Intrinsics.checkNotNullExpressionValue(b13, "getMyBoardSortOption(...)");
            return b13;
        }
        bq.b DEFAULT_OPTION = bq.c.f23676d;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_OPTION, "DEFAULT_OPTION");
        return DEFAULT_OPTION;
    }

    public final void w3() {
        xj2.c cVar;
        xj2.c cVar2 = this.P;
        if (cVar2 != null && !cVar2.isDisposed() && (cVar = this.P) != null) {
            cVar.dispose();
        }
        uj2.q L = this.f565j.L(this.f556a);
        int i13 = 1;
        u uVar = new u(1, new x(this, i13));
        ck2.c cVar3 = ck2.i.f27923c;
        xj2.c F = new jk2.v(L, uVar, cVar3, i13).F(new u(2, new x(this, 2)), new u(3, new x(this, 3)), cVar3, ck2.i.f27924d);
        addDisposable(F);
        this.P = F;
    }

    public final void x3() {
        getPinalytics().F(h32.g0.NAVIGATION, u0.SETTINGS_BUTTON);
        if (isBound()) {
            r rVar = (r) ((p0) getView());
            if (rVar.m8()) {
                kg.a.I(rVar.f7());
                return;
            }
            ScreenLocation c13 = i3.c();
            i iVar = i.f611q;
            NavigationImpl w13 = Navigation.w1(c13);
            iVar.invoke(w13);
            Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
            rVar.M1(w13);
        }
    }

    public final void z3(wy0 wy0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("invite_object", p32.i.PINNER.toString());
        nx.d0 pinalytics = getPinalytics();
        f1 f1Var = f1.TAP;
        u0 u0Var = u0.USER_FOLLOW_BUTTON;
        Boolean J3 = wy0Var.J3();
        Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : J3.booleanValue() ? h32.g0.PRIVATE_PROFILE_HEADER : h32.g0.USER_FOLLOW, (r18 & 8) != 0 ? null : this.f556a, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        addDisposable(oe.f.f1((ok1.f) this.f555J.getValue(), wy0Var, this.f564i, new gv0.b(this, 12), 8));
    }
}
