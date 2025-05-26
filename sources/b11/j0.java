package b11;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import com.pinterest.feature.sharesheet.view.UABAnimatedShareButton;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.splitButton.view.GestaltSplitButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.x0;
import nx.d1;
import x02.i2;

/* loaded from: classes5.dex */
public final class j0 extends ConstraintLayout implements af2.c {
    public static final /* synthetic */ int W = 0;
    public ek2.j A;
    public final i B;
    public String C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final f0 H;
    public final m60.w I;

    /* renamed from: J, reason: collision with root package name */
    public final np0.g f21022J;
    public final qb0.f K;
    public final b60.b L;
    public final d1 M;
    public final i2 N;
    public final lh0.z O;
    public final qh1.e P;
    public final hs.d Q;
    public final is1.a0 R;
    public final g70.h S;
    public final boolean T;
    public final xk2.v U;
    public boolean V;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f21023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21024b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f21025c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f21026d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f21027e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewStub f21028f;

    /* renamed from: g, reason: collision with root package name */
    public PinReactionIconButton f21029g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f21030h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f21031i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIcon f21032j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f21033k;

    /* renamed from: l, reason: collision with root package name */
    public final ViewGroup f21034l;

    /* renamed from: m, reason: collision with root package name */
    public final UABAnimatedShareButton f21035m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f21036n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltIconButton f21037o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltButton f21038p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewStub f21039q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltSplitButton f21040r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f21041s;

    /* renamed from: t, reason: collision with root package name */
    public f30 f21042t;

    /* renamed from: u, reason: collision with root package name */
    public String f21043u;

    /* renamed from: v, reason: collision with root package name */
    public String f21044v;

    /* renamed from: w, reason: collision with root package name */
    public final xj2.b f21045w;

    /* renamed from: x, reason: collision with root package name */
    public final v32.c f21046x;

    /* renamed from: y, reason: collision with root package name */
    public v32.c f21047y;

    /* renamed from: z, reason: collision with root package name */
    public ek2.j f21048z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x027c, code lost:
    
        if (((java.lang.Boolean) r2.getValue()).booleanValue() == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j0(android.content.Context r17, nx.d0 r18, b11.n0 r19) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b11.j0.<init>(android.content.Context, nx.d0, b11.n0):void");
    }

    public static final void L(j0 j0Var) {
        int i13;
        String text = j0Var.X(j0Var.f21042t);
        GestaltSplitButton gestaltSplitButton = j0Var.f21040r;
        if (gestaltSplitButton != null) {
            Intrinsics.checkNotNullParameter(text, "text");
            int paddingEnd = gestaltSplitButton.X().getPaddingEnd() + gestaltSplitButton.X().getPaddingStart() + ((int) gestaltSplitButton.X().getPaint().measureText(text));
            int width = gestaltSplitButton.T().getWidth();
            ViewGroup.LayoutParams layoutParams = gestaltSplitButton.X().getLayoutParams();
            i13 = paddingEnd + width + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        } else {
            i13 = 0;
        }
        int width2 = ((j0Var.getWidth() - a0(j0Var.f21032j)) - a0(j0Var.f21035m)) - a0(j0Var.f21037o);
        PinReactionIconButton pinReactionIconButton = j0Var.f21029g;
        j0Var.E = i13 <= (((width2 - (pinReactionIconButton != null ? a0(pinReactionIconButton) : 0)) - j0Var.f21030h.getWidth()) - j0Var.f21033k.getWidth()) - j0Var.f21036n.getWidth();
        yl1.c cVar = j0Var.Z().a() ? yl1.c.LARGE : yl1.c.SMALL;
        GestaltSplitButton gestaltSplitButton2 = j0Var.f21040r;
        if (gestaltSplitButton2 != null) {
            ky0.b nextState = new ky0.b(20, text, cVar);
            Intrinsics.checkNotNullParameter(nextState, "nextState");
            com.google.firebase.messaging.q qVar = gestaltSplitButton2.f49610a;
        }
    }

    public static void T(xj2.c cVar) {
        if (cVar == null || cVar.isDisposed()) {
            return;
        }
        cVar.dispose();
    }

    public static int a0(View view) {
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = width + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
    }

    public final void B0() {
        boolean z13 = this.D > 0 && !this.T && this.E;
        if (z13) {
            lh0.z Z = Z();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) Z.f83517a;
            if (!g1Var.o("sg_android_share_count_on_closeup", "enabled", z3Var)) {
                g1Var.l("sg_android_share_count_on_closeup");
            }
        }
        qb0.f fVar = this.K;
        if (fVar != null) {
            ((qb0.a) fVar).a(this.D, new r1.f(this, z13, 25));
        } else {
            Intrinsics.r("numberFormatter");
            throw null;
        }
    }

    public final String X(f30 f30Var) {
        v7 G5;
        v7 G52;
        String valueOf;
        if (f30Var != null && Intrinsics.d(f30Var.a5(), Boolean.TRUE)) {
            v7 D3 = f30Var.D3();
            if ((D3 != null ? D3.j1() : null) != null) {
                v7 D32 = f30Var.D3();
                if (D32 == null || !kh2.d.J0(D32)) {
                    v7 D33 = f30Var.D3();
                    valueOf = String.valueOf(D33 != null ? D33.j1() : null);
                } else {
                    valueOf = getResources().getString(x0.profile);
                }
                Intrinsics.f(valueOf);
                return valueOf;
            }
        }
        if (f30Var != null && (G52 = f30Var.G5()) != null && kh2.d.J0(G52)) {
            String string = getResources().getString(x0.profile);
            Intrinsics.f(string);
            return string;
        }
        if (((f30Var == null || (G5 = f30Var.G5()) == null) ? null : G5.j1()) != null) {
            v7 G53 = f30Var.G5();
            return String.valueOf(G53 != null ? G53.j1() : null);
        }
        String string2 = getResources().getString(x0.saved);
        Intrinsics.f(string2);
        return string2;
    }

    public final lh0.z Z() {
        lh0.z zVar = this.O;
        if (zVar != null) {
            return zVar;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f21023a == null) {
            this.f21023a = new ye2.o(this);
        }
        return this.f21023a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b11.j0.d0():void");
    }

    public final void g0() {
        if (!this.F || this.f21040r == null || this.G) {
            return;
        }
        f1 f1Var = f1.RENDER;
        h32.u0 u0Var = h32.u0.PIN_SAVED_SPLIT_BUTTON_TEXT;
        f30 f30Var = this.f21042t;
        this.f21025c.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : f30Var != null ? f30Var.getUid() : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.G = true;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f21023a == null) {
            this.f21023a = new ye2.o(this);
        }
        return this.f21023a.generatedComponent();
    }

    public final m60.w getEventManager() {
        m60.w wVar = this.I;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final void k0(v7 v7Var, HashMap hashMap) {
        String uid = v7Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        hashMap.put("board_id", uid);
        g70.h hVar = this.S;
        if (hVar != null) {
            g70.h.f(hVar, v7Var, i.f21012v, 2);
        } else {
            Intrinsics.r("boardNavigator");
            throw null;
        }
    }

    public final void o0(h32.u0 u0Var) {
        b60.b bVar = this.L;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar).f();
        boolean z13 = false;
        if (f13 != null) {
            if (f13.m4().intValue() == z42.u.SAVE_TO_PROFILE.getValue()) {
                z13 = true;
            }
        }
        f30 f30Var = this.f21042t;
        if (f30Var != null && rl2.g0.U(f30Var) && z13) {
            lh0.z Z = Z();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) Z.f83517a;
            if (g1Var.o("android_curation_brv_navigate_to_board_from_closeup", "enabled", z3Var) || g1Var.l("android_curation_brv_navigate_to_board_from_closeup")) {
                d0();
                return;
            }
        }
        f30 f30Var2 = this.f21042t;
        if (f30Var2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("secondary_action_bar_type", this.f21026d.name());
            np0.g gVar = this.f21022J;
            if (gVar == null) {
                Intrinsics.r("closeupActionController");
                throw null;
            }
            ((np0.d) gVar).e(f30Var2, this.f21025c, this.C, this.f21044v, hashMap, u0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager().h(this.H);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getEventManager().j(this.H);
        this.f21045w.d();
        T(this.A);
        T(this.f21048z);
        super.onDetachedFromWindow();
    }

    public final void r0(View view) {
        f30 f30Var = this.f21042t;
        if (f30Var != null) {
            h32.u0 u0Var = h32.u0.PIN_SHARE_BUTTON;
            h32.g0 g0Var = h32.g0.MODAL_PIN;
            String uid = f30Var.getUid();
            HashMap hashMap = new HashMap();
            hashMap.put("secondary_action_bar_type", this.f21026d.name());
            Unit unit = Unit.f80348a;
            this.f21025c.f0(u0Var, g0Var, uid, hashMap, false);
            np0.g gVar = this.f21022J;
            if (gVar != null) {
                ((np0.d) gVar).f(view, f30Var);
            } else {
                Intrinsics.r("closeupActionController");
                throw null;
            }
        }
    }

    public final void t0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f21042t = pin;
        Integer k63 = pin.k6();
        Intrinsics.checkNotNullExpressionValue(k63, "getShareCount(...)");
        this.D = k63.intValue();
        this.f21047y = b40.O(pin);
        int i13 = 0;
        if (this.f21029g == null) {
            PinReactionIconButton pinReactionIconButton = (PinReactionIconButton) this.f21028f.inflate();
            this.f21029g = pinReactionIconButton;
            if (pinReactionIconButton != null) {
                pinReactionIconButton.setPaddingRelative(bs1.c.W(pinReactionIconButton, eo1.c.lego_actionable_icon_padding_more), 0, bs1.c.W(pinReactionIconButton, eo1.c.lego_actionable_icon_padding_more), 0);
                pinReactionIconButton.setBackgroundColor(dl2.b.y0(pinReactionIconButton, eo1.a.sema_color_background_default));
                pinReactionIconButton.f47293l = false;
                pinReactionIconButton.f47294m = false;
                int color = pinReactionIconButton.getResources().getColor(eo1.b.color_themed_text_default, pinReactionIconButton.getContext().getTheme());
                Integer valueOf = Integer.valueOf(color);
                pinReactionIconButton.setColorFilter(color);
                pinReactionIconButton.f47291j = valueOf;
                HashMap hashMap = new HashMap();
                hashMap.put("secondary_action_bar_type", this.f21026d.name());
                Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
                pinReactionIconButton.f47269v = hashMap;
            }
        }
        boolean z13 = true;
        this.f21034l.setOnClickListener(new d0(this, true ? 1 : 0));
        f30 f30Var = this.f21042t;
        nn1.d nextState = nn1.d.f91558x;
        GestaltButton gestaltButton = this.f21038p;
        int i14 = 9;
        if (f30Var == null || !Intrinsics.d(f30Var.T5(), Boolean.TRUE)) {
            f30 f30Var2 = this.f21042t;
            if (f30Var2 == null || !rl2.g0.U(f30Var2)) {
                f30 f30Var3 = this.f21042t;
                if (f30Var3 != null && !rl2.g0.U(f30Var3)) {
                    bs1.c.X0(this.f21040r);
                    bs1.c.U1(gestaltButton);
                    gestaltButton.d(i.C);
                }
            } else {
                lh0.z Z = Z();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) Z.f83517a;
                if (g1Var.o("android_curation_brv_navigate_to_board_from_closeup", "enabled", z3Var) || g1Var.l("android_curation_brv_navigate_to_board_from_closeup")) {
                    b60.b bVar = this.L;
                    if (bVar == null) {
                        Intrinsics.r("activeUserManager");
                        throw null;
                    }
                    wy0 f13 = ((b60.d) bVar).f();
                    if (f13 != null) {
                        if (f13.m4().intValue() == z42.u.SAVE_TO_PROFILE.getValue()) {
                            bs1.c.X0(this.f21040r);
                            bs1.c.U1(gestaltButton);
                            String X = X(this.f21042t);
                            gestaltButton.d(new qp.i(ep.b.x(X, "string", X), 1));
                        }
                    }
                    pk.a0.l0(gestaltButton);
                    if (this.f21040r == null) {
                        this.f21040r = (GestaltSplitButton) this.f21039q.inflate();
                        g0();
                    }
                    if (!isLaidOut() || isLayoutRequested()) {
                        addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 15));
                    } else {
                        bs1.c.U1(this.f21040r);
                        L(this);
                    }
                } else {
                    bs1.c.U1(gestaltButton);
                    GestaltSplitButton gestaltSplitButton = this.f21040r;
                    if (gestaltSplitButton != null) {
                        Intrinsics.checkNotNullParameter(gestaltSplitButton, "<this>");
                        Intrinsics.checkNotNullParameter(nextState, "nextState");
                        com.google.firebase.messaging.q qVar = gestaltSplitButton.f49610a;
                    }
                    gestaltButton.d(i.B);
                }
            }
        } else {
            pk.a0.l0(gestaltButton);
            GestaltSplitButton gestaltSplitButton2 = this.f21040r;
            if (gestaltSplitButton2 != null) {
                Intrinsics.checkNotNullParameter(gestaltSplitButton2, "<this>");
                Intrinsics.checkNotNullParameter(nextState, "nextState");
                com.google.firebase.messaging.q qVar2 = gestaltSplitButton2.f49610a;
            }
        }
        gestaltButton.e(new e0(this, 0));
        GestaltSplitButton gestaltSplitButton3 = this.f21040r;
        int i15 = 3;
        if (gestaltSplitButton3 != null) {
            e0 eventHandler = new e0(this, 1);
            Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        }
        B0();
        this.f21027e.setOnClickListener(new d0(this, 2));
        PinReactionIconButton pinReactionIconButton2 = this.f21029g;
        if (pinReactionIconButton2 != null) {
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            pinReactionIconButton2.k2(uid);
        }
        int e03 = b40.e0(pin);
        boolean z14 = this.T;
        boolean z15 = e03 > 0 && !z14 && this.E;
        qb0.f fVar = this.K;
        if (fVar == null) {
            Intrinsics.r("numberFormatter");
            throw null;
        }
        ((qb0.a) fVar).a(b40.e0(pin), new h0(this, pin, z15, z13 ? 1 : 0));
        Boolean G4 = pin.G4();
        Intrinsics.checkNotNullExpressionValue(G4, "getIsEligibleForAggregatedComments(...)");
        boolean booleanValue = G4.booleanValue();
        GestaltIcon gestaltIcon = this.f21032j;
        ViewGroup viewGroup = this.f21031i;
        GestaltText gestaltText = this.f21033k;
        if (!booleanValue || pin.Q3().booleanValue()) {
            int color2 = getResources().getColor(eo1.b.color_gray_500, getContext().getTheme());
            viewGroup.setOnClickListener(null);
            gestaltText.setTextColor(color2);
            gestaltIcon.g2(i.f21015y);
        } else {
            Integer num = this.f21041s;
            if (num != null) {
                gestaltText.setTextColor(num.intValue());
            }
            viewGroup.setOnClickListener(new d0(this, i15));
            gestaltIcon.g2(i.f21014x);
        }
        boolean z16 = b40.f0(pin) > 0 && !z14 && !pin.Q3().booleanValue() && this.E;
        qb0.f fVar2 = this.K;
        if (fVar2 != null) {
            ((qb0.a) fVar2).a(b40.f0(pin), new h0(this, pin, z16, i13));
        } else {
            Intrinsics.r("numberFormatter");
            throw null;
        }
    }

    public final void z0(v32.c cVar, Boolean bool) {
        if (this.f21047y == cVar) {
            return;
        }
        this.f21047y = cVar;
        if (!Intrinsics.d(bool, Boolean.TRUE) || cVar == v32.c.NONE) {
            return;
        }
        this.B.invoke(cVar);
    }
}
