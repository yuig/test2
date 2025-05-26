package a41;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.i3;
import ey.p3;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f695i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f696j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(d0 d0Var, int i13) {
        super(1);
        this.f695i = i13;
        this.f696j = d0Var;
    }

    public final void b(int i13) {
        b90 f43;
        wy0 wy0Var;
        int i14 = this.f695i;
        d0 d0Var = this.f696j;
        switch (i14) {
            case 4:
                ((r) ((p0) d0Var.getView())).x2();
                k41.b.Companion.getClass();
                k41.b a13 = k41.a.a(i13);
                int i15 = a13 == null ? -1 : b0.f548a[a13.ordinal()];
                if (i15 == 1) {
                    r rVar = (r) ((p0) d0Var.getView());
                    nx.d0 s73 = rVar.s7();
                    Context requireContext = rVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    el.a.l2(s73, requireContext, ou1.e.PROFILE_PLUS_BUTTON);
                    return;
                }
                if (i15 == 2) {
                    kg.t.L0(((r) ((p0) d0Var.getView())).s7(), null, null, d32.c.PROFILE_PLUS_BUTTON, null, 22);
                    return;
                } else {
                    if (i15 != 3) {
                        return;
                    }
                    nx.d0 pinalytics = ((r) ((p0) d0Var.getView())).s7();
                    String value = ou1.b.PROFILE_PLUS_BUTTON.getValue();
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    kg.t.K0(pinalytics, value);
                    return;
                }
            case 5:
                if (i13 != bq.b.CUSTOM.ordinal()) {
                    d0Var.f571p.c(kh2.b0.O1(i13, d0Var.v3()));
                    ((r) ((p0) d0Var.getView())).x2();
                    return;
                } else {
                    m60.w wVar = d0Var.f566k;
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) i3.f50970d.getValue());
                    w13.z(com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER.ordinal(), "com.pinterest.EXTRA_BOARD_ORGANIZE_MODE");
                    wVar.d(w13);
                    return;
                }
            default:
                p0 p0Var = (p0) d0Var.getViewIfBound();
                if (p0Var != null) {
                    ((r) p0Var).x2();
                }
                if (i13 == 0) {
                    d0Var.x3();
                    return;
                }
                String str = null;
                if (i13 == 1) {
                    p0 p0Var2 = (p0) d0Var.getViewIfBound();
                    if (p0Var2 != null) {
                        wy0 wy0Var2 = d0Var.C;
                        if (wy0Var2 != null && (f43 = wy0Var2.f4()) != null) {
                            str = f43.f();
                        }
                        ((r) p0Var2).u8(str);
                        return;
                    }
                    return;
                }
                if (i13 != 2) {
                    if (i13 == 3) {
                        d0Var.getPinalytics().X(u0.USER_EDIT_BUTTON);
                        d0Var.f566k.d(Navigation.w1((ScreenLocation) i3.f50992z.getValue()));
                        return;
                    } else {
                        if (i13 == 4 && (wy0Var = d0Var.C) != null) {
                            new y(d0Var, wy0Var, 5).invoke();
                            return;
                        }
                        return;
                    }
                }
                p0 p0Var3 = (p0) d0Var.getViewIfBound();
                if (p0Var3 != null) {
                    r rVar2 = (r) p0Var3;
                    Context requireContext2 = rVar2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    SendableObject sendableObject = new SendableObject(rVar2.o8(), 2);
                    p32.c cVar = p32.c.MESSAGE;
                    so.v vVar = rVar2.A0;
                    if (vVar != null) {
                        ig1.b.w(requireContext2, sendableObject, cVar, vVar);
                        return;
                    } else {
                        Intrinsics.r("inviteCodeHandlerFactory");
                        throw null;
                    }
                }
                return;
        }
    }

    public final void e(wy0 wy0Var) {
        int i13 = this.f695i;
        d0 d0Var = this.f696j;
        switch (i13) {
            case 2:
                Intrinsics.f(wy0Var);
                d0Var.C = wy0Var;
                if (d0Var.isBound() && d0Var.f562g != r41.g.BottomNavTabBar) {
                    r41.k kVar = r41.k.f106176a;
                    NavigationImpl a13 = r41.k.a(wy0Var);
                    if (a13 != null) {
                        r rVar = (r) ((p0) d0Var.getView());
                        rVar.getClass();
                        if (com.bumptech.glide.d.G(rVar, "PROFILE_SHOULD_DISMISS_AS_OVERLAY", false)) {
                            rVar.P7();
                        } else {
                            rVar.D5();
                        }
                        d0Var.f566k.d(a13);
                        nx.d0 pinalytics = d0Var.getPinalytics();
                        f1 f1Var = f1.NAVIGATION;
                        u0 u0Var = u0.ADS_ONLY_PROFILE_REDIRECT;
                        HashMap hashMap = new HashMap();
                        hashMap.put("aop_origin", d0Var.f563h.name());
                        Unit unit = Unit.f80348a;
                        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        return;
                    }
                }
                p0 p0Var = (p0) d0Var.getViewIfBound();
                if (p0Var != null) {
                    ((r) p0Var).setLoadState(yk1.i.LOADED);
                }
                String userUid = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(userUid, "getUid(...)");
                if (d0Var.T3()) {
                    Intrinsics.checkNotNullParameter(userUid, "userUid");
                    new p3(d0Var.D, 0).i();
                }
                if (!d0Var.f580y.a(wy0Var) || wy0Var.R2().booleanValue()) {
                    if (d0Var.R) {
                        d0Var.a4(wy0Var);
                        return;
                    }
                    if (d0Var.isBound()) {
                        d0Var.V = d0Var.u3(wy0Var).f642a.size() == 1;
                        d0Var.X3(d0.s3(d0Var));
                        ((r) ((p0) d0Var.getView())).H8(d0Var.t3(false));
                        d0Var.a4(wy0Var);
                        d0Var.Z3();
                    }
                    d0Var.R = true;
                    return;
                }
                if (d0Var.isBound()) {
                    r rVar2 = (r) ((p0) d0Var.getView());
                    rVar2.F8(wy0Var);
                    rVar2.I8(false, false);
                    RelativeLayout relativeLayout = rVar2.Y0;
                    if (relativeLayout == null) {
                        Intrinsics.r("tabsNameAndAvatarContainer");
                        throw null;
                    }
                    bs1.c.X0(relativeLayout);
                    d0Var.X3(d0.s3(d0Var));
                    rVar2.H8(d0Var.t3(false));
                    rVar2.B8(d0.q3(d0Var, wy0Var));
                    CoordinatorLayout coordinatorLayout = rVar2.I0;
                    if (coordinatorLayout == null) {
                        Intrinsics.r("root");
                        throw null;
                    }
                    bs1.c.R1(coordinatorLayout.findViewById(nz1.c.user_library_swipe_container), false);
                    rVar2.b8().x(false);
                    if (!ai0.a.d(wy0Var, d0Var.f579x) || wy0Var.R2().booleanValue()) {
                        GestaltText gestaltText = rVar2.f653h1;
                        if (gestaltText == null) {
                            Intrinsics.r("privateProfileTitle");
                            throw null;
                        }
                        pk.a0.k0(gestaltText);
                        GestaltText gestaltText2 = rVar2.f654i1;
                        if (gestaltText2 != null) {
                            pk.a0.k0(gestaltText2);
                            return;
                        } else {
                            Intrinsics.r("privateProfileDescription");
                            throw null;
                        }
                    }
                    boolean z13 = d0Var.f564i.length() > 0;
                    String userName = dl2.b.i1(wy0Var);
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    GestaltText gestaltText3 = rVar2.f653h1;
                    if (gestaltText3 == null) {
                        Intrinsics.r("privateProfileTitle");
                        throw null;
                    }
                    pk.a0.w1(gestaltText3);
                    GestaltText gestaltText4 = rVar2.f654i1;
                    if (gestaltText4 != null) {
                        gestaltText4.i(new s1.w(z13, rVar2, userName, 15));
                        return;
                    } else {
                        Intrinsics.r("privateProfileDescription");
                        throw null;
                    }
                }
                return;
            default:
                if (d0Var.isBound()) {
                    r rVar3 = (r) ((p0) d0Var.getView());
                    rVar3.getClass();
                    rVar3.N6("com.pinterest.EXTRA_BOARD_REFRESH_BOARDS", new Bundle());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if ((r0 != null ? r0.f98848e : null) != u32.i.COLLAGES) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r3.f561f.isPublic() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r4 == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a41.x.invoke(java.lang.Object):java.lang.Object");
    }
}
