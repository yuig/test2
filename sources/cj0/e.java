package cj0;

import android.graphics.Point;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.ui.imageview.WebImageView;
import ey.m3;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import we1.y1;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements com.google.android.material.appbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27804b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f27803a = i13;
        this.f27804b = obj;
    }

    @Override // com.google.android.material.appbar.f
    public final void a(AppBarLayout appBarLayout, int i13) {
        a41.l0 l0Var;
        Boolean valueOf;
        int i14 = this.f27803a;
        Object obj = this.f27804b;
        switch (i14) {
            case 0:
                f this$0 = (f) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                if (i13 == 0) {
                    return;
                }
                int abs = Math.abs(i13);
                int[] iArr = new int[2];
                GestaltToolbarImpl gestaltToolbarImpl = this$0.f27817e;
                if (gestaltToolbarImpl == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                gestaltToolbarImpl.getLocationInWindow(iArr);
                u50.r rVar = this$0.f27814b;
                if (rVar == null) {
                    Intrinsics.r("eventIntake");
                    throw null;
                }
                int i15 = this$0.f27819g;
                a3.d dVar = this$0.f27820h;
                rVar.a(new a(abs, i15, new Point((int) dVar.f484a, (int) dVar.f485b), new Point(iArr[0], iArr[1])));
                return;
            case 1:
                jm0.j this$02 = (jm0.j) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                float floatValue = i13 < 0 ? ((Number) this$02.f76980b1.getValue()).floatValue() : 0.0f;
                GestaltToolbarImpl gestaltToolbarImpl2 = this$02.R0;
                if (gestaltToolbarImpl2 == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                if (gestaltToolbarImpl2.getElevation() != floatValue) {
                    GestaltToolbarImpl gestaltToolbarImpl3 = this$02.R0;
                    if (gestaltToolbarImpl3 == null) {
                        Intrinsics.r("toolbar");
                        throw null;
                    }
                    gestaltToolbarImpl3.setElevation(floatValue);
                }
                BoardSelectPinsHeaderView boardSelectPinsHeaderView = this$02.X0;
                if (boardSelectPinsHeaderView == null) {
                    Intrinsics.r("organizeHeader");
                    throw null;
                }
                if (boardSelectPinsHeaderView.getElevation() == floatValue) {
                    return;
                }
                BoardSelectPinsHeaderView boardSelectPinsHeaderView2 = this$02.X0;
                if (boardSelectPinsHeaderView2 != null) {
                    boardSelectPinsHeaderView2.setElevation(floatValue);
                    return;
                } else {
                    Intrinsics.r("organizeHeader");
                    throw null;
                }
            case 2:
                a41.r this$03 = (a41.r) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Iterator it = ((List) this$03.F1.getValue()).iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((Function1) it.next()).invoke(this$03.j8())).booleanValue()) {
                        this$03.f7().d(new gg0.q());
                    }
                }
                int abs2 = Math.abs(i13);
                int h10 = appBarLayout.h();
                if (this$03.x8() && !this$03.f674w1 && !this$03.f672v1 && abs2 > 0) {
                    this$03.f672v1 = true;
                    new m3(this$03.o8(), this$03.s8()).i();
                }
                PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this$03.K0;
                if (pinterestSwipeRefreshLayout != null) {
                    pinterestSwipeRefreshLayout.setEnabled(abs2 == 0);
                }
                a41.k0 k0Var = this$03.f658m1;
                a41.k0 k0Var2 = a41.k0.Collapsed;
                if (k0Var != k0Var2 && abs2 >= h10) {
                    this$03.f658m1 = k0Var2;
                    a41.l0 l0Var2 = this$03.f668t1;
                    if (l0Var2 != null) {
                        ((a41.d0) l0Var2).H3();
                    }
                } else if (abs2 < h10) {
                    if (k0Var == k0Var2 && (l0Var = this$03.f668t1) != null) {
                        a41.d0 d0Var = (a41.d0) l0Var;
                        a41.k0 k0Var3 = a41.k0.Expanded;
                        d0Var.W3(k0Var3, d0Var.r3(false, true));
                        d0Var.Y3(k0Var3);
                    }
                    this$03.f658m1 = a41.k0.Expanded;
                }
                xk2.k kVar = this$03.f664r1;
                int g13 = ql2.s.g(((Number) kVar.getValue()).intValue() - (h10 - abs2), 0, ((Number) kVar.getValue()).intValue());
                a41.l0 l0Var3 = this$03.f668t1;
                if (l0Var3 != null && ((a41.d0) l0Var3).V) {
                    RelativeLayout relativeLayout = this$03.Y0;
                    if (relativeLayout == null) {
                        Intrinsics.r("tabsNameAndAvatarContainer");
                        throw null;
                    }
                    if (g13 != relativeLayout.getHeight() && !ff0.j.b()) {
                        RelativeLayout relativeLayout2 = this$03.Y0;
                        if (relativeLayout2 == null) {
                            Intrinsics.r("tabsNameAndAvatarContainer");
                            throw null;
                        }
                        pk.a0.k1(relativeLayout2, g13);
                    }
                }
                UserProfileHeader userProfileHeader = this$03.S0;
                if (userProfileHeader != null) {
                    valueOf = Boolean.valueOf(((y31.q) userProfileHeader.Z()).f(userProfileHeader.f47518d));
                } else {
                    LegoUserProfileHeader legoUserProfileHeader = this$03.R0;
                    valueOf = legoUserProfileHeader != null ? Boolean.valueOf(((y31.q) legoUserProfileHeader.Z()).f(legoUserProfileHeader.f47538d)) : null;
                }
                if (com.bumptech.glide.d.o0(valueOf)) {
                    if (this$03.f671v0 == null) {
                        Intrinsics.r("deviceInfoProvider");
                        throw null;
                    }
                    if (!hf0.b.q()) {
                        a41.l0 l0Var4 = this$03.f668t1;
                        if (l0Var4 != null) {
                            a41.d0 d0Var2 = (a41.d0) l0Var4;
                            if (d0Var2.isBound() && !d0Var2.S) {
                                ((a41.r) ((a41.p0) d0Var2.getView())).H8(d0Var2.t3(true));
                                d0Var2.S = true;
                            }
                        }
                        a41.l0 l0Var5 = this$03.f668t1;
                        if (l0Var5 != null) {
                            a41.d0 d0Var3 = (a41.d0) l0Var5;
                            if (d0Var3.isBound() && d0Var3.S) {
                                ((a41.r) ((a41.p0) d0Var3.getView())).H8(d0Var3.t3(false));
                                d0Var3.S = false;
                            }
                        }
                    }
                }
                if (1 > abs2 || abs2 >= h10) {
                    RelativeLayout relativeLayout3 = this$03.M0;
                    if (relativeLayout3 != null) {
                        relativeLayout3.setElevation(0.0f);
                        return;
                    } else {
                        Intrinsics.r("profileActionsToolbar");
                        throw null;
                    }
                }
                RelativeLayout relativeLayout4 = this$03.M0;
                if (relativeLayout4 != null) {
                    relativeLayout4.setElevation(((Number) this$03.f666s1.getValue()).floatValue());
                    return;
                } else {
                    Intrinsics.r("profileActionsToolbar");
                    throw null;
                }
            case 3:
                od1.t this$04 = (od1.t) obj;
                int i16 = od1.t.f94174d1;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                LinearLayout linearLayout = this$04.V0;
                int height = linearLayout != null ? linearLayout.getHeight() : 0;
                fo1.a i73 = this$04.i7();
                if (Math.abs(i13) >= height - Math.max(i73 != null ? ((GestaltToolbarImpl) i73).getHeight() : 0, 0)) {
                    if (!this$04.S0) {
                        this$04.S0 = true;
                        fo1.a i74 = this$04.i7();
                        if (i74 != null) {
                            ((GestaltToolbarImpl) i74).b0(this$04.Q0.f94109b);
                        }
                    }
                    GestaltText gestaltText = this$04.W0;
                    if (gestaltText != null) {
                        gestaltText.setAlpha(0.0f);
                    }
                    WebImageView webImageView = this$04.X0;
                    if (webImageView == null) {
                        return;
                    }
                    webImageView.setAlpha(0.0f);
                    return;
                }
                if (this$04.S0) {
                    this$04.S0 = false;
                    fo1.a i75 = this$04.i7();
                    if (i75 != null) {
                        ((GestaltToolbarImpl) i75).b0("");
                    }
                }
                float h13 = (-i13) / appBarLayout.h();
                GestaltText gestaltText2 = this$04.W0;
                if (gestaltText2 != null) {
                    gestaltText2.setAlpha(1.0f - h13);
                }
                WebImageView webImageView2 = this$04.X0;
                if (webImageView2 == null) {
                    return;
                }
                webImageView2.setAlpha(1.0f - h13);
                return;
            default:
                pe1.d this$05 = (pe1.d) obj;
                int i17 = pe1.d.P1;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                if (this$05.E1) {
                    fo1.a i76 = this$05.i7();
                    int height2 = i76 != null ? ((GestaltToolbarImpl) i76).getHeight() : 0;
                    y1 y1Var = this$05.f99983u1;
                    pe1.i iVar = this$05.I9(i13, (k3.k0(this$05.requireContext()) + (height2 + (y1Var != null ? y1Var.k() : 0))) + this$05.A1, true) ? pe1.i.RESTORED : pe1.i.TRANSPARENT;
                    if (iVar != this$05.B1) {
                        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
                        this$05.B1 = iVar;
                        this$05.M9(this$05.f91282J);
                    }
                    this$05.L1 = false;
                    return;
                }
                return;
        }
    }
}
