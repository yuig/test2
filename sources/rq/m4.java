package rq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class m4 extends PinCloseupBaseModule implements i01.e0, b11.m0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f109377p = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f109378a;

    /* renamed from: b, reason: collision with root package name */
    public hk2.b f109379b;

    /* renamed from: c, reason: collision with root package name */
    public String f109380c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f109381d;

    /* renamed from: e, reason: collision with root package name */
    public x02.x0 f109382e;

    /* renamed from: f, reason: collision with root package name */
    public m60.w f109383f;

    /* renamed from: g, reason: collision with root package name */
    public b60.b f109384g;

    /* renamed from: h, reason: collision with root package name */
    public hs.d f109385h;

    /* renamed from: i, reason: collision with root package name */
    public g70.h f109386i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f109387j;

    /* renamed from: k, reason: collision with root package name */
    public RelativeLayout f109388k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltAvatar f109389l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltText f109390m;

    /* renamed from: n, reason: collision with root package name */
    public GestaltIcon f109391n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltText f109392o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        hs.d dVar = this.f109385h;
        if (dVar != null) {
            this.f109387j = dVar.b();
        } else {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
    }

    public final void b(boolean z13) {
        GestaltText gestaltText = this.f109392o;
        if (gestaltText == null) {
            Intrinsics.r("engagementCount");
            throw null;
        }
        gestaltText.i(new cp.t(z13, 4));
        GestaltIcon gestaltIcon = this.f109391n;
        if (gestaltIcon != null) {
            gestaltIcon.g2(new cp.t(z13, 5));
        } else {
            Intrinsics.r("engagementIcon");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        View.inflate(getContext(), n80.d.closeup_user_board_attribution_module_lego, this);
        View findViewById = findViewById(n80.c.layout_wrapper);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        if (!shouldRenderLandscapeConfiguration()) {
            Intrinsics.f(relativeLayout);
            relativeLayout.setBackground(bs1.c.f0(relativeLayout, eo1.d.lego_card_rounded_top_and_bottom, null, null, 6));
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f109388k = relativeLayout;
        View findViewById2 = findViewById(n80.c.pinner_iv);
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById2;
        gestaltAvatar.M2(new xo.k(this, 14));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f109389l = gestaltAvatar;
        View findViewById3 = findViewById(n80.c.pinner_details);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(n80.c.pinner_name_and_board_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f109390m = (GestaltText) findViewById4;
        View findViewById5 = findViewById(n80.c.engagement_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f109391n = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(n80.c.engagement_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f109392o = (GestaltText) findViewById6;
        RelativeLayout relativeLayout2 = this.f109388k;
        if (relativeLayout2 != null) {
            maybeUpdateLayoutForTabletPortrait(relativeLayout2);
        } else {
            Intrinsics.r("wrapper");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_USER_BOARD_NOTE_ATTRIBUTION;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return getVisibility() == 0;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109378a) {
            return;
        }
        this.f109378a = true;
        jb jbVar = (jb) ((n4) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109382e = (x02.x0) oaVar.f113765k3.get();
        this.f109383f = (m60.w) oaVar.f113885r0.get();
        this.f109384g = (b60.b) oaVar.f113850p0.get();
        this.f109385h = s8Var.a6();
        this.f109386i = s8Var.e5();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hk2.b bVar;
        hk2.b bVar2 = this.f109379b;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f109379b) != null) {
            bVar.dispose();
        }
        this.f109379b = null;
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return false;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        v7 D3 = pin.D3();
        if (this.f109381d) {
            createViewIfNecessary();
            updateView();
            bs1.c.U1(this);
        } else {
            if (D3 == null || pin.I5() == null) {
                bs1.c.X0(this);
                return;
            }
            x02.x0 x0Var = this.f109382e;
            if (x0Var == null) {
                Intrinsics.r("boardRepository");
                throw null;
            }
            String uid = D3.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            jk2.e0 M = x0Var.M(uid);
            hk2.b bVar = new hk2.b(new a4(6, new e.f(this, pin, D3, 20)), new a4(7, new z3.m(this, 27)), ck2.i.f27923c);
            M.f(bVar);
            this.f109379b = bVar;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        Integer num;
        v7 D3;
        String uid;
        super.updateView();
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        wy0 I5 = pin.I5();
        if (I5 != null) {
            GestaltAvatar gestaltAvatar = this.f109389l;
            if (gestaltAvatar == null) {
                Intrinsics.r("avatar");
                throw null;
            }
            kh2.m0.V0(gestaltAvatar, I5);
        }
        GestaltText gestaltText = this.f109390m;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        h32.g0 componentType = h32.g0.PIN_CLOSEUP_USER_BOARD_NOTE_ATTRIBUTION;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        sq.k kVar = new sq.k(pin, componentType);
        sq.e eVar = new sq.e(pin, componentType, new db.m(this, 19));
        x02.x0 boardRepository = this.f109382e;
        if (boardRepository == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        b60.b activeUserManager = this.f109384g;
        if (activeUserManager == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        xk2.v vVar = sq.i.f114975a;
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        if (I5 != null && (D3 = pin.D3()) != null && (uid = D3.getUid()) != null) {
            boardRepository.M(uid).e(wj2.c.a()).h(tk2.e.f118017c).f(new hk2.b(new a4(8, new e.c(activeUserManager, I5, gestaltText, kVar, eVar, 6)), new a4(9, sq.a.f114959o), ck2.i.f27923c));
        }
        Set set = b40.f35967a;
        Intrinsics.checkNotNullParameter(pin, "<this>");
        com.pinterest.api.model.f3 z33 = pin.z3();
        int i13 = 0;
        int y13 = z33 != null ? dn.c.y(z33) : 0;
        if (y13 > 1) {
            num = Integer.valueOf(y13);
        } else {
            Intrinsics.checkNotNullParameter(pin, "<this>");
            Integer e63 = pin.e6();
            Intrinsics.checkNotNullExpressionValue(e63, "getRepinCount(...)");
            if (Math.max(0, e63.intValue()) != 0) {
                Intrinsics.checkNotNullParameter(pin, "<this>");
                Integer e64 = pin.e6();
                Intrinsics.checkNotNullExpressionValue(e64, "getRepinCount(...)");
                num = Integer.valueOf(Math.max(0, e64.intValue()));
            } else {
                num = null;
            }
        }
        if (num != null) {
            GestaltText gestaltText2 = this.f109392o;
            if (gestaltText2 == null) {
                Intrinsics.r("engagementCount");
                throw null;
            }
            gestaltText2.i(new l4(num, i13));
            gestaltText2.setContentDescription(gestaltText2.getResources().getQuantityString(n80.e.accessibility_engagement_count, num.intValue(), num));
            b(true);
        } else {
            b(false);
        }
        RelativeLayout relativeLayout = this.f109388k;
        if (relativeLayout == null) {
            Intrinsics.r("wrapper");
            throw null;
        }
        boolean z13 = this.f109387j;
        relativeLayout.setBackground(z13 ? null : bs1.c.f0(this, r80.b.pin_closeup_redesign_module_background, null, null, 6));
        if (!z13) {
            GestaltAvatar gestaltAvatar2 = this.f109389l;
            if (gestaltAvatar2 == null) {
                Intrinsics.r("avatar");
                throw null;
            }
            int W = bs1.c.W(gestaltAvatar2, eo1.c.space_600);
            ViewGroup.LayoutParams layoutParams = gestaltAvatar2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = W;
            marginLayoutParams.bottomMargin = W;
            marginLayoutParams.setMarginStart(bs1.c.W(gestaltAvatar2, eo1.c.space_400));
            marginLayoutParams.setMarginEnd(bs1.c.W(gestaltAvatar2, eo1.c.space_200));
            gestaltAvatar2.setLayoutParams(marginLayoutParams);
        }
        GestaltIcon gestaltIcon = this.f109391n;
        if (gestaltIcon == null) {
            Intrinsics.r("engagementIcon");
            throw null;
        }
        gestaltIcon.g2(h4.f109259v);
        GestaltText gestaltText3 = this.f109392o;
        if (gestaltText3 != null) {
            pk.a0.k0(gestaltText3);
        } else {
            Intrinsics.r("engagementCount");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean useAutoVisibility() {
        return false;
    }
}
